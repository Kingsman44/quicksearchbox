package com.google.common.p4541l;

import com.google.common.p4522b.C58528ij;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.google.common.l.ab */
/* compiled from: PG */
public final class C59314ab extends C59327j {

    /* renamed from: a */
    private final File f157484a;

    /* renamed from: b */
    private final C58528ij f157485b;

    public C59314ab(File file, C59343z... zVarArr) {
        this.f157484a = file;
        this.f157485b = C58528ij.m90008H(zVarArr);
    }

    /* renamed from: a */
    public final FileOutputStream mo56801a() {
        return new FileOutputStream(this.f157484a, this.f157485b.contains(C59343z.f157532a));
    }

    public final String toString() {
        return "Files.asByteSink(" + this.f157484a + ", " + this.f157485b + ")";
    }
}
