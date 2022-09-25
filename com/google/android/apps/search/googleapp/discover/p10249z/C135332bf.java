package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Instant;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamprovider.TreeBinder$getStreamSubtree$2", mo61344c = "TreeBinder.kt", mo61345d = "invokeSuspend", mo61346e = {59, 73})
/* renamed from: com.google.android.apps.search.googleapp.discover.z.bf */
/* compiled from: PG */
final class C135332bf extends C69572j implements C69630p {

    /* renamed from: a */
    Object f368703a;

    /* renamed from: b */
    Object f368704b;

    /* renamed from: c */
    int f368705c;

    /* renamed from: d */
    final /* synthetic */ C135335bi f368706d;

    /* renamed from: e */
    final /* synthetic */ C134766q f368707e;

    /* renamed from: f */
    final /* synthetic */ Instant f368708f;

    /* renamed from: g */
    final /* synthetic */ String f368709g;

    /* renamed from: h */
    final /* synthetic */ int f368710h;

    /* renamed from: i */
    final /* synthetic */ C135327ba f368711i;

    /* renamed from: j */
    private /* synthetic */ Object f368712j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135332bf(C135335bi biVar, C134766q qVar, Instant instant, String str, int i, C135327ba baVar, C69577g gVar) {
        super(2, gVar);
        this.f368706d = biVar;
        this.f368707e = qVar;
        this.f368708f = instant;
        this.f368709g = str;
        this.f368710h = i;
        this.f368711i = baVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135332bf) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.apps.search.googleapp.discover.z.bj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.apps.search.googleapp.discover.z.bj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v97, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: com.google.android.apps.search.googleapp.discover.z.bj} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0565 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r32) {
        /*
            r31 = this;
            r8 = r31
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r8.f368705c
            r2 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r2) goto L_0x001c
            java.lang.Object r0 = r8.f368704b
            java.lang.Object r1 = r8.f368703a
            java.lang.Object r2 = r8.f368712j
            com.google.android.apps.search.googleapp.discover.s.au r2 = (com.google.android.apps.search.googleapp.discover.p10214s.C134556au) r2
            p5462h.C69714l.m101134b(r32)
            r11 = r2
            r2 = r1
            r1 = r32
            goto L_0x0551
        L_0x001c:
            java.lang.Object r1 = r8.f368712j
            kotlinx.coroutines.aw r1 = (kotlinx.coroutines.C71422aw) r1
            p5462h.C69714l.m101134b(r32)
            r3 = r32
            goto L_0x003b
        L_0x0026:
            p5462h.C69714l.m101134b(r32)
            java.lang.Object r1 = r8.f368712j
            kotlinx.coroutines.aw r1 = (kotlinx.coroutines.C71422aw) r1
            com.google.android.apps.search.googleapp.discover.z.bi r3 = r8.f368706d
            com.google.android.apps.search.googleapp.discover.streamui.h.q r4 = r8.f368707e
            r8.f368712j = r1
            r8.f368705c = r2
            java.lang.Object r3 = r3.mo112269c(r4, r8)
            if (r3 == r0) goto L_0x0587
        L_0x003b:
            r9 = r3
            com.google.android.apps.search.googleapp.discover.s.au r9 = (com.google.android.apps.search.googleapp.discover.p10214s.C134556au) r9
            j$.time.Instant r3 = r8.f368708f
            com.google.android.apps.search.googleapp.discover.streamui.h.q r4 = r8.f368707e
            java.lang.String r5 = "TB#populateTreeData"
            com.google.apps.tiktok.tracing.bi r5 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r5)
            com.google.android.apps.search.googleapp.discover.s.aw r6 = r9.f366438b     // Catch:{ all -> 0x057d }
            if (r6 != 0) goto L_0x0054
            com.google.android.apps.search.googleapp.discover.s.aw r6 = com.google.android.apps.search.googleapp.discover.p10214s.C134558aw.f366443h     // Catch:{ all -> 0x004f }
            goto L_0x0054
        L_0x004f:
            r0 = move-exception
        L_0x0050:
            r1 = r0
            r2 = r5
            goto L_0x0580
        L_0x0054:
            com.google.protobuf.cq r6 = r6.f366449e     // Catch:{ all -> 0x057d }
            java.lang.String r7 = "sessionState.structure.streamStructuresList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)     // Catch:{ all -> 0x057d }
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch:{ all -> 0x057d }
            r7.<init>()     // Catch:{ all -> 0x057d }
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet     // Catch:{ all -> 0x057d }
            r10.<init>()     // Catch:{ all -> 0x057d }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x057d }
            r11.<init>()     // Catch:{ all -> 0x057d }
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet     // Catch:{ all -> 0x057d }
            r12.<init>()     // Catch:{ all -> 0x057d }
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap     // Catch:{ all -> 0x057d }
            r13.<init>()     // Catch:{ all -> 0x057d }
            java.util.LinkedHashSet r14 = new java.util.LinkedHashSet     // Catch:{ all -> 0x057d }
            r14.<init>()     // Catch:{ all -> 0x057d }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x057d }
            r15.<init>()     // Catch:{ all -> 0x057d }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x057d }
        L_0x0082:
            boolean r16 = r6.hasNext()     // Catch:{ all -> 0x057d }
            if (r16 == 0) goto L_0x02a0
            java.lang.Object r16 = r6.next()     // Catch:{ all -> 0x029b }
            r2 = r16
            com.google.android.apps.search.googleapp.discover.s.bk r2 = (com.google.android.apps.search.googleapp.discover.p10214s.C134573bk) r2     // Catch:{ all -> 0x029b }
            r16 = r6
            int r6 = r2.f366500b     // Catch:{ all -> 0x029b }
            com.google.android.apps.search.googleapp.discover.s.bb r6 = com.google.android.apps.search.googleapp.discover.p10214s.C134564bb.m218286a(r6)     // Catch:{ all -> 0x029b }
            if (r6 != 0) goto L_0x009c
            com.google.android.apps.search.googleapp.discover.s.bb r6 = com.google.android.apps.search.googleapp.discover.p10214s.C134564bb.UNKNOWN     // Catch:{ all -> 0x004f }
        L_0x009c:
            int r6 = r6.ordinal()     // Catch:{ all -> 0x029b }
            r20 = r0
            r0 = 1
            if (r6 == r0) goto L_0x0273
            java.lang.String r0 = "contentId"
            r21 = r9
            java.lang.String r9 = "structure.contentId"
            r22 = r1
            r1 = 2
            if (r6 == r1) goto L_0x0178
            r1 = 3
            if (r6 == r1) goto L_0x00f2
            r1 = 4
            if (r6 == r1) goto L_0x00db
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.discover.p10249z.C135335bi.f368721a     // Catch:{ all -> 0x004f }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x004f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x004f }
            java.lang.String r1 = "unknown operation %s"
            int r2 = r2.f366500b     // Catch:{ all -> 0x004f }
            com.google.android.apps.search.googleapp.discover.s.bb r2 = com.google.android.apps.search.googleapp.discover.p10214s.C134564bb.m218286a(r2)     // Catch:{ all -> 0x004f }
            if (r2 != 0) goto L_0x00ca
            com.google.android.apps.search.googleapp.discover.s.bb r2 = com.google.android.apps.search.googleapp.discover.p10214s.C134564bb.UNKNOWN     // Catch:{ all -> 0x004f }
        L_0x00ca:
            int r2 = r2.f366469f     // Catch:{ all -> 0x004f }
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x004f }
            r9 = 40455(0x9e07, float:5.669E-41)
            r6.<init>(r9)     // Catch:{ all -> 0x004f }
            r0.mo56379ah(r6)     // Catch:{ all -> 0x004f }
            r0.mo56387q(r1, r2)     // Catch:{ all -> 0x004f }
            goto L_0x00e8
        L_0x00db:
            java.lang.String r0 = r2.f366501c     // Catch:{ all -> 0x004f }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ all -> 0x004f }
            java.lang.String r1 = "requiredContentId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)     // Catch:{ all -> 0x004f }
            r12.add(r0)     // Catch:{ all -> 0x004f }
        L_0x00e8:
            r6 = r16
            r0 = r20
            r9 = r21
            r1 = r22
        L_0x00f0:
            r2 = 1
            goto L_0x0082
        L_0x00f2:
            java.lang.String r1 = r2.f366502d     // Catch:{ all -> 0x029b }
            java.lang.Object r1 = r7.get(r1)     // Catch:{ all -> 0x029b }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x029b }
            if (r1 == 0) goto L_0x015f
            java.util.Iterator r6 = r1.iterator()     // Catch:{ all -> 0x029b }
            r19 = 0
        L_0x0102:
            boolean r9 = r6.hasNext()     // Catch:{ all -> 0x029b }
            if (r9 == 0) goto L_0x0122
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x004f }
            com.google.android.apps.search.googleapp.discover.z.d r9 = (com.google.android.apps.search.googleapp.discover.p10249z.C135347d) r9     // Catch:{ all -> 0x004f }
            java.lang.String r9 = r9.f368763a     // Catch:{ all -> 0x004f }
            r32 = r6
            java.lang.String r6 = r2.f366501c     // Catch:{ all -> 0x004f }
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r9, r6)     // Catch:{ all -> 0x004f }
            if (r6 != 0) goto L_0x011f
            int r19 = r19 + 1
            r6 = r32
            goto L_0x0102
        L_0x011f:
            r6 = r19
            goto L_0x0123
        L_0x0122:
            r6 = -1
        L_0x0123:
            r9 = -1
            if (r6 == r9) goto L_0x015f
            java.lang.Object r9 = r1.get(r6)     // Catch:{ all -> 0x029b }
            com.google.android.apps.search.googleapp.discover.z.d r9 = (com.google.android.apps.search.googleapp.discover.p10249z.C135347d) r9     // Catch:{ all -> 0x029b }
            java.lang.String r8 = "child"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r8)     // Catch:{ all -> 0x029b }
            java.lang.String r8 = r9.f368763a     // Catch:{ all -> 0x029b }
            r29 = r5
            com.google.android.apps.search.googleapp.discover.s.bj r5 = r9.f368764b     // Catch:{ all -> 0x02df }
            r30 = r12
            com.google.android.apps.search.googleapp.discover.s.aq r12 = r9.f368765c     // Catch:{ all -> 0x02df }
            java.util.List r9 = r9.f368766d     // Catch:{ all -> 0x02df }
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r0)     // Catch:{ all -> 0x02df }
            java.lang.String r0 = "role"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)     // Catch:{ all -> 0x02df }
            java.lang.String r0 = "expirationInfo"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r0)     // Catch:{ all -> 0x02df }
            com.google.android.apps.search.googleapp.discover.z.d r0 = new com.google.android.apps.search.googleapp.discover.z.d     // Catch:{ all -> 0x02df }
            r26 = 1
            r23 = r0
            r24 = r8
            r25 = r5
            r27 = r12
            r28 = r9
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x02df }
            r1.set(r6, r0)     // Catch:{ all -> 0x02df }
            goto L_0x0163
        L_0x015f:
            r29 = r5
            r30 = r12
        L_0x0163:
            java.lang.String r0 = r2.f366501c     // Catch:{ all -> 0x02df }
            r10.remove(r0)     // Catch:{ all -> 0x02df }
        L_0x0168:
            r8 = r31
            r6 = r16
            r0 = r20
            r9 = r21
            r1 = r22
            r5 = r29
            r12 = r30
            goto L_0x00f0
        L_0x0178:
            r29 = r5
            r30 = r12
            com.google.android.apps.search.googleapp.discover.s.aq r1 = r2.f366503e     // Catch:{ all -> 0x02df }
            if (r1 != 0) goto L_0x0182
            com.google.android.apps.search.googleapp.discover.s.aq r1 = com.google.android.apps.search.googleapp.discover.p10214s.C134552aq.f366420e     // Catch:{ all -> 0x02df }
        L_0x0182:
            java.lang.String r5 = "structure.expirationInfo"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)     // Catch:{ all -> 0x02df }
            boolean r1 = com.google.android.apps.search.googleapp.discover.p10249z.C135348e.m219497a(r1, r3)     // Catch:{ all -> 0x02df }
            if (r1 == 0) goto L_0x01ab
            com.google.android.apps.search.googleapp.discover.z.b.a r1 = new com.google.android.apps.search.googleapp.discover.z.b.a     // Catch:{ all -> 0x02df }
            java.lang.String r5 = r2.f366501c     // Catch:{ all -> 0x02df }
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r9)     // Catch:{ all -> 0x02df }
            com.google.android.apps.search.googleapp.discover.s.aq r6 = r2.f366503e     // Catch:{ all -> 0x02df }
            if (r6 != 0) goto L_0x019a
            com.google.android.apps.search.googleapp.discover.s.aq r6 = com.google.android.apps.search.googleapp.discover.p10214s.C134552aq.f366420e     // Catch:{ all -> 0x02df }
        L_0x019a:
            com.google.bv.j.b.a.b r6 = r6.f366425d     // Catch:{ all -> 0x02df }
            if (r6 != 0) goto L_0x01a0
            com.google.bv.j.b.a.b r6 = com.google.p4283bv.p4380j.p4385b.p4386a.C57696b.f154137l     // Catch:{ all -> 0x02df }
        L_0x01a0:
            java.lang.String r8 = "structure.expirationInfo…enClientLoggingProperties"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r8)     // Catch:{ all -> 0x02df }
            r1.<init>(r5, r6)     // Catch:{ all -> 0x02df }
            r14.add(r1)     // Catch:{ all -> 0x02df }
        L_0x01ab:
            com.google.android.apps.search.googleapp.discover.s.bh r1 = r2.f366505g     // Catch:{ all -> 0x02df }
            if (r1 != 0) goto L_0x01b1
            com.google.android.apps.search.googleapp.discover.s.bh r1 = com.google.android.apps.search.googleapp.discover.p10214s.C134570bh.f366480d     // Catch:{ all -> 0x02df }
        L_0x01b1:
            com.google.protobuf.cq r1 = r1.f366483b     // Catch:{ all -> 0x02df }
            java.lang.String r5 = "structure.restrictionInf…restrictionConditionsList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)     // Catch:{ all -> 0x02df }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x02df }
            r6 = 10
            int r6 = p5462h.p5463a.C69540x.m100804k(r1, r6)     // Catch:{ all -> 0x02df }
            r5.<init>(r6)     // Catch:{ all -> 0x02df }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x02df }
        L_0x01c7:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x02df }
            if (r6 == 0) goto L_0x01e1
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x02df }
            com.google.android.apps.search.googleapp.discover.s.be r6 = (com.google.android.apps.search.googleapp.discover.p10214s.C134567be) r6     // Catch:{ all -> 0x02df }
            int r6 = r6.f366473b     // Catch:{ all -> 0x02df }
            com.google.android.apps.search.googleapp.discover.s.bg r6 = com.google.android.apps.search.googleapp.discover.p10214s.C134569bg.m218288a(r6)     // Catch:{ all -> 0x02df }
            if (r6 != 0) goto L_0x01dd
            com.google.android.apps.search.googleapp.discover.s.bg r6 = com.google.android.apps.search.googleapp.discover.p10214s.C134569bg.UNKNOWN_SURFACE     // Catch:{ all -> 0x02df }
        L_0x01dd:
            r5.add(r6)     // Catch:{ all -> 0x02df }
            goto L_0x01c7
        L_0x01e1:
            boolean r1 = r5.isEmpty()     // Catch:{ all -> 0x02df }
            if (r1 == 0) goto L_0x01e8
            goto L_0x0222
        L_0x01e8:
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x02df }
        L_0x01ec:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x02df }
            if (r5 == 0) goto L_0x0222
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x02df }
            com.google.android.apps.search.googleapp.discover.s.bg r5 = (com.google.android.apps.search.googleapp.discover.p10214s.C134569bg) r5     // Catch:{ all -> 0x02df }
            com.google.android.apps.search.googleapp.discover.s.bg r6 = r4.f366957f     // Catch:{ all -> 0x02df }
            if (r5 != r6) goto L_0x01ec
            java.lang.String r1 = r2.f366501c     // Catch:{ all -> 0x02df }
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r9)     // Catch:{ all -> 0x02df }
            com.google.android.apps.search.googleapp.discover.s.bh r5 = r2.f366505g     // Catch:{ all -> 0x02df }
            if (r5 != 0) goto L_0x0207
            com.google.android.apps.search.googleapp.discover.s.bh r5 = com.google.android.apps.search.googleapp.discover.p10214s.C134570bh.f366480d     // Catch:{ all -> 0x02df }
        L_0x0207:
            com.google.bv.j.b.a.b r5 = r5.f366484c     // Catch:{ all -> 0x02df }
            if (r5 != 0) goto L_0x020d
            com.google.bv.j.b.a.b r5 = com.google.p4283bv.p4380j.p4385b.p4386a.C57696b.f154137l     // Catch:{ all -> 0x02df }
        L_0x020d:
            java.lang.String r6 = "structure.restrictionInf…oForRestrictionConditions"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ all -> 0x02df }
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r0)     // Catch:{ all -> 0x02df }
            java.lang.String r0 = "clientLoggingProperties"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)     // Catch:{ all -> 0x02df }
            com.google.android.apps.search.googleapp.discover.z.c.h r0 = new com.google.android.apps.search.googleapp.discover.z.c.h     // Catch:{ all -> 0x02df }
            r0.<init>(r1, r5)     // Catch:{ all -> 0x02df }
            r15.add(r0)     // Catch:{ all -> 0x02df }
        L_0x0222:
            int r0 = r2.f366499a     // Catch:{ all -> 0x02df }
            r1 = 4
            r0 = r0 & r1
            java.lang.String r1 = "structure"
            if (r0 == 0) goto L_0x025f
            java.lang.String r0 = r2.f366501c     // Catch:{ all -> 0x02df }
            boolean r0 = r10.contains(r0)     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x0168
            java.lang.String r0 = r2.f366502d     // Catch:{ all -> 0x02df }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x02df }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x024b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02df }
            r0.<init>()     // Catch:{ all -> 0x02df }
            java.lang.String r5 = r2.f366502d     // Catch:{ all -> 0x02df }
            java.lang.String r6 = "structure.parentId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ all -> 0x02df }
            r7.put(r5, r0)     // Catch:{ all -> 0x02df }
        L_0x024b:
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r1)     // Catch:{ all -> 0x02df }
            com.google.android.apps.search.googleapp.discover.z.d r1 = com.google.android.apps.search.googleapp.discover.p10249z.C135335bi.m219475g(r2)     // Catch:{ all -> 0x02df }
            r0.add(r1)     // Catch:{ all -> 0x02df }
            java.lang.String r0 = r2.f366501c     // Catch:{ all -> 0x02df }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ all -> 0x02df }
            r10.add(r0)     // Catch:{ all -> 0x02df }
            goto L_0x0168
        L_0x025f:
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r1)     // Catch:{ all -> 0x02df }
            com.google.android.apps.search.googleapp.discover.z.d r0 = com.google.android.apps.search.googleapp.discover.p10249z.C135335bi.m219475g(r2)     // Catch:{ all -> 0x02df }
            r11.add(r0)     // Catch:{ all -> 0x02df }
            java.lang.String r0 = r2.f366501c     // Catch:{ all -> 0x02df }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ all -> 0x02df }
            r10.add(r0)     // Catch:{ all -> 0x02df }
            goto L_0x0168
        L_0x0273:
            r22 = r1
            r29 = r5
            r21 = r9
            r30 = r12
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.discover.p10249z.C135335bi.f368721a     // Catch:{ all -> 0x02df }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x02df }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x02df }
            java.lang.String r1 = "Encountered CLEAR_ALL"
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ all -> 0x02df }
            r5 = 40456(0x9e08, float:5.6691E-41)
            r2.<init>(r5)     // Catch:{ all -> 0x02df }
            r0.mo56379ah(r2)     // Catch:{ all -> 0x02df }
            r0.mo56386p(r1)     // Catch:{ all -> 0x02df }
            r7.clear()     // Catch:{ all -> 0x02df }
            r10.clear()     // Catch:{ all -> 0x02df }
            goto L_0x0168
        L_0x029b:
            r0 = move-exception
            r8 = r31
            goto L_0x0050
        L_0x02a0:
            r20 = r0
            r22 = r1
            r29 = r5
            r21 = r9
            r30 = r12
            java.util.Set r0 = r7.entrySet()     // Catch:{ all -> 0x0577 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0577 }
        L_0x02b2:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0577 }
            if (r1 == 0) goto L_0x02e7
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x02df }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x02df }
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x02df }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x02df }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x02df }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x02df }
            com.google.common.b.gu r1 = com.google.common.p4522b.C58479go.m89810b(r1)     // Catch:{ all -> 0x02df }
            java.lang.String r3 = "key"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r3)     // Catch:{ all -> 0x02df }
            java.lang.String r3 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)     // Catch:{ all -> 0x02df }
            java.lang.Object r1 = r13.put(r2, r1)     // Catch:{ all -> 0x02df }
            com.google.common.b.gu r1 = (com.google.common.p4522b.C58485gu) r1     // Catch:{ all -> 0x02df }
            goto L_0x02b2
        L_0x02df:
            r0 = move-exception
            r8 = r31
            r1 = r0
            r2 = r29
            goto L_0x0580
        L_0x02e7:
            com.google.android.apps.search.googleapp.discover.z.bj r0 = new com.google.android.apps.search.googleapp.discover.z.bj     // Catch:{ all -> 0x0577 }
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89842j(r11)     // Catch:{ all -> 0x0577 }
            java.lang.String r1 = "copyOf(roots)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r1)     // Catch:{ all -> 0x0577 }
            com.google.common.b.ij r4 = com.google.common.p4522b.C58528ij.m90006F(r30)     // Catch:{ all -> 0x0577 }
            java.lang.String r1 = "copyOf(requiredContentIds)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r1)     // Catch:{ all -> 0x0577 }
            com.google.common.b.hd r5 = com.google.common.p4522b.C58495hd.m89898l(r13)     // Catch:{ all -> 0x0577 }
            java.lang.String r1 = "copyOf(tree)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r1)     // Catch:{ all -> 0x0577 }
            com.google.common.b.ij r6 = com.google.common.p4522b.C58528ij.m90006F(r14)     // Catch:{ all -> 0x0577 }
            java.lang.String r1 = "copyOf(featureExpirations)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r1)     // Catch:{ all -> 0x0577 }
            com.google.common.b.gu r7 = com.google.common.p4522b.C58485gu.m89842j(r15)     // Catch:{ all -> 0x0577 }
            java.lang.String r1 = "copyOf(conditionalContent)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r1)     // Catch:{ all -> 0x0577 }
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0577 }
            r1 = 0
            r2 = r29
            p5462h.p5472e.C69598b.m101013a(r2, r1)
            com.google.android.apps.search.googleapp.discover.z.bd r2 = new com.google.android.apps.search.googleapp.discover.z.bd
            r8 = r31
            com.google.android.apps.search.googleapp.discover.z.bi r3 = r8.f368706d
            com.google.android.apps.search.googleapp.discover.streamui.h.q r4 = r8.f368707e
            r2.<init>(r3, r0, r4, r1)
            r3 = r22
            r4 = 3
            kotlinx.coroutines.C71803m.m105043d(r3, r1, r1, r2, r4)
            com.google.android.apps.search.googleapp.discover.z.be r2 = new com.google.android.apps.search.googleapp.discover.z.be
            com.google.android.apps.search.googleapp.discover.z.bi r5 = r8.f368706d
            com.google.android.apps.search.googleapp.discover.streamui.h.q r6 = r8.f368707e
            r2.<init>(r5, r0, r6, r1)
            kotlinx.coroutines.C71803m.m105043d(r3, r1, r1, r2, r4)
            java.lang.String r2 = r8.f368709g
            int r3 = r8.f368710h
            com.google.android.apps.search.googleapp.discover.z.ba r4 = r8.f368711i
            j$.time.Instant r5 = r8.f368708f
            com.google.android.apps.search.googleapp.discover.streamui.h.q r6 = r8.f368707e
            java.lang.String r7 = "direction"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r7)
            java.lang.String r7 = "fragmentCreationTime"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r7)
            java.lang.String r7 = "tngDiscoverSurface"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r7)
            java.lang.String r7 = "TB#getStreamSubset"
            com.google.apps.tiktok.tracing.bi r7 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r7)
            com.google.common.b.gu r9 = r0.f368728b     // Catch:{ all -> 0x056e }
            int r10 = r9.size()     // Catch:{ all -> 0x056e }
            r12 = r1
            r11 = 0
        L_0x0364:
            if (r11 >= r10) goto L_0x03a3
            java.lang.Object r13 = r9.get(r11)     // Catch:{ all -> 0x056e }
            com.google.android.apps.search.googleapp.discover.z.d r13 = (com.google.android.apps.search.googleapp.discover.p10249z.C135347d) r13     // Catch:{ all -> 0x056e }
            java.lang.String r14 = r13.f368763a     // Catch:{ all -> 0x056e }
            com.google.android.apps.search.googleapp.discover.s.bj r13 = r13.f368764b     // Catch:{ all -> 0x056e }
            com.google.android.apps.search.googleapp.discover.s.bj r15 = com.google.android.apps.search.googleapp.discover.p10214s.C134572bj.ROOT     // Catch:{ all -> 0x056e }
            if (r13 != r15) goto L_0x039b
            if (r12 == 0) goto L_0x0397
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r12, r14)     // Catch:{ all -> 0x056e }
            if (r13 != 0) goto L_0x0397
            com.google.common.f.e r13 = com.google.android.apps.search.googleapp.discover.p10249z.C135336bj.f368727a     // Catch:{ all -> 0x056e }
            com.google.common.f.x r13 = r13.mo56226d()     // Catch:{ all -> 0x056e }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x056e }
            java.lang.String r15 = "Found Multiple roots %s and %s"
            com.google.common.f.n r1 = new com.google.common.f.n     // Catch:{ all -> 0x056e }
            r18 = r9
            r9 = 40459(0x9e0b, float:5.6695E-41)
            r1.<init>(r9)     // Catch:{ all -> 0x056e }
            r13.mo56379ah(r1)     // Catch:{ all -> 0x056e }
            r13.mo56354G(r15, r12, r14)     // Catch:{ all -> 0x056e }
            goto L_0x0399
        L_0x0397:
            r18 = r9
        L_0x0399:
            r12 = r14
            goto L_0x039d
        L_0x039b:
            r18 = r9
        L_0x039d:
            int r11 = r11 + 1
            r9 = r18
            r1 = 0
            goto L_0x0364
        L_0x03a3:
            java.lang.String r1 = "undefined:root"
            if (r12 != 0) goto L_0x03a8
            r12 = r1
        L_0x03a8:
            boolean r1 = p5462h.p5473f.p5475b.C69664n.m101066l(r12, r1)     // Catch:{ all -> 0x056e }
            if (r1 == 0) goto L_0x03d1
            com.google.common.f.e r1 = com.google.android.apps.search.googleapp.discover.p10249z.C135318ay.f368669a     // Catch:{ all -> 0x056e }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x056e }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x056e }
            java.lang.String r2 = "Stream Root not defined, empty StreamStructure list provided"
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x056e }
            r4 = 40447(0x9dff, float:5.6678E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x056e }
            r1.mo56379ah(r3)     // Catch:{ all -> 0x056e }
            r1.mo56386p(r2)     // Catch:{ all -> 0x056e }
            com.google.android.apps.search.googleapp.discover.z.aw r1 = com.google.android.apps.search.googleapp.discover.p10249z.C135315av.m219457a(r12)     // Catch:{ all -> 0x056e }
            r2 = 0
            p5462h.p5472e.C69598b.m101013a(r7, r2)
        L_0x03ce:
            r9 = r1
            goto L_0x0530
        L_0x03d1:
            com.google.common.b.hd r1 = r0.f368730d     // Catch:{ all -> 0x056e }
            java.lang.Object r1 = r1.get(r12)     // Catch:{ all -> 0x056e }
            com.google.common.b.gu r1 = (com.google.common.p4522b.C58485gu) r1     // Catch:{ all -> 0x056e }
            if (r1 != 0) goto L_0x03fc
            com.google.common.f.e r1 = com.google.android.apps.search.googleapp.discover.p10249z.C135318ay.f368669a     // Catch:{ all -> 0x056e }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x056e }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x056e }
            java.lang.String r2 = "The children of root %s is empty"
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x056e }
            r4 = 40446(0x9dfe, float:5.6677E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x056e }
            r1.mo56379ah(r3)     // Catch:{ all -> 0x056e }
            r1.mo56389s(r2, r12)     // Catch:{ all -> 0x056e }
            com.google.android.apps.search.googleapp.discover.z.aw r1 = com.google.android.apps.search.googleapp.discover.p10249z.C135315av.m219457a(r12)     // Catch:{ all -> 0x056e }
            r2 = 0
            p5462h.p5472e.C69598b.m101013a(r7, r2)
            goto L_0x03ce
        L_0x03fc:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x056e }
            r9.<init>()     // Catch:{ all -> 0x056e }
            java.util.Iterator r10 = r1.iterator()     // Catch:{ all -> 0x056e }
        L_0x0405:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x056e }
            if (r11 == 0) goto L_0x041c
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x056e }
            r13 = r11
            com.google.android.apps.search.googleapp.discover.z.d r13 = (com.google.android.apps.search.googleapp.discover.p10249z.C135347d) r13     // Catch:{ all -> 0x056e }
            com.google.android.apps.search.googleapp.discover.s.bj r13 = r13.f368764b     // Catch:{ all -> 0x056e }
            com.google.android.apps.search.googleapp.discover.s.bj r14 = com.google.android.apps.search.googleapp.discover.p10214s.C134572bj.NON_ROOT_STREAM     // Catch:{ all -> 0x056e }
            if (r13 != r14) goto L_0x0405
            r9.add(r11)     // Catch:{ all -> 0x056e }
            goto L_0x0405
        L_0x041c:
            int r10 = r9.size()     // Catch:{ all -> 0x056e }
            r11 = 1
            if (r10 > r11) goto L_0x0566
            int r10 = r9.size()     // Catch:{ all -> 0x056e }
            if (r10 != r11) goto L_0x043a
            com.google.common.b.hd r1 = r0.f368730d     // Catch:{ all -> 0x056e }
            r10 = 0
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x056e }
            com.google.android.apps.search.googleapp.discover.z.d r9 = (com.google.android.apps.search.googleapp.discover.p10249z.C135347d) r9     // Catch:{ all -> 0x056e }
            java.lang.String r9 = r9.f368763a     // Catch:{ all -> 0x056e }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x056e }
            com.google.common.b.gu r1 = (com.google.common.p4522b.C58485gu) r1     // Catch:{ all -> 0x056e }
        L_0x043a:
            if (r1 == 0) goto L_0x045c
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x056e }
            r9.<init>()     // Catch:{ all -> 0x056e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x056e }
        L_0x0445:
            boolean r10 = r1.hasNext()     // Catch:{ all -> 0x056e }
            if (r10 == 0) goto L_0x045e
            java.lang.Object r10 = r1.next()     // Catch:{ all -> 0x056e }
            r13 = r10
            com.google.android.apps.search.googleapp.discover.z.d r13 = (com.google.android.apps.search.googleapp.discover.p10249z.C135347d) r13     // Catch:{ all -> 0x056e }
            com.google.android.apps.search.googleapp.discover.s.bj r13 = r13.f368764b     // Catch:{ all -> 0x056e }
            com.google.android.apps.search.googleapp.discover.s.bj r14 = com.google.android.apps.search.googleapp.discover.p10214s.C134572bj.TOKEN     // Catch:{ all -> 0x056e }
            if (r13 == r14) goto L_0x0445
            r9.add(r10)     // Catch:{ all -> 0x056e }
            goto L_0x0445
        L_0x045c:
            h.a.am r9 = p5462h.p5463a.C69496am.f185918a     // Catch:{ all -> 0x056e }
        L_0x045e:
            if (r2 != 0) goto L_0x0469
            r1 = 0
            java.lang.Object r2 = r9.get(r1)     // Catch:{ all -> 0x056e }
            com.google.android.apps.search.googleapp.discover.z.d r2 = (com.google.android.apps.search.googleapp.discover.p10249z.C135347d) r2     // Catch:{ all -> 0x056e }
            java.lang.String r2 = r2.f368763a     // Catch:{ all -> 0x056e }
        L_0x0469:
            com.google.android.apps.search.googleapp.discover.z.ba r1 = com.google.android.apps.search.googleapp.discover.p10249z.C135327ba.BACKWARD     // Catch:{ all -> 0x056e }
            if (r4 != r1) goto L_0x0471
            java.util.List r9 = p5462h.p5463a.C69540x.m100815v(r9)     // Catch:{ all -> 0x056e }
        L_0x0471:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x056e }
            r1.<init>()     // Catch:{ all -> 0x056e }
            int r10 = r9.size()     // Catch:{ all -> 0x056e }
            r13 = 0
            r14 = -1
            r15 = 0
            r17 = 0
        L_0x047f:
            if (r15 >= r10) goto L_0x04b3
            java.lang.Object r18 = r9.get(r15)     // Catch:{ all -> 0x056e }
            r11 = r18
            com.google.android.apps.search.googleapp.discover.z.d r11 = (com.google.android.apps.search.googleapp.discover.p10249z.C135347d) r11     // Catch:{ all -> 0x056e }
            if (r13 != 0) goto L_0x0497
            r18 = r9
            java.lang.String r9 = r11.f368763a     // Catch:{ all -> 0x056e }
            boolean r9 = p5462h.p5473f.p5475b.C69664n.m101066l(r9, r2)     // Catch:{ all -> 0x056e }
            if (r9 == 0) goto L_0x0499
            r13 = 1
            goto L_0x0499
        L_0x0497:
            r18 = r9
        L_0x0499:
            com.google.android.apps.search.googleapp.discover.s.bg r9 = r6.f366957f     // Catch:{ all -> 0x056e }
            boolean r9 = r11.mo112283a(r5, r9)     // Catch:{ all -> 0x056e }
            if (r9 != 0) goto L_0x04ad
            if (r13 == 0) goto L_0x04a8
            r9 = -1
            if (r14 != r9) goto L_0x04a8
            r14 = r17
        L_0x04a8:
            r1.add(r11)     // Catch:{ all -> 0x056e }
            int r17 = r17 + 1
        L_0x04ad:
            int r15 = r15 + 1
            r9 = r18
            r11 = 1
            goto L_0x047f
        L_0x04b3:
            r2 = -1
            if (r14 != r2) goto L_0x04d0
            com.google.common.f.e r2 = com.google.android.apps.search.googleapp.discover.p10249z.C135318ay.f368669a     // Catch:{ all -> 0x056e }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x056e }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x056e }
            java.lang.String r5 = "Not able to find anchor index, defaulting to first value."
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x056e }
            r9 = 40448(0x9e00, float:5.668E-41)
            r6.<init>(r9)     // Catch:{ all -> 0x056e }
            r2.mo56379ah(r6)     // Catch:{ all -> 0x056e }
            r2.mo56386p(r5)     // Catch:{ all -> 0x056e }
            r10 = 0
            goto L_0x04d1
        L_0x04d0:
            r10 = r14
        L_0x04d1:
            com.google.android.apps.search.googleapp.discover.z.ax r2 = new com.google.android.apps.search.googleapp.discover.z.ax     // Catch:{ all -> 0x056e }
            r2.<init>(r1, r10)     // Catch:{ all -> 0x056e }
            java.util.List r1 = r2.f368667a     // Catch:{ all -> 0x056e }
            int r1 = r1.size()     // Catch:{ all -> 0x056e }
            int r5 = r2.f368668b     // Catch:{ all -> 0x056e }
            int r1 = r1 - r5
            if (r1 >= r3) goto L_0x04e9
            int r1 = r3 - r1
            int r5 = r5 - r1
            r1 = 0
            int r5 = java.lang.Math.max(r5, r1)     // Catch:{ all -> 0x056e }
        L_0x04e9:
            java.util.List r1 = r2.f368667a     // Catch:{ all -> 0x056e }
            int r1 = r1.size()     // Catch:{ all -> 0x056e }
            int r1 = r1 - r5
            int r1 = java.lang.Math.min(r3, r1)     // Catch:{ all -> 0x056e }
            int r1 = r1 + r5
            com.google.android.apps.search.googleapp.discover.z.aw r3 = new com.google.android.apps.search.googleapp.discover.z.aw     // Catch:{ all -> 0x056e }
            java.util.List r6 = r2.f368667a     // Catch:{ all -> 0x056e }
            int r6 = r6.size()     // Catch:{ all -> 0x056e }
            int r6 = r6 - r1
            java.util.List r2 = r2.f368667a     // Catch:{ all -> 0x056e }
            java.util.List r1 = r2.subList(r5, r1)     // Catch:{ all -> 0x056e }
            com.google.common.b.gu r1 = com.google.common.p4522b.C58479go.m89810b(r1)     // Catch:{ all -> 0x056e }
            r3.<init>(r5, r6, r1, r12)     // Catch:{ all -> 0x056e }
            com.google.android.apps.search.googleapp.discover.z.ba r1 = com.google.android.apps.search.googleapp.discover.p10249z.C135327ba.BACKWARD     // Catch:{ all -> 0x056e }
            if (r4 != r1) goto L_0x052b
            int r1 = r3.f368664b     // Catch:{ all -> 0x056e }
            int r2 = r3.f368663a     // Catch:{ all -> 0x056e }
            com.google.common.b.gu r4 = r3.f368665c     // Catch:{ all -> 0x056e }
            com.google.common.b.gu r4 = r4.mo55401lD()     // Catch:{ all -> 0x056e }
            java.lang.String r5 = "childrenToBind.reverse()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)     // Catch:{ all -> 0x056e }
            java.lang.String r3 = r3.f368666d     // Catch:{ all -> 0x056e }
            java.lang.String r5 = "childrenToBind"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r5)     // Catch:{ all -> 0x056e }
            com.google.android.apps.search.googleapp.discover.z.aw r5 = new com.google.android.apps.search.googleapp.discover.z.aw     // Catch:{ all -> 0x056e }
            r5.<init>(r1, r2, r4, r3)     // Catch:{ all -> 0x056e }
            r3 = r5
        L_0x052b:
            r1 = 0
            p5462h.p5472e.C69598b.m101013a(r7, r1)
            r9 = r3
        L_0x0530:
            com.google.android.apps.search.googleapp.discover.z.bi r1 = r8.f368706d
            j$.time.Instant r4 = r8.f368708f
            com.google.android.apps.search.googleapp.discover.streamui.h.q r6 = r8.f368707e
            r10 = r21
            r8.f368712j = r10
            r8.f368703a = r0
            r8.f368704b = r9
            r2 = 2
            r8.f368705c = r2
            r2 = r0
            r3 = r9
            r5 = r10
            r7 = r31
            java.lang.Object r1 = r1.mo112268b(r2, r3, r4, r5, r6, r7)
            r2 = r20
            if (r1 == r2) goto L_0x0565
            r2 = r0
            r0 = r9
            r11 = r10
        L_0x0551:
            r10 = r1
            java.util.Map r10 = (java.util.Map) r10
            com.google.android.apps.search.googleapp.discover.z.bi r9 = r8.f368706d
            j$.time.Instant r14 = r8.f368708f
            com.google.android.apps.search.googleapp.discover.streamui.h.q r15 = r8.f368707e
            r12 = r2
            com.google.android.apps.search.googleapp.discover.z.bj r12 = (com.google.android.apps.search.googleapp.discover.p10249z.C135336bj) r12
            r13 = r0
            com.google.android.apps.search.googleapp.discover.z.aw r13 = (com.google.android.apps.search.googleapp.discover.p10249z.C135316aw) r13
            com.google.android.apps.search.googleapp.discover.z.az r0 = r9.mo112267a(r10, r11, r12, r13, r14, r15)
            return r0
        L_0x0565:
            return r2
        L_0x0566:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x056e }
            java.lang.String r1 = "Root should have no more than 1 stream child"
            r0.<init>(r1)     // Catch:{ all -> 0x056e }
            throw r0     // Catch:{ all -> 0x056e }
        L_0x056e:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0571 }
        L_0x0571:
            r0 = move-exception
            r2 = r0
            p5462h.p5472e.C69598b.m101013a(r7, r1)
            throw r2
        L_0x0577:
            r0 = move-exception
            r8 = r31
            r2 = r29
            goto L_0x057f
        L_0x057d:
            r0 = move-exception
            r2 = r5
        L_0x057f:
            r1 = r0
        L_0x0580:
            throw r1     // Catch:{ all -> 0x0581 }
        L_0x0581:
            r0 = move-exception
            r3 = r0
            p5462h.p5472e.C69598b.m101013a(r2, r1)
            throw r3
        L_0x0587:
            r2 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10249z.C135332bf.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C135332bf bfVar = new C135332bf(this.f368706d, this.f368707e, this.f368708f, this.f368709g, this.f368710h, this.f368711i, gVar);
        bfVar.f368712j = obj;
        return bfVar;
    }
}
