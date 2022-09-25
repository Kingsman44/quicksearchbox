package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import com.google.common.p4526f.C59052c;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.w */
/* compiled from: PG */
final class C101163w extends SimpleFileVisitor {

    /* renamed from: a */
    final /* synthetic */ Path f282392a;

    /* renamed from: b */
    final /* synthetic */ ZipOutputStream f282393b;

    public C101163w(Path path, ZipOutputStream zipOutputStream) {
        this.f282392a = path;
        this.f282393b = zipOutputStream;
    }

    public final /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        Path path = (Path) obj;
        if (!this.f282392a.equals(path)) {
            ((C59052c) ((C59052c) C101166z.f282396a.mo56224b()).mo56372aa(19812)).mo56389s("Dumping dir %s.", path);
            this.f282393b.putNextEntry(new ZipEntry(String.valueOf(String.valueOf(this.f282392a.relativize(path))).concat("/")));
            this.f282393b.closeEntry();
        }
        return FileVisitResult.CONTINUE;
    }

    public final /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        Path path = (Path) obj;
        this.f282393b.putNextEntry(new ZipEntry(this.f282392a.relativize(path).toString()));
        Files.copy(path, this.f282393b);
        this.f282393b.closeEntry();
        return FileVisitResult.CONTINUE;
    }
}
