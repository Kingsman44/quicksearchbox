package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9866h;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.interaction.InterpreterInteractionController;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129904am;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129907ap;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129908aq;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129910as;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129912au;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129939bn;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129940bo;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129942bq;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.h.e */
/* compiled from: PG */
final class C129992e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C129993f f356503a;

    public C129992e(C129993f fVar) {
        this.f356503a = fVar;
    }

    public final void onClick(View view) {
        C129939bn bnVar = (C129939bn) C129940bo.f356407c.createBuilder();
        C69664n.m101060f(bnVar, "newBuilder()");
        C129942bq a = C69664n.m101061g(bnVar, "builder");
        C129904am amVar = (C129904am) C129910as.f356356c.createBuilder();
        C69664n.m101060f(amVar, "newBuilder()");
        C129912au a2 = C69664n.m101061g(amVar, "builder");
        C129907ap apVar = (C129907ap) C129908aq.f356354a.createBuilder();
        C69664n.m101060f(apVar, "newBuilder()");
        C69664n.m101061g(apVar, "builder");
        C62942bv build = apVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C129908aq aqVar = (C129908aq) build;
        C69664n.m101061g(aqVar, "value");
        C129904am amVar2 = a2.f356360a;
        amVar2.copyOnWrite();
        C129910as asVar = (C129910as) amVar2.instance;
        aqVar.getClass();
        asVar.f356359b = aqVar;
        asVar.f356358a = 3;
        a.mo109349b(a2.mo109339a());
        C129940bo a3 = a.mo109348a();
        C129993f fVar = this.f356503a;
        InterpreterInteractionController interpreterInteractionController = fVar.f356507d;
        String obj = fVar.mo109375c().getText().toString();
        String str = this.f356503a.f356511h;
        if (str == null) {
            C69664n.m101065k("locale");
            str = null;
        }
        interpreterInteractionController.mo109385g(obj, str);
        this.f356503a.mo109380h(a3);
    }
}
