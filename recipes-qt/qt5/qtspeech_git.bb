require recipes-qt/qt5/qt5.inc
require recipes-qt/qt5/qt5-git.inc

LICENSE = "GFDL-1.3 & BSD & ( GPL-3.0 & The-Qt-Company-GPL-Exception-1.0 | The-Qt-Company-Commercial ) & ( GPL-2.0+ | LGPL-3.0 | The-Qt-Company-Commercial )"
LIC_FILES_CHKSUM = " \
    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e \
    file://LICENSE.GPLv2;md5=05832301944453ec79e40ba3c3cfceec \
    file://LICENSE.LGPLv3;md5=c4fe8c6de4eef597feec6e90ed62e962 \
"

DEPENDS += "qtbase"

SRCREV = "45e7dd1eee7ab2c2b26a429106e86f07dabfa4dc"
