package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.micplate;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.interaction.InterpreterInteractionController;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129915ax;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129916ay;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129917az;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129926ba;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129928bc;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129930be;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129939bn;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129940bo;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129942bq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.micplate.i */
/* compiled from: PG */
final class C130013i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C130019o f356537a;

    public C130013i(C130019o oVar) {
        this.f356537a = oVar;
    }

    public final void onClick(View view) {
        C130019o oVar = this.f356537a;
        oVar.f356550h.mo108811c(oVar.mo109417i());
        C59052c cVar = (C59052c) C130019o.f356543a.mo56224b();
        cVar.mo56379ah(new C59094n(38605));
        cVar.mo56386p("On targetManualMicButton Click");
        C130019o oVar2 = this.f356537a;
        InterpreterInteractionController interpreterInteractionController = oVar2.f356549g;
        String str = oVar2.f356556n;
        if (str == null) {
            C69664n.m101065k("targetLocale");
            str = null;
        }
        interpreterInteractionController.mo109386h(str);
        C130019o oVar3 = this.f356537a;
        C129939bn bnVar = (C129939bn) C129940bo.f356407c.createBuilder();
        C69664n.m101060f(bnVar, "newBuilder()");
        C129942bq a = C69664n.m101061g(bnVar, "builder");
        C129915ax axVar = (C129915ax) C129926ba.f356387c.createBuilder();
        C69664n.m101060f(axVar, "newBuilder()");
        C129928bc a2 = C69664n.m101061g(axVar, "builder");
        C129916ay ayVar = (C129916ay) C129917az.f356362b.createBuilder();
        C69664n.m101060f(ayVar, "newBuilder()");
        C129930be a3 = C69664n.m101061g(ayVar, "builder");
        C129916ay ayVar2 = a3.f356392a;
        ayVar2.copyOnWrite();
        ((C129917az) ayVar2.instance).f356364a = false;
        a2.mo109344b(a3.mo109345a());
        a.mo109350c(a2.mo109343a());
        oVar3.mo109418j(a.mo109348a());
    }
}
