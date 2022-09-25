package com.google.android.apps.gsa.staticplugins.p7714cv.p7723g;

import com.google.android.apps.gsa.shared.speech.C90603k;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.speech.p7294j.C92435e;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7724h.C98783j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66582bh;
import com.google.speech.p5208h.C66584bj;
import com.google.speech.p5224k.p5225a.C67186ad;
import com.google.speech.p5230n.p5232b.C67400ap;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.g.o */
/* compiled from: PG */
public final class C98768o implements C98769p {

    /* renamed from: a */
    private static final C59071e f275905a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.g.o");

    /* renamed from: b */
    private final C92435e f275906b;

    /* renamed from: c */
    private C63088z f275907c;

    /* renamed from: d */
    private C67400ap f275908d;

    public C98768o(C92435e eVar) {
        this.f275906b = eVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo91292a(C90603k kVar) {
        C63088z zVar;
        C67400ap apVar;
        C98783j jVar = (C98783j) kVar;
        C66584bj bjVar = jVar.f275934a;
        C67186ad adVar = jVar.f275935b;
        C66582bh bhVar = jVar.f275936d;
        C67400ap apVar2 = null;
        if (bjVar != null) {
            if ((bjVar.f181118a & 2) != 0 && (apVar2 = bjVar.f181119b) == null) {
                apVar2 = C67400ap.f183187c;
            }
            this.f275908d = apVar2;
            if (apVar2 == null) {
                C59104x d = f275905a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PronLearningRespPrcsr");
                ((C59052c) ((C59052c) d).mo56372aa(31108)).mo56386p("The sentence inside v2Pronunciations is null which should not happen!");
                int i = C90755l.f253831a;
            }
            C63088z zVar2 = C63088z.f170246b;
            this.f275907c = zVar2;
            C92435e eVar = this.f275906b;
            C67400ap apVar3 = this.f275908d;
            apVar3.getClass();
            eVar.mo87112r(zVar2, apVar3);
        } else if (bhVar != null) {
            if ((bhVar.f181112a & 1) != 0 && (apVar2 = bhVar.f181113b) == null) {
                apVar2 = C67400ap.f183187c;
            }
            this.f275908d = apVar2;
            if (apVar2 == null) {
                C59104x d2 = f275905a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "PronLearningRespPrcsr");
                ((C59052c) ((C59052c) d2).mo56372aa(31107)).mo56386p("The sentence inside ttsSentence is null which should not happen!");
                int i2 = C90755l.f253831a;
            }
        } else if (adVar != null) {
            C63088z zVar3 = this.f275907c;
            if (zVar3 == null) {
                zVar3 = C63088z.f170246b;
                this.f275907c = zVar3;
            }
            C58976aa aaVar = C58975e.f156826a;
            zVar3.mo59031d();
            if (!adVar.f182615c || (zVar = this.f275907c) == null || zVar.mo59031d() <= 0 || (apVar = this.f275908d) == null) {
                C63088z zVar4 = this.f275907c;
                zVar4.getClass();
                this.f275907c = zVar4.mo59177x(adVar.f182614b);
                return;
            }
            this.f275906b.mo87112r(zVar, apVar);
        }
    }
}
