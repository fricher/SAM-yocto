SUMMARY = "A basic Qt5 qwidgets dev image"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "MIT"

inherit populate_sdk_qt5

require rpi3-isir.bb

QT_TOOLS = " \
    qtbase \
    qtmqtt \
    qtserialport \
"

#FONTS = " \
#    fontconfig \
#    fontconfig-utils \
#    ttf-bitstream-vera \
#"

IMAGE_INSTALL += " \
    ${QT_TOOLS} \
"
#    ${FONTS}

export IMAGE_BASENAME = "rpi3-isir-qt5"
