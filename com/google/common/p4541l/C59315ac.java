package com.google.common.p4541l;

import java.io.File;
import java.io.FileInputStream;
import p3186j$.wrapper.java.p3189io.FileInputStreamWrapper;

/* renamed from: com.google.common.l.ac */
/* compiled from: PG */
public final class C59315ac extends C59329l {

    /* renamed from: a */
    private final File f157486a;

    public C59315ac(File file) {
        file.getClass();
        this.f157486a = file;
    }

    /* renamed from: a */
    public final byte[] mo56803a() {
        C59341x a = C59341x.m92227a();
        try {
            FileInputStream b = mo56804b();
            a.mo56859c(b);
            byte[] e = C59332o.m92214e(b, FileInputStreamWrapper.getChannel(b).size());
            a.close();
            return e;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: b */
    public final FileInputStream mo56804b() {
        return new FileInputStream(this.f157486a);
    }

    public final String toString() {
        return "Files.asByteSource(" + this.f157486a + ")";
    }
}
