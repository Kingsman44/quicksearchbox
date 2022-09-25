package com.google.android.apps.search.assistant.libraries.p8966e.p8969c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9023a.C119706b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9024b.C119707a;
import com.google.android.libraries.assistant.p1363c.p1394f.C17298b;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.assistant.p2585i.C33481e;
import com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36110b;
import com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36113e;
import com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36114f;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.alz;
import com.google.assistant.p3897e.p3921j.p3922a.C51656n;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.libraries.e.c.k */
/* compiled from: PG */
public final class C119354k implements C119908e {

    /* renamed from: a */
    public static final C59071e f332769a = C59071e.m91331h();

    /* renamed from: b */
    public static final C51785da f332770b;

    /* renamed from: c */
    public static final C33476a f332771c;

    /* renamed from: d */
    public static final C33480d f332772d = C33480d.m62053a("highlight_user_query_args", "assistant.api.client_op.ui.HighlightUserQueryArgs", C51656n.f134597e);

    /* renamed from: e */
    public final C51809dy f332773e;

    /* renamed from: f */
    public final C17298b f332774f;

    /* renamed from: g */
    public final C119706b f332775g;

    /* renamed from: h */
    public final C71422aw f332776h;

    static {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        C69664n.m101060f(czVar, "newBuilder()");
        alz a = C69664n.m101061g(czVar, "builder");
        a.mo53699b("apa.HANDOVER_TO_OPA");
        C51773cz czVar2 = a.f135357a;
        czVar2.copyOnWrite();
        C51785da daVar = (C51785da) czVar2.instance;
        daVar.f135877a |= 2;
        daVar.f135879c = 1;
        f332770b = a.mo53698a();
        C36113e eVar = (C36113e) C36114f.f94447b.createBuilder();
        C69664n.m101060f(eVar, "newBuilder()");
        f332771c = new C33476a("com.google.android.libraries.search.assistant.performer.opahandover.proto.ApaHandoverToOpaProperties", C69664n.m101061g(eVar, "builder").mo39971a());
    }

