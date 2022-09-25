package org.p5610a.p5611a.p5612a.p5614b;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;

/* renamed from: org.a.a.a.b.d */
/* compiled from: PG */
public final class C71974d implements Serializable, C71972b {

    /* renamed from: a */
    public static final C71972b f191676a;

    /* renamed from: b */
    public static final C71972b f191677b;

    /* renamed from: c */
    private static final String f191678c = Boolean.TRUE.toString();
    private static final long serialVersionUID = 8782512160909720199L;

    static {
        C71974d dVar = new C71974d();
        f191676a = dVar;
        f191677b = dVar;
    }

    protected C71974d() {
    }

    /* renamed from: a */
    public final FileVisitResult mo63147a(Path path) {
        return FileVisitResult.CONTINUE;
    }

    public final boolean accept(File file) {
        return true;
    }

    public final boolean accept(File file, String str) {
        return true;
    }

    public final String toString() {
        return f191678c;
    }
}
