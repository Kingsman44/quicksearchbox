package com.google.android.libraries.lens.view.p2113h.p2114a;

/* renamed from: com.google.android.libraries.lens.view.h.a.e */
/* compiled from: PG */
public final class C26644e extends C26642c {

    /* renamed from: c */
    private volatile float f72652c = -3.4028235E38f;

    /* renamed from: b */
    public final synchronized void mo31932b(float f) {
        this.f72652c = Math.max(this.f72652c, f);
        super.mo31932b(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo31933c() {
        super.mo31933c();
        this.f72652c = -3.4028235E38f;
    }

    /* renamed from: d */
    public final synchronized C26645f mo31934d() {
        C26640a aVar;
        aVar = new C26640a(this.f72650a, this.f72652c, this.f72651b);
        mo31933c();
        return aVar;
    }
}
