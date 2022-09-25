package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a;

import com.google.android.apps.gsa.binaries.satin.app.aqs;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34013ac;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34014ad;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34060bw;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34120b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5573a.C71367au;
import kotlinx.coroutines.p5574b.C71521by;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71571du;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.a.a.l */
/* compiled from: PG */
public final class C34366l implements C34358d {

    /* renamed from: a */
    public static final C59071e f91353a = C59071e.m91331h();

    /* renamed from: b */
    public final String f91354b;

    /* renamed from: c */
    public final C71367au f91355c;

    /* renamed from: d */
    public final AccountId f91356d;

    /* renamed from: e */
    public final C71571du f91357e;

    /* renamed from: f */
    public final aqs f91358f;

    /* renamed from: g */
    private final C46175b f91359g;

    /* renamed from: h */
    private final C34356b f91360h;

    /* renamed from: i */
    private final C69585o f91361i;

    /* renamed from: j */
    private final C71548cy f91362j;

    public C34366l(String str, C71367au auVar, AccountId accountId, C46175b bVar, C34356b bVar2, C69585o oVar, aqs aqs) {
        C69664n.m101061g(str, "id");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(bVar2, "handler");
        C69664n.m101061g(oVar, "blockingContext");
        C69664n.m101061g(aqs, "appFlowLoggerFactory");
        this.f91354b = str;
        this.f91355c = auVar;
        this.f91356d = accountId;
        this.f91359g = bVar;
        this.f91360h = bVar2;
        this.f91361i = oVar;
        this.f91358f = aqs;
        C34119a aVar = new C34119a(C34037b.CLIENT_UNKNOWN, accountId, (String) null);
        C34013ac acVar = (C34013ac) C34014ad.f90663f.createBuilder();
        C69664n.m101060f(acVar, "newBuilder()");
        C71548cy b = C71574dx.m104480b(new C34120b(aVar, C69664n.m101061g(acVar, "builder").mo39188a(), str, 0));
        this.f91362j = b;
        this.f91357e = C71521by.m104365c(b);
    }

    /* renamed from: h */
    private final void m63027h(C71548cy cyVar, C69626l lVar) {
        Object e;
        C34120b bVar;
        do {
            e = cyVar.mo62784e();
            C34120b bVar2 = (C34120b) e;
            bVar = (C34120b) lVar.mo5761a(bVar2);
            if (!C69664n.m101066l(bVar, bVar2)) {
                bVar = C34120b.m62740a(bVar, (C34119a) null, (Object) null, 1 + bVar2.f90875d, 7);
            }
        } while (!cyVar.mo62808g(e, bVar));
    }

