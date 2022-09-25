package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.c */
/* compiled from: PG */
final class C97107c extends C97123s {

    /* renamed from: a */
    private final C97112h f271320a;

    /* renamed from: b */
    private final C58495hd f271321b;

    public C97107c(C97112h hVar, C58495hd hdVar) {
        this.f271320a = hVar;
        this.f271321b = hdVar;
    }

    /* renamed from: a */
    public final C97112h mo90476a() {
        return this.f271320a;
    }

    /* renamed from: b */
    public final C58495hd mo90477b() {
        return this.f271321b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C97123s) {
            C97123s sVar = (C97123s) obj;
            return this.f271320a.equals(sVar.mo90476a()) && C58662ni.m90356o(this.f271321b, sVar.mo90477b());
        }
    }

    public final int hashCode() {
        return ((this.f271320a.hashCode() ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f271321b.entrySet());
    }

    public final String toString() {
        String obj = this.f271320a.toString();
        String i = C58662ni.m90350i(this.f271321b);
        return "MoveAwayDuringDragConfig{sourceBubble=" + obj + ", startingPositions=" + i + "}";
    }
}
