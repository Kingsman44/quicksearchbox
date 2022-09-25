package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C66966gb;
import com.google.speech.p5218j.C66967gc;
import com.google.speech.p5218j.C66976gl;
import com.google.speech.p5218j.C66977gm;
import com.google.speech.p5218j.C66980gp;
import com.google.speech.p5218j.C66981gq;
import com.google.speech.p5218j.C66984gt;
import com.google.speech.p5218j.C66985gu;
import com.google.speech.p5218j.C66998hg;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.C67129mc;
import com.google.speech.p5218j.C67131me;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.n.c.a.h.ae */
/* compiled from: PG */
public final /* synthetic */ class C39540ae implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f104104a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f104105b;

    /* renamed from: c */
    public final /* synthetic */ C39538ac f104106c;

    public /* synthetic */ C39540ae(C60870cx cxVar, C60870cx cxVar2, C39538ac acVar) {
        this.f104104a = cxVar;
        this.f104105b = cxVar2;
        this.f104106c = acVar;
    }

    public final Object call() {
        C60870cx cxVar = this.f104104a;
        C60870cx cxVar2 = this.f104105b;
        C39538ac acVar = this.f104106c;
        C66998hg f = C19245ah.m36698f(BuildConfig.FLAVOR, (String) C60856cj.m92909r(cxVar), (String) C60856cj.m92909r(cxVar2));
        f.copyOnWrite();
        C66999hh hhVar = (C66999hh) f.instance;
        C66999hh hhVar2 = C66999hh.f182127p;
        hhVar.f182132d = null;
        hhVar.f182129a &= -5;
        C66985gu guVar = ((C66999hh) f.instance).f182131c;
        if (guVar == null) {
            guVar = C66985gu.f182075h;
        }
        C66984gt gtVar = (C66984gt) guVar.toBuilder();
        C66985gu guVar2 = ((C66999hh) f.instance).f182131c;
        if (guVar2 == null) {
            guVar2 = C66985gu.f182075h;
        }
        C66980gp gpVar = (C66980gp) ((C66981gq) guVar2.f182079c.get(0)).toBuilder();
        if (acVar.mo41891b().mo56113h()) {
            C63088z A = C63088z.m96139A((byte[]) acVar.mo41891b().mo56107c());
            gpVar.copyOnWrite();
            C66981gq gqVar = (C66981gq) gpVar.instance;
            gqVar.f182067b = 2;
            gqVar.f182068c = A;
        } else {
            C59104x d = C39542ag.f104109a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SodaCoreConfigProv");
            ((C59052c) ((C59052c) d).mo56372aa(53722)).mo56386p("No Hotword model provided!");
        }
        C67129mc mcVar = (C67129mc) C67131me.f182477b.createBuilder();
        if (!acVar.mo41892c().mo56113h() || !((SpeakerIdModel) acVar.mo41892c().mo56107c()).f253284b.mo56113h()) {
            C59104x d2 = C39542ag.f104109a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "SodaCoreConfigProv");
            ((C59052c) ((C59052c) d2).mo56372aa(53723)).mo56386p("No Speaker id model provided!");
        } else {
            SpeakerIdModel speakerIdModel = (SpeakerIdModel) acVar.mo41892c().mo56107c();
            mcVar.mo59772a(C58837ba.m90858g(speakerIdModel.f253283a), C63088z.m96139A((byte[]) speakerIdModel.f253284b.mo56107c()));
        }
        C67131me meVar = (C67131me) mcVar.build();
        gpVar.copyOnWrite();
        C66981gq gqVar2 = (C66981gq) gpVar.instance;
        meVar.getClass();
        gqVar2.f182070e = meVar;
        gqVar2.f182066a |= 32;
        gtVar.mo59758c(gpVar);
        if (acVar.mo41890a() > 0) {
            C66967gc gcVar = ((C66999hh) f.instance).f182133e;
            if (gcVar == null) {
                gcVar = C66967gc.f182031c;
            }
            C66966gb gbVar = (C66966gb) gcVar.toBuilder();
            C66967gc gcVar2 = ((C66999hh) f.instance).f182133e;
            if (gcVar2 == null) {
                gcVar2 = C66967gc.f182031c;
            }
            C66977gm gmVar = gcVar2.f182034b;
            if (gmVar == null) {
                gmVar = C66977gm.f182052c;
            }
            C66976gl glVar = (C66976gl) gmVar.toBuilder();
            int a = acVar.mo41890a();
            glVar.copyOnWrite();
            C66977gm gmVar2 = (C66977gm) glVar.instance;
            gmVar2.f182054a |= 1;
            gmVar2.f182055b = (float) a;
            gbVar.copyOnWrite();
            C66967gc gcVar3 = (C66967gc) gbVar.instance;
            C66977gm gmVar3 = (C66977gm) glVar.build();
            gmVar3.getClass();
            gcVar3.f182034b = gmVar3;
            gcVar3.f182033a |= 1;
            f.copyOnWrite();
            C66999hh hhVar3 = (C66999hh) f.instance;
            C66967gc gcVar4 = (C66967gc) gbVar.build();
            gcVar4.getClass();
            hhVar3.f182133e = gcVar4;
            hhVar3.f182129a |= 16;
        }
        f.copyOnWrite();
        C66999hh hhVar4 = (C66999hh) f.instance;
        C66985gu guVar3 = (C66985gu) gtVar.build();
        guVar3.getClass();
        hhVar4.f182131c = guVar3;
        hhVar4.f182129a |= 2;
        return (C66999hh) f.build();
    }
}
