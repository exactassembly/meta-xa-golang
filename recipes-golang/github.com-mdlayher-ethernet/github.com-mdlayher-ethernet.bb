SUMMARY = "sock DGRAM access"
DESCRIPTION = "Go native Ethernet 802.3 marshall/unmarshall library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=b2c6c218e77bd4cb543f6516cb1a1296"

#https://github.com/mdlayher/ethernet.git
GO_IMPORT = "github.com/mdlayher/ethernet"

inherit go

SRC_URI="git://github.com/mdlayher/ethernet.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV="${AUTOREV}"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS += "\
    golang.org-x-net \
    golang.org-x-sys \
    github.com-mdlayher-raw \
"

PACKAGES =+ "${PN}-examples"

# FILES_${PN}-examples = " \
#   /usr/lib/x86_64-poky-linux/go/bin/gd-simple \
#   /usr/lib/x86_64-poky-linux/go/bin/gd-signal-handling \
#   /usr/lib/x86_64-poky-linux/go/bin/gd-log-rotation \
#   /usr/lib/x86_64-poky-linux/go/bin/sample \
# "
 
RDEPENDS_${PN}-dev += "bash"
