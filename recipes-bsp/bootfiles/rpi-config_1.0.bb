LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://config.txt"

INHIBIT_DEFAULT_DEPS = "1"
inherit deploy nopackages

S = "${WORKDIR}"

do_deploy() {
    install -d ${DEPLOYDIR}/bcm2835-bootfiles

    install -m 0644 ${S}/config.txt ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}

addtask deploy before do_build after do_install
do_deploy[dirs] += "${DEPLOYDIR}/bcm2835-bootfiles"
