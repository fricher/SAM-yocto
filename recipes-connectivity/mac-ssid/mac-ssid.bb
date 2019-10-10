SUMMARY = "Configuration file to create a ssid from a mac address"
DESCRIPTION = "Configuration file to create a ssid from a mac address"
LICENSE = "MIT"
LIC_FILES_CHKSUM="file://COPYING;md5=44ac4678311254db62edf8fd39cb8124"

FILESEXTRAPATHS_prepend := "${THISDIR}/files/:"

SRC_URI += "\
	file://COPYING \
        file://mac-ssid.service \
	file://mac-ssid.sh \
"
S = "${WORKDIR}"

inherit systemd

SYSTEMD_SERVICE_${PN} = "mac-ssid.service"

FILES_${PN} += "${systemd_system_unitdir}/mac-ssid.service \
		${prefix}/bin \
"

do_install() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/mac-ssid.service ${D}${systemd_system_unitdir} 

    install -d ${D}${prefix}/bin
    install -m 0774 ${WORKDIR}/mac-ssid.sh ${D}${prefix}/bin/
}
