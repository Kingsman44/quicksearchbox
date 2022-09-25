package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.assistant.p3814ai.p3815a.p3816a.C49167a;
import com.google.assistant.p3814ai.p3815a.p3816a.C49168b;
import com.google.assistant.p3814ai.p3815a.p3816a.C49171e;
import com.google.assistant.p3814ai.p3815a.p3816a.C49172f;
import com.google.assistant.p3814ai.p3815a.p3816a.C49173g;
import com.google.assistant.p3814ai.p3815a.p3816a.C49175i;
import com.google.assistant.p3814ai.p3815a.p3816a.C49176j;
import com.google.assistant.p3814ai.p3815a.p3816a.C49177k;
import com.google.assistant.p3814ai.p3815a.p3816a.C49178l;
import com.google.assistant.p3814ai.p3815a.p3816a.C49179m;
import com.google.assistant.p3814ai.p3815a.p3816a.C49180n;
import com.google.assistant.p3814ai.p3815a.p3816a.C49181o;
import com.google.assistant.p3814ai.p3815a.p3816a.C49184r;
import com.google.assistant.p3814ai.p3815a.p3816a.C49185s;
import com.google.common.p4522b.C58485gu;
import com.google.p386ak.C8396l;
import com.google.p386ak.C8397m;
import com.google.p386ak.C8398n;
import com.google.p386ak.C8401q;
import com.google.p386ak.C8404t;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.n */
/* compiled from: PG */
public final class C106058n implements C8397m {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17159a(C8398n nVar, Type type) {
        nVar.getClass();
        type.getClass();
        C49171e eVar = (C49171e) C49172f.f127147c.createBuilder();
        C8401q g = nVar.mo17161g();
        if (g.f29255a.containsKey("intentConfig") && (g.mo17166a("intentConfig") instanceof C8401q)) {
            C8401q g2 = g.mo17166a("intentConfig").mo17161g();
            C49173g gVar = (C49173g) C49175i.f127151d.createBuilder();
            if (g2.f29255a.containsKey("intentId") && (g2.mo17166a("intentId") instanceof C8404t) && (g2.mo17166a("intentId").mo17162h().f29256a instanceof String)) {
                String d = g2.mo17166a("intentId").mo17154d();
                gVar.copyOnWrite();
                d.getClass();
                ((C49175i) gVar.instance).f127155c = d;
            }
            if (g2.f29255a.containsKey("numberIntentConfig") && (g2.mo17166a("numberIntentConfig") instanceof C8401q)) {
                C8401q g3 = g2.mo17166a("numberIntentConfig").mo17161g();
                C49176j jVar = (C49176j) C49177k.f127156b.createBuilder();
                if (g3.f29255a.containsKey("triggerWords")) {
                    Iterable iterable = (Iterable) C106057m.m176671a(g3.mo17166a("triggerWords")).orElse(C58485gu.m89845m());
                    jVar.copyOnWrite();
                    C49177k kVar = (C49177k) jVar.instance;
                    C62971cq cqVar = kVar.f127158a;
                    if (!cqVar.mo58948c()) {
                        kVar.f127158a = C62942bv.mutableCopy(cqVar);
                    }
                    C62947c.addAll(iterable, (List) kVar.f127158a);
                }
                C49177k kVar2 = (C49177k) jVar.build();
                gVar.copyOnWrite();
                C49175i iVar = (C49175i) gVar.instance;
                kVar2.getClass();
                iVar.f127154b = kVar2;
                iVar.f127153a = 2;
            } else if (g2.f29255a.containsKey("confirmationIntentConfig") && (g2.mo17166a("confirmationIntentConfig") instanceof C8401q)) {
                C8401q g4 = g2.mo17166a("confirmationIntentConfig").mo17161g();
                C49167a aVar = (C49167a) C49168b.f127140b.createBuilder();
                if (g4.f29255a.containsKey("triggerWords")) {
                    Iterable iterable2 = (Iterable) C106057m.m176671a(g4.mo17166a("triggerWords")).orElse(C58485gu.m89845m());
                    aVar.copyOnWrite();
                    C49168b bVar = (C49168b) aVar.instance;
                    C62971cq cqVar2 = bVar.f127142a;
                    if (!cqVar2.mo58948c()) {
                        bVar.f127142a = C62942bv.mutableCopy(cqVar2);
                    }
                    C62947c.addAll(iterable2, (List) bVar.f127142a);
                }
                C49168b bVar2 = (C49168b) aVar.build();
                gVar.copyOnWrite();
                C49175i iVar2 = (C49175i) gVar.instance;
                bVar2.getClass();
                iVar2.f127154b = bVar2;
                iVar2.f127153a = 3;
            } else if (g2.f29255a.containsKey("textIntentConfig") && (g2.mo17166a("textIntentConfig") instanceof C8401q)) {
                C8401q g5 = g2.mo17166a("textIntentConfig").mo17161g();
                C49184r rVar = (C49184r) C49185s.f127170b.createBuilder();
                if (g5.f29255a.containsKey("triggerWords")) {
                    Iterable iterable3 = (Iterable) C106057m.m176671a(g5.mo17166a("triggerWords")).orElse(C58485gu.m89845m());
                    rVar.copyOnWrite();
                    C49185s sVar = (C49185s) rVar.instance;
                    C62971cq cqVar3 = sVar.f127172a;
                    if (!cqVar3.mo58948c()) {
                        sVar.f127172a = C62942bv.mutableCopy(cqVar3);
                    }
                    C62947c.addAll(iterable3, (List) sVar.f127172a);
                }
                C49185s sVar2 = (C49185s) rVar.build();
                gVar.copyOnWrite();
                C49175i iVar3 = (C49175i) gVar.instance;
                sVar2.getClass();
                iVar3.f127154b = sVar2;
                iVar3.f127153a = 5;
            } else if (g2.f29255a.containsKey("optionsIntentConfig") && (g2.mo17166a("optionsIntentConfig") instanceof C8401q)) {
                C8401q g6 = g2.mo17166a("optionsIntentConfig").mo17161g();
                C49180n nVar2 = (C49180n) C49181o.f127163c.createBuilder();
                if (g6.f29255a.containsKey("triggerWords")) {
                    Iterable iterable4 = (Iterable) C106057m.m176671a(g6.mo17166a("triggerWords")).orElse(C58485gu.m89845m());
                    nVar2.copyOnWrite();
                    C49181o oVar = (C49181o) nVar2.instance;
                    C62971cq cqVar4 = oVar.f127165a;
                    if (!cqVar4.mo58948c()) {
                        oVar.f127165a = C62942bv.mutableCopy(cqVar4);
                    }
                    C62947c.addAll(iterable4, (List) oVar.f127165a);
                }
                if (g6.f29255a.containsKey("options") && (g6.mo17166a("options") instanceof C8396l)) {
                    Iterator it = g6.mo17166a("options").mo17160f().iterator();
                    while (it.hasNext()) {
                        C8398n nVar3 = (C8398n) it.next();
                        if (nVar3 instanceof C8401q) {
                            C8401q g7 = nVar3.mo17161g();
                            C49178l lVar = (C49178l) C49179m.f127159c.createBuilder();
                            if (g7.f29255a.containsKey("key") && (g7.mo17166a("key") instanceof C8404t) && (g7.mo17166a("key").mo17162h().f29256a instanceof String)) {
                                String d2 = g7.mo17166a("key").mo17154d();
                                lVar.copyOnWrite();
                                d2.getClass();
                                ((C49179m) lVar.instance).f127161a = d2;
                            }
                            if (g7.f29255a.containsKey("synonyms")) {
                                Iterable iterable5 = (Iterable) C106057m.m176671a(g7.mo17166a("synonyms")).orElse(C58485gu.m89845m());
                                lVar.copyOnWrite();
                                C49179m mVar = (C49179m) lVar.instance;
                                C62971cq cqVar5 = mVar.f127162b;
                                if (!cqVar5.mo58948c()) {
                                    mVar.f127162b = C62942bv.mutableCopy(cqVar5);
                                }
                                C62947c.addAll(iterable5, (List) mVar.f127162b);
                            }
                            C49179m mVar2 = (C49179m) lVar.build();
                            nVar2.copyOnWrite();
                            C49181o oVar2 = (C49181o) nVar2.instance;
                            mVar2.getClass();
                            C62971cq cqVar6 = oVar2.f127166b;
                            if (!cqVar6.mo58948c()) {
                                oVar2.f127166b = C62942bv.mutableCopy(cqVar6);
                            }
                            oVar2.f127166b.add(mVar2);
                        }
                    }
                }
                C49181o oVar3 = (C49181o) nVar2.build();
                gVar.copyOnWrite();
                C49175i iVar4 = (C49175i) gVar.instance;
                oVar3.getClass();
                iVar4.f127154b = oVar3;
                iVar4.f127153a = 4;
            }
            C49175i iVar5 = (C49175i) gVar.build();
            eVar.copyOnWrite();
            iVar5.getClass();
            ((C49172f) eVar.instance).f127149a = iVar5;
        }
        if (g.f29255a.containsKey("isPrompted") && (g.mo17166a("isPrompted") instanceof C8404t) && (g.mo17166a("isPrompted").mo17162h().f29256a instanceof Boolean)) {
            boolean e = g.mo17166a("isPrompted").mo17155e();
            eVar.copyOnWrite();
            ((C49172f) eVar.instance).f127150b = e;
        }
        return (C49172f) eVar.build();
    }
}
