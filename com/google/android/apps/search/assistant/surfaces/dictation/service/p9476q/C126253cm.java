package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.nga.engine.dictation.h;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125034a;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125097by;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125141do;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125143dq;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125037c;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125038d;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125040f;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125045k;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125521a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125708c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125745j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125746k;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125747l;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125750o;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125751p;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.C125712a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.p9446a.C125721i;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.C125522a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125702i;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126336m;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9481b.C126319a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63070h;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.cm */
/* compiled from: PG */
public final /* synthetic */ class C126253cm implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C125097by f347877a;

    public /* synthetic */ C126253cm(C125097by byVar) {
        this.f347877a = byVar;
    }

    public final C60870cx apply(Object obj) {
        Throwable th;
        C60870cx cxVar;
        C125751p pVar;
        C60870cx cxVar2;
        C125097by byVar = this.f347877a;
        C126223bj bjVar = (C126223bj) obj;
        C47558bi a = C47831fm.m85006a("SD.OrationQueue.ProcessButtonPress");
        try {
            C63070h hVar = byVar.f345098a;
            if (hVar == null) {
                hVar = C63070h.f170215c;
            }
            C125044j a2 = C126336m.m206590a(hVar);
            if (bjVar.f347816p) {
                cxVar = C60866ct.f164955a;
            } else {
                bjVar.f347814n.set(C126220bg.PROCESSING_BUTTON);
                C125750o oVar = bjVar.f347812l;
                C63070h hVar2 = byVar.f345098a;
                if (hVar2 == null) {
                    hVar2 = C63070h.f170215c;
                }
                C125708c a3 = bjVar.mo107465a();
                C125712a aVar = oVar.f346556b;
                Optional c = C126336m.m206592c(hVar2);
                if (!((C125721i) aVar).f346507g) {
                    C59052c cVar = (C59052c) C125721i.f346501a.mo56224b();
                    cVar.mo56374ac(1, TimeUnit.MINUTES);
                    ((C59052c) cVar.mo56372aa(36605)).mo56386p("The emoji fulfiller is disabled. [SD]");
                    pVar = new C125751p(C125034a.TRIGGER_KEYBOARD, C58485gu.m89845m(), C125721i.f346502b);
                } else {
                    if (c.isPresent()) {
                        C125044j a4 = C125044j.m204969a(((C125045k) c.get()).f345014a);
                        if (a4 == null) {
                            a4 = C125044j.UNRECOGNIZED;
                        }
                        if (a4 == C125044j.EMOJI_SUGGESTION) {
                            C125040f fVar = ((C125045k) c.get()).f345015b;
                            if (fVar == null) {
                                fVar = C125040f.f344977e;
                            }
                            String str = fVar.f344979a;
                            C125040f fVar2 = ((C125045k) c.get()).f345015b;
                            if (fVar2 == null) {
                                fVar2 = C125040f.f344977e;
                            }
                            C125143dq dqVar = fVar2.f344982d;
                            if (dqVar == null) {
                                dqVar = C125143dq.f345221c;
                            }
                            C125141do doVar = dqVar.f345224b;
                            if (doVar == null) {
                                doVar = C125141do.f345217c;
                            }
                            String str2 = doVar.f345219a;
                            C51809dy c2 = C126319a.m206548c(str);
                            C58485gu m = C58485gu.m89845m();
                            h hVar3 = h.a;
                            C125040f fVar3 = ((C125045k) c.get()).f345015b;
                            if (fVar3 == null) {
                                fVar3 = C125040f.f344977e;
                            }
                            C58485gu o = C58485gu.m89847o(c2, C125721i.m205703a(str, str2, m, hVar3, true, fVar3.f344981c));
                            C125037c cVar2 = (C125037c) C125038d.f344972d.createBuilder();
                            C125040f fVar4 = ((C125045k) c.get()).f345015b;
                            if (fVar4 == null) {
                                fVar4 = C125040f.f344977e;
                            }
                            boolean z = fVar4.f344981c;
                            cVar2.copyOnWrite();
                            ((C125038d) cVar2.instance).f344975b = z;
                            cVar2.copyOnWrite();
                            ((C125038d) cVar2.instance).f344976c = true;
                            pVar = new C125751p(C125034a.TRIGGER_KEYBOARD, o, new C125521a((C125038d) cVar2.build()));
                        }
                    }
                    pVar = new C125751p(C125034a.TRIGGER_KEYBOARD, C58485gu.m89845m(), C125721i.f346502b);
                }
                if (!pVar.f346564b.isEmpty()) {
                    cxVar2 = C60856cj.m92900i(Optional.m71637of(pVar));
                } else {
                    C125522a aVar2 = oVar.f346558d;
                    Objects.requireNonNull(aVar2);
                    C125745j jVar = new C125745j(aVar2);
                    C125702i iVar = oVar.f346559e;
                    Objects.requireNonNull(iVar);
                    C60870cx b = oVar.mo107102b(hVar2, a3, jVar, new C125746k(iVar));
                    C125747l lVar = C125747l.f346550a;
                    cxVar2 = C60922j.m93045h(b, C47810es.m84966f(lVar), oVar.f346557c);
                }
                cxVar = C47633f.m84733g(cxVar2).mo51516i(new C126211ay(bjVar, a2), bjVar.f347811k).mo51515h(new C126212az(bjVar), bjVar.f347811k);
            }
            a.mo51417a(cxVar);
            a.close();
            return cxVar;
        } catch (Throwable th2) {
            C126251ck.m206437a(th, th2);
        }
        throw th;
    }
}
