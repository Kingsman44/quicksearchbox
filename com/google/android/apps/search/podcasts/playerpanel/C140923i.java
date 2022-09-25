package com.google.android.apps.search.podcasts.playerpanel;

import com.google.android.apps.search.podcasts.player.C140787e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.i */
/* compiled from: PG */
public final class C140923i {

    /* renamed from: a */
    public final C140787e f382659a;

    /* renamed from: b */
    public final boolean f382660b;

    /* renamed from: c */
    public final boolean f382661c;

    public C140923i(C140787e eVar, boolean z, boolean z2) {
        this.f382659a = eVar;
        this.f382660b = z;
        this.f382661c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140923i)) {
            return false;
        }
        C140923i iVar = (C140923i) obj;
        return C69664n.m101066l(this.f382659a, iVar.f382659a) && this.f382660b == iVar.f382660b && this.f382661c == iVar.f382661c;
    }

    public final int hashCode() {
        C140787e eVar = this.f382659a;
        return ((((eVar == null ? 0 : eVar.hashCode()) * 31) + (this.f382660b ? 1 : 0)) * 31) + (this.f382661c ? 1 : 0);
    }

    public final String toString() {
        C140787e eVar = this.f382659a;
        boolean z = this.f382660b;
        boolean z2 = this.f382661c;
        return "PlayerExpandedPanelData(playerInfo=" + eVar + ", includeReactions=" + z + ", showBufferingState=" + z2 + ")";
    }
}
