ROOTFS_BOOTSTRAP_INSTALL = ""

CORE_OS = " \
    util-linux \
    openssh \
    openssh-sftp-server \
"

WIFI_SUPPORT = " \
    hostapd \
    mac-ssid \
    net-tools \
"

EXTRA_TOOLS_INSTALL = " \
    espeak \
    i2c-tools \
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
