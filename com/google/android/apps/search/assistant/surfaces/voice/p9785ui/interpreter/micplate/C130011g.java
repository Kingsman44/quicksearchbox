package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.micplate;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.interaction.InterpreterInteractionController;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129915ax;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129926ba;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129928bc;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129939bn;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129940bo;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129942bq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62911as;
import com.google.protobuf.C62912at;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.micplate.g */
/* compiled from: PG */
final class C130011g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C130019o f356535a;

    public C130011g(C130019o oVar) {
        this.f356535a = oVar;
    }

    public final void onClick(View view) {
        C130019o oVar = this.f356535a;
        oVar.f356550h.mo108811c(oVar.mo109415g());
        C59052c cVar = (C59052c) C130019o.f356543a.mo56224b();
        cVar.mo56379ah(new C59094n(38603));
        cVar.mo56386p("On autoMicButton Click");
        C130019o oVar2 = this.f356535a;
        InterpreterInteractionController interpreterInteractionController = oVar2.f356549g;
        String str = oVar2.f356555m;
        String str2 = null;
        if (str == null) {
            C69664n.m101065k("sourceLocale");
            str = null;
        }
        String str3 = this.f356535a.f356556n;
        if (str3 == null) {
            C69664n.m101065k("targetLocale");
        } else {
            str2 = str3;
        }
        interpreterInteractionController.mo109387i(str, str2);
        C129939bn bnVar = (C129939bn) C129940bo.f356407c.createBuilder();
        C69664n.m101060f(bnVar, "newBuilder()");
        C129942bq a = C69664n.m101061g(bnVar, "builder");
        C129915ax axVar = (C129915ax) C129926ba.f356387c.createBuilder();
        C69664n.m101060f(axVar, "newBuilder()");
        C129928bc a2 = C69664n.m101061g(axVar, "builder");
        C62911as asVar = (C62911as) C62912at.f169862a.createBuilder();
        C69664n.m101060f(asVar, "newBuilder()");
        C62912at a3 = C69664n.m101061g(asVar, "builder").mo58809a();
        C69664n.m101061g(a3, "value");
        C129915ax axVar2 = a2.f356391a;
        axVar2.copyOnWrite();
        C129926ba baVar = (C129926ba) axVar2.instance;
        a3.getClass();
        baVar.f356390b = a3;
        baVar.f356389a = 2;
        a.mo109350c(a2.mo109343a());
        this.f356535a.mo109418j(a.mo109348a());
    }
}
