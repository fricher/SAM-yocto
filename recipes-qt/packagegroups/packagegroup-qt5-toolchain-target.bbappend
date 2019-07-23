RDEPENDS_${PN}_remove = " \
    qtcharts-dev \
    qtcharts-mkspecs \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'qtcharts-qmlplugins', '', d)} \
    qtmultimedia-mkspecs \
    qtmultimedia-plugins \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'qtmultimedia-qmlplugins', '', d)} \
    qtsvg-dev \
    qtsvg-mkspecs \
    qtsvg-plugins \
    qttools-dev \
    qttools-mkspecs \
    qttools-staticdev \
    qttools-tools \
    qtquickcontrols2 \
    qtquickcontrols2-dev \
    qtquickcontrols2-mkspecs \
"
