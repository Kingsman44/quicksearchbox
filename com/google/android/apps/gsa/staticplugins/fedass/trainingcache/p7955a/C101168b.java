package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.p7955a;

import com.google.android.apps.gsa.p6482q.p6483a.C84235h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3917i.p3918a.C51540lm;
import com.google.assistant.p3897e.p3917i.p3918a.C51541ln;
import com.google.assistant.p3897e.p3917i.p3918a.C51544lq;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.C66624cv;
import com.google.speech.p5208h.C66629d;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.p5228m.C67308bl;
import com.google.speech.p5228m.C67310bn;
import com.google.speech.p5228m.C67311bo;
import com.google.speech.p5228m.C67312bp;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67441aj;
import com.google.speech.recognizer.p5233a.C67442ak;
import java.util.Iterator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.a.b */
/* compiled from: PG */
public final /* synthetic */ class C101168b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101173g f282418a;

    /* renamed from: b */
    public final /* synthetic */ C66611ci f282419b;

    public /* synthetic */ C101168b(C101173g gVar, C66611ci ciVar) {
        this.f282418a = gVar;
        this.f282419b = ciVar;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        Optional optional2;
        Optional optional3;
        Object obj2;
        Object obj3;
        C67438ag agVar;
        C67438ag agVar2;
        Object obj4;
        C62971cq cqVar;
        C101173g gVar = this.f282418a;
        C66611ci ciVar = this.f282419b;
        if (!((Boolean) obj).booleanValue()) {
            return C118826c.f331423b;
        }
        C60870cx cxVar = C118826c.f331423b;
        C62940bt r2 = C62942bv.checkIsLite(C66629d.f181275b);
        ciVar.mo58887l(r2);
        if (ciVar.f169962ag.mo58857o(r2.f169971d)) {
            C62940bt r22 = C62942bv.checkIsLite(C66629d.f181275b);
            ciVar.mo58887l(r22);
            Object l = ciVar.f169962ag.mo58854l(r22.f169971d);
            if (l == null) {
                obj4 = r22.f169969b;
            } else {
                obj4 = r22.mo58889c(l);
            }
            C51195j jVar = (C51195j) obj4;
            if ((jVar.f133266a & 128) != 0) {
                C52081en enVar = jVar.f133275j;
                if (enVar == null) {
                    enVar = C52081en.f136679i;
                }
                C52091ex exVar = enVar.f136685e;
                if (exVar == null) {
                    exVar = C52091ex.f136710b;
                }
                cqVar = exVar.f136712a;
            } else {
                C52091ex exVar2 = jVar.f133273h;
                if (exVar2 == null) {
                    exVar2 = C52091ex.f136710b;
                }
                cqVar = exVar2.f136712a;
            }
            Iterator it = cqVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    optional = Optional.empty();
                    break;
                }
                C52232kc kcVar = (C52232kc) it.next();
                if ("asst.response.logging.params".equals(kcVar.f137065b)) {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    if ("assistant.api.params.ResponseLoggingParams".equals(kaVar.f137060b)) {
                        try {
                            C52230ka kaVar2 = kcVar.f137066c;
                            if (kaVar2 == null) {
                                kaVar2 = C52230ka.f137057d;
                            }
                            C51544lq lqVar = (C51544lq) C62942bv.parseFrom((C62942bv) C51544lq.f134342j, kaVar2.f137061c);
                            if ((lqVar.f134344a & 2) != 0) {
                                C51541ln lnVar = lqVar.f134345b;
                                if (lnVar == null) {
                                    lnVar = C51541ln.f134330c;
                                }
                                optional = Optional.m71637of(lnVar);
                            } else {
                                optional = Optional.empty();
                            }
                        } catch (C62974ct e) {
                            ((C59052c) ((C59052c) ((C59052c) C101173g.f282424a.mo56225c()).mo56382g(e)).mo56372aa(19861)).mo56386p("ConversationProto could not be parsed");
                            optional = Optional.empty();
                        }
                    }
                }
            }
        } else {
            optional = Optional.empty();
        }
        boolean z = false;
        if (optional.isPresent()) {
            C84235h hVar = (C84235h) gVar.f282425b.mo27525b();
            C67308bl blVar = (C67308bl) C67310bn.f182956c.createBuilder();
            int a = C51540lm.m86213a(((C51541ln) optional.get()).f134333b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 0) {
                blVar.copyOnWrite();
                C67310bn bnVar = (C67310bn) blVar.instance;
                bnVar.f182959b = 0;
                bnVar.f182958a |= 1;
            } else if (i != 1) {
                blVar.copyOnWrite();
                C67310bn bnVar2 = (C67310bn) blVar.instance;
                bnVar2.f182959b = 2;
                bnVar2.f182958a |= 1;
            } else {
                blVar.copyOnWrite();
                C67310bn bnVar3 = (C67310bn) blVar.instance;
                bnVar3.f182959b = 1;
                bnVar3.f182958a |= 1;
            }
            cxVar = C60922j.m93044g(hVar.mo77721k(1004, ((C67310bn) blVar.build()).toByteArray()), C101169c.f282420a, C60826bg.f164896a);
        }
        C62940bt r23 = C62942bv.checkIsLite(C67238p.f182737f);
        ciVar.mo58887l(r23);
        if (!ciVar.f169962ag.mo58857o(r23.f169971d)) {
            optional2 = Optional.empty();
        } else {
            C62940bt r24 = C62942bv.checkIsLite(C67238p.f182737f);
            ciVar.mo58887l(r24);
            Object l2 = ciVar.f169962ag.mo58854l(r24.f169971d);
            if (l2 == null) {
                obj3 = r24.f169969b;
            } else {
                obj3 = r24.mo58889c(l2);
            }
            C67238p pVar = (C67238p) obj3;
            if (pVar.f182740b == 1) {
                agVar = (C67438ag) pVar.f182741c;
            } else {
                agVar = C67438ag.f183256k;
            }
            if ((agVar.f183258a & 16) != 0) {
                if (pVar.f182740b == 1) {
                    agVar2 = (C67438ag) pVar.f182741c;
                } else {
                    agVar2 = C67438ag.f183256k;
                }
                C67442ak akVar = agVar2.f183263f;
                if (akVar == null) {
                    akVar = C67442ak.f183276i;
                }
                optional2 = Optional.m71637of(akVar);
            } else {
                optional2 = Optional.empty();
            }
        }
        if (optional2.isPresent()) {
            C84235h hVar2 = (C84235h) gVar.f282425b.mo27525b();
            C67442ak akVar2 = (C67442ak) optional2.get();
            C67311bo boVar = (C67311bo) C67312bp.f182960e.createBuilder();
            if ((akVar2.f183278a & 8) != 0) {
                z = true;
            }
            boVar.copyOnWrite();
            C67312bp bpVar = (C67312bp) boVar.instance;
            bpVar.f182962a |= 1;
            bpVar.f182963b = z;
            if ((akVar2.f183278a & 8) != 0) {
                C67441aj ajVar = akVar2.f183282e;
                if (ajVar == null) {
                    ajVar = C67441aj.f183270b;
                }
                int i2 = ajVar.f183272a;
                boVar.copyOnWrite();
                C67312bp bpVar2 = (C67312bp) boVar.instance;
                bpVar2.f182962a = 2 | bpVar2.f182962a;
                bpVar2.f182964c = i2;
            }
            int size = akVar2.f183281d.size();
            boVar.copyOnWrite();
            C67312bp bpVar3 = (C67312bp) boVar.instance;
            bpVar3.f182962a |= 4;
            bpVar3.f182965d = size;
            cxVar = C60922j.m93044g(hVar2.mo77721k(1011, ((C67312bp) boVar.build()).toByteArray()), C101170d.f282421a, C60826bg.f164896a);
        }
        C62940bt r25 = C62942bv.checkIsLite(C66624cv.f181248e);
        ciVar.mo58887l(r25);
        if (!ciVar.f169962ag.mo58857o(r25.f169971d)) {
            optional3 = Optional.empty();
        } else {
            C62940bt r26 = C62942bv.checkIsLite(C66624cv.f181248e);
            ciVar.mo58887l(r26);
            Object l3 = ciVar.f169962ag.mo58854l(r26.f169971d);
            if (l3 == null) {
                obj2 = r26.f169969b;
            } else {
                obj2 = r26.mo58889c(l3);
            }
            C66624cv cvVar = (C66624cv) obj2;
            if ((cvVar.f181250a & 1) != 0) {
                optional3 = Optional.m71637of(Boolean.valueOf(cvVar.f181251b));
            } else {
                optional3 = Optional.empty();
            }
        }
        if (!optional3.isPresent() || ((Boolean) optional3.get()).booleanValue()) {
            return cxVar;
        }
        return C60922j.m93044g(((C84235h) gVar.f282425b.mo27525b()).mo77720j(1015), C101171e.f282422a, C60826bg.f164896a);
    }
}
