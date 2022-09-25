package com.google.android.apps.search.googleapp.search.p10415i;

import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.i.b */
/* compiled from: PG */
public final class C137493b {

    /* renamed from: a */
    public static final C58974d f373958a = C58974d.m91136j();

    /* renamed from: b */
    public final C60950i f373959b;

    /* renamed from: c */
    public Instant f373960c;

    public C137493b(C60950i iVar) {
        C69664n.m101061g(iVar, "timeSource");
        this.f373959b = iVar;
        Instant instant = Instant.EPOCH;
        C69664n.m101060f(instant, "EPOCH");
        this.f373960c = instant;
    }

    /* renamed from: a */
    public final void mo113785a() {
        Instant a = this.f373959b.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        this.f373960c = a;
    }
}
