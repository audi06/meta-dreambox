require dreambox-secondstage.inc

COMPATIBLE_MACHINE = "^(dm800se)$"

SRC_URI[md5sum] = "3c335e3d1da39b4275ea2489f218f39b"
SRC_URI[sha256sum] = "a378b1eb56780c0a0d19d9380d359b41556983508da05c4a1617f3c6cf702bd2"

RDEPENDS_${PN} = ""

pkg_postinst_${PN}() {
	echo "Due to space limitations, this is now a dummy package!"
	echo "Nothing will happen when you try to update or reinstall it!"
	echo "The secondstage bootloader will remain the same!"
}
