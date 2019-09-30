FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " file://hostapd.conf"

SYSTEMD_SERVICE_${PN} = "hostapd.service"
SYSTEMD_AUTO_ENABLE_${PN} = "enable"

do_install_append () {
	install -d ${D}${sysconfdir}
        install -m 600 ${WORKDIR}/hostapd.conf ${D}${sysconfdir}/hostapd.conf

}
