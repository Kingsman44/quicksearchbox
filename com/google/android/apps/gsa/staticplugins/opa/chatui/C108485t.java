package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.t */
/* compiled from: PG */
final class C108485t extends C108300dq {

    /* renamed from: a */
    private final C58485gu f301849a;

    /* renamed from: b */
    private final C58485gu f301850b;

    public C108485t(C58485gu guVar, C58485gu guVar2) {
        this.f301849a = guVar;
        this.f301850b = guVar2;
    }

    /* renamed from: a */
    public final C58485gu mo96735a() {
        return this.f301849a;
    }

    /* renamed from: b */
    public final C58485gu mo96736b() {
        return this.f301850b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C108300dq) {
            C108300dq dqVar = (C108300dq) obj;
            return C58597ky.m90218i(this.f301849a, dqVar.mo96735a()) && C58597ky.m90218i(this.f301850b, dqVar.mo96736b());
        }
    }

    public final int hashCode() {
        return ((this.f301849a.hashCode() ^ 1000003) * 1000003) ^ this.f301850b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f301849a);
        String valueOf2 = String.valueOf(this.f301850b);
        return "PendingHistoryConversion{elements=" + valueOf + ", futures=" + valueOf2 + "}";
    }
}
