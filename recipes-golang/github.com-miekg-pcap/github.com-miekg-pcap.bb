SUMMARY = "PCAP Library"
DESCRIPTION = "Go libPCAP (packet capture) wrapper"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=67254149849a25186e14dcb25c222861"


GO_IMPORT = "github.com/miekg/pcap"
SRC_URI="git://github.com/miekg/pcap.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
#SRCREV="${AUTOREV}"
SRCREV="51d9d986bf8d5f524d65bf31c353e10271d54aaa"

inherit go

DEPENDS += "\
	libpcap \
    golang.org-x-net \
    golang.org-x-sys \
"

PACKAGES_prepend = "${PN}-tools "

FILES_${PN}-tools = "\
 /usr/bin/tcpdump"

PACKAGES_prepend = "${PN}-tests "

FILES_${PN}-tests = "\
 /usr/bin/pcaptest \
 /usr/bin/pass"

#INSANE_SKIP_${PN}-server = "ldflags"