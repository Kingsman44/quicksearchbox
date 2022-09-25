package com.google.android.libraries.assistant.p1484g.p1502d;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.assistant.g.d.a */
/* compiled from: PG */
final class C18148a extends C18187x {

    /* renamed from: b */
    private final C58485gu f51634b;

    /* renamed from: c */
    private final boolean f51635c;

    public C18148a(C58485gu guVar, boolean z) {
        if (guVar != null) {
            this.f51634b = guVar;
            this.f51635c = z;
            return;
        }
        throw new NullPointerException("Null directActions");
    }

    /* renamed from: a */
    public final C58485gu mo23634a() {
        return this.f51634b;
    }

    /* renamed from: b */
    public final boolean mo23635b() {
        return this.f51635c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18187x) {
            C18187x xVar = (C18187x) obj;
            return C58597ky.m90218i(this.f51634b, xVar.mo23634a()) && this.f51635c == xVar.mo23635b();
        }
    }

    public final int hashCode() {
        return ((this.f51634b.hashCode() ^ 1000003) * 1000003) ^ (true != this.f51635c ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f51634b.toString();
        boolean z = this.f51635c;
        return "GetDirectActionsResponse{directActions=" + obj + ", loading=" + z + "}";
    }
}
