package org.p5623b.p5624a;

import java.io.IOException;

/* renamed from: org.b.a.h */
/* compiled from: PG */
public final class C72095h extends IOException {

    /* renamed from: a */
    private Throwable f191917a;

    public C72095h(String str) {
        super(str);
    }

    public final Throwable getCause() {
        return this.f191917a;
    }

    public C72095h(String str, Throwable th) {
        super(str);
        this.f191917a = th;
    }
}
