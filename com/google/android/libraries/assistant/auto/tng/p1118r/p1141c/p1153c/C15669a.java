package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.conversation.p1855h.C22719w;
import com.google.assistant.p3897e.p3908d.p3909a.C51174e;
import com.google.assistant.p3897e.p3908d.p3909a.C51175f;
import com.google.assistant.p3897e.p3908d.p3909a.C51178i;
import com.google.assistant.p3897e.p3908d.p3909a.C51180k;
import com.google.assistant.p3897e.p3908d.p3909a.C51181l;
import com.google.assistant.p3897e.p3908d.p3909a.C51182m;
import com.google.assistant.p3897e.p3908d.p3909a.C51183n;
import com.google.assistant.p3897e.p3917i.p3918a.C51271bn;
import com.google.assistant.p3897e.p3917i.p3918a.C51274bq;
import com.google.assistant.p3897e.p3917i.p3918a.C51537lj;
import com.google.assistant.p3897e.p3917i.p3918a.C51544lq;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52075eh;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.aor;
import com.google.assistant.p3897e.p3921j.aos;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63088z;
import com.google.protos.p4850an.C63352aw;
import com.google.protos.p4850an.C63353ax;
import com.google.protos.p4850an.C63586e;
import com.google.protos.p4850an.C63595f;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.c.a */
/* compiled from: PG */
public final class C15669a {

    /* renamed from: a */
    private static final C58974d f46789a = C58974d.m91134h("AssistantResponseUtil");

