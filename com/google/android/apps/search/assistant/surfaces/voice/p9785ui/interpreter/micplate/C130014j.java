package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.micplate;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129904am;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129905an;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129906ao;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129910as;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129912au;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129914aw;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129939bn;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129940bo;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129942bq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.micplate.j */
/* compiled from: PG */
final class C130014j implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C130019o f356538a;

    public C130014j(C130019o oVar) {
        this.f356538a = oVar;
    }

    public final void onClick(View view) {
        C130019o oVar = this.f356538a;
        oVar.f356550h.mo108811c(oVar.mo109413e());
        C59052c cVar = (C59052c) C130019o.f356543a.mo56224b();
        cVar.mo56379ah(new C59094n(38606));
        cVar.mo56386p("On sourceKeyboardMicButton Click");
        C130019o oVar2 = this.f356538a;
        C129939bn bnVar = (C129939bn) C129940bo.f356407c.createBuilder();
        C69664n.m101060f(bnVar, "newBuilder()");
        C129942bq a = C69664n.m101061g(bnVar, "builder");
        C129904am amVar = (C129904am) C129910as.f356356c.createBuilder();
        C69664n.m101060f(amVar, "newBuilder()");
        C129912au a2 = C69664n.m101061g(amVar, "builder");
        C129905an anVar = (C129905an) C129906ao.f356351b.createBuilder();
        C69664n.m101060f(anVar, "newBuilder()");
        C129914aw a3 = C69664n.m101061g(anVar, "builder");
        C129905an anVar2 = a3.f356361a;
        anVar2.copyOnWrite();
        ((C129906ao) anVar2.instance).f356353a = true;
        a2.mo109340b(a3.mo109341a());
        a.mo109349b(a2.mo109339a());
        oVar2.mo109418j(a.mo109348a());
    }
}
