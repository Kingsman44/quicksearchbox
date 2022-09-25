package com.google.apps.tiktok.experiments.phenotype;

import com.google.android.libraries.phenotype.client.p2420a.C31639g;
import com.google.common.base.C58833ax;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.fj */
/* compiled from: PG */
public final class C47052fj {

    /* renamed from: a */
    public final C69464a f122633a;

    /* renamed from: b */
    public final ScheduledExecutorService f122634b;

    /* renamed from: c */
    public final Map f122635c;

    /* renamed from: d */
    public final C31639g f122636d;

    /* renamed from: e */
    public final C58833ax f122637e;

    /* renamed from: f */
    public final C46917ak f122638f;

    /* renamed from: g */
    public final C46917ak f122639g;

    public C47052fj(C69464a aVar, ScheduledExecutorService scheduledExecutorService, Map map, C31639g gVar, C58833ax axVar, C46917ak akVar, C46917ak akVar2) {
        C69664n.m101061g(aVar, "enableTimeout");
        C69664n.m101061g(scheduledExecutorService, "executor");
        C69664n.m101061g(map, "packages");
        C69664n.m101061g(gVar, "phenotypeApi");
        C69664n.m101061g(akVar, "uiState");
        C69664n.m101061g(akVar2, "state");
        this.f122633a = aVar;
        this.f122634b = scheduledExecutorService;
        this.f122635c = map;
        this.f122636d = gVar;
        this.f122637e = axVar;
        this.f122638f = akVar;
        this.f122639g = akVar2;
    }
}
