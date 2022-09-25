package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b;

import com.google.android.apps.gsa.binaries.satin.app.apg;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9034c.C119767q;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119789ak;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119863dd;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9520a.C126933a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127368m;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9577f.p9580c.C127351j;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127358f;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d.C127921c;
import com.google.android.libraries.search.assistant.p2511d.C32561x;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32881e;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32904f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4580v.p4582b.C60943b;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p3186j$.time.Duration;
import p5462h.p5463a.C69496am;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.ac */
/* compiled from: PG */
public final class C126943ac implements C126933a {

    /* renamed from: a */
    public static final C59071e f349501a = C59071e.m91331h();

    /* renamed from: b */
    public static final Duration f349502b = C60943b.m93087c(5);

    /* renamed from: c */
    public final C126948ah f349503c;

    /* renamed from: d */
    public final C127358f f349504d;

    /* renamed from: e */
    public final C127921c f349505e;

    /* renamed from: f */
    public final C71788b f349506f = new C71799m();

    /* renamed from: g */
    public C126963p f349507g;

    /* renamed from: h */
    public C126964q f349508h;

    /* renamed from: i */
    private final Executor f349509i;

    /* renamed from: j */
    private final C126955h f349510j;

    /* renamed from: k */
    private final C32904f f349511k;

    /* renamed from: l */
    private final C126950c f349512l;

    /* renamed from: m */
    private final Set f349513m;

    /* renamed from: n */
    private final Set f349514n;

    /* renamed from: o */
    private final C127351j f349515o;

    /* renamed from: p */
    private final C71422aw f349516p;

    /* renamed from: q */
    private C32849cq f349517q;

    /* renamed from: r */
    private final C119767q f349518r;

    /* renamed from: s */
    private final apg f349519s;

    public C126943ac(Executor executor, C126955h hVar, C32904f fVar, C126948ah ahVar, C119767q qVar, C126950c cVar, Set set, Set set2, C127351j jVar, apg apg, C127358f fVar2, C71422aw awVar, C127921c cVar2) {
        C69664n.m101061g(executor, "sequentialExecutor");
        C69664n.m101061g(hVar, "callbacksFactory");
        C69664n.m101061g(fVar, "contextSource");
        C69664n.m101061g(ahVar, "interactionCancellationStore");
        C69664n.m101061g(qVar, "clientConnectionFactory");
        C69664n.m101061g(set, "genericContextSuppliers");
        C69664n.m101061g(set2, "speechBiasingContextProviders");
        C69664n.m101061g(jVar, "sessionTokenServiceStub");
        C69664n.m101061g(apg, "contextManagerFactory");
        C69664n.m101061g(fVar2, "interactionIdStore");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(cVar2, "fcfLogger");
        this.f349509i = executor;
        this.f349510j = hVar;
        this.f349511k = fVar;
        this.f349503c = ahVar;
        this.f349518r = qVar;
        this.f349512l = cVar;
        this.f349513m = set;
        this.f349514n = set2;
        this.f349515o = jVar;
        this.f349519s = apg;
        this.f349504d = fVar2;
        this.f349516p = awVar;
        this.f349505e = cVar2;
    }

    /* renamed from: f */
    private final C126964q m207642f(C126963p pVar, C119789ak akVar) {
        C126964q qVar = this.f349508h;
        if (qVar != null) {
            C59052c cVar = (C59052c) f349501a.mo56224b();
            cVar.mo56379ah(new C59094n(37323));
            cVar.mo56386p("Disconnecting old connection");
            qVar.f349611a.mo104501d();
        }
        C126962o a = this.f349510j.mo107872a(new C126967t(pVar));
        C59052c cVar2 = (C59052c) f349501a.mo56224b();
        C126965r rVar = new C126965r(akVar);
        C126966s sVar = new C126966s(akVar);
        cVar2.mo56379ah(new C59094n(37324));
        cVar2.mo56354G("Creating connection to APA with asr config=%s, fulfillment config=%s", rVar, sVar);
        C126964q qVar2 = new C126964q(this.f349518r.mo104511a(akVar, a, this.f349509i), akVar, a);
        this.f349508h = qVar2;
        return qVar2;
    }

