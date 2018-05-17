DESCRIPTION = "Go supplementary libraries"
SECTION = "sys"
HOMEPAGE = "https://godoc.org/golang.org/x"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

GO_IMPORT = "golang.org/x/tools"

inherit go

SRC_URI = "\
    git://github.com/golang/tools.git;protocol=https;name=sys;destsuffix=${PN}-${PV}/src/${GO_IMPORT} \
    "
SRCREV="${AUTOREV}"

FILES_${PN}-staticdev += " \
    /usr/lib/go/src/golang.org/x/tools/go/gccgoexportdata/testdata/*.a \
    /usr/lib/go/src/golang.org/x/tools/go/gcexportdata/testdata/*.a \
    /usr/lib/go/src/golang.org/x/tools/go/gcimporter15/testdata/versions/*.a \
    "

DEPENDS += "\
    golang.org-x-crypto \
    golang.org-x-net \
    "
    
RDEPENDS_${PN}-dev += "bash"
