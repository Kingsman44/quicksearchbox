package org.p5610a.p5611a.p5612a.p5613a;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import org.p5610a.p5611a.p5612a.p5614b.C71972b;
import org.p5610a.p5611a.p5612a.p5614b.C71973c;
import org.p5610a.p5611a.p5612a.p5614b.C71974d;
import p3186j$.util.Objects;

/* renamed from: org.a.a.a.a.d */
/* compiled from: PG */
public class C71960d extends C71967k {

    /* renamed from: a */
    public final C71957a f191658a;

    /* renamed from: b */
    private final C71963g f191659b;

    /* renamed from: c */
    private final C71963g f191660c;

    public C71960d(C71957a aVar) {
        C71973c cVar = new C71973c(FileVisitResult.TERMINATE, FileVisitResult.CONTINUE);
        C71972b bVar = C71974d.f191677b;
        this.f191658a = (C71957a) Objects.requireNonNull(aVar, "pathCounter");
        this.f191659b = (C71963g) Objects.requireNonNull(cVar, "fileFilter");
        this.f191660c = (C71963g) Objects.requireNonNull(bVar, "dirFilter");
    }

    /* renamed from: a */
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
        return this.f191660c.mo63147a(path) != FileVisitResult.CONTINUE ? FileVisitResult.SKIP_SUBTREE : FileVisitResult.CONTINUE;
    }

    /* renamed from: b */
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        if (Files.exists(path, new LinkOption[0]) && this.f191659b.mo63147a(path) == FileVisitResult.CONTINUE) {
            mo63139d(basicFileAttributes);
        }
        return FileVisitResult.CONTINUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo63138c() {
        this.f191658a.f191655b.mo63132a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo63139d(BasicFileAttributes basicFileAttributes) {
        this.f191658a.f191656c.mo63132a();
        this.f191658a.f191654a.f191657a += basicFileAttributes.size();
    }

    /* renamed from: e */
    public FileVisitResult mo63140e(Path path) {
        mo63138c();
        return FileVisitResult.CONTINUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71960d)) {
            return false;
        }
        return Objects.equals(this.f191658a, ((C71960d) obj).f191658a);
    }

    public int hashCode() {
        return Objects.hash(this.f191658a);
    }

    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return mo63140e((Path) obj);
    }

    public final String toString() {
        return this.f191658a.toString();
    }
}
