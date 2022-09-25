package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.impl;

import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128065an;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128066ao;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128071at;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128120u;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128124y;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9759d.p9760a.C128844a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9759d.p9760a.C128848e;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.impl.C128973i;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.suggestions.impl.b */
/* compiled from: PG */
final class C128966b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C51992gr f354361a;

    /* renamed from: b */
    final /* synthetic */ C128970f f354362b;

    /* renamed from: c */
    final /* synthetic */ C128968d f354363c;

    public C128966b(C51992gr grVar, C128970f fVar, C128968d dVar) {
        this.f354361a = grVar;
        this.f354362b = fVar;
        this.f354363c = dVar;
    }

    public final void onClick(View view) {
        C60870cx cxVar;
        if ((this.f354361a.f136447a & 4) != 0) {
            this.f354362b.f354375d.mo108811c(this.f354363c.f354368c);
        }
        C128973i f = this.f354362b.f354374c.mo17754z();
        C51992gr grVar = this.f354361a;
        C69664n.m101061g(grVar, "suggestion");
        C46439e eVar = f.f354385c;
        C128848e eVar2 = f.f354392j;
        if (eVar2.f354150b.isEmpty()) {
            ((C59052c) ((C59052c) C128848e.f354149a.mo56226d()).mo56372aa(38038)).mo56386p("Missing VoicePlateClassicServiceFutureStub");
            cxVar = C60856cj.m92898g();
        } else {
            C128124y yVar = (C128124y) C128071at.f352396c.createBuilder();
            C128065an anVar = (C128065an) C128066ao.f352380e.createBuilder();
            e eVar3 = e.K;
            anVar.copyOnWrite();
            C128066ao aoVar = (C128066ao) anVar.instance;
            aoVar.f352385d = eVar3.ca;
            aoVar.f352382a |= 16;
            anVar.copyOnWrite();
            C128066ao aoVar2 = (C128066ao) anVar.instance;
            grVar.getClass();
            aoVar2.f352384c = grVar;
            aoVar2.f352383b = 5;
            C128066ao aoVar3 = (C128066ao) anVar.build();
            yVar.copyOnWrite();
            C128071at atVar = (C128071at) yVar.instance;
            aoVar3.getClass();
            atVar.f352399b = aoVar3;
            atVar.f352398a = 2;
            cxVar = C60922j.m93044g(((C128120u) eVar2.f354150b.get()).mo108342c((C128071at) yVar.build()), C47810es.m84963c(C128844a.f354145a), C60826bg.f164896a);
        }
        eVar.mo50445g(C46438d.m82810b(cxVar), new C46436b("onSuggestionClick"), C128973i.C128974a.f354394a);
    }
}
