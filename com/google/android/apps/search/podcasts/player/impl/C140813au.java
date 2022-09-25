package com.google.android.apps.search.podcasts.player.impl;

import com.google.android.apps.search.podcasts.p10601r.C140985g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.au */
/* compiled from: PG */
public final class C140813au implements Runnable {

    /* renamed from: a */
    public int f382407a;

    /* renamed from: b */
    public Instant f382408b;

    /* renamed from: c */
    final /* synthetic */ C140814av f382409c;

    /* renamed from: d */
    private int f382410d;

    public C140813au(C140814av avVar) {
        this.f382409c = avVar;
        Instant ofEpochMilli = Instant.ofEpochMilli(0);
        C69664n.m101060f(ofEpochMilli, "ofEpochMilli(0)");
        this.f382408b = ofEpochMilli;
    }

    public final void run() {
        int i = this.f382410d + 1;
        this.f382410d = i;
        if (i >= this.f382407a) {
            if (i == 1) {
                C140806an anVar = (C140806an) this.f382409c.f382413c;
                ((C58970a) anVar.f382337L.mo56224b()).mo56386p("toggle play/pause");
                C140985g.m228940a(anVar.f382374l, new C140803ak(anVar));
            } else if (i == 2) {
                this.f382409c.f382413c.mo115886h();
            } else if (i != 3) {
                C58974d dVar = C140814av.f382411a;
            } else {
                this.f382409c.f382413c.mo115890l();
            }
            this.f382410d = 0;
            this.f382407a = 0;
        }
    }
}
