SUMMARY = "Daemon Library"
DESCRIPTION = "Go native Daemonization library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=45069d035ee42bb365f5b6fe37f0b4dd"

GO_IMPORT = "github.com/sevlyar/go-daemon"

inherit go

SRC_URI="git://github.com/sevlyar/go-daemon.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV="${AUTOREV}"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS += "\
    github.com-kardianos-osext \
"

PACKAGES =+ "${PN}-examples"

FILES_${PN}-examples = " \
  /usr/lib/x86_64-poky-linux/go/bin/gd-simple \
  /usr/lib/x86_64-poky-linux/go/bin/gd-signal-handling \
  /usr/lib/x86_64-poky-linux/go/bin/gd-log-rotation \
  /usr/lib/x86_64-poky-linux/go/bin/sample \
"

RDEPENDS_${PN}-dev += "bash"
