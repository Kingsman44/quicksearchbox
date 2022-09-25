package com.google.android.apps.search.googleapp.discover.feedback.p10185a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.a.e */
/* compiled from: PG */
public final class C134285e extends C134295o {

    /* renamed from: a */
    public final boolean f365789a;

    /* renamed from: b */
    private final String f365790b;

    /* renamed from: c */
    private final C134296p f365791c;

    public C134285e(String str, C134296p pVar, boolean z) {
        C69664n.m101061g(pVar, "sensitivity");
        this.f365790b = str;
        this.f365791c = pVar;
        this.f365789a = z;
    }

    /* renamed from: a */
    public final C134296p mo111675a() {
        return this.f365791c;
    }

    /* renamed from: b */
    public final String mo111676b() {
        return this.f365790b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134285e)) {
            return false;
        }
        C134285e eVar = (C134285e) obj;
        return C69664n.m101066l(this.f365790b, eVar.f365790b) && this.f365791c == eVar.f365791c && this.f365789a == eVar.f365789a;
    }

    public final int hashCode() {
        return (((this.f365790b.hashCode() * 31) + this.f365791c.hashCode()) * 31) + (this.f365789a ? 1 : 0);
    }

    public final String toString() {
        String str = this.f365790b;
        C134296p pVar = this.f365791c;
        boolean z = this.f365789a;
        return "BooleanFeature(name=" + str + ", sensitivity=" + pVar + ", value=" + z + ")";
    }
}
