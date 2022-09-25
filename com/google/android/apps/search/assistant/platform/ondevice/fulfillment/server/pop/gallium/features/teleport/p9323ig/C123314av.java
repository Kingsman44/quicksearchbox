package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;
import com.google.p4272br.C56449r;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.av */
/* compiled from: PG */
final class C123314av extends C123386dm {

    /* renamed from: a */
    private final C56449r f341059a;

    /* renamed from: b */
    private final C58495hd f341060b;

    public C123314av(C56449r rVar, C58495hd hdVar) {
        this.f341059a = rVar;
        this.f341060b = hdVar;
    }

    /* renamed from: a */
    public final C58495hd mo105969a() {
        return this.f341060b;
    }

    /* renamed from: b */
    public final C56449r mo105970b() {
        return this.f341059a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C123386dm) {
            C123386dm dmVar = (C123386dm) obj;
            return this.f341059a.equals(dmVar.mo105970b()) && C58662ni.m90356o(this.f341060b, dmVar.mo105969a());
        }
    }

    public final int hashCode() {
        return ((this.f341059a.hashCode() ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f341060b.entrySet());
    }

    public final String toString() {
        String str = this.f341059a.f150776a;
        String i = C58662ni.m90350i(this.f341060b);
        return "TeleportPrecompiledPattern{pattern=" + str + ", groupNameToTokenMap=" + i + "}";
    }
}
