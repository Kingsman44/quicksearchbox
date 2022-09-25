package org.p5623b.p5624a;

/* renamed from: org.b.a.t */
/* compiled from: PG */
public final class C72107t extends IllegalStateException {

    /* renamed from: a */
    private Throwable f191936a;

    public C72107t(String str) {
        super(str);
    }

    public final Throwable getCause() {
        return this.f191936a;
    }

    public C72107t(String str, Throwable th) {
        super(str);
        this.f191936a = th;
    }
}