    /* renamed from: a */
    public final C60870cx mo107856a(C119851cs csVar, C127289i iVar) {
        C69664n.m101061g(csVar, "interactionStartRequest");
        C69664n.m101061g(iVar, "queryContext");
        return C71663i.m104692e(this.f349516p, (C71424ay) null, new C126973z(this, iVar, csVar, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final C60870cx mo107857b(C119863dd ddVar, C127050h hVar, C119834cb cbVar) {
        C69664n.m101061g(ddVar, "interactionStopRequest");
        C69664n.m101061g(hVar, "cancellationReason");
        C69664n.m101061g(cbVar, "currentlyRunningInteractionId");
        return C32561x.m60381a(this.f349516p, new C126942ab(ddVar, hVar, this, cbVar, (C69577g) null));
    }

    /* renamed from: c */
    public final C126963p mo107863c(C127289i iVar) {
        if (this.f349517q != null) {
            C59052c cVar = (C59052c) f349501a.mo56224b();
            cVar.mo56379ah(new C59094n(37319));
            cVar.mo56386p("Creating child context API session");
            C127368m a = this.f349519s.a(iVar, this.f349513m, C69496am.f185918a);
            C32904f fVar = this.f349511k;
            C32849cq cqVar = this.f349517q;
            C69664n.m101058d(cqVar);
            C32881e b = fVar.mo38225b(cqVar, a.f350737c);
            a.mo108036b();
            C69664n.m101060f(b, "sourceSession");
            return new C126963p(b, a);
        }
        C59052c cVar2 = (C59052c) f349501a.mo56224b();
        cVar2.mo56379ah(new C59094n(37318));
        cVar2.mo56386p("Creating new independent context API session");
        C127368m a2 = this.f349519s.a(iVar, this.f349513m, this.f349514n);
        C32881e a3 = this.f349511k.mo38224a("TNG:MA", a2.f350737c);
        a2.mo108036b();
        C69664n.m101060f(a3, "sourceSession");
        return new C126963p(a3, a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107864d(com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126963p r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126968u
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.u r0 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126968u) r0
            int r1 = r0.f349621e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f349621e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.u r0 = new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.u
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f349619c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f349621e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r6 = r0.f349618b
            java.lang.Object r0 = r0.f349617a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0056
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.c r7 = r5.f349512l
            com.google.android.libraries.search.assistant.f.a.e r2 = r6.f349609a
            com.google.android.libraries.search.assistant.f.a.d.cq r2 = r2.mo38265b()
            java.lang.String r4 = "contextApiState.sourceSession.sessionToken"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.apps.search.assistant.surfaces.voice.d.m r4 = r6.f349610b
            com.google.android.apps.search.assistant.surfaces.voice.d.d.i r4 = r4.mo108035a()
            r0.f349617a = r5
            r0.f349618b = r6
            r0.f349621e = r3
            java.lang.Object r7 = r7.mo107869a(r2, r4, r0)
            if (r7 == r1) goto L_0x00ab
            r0 = r5
        L_0x0056:
            com.google.android.apps.search.assistant.platform.b.a.d.ak r7 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119789ak) r7
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.ac r0 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126943ac) r0
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.q r1 = r0.f349508h
            if (r1 != 0) goto L_0x007d
            com.google.common.f.e r1 = f349501a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 37326(0x91ce, float:5.2305E-41)
            r2.<init>(r3)
            r1.mo56379ah(r2)
            java.lang.String r2 = "Starting a new connection to Conversation API"
            r1.mo56386p(r2)
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.p r6 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126963p) r6
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.q r6 = r0.m207642f(r6, r7)
            return r6
        L_0x007d:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.o r2 = r1.f349613c
            int r2 = r2.f349600h
            com.google.android.apps.search.assistant.platform.b.a.d.ak r4 = r1.f349612b
            if (r2 == r3) goto L_0x00a4
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r7)
            if (r2 == 0) goto L_0x00a4
            com.google.common.f.e r6 = f349501a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r7 = new com.google.common.f.n
            r0 = 37325(0x91cd, float:5.2303E-41)
            r7.<init>(r0)
            r6.mo56379ah(r7)
            java.lang.String r7 = "Reusing connection to Conversation API"
            r6.mo56386p(r7)
            return r1
        L_0x00a4:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.p r6 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126963p) r6
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.q r6 = r0.m207642f(r6, r7)
            return r6
        L_0x00ab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126943ac.mo107864d(com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.p, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c A[Catch:{ Exception -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107865e(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126969v
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.v r0 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126969v) r0
            int r1 = r0.f349626e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f349626e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.v r0 = new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.v
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f349624c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f349626e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.lang.Object r1 = r0.f349623b
            java.lang.Object r0 = r0.f349622a
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x002c }
            goto L_0x006f
        L_0x002c:
            r7 = move-exception
            goto L_0x0085
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0036:
            p5462h.C69714l.m101134b(r7)
            com.google.android.libraries.search.assistant.f.a.d.cq r7 = r6.f349517q
            if (r7 != 0) goto L_0x00ab
            com.google.android.apps.search.assistant.surfaces.voice.d.f.c.j r7 = r6.f349515o     // Catch:{ Exception -> 0x0083 }
            com.google.android.apps.search.assistant.surfaces.voice.d.f.c.b r2 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9577f.p9580c.C127343b.f350697a     // Catch:{ Exception -> 0x0083 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ Exception -> 0x0083 }
            com.google.android.apps.search.assistant.surfaces.voice.d.f.c.a r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9577f.p9580c.C127342a) r2     // Catch:{ Exception -> 0x0083 }
            java.lang.String r5 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r5 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)     // Catch:{ Exception -> 0x0083 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ Exception -> 0x0083 }
            java.lang.String r5 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)     // Catch:{ Exception -> 0x0083 }
            com.google.android.apps.search.assistant.surfaces.voice.d.f.c.b r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9577f.p9580c.C127343b) r2     // Catch:{ Exception -> 0x0083 }
            r0.f349622a = r6     // Catch:{ Exception -> 0x0083 }
            r0.f349623b = r6     // Catch:{ Exception -> 0x0083 }
            r0.f349626e = r4     // Catch:{ Exception -> 0x0083 }
            io.grpc.de r4 = new io.grpc.de     // Catch:{ Exception -> 0x0083 }
            r4.<init>()     // Catch:{ Exception -> 0x0083 }
            java.lang.Object r7 = r7.mo108029b(r2, r4, r0)     // Catch:{ Exception -> 0x0083 }
            if (r7 == r1) goto L_0x0082
            r0 = r6
            r1 = r0
        L_0x006f:
            com.google.android.apps.search.assistant.surfaces.voice.d.f.c.e r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9577f.p9580c.C127346e) r7     // Catch:{ Exception -> 0x002c }
            java.lang.String r2 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r2)     // Catch:{ Exception -> 0x002c }
            boolean r2 = r7.mo108027a()     // Catch:{ Exception -> 0x002c }
            if (r2 == 0) goto L_0x00a4
            com.google.android.libraries.search.assistant.f.a.d.cq r7 = r7.mo108028b()     // Catch:{ Exception -> 0x002c }
            r3 = r7
            goto L_0x00a4
        L_0x0082:
            return r1
        L_0x0083:
            r7 = move-exception
            r0 = r6
        L_0x0085:
            com.google.common.f.e r1 = f349501a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.x r7 = r1.mo56382g(r7)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 37328(0x91d0, float:5.2308E-41)
            r1.<init>(r2)
            r7.mo56379ah(r1)
            java.lang.String r1 = "Speech biasing context session token not received"
            r7.mo56386p(r1)
            r1 = r0
        L_0x00a4:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.ac r1 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126943ac) r1
            r1.f349517q = r3
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x00ab:
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126943ac.mo107865e(h.c.g):java.lang.Object");
    }
}
