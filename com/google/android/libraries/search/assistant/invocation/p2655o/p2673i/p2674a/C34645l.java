package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2678b.C34552a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34570f;
import com.google.android.libraries.search.assistant.invocation.utils.p2695a.C34715b;
import com.google.android.libraries.search.assistant.p2697j.p2698a.C34743k;
import com.google.android.libraries.search.assistant.p2697j.p2698a.C34747o;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71471ab;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71562dl;
import kotlinx.coroutines.p5574b.C71570dt;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.l */
/* compiled from: PG */
public final class C34645l {

    /* renamed from: a */
    public static final C59071e f91989a = C59071e.m91331h();

    /* renamed from: b */
    public final C71553dc f91990b;

    /* renamed from: c */
    private final C34552a f91991c;

    /* renamed from: d */
    private final C34715b f91992d;

    public C34645l(C34570f fVar, C34552a aVar, C34715b bVar, C71422aw awVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f91991c = aVar;
        this.f91992d = bVar;
        C71587n b = C34743k.m63491b(C71536cm.m104384b(C71471ab.m104286a(new C34644k(fVar, this)), new C34641h((C69577g) null)), "Hotword configuration", f91989a);
        int i = C71562dl.f190976a;
        this.f91990b = C34747o.m63497a(b, awVar, new C71570dt(5000, 0));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: com.google.android.libraries.search.assistant.invocation.o.i.a.c.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39456a(com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34569e r12, p5462h.p5466c.C69577g r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34637g
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.libraries.search.assistant.invocation.o.i.a.g r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34637g) r0
            int r1 = r0.f91972e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91972e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.o.i.a.g r0 = new com.google.android.libraries.search.assistant.invocation.o.i.a.g
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f91970c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f91972e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r5) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r12 = r0.f91969b
            java.lang.Object r0 = r0.f91968a
            p5462h.C69714l.m101134b(r13)
            goto L_0x0083
        L_0x002f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0037:
            java.lang.Object r12 = r0.f91969b
            java.lang.Object r2 = r0.f91968a
            p5462h.C69714l.m101134b(r13)
            goto L_0x005e
        L_0x003f:
            p5462h.C69714l.m101134b(r13)
            boolean r13 = r12 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34566b
            if (r13 == 0) goto L_0x01ea
            com.google.android.libraries.search.assistant.invocation.utils.a.b r13 = r11.f91992d
            r2 = r12
            com.google.android.libraries.search.assistant.invocation.o.i.a.c.b r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34566b) r2
            com.google.apps.tiktok.account.AccountId r2 = r2.mo39418b()
            r0.f91968a = r11
            r0.f91969b = r12
            r0.f91972e = r5
            java.lang.String r6 = "pseudonymous"
            java.lang.Object r13 = r13.mo39475a(r2, r6, r0)
            if (r13 == r1) goto L_0x01e9
            r2 = r11
        L_0x005e:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x0068
            goto L_0x01ec
        L_0x0068:
            r13 = r2
            com.google.android.libraries.search.assistant.invocation.o.i.a.l r13 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34645l) r13
            com.google.android.libraries.search.assistant.invocation.utils.a.b r13 = r13.f91992d
            r6 = r12
            com.google.android.libraries.search.assistant.invocation.o.i.a.c.b r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34566b) r6
            com.google.apps.tiktok.account.AccountId r6 = r6.mo39418b()
            r0.f91968a = r2
            r0.f91969b = r12
            r0.f91972e = r4
            java.lang.String r7 = "incognito"
            java.lang.Object r13 = r13.mo39475a(r6, r7, r0)
            if (r13 == r1) goto L_0x01e9
            r0 = r2
        L_0x0083:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x01ec
            com.google.android.libraries.search.assistant.invocation.o.i.a.e r13 = new com.google.android.libraries.search.assistant.invocation.o.i.a.e
            com.google.android.libraries.search.assistant.invocation.o.i.a.c.b r12 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34566b) r12
            com.google.android.libraries.search.assistant.invocation.o.i.a.m r1 = new com.google.android.libraries.search.assistant.invocation.o.i.a.m
            com.google.android.libraries.search.assistant.invocation.o.i.a.l r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34645l) r0
            com.google.android.libraries.search.assistant.invocation.o.i.a.b.a r0 = r0.f91991c
            java.lang.String r0 = "consumer"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r0)
            com.google.android.libraries.search.n.h r0 = com.google.android.libraries.search.p3055n.C39767h.f104595d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.search.n.g r0 = (com.google.android.libraries.search.p3055n.C39713g) r0
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            java.lang.String r6 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)
            com.google.android.libraries.search.n.bf r7 = com.google.android.libraries.search.p3055n.C39357bf.f103644d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.search.n.bc r7 = (com.google.android.libraries.search.p3055n.C39354bc) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r6)
            boolean r8 = r12 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34567c
            if (r8 == 0) goto L_0x00c1
            com.google.android.libraries.search.n.be r8 = com.google.android.libraries.search.p3055n.C39356be.EXTERNAL
            goto L_0x011b
        L_0x00c1:
            boolean r8 = r12 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34574j
            if (r8 == 0) goto L_0x00d2
            r8 = r12
            com.google.android.libraries.search.assistant.invocation.o.i.a.c.j r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34574j) r8
            boolean r8 = r8.f91852a
            if (r8 == 0) goto L_0x00cf
            com.google.android.libraries.search.n.be r8 = com.google.android.libraries.search.p3055n.C39356be.NAVIGATION
            goto L_0x011b
        L_0x00cf:
            com.google.android.libraries.search.n.be r8 = com.google.android.libraries.search.p3055n.C39356be.DEFAULT_PERSONAL
            goto L_0x011b
        L_0x00d2:
            boolean r8 = r12 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34565a
            if (r8 == 0) goto L_0x01e3
            r8 = r12
            com.google.android.libraries.search.assistant.invocation.o.i.a.c.a r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34565a) r8
            com.google.android.libraries.search.assistant.invocation.o.c.b r9 = r8.f91837a
            com.google.android.libraries.search.assistant.invocation.o.c.a r9 = r9.f90872a
            com.google.android.libraries.search.assistant.invocation.o.a.b r9 = r9.f90869a
            com.google.android.libraries.search.assistant.invocation.o.a.b r10 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b.CLIENT_UNKNOWN
            int r9 = r9.ordinal()
            r10 = 3
            if (r9 == r10) goto L_0x00f4
            r8 = 5
            if (r9 == r8) goto L_0x00f1
            r8 = 7
            if (r9 == r8) goto L_0x00f1
            com.google.android.libraries.search.n.be r8 = com.google.android.libraries.search.p3055n.C39356be.DEFAULT_PERSONAL
            goto L_0x011b
        L_0x00f1:
            com.google.android.libraries.search.n.be r8 = com.google.android.libraries.search.p3055n.C39356be.NAVIGATION
            goto L_0x011b
        L_0x00f4:
            com.google.android.libraries.search.assistant.invocation.o.c.b r8 = r8.f91837a
            java.lang.Object r8 = r8.f90873b
            com.google.android.libraries.search.assistant.invocation.o.a.cz r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34090cz) r8
            com.google.android.libraries.search.assistant.invocation.o.a.cx r9 = r8.f90825a
            if (r9 != 0) goto L_0x0100
            com.google.android.libraries.search.assistant.invocation.o.a.cx r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34088cx.f90818c
        L_0x0100:
            boolean r9 = r9.f90820a
            com.google.android.libraries.search.assistant.invocation.o.a.cx r10 = r8.f90825a
            if (r10 != 0) goto L_0x0108
            com.google.android.libraries.search.assistant.invocation.o.a.cx r10 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34088cx.f90818c
        L_0x0108:
            boolean r10 = r10.f90821b
            r9 = r9 & r10
            com.google.android.libraries.search.assistant.invocation.o.a.bt r8 = r8.f90826b
            if (r8 != 0) goto L_0x0111
            com.google.android.libraries.search.assistant.invocation.o.a.bt r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34057bt.f90757b
        L_0x0111:
            boolean r8 = r8.f90759a
            r8 = r8 & r9
            if (r8 == 0) goto L_0x0119
            com.google.android.libraries.search.n.be r8 = com.google.android.libraries.search.p3055n.C39356be.GUEST
            goto L_0x011b
        L_0x0119:
            com.google.android.libraries.search.n.be r8 = com.google.android.libraries.search.p3055n.C39356be.COMMUNAL
        L_0x011b:
            java.lang.String r9 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r9)
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.android.libraries.search.n.bf r10 = (com.google.android.libraries.search.p3055n.C39357bf) r10
            int r8 = r8.f103643f
            r10.f103647b = r8
            int r8 = r10.f103646a
            r8 = r8 | r5
            r10.f103646a = r8
            com.google.android.libraries.search.assistant.invocation.o.i.a.b.c r8 = r12.mo39417a()
            java.lang.String r10 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r10)
            int r10 = r8.f91808a
            r10 = r10 & 4
            if (r10 == 0) goto L_0x0145
            com.google.android.libraries.search.n.db r3 = r8.f91811d
            if (r3 != 0) goto L_0x0145
            com.google.android.libraries.search.n.db r3 = com.google.android.libraries.search.p3055n.C39677db.f104438c
        L_0x0145:
            if (r3 == 0) goto L_0x0155
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.libraries.search.n.bf r8 = (com.google.android.libraries.search.p3055n.C39357bf) r8
            r8.f103648c = r3
            int r3 = r8.f103646a
            r3 = r3 | r4
            r8.f103646a = r3
        L_0x0155:
            com.google.protobuf.bv r3 = r7.build()
            java.lang.String r7 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r7)
            com.google.android.libraries.search.n.bf r3 = (com.google.android.libraries.search.p3055n.C39357bf) r3
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r9)
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.android.libraries.search.n.h r8 = (com.google.android.libraries.search.p3055n.C39767h) r8
            r3.getClass()
            r8.f104599c = r3
            int r3 = r8.f104597a
            r3 = r3 | r4
            r8.f104597a = r3
            com.google.android.libraries.search.assistant.invocation.o.i.a.b.c r3 = r12.mo39417a()
            int r3 = r3.f91809b
            if (r3 != r5) goto L_0x01cf
            com.google.android.libraries.search.n.ax r3 = com.google.android.libraries.search.p3055n.C39274ax.f103452c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.search.n.aw r3 = (com.google.android.libraries.search.p3055n.C39273aw) r3
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r6)
            com.google.android.libraries.search.assistant.invocation.o.i.a.b.c r2 = r12.mo39417a()
            int r4 = r2.f91809b
            if (r4 != r5) goto L_0x0197
            java.lang.Object r2 = r2.f91810c
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0199
        L_0x0197:
            java.lang.String r2 = ""
        L_0x0199:
            java.lang.String r4 = "consumer.configuration.rawLocale"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r9)
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.libraries.search.n.ax r4 = (com.google.android.libraries.search.p3055n.C39274ax) r4
            r2.getClass()
            int r6 = r4.f103454a
            r6 = r6 | r5
            r4.f103454a = r6
            r4.f103455b = r2
            com.google.protobuf.bv r2 = r3.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            com.google.android.libraries.search.n.ax r2 = (com.google.android.libraries.search.p3055n.C39274ax) r2
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r9)
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.libraries.search.n.h r3 = (com.google.android.libraries.search.p3055n.C39767h) r3
            r2.getClass()
            r3.f104598b = r2
            int r2 = r3.f104597a
            r2 = r2 | r5
            r3.f104597a = r2
        L_0x01cf:
            com.google.protobuf.bv r0 = r0.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r7)
            com.google.android.libraries.search.n.h r0 = (com.google.android.libraries.search.p3055n.C39767h) r0
            com.google.apps.tiktok.account.AccountId r2 = r12.mo39418b()
            r1.<init>(r0, r2)
            r13.<init>(r12, r1)
            return r13
        L_0x01e3:
            h.g r12 = new h.g
            r12.<init>()
            throw r12
        L_0x01e9:
            return r1
        L_0x01ea:
            if (r12 != 0) goto L_0x01ed
        L_0x01ec:
            return r3
        L_0x01ed:
            h.g r12 = new h.g
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34645l.mo39456a(com.google.android.libraries.search.assistant.invocation.o.i.a.c.e, h.c.g):java.lang.Object");
    }
}
