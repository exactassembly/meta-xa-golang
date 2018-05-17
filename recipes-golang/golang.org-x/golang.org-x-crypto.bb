DESCRIPTION = "Go supplementary libraries"
SECTION = "sys"
HOMEPAGE = "https://godoc.org/golang.org/x"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

GO_IMPORT = "golang.org/x/crypto"

inherit go

SRC_URI = "\
    git://github.com/golang/crypto.git;protocol=https;name=sys;destsuffix=${PN}-${PV}/src/${GO_IMPORT} \
    "
SRCREV="${AUTOREV}"

DEPENDS += "\
    golang.org-x-sys \
    "