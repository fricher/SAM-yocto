do_install_append () {
    install -d ${D}/opt

    cat >> ${D}${sysconfdir}/fstab <<EOF

/dev/mmcblk0p2 /opt ext4 defaults 0 0 

EOF
}
