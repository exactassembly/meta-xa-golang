SUMMARY = "WEbsocket Library"
DESCRIPTION = "Go native Websocket RFC-6455 library"
LICENSE = "MIT"

GO_IMPORT = "github.com/gorilla/websocket"

inherit go

SRC_URI="git://github.com/gorilla/websocket.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV="${AUTOREV}"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=c007b54a1743d596f46b2748d9f8c044"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS += "\
"

# golang.org-x-net
#  golang.org-x-sys

do_install_append() {
}

PACKAGES =+ "${PN}-examples"

FILES_${PN}-examples = "\
    /usr/lib/x86_64-poky-linux/go/bin/autobahn \
    /usr/lib/x86_64-poky-linux/go/bin/chat \
    /usr/lib/x86_64-poky-linux/go/bin/filewatch \
    /usr/lib/x86_64-poky-linux/go/bin/command \
"

# Go language toosl dont create GNU_HASH sections in linked binaries
INSANE_SKIP_${PN}-examples = "ldflags"