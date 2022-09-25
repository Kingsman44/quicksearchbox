package com.google.android.apps.search.assistant.libraries.p8966e.p8969c;

import com.google.android.libraries.assistant.p1363c.p1394f.C17275a;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.assistant.p2585i.C33481e;
import com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36110b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.p3922a.C51656n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.speech.p5208h.C66608cf;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5224k.p5225a.C67236n;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67432aa;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67439ah;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67467o;
import com.google.speech.recognizer.p5233a.C67468p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.libraries.performer.opahandover.OpaHandoverPerformer$performHandover$1", mo61344c = "OpaHandoverPerformer.kt", mo61345d = "invokeSuspend", mo61346e = {106})
/* renamed from: com.google.android.apps.search.assistant.libraries.e.c.h */
/* compiled from: PG */
final class C119351h extends C69572j implements C69630p {

    /* renamed from: a */
    int f332762a;

    /* renamed from: b */
    final /* synthetic */ C36110b f332763b;

    /* renamed from: c */
    final /* synthetic */ C119354k f332764c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119351h(C36110b bVar, C119354k kVar, C69577g gVar) {
        super(2, gVar);
        this.f332763b = bVar;
        this.f332764c = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119351h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        String str;
        Object obj2;
        C52076ei eiVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f332762a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            if (this.f332763b.f94445b.size() == 0) {
                C52070ec c = C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "No ConversationDelta to handover");
                C69664n.m101060f(c, "error(\n          Status.…ta to handover\"\n        )");
                return c;
            }
            C17275a a = this.f332764c.f332774f.mo23266a(C39191a.m68622a(this.f332763b.f94444a));
            C62971cq<C52081en> cqVar = this.f332763b.f94445b;
            C69664n.m101060f(cqVar, "args.conversationDeltaList");
            ArrayList<C52083ep> arrayList = new ArrayList<>();
            for (C52081en enVar : cqVar) {
                C62971cq cqVar2 = enVar.f136684d;
                C69664n.m101060f(cqVar2, "it.interactionDeltaList");
                C69540x.m100811r(arrayList, cqVar2);
            }
            ArrayList arrayList2 = new ArrayList(C69540x.m100804k(arrayList, 10));
            for (C52083ep epVar : arrayList) {
                if (epVar.f136692b == 4) {
                    eiVar = (C52076ei) epVar.f136693c;
                } else {
                    eiVar = C52076ei.f136664f;
                }
                C51809dy dyVar = eiVar.f136668c;
                if (dyVar == null) {
                    dyVar = C51809dy.f135933f;
                }
                arrayList2.add(dyVar);
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (C69664n.m101066l(((C51809dy) obj2).f135936b, "ui.HIGHLIGHT_USER_QUERY")) {
                    break;
                }
            }
            C51809dy dyVar2 = (C51809dy) obj2;
            if (dyVar2 != null) {
                try {
                    C51807dw dwVar = dyVar2.f135938d;
                    if (dwVar == null) {
                        dwVar = C51807dw.f135930b;
                    }
                    C62971cq cqVar3 = dwVar.f135932a;
                    C69664n.m101060f(cqVar3, "clientOp.args.argList");
                    C33480d dVar = C119354k.f332772d;
                    C69664n.m101060f(dVar, "HIGHLIGHT_USER_QUERY_KEY");
                    C51656n nVar = (C51656n) C33481e.m62059b(cqVar3, dVar);
                    if (nVar != null) {
                        str = nVar.f134600b;
                    }
                } catch (C62974ct e) {
                    C59052c cVar = (C59052c) ((C59052c) C119354k.f332769a.mo56226d()).mo56382g(e);
                    cVar.mo56379ah(new C59094n(34387));
                    cVar.mo56386p("Failed to parse the user query");
                }
            }
            if (str != null) {
                C67236n nVar2 = (C67236n) C67238p.f182736e.createBuilder();
                C67432aa aaVar = (C67432aa) C67438ag.f183256k.createBuilder();
                aaVar.copyOnWrite();
                C67438ag agVar = (C67438ag) aaVar.instance;
                agVar.f183259b = 1;
                agVar.f183258a |= 1;
                C67439ah ahVar = (C67439ah) C67442ak.f183276i.createBuilder();
                C67467o oVar = (C67467o) C67468p.f183364g.createBuilder();
                oVar.copyOnWrite();
                C67468p pVar = (C67468p) oVar.instance;
                pVar.f183366a |= 1;
                pVar.f183367b = str;
                ahVar.copyOnWrite();
                C67442ak akVar = (C67442ak) ahVar.instance;
                C67468p pVar2 = (C67468p) oVar.build();
                pVar2.getClass();
                akVar.mo59870a();
                akVar.f183281d.add(pVar2);
                aaVar.copyOnWrite();
                C67438ag agVar2 = (C67438ag) aaVar.instance;
                C67442ak akVar2 = (C67442ak) ahVar.build();
                akVar2.getClass();
                agVar2.f183263f = akVar2;
                agVar2.f183258a |= 16;
                nVar2.copyOnWrite();
                C67238p pVar3 = (C67238p) nVar2.instance;
                C67438ag agVar3 = (C67438ag) aaVar.build();
                agVar3.getClass();
                pVar3.f182741c = agVar3;
                pVar3.f182740b = 1;
                C62942bv build = nVar2.build();
                C69664n.m101060f(build, "newBuilder()\n          .…     )\n          .build()");
                C66608cf cfVar = (C66608cf) C66611ci.f181206g.createBuilder();
                cfVar.mo58885m(C67238p.f182737f, (C67238p) build);
                C62942bv build2 = cfVar.build();
                C69664n.m101060f(build2, "newBuilder().setExtensio…izerEvent, event).build()");
                a.mo23264e((C66611ci) build2);
            }
            C62971cq<C52081en> cqVar4 = this.f332763b.f94445b;
            C69664n.m101060f(cqVar4, "args.conversationDeltaList");
            for (C52081en b : cqVar4) {
                a.mo23261b(b);
            }
            a.mo23262c();
            C119354k kVar = this.f332764c;
            C69664n.m101060f(a, "handoverSession");
            this.f332762a = 1;
            obj = kVar.mo104301c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C119351h(this.f332763b, this.f332764c, gVar);
    }
}
