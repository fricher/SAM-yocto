SUMMARY = "The RPI image for SAM"
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
    hostapd \
    net-tools \
"

DEV_EXTRAS = " \
    gdb \
    gdbserver \
    rt-tests \
    valgrind \
"

EXTRA_TOOLS_INSTALL = " \
    i2c-tools \
    espeak \
    htop \
    libeigen-dbg \
    libmosquitto1 \
    mosquitto \
    udev-rules-sam \
    userland \
    systemd-analyze \
    wiringpi \
"

IMAGE_INSTALL += " \
    ${CORE_OS} \
    ${DEV_EXTRAS} \
    ${EXTRA_TOOLS_INSTALL} \
    ${WIFI_SUPPORT} \
"

export IMAGE_BASENAME = "sam-image"
