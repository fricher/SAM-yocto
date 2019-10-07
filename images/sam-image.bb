SUMMARY = "The RPI image for SAM"
LICENSE = "MIT"

inherit core-image 
include sam-packages.inc

DEPENDS += "bcm2835-bootfiles"

IMAGE_INSTALL += " ${SAM_PACKAGES}"

export IMAGE_BASENAME = "sam-image"
