package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.util.lockednavigation.C129340a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129660g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129678l;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130055a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130092b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130094d;
import com.google.protobuf.C62940bt;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.t */
/* compiled from: PG */
final class C129498t implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C129484h f355533a;

    public C129498t(C129484h hVar) {
        this.f355533a = hVar;
    }

    public final void onClick(View view) {
        this.f355533a.f355509q.mo108811c(view);
        C129484h hVar = this.f355533a;
        hVar.mo109053b(C127050h.KEYBOARD_OPENED);
        C129340a aVar = hVar.f355512t;
        C129660g gVar = (C129660g) C129676j.f355890c.createBuilder();
        C69664n.m101060f(gVar, "newBuilder()");
        C129678l a = C69664n.m101061g(gVar, "builder");
        a.mo109191c(C129662i.KEYBOARD_INPUT);
        C62940bt btVar = C130092b.f356721e;
        C69664n.m101060f(btVar, "keyboardInputData");
        C130055a aVar2 = (C130055a) C130092b.f356720d.createBuilder();
        C69664n.m101060f(aVar2, "newBuilder()");
        C130094d a2 = C69664n.m101061g(aVar2, "builder");
        C129660g gVar2 = (C129660g) C129676j.f355890c.createBuilder();
        C69664n.m101060f(gVar2, "newBuilder()");
        C129678l a3 = C69664n.m101061g(gVar2, "builder");
        a3.mo109191c(C129662i.INPUT);
        a2.mo109486b(a3.mo109189a());
        a.mo109190b(btVar, a2.mo109485a());
        aVar.mo108978a(a.mo109189a());
    }
}
