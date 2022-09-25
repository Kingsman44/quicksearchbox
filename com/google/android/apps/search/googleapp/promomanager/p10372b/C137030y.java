package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p4880aq.C63713ab;
import com.google.protos.p4880aq.C63766w;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.y */
/* compiled from: PG */
public final /* synthetic */ class C137030y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137009dj f372921a;

    /* renamed from: b */
    public final /* synthetic */ C63766w f372922b;

    public /* synthetic */ C137030y(C137009dj djVar, C63766w wVar) {
        this.f372921a = djVar;
        this.f372922b = wVar;
    }

    public final Object apply(Object obj) {
        C137009dj djVar = this.f372921a;
        C63766w wVar = this.f372922b;
        C63042fg fgVar = (C63042fg) obj;
        C63042fg fgVar2 = djVar.f372883c;
        if (fgVar2 == null) {
            fgVar2 = C63042fg.f170152c;
        }
        Instant e = C62950b.m95474e(fgVar2);
        Instant e2 = C62950b.m95474e(fgVar);
        C62995dn dnVar = wVar.f172504b;
        if (dnVar.containsKey("timeSinceDeletionMs")) {
            C63713ab abVar = (C63713ab) dnVar.get("timeSinceDeletionMs");
            return Boolean.valueOf(e.isAfter(e2.plus(Duration.ofMillis(abVar.f172260a == 2 ? ((Long) abVar.f172261b).longValue() : 0))));
        }
        throw new IllegalArgumentException();
    }
}
