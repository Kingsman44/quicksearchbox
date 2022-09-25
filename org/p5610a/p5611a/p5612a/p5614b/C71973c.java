package org.p5610a.p5611a.p5612a.p5614b;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;

/* renamed from: org.a.a.a.b.c */
/* compiled from: PG */
public final class C71973c extends C71971a implements Serializable {
    private static final long serialVersionUID = 1;

    static {
        new C71973c();
    }

    protected C71973c() {
        super(FileVisitResult.CONTINUE, FileVisitResult.TERMINATE);
    }

    /* renamed from: a */
    public final FileVisitResult mo63147a(Path path) {
        return Files.isSymbolicLink(path) ? this.f191674a : this.f191675b;
    }

    public final boolean accept(File file) {
        return file.isFile();
    }

    public C71973c(FileVisitResult fileVisitResult, FileVisitResult fileVisitResult2) {
        super(fileVisitResult, fileVisitResult2);
    }
}
