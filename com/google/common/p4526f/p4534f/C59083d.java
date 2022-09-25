package com.google.common.p4526f.p4534f;

import java.io.Closeable;

/* renamed from: com.google.common.f.f.d */
/* compiled from: PG */
public final class C59083d implements Closeable {

    /* renamed from: a */
    public static final ThreadLocal f157045a = new C59082c();

    /* renamed from: b */
    public int f157046b = 0;

    public final void close() {
        int i = this.f157046b;
        if (i > 0) {
            this.f157046b = i - 1;
            return;
        }
        throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
    }
}
