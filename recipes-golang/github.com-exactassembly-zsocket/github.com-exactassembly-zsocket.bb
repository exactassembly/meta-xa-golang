SUMMARY = "Zero Copy (ringbuffer) networking Library"
DESCRIPTION = "Go Linux zero-copy interface wrapper"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/license.md;md5=deffee4336b7255ee1965fa9ff30eb5a"


GO_IMPORT = "github.com/newtools/zsocket"
SRC_URI="git://github.com/exactassembly/zsocket.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
#SRCREV="${AUTOREV}"
SRCREV="167e205a4337d4fcdddf26f4162b0687bb58bc37"

inherit go

do_configure_prepend () {
    /bin/rm -rf src/${GO_IMPORT}/examples
    /bin/rm -rf src/${GO_IMPORT}/util
}

DEPENDS += "\
    golang.org-x-net \
    golang.org-x-sys \
"

#PACKAGES_prepend = "${PN}-tools "
#
#FILES_${PN}-tools = "\
# /usr/bin/tcpdump"
#
#PACKAGES_prepend = "${PN}-tests "
#
#FILES_${PN}-tests = "\
# /usr/bin/pcaptest \
# /usr/bin/pass"
