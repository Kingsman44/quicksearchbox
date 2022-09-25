package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9866h;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129904am;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129910as;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129912au;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129939bn;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129940bo;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129942bq;
import com.google.protobuf.C62911as;
import com.google.protobuf.C62912at;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.h.d */
/* compiled from: PG */
final class C129991d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C129993f f356502a;

    public C129991d(C129993f fVar) {
        this.f356502a = fVar;
    }

    public final void onClick(View view) {
        C129993f fVar = this.f356502a;
        C129939bn bnVar = (C129939bn) C129940bo.f356407c.createBuilder();
        C69664n.m101060f(bnVar, "newBuilder()");
        C129942bq a = C69664n.m101061g(bnVar, "builder");
        C129904am amVar = (C129904am) C129910as.f356356c.createBuilder();
        C69664n.m101060f(amVar, "newBuilder()");
        C129912au a2 = C69664n.m101061g(amVar, "builder");
        C62911as asVar = (C62911as) C62912at.f169862a.createBuilder();
        C69664n.m101060f(asVar, "newBuilder()");
        C62912at a3 = C69664n.m101061g(asVar, "builder").mo58809a();
        C69664n.m101061g(a3, "value");
        C129904am amVar2 = a2.f356360a;
        amVar2.copyOnWrite();
        C129910as asVar2 = (C129910as) amVar2.instance;
        a3.getClass();
        asVar2.f356359b = a3;
        asVar2.f356358a = 2;
        a.mo109349b(a2.mo109339a());
        fVar.mo109380h(a.mo109348a());
    }
}
