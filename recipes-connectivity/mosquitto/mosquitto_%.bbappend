FILESEXTRAPATHS_append := "${THISDIR}/files:"
SRC_URI += "file://mosquitto.conf \
	    file://mosquitto.service"

PACKAGECONFIG += " websockets"

EXTRA_OEMAKE += " WITH_THREADING=yes"

SYSTEMD_SERVICE_${PN} = "mosquitto.service"

do_install_append() {
  install -d ${D}${sysconfdir}/mosquitto
  install -m 0644 ${WORKDIR}/mosquitto.conf ${D}${sysconfdir}/mosquitto

  install -d ${D}{systemd_system_unitdir}
  install -m 0644 ${WORKDIR}/mosquitto.service ${D}${systemd_system_unitdir}/mosquitto.service

}
