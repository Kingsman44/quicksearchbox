package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127113e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127114f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127116h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129565ag;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129660g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129678l;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9857b.C129860c;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.n */
/* compiled from: PG */
final class C130023n implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C129868c f356562a;

    public C130023n(C129868c cVar) {
        this.f356562a = cVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C129860c.C129861a aVar = (C129860c.C129861a) bVar;
        C129868c cVar = this.f356562a;
        C46439e eVar = cVar.f356279f;
        C127118j jVar = cVar.f356281h;
        C127113e eVar2 = (C127113e) C127114f.f350009c.createBuilder();
        C69664n.m101060f(eVar2, "newBuilder()");
        C127116h a = C69664n.m101061g(eVar2, "builder");
        a.mo107939b(C127050h.EXIT_INTERPRETER_MODE);
        eVar.mo50428h(C46438d.m82810b(jVar.mo107932h(a.mo107938a())).f121541a, (Object) null, cVar.f356285l);
        C127118j jVar2 = cVar.f356281h;
        C127454b bVar2 = C127454b.CLIENT_INPUT;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "ui.TAP_EXIT_LANG_TRANSLATOR";
        C62942bv build = dsVar.build();
        C69664n.m101060f(build, "newBuilder().setClientIn…(EXIT_TRANSLATOR).build()");
        eVar.mo50428h(C46438d.m82810b(jVar2.mo107931g(C127407d.m208361a(bVar2, (C51805du) build))).f121541a, (Object) null, cVar.f356286m);
        C129566ah ahVar = cVar.f356276c;
        C129660g gVar = (C129660g) C129676j.f355890c.createBuilder();
        C69664n.m101060f(gVar, "newBuilder()");
        C129678l a2 = C69664n.m101061g(gVar, "builder");
        a2.mo109191c(C129662i.RESPONSE);
        C129565ag.m211551a(ahVar, a2.mo109189a());
        return C47392e.f123115a;
    }
}
