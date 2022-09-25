package com.google.android.apps.search.googleapp.activity.p10137b;

import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.util.concurrent.C60866ct;
import kotlinx.coroutines.p5574b.C71521by;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71571du;
import kotlinx.coroutines.p5574b.C71574dx;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.activity.b.h */
/* compiled from: PG */
public final class C133411h {

    /* renamed from: a */
    public final C46723bg f363529a;

    /* renamed from: b */
    public final C71571du f363530b;

    /* renamed from: c */
    private final C46778cv f363531c;

    /* renamed from: d */
    private final C71548cy f363532d;

    public C133411h(C46778cv cvVar, C46723bg bgVar) {
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(bgVar, "dataSources");
        this.f363531c = cvVar;
        this.f363529a = bgVar;
        C71548cy b = C71574dx.m104480b(Optional.empty());
        this.f363532d = b;
        this.f363530b = C71521by.m104365c(b);
    }

    /* renamed from: a */
    public final void mo111132a(boolean z) {
        this.f363532d.mo62807f(Optional.m71637of(Boolean.valueOf(z)));
        this.f363531c.mo50787a(C60866ct.f164955a, "NAV_BAR_VISIBILITY_KEY");
    }
}
