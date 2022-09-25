package com.google.p4648g.p4650b;

/* renamed from: com.google.g.b.e */
/* compiled from: PG */
class C61642e {

    /* renamed from: a */
    protected volatile C61641d f166538a;

    /* renamed from: b */
    public Object f166539b;

    public C61642e(C61641d dVar) {
        this.f166538a = dVar;
    }

    public final Object get() {
        if (this.f166538a != null) {
            synchronized (this) {
                if (this.f166538a != null) {
                    Object obj = this.f166538a.get();
                    this.f166539b = obj;
                    this.f166538a = null;
                    return obj;
                }
            }
        }
        return this.f166539b;
    }
}
