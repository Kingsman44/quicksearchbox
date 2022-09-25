package com.google.common.base;

/* renamed from: com.google.common.base.aa */
/* compiled from: PG */
public abstract class C58810aa implements C58817ah {

    /* renamed from: a */
    private transient C58810aa f156602a;

    @Deprecated
    public final Object apply(Object obj) {
        return mo56070hd(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo17535b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Object mo17536c(Object obj);

    /* renamed from: fP */
    public Object mo56068fP(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b = mo17535b(obj);
        b.getClass();
        return b;
    }

    /* renamed from: h */
    public final C58810aa mo56069h() {
        C58810aa aaVar = this.f156602a;
        if (aaVar != null) {
            return aaVar;
        }
        C58916z zVar = new C58916z(this);
        this.f156602a = zVar;
        return zVar;
    }

    /* renamed from: hd */
    public Object mo56070hd(Object obj) {
        if (obj == null) {
            return null;
        }
        Object c = mo17536c(obj);
        c.getClass();
        return c;
    }
}
