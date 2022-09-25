package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9975i;

import com.google.android.gms.pay.PassInstance;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.i.a */
/* compiled from: PG */
final class C131335a extends C131343b {

    /* renamed from: a */
    private final PassInstance f359045a;

    /* renamed from: b */
    private final C58485gu f359046b;

    public C131335a(PassInstance passInstance, C58485gu guVar) {
        this.f359045a = passInstance;
        this.f359046b = guVar;
    }

    /* renamed from: a */
    public final PassInstance mo110145a() {
        return this.f359045a;
    }

    /* renamed from: b */
    public final C58485gu mo110146b() {
        return this.f359046b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131343b) {
            C131343b bVar = (C131343b) obj;
            return this.f359045a.equals(bVar.mo110145a()) && C58597ky.m90218i(this.f359046b, bVar.mo110146b());
        }
    }

    public final int hashCode() {
        return ((this.f359045a.hashCode() ^ 1000003) * 1000003) ^ this.f359046b.hashCode();
    }

    public final String toString() {
        String obj = this.f359045a.toString();
        String obj2 = this.f359046b.toString();
        return "LoyaltyCardInfo{passInstance=" + obj + ", places=" + obj2 + "}";
    }
}
