ROOTFS_BOOTSTRAP_INSTALL = ""

CORE_OS = " \
    util-linux \
    openssh \
    openssh-sftp-server \
"

WIFI_SUPPORT = " \
    hostapd \
    net-tools \
"

EXTRA_TOOLS_INSTALL = " \
    espeak \
    libeigen-dbg \
    libmosquitto1 \
    mosquitto \
    udev-rules-sam \
    userland \
    wiringpi \
"
DEV_EXTRAS = " \
    gdb \
    gdbserver \
    htop \
    i2c-tools \
    rt-tests \
    systemd-analyze \
    valgrind \
"

SAM_PACKAGES = " \
    ${CORE_OS} \
    ${EXTRA_TOOLS_INSTALL} \
    ${WIFI_SUPPORT} \
"

SAM_PACKAGES_DEBUG = " \
    ${SAM_PACKAGES} \
    ${DEV_EXTRAS} \
"
