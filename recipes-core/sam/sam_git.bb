DESCRIPTION = "SAM" 
LICENSE = "CLOSED"

FILESEXTRAPATHS_prepend := "${THISDIR}/files/:"

inherit cmake systemd

SYSTEMD_SERVICE_${PN} = "sam.service"

SRC_URI = "\
	file://sam.service \
	file://opt.mount \
	gitsm://github.com/isir/SAM.git;branch=next;protocol=git \
	"
SRCREV = "06283a7e11a9d39982327fc26e945b3bd170fa3f"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}/opt
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/sam.service ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/opt.mount ${D}${systemd_system_unitdir}
}


FILES_${PN} += "/opt \
		${systemd_system_unitdir}/sam.service \
		${systemd_system_unitdir}/opt.mount"

DEPENDS = "libeigen espeak i2c-tools mosquitto userland wiringpi"
RDEPENDS_${PN} = "espeak i2c-tools libmosquitto1 mosquitto userland wiringpi"

RDEPENDS_${PN}-dev = "libeigen-dev"
