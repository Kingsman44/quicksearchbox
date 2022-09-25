package com.google.android.libraries.search.p3055n.p3078f.p3080b;

import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37404bi;
import com.google.android.libraries.search.p2904c.C37406bk;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.C37409bn;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37419bx;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c.C37767j;
import com.google.android.libraries.search.p3055n.p3087j.C39800b;
import com.google.android.libraries.search.p3055n.p3087j.C39803c;
import com.google.android.libraries.search.p3055n.p3087j.C39804d;
import com.google.android.libraries.search.p3055n.p3087j.C39806f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5218j.C66950fm;

/* renamed from: com.google.android.libraries.search.n.f.b.f */
/* compiled from: PG */
public final /* synthetic */ class C39703f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39711n f104479a;

    /* renamed from: b */
    public final /* synthetic */ C66950fm f104480b;

    public /* synthetic */ C39703f(C39711n nVar, C66950fm fmVar) {
        this.f104479a = nVar;
        this.f104480b = fmVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C39711n nVar = this.f104479a;
        C66950fm fmVar = this.f104480b;
        Void voidR = (Void) obj;
        C60870cx cxVar2 = C60866ct.f164955a;
        if (fmVar.f181994b.size() > 0 && nVar.f104500i.f181994b.size() == 0) {
            C39806f fVar = nVar.f104499h;
            C39709l lVar = new C39709l(nVar);
            if (fVar.f104684d.mo56113h()) {
                ((C59052c) ((C59052c) C39806f.f104681a.mo56226d()).mo56372aa(53863)).mo56386p("#openMic already opened");
                cxVar = C60866ct.f164955a;
            } else {
                ((C59052c) ((C59052c) C39806f.f104681a.mo56224b()).mo56372aa(53862)).mo56386p("#openMic opening microphone");
                C37419bx bxVar = fVar.f104682b;
                C37406bk bkVar = (C37406bk) C37407bl.f99325c.createBuilder();
                C37705a aVar = (C37705a) C37773c.f100243c.createBuilder();
                C37767j jVar = C37767j.f100200a;
                aVar.copyOnWrite();
                C37773c cVar = (C37773c) aVar.instance;
                jVar.getClass();
                cVar.f100246b = jVar;
                cVar.f100245a = 26;
                bkVar.copyOnWrite();
                C37407bl blVar = (C37407bl) bkVar.instance;
                C37773c cVar2 = (C37773c) aVar.build();
                cVar2.getClass();
                blVar.f99328b = cVar2;
                blVar.f99327a |= 1;
                C37404bi a = bxVar.mo40942a((C37407bl) bkVar.build());
                a.mo40939e().mo4106b(C39800b.f104660a, fVar.f104683c);
                C37409bn bnVar = (C37409bn) C37410bo.f99330k.createBuilder();
                C37357av avVar = (C37357av) C37360ay.f99224l.createBuilder();
                avVar.copyOnWrite();
                C37360ay ayVar = (C37360ay) avVar.instance;
                ayVar.f99226a |= 512;
                ayVar.f99236k = true;
                bnVar.copyOnWrite();
                C37410bo boVar = (C37410bo) bnVar.instance;
                C37360ay ayVar2 = (C37360ay) avVar.build();
                ayVar2.getClass();
                boVar.f99337f = ayVar2;
                boVar.f99332a |= 1;
                C37402bg a2 = a.mo40935a((C37410bo) bnVar.build());
                cxVar = C60922j.m93044g(C60922j.m93045h(a2.mo20357d(), C47810es.m84966f(new C39803c(fVar, lVar)), fVar.f104683c), C47810es.m84963c(new C39804d(fVar, a2)), fVar.f104683c);
            }
            cxVar2 = C60922j.m93045h(cxVar, C47810es.m84966f(new C39700c(nVar)), nVar.f104494c);
        } else if (nVar.f104500i.f181994b.size() > 0 && fmVar.f181994b.size() == 0) {
            cxVar2 = C60922j.m93045h(nVar.f104499h.mo42019a(), C47810es.m84966f(new C39699b(nVar)), nVar.f104494c);
        }
        nVar.f104500i = fmVar;
        return C60922j.m93045h(cxVar2, C47810es.m84966f(new C39702e(nVar, fmVar)), nVar.f104494c);
    }
}
