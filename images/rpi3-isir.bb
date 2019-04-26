SUMMARY = "A console development image with some C/C++ dev tools"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "MIT"

IMAGE_LINGUAS = "en-us"

inherit core-image

DEPENDS += "bcm2835-bootfiles"

CORE_OS = " \
    bash \
    openssh \
    openssh-sftp-server \
"

WIFI_SUPPORT = " \
    dhcp-client \
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
    i2c-tools-dev \
    boost \
    boost-dev \
    less \
    libeigen-dbg \
    libeigen-dev \
    lsof \
    mosquitto \
    nano \
    ncurses \
    tcpdump \
    udev-rules-sam \
    wiringpi \
    wiringpi-dev \
"

IMAGE_INSTALL += " \
    ${CORE_OS} \
    ${DEV_SDK_INSTALL} \
    ${DEV_EXTRAS} \
    ${EXTRA_TOOLS_INSTALL} \
    ${WIFI_SUPPORT} \
"

set_local_timezone() {
    ln -sf /usr/share/zoneinfo/EST5EDT ${IMAGE_ROOTFS}/etc/localtime
}

disable_bootlogd() {
    echo BOOTLOGD_ENABLE=no > ${IMAGE_ROOTFS}/etc/default/bootlogd
}

ROOTFS_POSTPROCESS_COMMAND += " \
    set_local_timezone ; \
    disable_bootlogd ; \
 "

export IMAGE_BASENAME = "rpi3-isir"