    /* renamed from: a */
    public final Object mo39320a(C34039bb bbVar, C69577g gVar) {
        Object a = C71803m.m105040a(this.f91361i, new C34364j(bbVar, this, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: b */
    public final Object mo39321b(C34060bw bwVar, C69577g gVar) {
        Object a = C71803m.m105040a(this.f91361i, new C34365k(bwVar, this, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: c */
    public final String mo39322c() {
        return this.f91354b;
    }

    /* renamed from: d */
    public final C71571du mo39323d() {
        return this.f91357e;
    }

    /* renamed from: e */
    public final void mo39324e() {
        this.f91355c.mo62727D((Throwable) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b3 A[Catch:{ all -> 0x0291 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0290 A[Catch:{ all -> 0x0291 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39325f(com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34117z r18, p5462h.p5466c.C69577g r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.String r3 = "newBuilder()"
            boolean r4 = r2 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34363i
            if (r4 == 0) goto L_0x001b
            r4 = r2
            com.google.android.libraries.search.assistant.invocation.o.h.a.a.i r4 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34363i) r4
            int r5 = r4.f91347f
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f91347f = r5
            goto L_0x0020
        L_0x001b:
            com.google.android.libraries.search.assistant.invocation.o.h.a.a.i r4 = new com.google.android.libraries.search.assistant.invocation.o.h.a.a.i
            r4.<init>(r1, r2)
        L_0x0020:
            java.lang.Object r2 = r4.f91345d
            h.c.a.a r5 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r6 = r4.f91347f
            java.lang.String r7 = "TRG.Connection"
            r8 = 0
            r9 = 2
            r10 = 1
            if (r6 == 0) goto L_0x0052
            if (r6 == r10) goto L_0x0047
            if (r6 != r9) goto L_0x003f
            java.lang.Object r3 = r4.f91344c
            java.lang.Object r5 = r4.f91343b
            java.lang.Object r4 = r4.f91342a
            p5462h.C69714l.m101134b(r2)     // Catch:{ all -> 0x003c }
            goto L_0x0242
        L_0x003c:
            r0 = move-exception
            goto L_0x0295
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0047:
            java.lang.Object r0 = r4.f91344c
            java.lang.Object r6 = r4.f91343b
            java.lang.Object r11 = r4.f91342a
            p5462h.C69714l.m101134b(r2)
            r2 = r0
            goto L_0x00a4
        L_0x0052:
            p5462h.C69714l.m101134b(r2)
            int r2 = r0.f90865a
            int r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34116y.m62737b(r2)
            java.lang.String r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34116y.m62736a(r2)
            if (r2 == 0) goto L_0x02c2
            com.google.common.f.e r2 = f91353a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r11, r7)
            java.lang.String r11 = com.google.android.libraries.search.assistant.invocation.p2641k.C33914a.m62566a(r18)
            java.lang.String r12 = r1.f91354b
            com.google.common.f.n r13 = new com.google.common.f.n
            r14 = 51351(0xc897, float:7.1958E-41)
            r13.<init>(r14)
            r2.mo56379ah(r13)
            java.lang.String r13 = "New message(%s, @%s) received at connection(%s)."
            r2.mo56359L(r13, r6, r11, r12)
            int r2 = r0.f90867c
            com.google.android.libraries.search.assistant.invocation.o.a.b r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b.m62690a(r2)
            if (r2 != 0) goto L_0x008e
            com.google.android.libraries.search.assistant.invocation.o.a.b r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b.UNRECOGNIZED
        L_0x008e:
            java.lang.String r11 = "value.client"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r11)
            r4.f91342a = r1
            r4.f91343b = r0
            r4.f91344c = r6
            r4.f91347f = r10
            java.lang.Object r2 = r1.mo39326g(r2, r4)
            if (r2 == r5) goto L_0x02c1
            r11 = r1
            r2 = r6
            r6 = r0
        L_0x00a4:
            r0 = r6
            com.google.android.libraries.search.assistant.invocation.o.a.z r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34117z) r0     // Catch:{ all -> 0x0291 }
            int r0 = r0.f90865a     // Catch:{ all -> 0x0291 }
            int r0 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34116y.m62737b(r0)     // Catch:{ all -> 0x0291 }
            int[] r12 = com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34359e.f91332a     // Catch:{ all -> 0x0291 }
            int r13 = r0 + -1
            if (r0 == 0) goto L_0x0290
            r0 = r12[r13]     // Catch:{ all -> 0x0291 }
            if (r0 != r10) goto L_0x00df
            r0 = r6
            com.google.android.libraries.search.assistant.invocation.o.a.z r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34117z) r0     // Catch:{ all -> 0x0291 }
            int r0 = r0.f90865a     // Catch:{ all -> 0x0291 }
            if (r0 != r9) goto L_0x00c6
            r0 = r6
            com.google.android.libraries.search.assistant.invocation.o.a.z r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34117z) r0     // Catch:{ all -> 0x0291 }
            java.lang.Object r0 = r0.f90866b     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.a.ad r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34014ad) r0     // Catch:{ all -> 0x0291 }
            goto L_0x00c8
        L_0x00c6:
            com.google.android.libraries.search.assistant.invocation.o.a.ad r0 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34014ad.f90663f     // Catch:{ all -> 0x0291 }
        L_0x00c8:
            java.lang.String r3 = "value.configurationUpdate"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)     // Catch:{ all -> 0x0291 }
            r3 = r11
            com.google.android.libraries.search.assistant.invocation.o.h.a.a.l r3 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34366l) r3     // Catch:{ all -> 0x0291 }
            kotlinx.coroutines.b.cy r3 = r3.f91362j     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.h.a.a.f r4 = new com.google.android.libraries.search.assistant.invocation.o.h.a.a.f     // Catch:{ all -> 0x0291 }
            r4.<init>(r0)     // Catch:{ all -> 0x0291 }
            r0 = r11
            com.google.android.libraries.search.assistant.invocation.o.h.a.a.l r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34366l) r0     // Catch:{ all -> 0x0291 }
            r0.m63027h(r3, r4)     // Catch:{ all -> 0x0291 }
            goto L_0x023f
        L_0x00df:
            r0 = r11
            com.google.android.libraries.search.assistant.invocation.o.h.a.a.l r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34366l) r0     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.h.a.a.b r0 = r0.f91360h     // Catch:{ all -> 0x0291 }
            r4.f91342a = r11     // Catch:{ all -> 0x0291 }
            r4.f91343b = r6     // Catch:{ all -> 0x0291 }
            r4.f91344c = r2     // Catch:{ all -> 0x0291 }
            r4.f91347f = r9     // Catch:{ all -> 0x0291 }
            r12 = r6
            com.google.android.libraries.search.assistant.invocation.o.a.z r12 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34117z) r12     // Catch:{ all -> 0x0291 }
            int r12 = r12.f90865a     // Catch:{ all -> 0x0291 }
            int r12 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34116y.m62737b(r12)     // Catch:{ all -> 0x0291 }
            int[] r13 = com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34355a.f91329a     // Catch:{ all -> 0x0291 }
            int r14 = r12 + -1
            if (r12 == 0) goto L_0x028f
            r12 = r13[r14]     // Catch:{ all -> 0x0291 }
            if (r12 != r10) goto L_0x026c
            com.google.android.libraries.search.assistant.invocation.o.i.d.d r0 = r0.f91330a     // Catch:{ all -> 0x0291 }
            r8 = r11
            com.google.android.libraries.search.assistant.invocation.o.h.a.a.l r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34366l) r8     // Catch:{ all -> 0x0291 }
            java.lang.String r8 = r8.f91354b     // Catch:{ all -> 0x0291 }
            r12 = r6
            com.google.android.libraries.search.assistant.invocation.o.a.z r12 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34117z) r12     // Catch:{ all -> 0x0291 }
            int r12 = r12.f90865a     // Catch:{ all -> 0x0291 }
            r13 = 3
            if (r12 != r13) goto L_0x0116
            r12 = r6
            com.google.android.libraries.search.assistant.invocation.o.a.z r12 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34117z) r12     // Catch:{ all -> 0x0291 }
            java.lang.Object r12 = r12.f90866b     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.a.ci r12 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34073ci) r12     // Catch:{ all -> 0x0291 }
            goto L_0x0118
        L_0x0116:
            com.google.android.libraries.search.assistant.invocation.o.a.ci r12 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34073ci.f90785f     // Catch:{ all -> 0x0291 }
        L_0x0118:
            java.lang.String r13 = "message.selfInvocation"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.i.d r13 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34684d.f92090g     // Catch:{ all -> 0x0291 }
            com.google.protobuf.bn r13 = r13.createBuilder()     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.i.c r13 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34666c) r13     // Catch:{ all -> 0x0291 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r3)     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.i.k r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.a.bf r14 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf.ENTRYPOINT_SELF_INVOCATION     // Catch:{ all -> 0x0291 }
            r13.mo39467b(r14)     // Catch:{ all -> 0x0291 }
            int r14 = r12.f90787a     // Catch:{ all -> 0x0291 }
            r14 = r14 & r10
            java.lang.String r15 = "value"
            if (r14 == 0) goto L_0x016e
            com.google.android.libraries.search.assistant.invocation.o.a.ba r14 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34038ba.f90707h     // Catch:{ all -> 0x0291 }
            com.google.protobuf.bn r14 = r14.createBuilder()     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.a.az r14 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34036az) r14     // Catch:{ all -> 0x0291 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r3)     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.a.bh r14 = p5462h.p5473f.p5475b.C69664n.m101061g(r14, "builder")     // Catch:{ all -> 0x0291 }
            java.lang.String r9 = r12.f90788b     // Catch:{ all -> 0x0291 }
            java.lang.String r10 = "request.id"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)     // Catch:{ all -> 0x0291 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r15)     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.a.az r10 = r14.f90745a     // Catch:{ all -> 0x0291 }
            r10.copyOnWrite()     // Catch:{ all -> 0x0291 }
            com.google.protobuf.bv r10 = r10.instance     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.a.ba r10 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34038ba) r10     // Catch:{ all -> 0x0291 }
            r9.getClass()     // Catch:{ all -> 0x0291 }
            int r1 = r10.f90709a     // Catch:{ all -> 0x0291 }
            r16 = 1
            r1 = r1 | 1
            r10.f90709a = r1     // Catch:{ all -> 0x0291 }
            r10.f90710b = r9     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.a.ba r1 = r14.mo39195a()     // Catch:{ all -> 0x0291 }
            r13.mo39469d(r1)     // Catch:{ all -> 0x0291 }
        L_0x016e:
            int r1 = r12.f90787a     // Catch:{ all -> 0x0291 }
            r9 = 2
            r1 = r1 & r9
            if (r1 == 0) goto L_0x0187
            boolean r1 = r12.f90789c     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.i.c r9 = r13.f92119a     // Catch:{ all -> 0x0291 }
            r9.copyOnWrite()     // Catch:{ all -> 0x0291 }
            com.google.protobuf.bv r9 = r9.instance     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.i.d r9 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34684d) r9     // Catch:{ all -> 0x0291 }
            int r10 = r9.f92092a     // Catch:{ all -> 0x0291 }
            r10 = r10 | 4
            r9.f92092a = r10     // Catch:{ all -> 0x0291 }
            r9.f92095d = r1     // Catch:{ all -> 0x0291 }
        L_0x0187:
            com.google.android.libraries.search.assistant.invocation.o.i.g r1 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34697g.f92115a     // Catch:{ all -> 0x0291 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.i.f r1 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34696f) r1     // Catch:{ all -> 0x0291 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.i.i r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")     // Catch:{ all -> 0x0291 }
            com.google.protobuf.bt r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2690d.C34687c.f92100f     // Catch:{ all -> 0x0291 }
            java.lang.String r10 = "selfInvocationInputExtras"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.i.d.c r10 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2690d.C34687c.f92099e     // Catch:{ all -> 0x0291 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.i.d.b r10 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2690d.C34686b) r10     // Catch:{ all -> 0x0291 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r3)     // Catch:{ all -> 0x0291 }
            java.lang.String r3 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r3)     // Catch:{ all -> 0x0291 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r15)     // Catch:{ all -> 0x0291 }
            r10.copyOnWrite()     // Catch:{ all -> 0x0291 }
            com.google.protobuf.bv r3 = r10.instance     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.i.d.c r3 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2690d.C34687c) r3     // Catch:{ all -> 0x0291 }
            r8.getClass()     // Catch:{ all -> 0x0291 }
            int r14 = r3.f92102a     // Catch:{ all -> 0x0291 }
            r16 = 1
            r14 = r14 | 1
            r3.f92102a = r14     // Catch:{ all -> 0x0291 }
            r3.f92103b = r8     // Catch:{ all -> 0x0291 }
            int r3 = r12.f90787a     // Catch:{ all -> 0x0291 }
            r3 = r3 & 4
            if (r3 == 0) goto L_0x01ea
            com.google.android.libraries.search.assistant.invocation.o.a.ca r3 = r12.f90790d     // Catch:{ all -> 0x0291 }
            if (r3 != 0) goto L_0x01d0
            com.google.android.libraries.search.assistant.invocation.o.a.ca r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34065ca.f90770i     // Catch:{ all -> 0x0291 }
        L_0x01d0:
            java.lang.String r8 = "request.resourceConfig"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r8)     // Catch:{ all -> 0x0291 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r15)     // Catch:{ all -> 0x0291 }
            r10.copyOnWrite()     // Catch:{ all -> 0x0291 }
            com.google.protobuf.bv r8 = r10.instance     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.i.d.c r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2690d.C34687c) r8     // Catch:{ all -> 0x0291 }
            r3.getClass()     // Catch:{ all -> 0x0291 }
            r8.f92104c = r3     // Catch:{ all -> 0x0291 }
            int r3 = r8.f92102a     // Catch:{ all -> 0x0291 }
            r14 = 2
            r3 = r3 | r14
            r8.f92102a = r3     // Catch:{ all -> 0x0291 }
        L_0x01ea:
            int r3 = r12.f90787a     // Catch:{ all -> 0x0291 }
            r3 = r3 & 8
            if (r3 == 0) goto L_0x0210
            com.google.android.libraries.search.assistant.invocation.o.a.db r3 = r12.f90791e     // Catch:{ all -> 0x0291 }
            if (r3 != 0) goto L_0x01f6
            com.google.android.libraries.search.assistant.invocation.o.a.db r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34093db.f90828c     // Catch:{ all -> 0x0291 }
        L_0x01f6:
            java.lang.String r8 = "request.sessionParameters"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r8)     // Catch:{ all -> 0x0291 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r15)     // Catch:{ all -> 0x0291 }
            r10.copyOnWrite()     // Catch:{ all -> 0x0291 }
            com.google.protobuf.bv r8 = r10.instance     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.i.d.c r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2690d.C34687c) r8     // Catch:{ all -> 0x0291 }
            r3.getClass()     // Catch:{ all -> 0x0291 }
            r8.f92105d = r3     // Catch:{ all -> 0x0291 }
            int r3 = r8.f92102a     // Catch:{ all -> 0x0291 }
            r3 = r3 | 4
            r8.f92102a = r3     // Catch:{ all -> 0x0291 }
        L_0x0210:
            com.google.protobuf.bv r3 = r10.build()     // Catch:{ all -> 0x0291 }
            java.lang.String r8 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r8)     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.i.d.c r3 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2690d.C34687c) r3     // Catch:{ all -> 0x0291 }
            r1.mo39465b(r9, r3)     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.i.g r1 = r1.mo39464a()     // Catch:{ all -> 0x0291 }
            r13.mo39468c(r1)     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.i.d r1 = r13.mo39466a()     // Catch:{ all -> 0x0291 }
            com.google.android.libraries.search.assistant.invocation.o.f.a.am r0 = r0.f92107a     // Catch:{ all -> 0x0291 }
            com.google.common.util.concurrent.cx r0 = r0.mo39276a(r1)     // Catch:{ all -> 0x0291 }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r4)     // Catch:{ all -> 0x0291 }
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED     // Catch:{ all -> 0x0291 }
            if (r0 == r1) goto L_0x0239
            h.q r0 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x0291 }
        L_0x0239:
            if (r0 == r1) goto L_0x023d
            h.q r0 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x0291 }
        L_0x023d:
            if (r0 == r5) goto L_0x026b
        L_0x023f:
            r3 = r2
            r5 = r6
            r4 = r11
        L_0x0242:
            com.google.common.f.e r0 = f91353a     // Catch:{ all -> 0x003c }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x003c }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x003c }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x003c }
            r0.mo56378ag(r1, r7)     // Catch:{ all -> 0x003c }
            java.lang.String r1 = "Message(%s, @%s) has been successfully processed at connection(%s)."
            java.lang.String r2 = com.google.android.libraries.search.assistant.invocation.p2641k.C33914a.m62566a(r5)     // Catch:{ all -> 0x003c }
            r6 = r4
            com.google.android.libraries.search.assistant.invocation.o.h.a.a.l r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34366l) r6     // Catch:{ all -> 0x003c }
            java.lang.String r6 = r6.f91354b     // Catch:{ all -> 0x003c }
            com.google.common.f.n r8 = new com.google.common.f.n     // Catch:{ all -> 0x003c }
            r9 = 51352(0xc898, float:7.196E-41)
            r8.<init>(r9)     // Catch:{ all -> 0x003c }
            r0.mo56379ah(r8)     // Catch:{ all -> 0x003c }
            r0.mo56359L(r1, r3, r2, r6)     // Catch:{ all -> 0x003c }
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x026b:
            return r5
        L_0x026c:
            io.grpc.Status r0 = p5488io.grpc.Status.f186906d     // Catch:{ all -> 0x0291 }
            r1 = r6
            com.google.android.libraries.search.assistant.invocation.o.a.z r1 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34117z) r1     // Catch:{ all -> 0x0291 }
            int r1 = r1.f90865a     // Catch:{ all -> 0x0291 }
            int r1 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34116y.m62737b(r1)     // Catch:{ all -> 0x0291 }
            java.lang.String r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34116y.m62736a(r1)     // Catch:{ all -> 0x0291 }
            if (r1 == 0) goto L_0x028e
            java.lang.String r1 = "Unsupported message: "
            java.lang.String r1 = r1.concat(r3)     // Catch:{ all -> 0x0291 }
            io.grpc.Status r0 = r0.mo61677b(r1)     // Catch:{ all -> 0x0291 }
            io.grpc.fa r1 = new io.grpc.fa     // Catch:{ all -> 0x0291 }
            r3 = 1
            r1.<init>(r0, r8, r3)     // Catch:{ all -> 0x0291 }
            throw r1     // Catch:{ all -> 0x0291 }
        L_0x028e:
            throw r8     // Catch:{ all -> 0x0291 }
        L_0x028f:
            throw r8     // Catch:{ all -> 0x0291 }
        L_0x0290:
            throw r8     // Catch:{ all -> 0x0291 }
        L_0x0291:
            r0 = move-exception
            r3 = r2
            r5 = r6
            r4 = r11
        L_0x0295:
            com.google.common.f.e r1 = f91353a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r7)
            com.google.common.f.x r1 = r1.mo56382g(r0)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            java.lang.String r2 = com.google.android.libraries.search.assistant.invocation.p2641k.C33914a.m62566a(r5)
            com.google.android.libraries.search.assistant.invocation.o.h.a.a.l r4 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34366l) r4
            java.lang.String r4 = r4.f91354b
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 51353(0xc899, float:7.1961E-41)
            r5.<init>(r6)
            r1.mo56379ah(r5)
            java.lang.String r5 = "Message(%s, @%s) processing failed at connection(%s)."
            r1.mo56359L(r5, r3, r2, r4)
            throw r0
        L_0x02c1:
            return r5
        L_0x02c2:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34366l.mo39325f(com.google.android.libraries.search.assistant.invocation.o.a.z, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39326g(com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34361g
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.search.assistant.invocation.o.h.a.a.g r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34361g) r0
            int r1 = r0.f91338e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91338e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.o.h.a.a.g r0 = new com.google.android.libraries.search.assistant.invocation.o.h.a.a.g
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f91336c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f91338e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r8 = r0.f91335b
            java.lang.Object r0 = r0.f91334a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0090
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            p5462h.C69714l.m101134b(r9)
            kotlinx.coroutines.b.du r9 = r7.f91357e
            java.lang.Object r9 = r9.mo62784e()
            com.google.android.libraries.search.assistant.invocation.o.c.b r9 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34120b) r9
            com.google.android.libraries.search.assistant.invocation.o.c.a r9 = r9.f90872a
            com.google.android.libraries.search.assistant.invocation.o.a.b r9 = r9.f90869a
            com.google.android.libraries.search.assistant.invocation.o.a.b r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b.CLIENT_UNKNOWN
            if (r9 == r2) goto L_0x0049
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0049:
            com.google.android.libraries.search.assistant.invocation.o.a.b r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b.UNRECOGNIZED
            if (r8 == r9) goto L_0x00a4
            com.google.android.libraries.search.assistant.invocation.o.a.b r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b.CLIENT_UNKNOWN
            if (r8 == r9) goto L_0x00a4
            com.google.common.f.e r9 = f91353a
            com.google.common.f.x r9 = r9.mo56224b()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "TRG.Connection"
            r9.mo56378ag(r2, r4)
            java.lang.String r2 = r8.name()
            java.lang.String r4 = r7.f91354b
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 51350(0xc896, float:7.1957E-41)
            r5.<init>(r6)
            r9.mo56379ah(r5)
            java.lang.String r5 = "Setting client id(%s) at connection(%s)."
            r9.mo56354G(r5, r2, r4)
            com.google.apps.tiktok.account.data.b r9 = r7.f91359g
            com.google.apps.tiktok.account.AccountId r2 = r7.f91356d
            com.google.common.util.concurrent.cx r9 = r9.mo50246c(r2)
            java.lang.String r2 = "accountDataService.getAccount(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            r0.f91334a = r7
            r0.f91335b = r8
            r0.f91338e = r3
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)
            if (r9 == r1) goto L_0x00a3
            r0 = r7
        L_0x0090:
            com.google.apps.tiktok.account.data.a r9 = (com.google.apps.tiktok.account.data.C46108a) r9
            com.google.android.libraries.search.assistant.invocation.o.h.a.a.l r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34366l) r0
            kotlinx.coroutines.b.cy r1 = r0.f91362j
            com.google.android.libraries.search.assistant.invocation.o.h.a.a.h r2 = new com.google.android.libraries.search.assistant.invocation.o.h.a.a.h
            com.google.android.libraries.search.assistant.invocation.o.a.b r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b) r8
            r2.<init>(r8, r0, r9)
            r0.m63027h(r1, r2)
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x00a3:
            return r1
        L_0x00a4:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.name()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Malformed client id provided ("
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = ")."
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34366l.mo39326g(com.google.android.libraries.search.assistant.invocation.o.a.b, h.c.g):java.lang.Object");
    }

    public final String toString() {
        C34120b bVar = (C34120b) this.f91357e.mo62784e();
        String str = this.f91354b;
        C34119a aVar = bVar.f90872a;
        long j = bVar.f90875d;
        return "TriggeringConnection(id=" + str + ", client=" + aVar + ", epoch=" + j + ")";
    }
}
