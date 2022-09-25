package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137921ag;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137922ah;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137923ai;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137929ao;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10465a.C138545a;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138578c;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.protobuf.C62912at;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.au */
/* compiled from: PG */
final class C138569au implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C138558am f376896a;

    public C138569au(C138558am amVar) {
        this.f376896a = amVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C138558am amVar = this.f376896a;
        C138030av avVar = ((C138578c) bVar).f376908a;
        C138545a aVar = amVar.f376854A;
        C69664n.m101061g(avVar, "suggestion");
        aVar.f376827f.mo50381d(avVar, C62912at.f169862a);
        C46439e eVar = amVar.f376865f;
        C137929ao aoVar = (C137929ao) amVar.f376864e;
        eVar.mo50445g(C46438d.m82810b(C47638k.m84752c((List) Collection.EL.stream(aoVar.f375261c).map(new C137921ag(avVar)).collect(Collectors.toCollection(C137922ah.f375253a))).mo51520a(C47810es.m84978r(new C137923ai(aoVar)), aoVar.f375262d)), C46436b.m82808a(avVar), amVar.f376856C);
        return C47392e.f123115a;
    }
}
