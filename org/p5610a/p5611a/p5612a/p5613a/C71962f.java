package org.p5610a.p5611a.p5612a.p5613a;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import p3186j$.util.Objects;

/* renamed from: org.a.a.a.a.f */
/* compiled from: PG */
public final class C71962f extends C71960d {

    /* renamed from: b */
    private final String[] f191661b;

    /* renamed from: c */
    private final boolean f191662c;

    /* renamed from: d */
    private final LinkOption[] f191663d;

    public C71962f(C71957a aVar, LinkOption[] linkOptionArr, C71961e[] eVarArr, String... strArr) {
        super(aVar);
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        this.f191661b = strArr2;
        this.f191662c = C71969m.m105255a(eVarArr);
        this.f191663d = linkOptionArr == null ? C71965i.m105250g() : (LinkOption[]) linkOptionArr.clone();
    }

    /* renamed from: f */
    private final boolean m105238f(Path path) {
        return Arrays.binarySearch(this.f191661b, Objects.toString(path.getFileName(), (String) null)) < 0;
    }

    /* renamed from: a */
    public final FileVisitResult mo63136a(Path path, BasicFileAttributes basicFileAttributes) {
        super.preVisitDirectory(path, basicFileAttributes);
        return m105238f(path) ? FileVisitResult.CONTINUE : FileVisitResult.SKIP_SUBTREE;
    }

    /* renamed from: b */
    public final FileVisitResult mo63137b(Path path, BasicFileAttributes basicFileAttributes) {
        if (m105238f(path)) {
            if (Files.exists(path, this.f191663d)) {
                if (this.f191662c) {
                    C71965i.m105253j(path, this.f191663d);
                }
                Files.deleteIfExists(path);
            }
            if (Files.isSymbolicLink(path)) {
                try {
                    Files.delete(path);
                } catch (NoSuchFileException unused) {
                }
            }
        }
        mo63139d(basicFileAttributes);
        return FileVisitResult.CONTINUE;
    }

    /* renamed from: e */
    public final FileVisitResult mo63140e(Path path) {
        if (C71965i.m105249f(path)) {
            Files.deleteIfExists(path);
        }
        mo63138c();
        return FileVisitResult.CONTINUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        C71962f fVar = (C71962f) obj;
        return this.f191662c == fVar.f191662c && Arrays.equals(this.f191661b, fVar.f191661b);
    }

    public final int hashCode() {
        int hashCode = super.hashCode();
        return (((hashCode * 31) + Arrays.hashCode(this.f191661b)) * 31) + Objects.hash(Boolean.valueOf(this.f191662c));
    }

    public final /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return mo63140e((Path) obj);
    }

    public final /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return preVisitDirectory((Path) obj, basicFileAttributes);
    }

    public final /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return visitFile((Path) obj, basicFileAttributes);
    }
}
