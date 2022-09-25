package com.google.android.libraries.assistant.auto.jumpboost.p671g.p672a;

import com.google.android.apps.gsa.binaries.satin.app.anp;
import com.google.android.libraries.assistant.auto.jumpboost.p671g.C11474a;
import com.google.android.libraries.assistant.auto.tng.p716a.p717a.C11949a;
import com.google.android.libraries.assistant.auto.tng.p716a.p717a.C11950b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34012ab;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34013ac;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34014ad;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34016af;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34083cs;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34084ct;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34086cv;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34091d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34115x;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34117z;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70868g;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.g.a.a */
/* compiled from: PG */
public final class C11475a implements C11474a {

    /* renamed from: a */
    public C11950b f37276a;

    /* renamed from: b */
    private final anp f37277b;

    /* renamed from: c */
    private final C11476b f37278c;

    public C11475a(anp anp, C11476b bVar) {
        C69664n.m101061g(anp, "triggeringClientFactory");
        this.f37277b = anp;
        this.f37278c = bVar;
    }

    /* renamed from: a */
    public final void mo19962a() {
        anp anp = this.f37277b;
        C11950b bVar = new C11950b((C34091d) anp.f199094a.b.f198027a.f199171W.mo17428b(), C34037b.CLIENT_AUTO_PROJECTED, this.f37278c);
        bVar.f38391d = (C70868g) bVar.f38389b.mo39212b(C47686k.m84827a(new C11949a(bVar)));
        C34115x xVar = (C34115x) C34117z.f90863d.createBuilder();
        C69664n.m101060f(xVar, "newBuilder()");
        C34012ab a = C69664n.m101061g(xVar, "builder");
        a.mo39186b(bVar.f38390c);
        C34013ac acVar = (C34013ac) C34014ad.f90663f.createBuilder();
        C69664n.m101060f(acVar, "newBuilder()");
        C34016af a2 = C69664n.m101061g(acVar, "builder");
        C34083cs csVar = (C34083cs) C34084ct.f90814b.createBuilder();
        C69664n.m101060f(csVar, "newBuilder()");
        C34086cv a3 = C69664n.m101061g(csVar, "builder");
        a3.mo39211b();
        a2.mo39190c(a3.mo39210a());
        a.mo39187c(a2.mo39188a());
        C34117z a4 = a.mo39185a();
        C70868g gVar = bVar.f38391d;
        if (gVar == null) {
            C69664n.m101065k("clientObserver");
            gVar = null;
        }
        gVar.mo20123c(a4);
        this.f37276a = bVar;
    }

    /* renamed from: b */
    public final void mo19963b() {
        C11950b bVar = this.f37276a;
        if (bVar == null) {
            C69664n.m101065k("triggeringClient");
            bVar = null;
        }
        bVar.mo20324a();
    }

    /* renamed from: c */
    public final void mo19964c() {
    }
}
