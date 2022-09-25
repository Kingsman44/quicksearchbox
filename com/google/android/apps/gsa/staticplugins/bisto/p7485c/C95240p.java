package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94641e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.p */
/* compiled from: PG */
final class C95240p extends C95238n {

    /* renamed from: a */
    private final C94641e f266466a;

    /* renamed from: b */
    private final boolean f266467b;

    public C95240p(C94641e eVar, boolean z) {
        this.f266466a = eVar;
        this.f266467b = z;
    }

    /* renamed from: a */
    public final C94641e mo89150a() {
        return this.f266466a;
    }

    /* renamed from: b */
    public final boolean mo89151b() {
        return this.f266467b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C95238n) {
            C95238n nVar = (C95238n) obj;
            return this.f266466a.equals(nVar.mo89150a()) && this.f266467b == nVar.mo89151b();
        }
    }

    public final int hashCode() {
        return ((this.f266466a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f266467b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f266466a.toString();
        boolean z = this.f266467b;
        return "QpuReplySourceTracker{announcementSource=" + obj + ", wasPausedPriorToStart=" + z + "}";
    }
}
