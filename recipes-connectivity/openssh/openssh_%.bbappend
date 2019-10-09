FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://authorized_keys \
	    file://ssh_host_ecdsa_key \
	    file://ssh_host_ecdsa_key.pub \
	    file://ssh_host_ed25519_key \
	    file://ssh_host_ed25519_key.pub \
	    file://ssh_host_rsa_key \
	    file://ssh_host_rsa_key.pub \
"

FILES_${PN}-sshd += " /home/root/.ssh/authorized_keys \ 
		    ${sysconfdir}/ssh_host_ecdsa_key \ 
	            ${sysconfdir}/ssh_host_ecdsa_key.pub \
	            ${sysconfdir}/ssh_host_ed25519_key \
	            ${sysconfdir}/ssh_host_ed25519_key.pub \
	            ${sysconfdir}/ssh_host_rsa_key \
	            ${sysconfdir}/ssh_host_rsa_key.pub \
"

do_install_append() {
    install -d ${D}/home/root/.ssh
    install -m 0644 ${WORKDIR}/authorized_keys ${D}/home/root/.ssh

    install -d {D}${sysconfdir}/ssh
    install -m 0600 ${WORKDIR}/ssh_host_ecdsa_key ${D}${sysconfdir}/ssh
    install -m 0600 ${WORKDIR}/ssh_host_ed25519_key ${D}${sysconfdir}/ssh
    install -m 0600 ${WORKDIR}/ssh_host_rsa_key ${D}${sysconfdir}/ssh
    install -m 0444 ${WORKDIR}/ssh_host_ecdsa_key.pub ${D}${sysconfdir}/ssh
    install -m 0444 ${WORKDIR}/ssh_host_ed25519_key.pub ${D}${sysconfdir}/ssh
    install -m 0444 ${WORKDIR}/ssh_host_rsa_key.pub ${D}${sysconfdir}/ssh
}
