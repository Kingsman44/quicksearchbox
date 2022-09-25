package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b.p779b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p774a.p775a.C12226a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15653e;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15654f;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15657i;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15661m;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import com.google.protos.p4850an.p4851a.p4852a.C63324h;
import com.google.protos.p4985f.p5030q.C65195fb;
import com.google.protos.p4985f.p5030q.C65196fc;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.Iterator;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.b.ae */
/* compiled from: PG */
public final class C12242ae extends C68247h {

    /* renamed from: a */
    private final C68283d f38987a;

    /* renamed from: c */
    private final C68283d f38988c;

    /* renamed from: d */
    private final C68283d f38989d;

    public C12242ae(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C12242ae.class), aVar);
        this.f38987a = C68236af.m98549d(dVar);
        this.f38988c = C68236af.m98549d(dVar2);
        this.f38989d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C52081en enVar = (C52081en) list.get(1);
        C58833ax axVar2 = (C58833ax) list.get(2);
        C15661m f = C15666r.m32453f();
        if (axVar.mo56113h()) {
            ((C15654f) f).f46776b = new C15657i((String) axVar.mo56107c());
        }
        C52091ex exVar = enVar.f136685e;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        C63010eb parserForType = C51715bm.f135662t.getParserForType();
        Iterator it = exVar.f136712a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = C58836b.f156633a;
                break;
            }
            C52232kc kcVar = (C52232kc) it.next();
            if (kcVar.f137065b.equals("asst.device.capabilities")) {
                try {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    obj2 = C58833ax.m90834k((MessageLite) parserForType.mo59008g(kaVar.f137061c));
                } catch (C62974ct e) {
                    ((C59052c) ((C59052c) ((C59052c) C12272y.f39047a.mo56225c()).mo56382g(e)).mo56372aa(44153)).mo56389s("Couldn't parse ProtobufMapEntry bytes for %s.", "asst.device.capabilities");
                }
            }
        }
        C15654f fVar = (C15654f) f;
        fVar.f46778d = C60856cj.m92900i(obj2);
        if (axVar2.mo56113h()) {
            C65195fb a = C65195fb.m96585a(((C65196fc) axVar2.mo56107c()).f176458d);
            if (a == null) {
                a = C65195fb.UNRECOGNIZED;
            }
            if (a == C65195fb.NO_FULFILLER) {
                C59052c cVar = (C59052c) ((C59052c) C12272y.f39047a.mo56224b()).mo56372aa(44152);
                C63324h hVar = ((C65196fc) axVar2.mo56107c()).f176460f;
                if (hVar == null) {
                    hVar = C63324h.f171148d;
                }
                C61752n nVar = hVar.f171151b;
                if (nVar == null) {
                    nVar = C61752n.f166808f;
                }
                cVar.mo56389s("Generating OfflineFulfillmentRequest with IntentQuery [%s]", nVar.f166811b);
                C63324h hVar2 = ((C65196fc) axVar2.mo56107c()).f176460f;
                if (hVar2 == null) {
                    hVar2 = C63324h.f171148d;
                }
                C61752n nVar2 = hVar2.f171151b;
                if (nVar2 == null) {
                    nVar2 = C61752n.f166808f;
                }
                fVar.f46775a = C15653e.m32433b(nVar2);
                return C60856cj.m92900i(f.mo22474a());
            }
        }
        throw new C12226a("No intent query for portable fulfiller.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f38987a.mo60297gq(), this.f38988c.mo60297gq(), this.f38989d.mo60297gq());
    }
}
