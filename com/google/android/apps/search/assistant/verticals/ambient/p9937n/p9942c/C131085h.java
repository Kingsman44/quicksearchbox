package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c;

import com.google.assistant.p3886c.p3887a.C50682r;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.c.h */
/* compiled from: PG */
public final class C131085h extends C131088k {

    /* renamed from: a */
    private final C50682r f358550a;

    /* renamed from: b */
    private final C58485gu f358551b;

    public C131085h(C50682r rVar, C58485gu guVar) {
        this.f358550a = rVar;
        this.f358551b = guVar;
    }

    /* renamed from: a */
    public final C50682r mo110058a() {
        return this.f358550a;
    }

    /* renamed from: b */
    public final C58485gu mo110059b() {
        return this.f358551b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131088k) {
            C131088k kVar = (C131088k) obj;
            return this.f358550a.equals(kVar.mo110058a()) && C58597ky.m90218i(this.f358551b, kVar.mo110059b());
        }
    }

    public final int hashCode() {
        return ((this.f358550a.hashCode() ^ 1000003) * 1000003) ^ this.f358551b.hashCode();
    }

    public final String toString() {
        String obj = this.f358550a.toString();
        String obj2 = this.f358551b.toString();
        return "ConnectionAppEvents{headphoneConnection=" + obj + ", appEvents=" + obj2 + "}";
    }
}