    public C119354k(C51809dy dyVar, C17298b bVar, C119706b bVar2, C71422aw awVar) {
        C69664n.m101061g(dyVar, "clientOp");
        C69664n.m101061g(bVar, "opaHandover");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f332773e = dyVar;
        this.f332774f = bVar;
        this.f332775g = bVar2;
        this.f332776h = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo104299a() {
        C69626l lVar;
        C51807dw dwVar = this.f332773e.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C62971cq cqVar = dwVar.f135932a;
        C69664n.m101060f(cqVar, "clientOp.args.argList");
        C33480d dVar = C119707a.f333524a;
        C69664n.m101060f(dVar, "ENDPOINT_ARG");
        MessageLite b = C33481e.m62059b(cqVar, dVar);
        C51809dy dyVar = this.f332773e;
        String str = C119344a.f332752a.f89601a;
        C63010eb parserForType = ((C36110b) C119344a.f332752a.f89602b.f89590a).getParserForType();
        if (b != null) {
            lVar = new C119345b(this);
        } else {
            lVar = new C119346c(this);
        }
        C60870cx a = C36183e.m64583a(dyVar, str, parserForType, new C119355l(lVar));
        C69664n.m101060f(a, "perform(\n      clientOp,…e ::performHandover\n    )");
        return a;
    }

    /* renamed from: b */
    public final void mo104300b() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104301c(com.google.android.libraries.assistant.p1363c.p1394f.C17275a r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.libraries.p8966e.p8969c.C119347d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.libraries.e.c.d r0 = (com.google.android.apps.search.assistant.libraries.p8966e.p8969c.C119347d) r0
            int r1 = r0.f332757d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f332757d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.libraries.e.c.d r0 = new com.google.android.apps.search.assistant.libraries.e.c.d
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f332755b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f332757d
            r3 = 1
            java.lang.String r4 = "newBuilder()"
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.f332754a
            p5462h.C69714l.m101134b(r8)
            goto L_0x006c
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.assistant.performer.h.a.j r8 = com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36118j.f94451d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.search.assistant.performer.h.a.i r8 = (com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36117i) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r4)
            com.google.android.libraries.search.assistant.performer.h.a.l r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            com.google.android.apps.search.assistant.libraries.e.c.e r2 = new com.google.android.apps.search.assistant.libraries.e.c.e
            r2.<init>(r7)
            kotlinx.coroutines.b.n r7 = com.google.android.libraries.search.assistant.p2511d.C32538am.m60349a(r2)
            com.google.android.apps.search.assistant.libraries.e.c.f r2 = new com.google.android.apps.search.assistant.libraries.e.c.f
            r5 = 0
            r2.<init>(r8, r5)
            kotlinx.coroutines.b.n r7 = kotlinx.coroutines.p5574b.C71536cm.m104384b(r7, r2)
            com.google.android.apps.search.assistant.libraries.e.c.g r2 = new com.google.android.apps.search.assistant.libraries.e.c.g
            r2.<init>(r8, r5)
            kotlinx.coroutines.b.n r7 = kotlinx.coroutines.p5574b.C71486aq.m104308b(r7, r2)
            r0.f332754a = r8
            r0.f332757d = r3
            java.lang.Object r7 = kotlinx.coroutines.p5574b.C71594u.m104514a(r7, r0)
            if (r7 == r1) goto L_0x00fa
            r7 = r8
        L_0x006c:
            com.google.android.libraries.search.assistant.performer.h.a.l r7 = (com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36120l) r7
            com.google.android.libraries.search.assistant.performer.h.a.j r7 = r7.mo39972a()
            com.google.assistant.e.j.ec r8 = com.google.assistant.p3897e.p3921j.C52070ec.f136651d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.dz r8 = (com.google.assistant.p3897e.p3921j.C51810dz) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r4)
            com.google.assistant.e.j.on r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            com.google.assistant.e.j.kg r0 = com.google.assistant.p3897e.p3921j.C52236kg.f137089d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.kd r0 = (com.google.assistant.p3897e.p3921j.C52233kd) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)
            com.google.assistant.e.j.afn r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.IGNORE
            r0.mo53687b(r1)
            com.google.assistant.e.j.kg r0 = r0.mo53686a()
            r8.mo53842b(r0)
            com.google.assistant.e.j.eb r0 = com.google.assistant.p3897e.p3921j.C52069eb.f136648b
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.ea r0 = (com.google.assistant.p3897e.p3921j.C52068ea) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)
            java.lang.String r1 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)
            com.google.protobuf.a.b r1 = new com.google.protobuf.a.b
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.eb r2 = (com.google.assistant.p3897e.p3921j.C52069eb) r2
            com.google.protobuf.cq r2 = r2.f136650a
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            java.lang.String r3 = "_builder.getResultList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            r1.<init>(r2)
            com.google.android.libraries.search.assistant.i.d r1 = com.google.android.apps.search.assistant.libraries.p8966e.p8969c.C119344a.f332753b
            com.google.assistant.e.j.kc r7 = r1.mo38881b(r7)
            java.lang.String r1 = "HANDOVER_TO_OPA_RESULT_K…fMapEntry(handoverResult)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r1)
            java.lang.String r1 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r1)
            r0.mo53780b(r7)
            com.google.protobuf.bv r7 = r0.build()
            java.lang.String r0 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)
            com.google.assistant.e.j.eb r7 = (com.google.assistant.p3897e.p3921j.C52069eb) r7
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r1)
            com.google.assistant.e.j.dz r0 = r8.f137397a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.assistant.e.j.ec r0 = (com.google.assistant.p3897e.p3921j.C52070ec) r0
            r7.getClass()
            r0.f136655c = r7
            int r7 = r0.f136653a
            r7 = r7 | 2
            r0.f136653a = r7
            com.google.assistant.e.j.ec r7 = r8.mo53841a()
            return r7
        L_0x00fa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.libraries.p8966e.p8969c.C119354k.mo104301c(com.google.android.libraries.assistant.c.f.a, h.c.g):java.lang.Object");
    }
}
