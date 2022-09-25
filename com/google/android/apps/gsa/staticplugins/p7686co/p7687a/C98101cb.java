package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.cb */
/* compiled from: PG */
final class C98101cb {

    /* renamed from: a */
    public Object f273875a;

    /* renamed from: b */
    private final C98100ca f273876b;

    /* renamed from: c */
    private boolean f273877c;

    /* renamed from: d */
    private boolean f273878d = true;

    public C98101cb(C98100ca caVar) {
        this.f273876b = caVar;
    }

    /* renamed from: a */
    public final void mo90950a(Object obj) {
        if (this.f273878d) {
            this.f273875a = obj;
            this.f273878d = false;
        } else if (!this.f273876b.mo90934a(this.f273875a, obj)) {
            this.f273875a = obj;
            this.f273877c = true;
        }
    }

    /* renamed from: b */
    public final boolean mo90951b() {
        boolean z = this.f273877c;
        this.f273877c = false;
        return z;
    }
}
