package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.a */
/* compiled from: PG */
final class C109365a extends C109383ag {

    /* renamed from: a */
    private final C58485gu f304648a;

    /* renamed from: b */
    private final C58485gu f304649b;

    public C109365a(C58485gu guVar, C58485gu guVar2) {
        if (guVar != null) {
            this.f304648a = guVar;
            if (guVar2 != null) {
                this.f304649b = guVar2;
                return;
            }
            throw new NullPointerException("Null topContactsForTextAffinity");
        }
        throw new NullPointerException("Null topContactsForCallAffinity");
    }

    /* renamed from: a */
    public final C58485gu mo97803a() {
        return this.f304648a;
    }

    /* renamed from: b */
    public final C58485gu mo97804b() {
        return this.f304649b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C109383ag) {
            C109383ag agVar = (C109383ag) obj;
            return C58597ky.m90218i(this.f304648a, agVar.mo97803a()) && C58597ky.m90218i(this.f304649b, agVar.mo97804b());
        }
    }

    public final int hashCode() {
        return ((this.f304648a.hashCode() ^ 1000003) * 1000003) ^ this.f304649b.hashCode();
    }

    public final String toString() {
        String obj = this.f304648a.toString();
        String obj2 = this.f304649b.toString();
        return "ChalkboardPcpData{topContactsForCallAffinity=" + obj + ", topContactsForTextAffinity=" + obj2 + "}";
    }
}
