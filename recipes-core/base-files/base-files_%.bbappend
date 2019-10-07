do_install_append () {
    cat >> ${D}${sysconfdir}/fstab <<EOF

# Generated from smack-userspace
/dev/mmcblk0p2 /home/root ext4 defaults 0 0 

EOF
}
