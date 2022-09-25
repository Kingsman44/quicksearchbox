package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d;

import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i;
import com.google.common.p4522b.C58528ij;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5462h.p5473f.p5475b.C69664n;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71029cb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.d.c */
/* compiled from: PG */
public final class C127921c {

    /* renamed from: a */
    public final C71422aw f352122a;

    /* renamed from: b */
    public final C71788b f352123b = new C71799m();

    /* renamed from: c */
    public final ConcurrentHashMap f352124c = new ConcurrentHashMap();

    /* renamed from: d */
    public final C58528ij f352125d;

    public C127921c(C71422aw awVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f352122a = awVar;
        C58528ij L = C58528ij.m90012L(C71029cb.QUICK_PHRASES, C71029cb.TNG_MA_STATUS, C71029cb.ZERO_MIC_LATENCY);
        C69664n.m101060f(L, "of(\n      FeatureName.QU…me.ZERO_MIC_LATENCY\n    )");
        this.f352125d = L;
    }

    /* renamed from: a */
    public final void mo108274a(C71029cb cbVar, C127930i iVar) {
        C69664n.m101061g(cbVar, "featureName");
        C69664n.m101061g(iVar, "featureStatus");
        this.f352124c.put(cbVar, iVar);
    }
}
