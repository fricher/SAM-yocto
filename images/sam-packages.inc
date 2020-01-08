ROOTFS_BOOTSTRAP_INSTALL = ""

CORE_OS = " \
    sam \
    udev-rules-sam \
    util-linux \
    openssh \
    openssh-sftp-server \
"

WIFI_SUPPORT = " \
    hostapd \
    mac-ssid \
    net-tools \
"

DEV_EXTRAS = " \
    bash \
    gdb \
    gdbserver \
    htop \
    less \
    rt-tests \
    systemd-analyze \
    valgrind \
"

SAM_PACKAGES = " \
    ${CORE_OS} \
    ${WIFI_SUPPORT} \
"

SAM_PACKAGES_DEBUG = " \
    ${SAM_PACKAGES} \
    ${DEV_EXTRAS} \
"
