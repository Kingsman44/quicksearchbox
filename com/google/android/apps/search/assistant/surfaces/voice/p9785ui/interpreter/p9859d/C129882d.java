package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9859d;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.interaction.InterpreterInteractionController;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129918b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129931bf;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129932bg;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129934bi;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129939bn;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129940bo;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129942bq;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.d.d */
/* compiled from: PG */
final class C129882d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C129885g f356306a;

    public C129882d(C129885g gVar) {
        this.f356306a = gVar;
    }

    public final void onClick(View view) {
        C129885g gVar = this.f356306a;
        C129939bn bnVar = (C129939bn) C129940bo.f356407c.createBuilder();
        C69664n.m101060f(bnVar, "newBuilder()");
        C129942bq a = C69664n.m101061g(bnVar, "builder");
        C129931bf bfVar = (C129931bf) C129932bg.f356393b.createBuilder();
        C69664n.m101060f(bfVar, "newBuilder()");
        C129934bi a2 = C69664n.m101061g(bfVar, "builder");
        a2.mo109347b(C129918b.MODE_AUTO);
        a.mo109351d(a2.mo109346a());
        gVar.mo109323f(a.mo109348a());
        this.f356306a.f356311c.mo109388j();
        C129885g gVar2 = this.f356306a;
        InterpreterInteractionController interpreterInteractionController = gVar2.f356311c;
        String str = gVar2.f356315g;
        String str2 = null;
        if (str == null) {
            C69664n.m101065k("sourceLocale");
            str = null;
        }
        String str3 = this.f356306a.f356316h;
        if (str3 == null) {
            C69664n.m101065k("targetLocale");
        } else {
            str2 = str3;
        }
        interpreterInteractionController.mo109387i(str, str2);
        C129885g gVar3 = this.f356306a;
        gVar3.f356313e.mo108811c(gVar3.mo109320c());
    }
}
