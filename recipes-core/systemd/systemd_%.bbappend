FILESEXTRAPATHS_append := "${THISDIR}/files:"
SRC_URI += "file://wlan0.network"

FILES_${PN} += "{sysconfdir}/systemd/network/*"

PACKAGECONFIG_remove = " nss-resolve resolved timesyncd "

do_install_append() {
  install -d ${D}${sysconfdir}/systemd/network/
  install -m 0644 ${WORKDIR}/*.network ${D}${sysconfdir}/systemd/network/

  rm ${D}${sysconfdir}/systemd/logind.conf
}
