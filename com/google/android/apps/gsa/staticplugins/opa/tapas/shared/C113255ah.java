package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ah */
/* compiled from: PG */
public final class C113255ah extends C113258ak {

    /* renamed from: a */
    private final int f313620a;

    public C113255ah(int i) {
        this.f313620a = i;
    }

    /* renamed from: b */
    public final int mo99930b() {
        return 3;
    }

    /* renamed from: d */
    public final int mo99938d() {
        return this.f313620a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C113286bk) {
            C113286bk bkVar = (C113286bk) obj;
            if (bkVar.mo99930b() == 3 && this.f313620a == bkVar.mo99938d()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f313620a;
    }

    public final String toString() {
        int i = this.f313620a;
        return "IconSource{resId=" + i + "}";
    }
}
