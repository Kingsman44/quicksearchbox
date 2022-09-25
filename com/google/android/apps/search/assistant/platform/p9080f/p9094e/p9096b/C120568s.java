package com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b;

import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120691f;
import kotlinx.coroutines.p5574b.C71588o;

/* renamed from: com.google.android.apps.search.assistant.platform.f.e.b.s */
/* compiled from: PG */
public final class C120568s implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C71588o f335333a;

    /* renamed from: b */
    final /* synthetic */ C120546ac f335334b;

    /* renamed from: c */
    final /* synthetic */ C120691f f335335c;

    public C120568s(C71588o oVar, C120546ac acVar, C120691f fVar) {
        this.f335334b = acVar;
        this.f335335c = fVar;
        this.f335333a = oVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.google.assistant.e.d.a.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.google.assistant.e.d.a.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: com.google.assistant.e.d.a.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: com.google.assistant.e.d.a.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r5v17, types: [com.google.assistant.e.d.a.n] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0569 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo20883a(java.lang.Object r25, p5462h.p5466c.C69577g r26) {
        /*
            r24 = this;
            r1 = r24
            r0 = r26
            boolean r2 = r0 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120567r
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.apps.search.assistant.platform.f.e.b.r r2 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120567r) r2
            int r3 = r2.f335331b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f335331b = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.assistant.platform.f.e.b.r r2 = new com.google.android.apps.search.assistant.platform.f.e.b.r
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f335330a
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f335331b
            r5 = 1
            if (r4 == 0) goto L_0x0034
            if (r4 != r5) goto L_0x002c
            p5462h.C69714l.m101134b(r0)
            goto L_0x056a
        L_0x002c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0034:
            p5462h.C69714l.m101134b(r0)
            kotlinx.coroutines.b.o r4 = r1.f335333a
            r6 = r25
            com.google.assistant.e.j.en r6 = (com.google.assistant.p3897e.p3921j.C52081en) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.google.protobuf.cq r0 = r6.f136684d
            java.lang.String r7 = "it.interactionDeltaList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r10 = 10
            int r11 = p5462h.p5463a.C69540x.m100804k(r0, r10)
            r7.<init>(r11)
            java.util.Iterator r0 = r0.iterator()
        L_0x005d:
            boolean r11 = r0.hasNext()
            r12 = 4
            if (r11 == 0) goto L_0x012c
            java.lang.Object r11 = r0.next()
            com.google.assistant.e.j.ep r11 = (com.google.assistant.p3897e.p3921j.C52083ep) r11
            int r13 = r11.f136692b
            if (r13 != r12) goto L_0x0073
            java.lang.Object r12 = r11.f136693c
            com.google.assistant.e.j.ei r12 = (com.google.assistant.p3897e.p3921j.C52076ei) r12
            goto L_0x0075
        L_0x0073:
            com.google.assistant.e.j.ei r12 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x0075:
            com.google.assistant.e.j.dy r12 = r12.f136668c
            if (r12 != 0) goto L_0x007b
            com.google.assistant.e.j.dy r12 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x007b:
            java.lang.String r13 = "interaction.fromAssistant.clientOp"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)
            java.lang.String r13 = r12.f135936b
            com.google.common.b.ij r14 = com.google.android.apps.search.assistant.libraries.p8966e.C119337a.f332732a
            com.google.common.b.qy r14 = (com.google.common.p4522b.C58759qy) r14
            java.lang.Object r14 = r14.f156534a
            boolean r13 = r14.equals(r13)
            java.lang.String r14 = "prefetchSession"
            java.lang.String r15 = "interaction"
            if (r13 == 0) goto L_0x00b0
            com.google.android.apps.search.assistant.platform.f.e.b.ac r13 = r1.f335334b
            com.google.android.apps.search.assistant.platform.b.d.a r13 = r13.f335232d
            com.google.android.apps.search.assistant.platform.b.a.e r12 = r13.mo104603a(r12)
            com.google.android.apps.search.assistant.platform.f.e.b.n r13 = new com.google.android.apps.search.assistant.platform.f.e.b.n
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r15)
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r14)
            r13.<init>(r11, r12)
            boolean r11 = r8.add(r13)
            r16 = r0
            r17 = r3
            r18 = r4
            goto L_0x011a
        L_0x00b0:
            com.google.android.apps.search.assistant.platform.f.e.b.ac r13 = r1.f335334b
            com.google.android.apps.search.assistant.platform.b.d.a r13 = r13.f335232d
            int r5 = r11.f136694d
            java.lang.String r10 = "it"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r10)
            com.google.protobuf.z r10 = r6.f136682b
            boolean r10 = r10.mo59047s()
            if (r10 != 0) goto L_0x00e6
            com.google.common.f.e r10 = com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac.f335229a
            com.google.common.f.x r10 = r10.mo56226d()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            r16 = r0
            com.google.protobuf.z r0 = r6.f136682b
            r17 = r3
            com.google.common.f.n r3 = new com.google.common.f.n
            r18 = r4
            r4 = 35508(0x8ab4, float:4.9757E-41)
            r3.<init>(r4)
            r10.mo56379ah(r3)
            java.lang.String r3 = "Received unexpected conversationKey: %s"
            r10.mo56389s(r3, r0)
            java.lang.String r0 = ""
            goto L_0x00ff
        L_0x00e6:
            r16 = r0
            r17 = r3
            r18 = r4
            com.google.protobuf.z r0 = r6.f136682b
            java.nio.charset.Charset r3 = com.google.protobuf.C62972cr.f170009a
            java.lang.String r0 = r0.mo59170I(r3)
            java.lang.String r3 = "delta.conversationKey.toStringUtf8()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)
            java.lang.String r3 = "C#"
            java.lang.String r0 = p5462h.p5483m.C69764m.m101198r(r0, r3)
        L_0x00ff:
            com.google.android.apps.search.assistant.platform.f.g.f r3 = r1.f335335c
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = r3.f335676b
            if (r3 != 0) goto L_0x0107
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x0107:
            com.google.android.apps.search.assistant.platform.b.a.e r0 = r13.mo104604b(r12, r5, r0, r3)
            com.google.android.apps.search.assistant.platform.f.e.b.n r3 = new com.google.android.apps.search.assistant.platform.f.e.b.n
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r15)
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r14)
            r3.<init>(r11, r0)
            boolean r11 = r9.add(r3)
        L_0x011a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r7.add(r0)
            r0 = r16
            r3 = r17
            r4 = r18
            r5 = 1
            r10 = 10
            goto L_0x005d
        L_0x012c:
            r17 = r3
            r18 = r4
            com.google.assistant.e.j.ex r0 = r6.f136685e
            if (r0 != 0) goto L_0x0136
            com.google.assistant.e.j.ex r0 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x0136:
            java.lang.String r3 = "it.paramsDelta"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = p5462h.p5463a.C69540x.m100804k(r9, r5)
            r4.<init>(r5)
            java.util.Iterator r5 = r9.iterator()
        L_0x014a:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x015c
            java.lang.Object r7 = r5.next()
            com.google.android.apps.search.assistant.platform.f.e.b.n r7 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120563n) r7
            com.google.assistant.e.j.ep r7 = r7.f335319a
            r4.add(r7)
            goto L_0x014a
        L_0x015c:
            r5 = 0
            com.google.protobuf.cq r0 = r0.f136712a     // Catch:{ ct -> 0x0172 }
            java.lang.String r7 = "paramsDelta.paramList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r7)     // Catch:{ ct -> 0x0172 }
            com.google.android.libraries.search.assistant.i.d r7 = com.google.android.libraries.search.assistant.p2585i.p2586a.C33477a.f89592a     // Catch:{ ct -> 0x0172 }
            java.lang.String r10 = "CLIENT_EXECUTION_PARAMS"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r10)     // Catch:{ ct -> 0x0172 }
            com.google.protobuf.MessageLite r0 = com.google.android.libraries.search.assistant.p2585i.C33481e.m62059b(r0, r7)     // Catch:{ ct -> 0x0172 }
            com.google.assistant.e.i.a.bq r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51274bq) r0     // Catch:{ ct -> 0x0172 }
            goto L_0x0192
        L_0x0172:
            r0 = move-exception
            com.google.common.f.e r7 = com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac.f335229a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.x r0 = r7.mo56382g(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r7 = new com.google.common.f.n
            r10 = 35495(0x8aa7, float:4.9739E-41)
            r7.<init>(r10)
            r0.mo56379ah(r7)
            java.lang.String r7 = "Failed to parse execution params"
            r0.mo56386p(r7)
            r0 = r5
        L_0x0192:
            if (r0 == 0) goto L_0x01aa
            int r7 = r0.f133489a
            r7 = r7 & 32
            if (r7 == 0) goto L_0x01a1
            com.google.assistant.e.d.a.n r0 = r0.f133495g
            if (r0 != 0) goto L_0x01a2
            com.google.assistant.e.d.a.n r0 = com.google.assistant.p3897e.p3908d.p3909a.C51183n.f133226e
            goto L_0x01a2
        L_0x01a1:
            r0 = r5
        L_0x01a2:
            if (r0 != 0) goto L_0x01a5
            goto L_0x01aa
        L_0x01a5:
            r10 = r0
            r22 = r2
            goto L_0x052b
        L_0x01aa:
            boolean r0 = r4.isEmpty()
            java.lang.String r7 = "tts.OUTPUT"
            if (r0 == 0) goto L_0x01b4
        L_0x01b2:
            r0 = 0
            goto L_0x01de
        L_0x01b4:
            java.util.Iterator r0 = r4.iterator()
        L_0x01b8:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x01b2
            java.lang.Object r11 = r0.next()
            com.google.assistant.e.j.ep r11 = (com.google.assistant.p3897e.p3921j.C52083ep) r11
            int r13 = r11.f136692b
            if (r13 != r12) goto L_0x01cd
            java.lang.Object r11 = r11.f136693c
            com.google.assistant.e.j.ei r11 = (com.google.assistant.p3897e.p3921j.C52076ei) r11
            goto L_0x01cf
        L_0x01cd:
            com.google.assistant.e.j.ei r11 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x01cf:
            com.google.assistant.e.j.dy r11 = r11.f136668c
            if (r11 != 0) goto L_0x01d5
            com.google.assistant.e.j.dy r11 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x01d5:
            java.lang.String r11 = r11.f135936b
            boolean r11 = r11.equals(r7)
            if (r11 == 0) goto L_0x01b8
            r0 = 1
        L_0x01de:
            boolean r11 = r4.isEmpty()
            java.lang.String r13 = "device.WAIT_FOR_AUTHENTICATION"
            if (r11 == 0) goto L_0x01e8
        L_0x01e6:
            r11 = 0
            goto L_0x0212
        L_0x01e8:
            java.util.Iterator r11 = r4.iterator()
        L_0x01ec:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x01e6
            java.lang.Object r14 = r11.next()
            com.google.assistant.e.j.ep r14 = (com.google.assistant.p3897e.p3921j.C52083ep) r14
            int r15 = r14.f136692b
            if (r15 != r12) goto L_0x0201
            java.lang.Object r14 = r14.f136693c
            com.google.assistant.e.j.ei r14 = (com.google.assistant.p3897e.p3921j.C52076ei) r14
            goto L_0x0203
        L_0x0201:
            com.google.assistant.e.j.ei r14 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x0203:
            com.google.assistant.e.j.dy r14 = r14.f136668c
            if (r14 != 0) goto L_0x0209
            com.google.assistant.e.j.dy r14 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x0209:
            java.lang.String r14 = r14.f135936b
            boolean r14 = r14.equals(r13)
            if (r14 == 0) goto L_0x01ec
            r11 = 1
        L_0x0212:
            java.lang.String r14 = "newBuilder()"
            if (r0 == 0) goto L_0x0439
            if (r11 != 0) goto L_0x021a
            goto L_0x0439
        L_0x021a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.assistant.e.d.a.n r11 = com.google.assistant.p3897e.p3908d.p3909a.C51183n.f133226e
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.d.a.m r11 = (com.google.assistant.p3897e.p3908d.p3909a.C51182m) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r14)
            com.google.assistant.e.d.a.h r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            java.util.Iterator r15 = r4.iterator()
            r16 = r5
            r19 = r16
            r10 = 0
        L_0x0237:
            boolean r20 = r15.hasNext()
            if (r20 == 0) goto L_0x0360
            java.lang.Object r20 = r15.next()
            int r21 = r10 + 1
            if (r10 >= 0) goto L_0x0248
            p5462h.p5463a.C69540x.m100952j()
        L_0x0248:
            r12 = r20
            com.google.assistant.e.j.ep r12 = (com.google.assistant.p3897e.p3921j.C52083ep) r12
            r11.mo53540d()
            com.google.assistant.e.d.a.f r20 = com.google.assistant.p3897e.p3908d.p3909a.C51175f.f133205f
            com.google.protobuf.bn r20 = r20.createBuilder()
            r1 = r20
            com.google.assistant.e.d.a.e r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51174e) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r14)
            com.google.assistant.e.d.a.b r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            r20 = r15
            com.google.assistant.e.d.a.e r15 = r1.f133203a
            r15.copyOnWrite()
            com.google.protobuf.bv r15 = r15.instance
            com.google.assistant.e.d.a.f r15 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r15
            r22 = r2
            int r2 = r15.f133207a
            r23 = 1
            r2 = r2 | 1
            r15.f133207a = r2
            r15.f133208b = r10
            r1.mo53526b()
            int r2 = r12.f136694d
            com.google.assistant.e.d.a.e r15 = r1.f133203a
            r15.mo53531b(r2)
            com.google.assistant.e.d.a.f r1 = r1.mo53525a()
            r11.mo53538b(r1)
            if (r5 != 0) goto L_0x02a9
            int r1 = r12.f136692b
            r2 = 4
            if (r1 != r2) goto L_0x0294
            java.lang.Object r1 = r12.f136693c
            com.google.assistant.e.j.ei r1 = (com.google.assistant.p3897e.p3921j.C52076ei) r1
            goto L_0x0296
        L_0x0294:
            com.google.assistant.e.j.ei r1 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x0296:
            com.google.assistant.e.j.dy r1 = r1.f136668c
            if (r1 != 0) goto L_0x029c
            com.google.assistant.e.j.dy r1 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x029c:
            java.lang.String r1 = r1.f135936b
            boolean r1 = p5462h.p5473f.p5475b.C69664n.m101066l(r1, r7)
            if (r1 == 0) goto L_0x02a9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r5 = r1
        L_0x02a9:
            if (r16 != 0) goto L_0x02cb
            int r1 = r12.f136692b
            r2 = 4
            if (r1 != r2) goto L_0x02b5
            java.lang.Object r1 = r12.f136693c
            com.google.assistant.e.j.ei r1 = (com.google.assistant.p3897e.p3921j.C52076ei) r1
            goto L_0x02b7
        L_0x02b5:
            com.google.assistant.e.j.ei r1 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x02b7:
            com.google.assistant.e.j.dy r1 = r1.f136668c
            if (r1 != 0) goto L_0x02bd
            com.google.assistant.e.j.dy r1 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x02bd:
            java.lang.String r1 = r1.f135936b
            boolean r1 = p5462h.p5473f.p5475b.C69664n.m101066l(r1, r13)
            if (r1 == 0) goto L_0x02cb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r16 = r1
        L_0x02cb:
            if (r19 != 0) goto L_0x02f0
            int r1 = r12.f136692b
            r2 = 4
            if (r1 != r2) goto L_0x02d7
            java.lang.Object r1 = r12.f136693c
            com.google.assistant.e.j.ei r1 = (com.google.assistant.p3897e.p3921j.C52076ei) r1
            goto L_0x02d9
        L_0x02d7:
            com.google.assistant.e.j.ei r1 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x02d9:
            com.google.assistant.e.j.dy r1 = r1.f136668c
            if (r1 != 0) goto L_0x02df
            com.google.assistant.e.j.dy r1 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x02df:
            java.lang.String r1 = r1.f135936b
            java.lang.String r12 = "credential.UPDATE"
            boolean r1 = p5462h.p5473f.p5475b.C69664n.m101066l(r1, r12)
            if (r1 == 0) goto L_0x02f1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r19 = r1
            goto L_0x02f1
        L_0x02f0:
            r2 = 4
        L_0x02f1:
            if (r16 != 0) goto L_0x02f4
            goto L_0x02fb
        L_0x02f4:
            int r1 = r16.intValue()
            if (r1 != r10) goto L_0x02fb
            goto L_0x0355
        L_0x02fb:
            if (r5 != 0) goto L_0x02fe
            goto L_0x0305
        L_0x02fe:
            int r1 = r5.intValue()
            if (r1 != r10) goto L_0x0305
            goto L_0x0355
        L_0x0305:
            if (r19 != 0) goto L_0x0308
            goto L_0x030f
        L_0x0308:
            int r1 = r19.intValue()
            if (r1 != r10) goto L_0x030f
            goto L_0x0355
        L_0x030f:
            com.google.assistant.e.d.a.l r1 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.d.a.i r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r14)
            com.google.assistant.e.d.a.d r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.assistant.e.d.a.k r12 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.START_BBS
            r1.mo53528b(r12)
            r1.mo53529c()
            com.google.assistant.e.d.a.i r12 = r1.f133204a
            r12.mo53543b(r10)
            com.google.assistant.e.d.a.l r1 = r1.mo53527a()
            r0.add(r1)
            com.google.assistant.e.d.a.l r1 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.d.a.i r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r14)
            com.google.assistant.e.d.a.d r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.assistant.e.d.a.k r12 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.JOIN_BBS
            r1.mo53528b(r12)
            r1.mo53529c()
            com.google.assistant.e.d.a.i r12 = r1.f133204a
            r12.mo53543b(r10)
            com.google.assistant.e.d.a.l r1 = r1.mo53527a()
            r0.add(r1)
        L_0x0355:
            r1 = r24
            r15 = r20
            r10 = r21
            r2 = r22
            r12 = 4
            goto L_0x0237
        L_0x0360:
            r22 = r2
            r11.mo53541e()
            com.google.assistant.e.d.a.l r1 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.d.a.i r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r14)
            com.google.assistant.e.d.a.d r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.assistant.e.d.a.k r2 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.START_BBS
            r1.mo53528b(r2)
            r1.mo53529c()
            p5462h.p5473f.p5475b.C69664n.m101058d(r5)
            int r2 = r5.intValue()
            com.google.assistant.e.d.a.i r7 = r1.f133204a
            r7.mo53543b(r2)
            r1.mo53529c()
            p5462h.p5473f.p5475b.C69664n.m101058d(r16)
            int r2 = r16.intValue()
            com.google.assistant.e.d.a.i r7 = r1.f133204a
            r7.mo53543b(r2)
            if (r19 == 0) goto L_0x03a5
            r1.mo53529c()
            int r2 = r19.intValue()
            com.google.assistant.e.d.a.i r7 = r1.f133204a
            r7.mo53543b(r2)
        L_0x03a5:
            com.google.assistant.e.d.a.l r1 = r1.mo53527a()
            r11.mo53539c(r1)
            r11.mo53541e()
            com.google.assistant.e.d.a.l r1 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.d.a.i r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r14)
            com.google.assistant.e.d.a.d r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.assistant.e.d.a.k r2 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.JOIN_BBS
            r1.mo53528b(r2)
            r1.mo53529c()
            int r2 = r5.intValue()
            com.google.assistant.e.d.a.i r5 = r1.f133204a
            r5.mo53543b(r2)
            r1.mo53529c()
            int r2 = r16.intValue()
            com.google.assistant.e.d.a.i r5 = r1.f133204a
            r5.mo53543b(r2)
            if (r19 == 0) goto L_0x03e9
            r1.mo53529c()
            int r2 = r19.intValue()
            com.google.assistant.e.d.a.i r5 = r1.f133204a
            r5.mo53543b(r2)
        L_0x03e9:
            com.google.assistant.e.d.a.l r1 = r1.mo53527a()
            r11.mo53539c(r1)
            r11.mo53541e()
            com.google.assistant.e.d.a.m r1 = r11.f133212a
            r1.mo53547b(r0)
            r11.mo53541e()
            com.google.assistant.e.d.a.l r0 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.d.a.i r0 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r14)
            com.google.assistant.e.d.a.d r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            com.google.assistant.e.d.a.k r1 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.SEND_RESPONSE
            r0.mo53528b(r1)
            com.google.assistant.e.d.a.l r0 = r0.mo53527a()
            r11.mo53539c(r0)
            r11.mo53541e()
            com.google.assistant.e.d.a.l r0 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.d.a.i r0 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r14)
            com.google.assistant.e.d.a.d r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            com.google.assistant.e.d.a.k r1 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.FINISH
            r0.mo53528b(r1)
            com.google.assistant.e.d.a.l r0 = r0.mo53527a()
            r11.mo53539c(r0)
            com.google.assistant.e.d.a.n r5 = r11.mo53537a()
            goto L_0x043b
        L_0x0439:
            r22 = r2
        L_0x043b:
            if (r5 == 0) goto L_0x0440
            r10 = r5
            goto L_0x052b
        L_0x0440:
            com.google.assistant.e.d.a.n r0 = com.google.assistant.p3897e.p3908d.p3909a.C51183n.f133226e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.d.a.m r0 = (com.google.assistant.p3897e.p3908d.p3909a.C51182m) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r14)
            com.google.assistant.e.d.a.h r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            java.util.Iterator r1 = r4.iterator()
            r10 = 0
        L_0x0454:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x04ea
            java.lang.Object r2 = r1.next()
            int r4 = r10 + 1
            if (r10 >= 0) goto L_0x0465
            p5462h.p5463a.C69540x.m100952j()
        L_0x0465:
            com.google.assistant.e.j.ep r2 = (com.google.assistant.p3897e.p3921j.C52083ep) r2
            r0.mo53540d()
            com.google.assistant.e.d.a.f r5 = com.google.assistant.p3897e.p3908d.p3909a.C51175f.f133205f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.d.a.e r5 = (com.google.assistant.p3897e.p3908d.p3909a.C51174e) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r14)
            com.google.assistant.e.d.a.b r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            com.google.assistant.e.d.a.e r7 = r5.f133203a
            r7.copyOnWrite()
            com.google.protobuf.bv r7 = r7.instance
            com.google.assistant.e.d.a.f r7 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r7
            int r11 = r7.f133207a
            r12 = 1
            r11 = r11 | r12
            r7.f133207a = r11
            r7.f133208b = r10
            r5.mo53526b()
            int r2 = r2.f136694d
            com.google.assistant.e.d.a.e r7 = r5.f133203a
            r7.mo53531b(r2)
            com.google.assistant.e.d.a.f r2 = r5.mo53525a()
            r0.mo53538b(r2)
            r0.mo53541e()
            com.google.assistant.e.d.a.l r2 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.d.a.i r2 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r14)
            com.google.assistant.e.d.a.d r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.assistant.e.d.a.k r5 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.START_BBS
            r2.mo53528b(r5)
            r2.mo53529c()
            com.google.assistant.e.d.a.i r5 = r2.f133204a
            r5.mo53543b(r10)
            com.google.assistant.e.d.a.l r2 = r2.mo53527a()
            r0.mo53539c(r2)
            r0.mo53541e()
            com.google.assistant.e.d.a.l r2 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.d.a.i r2 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r14)
            com.google.assistant.e.d.a.d r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.assistant.e.d.a.k r5 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.JOIN_BBS
            r2.mo53528b(r5)
            r2.mo53529c()
            com.google.assistant.e.d.a.i r5 = r2.f133204a
            r5.mo53543b(r10)
            com.google.assistant.e.d.a.l r2 = r2.mo53527a()
            r0.mo53539c(r2)
            r10 = r4
            goto L_0x0454
        L_0x04ea:
            r0.mo53541e()
            com.google.assistant.e.d.a.l r1 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.d.a.i r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r14)
            com.google.assistant.e.d.a.d r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.assistant.e.d.a.k r2 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.SEND_RESPONSE
            r1.mo53528b(r2)
            com.google.assistant.e.d.a.l r1 = r1.mo53527a()
            r0.mo53539c(r1)
            r0.mo53541e()
            com.google.assistant.e.d.a.l r1 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.d.a.i r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r14)
            com.google.assistant.e.d.a.d r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.assistant.e.d.a.k r2 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.FINISH
            r1.mo53528b(r2)
            com.google.assistant.e.d.a.l r1 = r1.mo53527a()
            r0.mo53539c(r1)
            com.google.assistant.e.d.a.n r0 = r0.mo53537a()
            r10 = r0
        L_0x052b:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac.f335229a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 35490(0x8aa2, float:4.9732E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Got execution plan: %s"
            r0.mo56389s(r1, r10)
            com.google.android.apps.search.assistant.platform.f.e.b.m r0 = new com.google.android.apps.search.assistant.platform.f.e.b.m
            com.google.assistant.e.j.ex r1 = r6.f136685e
            if (r1 != 0) goto L_0x054b
            com.google.assistant.e.j.ex r1 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x054b:
            r11 = r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r3)
            com.google.protobuf.z r12 = r6.f136683c
            java.lang.String r1 = "it.opaqueToken"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r1)
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            r2 = r22
            r1 = 1
            r2.f335331b = r1
            r1 = r18
            java.lang.Object r0 = r1.mo20883a(r0, r2)
            r1 = r17
            if (r0 != r1) goto L_0x056a
            return r1
        L_0x056a:
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120568s.mo20883a(java.lang.Object, h.c.g):java.lang.Object");
    }
}
