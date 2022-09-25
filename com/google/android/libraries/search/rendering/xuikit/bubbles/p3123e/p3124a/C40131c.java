package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.a.c */
/* compiled from: PG */
final class C40131c extends C40148t {

    /* renamed from: a */
    private final C40137i f105407a;

    /* renamed from: b */
    private final C58495hd f105408b;

    public C40131c(C40137i iVar, C58495hd hdVar) {
        this.f105407a = iVar;
        if (hdVar != null) {
            this.f105408b = hdVar;
            return;
        }
        throw new NullPointerException("Null startingPositions");
    }

    /* renamed from: a */
    public final C40137i mo42224a() {
        return this.f105407a;
    }

    /* renamed from: b */
    public final C58495hd mo42225b() {
        return this.f105408b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C40148t) {
            C40148t tVar = (C40148t) obj;
            return this.f105407a.equals(tVar.mo42224a()) && this.f105408b.equals(tVar.mo42225b());
        }
    }

    public final int hashCode() {
        return ((this.f105407a.hashCode() ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f105408b.entrySet());
    }

    public final String toString() {
        String obj = this.f105407a.toString();
        String obj2 = this.f105408b.toString();
        return "MoveAwayDuringDragConfig{sourceBubble=" + obj + ", startingPositions=" + obj2 + "}";
    }
}
