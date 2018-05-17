DESCRIPTION = "Go supplementary libraries"
SECTION = "sys"
HOMEPAGE = "https://godoc.org/golang.org/x"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

GO_IMPORT = "golang.org/x/net"

inherit go

SRC_URI = "\
    git://github.com/golang/net.git;protocol=https;name=sys;destsuffix=${PN}-${PV}/src/${GO_IMPORT} \
    git://github.com/golang/text.git;protocol=https;name=sys;destsuffix=${PN}-${PV}/src/golang.org/x/text \
    "
SRCREV="${AUTOREV}"

DEPENDS += "\
    golang.org-x-crypto\
"