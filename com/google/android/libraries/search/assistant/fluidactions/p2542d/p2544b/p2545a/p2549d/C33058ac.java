package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import android.content.Context;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.ac */
/* compiled from: PG */
public final /* synthetic */ class C33058ac implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f88519a;

    /* renamed from: b */
    public final /* synthetic */ C51953ff f88520b;

    /* renamed from: c */
    public final /* synthetic */ C52507uh f88521c;

    /* renamed from: d */
    public final /* synthetic */ C33108d f88522d;

    /* renamed from: e */
    public final /* synthetic */ Optional f88523e;

    public /* synthetic */ C33058ac(Context context, C51953ff ffVar, C52507uh uhVar, C33108d dVar, Optional optional) {
        this.f88519a = context;
        this.f88520b = ffVar;
        this.f88521c = uhVar;
        this.f88522d = dVar;
        this.f88523e = optional;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.google.protobuf.bv] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0674: MOVE  (r3v13 int) = (r25v1 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0469 A[SYNTHETIC] */
    public final java.lang.Object call() {
        /*
            r32 = this;
            r0 = r32
            android.content.Context r1 = r0.f88519a
            com.google.assistant.e.j.e.ff r2 = r0.f88520b
            com.google.assistant.e.j.uh r3 = r0.f88521c
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.e.d r4 = r0.f88522d
            j$.util.Optional r5 = r0.f88523e
            com.google.assistant.e.j.ex r6 = r4.mo38534c()
            com.google.protobuf.cq r7 = r3.f137840a
            int r7 = r7.size()
            r8 = 8
            r9 = 4
            r10 = 2
            r11 = 1
            if (r7 != r11) goto L_0x00e5
            com.google.protobuf.cq r7 = r3.f137840a
            java.lang.Object r7 = com.google.common.p4522b.C58557jl.m90133n(r7)
            com.google.assistant.e.j.tr r7 = (com.google.assistant.p3897e.p3921j.C52490tr) r7
            android.content.res.Resources r12 = r1.getResources()
            r13 = 2132085231(0x7f1509ef, float:1.9810655E38)
            java.lang.String r12 = r12.getString(r13)
            j$.util.Optional r12 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61463d(r2, r6, r7, r12)
            boolean r13 = r12.isPresent()
            if (r13 == 0) goto L_0x003e
        L_0x003a:
            r27 = r4
            goto L_0x07c0
        L_0x003e:
            int r12 = r7.f137798b
            if (r12 != r8) goto L_0x00da
            com.google.protobuf.cq r12 = r6.f136712a
            java.util.Iterator r12 = r12.iterator()
        L_0x0048:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0078
            java.lang.Object r13 = r12.next()
            com.google.assistant.e.j.kc r13 = (com.google.assistant.p3897e.p3921j.C52232kc) r13
            java.lang.String r14 = "asst.productivity.reminder"
            java.lang.String r15 = "assistant.api.params.ReminderParams"
            boolean r14 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g.m61471g(r13, r14, r15)
            if (r14 == 0) goto L_0x0048
            com.google.assistant.e.j.ka r12 = r13.f137066c     // Catch:{ ct -> 0x0073 }
            if (r12 != 0) goto L_0x0064
            com.google.assistant.e.j.ka r12 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x0073 }
        L_0x0064:
            com.google.protobuf.z r12 = r12.f137061c     // Catch:{ ct -> 0x0073 }
            com.google.assistant.e.i.a.lc r13 = com.google.assistant.p3897e.p3917i.p3918a.C51530lc.f134283b     // Catch:{ ct -> 0x0073 }
            com.google.protobuf.bv r12 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r13, (com.google.protobuf.C63088z) r12)     // Catch:{ ct -> 0x0073 }
            com.google.assistant.e.i.a.lc r12 = (com.google.assistant.p3897e.p3917i.p3918a.C51530lc) r12     // Catch:{ ct -> 0x0073 }
            j$.util.Optional r12 = p3186j$.util.Optional.m71637of(r12)     // Catch:{ ct -> 0x0073 }
            goto L_0x007c
        L_0x0073:
            j$.util.Optional r12 = p3186j$.util.Optional.empty()
            goto L_0x007c
        L_0x0078:
            j$.util.Optional r12 = p3186j$.util.Optional.empty()
        L_0x007c:
            boolean r13 = r12.isPresent()
            if (r13 == 0) goto L_0x00da
            java.lang.Object r12 = r12.get()
            com.google.assistant.e.i.a.lc r12 = (com.google.assistant.p3897e.p3917i.p3918a.C51530lc) r12
            com.google.assistant.e.i.a.le r12 = r12.f134285a
            if (r12 != 0) goto L_0x008e
            com.google.assistant.e.i.a.le r12 = com.google.assistant.p3897e.p3917i.p3918a.C51532le.f134288e
        L_0x008e:
            int r13 = r12.f134290a
            r13 = r13 & r11
            if (r13 == 0) goto L_0x00da
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r14 = r12.f134290a
            r14 = r14 & r10
            if (r14 == 0) goto L_0x00aa
            com.google.assistant.e.j.e.hb r14 = r12.f134292c
            if (r14 != 0) goto L_0x00a3
            com.google.assistant.e.j.e.hb r14 = com.google.assistant.p3897e.p3921j.p3926e.C52003hb.f136476i
        L_0x00a3:
            com.google.assistant.e.j.dy r14 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61452k(r14)
            r13.add(r14)
        L_0x00aa:
            int r14 = r12.f134290a
            r14 = r14 & r8
            if (r14 == 0) goto L_0x00c1
            int r14 = r7.f137797a
            r14 = r14 & r10
            if (r14 == 0) goto L_0x00c1
            java.lang.String r7 = r7.f137801e
            com.google.z.c.h r14 = r12.f134293d
            if (r14 != 0) goto L_0x00bc
            com.google.z.c.h r14 = com.google.p5277z.p5282c.C68018h.f184286c
        L_0x00bc:
            com.google.assistant.e.j.ex r7 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36496b(r6, r7, r14)
            goto L_0x00c2
        L_0x00c1:
            r7 = r6
        L_0x00c2:
            com.google.assistant.e.j.e.ff r12 = r12.f134291b
            if (r12 != 0) goto L_0x00c8
            com.google.assistant.e.j.e.ff r12 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
        L_0x00c8:
            com.google.assistant.e.j.dy r12 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61451j(r12)
            r13.add(r12)
            com.google.common.b.pz r12 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r7 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r13, r12, r7)
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)
            goto L_0x00de
        L_0x00da:
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
        L_0x00de:
            r12 = r7
            boolean r7 = r12.isPresent()
            if (r7 != 0) goto L_0x003a
        L_0x00e5:
            boolean r7 = r5.isPresent()
            r12 = 7
            java.lang.String r13 = "location"
            r14 = 0
            if (r7 == 0) goto L_0x019c
            java.lang.Object r5 = r5.get()
            com.google.assistant.e.j.un r5 = (com.google.assistant.p3897e.p3921j.C52513un) r5
            com.google.assistant.e.j.e.ff r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61487d(r5, r2)
            boolean r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33070ao.m61351p(r2)
            if (r5 == 0) goto L_0x019c
            com.google.protobuf.cq r5 = r3.f137840a
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x019c
            com.google.protobuf.cq r5 = r3.f137840a
            java.lang.Object r5 = r5.get(r14)
            com.google.assistant.e.j.tr r5 = (com.google.assistant.p3897e.p3921j.C52490tr) r5
            java.lang.String r5 = r5.f137800d
            java.lang.String r7 = "trigger_field"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x019c
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.assistant.e.j.ug r3 = (com.google.assistant.p3897e.p3921j.C52506ug) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.j.uh r5 = (com.google.assistant.p3897e.p3921j.C52507uh) r5
            com.google.protobuf.cq r7 = com.google.assistant.p3897e.p3921j.C52507uh.emptyProtobufList()
            r5.f137840a = r7
            com.google.assistant.e.j.tr r5 = com.google.assistant.p3897e.p3921j.C52490tr.f137795g
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.tp r5 = (com.google.assistant.p3897e.p3921j.C52488tp) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.e.j.tr r7 = (com.google.assistant.p3897e.p3921j.C52490tr) r7
            int r15 = r7.f137797a
            r15 = r15 | r11
            r7.f137797a = r15
            r7.f137800d = r13
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.e.j.tr r7 = (com.google.assistant.p3897e.p3921j.C52490tr) r7
            int r15 = r7.f137797a
            r15 = r15 | r10
            r7.f137797a = r15
            r7.f137801e = r13
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.e.j.tr r7 = (com.google.assistant.p3897e.p3921j.C52490tr) r7
            int r15 = r7.f137797a
            r15 = r15 | r9
            r7.f137797a = r15
            r7.f137802f = r11
            com.google.assistant.e.j.tx r7 = com.google.assistant.p3897e.p3921j.C52496tx.f137813c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.tw r7 = (com.google.assistant.p3897e.p3921j.C52495tw) r7
            com.google.assistant.e.j.vo r15 = com.google.assistant.p3897e.p3921j.C52541vo.f137908f
            r7.copyOnWrite()
            com.google.protobuf.bv r14 = r7.instance
            com.google.assistant.e.j.tx r14 = (com.google.assistant.p3897e.p3921j.C52496tx) r14
            r15.getClass()
            r14.f137816b = r15
            int r15 = r14.f137815a
            r15 = r15 | r11
            r14.f137815a = r15
            r5.copyOnWrite()
            com.google.protobuf.bv r14 = r5.instance
            com.google.assistant.e.j.tr r14 = (com.google.assistant.p3897e.p3921j.C52490tr) r14
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.e.j.tx r7 = (com.google.assistant.p3897e.p3921j.C52496tx) r7
            r7.getClass()
            r14.f137799c = r7
            r14.f137798b = r12
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.e.j.tr r5 = (com.google.assistant.p3897e.p3921j.C52490tr) r5
            r3.mo53877a(r5)
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.j.uh r3 = (com.google.assistant.p3897e.p3921j.C52507uh) r3
        L_0x019c:
            com.google.assistant.e.j.ex r1 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19050h.m36505b(r1, r6, r2, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r2.f136317a
            r6 = r6 & r8
            if (r6 == 0) goto L_0x07b2
            com.google.android.libraries.assistant.portable.a.a.c r6 = new com.google.android.libraries.assistant.portable.a.a.c
            java.lang.String r7 = r2.f136321e
            r6.<init>(r1, r7)
            boolean r7 = r6.f53449b
            if (r7 != 0) goto L_0x01c1
            com.google.common.b.pz r2 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r5, r2, r1)
            j$.util.Optional r12 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x003a
        L_0x01c1:
            com.google.z.c.d r7 = r6.mo24271c()
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.z.c.c r7 = (com.google.p5277z.p5282c.C68013c) r7
            com.google.protobuf.bv r8 = r7.instance
            com.google.z.c.d r8 = (com.google.p5277z.p5282c.C68014d) r8
            com.google.knowledge.a.a.n r8 = r8.f184280c
            if (r8 != 0) goto L_0x01d5
            com.google.knowledge.a.a.n r8 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x01d5:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.knowledge.a.a.m r8 = (com.google.knowledge.p4661a.p4662a.C61751m) r8
            com.google.protobuf.bv r14 = r7.instance
            com.google.z.c.d r14 = (com.google.p5277z.p5282c.C68014d) r14
            com.google.z.c.l r14 = r14.f184281d
            if (r14 != 0) goto L_0x01e5
            com.google.z.c.l r14 = com.google.p5277z.p5282c.C68022l.f184294b
        L_0x01e5:
            com.google.protobuf.bn r14 = r14.toBuilder()
            com.google.z.c.e r14 = (com.google.p5277z.p5282c.C68015e) r14
            boolean r15 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61491h(r2)
            java.lang.String r12 = r2.f136321e
            java.lang.String r11 = "UpdateReminder"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x021a
            java.util.List r11 = r6.mo24273e()
            j$.util.stream.Stream r11 = p3186j$.util.Collection.EL.stream(r11)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.ad r12 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33059ad.f88524a
            j$.util.stream.Stream r11 = r11.flatMap(r12)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.ae r12 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33060ae.f88525a
            j$.util.stream.Stream r11 = r11.map(r12)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.af r12 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33061af.f88526a
            boolean r11 = r11.anyMatch(r12)
            if (r11 != 0) goto L_0x021a
            if (r15 != 0) goto L_0x021a
            r11 = 1
            r12 = 1
            goto L_0x021c
        L_0x021a:
            r11 = 0
            r12 = 0
        L_0x021c:
            r16 = -1
            r22 = r11
            r23 = r12
            r10 = 0
            r11 = -1
            r12 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L_0x022b:
            com.google.protobuf.bv r9 = r8.instance
            com.google.knowledge.a.a.n r9 = (com.google.knowledge.p4661a.p4662a.C61752n) r9
            com.google.protobuf.cq r9 = r9.f166812c
            int r9 = r9.size()
            java.lang.String r0 = "recurrence"
            r27 = r4
            java.lang.String r4 = "datetime"
            r28 = r5
            java.lang.String r5 = "title"
            r29 = r11
            if (r10 >= r9) goto L_0x047f
            com.google.knowledge.a.a.h r9 = r8.mo58182a(r10)
            java.lang.String r11 = r9.f166796d
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0290
            int r11 = r9.f166793a
            r16 = 4
            r11 = r11 & 4
            if (r11 == 0) goto L_0x0290
            com.google.knowledge.a.a.j r11 = r9.f166797e
            if (r11 != 0) goto L_0x025d
            com.google.knowledge.a.a.j r11 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x025d:
            int r11 = r11.f166802a
            r30 = r3
            r3 = 3
            if (r11 != r3) goto L_0x0292
            r11 = 2
            com.google.z.c.h r12 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r11)
            r14.mo60077b(r5, r12)
            com.google.knowledge.a.a.j r5 = r9.f166797e
            if (r5 != 0) goto L_0x0272
            com.google.knowledge.a.a.j r5 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x0272:
            int r11 = r5.f166802a
            if (r11 != r3) goto L_0x027b
            java.lang.Object r3 = r5.f166803b
            com.google.knowledge.a.a.t r3 = (com.google.knowledge.p4661a.p4662a.C61758t) r3
            goto L_0x027d
        L_0x027b:
            com.google.knowledge.a.a.t r3 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
        L_0x027d:
            int r5 = r3.f166826a
            r11 = 1
            if (r5 != r11) goto L_0x0287
            java.lang.Object r3 = r3.f166827b
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0289
        L_0x0287:
            java.lang.String r3 = ""
        L_0x0289:
            boolean r3 = r3.isEmpty()
            r12 = r3 ^ 1
            goto L_0x0292
        L_0x0290:
            r30 = r3
        L_0x0292:
            java.lang.String r3 = r9.f166796d
            boolean r3 = r3.equals(r4)
            r5 = 0
            if (r3 == 0) goto L_0x03f1
            int r3 = r9.f166793a
            r16 = 4
            r3 = r3 & 4
            if (r3 == 0) goto L_0x03f1
            r3 = 2
            com.google.z.c.h r11 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r3)
            r14.mo60077b(r4, r11)
            if (r15 == 0) goto L_0x02d3
            com.google.protobuf.bn r0 = r9.toBuilder()
            com.google.knowledge.a.a.g r0 = (com.google.knowledge.p4661a.p4662a.C61745g) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.knowledge.a.a.h r3 = (com.google.knowledge.p4661a.p4662a.C61746h) r3
            r3.f166797e = r5
            int r4 = r3.f166793a
            r4 = r4 & -5
            r3.f166793a = r4
            r8.mo58187f(r10, r0)
            r20 = r2
            r31 = r6
            r18 = r12
            r19 = r22
            r11 = r29
            r22 = r1
            goto L_0x0469
        L_0x02d3:
            com.google.knowledge.a.a.j r3 = r9.f166797e
            if (r3 != 0) goto L_0x02d9
            com.google.knowledge.a.a.j r3 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x02d9:
            int r4 = r3.f166802a
            r11 = 4
            if (r4 != r11) goto L_0x02e3
            java.lang.Object r3 = r3.f166803b
            com.google.protos.an.b.d r3 = (com.google.protos.p4850an.p4853b.C63360d) r3
            goto L_0x02e5
        L_0x02e3:
            com.google.protos.an.b.d r3 = com.google.protos.p4850an.p4853b.C63360d.f171230f
        L_0x02e5:
            com.google.protobuf.cq r3 = r3.f171234c
            com.google.protos.an.b.b r4 = com.google.protos.p4850an.p4853b.C63358b.f171216l
            java.lang.Object r3 = com.google.common.p4522b.C58557jl.m90130k(r3, r4)
            com.google.protos.an.b.b r3 = (com.google.protos.p4850an.p4853b.C63358b) r3
            int r4 = r3.f171218a
            r11 = r4 & 1
            if (r11 == 0) goto L_0x02ff
            r11 = r4 & 2
            if (r11 == 0) goto L_0x02ff
            r11 = r4 & 4
            if (r11 == 0) goto L_0x02ff
            r11 = 1
            goto L_0x0300
        L_0x02ff:
            r11 = 0
        L_0x0300:
            r4 = r4 & 16
            com.google.protobuf.bv r5 = r8.instance
            com.google.knowledge.a.a.n r5 = (com.google.knowledge.p4661a.p4662a.C61752n) r5
            com.google.protobuf.cq r5 = r5.f166812c
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x0310:
            boolean r18 = r5.hasNext()
            if (r18 == 0) goto L_0x034e
            java.lang.Object r18 = r5.next()
            r19 = r5
            r5 = r18
            com.google.knowledge.a.a.h r5 = (com.google.knowledge.p4661a.p4662a.C61746h) r5
            r18 = r12
            java.lang.String r12 = r5.f166796d
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0349
            int r5 = r5.f166793a
            r12 = 4
            r5 = r5 & r12
            if (r5 == 0) goto L_0x0349
            r5 = r22
            r0 = r11 | r5
            if (r4 == 0) goto L_0x033f
            r19 = r0
            r22 = r1
            r20 = r2
            r31 = r6
            goto L_0x035e
        L_0x033f:
            r19 = r0
            r22 = r1
            r20 = r2
            r31 = r6
            goto L_0x03fb
        L_0x0349:
            r12 = r18
            r5 = r19
            goto L_0x0310
        L_0x034e:
            r18 = r12
            r5 = r22
            if (r11 != 0) goto L_0x0364
            r22 = r1
            r20 = r2
            r19 = r5
            r31 = r6
            if (r4 == 0) goto L_0x03fb
        L_0x035e:
            r11 = r29
        L_0x0360:
            r23 = 1
            goto L_0x03fd
        L_0x0364:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            int r11 = r3.f171219b
            int r12 = r3.f171220c
            int r12 = com.google.protos.p4850an.p4853b.C63378v.m96231a(r12)
            if (r12 != 0) goto L_0x0373
            r12 = 1
        L_0x0373:
            int r12 = r12 + -2
            r19 = r5
            int r5 = r3.f171221d
            r22 = r1
            r20 = r2
            r1 = 1
            int r2 = r0.get(r1)
            if (r11 > r2) goto L_0x03b4
            int r2 = r0.get(r1)
            if (r11 != r2) goto L_0x0395
            r2 = 2
            int r1 = r0.get(r2)
            if (r12 > r1) goto L_0x03b4
            r31 = r6
            r1 = 1
            goto L_0x0398
        L_0x0395:
            r2 = 2
            r31 = r6
        L_0x0398:
            int r6 = r0.get(r1)
            if (r11 != r6) goto L_0x03ac
            int r1 = r0.get(r2)
            if (r12 != r1) goto L_0x03ac
            r1 = 5
            int r2 = r0.get(r1)
            if (r5 < r2) goto L_0x03ac
            goto L_0x03b6
        L_0x03ac:
            r26 = r5
            r25 = r11
            r11 = r12
            if (r4 == 0) goto L_0x03fd
            goto L_0x0360
        L_0x03b4:
            r31 = r6
        L_0x03b6:
            if (r4 == 0) goto L_0x03e9
            r1 = 1
            int r2 = r0.get(r1)
            if (r11 != r2) goto L_0x03e7
            r1 = 2
            int r2 = r0.get(r1)
            if (r12 != r2) goto L_0x03e7
            r1 = 5
            int r2 = r0.get(r1)
            if (r5 != r2) goto L_0x03e7
            int r1 = r3.f171222e
            int r2 = r3.f171223f
            r3 = 11
            int r4 = r0.get(r3)
            if (r1 > r4) goto L_0x03e7
            int r3 = r0.get(r3)
            if (r1 != r3) goto L_0x03e9
            r1 = 12
            int r0 = r0.get(r1)
            if (r2 < r0) goto L_0x03e9
        L_0x03e7:
            r23 = 1
        L_0x03e9:
            r26 = r5
            r25 = r11
            r11 = r12
            r19 = 1
            goto L_0x03fd
        L_0x03f1:
            r20 = r2
            r31 = r6
            r18 = r12
            r19 = r22
            r22 = r1
        L_0x03fb:
            r11 = r29
        L_0x03fd:
            java.lang.String r0 = r9.f166796d
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0469
            com.google.knowledge.a.a.j r0 = r9.f166797e
            if (r0 != 0) goto L_0x040b
            com.google.knowledge.a.a.j r0 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x040b:
            int r0 = r0.f166802a
            r1 = 5
            if (r0 != r1) goto L_0x0469
            r0 = 2
            com.google.z.c.h r1 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r0)
            r14.mo60077b(r13, r1)
            if (r15 != 0) goto L_0x0434
            com.google.protobuf.bn r0 = r9.toBuilder()
            com.google.knowledge.a.a.g r0 = (com.google.knowledge.p4661a.p4662a.C61745g) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.knowledge.a.a.h r1 = (com.google.knowledge.p4661a.p4662a.C61746h) r1
            r2 = 0
            r1.f166797e = r2
            int r2 = r1.f166793a
            r2 = r2 & -5
            r1.f166793a = r2
            r8.mo58187f(r10, r0)
            goto L_0x0469
        L_0x0434:
            com.google.knowledge.a.a.j r0 = r9.f166797e
            if (r0 != 0) goto L_0x043a
            com.google.knowledge.a.a.j r0 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x043a:
            int r1 = r0.f166802a
            r2 = 5
            if (r1 != r2) goto L_0x0444
            java.lang.Object r0 = r0.f166803b
            com.google.protos.an.c.ai r0 = (com.google.protos.p4850an.p4854c.C63408ai) r0
            goto L_0x0446
        L_0x0444:
            com.google.protos.an.c.ai r0 = com.google.protos.p4850an.p4854c.C63408ai.f171351e
        L_0x0446:
            com.google.protos.an.c.ac r0 = r0.f171354b
            if (r0 != 0) goto L_0x044c
            com.google.protos.an.c.ac r0 = com.google.protos.p4850an.p4854c.C63402ac.f171336b
        L_0x044c:
            com.google.protobuf.cq r0 = r0.f171338a
            java.util.Iterator r0 = r0.iterator()
        L_0x0452:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0469
            java.lang.Object r1 = r0.next()
            com.google.protos.an.c.ak r1 = (com.google.protos.p4850an.p4854c.C63410ak) r1
            java.lang.String r1 = r1.f171365b
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            r24 = r1 | r24
            goto L_0x0452
        L_0x0469:
            int r10 = r10 + 1
            r0 = r32
            r12 = r18
            r2 = r20
            r1 = r22
            r4 = r27
            r5 = r28
            r3 = r30
            r6 = r31
            r22 = r19
            goto L_0x022b
        L_0x047f:
            r20 = r2
            r30 = r3
            r31 = r6
            r11 = r22
            r22 = r1
            r7.copyOnWrite()
            com.google.protobuf.bv r1 = r7.instance
            com.google.z.c.d r1 = (com.google.p5277z.p5282c.C68014d) r1
            com.google.protobuf.bv r2 = r8.build()
            com.google.knowledge.a.a.n r2 = (com.google.knowledge.p4661a.p4662a.C61752n) r2
            r2.getClass()
            r1.f184280c = r2
            int r2 = r1.f184278a
            r3 = 2
            r2 = r2 | r3
            r1.f184278a = r2
            r1 = r31
            r1.mo24277i(r7)
            if (r15 == 0) goto L_0x04c8
            if (r12 != 0) goto L_0x04b3
            r2 = 3
            com.google.z.c.h r3 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r2)
            r14.mo60077b(r5, r3)
            goto L_0x04bd
        L_0x04b3:
            r2 = 3
            if (r24 != 0) goto L_0x04bd
            com.google.z.c.h r3 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r2)
            r14.mo60077b(r13, r3)
        L_0x04bd:
            r3 = 2
            com.google.z.c.h r5 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r3)
            r14.mo60077b(r4, r5)
            r3 = r23
            goto L_0x04f5
        L_0x04c8:
            r2 = 3
            r3 = r23
            if (r12 != 0) goto L_0x04d7
            if (r11 != r3) goto L_0x04d7
            com.google.z.c.h r4 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r2)
            r14.mo60077b(r5, r4)
            goto L_0x04e3
        L_0x04d7:
            r2 = r11 ^ r3
            if (r2 != 0) goto L_0x04e5
            if (r12 == 0) goto L_0x04e3
            if (r11 != 0) goto L_0x04e3
            r2 = 3
            r11 = 0
            r12 = 1
            goto L_0x04e6
        L_0x04e3:
            r2 = 2
            goto L_0x04ee
        L_0x04e5:
            r2 = 3
        L_0x04e6:
            com.google.z.c.h r5 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r2)
            r14.mo60077b(r4, r5)
            goto L_0x04e3
        L_0x04ee:
            com.google.z.c.h r4 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r2)
            r14.mo60077b(r13, r4)
        L_0x04f5:
            r2 = r3 ^ 1
            r4 = r20
            com.google.assistant.e.j.e.ff r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33070ao.m61338c(r4, r14, r2)
            r7.copyOnWrite()
            com.google.protobuf.bv r4 = r7.instance
            com.google.z.c.d r4 = (com.google.p5277z.p5282c.C68014d) r4
            com.google.protobuf.bv r5 = r14.build()
            com.google.z.c.l r5 = (com.google.p5277z.p5282c.C68022l) r5
            r5.getClass()
            r4.f184281d = r5
            int r5 = r4.f184278a
            r6 = 4
            r5 = r5 | r6
            r4.f184278a = r5
            r1.mo24277i(r7)
            com.google.protobuf.bv r4 = r7.instance
            com.google.z.c.d r4 = (com.google.p5277z.p5282c.C68014d) r4
            com.google.knowledge.a.a.n r4 = r4.f184280c
            if (r4 != 0) goto L_0x0522
            com.google.knowledge.a.a.n r4 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0522:
            java.lang.String r4 = r4.f166811b
            r16 = r1
            r17 = r4
            r18 = r11
            r19 = r3
            r20 = r24
            r21 = r15
            com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33070ao.m61347l(r16, r17, r18, r19, r20, r21)
            r4 = r22
            com.google.assistant.e.j.ex r1 = r1.mo24270b(r4)
            r4 = r30
            com.google.protobuf.cq r4 = r4.f137840a
            com.google.assistant.e.j.tr r5 = com.google.assistant.p3897e.p3921j.C52490tr.f137795g
            java.lang.Object r4 = com.google.common.p4522b.C58557jl.m90130k(r4, r5)
            com.google.assistant.e.j.tr r4 = (com.google.assistant.p3897e.p3921j.C52490tr) r4
            java.lang.String r5 = "confirm_field"
            j$.util.Optional r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r5, r2)
            if (r12 == 0) goto L_0x0559
            if (r15 != 0) goto L_0x0553
            if (r11 == 0) goto L_0x0553
            if (r3 != 0) goto L_0x0557
        L_0x0553:
            if (r15 == 0) goto L_0x0559
            if (r24 == 0) goto L_0x0559
        L_0x0557:
            r6 = 1
            goto L_0x055a
        L_0x0559:
            r6 = 0
        L_0x055a:
            boolean r7 = r5.isPresent()
            if (r7 == 0) goto L_0x05b6
            java.lang.Object r7 = r5.get()
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.assistant.e.j.e.eq r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r7
            java.lang.Object r8 = r5.get()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            int r9 = r8.f136277e
            r10 = 17
            if (r9 != r10) goto L_0x057d
            java.lang.Object r8 = r8.f136278f
            com.google.assistant.e.c.c.ah r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r8
            goto L_0x057f
        L_0x057d:
            com.google.assistant.e.c.c.ah r8 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x057f:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.assistant.e.c.c.aa r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50929aa) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.c.c.ah r9 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r9
            int r12 = r9.f132595a
            r14 = 4
            r12 = r12 | r14
            r9.f132595a = r12
            r9.f132600f = r6
            r7.copyOnWrite()
            com.google.protobuf.bv r6 = r7.instance
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.c.c.ah r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r8
            r8.getClass()
            r6.f136278f = r8
            r6.f136277e = r10
            com.google.protobuf.bv r6 = r7.build()
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r6, r2, r7)
        L_0x05b6:
            java.lang.String r6 = "datetime.date"
            j$.util.Optional r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r6, r2)
            boolean r7 = r6.isPresent()
            if (r7 == 0) goto L_0x05ed
            java.lang.Object r6 = r6.get()
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.assistant.e.j.e.eq r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            int r8 = r7.f136273a
            r8 = r8 | 64
            r7.f136273a = r8
            r8 = r11 ^ 1
            r7.f136282j = r8
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r6, r2, r7)
        L_0x05ed:
            java.lang.String r6 = "datetime.time"
            j$.util.Optional r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r6, r2)
            boolean r7 = r6.isPresent()
            if (r7 == 0) goto L_0x0629
            java.lang.Object r6 = r6.get()
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.assistant.e.j.e.eq r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r6
            if (r11 == 0) goto L_0x060b
            if (r3 != 0) goto L_0x060b
            r14 = 1
            goto L_0x060c
        L_0x060b:
            r14 = 0
        L_0x060c:
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            int r7 = r3.f136273a
            r7 = r7 | 64
            r3.f136273a = r7
            r3.f136282j = r14
            com.google.protobuf.bv r3 = r6.build()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r3, r2, r6)
        L_0x0629:
            j$.util.Optional r3 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r13, r2)
            boolean r6 = r3.isPresent()
            if (r6 == 0) goto L_0x065f
            java.lang.Object r3 = r3.get()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.assistant.e.j.e.eq r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            int r7 = r6.f136273a
            r7 = r7 | 64
            r6.f136273a = r7
            r7 = 1
            r8 = r24 ^ 1
            r6.f136282j = r8
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r3, r2, r6)
        L_0x065f:
            j$.util.Optional r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r0, r2)
            boolean r3 = r0.isPresent()
            if (r3 == 0) goto L_0x0773
            java.lang.Object r3 = r0.get()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            int r3 = r3.f136277e
            r6 = 7
            if (r3 != r6) goto L_0x0773
            r3 = r25
            if (r3 <= 0) goto L_0x0773
            if (r29 < 0) goto L_0x0773
            r7 = r26
            if (r7 <= 0) goto L_0x0773
            java.lang.Object r8 = r0.get()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            int r9 = r8.f136277e
            if (r9 != r6) goto L_0x068d
            java.lang.Object r6 = r8.f136278f
            com.google.assistant.e.c.c.hh r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r6
            goto L_0x068f
        L_0x068d:
            com.google.assistant.e.c.c.hh r6 = com.google.assistant.p3897e.p3902c.p3907c.C51125hh.f133077g
        L_0x068f:
            com.google.protobuf.bn r8 = r6.toBuilder()
            com.google.assistant.e.c.c.hg r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51124hg) r8
            com.google.assistant.e.j.qb r9 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.j.qa r9 = (com.google.assistant.p3897e.p3921j.C52392qa) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.j.qb r10 = (com.google.assistant.p3897e.p3921j.C52393qb) r10
            int r11 = r10.f137481a
            r12 = 1
            r11 = r11 | r12
            r10.f137481a = r11
            r10.f137482b = r3
            r9.copyOnWrite()
            com.google.protobuf.bv r3 = r9.instance
            com.google.assistant.e.j.qb r3 = (com.google.assistant.p3897e.p3921j.C52393qb) r3
            int r10 = r3.f137481a
            r11 = 2
            r10 = r10 | r11
            r3.f137481a = r10
            int r11 = r29 + 1
            r3.f137483c = r11
            r9.copyOnWrite()
            com.google.protobuf.bv r3 = r9.instance
            com.google.assistant.e.j.qb r3 = (com.google.assistant.p3897e.p3921j.C52393qb) r3
            int r10 = r3.f137481a
            r11 = 4
            r10 = r10 | r11
            r3.f137481a = r10
            r3.f137484d = r7
            com.google.protobuf.bv r3 = r9.build()
            com.google.assistant.e.j.qb r3 = (com.google.assistant.p3897e.p3921j.C52393qb) r3
            int r7 = r6.f133079a
            r9 = 2
            r7 = r7 & r9
            if (r7 == 0) goto L_0x070e
            com.google.assistant.e.j.qf r6 = r6.f133081c
            if (r6 != 0) goto L_0x06de
            com.google.assistant.e.j.qf r6 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
        L_0x06de:
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.assistant.e.j.qe r6 = (com.google.assistant.p3897e.p3921j.C52396qe) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.j.qf r7 = (com.google.assistant.p3897e.p3921j.C52397qf) r7
            r3.getClass()
            r7.f137501i = r3
            int r3 = r7.f137493a
            r9 = 2
            r3 = r3 | r9
            r7.f137493a = r3
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.assistant.e.c.c.hh r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r3
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.qf r6 = (com.google.assistant.p3897e.p3921j.C52397qf) r6
            r6.getClass()
            r3.f133081c = r6
            int r6 = r3.f133079a
            r6 = r6 | r9
            r3.f133079a = r6
            goto L_0x0744
        L_0x070e:
            com.google.assistant.e.j.qf r6 = r6.f133082d
            if (r6 != 0) goto L_0x0714
            com.google.assistant.e.j.qf r6 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
        L_0x0714:
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.assistant.e.j.qe r6 = (com.google.assistant.p3897e.p3921j.C52396qe) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.j.qf r7 = (com.google.assistant.p3897e.p3921j.C52397qf) r7
            r3.getClass()
            r7.f137501i = r3
            int r3 = r7.f137493a
            r9 = 2
            r3 = r3 | r9
            r7.f137493a = r3
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.assistant.e.c.c.hh r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r3
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.qf r6 = (com.google.assistant.p3897e.p3921j.C52397qf) r6
            r6.getClass()
            r3.f133082d = r6
            int r6 = r3.f133079a
            r7 = 4
            r6 = r6 | r7
            r3.f133079a = r6
        L_0x0744:
            java.lang.Object r0 = r0.get()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.e.eq r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            com.google.protobuf.bv r6 = r8.build()
            com.google.assistant.e.c.c.hh r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r6
            r6.getClass()
            r3.f136278f = r6
            r6 = 7
            r3.f136277e = r6
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r0, r2, r3)
        L_0x0773:
            int r0 = r4.f137798b
            r3 = 3
            if (r0 != r3) goto L_0x079e
            boolean r0 = r5.isPresent()
            if (r0 == 0) goto L_0x079e
            com.google.protobuf.bn r0 = r2.toBuilder()
            com.google.assistant.e.j.e.en r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51934en) r0
            com.google.assistant.e.j.e.fe r2 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.FORM_FIELD_STATUS_UPDATE
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.e.ff r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r3
            int r2 = r2.f136314c
            r3.f136326j = r2
            int r2 = r3.f136317a
            r2 = r2 | 256(0x100, float:3.59E-43)
            r3.f136317a = r2
            com.google.protobuf.bv r0 = r0.build()
            r2 = r0
            com.google.assistant.e.j.e.ff r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r2
        L_0x079e:
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61451j(r2)
            r2 = r28
            r2.add(r0)
            com.google.common.b.pz r0 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r2, r0, r1)
            j$.util.Optional r12 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x07c0
        L_0x07b2:
            r27 = r4
            r2 = r5
            r4 = r1
            com.google.common.b.pz r0 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r2, r0, r4)
            j$.util.Optional r12 = p3186j$.util.Optional.m71637of(r0)
        L_0x07c0:
            com.google.android.libraries.search.assistant.fluidactions.d.c.e r0 = r27.mo38533b()
            r1 = 4
            r0.mo38549b(r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33058ac.call():java.lang.Object");
    }
}
