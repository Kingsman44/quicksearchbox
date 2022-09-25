package com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119779aa;
import com.google.android.apps.search.assistant.platform.p9005b.p9041d.C119942a;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.C120479b;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120601c;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120691f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35483j;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.p4526f.C59071e;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;

/* renamed from: com.google.android.apps.search.assistant.platform.f.e.b.ac */
/* compiled from: PG */
public final class C120546ac {

    /* renamed from: a */
    public static final C59071e f335229a = C59071e.m91331h();

    /* renamed from: b */
    public final C120601c f335230b;

    /* renamed from: c */
    public final C37215b f335231c;

    /* renamed from: d */
    public final C119942a f335232d;

    /* renamed from: e */
    public final C71788b f335233e = new C71799m();

    /* renamed from: f */
    public final Set f335234f = new LinkedHashSet();

    /* renamed from: g */
    public final C120554e f335235g;

    /* renamed from: h */
    public final C71816z f335236h;

    /* renamed from: i */
    private final C120555f f335237i;

    /* renamed from: j */
    private final C71422aw f335238j;

    /* renamed from: k */
    private final C119779aa f335239k;

    /* renamed from: l */
    private final C120479b f335240l;

    /* renamed from: m */
    private final C21370a f335241m;

    /* renamed from: n */
    private final C33480d f335242n = C33480d.m62053a("apa_execute_remote_result", "com.google.android.libraries.search.assistant.performer.crossdevice.proto.ApaExecuteRemoteResult", C35483j.f93186d);

    /* renamed from: o */
    private final C71604be f335243o;

