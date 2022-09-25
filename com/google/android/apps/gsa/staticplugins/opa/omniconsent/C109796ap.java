package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109775g;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109776h;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109778j;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.C109826a;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.C109856c;
import com.google.assistant.p3861at.C50347ts;
import com.google.assistant.p3861at.C50358uc;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ap */
/* compiled from: PG */
final class C109796ap extends C83869ac {

    /* renamed from: a */
    final /* synthetic */ C109800at f305947a;

    public C109796ap(C109800at atVar) {
        this.f305947a = atVar;
    }

    /* renamed from: a */
    public final C83956t mo77207a() {
        C109775g gVar = (C109775g) C109776h.f305880h.createBuilder();
        C50347ts tsVar = ((C109811g) this.f305947a.f305949a).f306006b.f131084c;
        if (tsVar == null) {
            tsVar = C50347ts.f131027k;
        }
        gVar.copyOnWrite();
        C109776h hVar = (C109776h) gVar.instance;
        tsVar.getClass();
        hVar.f305887f = tsVar;
        hVar.f305882a |= 16;
        C109800at atVar = this.f305947a;
        C109778j b = atVar.mo98150b(((C109811g) atVar.f305949a).f306006b);
        gVar.copyOnWrite();
        C109776h hVar2 = (C109776h) gVar.instance;
        b.getClass();
        hVar2.f305883b = b;
        hVar2.f305882a |= 1;
        C50358uc ucVar = ((C109811g) this.f305947a.f305949a).f306006b.f131083b;
        if (ucVar == null) {
            ucVar = C50358uc.f131066m;
        }
        C63088z zVar = ucVar.f131071d;
        gVar.copyOnWrite();
        C109776h hVar3 = (C109776h) gVar.instance;
        zVar.getClass();
        hVar3.f305882a |= 2;
        hVar3.f305884c = zVar;
        int i = ((C109811g) this.f305947a.f305949a).f306015k;
        gVar.copyOnWrite();
        C109776h hVar4 = (C109776h) gVar.instance;
        hVar4.f305885d = i - 1;
        hVar4.f305882a |= 4;
        int i2 = ((C109811g) this.f305947a.f305949a).f306016l;
        gVar.copyOnWrite();
        C109776h hVar5 = (C109776h) gVar.instance;
        hVar5.f305886e = i2 - 1;
        hVar5.f305882a |= 8;
        C63088z zVar2 = ((C109811g) this.f305947a.f305949a).f306012h;
        gVar.copyOnWrite();
        C109776h hVar6 = (C109776h) gVar.instance;
        hVar6.f305882a |= 32;
        hVar6.f305888g = zVar2;
        return C83875ai.m133541f((C109856c) this.f305947a.f305953e.mo17428b(), C109826a.m182917a("udc_confirm_reject_args", ((C109776h) gVar.build()).toByteArray()), new C109795ao(this));
    }

    /* renamed from: b */
    public final boolean mo77208b() {
        C109800at atVar = this.f305947a;
        return !atVar.f305955g && !atVar.mo98151d() && ((C109811g) atVar.f305949a).f306011g;
    }
}
