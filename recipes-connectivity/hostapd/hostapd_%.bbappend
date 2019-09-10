FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " file://hostapd.conf"

do_install_append () {
	install -d ${D}${sysconfdir}
        install -m 600 ${WORKDIR}/hostapd.conf ${D}${sysconfdir}/hostapd.conf
}
