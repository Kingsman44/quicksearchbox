package org.p5610a.p5611a.p5612a.p5614b;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import p3186j$.util.Objects;

/* renamed from: org.a.a.a.b.a */
/* compiled from: PG */
public class C71971a implements FileVisitor, C71972b {

    /* renamed from: a */
    public final FileVisitResult f191674a;

    /* renamed from: b */
    public final FileVisitResult f191675b;

    protected C71971a(FileVisitResult fileVisitResult, FileVisitResult fileVisitResult2) {
        this.f191674a = fileVisitResult;
        this.f191675b = fileVisitResult2;
    }

    /* renamed from: a */
    public /* synthetic */ FileVisitResult mo63147a(Path path) {
        throw null;
    }

    public boolean accept(File file) {
        Objects.requireNonNull(file, "file");
        return accept(file.getParentFile(), file.getName());
    }

    public final /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        Path path = (Path) obj;
        return FileVisitResult.CONTINUE;
    }

    public final /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return mo63147a((Path) obj);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public final /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return mo63147a((Path) obj);
    }

    public final /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        Path path = (Path) obj;
        return FileVisitResult.CONTINUE;
    }

    public final boolean accept(File file, String str) {
        Objects.requireNonNull(str, "name");
        return accept(new File(file, str));
    }
}
