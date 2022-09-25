package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import android.content.Context;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11203a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11204b;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11228a;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.u */
/* compiled from: PG */
public final class C11197u implements C11204b {

    /* renamed from: a */
    C51953ff f36611a;

    /* renamed from: b */
    C52507uh f36612b;

    /* renamed from: c */
    private final C11228a f36613c;

    public C11197u(C11228a aVar) {
        this.f36613c = aVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x06e2: MOVE  (r2v33 int) = (r21v1 int)
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x04e3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0158  */
    /* renamed from: a */
    public final com.google.common.base.C58833ax mo19603a(android.content.Context r29, com.google.assistant.p3897e.p3921j.C52081en r30, com.google.android.libraries.assistant.assistantactions.p620b.C11054a r31) {
        /*
            r28 = this;
            r0 = r28
            com.google.common.base.ax r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11207b.m26563b(r30)
            boolean r2 = r1.mo56113h()
            if (r2 == 0) goto L_0x0864
            r2 = r30
            com.google.assistant.e.j.ex r2 = r2.f136685e
            if (r2 != 0) goto L_0x0014
            com.google.assistant.e.j.ex r2 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x0014:
            java.lang.Object r3 = r1.mo56107c()
            com.google.assistant.e.j.du r3 = (com.google.assistant.p3897e.p3921j.C51805du) r3
            com.google.common.base.ax r3 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11207b.m26562a(r3)
            java.lang.Object r1 = r1.mo56107c()
            com.google.assistant.e.j.du r1 = (com.google.assistant.p3897e.p3921j.C51805du) r1
            com.google.common.base.ax r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11207b.m26564c(r1)
            boolean r4 = r3.mo56113h()
            if (r4 == 0) goto L_0x0861
            java.lang.Object r4 = r3.mo56107c()
            com.google.assistant.e.j.tt r4 = (com.google.assistant.p3897e.p3921j.C52492tt) r4
            int r4 = r4.f137805a
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0861
            java.lang.Object r4 = r3.mo56107c()
            com.google.assistant.e.j.tt r4 = (com.google.assistant.p3897e.p3921j.C52492tt) r4
            int r4 = r4.f137805a
            r6 = 2
            r4 = r4 & r6
            if (r4 == 0) goto L_0x0861
            java.lang.Object r4 = r3.mo56107c()
            com.google.assistant.e.j.tt r4 = (com.google.assistant.p3897e.p3921j.C52492tt) r4
            com.google.assistant.e.j.e.ff r4 = r4.f137806b
            if (r4 != 0) goto L_0x0052
            com.google.assistant.e.j.e.ff r4 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
        L_0x0052:
            r0.f36611a = r4
            java.lang.Object r3 = r3.mo56107c()
            com.google.assistant.e.j.tt r3 = (com.google.assistant.p3897e.p3921j.C52492tt) r3
            com.google.assistant.e.j.uh r3 = r3.f137807c
            if (r3 != 0) goto L_0x0060
            com.google.assistant.e.j.uh r3 = com.google.assistant.p3897e.p3921j.C52507uh.f137838b
        L_0x0060:
            r0.f36612b = r3
            com.google.assistant.e.j.e.ff r3 = r0.f36611a
            int r3 = r3.f136323g
            com.google.assistant.e.j.e.ep r3 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.m86435a(r3)
            if (r3 != 0) goto L_0x006e
            com.google.assistant.e.j.e.ep r3 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.DEFAULT
        L_0x006e:
            com.google.assistant.e.j.e.ep r4 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.REMINDER
            if (r3 == r4) goto L_0x0075
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            return r1
        L_0x0075:
            com.google.android.libraries.assistant.assistantactions.c.d.a r3 = r0.f36613c
            r3.mo19654x()
            com.google.assistant.e.j.uh r3 = r0.f36612b
            com.google.protobuf.cq r3 = r3.f137840a
            int r3 = r3.size()
            r4 = 8
            if (r3 != r5) goto L_0x0164
            com.google.assistant.e.j.uh r3 = r0.f36612b
            com.google.protobuf.cq r3 = r3.f137840a
            java.lang.Object r3 = com.google.common.p4522b.C58557jl.m90133n(r3)
            com.google.assistant.e.j.tr r3 = (com.google.assistant.p3897e.p3921j.C52490tr) r3
            android.content.res.Resources r7 = r29.getResources()
            r8 = 2132085231(0x7f1509ef, float:1.9810655E38)
            java.lang.String r7 = r7.getString(r8)
            com.google.assistant.e.j.e.ff r8 = r0.f36611a
            com.google.common.base.ax r7 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c.m26568d(r8, r2, r3, r7)
            boolean r8 = r7.mo56113h()
            if (r8 != 0) goto L_0x015e
            int r7 = r3.f137798b
            if (r7 != r4) goto L_0x014f
            com.google.protobuf.cq r7 = r2.f136712a
            java.util.Iterator r7 = r7.iterator()
        L_0x00b1:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00ef
            java.lang.Object r8 = r7.next()
            com.google.assistant.e.j.kc r8 = (com.google.assistant.p3897e.p3921j.C52232kc) r8
            java.lang.String r9 = "asst.productivity.reminder"
            java.lang.String r10 = r8.f137065b
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x00b1
            com.google.assistant.e.j.ka r9 = r8.f137066c
            if (r9 != 0) goto L_0x00cd
            com.google.assistant.e.j.ka r9 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x00cd:
            java.lang.String r10 = "assistant.api.params.ReminderParams"
            java.lang.String r9 = r9.f137060b
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x00b1
            com.google.assistant.e.j.ka r7 = r8.f137066c     // Catch:{ ct -> 0x00ec }
            if (r7 != 0) goto L_0x00dd
            com.google.assistant.e.j.ka r7 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x00ec }
        L_0x00dd:
            com.google.protobuf.z r7 = r7.f137061c     // Catch:{ ct -> 0x00ec }
            com.google.assistant.e.i.a.lc r8 = com.google.assistant.p3897e.p3917i.p3918a.C51530lc.f134283b     // Catch:{ ct -> 0x00ec }
            com.google.protobuf.bv r7 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (com.google.protobuf.C63088z) r7)     // Catch:{ ct -> 0x00ec }
            com.google.assistant.e.i.a.lc r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51530lc) r7     // Catch:{ ct -> 0x00ec }
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r7)     // Catch:{ ct -> 0x00ec }
            goto L_0x00f1
        L_0x00ec:
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            goto L_0x00f1
        L_0x00ef:
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
        L_0x00f1:
            boolean r8 = r7.mo56113h()
            if (r8 == 0) goto L_0x014f
            java.lang.Object r7 = r7.mo56107c()
            com.google.assistant.e.i.a.lc r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51530lc) r7
            com.google.assistant.e.i.a.le r7 = r7.f134285a
            if (r7 != 0) goto L_0x0103
            com.google.assistant.e.i.a.le r7 = com.google.assistant.p3897e.p3917i.p3918a.C51532le.f134288e
        L_0x0103:
            int r8 = r7.f134290a
            r8 = r8 & r5
            if (r8 == 0) goto L_0x014f
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = r7.f134290a
            r9 = r9 & r6
            if (r9 == 0) goto L_0x011f
            com.google.assistant.e.j.e.hb r9 = r7.f134292c
            if (r9 != 0) goto L_0x0118
            com.google.assistant.e.j.e.hb r9 = com.google.assistant.p3897e.p3921j.p3926e.C52003hb.f136476i
        L_0x0118:
            com.google.assistant.e.j.dy r9 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26582l(r9)
            r8.add(r9)
        L_0x011f:
            int r9 = r7.f134290a
            r9 = r9 & r4
            if (r9 == 0) goto L_0x0136
            int r9 = r3.f137797a
            r9 = r9 & r6
            if (r9 == 0) goto L_0x0136
            java.lang.String r3 = r3.f137801e
            com.google.z.c.h r9 = r7.f134293d
            if (r9 != 0) goto L_0x0131
            com.google.z.c.h r9 = com.google.p5277z.p5282c.C68018h.f184286c
        L_0x0131:
            com.google.assistant.e.j.ex r3 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36496b(r2, r3, r9)
            goto L_0x0137
        L_0x0136:
            r3 = r2
        L_0x0137:
            com.google.assistant.e.j.e.ff r7 = r7.f134291b
            if (r7 != 0) goto L_0x013d
            com.google.assistant.e.j.e.ff r7 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
        L_0x013d:
            com.google.assistant.e.j.dy r7 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26580j(r7)
            r8.add(r7)
            com.google.common.b.pz r7 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.e.a.j r3 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c.m26566b(r8, r7, r3)
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            goto L_0x0151
        L_0x014f:
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
        L_0x0151:
            boolean r7 = r3.mo56113h()
            if (r7 != 0) goto L_0x0158
            goto L_0x0164
        L_0x0158:
            com.google.android.libraries.assistant.assistantactions.c.d.a r1 = r0.f36613c
            r1.mo19653w()
            return r3
        L_0x015e:
            com.google.android.libraries.assistant.assistantactions.c.d.a r1 = r0.f36613c
            r1.mo19653w()
            return r7
        L_0x0164:
            boolean r3 = r1.mo56113h()
            r7 = 7
            java.lang.String r8 = "location"
            r9 = 4
            r10 = 0
            if (r3 == 0) goto L_0x0228
            java.lang.Object r1 = r1.mo56107c()
            com.google.assistant.e.j.un r1 = (com.google.assistant.p3897e.p3921j.C52513un) r1
            com.google.assistant.e.j.e.ff r3 = r0.f36611a
            com.google.assistant.e.j.e.ff r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26607d(r1, r3)
            r0.f36611a = r1
            boolean r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11169be.m26482o(r1)
            if (r1 == 0) goto L_0x0228
            com.google.assistant.e.j.uh r1 = r0.f36612b
            com.google.protobuf.cq r1 = r1.f137840a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0228
            com.google.assistant.e.j.uh r1 = r0.f36612b
            com.google.protobuf.cq r1 = r1.f137840a
            java.lang.Object r1 = r1.get(r10)
            com.google.assistant.e.j.tr r1 = (com.google.assistant.p3897e.p3921j.C52490tr) r1
            java.lang.String r1 = r1.f137800d
            java.lang.String r3 = "trigger_field"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0228
            com.google.assistant.e.j.uh r1 = r0.f36612b
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.j.ug r1 = (com.google.assistant.p3897e.p3921j.C52506ug) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.uh r3 = (com.google.assistant.p3897e.p3921j.C52507uh) r3
            com.google.protobuf.cq r11 = com.google.assistant.p3897e.p3921j.C52507uh.emptyProtobufList()
            r3.f137840a = r11
            com.google.assistant.e.j.tr r3 = com.google.assistant.p3897e.p3921j.C52490tr.f137795g
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.tp r3 = (com.google.assistant.p3897e.p3921j.C52488tp) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r11 = r3.instance
            com.google.assistant.e.j.tr r11 = (com.google.assistant.p3897e.p3921j.C52490tr) r11
            int r12 = r11.f137797a
            r12 = r12 | r5
            r11.f137797a = r12
            r11.f137800d = r8
            r3.copyOnWrite()
            com.google.protobuf.bv r11 = r3.instance
            com.google.assistant.e.j.tr r11 = (com.google.assistant.p3897e.p3921j.C52490tr) r11
            int r12 = r11.f137797a
            r12 = r12 | r6
            r11.f137797a = r12
            r11.f137801e = r8
            r3.copyOnWrite()
            com.google.protobuf.bv r11 = r3.instance
            com.google.assistant.e.j.tr r11 = (com.google.assistant.p3897e.p3921j.C52490tr) r11
            int r12 = r11.f137797a
            r12 = r12 | r9
            r11.f137797a = r12
            r11.f137802f = r5
            com.google.assistant.e.j.tx r11 = com.google.assistant.p3897e.p3921j.C52496tx.f137813c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.j.tw r11 = (com.google.assistant.p3897e.p3921j.C52495tw) r11
            com.google.assistant.e.j.vo r12 = com.google.assistant.p3897e.p3921j.C52541vo.f137908f
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.assistant.e.j.tx r13 = (com.google.assistant.p3897e.p3921j.C52496tx) r13
            r12.getClass()
            r13.f137816b = r12
            int r12 = r13.f137815a
            r12 = r12 | r5
            r13.f137815a = r12
            r3.copyOnWrite()
            com.google.protobuf.bv r12 = r3.instance
            com.google.assistant.e.j.tr r12 = (com.google.assistant.p3897e.p3921j.C52490tr) r12
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.e.j.tx r11 = (com.google.assistant.p3897e.p3921j.C52496tx) r11
            r11.getClass()
            r12.f137799c = r11
            r12.f137798b = r7
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.j.tr r3 = (com.google.assistant.p3897e.p3921j.C52490tr) r3
            r1.mo53877a(r3)
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.uh r1 = (com.google.assistant.p3897e.p3921j.C52507uh) r1
            r0.f36612b = r1
        L_0x0228:
            com.google.assistant.e.j.e.ff r1 = r0.f36611a
            com.google.assistant.e.j.uh r3 = r0.f36612b
            r11 = r29
            com.google.assistant.e.j.ex r1 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19050h.m36505b(r11, r2, r1, r3)
            com.google.assistant.e.j.e.ff r2 = r0.f36611a
            com.google.assistant.e.j.uh r3 = r0.f36612b
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r12 = r2.f136317a
            r4 = r4 & r12
            if (r4 == 0) goto L_0x084d
            com.google.android.libraries.assistant.portable.a.a.c r4 = new com.google.android.libraries.assistant.portable.a.a.c
            java.lang.String r12 = r2.f136321e
            r4.<init>(r1, r12)
            boolean r12 = r4.f53449b
            if (r12 != 0) goto L_0x0257
            com.google.common.b.pz r2 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.e.a.j r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c.m26566b(r11, r2, r1)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x085b
        L_0x0257:
            com.google.z.c.d r12 = r4.mo24271c()
            com.google.protobuf.bn r12 = r12.toBuilder()
            com.google.z.c.c r12 = (com.google.p5277z.p5282c.C68013c) r12
            com.google.protobuf.bv r13 = r12.instance
            com.google.z.c.d r13 = (com.google.p5277z.p5282c.C68014d) r13
            com.google.knowledge.a.a.n r13 = r13.f184280c
            if (r13 != 0) goto L_0x026b
            com.google.knowledge.a.a.n r13 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x026b:
            com.google.protobuf.bn r13 = r13.toBuilder()
            com.google.knowledge.a.a.m r13 = (com.google.knowledge.p4661a.p4662a.C61751m) r13
            com.google.protobuf.bv r14 = r12.instance
            com.google.z.c.d r14 = (com.google.p5277z.p5282c.C68014d) r14
            com.google.z.c.l r14 = r14.f184281d
            if (r14 != 0) goto L_0x027b
            com.google.z.c.l r14 = com.google.p5277z.p5282c.C68022l.f184294b
        L_0x027b:
            com.google.protobuf.bn r14 = r14.toBuilder()
            com.google.z.c.e r14 = (com.google.p5277z.p5282c.C68015e) r14
            boolean r18 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26611h(r2)
            java.lang.String r15 = r2.f136321e
            java.lang.String r10 = "UpdateReminder"
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L_0x02b0
            java.util.List r10 = r4.mo24273e()
            j$.util.stream.Stream r10 = p3186j$.util.Collection.EL.stream(r10)
            com.google.android.libraries.assistant.assistantactions.c.b.c.r r15 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11194r.f36608a
            j$.util.stream.Stream r10 = r10.flatMap(r15)
            com.google.android.libraries.assistant.assistantactions.c.b.c.s r15 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11195s.f36609a
            j$.util.stream.Stream r10 = r10.map(r15)
            com.google.android.libraries.assistant.assistantactions.c.b.c.t r15 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11196t.f36610a
            boolean r10 = r10.anyMatch(r15)
            if (r10 != 0) goto L_0x02b0
            if (r18 != 0) goto L_0x02b0
            r10 = 1
            r15 = 1
            goto L_0x02b2
        L_0x02b0:
            r10 = 0
            r15 = 0
        L_0x02b2:
            r16 = -1
            r7 = 0
            r16 = 0
            r19 = -1
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x02bf:
            com.google.protobuf.bv r5 = r13.instance
            com.google.knowledge.a.a.n r5 = (com.google.knowledge.p4661a.p4662a.C61752n) r5
            com.google.protobuf.cq r5 = r5.f166812c
            int r5 = r5.size()
            java.lang.String r6 = "recurrence"
            java.lang.String r9 = "datetime"
            java.lang.String r0 = "title"
            r29 = r11
            if (r7 >= r5) goto L_0x04f3
            com.google.knowledge.a.a.h r5 = r13.mo58182a(r7)
            java.lang.String r11 = r5.f166796d
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0321
            int r11 = r5.f166793a
            r17 = 4
            r11 = r11 & 4
            if (r11 == 0) goto L_0x0321
            com.google.knowledge.a.a.j r11 = r5.f166797e
            if (r11 != 0) goto L_0x02ed
            com.google.knowledge.a.a.j r11 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x02ed:
            int r11 = r11.f166802a
            r23 = r3
            r3 = 3
            if (r11 != r3) goto L_0x0323
            r11 = 2
            com.google.z.c.h r3 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r11)
            r14.mo60077b(r0, r3)
            com.google.knowledge.a.a.j r0 = r5.f166797e
            if (r0 != 0) goto L_0x0302
            com.google.knowledge.a.a.j r0 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x0302:
            int r3 = r0.f166802a
            r11 = 3
            if (r3 != r11) goto L_0x030c
            java.lang.Object r0 = r0.f166803b
            com.google.knowledge.a.a.t r0 = (com.google.knowledge.p4661a.p4662a.C61758t) r0
            goto L_0x030e
        L_0x030c:
            com.google.knowledge.a.a.t r0 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
        L_0x030e:
            int r3 = r0.f166826a
            r11 = 1
            if (r3 != r11) goto L_0x0318
            java.lang.Object r0 = r0.f166827b
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x031a
        L_0x0318:
            java.lang.String r0 = ""
        L_0x031a:
            boolean r0 = r0.isEmpty()
            r16 = r0 ^ 1
            goto L_0x0323
        L_0x0321:
            r23 = r3
        L_0x0323:
            java.lang.String r0 = r5.f166796d
            boolean r0 = r0.equals(r9)
            r3 = 0
            if (r0 == 0) goto L_0x046b
            int r0 = r5.f166793a
            r17 = 4
            r0 = r0 & 4
            if (r0 == 0) goto L_0x046b
            r0 = 2
            com.google.z.c.h r11 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r0)
            r14.mo60077b(r9, r11)
            if (r18 == 0) goto L_0x035c
            com.google.protobuf.bn r0 = r5.toBuilder()
            com.google.knowledge.a.a.g r0 = (com.google.knowledge.p4661a.p4662a.C61745g) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.knowledge.a.a.h r5 = (com.google.knowledge.p4661a.p4662a.C61746h) r5
            r5.f166797e = r3
            int r3 = r5.f166793a
            r3 = r3 & -5
            r5.f166793a = r3
            r13.mo58187f(r7, r0)
            r24 = r1
            r25 = r2
            goto L_0x04e3
        L_0x035c:
            com.google.knowledge.a.a.j r0 = r5.f166797e
            if (r0 != 0) goto L_0x0362
            com.google.knowledge.a.a.j r0 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x0362:
            int r9 = r0.f166802a
            r11 = 4
            if (r9 != r11) goto L_0x036c
            java.lang.Object r0 = r0.f166803b
            com.google.protos.an.b.d r0 = (com.google.protos.p4850an.p4853b.C63360d) r0
            goto L_0x036e
        L_0x036c:
            com.google.protos.an.b.d r0 = com.google.protos.p4850an.p4853b.C63360d.f171230f
        L_0x036e:
            com.google.protobuf.cq r0 = r0.f171234c
            com.google.protos.an.b.b r9 = com.google.protos.p4850an.p4853b.C63358b.f171216l
            java.lang.Object r0 = com.google.common.p4522b.C58557jl.m90130k(r0, r9)
            com.google.protos.an.b.b r0 = (com.google.protos.p4850an.p4853b.C63358b) r0
            int r9 = r0.f171218a
            r11 = r9 & 1
            if (r11 == 0) goto L_0x0388
            r11 = r9 & 2
            if (r11 == 0) goto L_0x0388
            r11 = r9 & 4
            if (r11 == 0) goto L_0x0388
            r11 = 1
            goto L_0x0389
        L_0x0388:
            r11 = 0
        L_0x0389:
            r9 = r9 & 16
            com.google.protobuf.bv r3 = r13.instance
            com.google.knowledge.a.a.n r3 = (com.google.knowledge.p4661a.p4662a.C61752n) r3
            com.google.protobuf.cq r3 = r3.f166812c
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x0399:
            boolean r24 = r3.hasNext()
            if (r24 == 0) goto L_0x03c6
            java.lang.Object r24 = r3.next()
            r25 = r3
            r3 = r24
            com.google.knowledge.a.a.h r3 = (com.google.knowledge.p4661a.p4662a.C61746h) r3
            r24 = r1
            java.lang.String r1 = r3.f166796d
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x03c1
            int r1 = r3.f166793a
            r3 = 4
            r1 = r1 & r3
            if (r1 == 0) goto L_0x03c1
            r10 = r10 | r11
            if (r9 == 0) goto L_0x03bd
            goto L_0x03cc
        L_0x03bd:
            r25 = r2
            goto L_0x0477
        L_0x03c1:
            r1 = r24
            r3 = r25
            goto L_0x0399
        L_0x03c6:
            r24 = r1
            if (r11 != 0) goto L_0x03d1
            if (r9 == 0) goto L_0x046d
        L_0x03cc:
            r25 = r2
        L_0x03ce:
            r15 = 1
            goto L_0x0477
        L_0x03d1:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            int r3 = r0.f171219b
            int r6 = r0.f171220c
            int r6 = com.google.protos.p4850an.p4853b.C63378v.m96231a(r6)
            if (r6 != 0) goto L_0x03e0
            r6 = 1
        L_0x03e0:
            int r6 = r6 + -2
            int r11 = r0.f171221d
            r25 = r2
            r26 = r10
            r2 = 1
            int r10 = r1.get(r2)
            if (r3 > r10) goto L_0x0422
            int r10 = r1.get(r2)
            if (r3 != r10) goto L_0x0400
            r10 = 2
            int r2 = r1.get(r10)
            if (r6 > r2) goto L_0x0422
            r27 = r15
            r2 = 1
            goto L_0x0403
        L_0x0400:
            r10 = 2
            r27 = r15
        L_0x0403:
            int r15 = r1.get(r2)
            if (r3 != r15) goto L_0x0417
            int r2 = r1.get(r10)
            if (r6 != r2) goto L_0x0417
            r2 = 5
            int r10 = r1.get(r2)
            if (r11 < r10) goto L_0x0417
            goto L_0x0424
        L_0x0417:
            r21 = r3
            r19 = r6
            r22 = r11
            r10 = r26
            if (r9 == 0) goto L_0x0475
            goto L_0x03ce
        L_0x0422:
            r27 = r15
        L_0x0424:
            if (r9 == 0) goto L_0x0461
            r2 = 1
            int r9 = r1.get(r2)
            if (r3 != r9) goto L_0x0459
            r2 = 2
            int r9 = r1.get(r2)
            if (r6 != r9) goto L_0x0459
            r2 = 5
            int r9 = r1.get(r2)
            if (r11 != r9) goto L_0x0459
            int r2 = r0.f171222e
            int r0 = r0.f171223f
            r9 = 11
            int r10 = r1.get(r9)
            if (r2 > r10) goto L_0x0459
            int r9 = r1.get(r9)
            if (r2 != r9) goto L_0x0456
            r2 = 12
            int r1 = r1.get(r2)
            if (r0 < r1) goto L_0x0456
            goto L_0x0459
        L_0x0456:
            r15 = r27
            goto L_0x045a
        L_0x0459:
            r15 = 1
        L_0x045a:
            r21 = r3
            r19 = r6
            r22 = r11
            goto L_0x0469
        L_0x0461:
            r21 = r3
            r19 = r6
            r22 = r11
            r15 = r27
        L_0x0469:
            r10 = 1
            goto L_0x0477
        L_0x046b:
            r24 = r1
        L_0x046d:
            r25 = r2
            r26 = r10
            r27 = r15
            r10 = r26
        L_0x0475:
            r15 = r27
        L_0x0477:
            java.lang.String r0 = r5.f166796d
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x04e3
            com.google.knowledge.a.a.j r0 = r5.f166797e
            if (r0 != 0) goto L_0x0485
            com.google.knowledge.a.a.j r0 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x0485:
            int r0 = r0.f166802a
            r1 = 5
            if (r0 != r1) goto L_0x04e3
            r0 = 2
            com.google.z.c.h r1 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r0)
            r14.mo60077b(r8, r1)
            if (r18 != 0) goto L_0x04ae
            com.google.protobuf.bn r0 = r5.toBuilder()
            com.google.knowledge.a.a.g r0 = (com.google.knowledge.p4661a.p4662a.C61745g) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.knowledge.a.a.h r1 = (com.google.knowledge.p4661a.p4662a.C61746h) r1
            r2 = 0
            r1.f166797e = r2
            int r2 = r1.f166793a
            r2 = r2 & -5
            r1.f166793a = r2
            r13.mo58187f(r7, r0)
            goto L_0x04e3
        L_0x04ae:
            com.google.knowledge.a.a.j r0 = r5.f166797e
            if (r0 != 0) goto L_0x04b4
            com.google.knowledge.a.a.j r0 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x04b4:
            int r1 = r0.f166802a
            r2 = 5
            if (r1 != r2) goto L_0x04be
            java.lang.Object r0 = r0.f166803b
            com.google.protos.an.c.ai r0 = (com.google.protos.p4850an.p4854c.C63408ai) r0
            goto L_0x04c0
        L_0x04be:
            com.google.protos.an.c.ai r0 = com.google.protos.p4850an.p4854c.C63408ai.f171351e
        L_0x04c0:
            com.google.protos.an.c.ac r0 = r0.f171354b
            if (r0 != 0) goto L_0x04c6
            com.google.protos.an.c.ac r0 = com.google.protos.p4850an.p4854c.C63402ac.f171336b
        L_0x04c6:
            com.google.protobuf.cq r0 = r0.f171338a
            java.util.Iterator r0 = r0.iterator()
        L_0x04cc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04e3
            java.lang.Object r1 = r0.next()
            com.google.protos.an.c.ak r1 = (com.google.protos.p4850an.p4854c.C63410ak) r1
            java.lang.String r1 = r1.f171365b
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            r20 = r1 | r20
            goto L_0x04cc
        L_0x04e3:
            int r7 = r7 + 1
            r6 = 2
            r9 = 4
            r0 = r28
            r11 = r29
            r3 = r23
            r1 = r24
            r2 = r25
            goto L_0x02bf
        L_0x04f3:
            r24 = r1
            r25 = r2
            r23 = r3
            r26 = r10
            r27 = r15
            r12.copyOnWrite()
            com.google.protobuf.bv r1 = r12.instance
            com.google.z.c.d r1 = (com.google.p5277z.p5282c.C68014d) r1
            com.google.protobuf.bv r2 = r13.build()
            com.google.knowledge.a.a.n r2 = (com.google.knowledge.p4661a.p4662a.C61752n) r2
            r2.getClass()
            r1.f184280c = r2
            int r2 = r1.f184278a
            r3 = 2
            r2 = r2 | r3
            r1.f184278a = r2
            r4.mo24277i(r12)
            if (r18 == 0) goto L_0x053e
            if (r16 != 0) goto L_0x0525
            r1 = 3
            com.google.z.c.h r2 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r1)
            r14.mo60077b(r0, r2)
            goto L_0x052f
        L_0x0525:
            r1 = 3
            if (r20 != 0) goto L_0x052f
            com.google.z.c.h r0 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r1)
            r14.mo60077b(r8, r0)
        L_0x052f:
            r0 = 2
            com.google.z.c.h r2 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r0)
            r14.mo60077b(r9, r2)
            r0 = r16
            r10 = r26
            r15 = r27
            goto L_0x0570
        L_0x053e:
            r1 = 3
            r10 = r26
            r15 = r27
            if (r16 != 0) goto L_0x054f
            if (r10 != r15) goto L_0x054f
            com.google.z.c.h r2 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r1)
            r14.mo60077b(r0, r2)
            goto L_0x055c
        L_0x054f:
            r0 = r10 ^ r15
            if (r0 != 0) goto L_0x055e
            if (r16 == 0) goto L_0x055c
            if (r10 != 0) goto L_0x055c
            r0 = 3
            r10 = 0
            r16 = 1
            goto L_0x055f
        L_0x055c:
            r0 = 2
            goto L_0x0567
        L_0x055e:
            r0 = 3
        L_0x055f:
            com.google.z.c.h r1 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r0)
            r14.mo60077b(r9, r1)
            goto L_0x055c
        L_0x0567:
            com.google.z.c.h r1 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r0)
            r14.mo60077b(r8, r1)
            r0 = r16
        L_0x0570:
            r1 = r15 ^ 1
            r2 = r25
            com.google.assistant.e.j.e.ff r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11169be.m26470c(r2, r14, r1)
            r12.copyOnWrite()
            com.google.protobuf.bv r2 = r12.instance
            com.google.z.c.d r2 = (com.google.p5277z.p5282c.C68014d) r2
            com.google.protobuf.bv r3 = r14.build()
            com.google.z.c.l r3 = (com.google.p5277z.p5282c.C68022l) r3
            r3.getClass()
            r2.f184281d = r3
            int r3 = r2.f184278a
            r5 = 4
            r3 = r3 | r5
            r2.f184278a = r3
            r4.mo24277i(r12)
            com.google.protobuf.bv r2 = r12.instance
            com.google.z.c.d r2 = (com.google.p5277z.p5282c.C68014d) r2
            com.google.knowledge.a.a.n r2 = r2.f184280c
            if (r2 != 0) goto L_0x059d
            com.google.knowledge.a.a.n r2 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x059d:
            java.lang.String r13 = r2.f166811b
            r12 = r4
            r14 = r10
            r2 = r15
            r16 = r20
            r17 = r18
            com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11169be.m26478k(r12, r13, r14, r15, r16, r17)
            r3 = r24
            com.google.assistant.e.j.ex r3 = r4.mo24270b(r3)
            r4 = r23
            com.google.protobuf.cq r4 = r4.f137840a
            com.google.assistant.e.j.tr r5 = com.google.assistant.p3897e.p3921j.C52490tr.f137795g
            java.lang.Object r4 = com.google.common.p4522b.C58557jl.m90130k(r4, r5)
            com.google.assistant.e.j.tr r4 = (com.google.assistant.p3897e.p3921j.C52490tr) r4
            java.lang.String r5 = "confirm_field"
            com.google.common.base.ax r5 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r5, r1)
            if (r0 == 0) goto L_0x05cf
            if (r18 != 0) goto L_0x05c9
            if (r10 == 0) goto L_0x05c9
            if (r2 != 0) goto L_0x05cd
        L_0x05c9:
            if (r18 == 0) goto L_0x05cf
            if (r20 == 0) goto L_0x05cf
        L_0x05cd:
            r11 = 1
            goto L_0x05d0
        L_0x05cf:
            r11 = 0
        L_0x05d0:
            boolean r0 = r5.mo56113h()
            if (r0 == 0) goto L_0x062a
            java.lang.Object r0 = r5.mo56107c()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.e.eq r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r0
            java.lang.Object r7 = r5.mo56107c()
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            int r9 = r7.f136277e
            r12 = 17
            if (r9 != r12) goto L_0x05f3
            java.lang.Object r7 = r7.f136278f
            com.google.assistant.e.c.c.ah r7 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r7
            goto L_0x05f5
        L_0x05f3:
            com.google.assistant.e.c.c.ah r7 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x05f5:
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.assistant.e.c.c.aa r7 = (com.google.assistant.p3897e.p3902c.p3907c.C50929aa) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.assistant.e.c.c.ah r9 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r9
            int r13 = r9.f132595a
            r14 = 4
            r13 = r13 | r14
            r9.f132595a = r13
            r9.f132600f = r11
            r0.copyOnWrite()
            com.google.protobuf.bv r9 = r0.instance
            com.google.assistant.e.j.e.eu r9 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r9
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.e.c.c.ah r7 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r7
            r7.getClass()
            r9.f136278f = r7
            r9.f136277e = r12
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.j.e.ff r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26609f(r0, r7, r1)
        L_0x062a:
            java.lang.String r0 = "datetime.date"
            com.google.common.base.ax r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r0, r1)
            boolean r7 = r0.mo56113h()
            if (r7 == 0) goto L_0x065f
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.e.eq r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            int r9 = r7.f136273a
            r9 = r9 | 64
            r7.f136273a = r9
            r9 = r10 ^ 1
            r7.f136282j = r9
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.j.e.ff r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26609f(r0, r7, r1)
        L_0x065f:
            java.lang.String r0 = "datetime.time"
            com.google.common.base.ax r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r0, r1)
            boolean r7 = r0.mo56113h()
            if (r7 == 0) goto L_0x0699
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.e.eq r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r0
            if (r10 == 0) goto L_0x067d
            if (r2 != 0) goto L_0x067d
            r10 = 1
            goto L_0x067e
        L_0x067d:
            r10 = 0
        L_0x067e:
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            int r7 = r2.f136273a
            r7 = r7 | 64
            r2.f136273a = r7
            r2.f136282j = r10
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.j.e.ff r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26609f(r0, r2, r1)
        L_0x0699:
            com.google.common.base.ax r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r8, r1)
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x06cd
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.e.eq r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            int r7 = r2.f136273a
            r7 = r7 | 64
            r2.f136273a = r7
            r7 = 1
            r8 = r20 ^ 1
            r2.f136282j = r8
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.j.e.ff r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26609f(r0, r2, r1)
        L_0x06cd:
            com.google.common.base.ax r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r6, r1)
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x07df
            java.lang.Object r2 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            int r2 = r2.f136277e
            r6 = 7
            if (r2 != r6) goto L_0x07df
            r2 = r21
            if (r2 <= 0) goto L_0x07df
            if (r19 < 0) goto L_0x07df
            r7 = r22
            if (r7 <= 0) goto L_0x07df
            java.lang.Object r8 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            int r9 = r8.f136277e
            if (r9 != r6) goto L_0x06fb
            java.lang.Object r6 = r8.f136278f
            com.google.assistant.e.c.c.hh r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r6
            goto L_0x06fd
        L_0x06fb:
            com.google.assistant.e.c.c.hh r6 = com.google.assistant.p3897e.p3902c.p3907c.C51125hh.f133077g
        L_0x06fd:
            com.google.protobuf.bn r8 = r6.toBuilder()
            com.google.assistant.e.c.c.hg r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51124hg) r8
            com.google.assistant.e.j.qb r9 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.j.qa r9 = (com.google.assistant.p3897e.p3921j.C52392qa) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.j.qb r10 = (com.google.assistant.p3897e.p3921j.C52393qb) r10
            int r12 = r10.f137481a
            r13 = 1
            r12 = r12 | r13
            r10.f137481a = r12
            r10.f137482b = r2
            r9.copyOnWrite()
            com.google.protobuf.bv r2 = r9.instance
            com.google.assistant.e.j.qb r2 = (com.google.assistant.p3897e.p3921j.C52393qb) r2
            int r10 = r2.f137481a
            r12 = 2
            r10 = r10 | r12
            r2.f137481a = r10
            int r10 = r19 + 1
            r2.f137483c = r10
            r9.copyOnWrite()
            com.google.protobuf.bv r2 = r9.instance
            com.google.assistant.e.j.qb r2 = (com.google.assistant.p3897e.p3921j.C52393qb) r2
            int r10 = r2.f137481a
            r12 = 4
            r10 = r10 | r12
            r2.f137481a = r10
            r2.f137484d = r7
            com.google.protobuf.bv r2 = r9.build()
            com.google.assistant.e.j.qb r2 = (com.google.assistant.p3897e.p3921j.C52393qb) r2
            int r7 = r6.f133079a
            r9 = 2
            r7 = r7 & r9
            if (r7 == 0) goto L_0x077c
            com.google.assistant.e.j.qf r6 = r6.f133081c
            if (r6 != 0) goto L_0x074c
            com.google.assistant.e.j.qf r6 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
        L_0x074c:
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.assistant.e.j.qe r6 = (com.google.assistant.p3897e.p3921j.C52396qe) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.j.qf r7 = (com.google.assistant.p3897e.p3921j.C52397qf) r7
            r2.getClass()
            r7.f137501i = r2
            int r2 = r7.f137493a
            r9 = 2
            r2 = r2 | r9
            r7.f137493a = r2
            r8.copyOnWrite()
            com.google.protobuf.bv r2 = r8.instance
            com.google.assistant.e.c.c.hh r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r2
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.qf r6 = (com.google.assistant.p3897e.p3921j.C52397qf) r6
            r6.getClass()
            r2.f133081c = r6
            int r6 = r2.f133079a
            r6 = r6 | r9
            r2.f133079a = r6
            goto L_0x07b2
        L_0x077c:
            com.google.assistant.e.j.qf r6 = r6.f133082d
            if (r6 != 0) goto L_0x0782
            com.google.assistant.e.j.qf r6 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
        L_0x0782:
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.assistant.e.j.qe r6 = (com.google.assistant.p3897e.p3921j.C52396qe) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.j.qf r7 = (com.google.assistant.p3897e.p3921j.C52397qf) r7
            r2.getClass()
            r7.f137501i = r2
            int r2 = r7.f137493a
            r9 = 2
            r2 = r2 | r9
            r7.f137493a = r2
            r8.copyOnWrite()
            com.google.protobuf.bv r2 = r8.instance
            com.google.assistant.e.c.c.hh r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r2
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.qf r6 = (com.google.assistant.p3897e.p3921j.C52397qf) r6
            r6.getClass()
            r2.f133082d = r6
            int r6 = r2.f133079a
            r7 = 4
            r6 = r6 | r7
            r2.f133079a = r6
        L_0x07b2:
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.e.eq r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.protobuf.bv r6 = r8.build()
            com.google.assistant.e.c.c.hh r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r6
            r6.getClass()
            r2.f136278f = r6
            r6 = 7
            r2.f136277e = r6
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.j.e.ff r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26609f(r0, r2, r1)
        L_0x07df:
            int r0 = r4.f137798b
            r2 = 3
            if (r0 != r2) goto L_0x0839
            boolean r0 = r5.mo56113h()
            if (r0 == 0) goto L_0x0836
            com.google.android.libraries.assistant.assistantactions.a.d r0 = com.google.android.libraries.assistant.assistantactions.p619a.C11053d.f36295b
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.assistantactions.a.c r0 = (com.google.android.libraries.assistant.assistantactions.p619a.C11052c) r0
            com.google.android.libraries.assistant.assistantactions.a.b r2 = com.google.android.libraries.assistant.assistantactions.p619a.C11051b.f36290d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.assistantactions.a.a r2 = (com.google.android.libraries.assistant.assistantactions.p619a.C11050a) r2
            java.lang.Object r4 = r5.mo56107c()
            com.google.assistant.e.j.e.eu r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r4
            java.lang.String r4 = r4.f136279g
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.libraries.assistant.assistantactions.a.b r5 = (com.google.android.libraries.assistant.assistantactions.p619a.C11051b) r5
            r4.getClass()
            int r6 = r5.f36292a
            r7 = 1
            r6 = r6 | r7
            r5.f36292a = r6
            r5.f36293b = r4
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.libraries.assistant.assistantactions.a.b r4 = (com.google.android.libraries.assistant.assistantactions.p619a.C11051b) r4
            int r5 = r4.f36292a
            r6 = 2
            r5 = r5 | r6
            r4.f36292a = r5
            r4.f36294c = r11
            r0.mo19519a(r2)
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.assistantactions.a.d r0 = (com.google.android.libraries.assistant.assistantactions.p619a.C11053d) r0
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26581k(r1, r0)
            r2 = r29
            r2.add(r0)
            goto L_0x0842
        L_0x0836:
            r2 = r29
            goto L_0x0842
        L_0x0839:
            r2 = r29
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26580j(r1)
            r2.add(r0)
        L_0x0842:
            com.google.common.b.pz r0 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.e.a.j r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c.m26566b(r2, r0, r3)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0859
        L_0x084d:
            r3 = r1
            r2 = r11
            com.google.common.b.pz r0 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.e.a.j r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c.m26566b(r2, r0, r3)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r0)
        L_0x0859:
            r0 = r28
        L_0x085b:
            com.google.android.libraries.assistant.assistantactions.c.d.a r2 = r0.f36613c
            r2.mo19653w()
            return r1
        L_0x0861:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            return r1
        L_0x0864:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11197u.mo19603a(android.content.Context, com.google.assistant.e.j.en, com.google.android.libraries.assistant.assistantactions.b.a):com.google.common.base.ax");
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo19605d(Context context, C52081en enVar, C11054a aVar) {
        return C11203a.m26543a(this, context, enVar, aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C60870cx mo19606e(Context context, C51953ff ffVar, C52507uh uhVar, C52091ex exVar, C11054a aVar) {
        return C11203a.m26544b(this, context, ffVar, uhVar, exVar);
    }

    /* renamed from: f */
    public final /* synthetic */ C58833ax mo19607f(Context context, C51953ff ffVar, C52507uh uhVar, C52091ex exVar) {
        return C58836b.f156633a;
    }
}