    public C120546ac(C120601c cVar, C37215b bVar, C120555f fVar, C119942a aVar, C71422aw awVar, C119779aa aaVar, C120479b bVar2, C120691f fVar2, C21370a aVar2) {
        this.f335230b = cVar;
        this.f335231c = bVar;
        this.f335237i = fVar;
        this.f335232d = aVar;
        this.f335238j = awVar;
        this.f335239k = aaVar;
        this.f335240l = bVar2;
        this.f335241m = aVar2;
        C71422aw awVar2 = (C71422aw) fVar.f335291a.mo17428b();
        awVar2.getClass();
        C21370a aVar3 = (C21370a) fVar.f335292b.mo17428b();
        aVar3.getClass();
        this.f335235g = new C120554e(awVar2, aVar3);
        this.f335236h = new C71816z();
        this.f335243o = C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C120573x(this, fVar2, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104822a(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120564o
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.platform.f.e.b.o r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120564o) r0
            int r1 = r0.f335324d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335324d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.e.b.o r0 = new com.google.android.apps.search.assistant.platform.f.e.b.o
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f335322b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335324d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0056
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            java.lang.Object r2 = r0.f335321a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0048
        L_0x0038:
            p5462h.C69714l.m101134b(r6)
            kotlinx.coroutines.be r6 = r5.f335243o
            r0.f335321a = r5
            r0.f335324d = r4
            java.lang.Object r6 = kotlinx.coroutines.C71647ct.m104637a(r6, r0)
            if (r6 == r1) goto L_0x0059
            r2 = r5
        L_0x0048:
            r6 = 0
            r0.f335321a = r6
            r0.f335324d = r3
            com.google.android.apps.search.assistant.platform.f.e.b.ac r2 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac) r2
            java.lang.Object r6 = r2.mo104823b(r0)
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac.mo104822a(h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.platform.f.e.b.ac} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.apps.search.assistant.platform.f.e.b.ac} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.apps.search.assistant.platform.f.e.b.ac} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063 A[Catch:{ all -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104823b(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120565p
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.platform.f.e.b.p r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120565p) r0
            int r1 = r0.f335329e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335329e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.e.b.p r0 = new com.google.android.apps.search.assistant.platform.f.e.b.p
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f335327c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335329e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r1 = r0.f335326b
            java.lang.Object r0 = r0.f335325a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0054
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            p5462h.C69714l.m101134b(r7)
            kotlinx.coroutines.be r7 = r6.f335243o
            boolean r7 = r7.mo62875x()
            if (r7 != 0) goto L_0x0044
            kotlinx.coroutines.be r7 = r6.f335243o
            r7.mo62723u(r4)
        L_0x0044:
            kotlinx.coroutines.j.b r7 = r6.f335233e
            r0.f335325a = r6
            r0.f335326b = r7
            r0.f335329e = r3
            java.lang.Object r0 = r7.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x00ab
            r0 = r6
            r1 = r7
        L_0x0054:
            r7 = r0
            com.google.android.apps.search.assistant.platform.f.e.b.ac r7 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac) r7     // Catch:{ all -> 0x00a6 }
            java.util.Set r7 = r7.f335234f     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x005d:
            boolean r2 = r7.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r2 == 0) goto L_0x0099
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x00a6 }
            com.google.android.apps.search.assistant.platform.f.e.b.m r2 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120562m) r2     // Catch:{ all -> 0x00a6 }
            java.util.List r3 = r2.f335314a     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x006f:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r5 == 0) goto L_0x0081
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00a6 }
            com.google.android.apps.search.assistant.platform.f.e.b.n r5 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120563n) r5     // Catch:{ all -> 0x00a6 }
            com.google.android.apps.search.assistant.platform.b.a.e r5 = r5.f335320b     // Catch:{ all -> 0x00a6 }
            r5.mo104300b()     // Catch:{ all -> 0x00a6 }
            goto L_0x006f
        L_0x0081:
            java.util.List r2 = r2.f335315b     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x0087:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r3 == 0) goto L_0x005d
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a6 }
            com.google.android.apps.search.assistant.platform.f.e.b.n r3 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120563n) r3     // Catch:{ all -> 0x00a6 }
            com.google.android.apps.search.assistant.platform.b.a.e r3 = r3.f335320b     // Catch:{ all -> 0x00a6 }
            r3.mo104300b()     // Catch:{ all -> 0x00a6 }
            goto L_0x0087
        L_0x0099:
            com.google.android.apps.search.assistant.platform.f.e.b.ac r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac) r0     // Catch:{ all -> 0x00a6 }
            java.util.Set r7 = r0.f335234f     // Catch:{ all -> 0x00a6 }
            r7.clear()     // Catch:{ all -> 0x00a6 }
            r1.mo63026c(r4)
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x00a6:
            r7 = move-exception
            r1.mo63026c(r4)
            throw r7
        L_0x00ab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac.mo104823b(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.platform.f.e.b.ac} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.apps.search.assistant.platform.f.e.b.ac} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.android.apps.search.assistant.platform.f.e.b.ac} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104825d(p5462h.p5466c.C69577g r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120575z
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.apps.search.assistant.platform.f.e.b.z r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120575z) r0
            int r1 = r0.f335371d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335371d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.e.b.z r0 = new com.google.android.apps.search.assistant.platform.f.e.b.z
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f335369b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335371d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f335368a
            p5462h.C69714l.m101134b(r13)
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0031:
            p5462h.C69714l.m101134b(r13)
            kotlinx.coroutines.be r13 = r12.f335243o
            r0.f335368a = r12
            r0.f335371d = r3
            java.lang.Object r13 = r13.mo62825a(r0)
            if (r13 == r1) goto L_0x0272
            r0 = r12
        L_0x0041:
            java.util.List r13 = (java.util.List) r13
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.android.libraries.search.assistant.h.a.c.k r2 = com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33457k.f89561b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.search.assistant.h.a.c.j r2 = (com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33456j) r2
            java.lang.String r4 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            java.util.Iterator r13 = r13.iterator()
        L_0x0059:
            boolean r4 = r13.hasNext()
            r5 = 3
            if (r4 == 0) goto L_0x01bc
            java.lang.Object r4 = r13.next()
            com.google.android.apps.search.assistant.platform.f.e.b.ae r4 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120548ae) r4
            com.google.assistant.e.j.ep r6 = r4.f335253a
            int r7 = r6.f136692b
            r8 = 4
            if (r7 != r8) goto L_0x0072
            java.lang.Object r6 = r6.f136693c
            com.google.assistant.e.j.ei r6 = (com.google.assistant.p3897e.p3921j.C52076ei) r6
            goto L_0x0074
        L_0x0072:
            com.google.assistant.e.j.ei r6 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x0074:
            com.google.assistant.e.j.dy r6 = r6.f136668c
            if (r6 != 0) goto L_0x007a
            com.google.assistant.e.j.dy r6 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x007a:
            java.lang.String r7 = "interactionResult.source…on.fromAssistant.clientOp"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            com.google.assistant.e.j.ec r7 = r4.f335254b
            com.google.assistant.e.j.kg r8 = r7.f136654b
            if (r8 != 0) goto L_0x0087
            com.google.assistant.e.j.kg r8 = com.google.assistant.p3897e.p3921j.C52236kg.f137089d
        L_0x0087:
            int r8 = r8.f137092b
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.m86549a(r8)
            if (r8 != 0) goto L_0x0091
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.OK
        L_0x0091:
            com.google.assistant.e.j.kf r9 = com.google.assistant.p3897e.p3921j.C52235kf.IGNORE
            if (r8 == r9) goto L_0x00df
            com.google.assistant.e.j.kg r8 = r7.f136654b
            if (r8 != 0) goto L_0x009b
            com.google.assistant.e.j.kg r8 = com.google.assistant.p3897e.p3921j.C52236kg.f137089d
        L_0x009b:
            int r8 = r8.f137092b
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.m86549a(r8)
            if (r8 != 0) goto L_0x00a5
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.OK
        L_0x00a5:
            com.google.assistant.e.j.kf r9 = com.google.assistant.p3897e.p3921j.C52235kf.OK
            if (r8 == r9) goto L_0x00df
            com.google.android.libraries.search.assistant.h.a.c.h r8 = com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33454h.f89556d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.search.assistant.h.a.c.g r8 = (com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33453g) r8
            java.lang.String r9 = r6.f135936b
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.search.assistant.h.a.c.h r10 = (com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33454h) r10
            r9.getClass()
            int r11 = r10.f89558a
            r11 = r11 | r3
            r10.f89558a = r11
            r10.f89559b = r9
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.libraries.search.assistant.h.a.c.h r9 = (com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33454h) r9
            r7.getClass()
            r9.f89560c = r7
            int r10 = r9.f89558a
            r10 = r10 | 2
            r9.f89558a = r10
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.libraries.search.assistant.h.a.c.h r8 = (com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33454h) r8
            r2.mo38868a(r8)
        L_0x00df:
            java.lang.String r8 = r6.f135936b
            com.google.common.b.ij r9 = com.google.android.apps.search.assistant.libraries.p8966e.C119337a.f332732a
            com.google.common.b.qy r9 = (com.google.common.p4522b.C58759qy) r9
            java.lang.Object r9 = r9.f156534a
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0167
            java.lang.String r4 = r6.f135936b
            java.lang.String r6 = "apa.EXECUTE_REMOTE"
            boolean r4 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r6)
            if (r4 == 0) goto L_0x0163
            com.google.assistant.e.j.eb r4 = r7.f136655c
            if (r4 != 0) goto L_0x00fd
            com.google.assistant.e.j.eb r4 = com.google.assistant.p3897e.p3921j.C52069eb.f136648b
        L_0x00fd:
            com.google.protobuf.cq r4 = r4.f136650a
            java.lang.String r6 = "clientOpResult.results.resultList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            r6 = r0
            com.google.android.apps.search.assistant.platform.f.e.b.ac r6 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac) r6
            com.google.android.libraries.search.assistant.i.d r6 = r6.f335242n
            com.google.protobuf.MessageLite r4 = com.google.android.libraries.search.assistant.p2585i.C33481e.m62058a(r4, r6)
            com.google.android.libraries.search.assistant.performer.b.a.j r4 = (com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35483j) r4
            com.google.protobuf.cq r4 = r4.f93189b
            java.util.Iterator r4 = r4.iterator()
        L_0x0115:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0059
            java.lang.Object r6 = r4.next()
            com.google.android.libraries.search.assistant.performer.b.a.i r6 = (com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35482i) r6
            com.google.protobuf.cq r6 = r6.f93184b
            java.util.Iterator r6 = r6.iterator()
        L_0x0127:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0115
            java.lang.Object r7 = r6.next()
            com.google.android.libraries.search.assistant.performer.b.a.h r7 = (com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35481h) r7
            com.google.assistant.e.j.ep r8 = r7.f93177b
            if (r8 != 0) goto L_0x013a
            com.google.assistant.e.j.ep r9 = com.google.assistant.p3897e.p3921j.C52083ep.f136689f
            goto L_0x013b
        L_0x013a:
            r9 = r8
        L_0x013b:
            int r9 = r9.f136695e
            if (r8 != 0) goto L_0x0141
            com.google.assistant.e.j.ep r8 = com.google.assistant.p3897e.p3921j.C52083ep.f136689f
        L_0x0141:
            int r9 = r8.f136692b
            if (r9 != r5) goto L_0x014a
            java.lang.Object r8 = r8.f136693c
            com.google.assistant.e.j.ek r8 = (com.google.assistant.p3897e.p3921j.C52078ek) r8
            goto L_0x014c
        L_0x014a:
            com.google.assistant.e.j.ek r8 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
        L_0x014c:
            int r9 = r8.f136674b
            if (r9 != r5) goto L_0x0154
            java.lang.Object r8 = r8.f136675c
            com.google.assistant.e.j.ec r8 = (com.google.assistant.p3897e.p3921j.C52070ec) r8
        L_0x0154:
            com.google.assistant.e.j.ep r7 = r7.f93177b
            if (r7 != 0) goto L_0x015a
            com.google.assistant.e.j.ep r7 = com.google.assistant.p3897e.p3921j.C52083ep.f136689f
        L_0x015a:
            java.lang.String r8 = "clientOpExecutionResult.interaction"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            r1.add(r7)
            goto L_0x0127
        L_0x0163:
            com.google.assistant.e.j.kg r4 = r7.f136654b
            goto L_0x0059
        L_0x0167:
            com.google.assistant.e.j.kg r6 = r7.f136654b
            com.google.assistant.e.j.ep r6 = com.google.assistant.p3897e.p3921j.C52083ep.f136689f
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.eo r6 = (com.google.assistant.p3897e.p3921j.C52082eo) r6
            com.google.assistant.e.j.ep r4 = r4.f335253a
            int r4 = r4.f136694d
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.assistant.e.j.ep r8 = (com.google.assistant.p3897e.p3921j.C52083ep) r8
            int r9 = r8.f136691a
            r9 = r9 | 2
            r8.f136691a = r9
            r8.f136695e = r4
            com.google.assistant.e.j.ek r4 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.ej r4 = (com.google.assistant.p3897e.p3921j.C52077ej) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r8 = r4.instance
            com.google.assistant.e.j.ek r8 = (com.google.assistant.p3897e.p3921j.C52078ek) r8
            r7.getClass()
            r8.f136675c = r7
            r8.f136674b = r5
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.j.ep r7 = (com.google.assistant.p3897e.p3921j.C52083ep) r7
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.e.j.ek r4 = (com.google.assistant.p3897e.p3921j.C52078ek) r4
            r4.getClass()
            r7.f136693c = r4
            r7.f136692b = r5
            com.google.protobuf.bv r4 = r6.build()
            java.lang.String r5 = "newBuilder()\n           …   )\n            .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            r1.add(r4)
            goto L_0x0059
        L_0x01bc:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x01ca:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0251
            java.lang.Object r4 = r1.next()
            r6 = r4
            com.google.assistant.e.j.ep r6 = (com.google.assistant.p3897e.p3921j.C52083ep) r6
            int r7 = r6.f136692b
            if (r7 != r5) goto L_0x01e0
            java.lang.Object r7 = r6.f136693c
            com.google.assistant.e.j.ek r7 = (com.google.assistant.p3897e.p3921j.C52078ek) r7
            goto L_0x01e2
        L_0x01e0:
            com.google.assistant.e.j.ek r7 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
        L_0x01e2:
            int r8 = r7.f136674b
            if (r8 != r5) goto L_0x01eb
            java.lang.Object r7 = r7.f136675c
            com.google.assistant.e.j.ec r7 = (com.google.assistant.p3897e.p3921j.C52070ec) r7
            goto L_0x01ed
        L_0x01eb:
            com.google.assistant.e.j.ec r7 = com.google.assistant.p3897e.p3921j.C52070ec.f136651d
        L_0x01ed:
            int r7 = r7.f136653a
            r7 = r7 & r3
            if (r7 == 0) goto L_0x024c
            int r7 = r6.f136692b
            if (r7 != r5) goto L_0x01fb
            java.lang.Object r7 = r6.f136693c
            com.google.assistant.e.j.ek r7 = (com.google.assistant.p3897e.p3921j.C52078ek) r7
            goto L_0x01fd
        L_0x01fb:
            com.google.assistant.e.j.ek r7 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
        L_0x01fd:
            int r8 = r7.f136674b
            if (r8 != r5) goto L_0x0206
            java.lang.Object r7 = r7.f136675c
            com.google.assistant.e.j.ec r7 = (com.google.assistant.p3897e.p3921j.C52070ec) r7
            goto L_0x0208
        L_0x0206:
            com.google.assistant.e.j.ec r7 = com.google.assistant.p3897e.p3921j.C52070ec.f136651d
        L_0x0208:
            com.google.assistant.e.j.kg r7 = r7.f136654b
            if (r7 != 0) goto L_0x020e
            com.google.assistant.e.j.kg r7 = com.google.assistant.p3897e.p3921j.C52236kg.f137089d
        L_0x020e:
            int r7 = r7.f137092b
            com.google.assistant.e.j.kf r7 = com.google.assistant.p3897e.p3921j.C52235kf.m86549a(r7)
            if (r7 != 0) goto L_0x0218
            com.google.assistant.e.j.kf r7 = com.google.assistant.p3897e.p3921j.C52235kf.OK
        L_0x0218:
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.IGNORE
            if (r7 == r8) goto L_0x024c
            int r7 = r6.f136692b
            if (r7 != r5) goto L_0x0225
            java.lang.Object r6 = r6.f136693c
            com.google.assistant.e.j.ek r6 = (com.google.assistant.p3897e.p3921j.C52078ek) r6
            goto L_0x0227
        L_0x0225:
            com.google.assistant.e.j.ek r6 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
        L_0x0227:
            int r7 = r6.f136674b
            if (r7 != r5) goto L_0x0230
            java.lang.Object r6 = r6.f136675c
            com.google.assistant.e.j.ec r6 = (com.google.assistant.p3897e.p3921j.C52070ec) r6
            goto L_0x0232
        L_0x0230:
            com.google.assistant.e.j.ec r6 = com.google.assistant.p3897e.p3921j.C52070ec.f136651d
        L_0x0232:
            com.google.assistant.e.j.kg r6 = r6.f136654b
            if (r6 != 0) goto L_0x0238
            com.google.assistant.e.j.kg r6 = com.google.assistant.p3897e.p3921j.C52236kg.f137089d
        L_0x0238:
            int r6 = r6.f137092b
            com.google.assistant.e.j.kf r6 = com.google.assistant.p3897e.p3921j.C52235kf.m86549a(r6)
            if (r6 != 0) goto L_0x0242
            com.google.assistant.e.j.kf r6 = com.google.assistant.p3897e.p3921j.C52235kf.OK
        L_0x0242:
            com.google.assistant.e.j.kf r7 = com.google.assistant.p3897e.p3921j.C52235kf.UNIMPLEMENTED
            if (r6 != r7) goto L_0x0247
            goto L_0x024c
        L_0x0247:
            r0.add(r4)
            goto L_0x01ca
        L_0x024c:
            r13.add(r4)
            goto L_0x01ca
        L_0x0251:
            h.i r1 = new h.i
            r1.<init>(r13, r0)
            java.lang.Object r13 = r1.f186052a
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r0 = r1.f186053b
            java.util.List r0 = (java.util.List) r0
            com.google.common.b.gu r0 = com.google.common.p4522b.C58479go.m89810b(r0)
            com.google.common.b.gu r13 = com.google.common.p4522b.C58479go.m89810b(r13)
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.libraries.search.assistant.h.a.c.k r1 = (com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33457k) r1
            com.google.android.apps.search.assistant.platform.f.e.a.a r2 = new com.google.android.apps.search.assistant.platform.f.e.a.a
            r2.<init>(r0, r13, r1)
            return r2
        L_0x0272:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac.mo104825d(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.google.android.apps.search.assistant.platform.f.e.b.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.util.Iterator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01a2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104824c(java.util.List r19, java.util.List r20, p5462h.p5466c.C69577g r21) {
        /*
            r18 = this;
            r0 = r21
            boolean r1 = r0 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120574y
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.google.android.apps.search.assistant.platform.f.e.b.y r1 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120574y) r1
            int r2 = r1.f335367i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f335367i = r2
            r2 = r18
            goto L_0x001e
        L_0x0017:
            com.google.android.apps.search.assistant.platform.f.e.b.y r1 = new com.google.android.apps.search.assistant.platform.f.e.b.y
            r2 = r18
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f335365g
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r1.f335367i
            java.lang.String r5 = "ofNanos(clock.elapsedRealtimeNanos())"
            java.lang.String r6 = "startNanos"
            r7 = 1
            if (r4 == 0) goto L_0x005b
            if (r4 != r7) goto L_0x0053
            java.lang.Object r4 = r1.f335364f
            java.lang.Object r8 = r1.f335363e
            java.lang.Object r9 = r1.f335362d
            java.lang.Object r10 = r1.f335361c
            java.lang.Object r11 = r1.f335360b
            java.lang.Object r12 = r1.f335359a
            p5462h.C69714l.m101134b(r0)     // Catch:{ Exception -> 0x0047 }
            r17 = r3
            r3 = r1
            r1 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r17
            goto L_0x00af
        L_0x0047:
            r0 = move-exception
            r17 = r3
            r3 = r1
            r1 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r17
            goto L_0x00f8
        L_0x0053:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005b:
            p5462h.C69714l.m101134b(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r19.iterator()
            r10 = r0
            r12 = r2
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r20
        L_0x006e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01a2
            java.lang.Object r0 = r9.next()
            r8 = r0
            com.google.android.apps.search.assistant.platform.f.e.b.n r8 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120563n) r8
            r0 = r12
            com.google.android.apps.search.assistant.platform.f.e.b.ac r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac) r0
            com.google.android.libraries.f.a r0 = r0.f335241m
            long r13 = r0.mo26872d()
            j$.time.Duration r11 = p3186j$.time.Duration.ofNanos(r13)
            com.google.android.apps.search.assistant.platform.b.a.e r0 = r8.f335320b     // Catch:{ Exception -> 0x00ef }
            com.google.common.util.concurrent.cx r0 = r0.mo104299a()     // Catch:{ Exception -> 0x00ef }
            java.lang.String r13 = "session.clientOpPrefetchSession.commit()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r13)     // Catch:{ Exception -> 0x00ef }
            r3.f335359a = r12     // Catch:{ Exception -> 0x00ef }
            r3.f335360b = r1     // Catch:{ Exception -> 0x00ef }
            r3.f335361c = r10     // Catch:{ Exception -> 0x00ef }
            r3.f335362d = r9     // Catch:{ Exception -> 0x00ef }
            r3.f335363e = r8     // Catch:{ Exception -> 0x00ef }
            r3.f335364f = r11     // Catch:{ Exception -> 0x00ef }
            r3.f335367i = r7     // Catch:{ Exception -> 0x00ef }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r3)     // Catch:{ Exception -> 0x00ef }
            if (r0 == r4) goto L_0x00ee
            r17 = r8
            r8 = r4
            r4 = r11
            r11 = r10
            r10 = r9
            r9 = r17
        L_0x00af:
            com.google.assistant.e.j.ec r0 = (com.google.assistant.p3897e.p3921j.C52070ec) r0     // Catch:{ Exception -> 0x00ec }
            com.google.android.apps.search.assistant.platform.f.e.b.ae r13 = new com.google.android.apps.search.assistant.platform.f.e.b.ae     // Catch:{ Exception -> 0x00ec }
            r14 = r9
            com.google.android.apps.search.assistant.platform.f.e.b.n r14 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120563n) r14     // Catch:{ Exception -> 0x00ec }
            com.google.assistant.e.j.ep r14 = r14.f335319a     // Catch:{ Exception -> 0x00ec }
            java.lang.String r15 = "clientOpResult"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r15)     // Catch:{ Exception -> 0x00ec }
            r13.<init>(r14, r0)     // Catch:{ Exception -> 0x00ec }
            r11.add(r13)     // Catch:{ Exception -> 0x00ec }
            r13 = r12
            com.google.android.apps.search.assistant.platform.f.e.b.ac r13 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac) r13     // Catch:{ Exception -> 0x00ec }
            com.google.android.apps.search.assistant.platform.f.e.b.e r13 = r13.f335235g     // Catch:{ Exception -> 0x00ec }
            r14 = r9
            com.google.android.apps.search.assistant.platform.f.e.b.n r14 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120563n) r14     // Catch:{ Exception -> 0x00ec }
            com.google.assistant.e.j.ep r14 = r14.f335319a     // Catch:{ Exception -> 0x00ec }
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)     // Catch:{ Exception -> 0x00ec }
            r15 = r12
            com.google.android.apps.search.assistant.platform.f.e.b.ac r15 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac) r15     // Catch:{ Exception -> 0x00ec }
            com.google.android.libraries.f.a r15 = r15.f335241m     // Catch:{ Exception -> 0x00ec }
            long r15 = r15.mo26872d()     // Catch:{ Exception -> 0x00ec }
            j$.time.Duration r15 = p3186j$.time.Duration.ofNanos(r15)     // Catch:{ Exception -> 0x00ec }
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r5)     // Catch:{ Exception -> 0x00ec }
            r7 = r4
            j$.time.Duration r7 = (p3186j$.time.Duration) r7     // Catch:{ Exception -> 0x00ec }
            j.a.c.c.a.d r0 = r13.mo104834c(r14, r0, r7, r15)     // Catch:{ Exception -> 0x00ec }
            r1.add(r0)     // Catch:{ Exception -> 0x00ec }
            goto L_0x019c
        L_0x00ec:
            r0 = move-exception
            goto L_0x00f8
        L_0x00ee:
            return r4
        L_0x00ef:
            r0 = move-exception
            r17 = r8
            r8 = r4
            r4 = r11
            r11 = r10
            r10 = r9
            r9 = r17
        L_0x00f8:
            com.google.common.f.e r7 = f335229a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.x r0 = r7.mo56382g(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.android.apps.search.assistant.platform.f.e.b.n r9 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120563n) r9
            com.google.assistant.e.j.ep r7 = r9.f335319a
            int r13 = r7.f136692b
            r14 = 4
            if (r13 != r14) goto L_0x0114
            java.lang.Object r7 = r7.f136693c
            com.google.assistant.e.j.ei r7 = (com.google.assistant.p3897e.p3921j.C52076ei) r7
            goto L_0x0116
        L_0x0114:
            com.google.assistant.e.j.ei r7 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x0116:
            com.google.assistant.e.j.dy r7 = r7.f136668c
            if (r7 != 0) goto L_0x011c
            com.google.assistant.e.j.dy r7 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x011c:
            java.lang.String r7 = r7.f135936b
            com.google.common.f.n r13 = new com.google.common.f.n
            r14 = 35500(0x8aac, float:4.9746E-41)
            r13.<init>(r14)
            r0.mo56379ah(r13)
            java.lang.String r13 = "Failed to commit APA-generated ClientOp: %s. Aborting session."
            r0.mo56389s(r13, r7)
            r0 = r12
            com.google.android.apps.search.assistant.platform.f.e.b.ac r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac) r0
            com.google.android.apps.search.assistant.platform.f.e.b.e r7 = r0.f335235g
            com.google.assistant.e.j.ep r13 = r9.f335319a
            com.google.assistant.e.j.ec r14 = com.google.assistant.p3897e.p3921j.C52070ec.f136651d
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.assistant.e.j.dz r14 = (com.google.assistant.p3897e.p3921j.C51810dz) r14
            com.google.assistant.e.j.kg r15 = com.google.assistant.p3897e.p3921j.C52236kg.f137089d
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.assistant.e.j.kd r15 = (com.google.assistant.p3897e.p3921j.C52233kd) r15
            com.google.assistant.e.j.kf r2 = com.google.assistant.p3897e.p3921j.C52235kf.UNKNOWN
            r15.copyOnWrite()
            r19 = r3
            com.google.protobuf.bv r3 = r15.instance
            com.google.assistant.e.j.kg r3 = (com.google.assistant.p3897e.p3921j.C52236kg) r3
            int r2 = r2.f137088t
            r3.f137092b = r2
            int r2 = r3.f137091a
            r16 = 1
            r2 = r2 | 1
            r3.f137091a = r2
            com.google.protobuf.bv r2 = r15.build()
            com.google.assistant.e.j.kg r2 = (com.google.assistant.p3897e.p3921j.C52236kg) r2
            r14.copyOnWrite()
            com.google.protobuf.bv r3 = r14.instance
            com.google.assistant.e.j.ec r3 = (com.google.assistant.p3897e.p3921j.C52070ec) r3
            r2.getClass()
            r3.f136654b = r2
            int r2 = r3.f136653a
            r2 = r2 | 1
            r3.f136653a = r2
            com.google.protobuf.bv r2 = r14.build()
            com.google.assistant.e.j.ec r2 = (com.google.assistant.p3897e.p3921j.C52070ec) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            com.google.android.libraries.f.a r0 = r0.f335241m
            long r14 = r0.mo26872d()
            j$.time.Duration r0 = p3186j$.time.Duration.ofNanos(r14)
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r5)
            j$.time.Duration r4 = (p3186j$.time.Duration) r4
            j.a.c.c.a.d r0 = r7.mo104834c(r13, r2, r4, r0)
            r1.add(r0)
            com.google.android.apps.search.assistant.platform.b.a.e r0 = r9.f335320b
            r0.mo104300b()
            r2 = r18
            r3 = r19
        L_0x019c:
            r4 = r8
            r9 = r10
            r10 = r11
            r7 = 1
            goto L_0x006e
        L_0x01a2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac.mo104824c(java.util.List, java.util.List, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104826e(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120544aa
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.platform.f.e.b.aa r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120544aa) r0
            int r1 = r0.f335225c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335225c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.e.b.aa r0 = new com.google.android.apps.search.assistant.platform.f.e.b.aa
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f335223a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335225c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p5462h.C69714l.m101134b(r5)     // Catch:{ Exception -> 0x0027 }
            goto L_0x004e
        L_0x0027:
            r5 = move-exception
            goto L_0x0068
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r5)
            com.google.android.apps.search.assistant.platform.b.a.d.aa r5 = r4.f335239k
            int r5 = r5.f333644a
            r5 = r5 & r3
            if (r5 == 0) goto L_0x008c
            com.google.android.apps.search.assistant.platform.f.b.b.b r5 = r4.f335240l     // Catch:{ Exception -> 0x0027 }
            com.google.common.util.concurrent.cx r5 = r5.mo104762b()     // Catch:{ Exception -> 0x0027 }
            java.lang.String r2 = "audioFocusPolicy.releaseFocus()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)     // Catch:{ Exception -> 0x0027 }
            r0.f335225c = r3     // Catch:{ Exception -> 0x0027 }
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)     // Catch:{ Exception -> 0x0027 }
            if (r5 == r1) goto L_0x0067
        L_0x004e:
            com.google.common.f.e r5 = f335229a     // Catch:{ Exception -> 0x0027 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ Exception -> 0x0027 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ Exception -> 0x0027 }
            java.lang.String r0 = "Released focus early."
            com.google.common.f.n r1 = new com.google.common.f.n     // Catch:{ Exception -> 0x0027 }
            r2 = 35504(0x8ab0, float:4.9752E-41)
            r1.<init>(r2)     // Catch:{ Exception -> 0x0027 }
            r5.mo56379ah(r1)     // Catch:{ Exception -> 0x0027 }
            r5.mo56386p(r0)     // Catch:{ Exception -> 0x0027 }
            goto L_0x008c
        L_0x0067:
            return r1
        L_0x0068:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x006d
            goto L_0x008c
        L_0x006d:
            com.google.common.f.e r0 = f335229a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r0 = r0.mo56382g(r5)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 35505(0x8ab1, float:4.9753E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Failed to release focus early."
            r0.mo56386p(r1)
            throw r5
        L_0x008c:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac.mo104826e(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104827f(com.google.assistant.p3897e.p3921j.C52091ex r5, com.google.protobuf.C63088z r6, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120545ab
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.platform.f.e.b.ab r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120545ab) r0
            int r1 = r0.f335228c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335228c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.e.b.ab r0 = new com.google.android.apps.search.assistant.platform.f.e.b.ab
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f335226a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335228c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x0027 }
            goto L_0x004c
        L_0x0027:
            r5 = move-exception
            goto L_0x0048
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.platform.b.d.a r7 = r4.f335232d     // Catch:{ Exception -> 0x0027 }
            com.google.common.util.concurrent.cx r5 = r7.mo104606d(r5, r6)     // Catch:{ Exception -> 0x0027 }
            java.lang.String r6 = "executionBackend.updateC…ationParams, opaqueToken)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ Exception -> 0x0027 }
            r0.f335228c = r3     // Catch:{ Exception -> 0x0027 }
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)     // Catch:{ Exception -> 0x0027 }
            if (r5 != r1) goto L_0x004c
            return r1
        L_0x0048:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L_0x004f
        L_0x004c:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        L_0x004f:
            com.google.common.f.e r6 = f335229a
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.x r6 = r6.mo56382g(r5)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r7 = new com.google.common.f.n
            r0 = 35507(0x8ab3, float:4.9756E-41)
            r7.<init>(r0)
            r6.mo56379ah(r7)
            java.lang.String r7 = "Client failed to receive conversation state update."
            r6.mo56386p(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120546ac.mo104827f(com.google.assistant.e.j.ex, com.google.protobuf.z, h.c.g):java.lang.Object");
    }
}