    /* renamed from: a */
    public static C51809dy m32462a(String str) {
        C67187ae aeVar = (C67187ae) C67190ah.f182619q.createBuilder();
        aeVar.copyOnWrite();
        C67190ah ahVar = (C67190ah) aeVar.instance;
        str.getClass();
        ahVar.f182622a |= 1;
        ahVar.f182625d = str;
        aor aor = (aor) aos.f135519e.createBuilder();
        aor.copyOnWrite();
        aos aos = (aos) aor.instance;
        str.getClass();
        aos.f135521a |= 1;
        aos.f135522b = str;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "speech.s3.TtsServiceRequest";
        C63088z byteString = ((C67190ah) aeVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        aor.copyOnWrite();
        aos aos2 = (aos) aor.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        aos2.f135523c = kaVar3;
        aos2.f135521a |= 2;
        C63088z byteString2 = ((aos) aor.build()).toByteString();
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = "tts.OUTPUT";
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "speech_output_args";
        C52228jz jzVar2 = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar2.copyOnWrite();
        C52230ka kaVar4 = (C52230ka) jzVar2.instance;
        kaVar4.f137059a |= 1;
        kaVar4.f137060b = "assistant.api.client_op.SpeechOutputArgs";
        jzVar2.copyOnWrite();
        C52230ka kaVar5 = (C52230ka) jzVar2.instance;
        byteString2.getClass();
        kaVar5.f137059a |= 2;
        kaVar5.f137061c = byteString2;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar6 = (C52230ka) jzVar2.build();
        kaVar6.getClass();
        kcVar2.f137066c = kaVar6;
        kcVar2.f137064a |= 2;
        dvVar.mo53732b(kbVar);
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        C51807dw dwVar = (C51807dw) dvVar.build();
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        return (C51809dy) dxVar.build();
    }

    /* renamed from: b */
    public static C52081en m32463b(List list, List list2) {
        C52090ew ewVar;
        ((C58970a) ((C58970a) f46789a.mo56224b()).mo56372aa(46247)).mo56386p("#createConversationDeltaFromClientOpsWithVeIds");
        C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
        if (list != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                C51809dy dyVar = (C51809dy) it.next();
                C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
                int i2 = i + 1;
                eoVar.copyOnWrite();
                C52083ep epVar = (C52083ep) eoVar.instance;
                epVar.f136691a |= 1;
                epVar.f136694d = i;
                C52075eh ehVar = (C52075eh) C52076ei.f136664f.createBuilder();
                ehVar.copyOnWrite();
                C52076ei eiVar = (C52076ei) ehVar.instance;
                dyVar.getClass();
                eiVar.f136668c = dyVar;
                eiVar.f136666a |= 32;
                eoVar.copyOnWrite();
                C52083ep epVar2 = (C52083ep) eoVar.instance;
                C52076ei eiVar2 = (C52076ei) ehVar.build();
                eiVar2.getClass();
                epVar2.f136693c = eiVar2;
                epVar2.f136692b = 4;
                elVar.mo53785b(eoVar);
                i = i2;
            }
            int size = list.size();
            if (size > 1) {
                C51182m mVar = (C51182m) C51183n.f133226e.createBuilder();
                C51174e eVar = (C51174e) C51175f.f133205f.createBuilder();
                eVar.copyOnWrite();
                C51175f fVar = (C51175f) eVar.instance;
                fVar.f133207a |= 1;
                fVar.f133208b = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    eVar.mo53531b(i3);
                }
                mVar.mo53548c(eVar);
                C51178i iVar = (C51178i) C51181l.f133221d.createBuilder();
                C51180k kVar = C51180k.START_BBS;
                iVar.copyOnWrite();
                C51181l lVar = (C51181l) iVar.instance;
                lVar.f133224b = kVar.f133220f;
                lVar.f133223a |= 1;
                iVar.mo53543b(0);
                mVar.mo53550e(iVar);
                C51178i iVar2 = (C51178i) C51181l.f133221d.createBuilder();
                C51180k kVar2 = C51180k.JOIN_BBS;
                iVar2.copyOnWrite();
                C51181l lVar2 = (C51181l) iVar2.instance;
                lVar2.f133224b = kVar2.f133220f;
                lVar2.f133223a |= 1;
                iVar2.mo53543b(0);
                mVar.mo53550e(iVar2);
                C51178i iVar3 = (C51178i) C51181l.f133221d.createBuilder();
                C51180k kVar3 = C51180k.FINISH;
                iVar3.copyOnWrite();
                C51181l lVar3 = (C51181l) iVar3.instance;
                lVar3.f133224b = kVar3.f133220f;
                lVar3.f133223a |= 1;
                mVar.mo53550e(iVar3);
                C22719w wVar = new C22719w();
                C51271bn bnVar = (C51271bn) C51274bq.f133487i.createBuilder();
                bnVar.copyOnWrite();
                C51274bq bqVar = (C51274bq) bnVar.instance;
                C51183n nVar = (C51183n) mVar.build();
                nVar.getClass();
                bqVar.f133495g = nVar;
                bqVar.f133489a |= 32;
                wVar.mo27878e(bnVar.build());
                C52091ex a = wVar.mo27874a();
                elVar.copyOnWrite();
                C52081en enVar = (C52081en) elVar.instance;
                a.getClass();
                enVar.f136685e = a;
                enVar.f136681a |= 16;
            }
        }
        ((C58970a) ((C58970a) f46789a.mo56224b()).mo56372aa(46248)).mo56386p("#addVeIds");
        C51537lj ljVar = (C51537lj) C51544lq.f134342j.createBuilder();
        ljVar.copyOnWrite();
        C51544lq lqVar = (C51544lq) ljVar.instance;
        C62961ch chVar = lqVar.f134347d;
        if (!chVar.mo58948c()) {
            lqVar.f134347d = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll((Iterable) list2, (List) lqVar.f134347d);
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.ResponseLoggingParams";
        C63088z byteString = ((C51544lq) ljVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a = 1 | kcVar.f137064a;
        kcVar.f137065b = "asst.response.logging.params";
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        C52232kc kcVar3 = (C52232kc) kbVar.build();
        C52081en enVar2 = (C52081en) elVar.instance;
        if ((enVar2.f136681a & 16) != 0) {
            C52091ex exVar = enVar2.f136685e;
            if (exVar == null) {
                exVar = C52091ex.f136710b;
            }
            ewVar = (C52090ew) exVar.toBuilder();
        } else {
            ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
        }
        ewVar.mo53792e(kcVar3);
        C52091ex exVar2 = (C52091ex) ewVar.build();
        elVar.copyOnWrite();
        C52081en enVar3 = (C52081en) elVar.instance;
        exVar2.getClass();
        enVar3.f136685e = exVar2;
        enVar3.f136681a |= 16;
        return (C52081en) elVar.build();
    }

    /* renamed from: c */
    public static Object m32464c(C63595f fVar, C62917ay ayVar) {
        if (fVar.f172016b.size() <= 0) {
            return null;
        }
        C63353ax axVar = ((C63586e) fVar.f172016b.get(0)).f171997a;
        if (axVar == null) {
            axVar = C63353ax.f171199b;
        }
        if (axVar.f171201a.size() <= 0) {
            return null;
        }
        C63352aw awVar = (C63352aw) axVar.f171201a.get(0);
        C62940bt r0 = C62942bv.checkIsLite(ayVar);
        awVar.mo58887l(r0);
        if (!awVar.f169962ag.mo58857o(r0.f169971d)) {
            return null;
        }
        C62940bt r3 = C62942bv.checkIsLite(ayVar);
        awVar.mo58887l(r3);
        Object l = awVar.f169962ag.mo58854l(r3.f169971d);
        if (l == null) {
            return r3.f169969b;
        }
        return r3.mo58889c(l);
    }

    /* renamed from: d */
    public static String m32465d(String str) {
        return str.replace(BuildConfig.FLAVOR, " ").trim();
    }
}
