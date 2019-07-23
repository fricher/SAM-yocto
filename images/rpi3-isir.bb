SUMMARY = "A console development image with some C/C++ dev tools"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "MIT"

inherit core-image

DEPENDS += "bcm2835-bootfiles"

CORE_OS = " \
    initscripts \
    modutils-initscripts \
    util-linux \
    openssh \
    openssh-sftp-server \
"

WIFI_SUPPORT = " \
    busybox-udhcpc \
    init-ifupdown \
    net-tools \
    wpa-supplicant \
"

DEV_SDK_INSTALL = " \
"

DEV_EXTRAS = " \
    gdb \
    gdbserver \
"

EXTRA_TOOLS_INSTALL = " \
    i2c-tools \
    boost \
    espeak \
    less \
    libeigen-dbg \
    libmosquitto1 \
    mosquitto \
    udev-rules-sam \
    wiringpi \
"

IMAGE_INSTALL += " \
    ${CORE_OS} \
    ${DEV_SDK_INSTALL} \
    ${DEV_EXTRAS} \
    ${EXTRA_TOOLS_INSTALL} \
    ${WIFI_SUPPORT} \
"

export IMAGE_BASENAME = "rpi3-isir"
