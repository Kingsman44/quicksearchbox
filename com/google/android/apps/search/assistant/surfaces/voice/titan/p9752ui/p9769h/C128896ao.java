package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128054ac;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128071at;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128120u;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128124y;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9759d.p9760a.C128847d;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9759d.p9760a.C128848e;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h.C128893am;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.ao */
/* compiled from: PG */
final class C128896ao implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C128893am f354235a;

    public C128896ao(C128893am amVar) {
        this.f354235a = amVar;
    }

    public final void onClick(View view) {
        C60870cx cxVar;
        C128893am amVar = this.f354235a;
        C69664n.m101061g(view, "view");
        amVar.f354230h.mo108811c(view);
        C46439e eVar = amVar.f354227e;
        C128848e eVar2 = amVar.f354233k;
        if (eVar2.f354150b.isEmpty()) {
            ((C59052c) ((C59052c) C128848e.f354149a.mo56226d()).mo56372aa(38039)).mo56386p("Missing VoicePlateClassicServiceFutureStub");
            cxVar = C60856cj.m92898g();
        } else {
            C128124y yVar = (C128124y) C128071at.f352396c.createBuilder();
            C128054ac acVar = C128054ac.f352359a;
            yVar.copyOnWrite();
            C128071at atVar = (C128071at) yVar.instance;
            acVar.getClass();
            atVar.f352399b = acVar;
            atVar.f352398a = 4;
            C60870cx c = ((C128120u) eVar2.f354150b.get()).mo108342c((C128071at) yVar.build());
            C128847d dVar = C128847d.f354148a;
            cxVar = C60922j.m93044g(c, C47810es.m84963c(dVar), C60826bg.f164896a);
        }
        C46438d b = C46438d.m82810b(cxVar);
        eVar.mo50428h(b.f121541a, (Object) null, C128893am.C128894a.f354234a);
    }
}
