package org.p5610a.p5611a.p5621c.p5622a;

import java.io.Writer;

/* renamed from: org.a.a.c.a.k */
/* compiled from: PG */
public class C72010k extends C72002c {

    /* renamed from: b */
    private final int f191746b;

    protected C72010k(int i) {
        this.f191746b = i;
    }

    /* renamed from: c */
    public final boolean mo63214c(int i, Writer writer) {
        if (i >= 32 && i <= this.f191746b) {
            return false;
        }
        if (i > 65535) {
            writer.write(mo63215d(i));
            return true;
        }
        writer.write("\\u");
        writer.write(f191725a[(i >> 12) & 15]);
        writer.write(f191725a[(i >> 8) & 15]);
        writer.write(f191725a[(i >> 4) & 15]);
        writer.write(f191725a[i & 15]);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo63215d(int i) {
        return "\\u".concat(String.valueOf(m105305b(i)));
    }
}
