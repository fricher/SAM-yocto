SUMMARY = "The RPI image for SAM - Initramfs version"
LICENSE = "MIT"

inherit core-image
include sam-packages.inc

PACKAGE_INSTALL += " ${SAM_PACKAGES_DEBUG} kernel-modules"

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"
