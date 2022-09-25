package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7605b.p7606a;

import com.google.android.libraries.logging.C28292j;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.a.i */
/* compiled from: PG */
final class C97168i extends C97157ag {

    /* renamed from: a */
    public final C28292j f271501a;

    /* renamed from: b */
    public final C28292j f271502b;

    /* renamed from: c */
    public final C28292j f271503c;

    public C97168i(C28292j jVar, C28292j jVar2, C28292j jVar3) {
        this.f271501a = jVar;
        this.f271502b = jVar2;
        this.f271503c = jVar3;
    }

    /* renamed from: a */
    public final C28292j mo90549a() {
        return this.f271502b;
    }

    /* renamed from: b */
    public final C28292j mo90550b() {
        return this.f271503c;
    }

    /* renamed from: c */
    public final C28292j mo90551c() {
        return this.f271501a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C97157ag) {
            C97157ag agVar = (C97157ag) obj;
            return this.f271501a.equals(agVar.mo90551c()) && this.f271502b.equals(agVar.mo90549a()) && this.f271503c.equals(agVar.mo90550b());
        }
    }

    public final int hashCode() {
        return ((((this.f271501a.hashCode() ^ 1000003) * 1000003) ^ this.f271502b.hashCode()) * 1000003) ^ this.f271503c.hashCode();
    }

    public final String toString() {
        String obj = this.f271501a.toString();
        String obj2 = this.f271502b.toString();
        String obj3 = this.f271503c.toString();
        return "VisualElementsHolder{rowVe=" + obj + ", checkboxWhenCheckedVe=" + obj2 + ", checkboxWhenUncheckedVe=" + obj3 + "}";
    }
}
