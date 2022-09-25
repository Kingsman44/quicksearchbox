package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b.C129715d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.C129836c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.C129848o;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.CanvasWebAppFragmentPeer;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import com.google.assistant.p3897e.p3921j.p3926e.C51854bo;
import com.google.common.base.C58827ar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65507aa;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65538v;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65539w;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65542z;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.t */
/* compiled from: PG */
public final /* synthetic */ class C129800t implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C128548e f356140a;

    public /* synthetic */ C129800t(C128548e eVar) {
        this.f356140a = eVar;
    }

    public final void accept(Object obj) {
        C51854bo boVar;
        C128548e eVar = this.f356140a;
        C59071e eVar2 = C129739aa.f356023a;
        CanvasWebAppFragmentPeer a = ((C129836c) obj).mo17754z();
        C129715d dVar = (C129715d) eVar.f353476a;
        if (dVar.f355959a == 2) {
            boVar = (C51854bo) dVar.f355960b;
        } else {
            boVar = C51854bo.f136022e;
        }
        if (!a.f356157k.mo109220b()) {
            ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56226d()).mo56372aa(38492)).mo56386p("Received Continuous Match result when not in Continuous Match Mode.");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        new C58827ar(", ").mo56099f(sb, Collection.EL.stream(boVar.f136025b).map(C129848o.f356245a).iterator());
        sb.append("]");
        String sb2 = sb.toString();
        boolean z = boVar.f136026c;
        C65542z zVar = (C65542z) C65507aa.f178066c.createBuilder();
        C65538v vVar = (C65538v) C65539w.f178119c.createBuilder();
        vVar.copyOnWrite();
        ((C65539w) vVar.instance).f178121a = sb2;
        vVar.copyOnWrite();
        ((C65539w) vVar.instance).f178122b = z;
        zVar.copyOnWrite();
        C65507aa aaVar = (C65507aa) zVar.instance;
        C65539w wVar = (C65539w) vVar.build();
        wVar.getClass();
        aaVar.f178069b = wVar;
        aaVar.f178068a = 7;
        a.mo109271f((C65507aa) zVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
