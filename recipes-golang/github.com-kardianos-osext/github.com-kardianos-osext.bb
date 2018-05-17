SUMMARY = "os Extension Library"
DESCRIPTION = "Extensions to standard Go os. library"
LICENSE = "MIT"

GO_IMPORT = "github.com/kardianos/osext"

inherit go

SRC_URI="git://github.com/kardianos/osext.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV="${AUTOREV}"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=591778525c869cdde0ab5a1bf283cd81"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS += "\
"

# golang.org-x-net
#  golang.org-x-sys

do_install_append() {
}

#PACKAGES =+ "${PN}-examples"
#
#FILES_${PN}-examples = "
#    /usr/lib/x86_64-poky-linux/go/bin/autobahn 
#    /usr/lib/x86_64-poky-linux/go/bin/chat 
#    /usr/lib/x86_64-poky-linux/go/bin/filewatch 
#    /usr/lib/x86_64-poky-linux/go/bin/command 
#"

# Go language toosl dont create GNU_HASH sections in linked binaries
#INSANE_SKIP_${PN}-examples = "ldflags"
