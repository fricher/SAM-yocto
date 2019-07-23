#PACKAGECONFIG_append = " accessibility eglfs fontconfig gles2 linuxfb tslib"
PACKAGECONFIG_remove = "examples tests widgets"

#DEPENDS += "userland"

QT_CONFIG_FLAGS_append = " -no-gui -no-opengl "
