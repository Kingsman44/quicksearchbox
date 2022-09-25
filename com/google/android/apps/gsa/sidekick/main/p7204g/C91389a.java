package com.google.android.apps.gsa.sidekick.main.p7204g;

import com.google.p375ai.p378b.C7744ii;

/* renamed from: com.google.android.apps.gsa.sidekick.main.g.a */
/* compiled from: PG */
public final class C91389a extends C91396h {

    /* renamed from: a */
    public final C91397i f254969a;

    /* renamed from: b */
    public final C7744ii f254970b;

    /* renamed from: c */
    private final boolean f254971c;

    /* renamed from: d */
    private final boolean f254972d;

    public C91389a(C91397i iVar, C7744ii iiVar, boolean z, boolean z2) {
        if (iVar != null) {
            this.f254969a = iVar;
            if (iiVar != null) {
                this.f254970b = iiVar;
                this.f254971c = z;
                this.f254972d = z2;
                return;
            }
            throw new NullPointerException("Null getEntryTree");
        }
        throw new NullPointerException("Null getGlobalData");
    }

    /* renamed from: a */
    public final C91397i mo85711a() {
        return this.f254969a;
    }

    /* renamed from: b */
    public final C7744ii mo85712b() {
        return this.f254970b;
    }

    /* renamed from: c */
    public final boolean mo85713c() {
        return this.f254971c;
    }

    /* renamed from: d */
    public final boolean mo85714d() {
        return this.f254972d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C91396h) {
            C91396h hVar = (C91396h) obj;
            return this.f254969a.equals(hVar.mo85711a()) && this.f254970b.equals(hVar.mo85712b()) && this.f254971c == hVar.mo85713c() && this.f254972d == hVar.mo85714d();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.f254969a.hashCode() ^ 1000003) * 1000003) ^ this.f254970b.hashCode()) * 1000003) ^ (true != this.f254971c ? 1237 : 1231)) * 1000003;
        if (true == this.f254972d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f254969a.toString();
        String obj2 = this.f254970b.toString();
        boolean z = this.f254971c;
        boolean z2 = this.f254972d;
        return "EntryTreeData{getGlobalData=" + obj + ", getEntryTree=" + obj2 + ", hasNextPageToken=" + z + ", isFailedPinnedContentFulfillment=" + z2 + "}";
    }
}
