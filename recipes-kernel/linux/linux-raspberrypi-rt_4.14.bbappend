LINUX_VERSION = "4.14.91"

SRCREV = "e46e9c2829482271ab5577d380aac16da83f1803"

do_configure_prepend() {
    kernel_configure_variable BLK_DEV_INITRD y
    kernel_configure_variable INITRAMFS_SOURCE ""
    kernel_configure_variable RD_GZIP y
}
