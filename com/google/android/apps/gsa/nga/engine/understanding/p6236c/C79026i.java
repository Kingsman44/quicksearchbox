package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.assistant.p3897e.p3917i.p3918a.C51515ko;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.i */
/* compiled from: PG */
public final /* synthetic */ class C79026i implements Function {

    /* renamed from: a */
    public final /* synthetic */ C51515ko f217322a;

    /* renamed from: b */
    public final /* synthetic */ Optional f217323b;

    /* renamed from: c */
    public final /* synthetic */ Function f217324c;

    /* renamed from: d */
    public final /* synthetic */ Function f217325d;

    public /* synthetic */ C79026i(C51515ko koVar, Optional optional, Function function, Function function2) {
        this.f217322a = koVar;
        this.f217323b = optional;
        this.f217324c = function;
        this.f217325d = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r13) {
        /*
            r12 = this;
            com.google.assistant.e.i.a.ko r0 = r12.f217322a
            j$.util.Optional r1 = r12.f217323b
            j$.util.function.Function r2 = r12.f217324c
            j$.util.function.Function r3 = r12.f217325d
            com.google.android.apps.gsa.nga.shared.aa.g.ae r13 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae) r13
            int r4 = com.google.android.apps.gsa.nga.engine.understanding.p6236c.C79028k.f217326a
            com.google.assistant.e.i.a.ki r4 = r0.f134216c
            if (r4 != 0) goto L_0x0012
            com.google.assistant.e.i.a.ki r4 = com.google.assistant.p3897e.p3917i.p3918a.C51509ki.f134188k
        L_0x0012:
            int r4 = r4.f134190a
            r4 = r4 & 8
            r5 = 0
            if (r4 == 0) goto L_0x001a
            goto L_0x0037
        L_0x001a:
            com.google.assistant.e.i.a.km r4 = r0.f134215b
            if (r4 != 0) goto L_0x0020
            com.google.assistant.e.i.a.km r4 = com.google.assistant.p3897e.p3917i.p3918a.C51513km.f134204e
        L_0x0020:
            com.google.protobuf.cq r4 = r4.f134207b
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0037
            com.google.assistant.e.i.a.km r0 = r0.f134215b
            if (r0 != 0) goto L_0x002e
            com.google.assistant.e.i.a.km r0 = com.google.assistant.p3897e.p3917i.p3918a.C51513km.f134204e
        L_0x002e:
            com.google.protobuf.cq r0 = r0.f134207b
            java.lang.Object r0 = r0.get(r5)
            com.google.assistant.e.i.a.ki r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51509ki) r0
            goto L_0x003d
        L_0x0037:
            com.google.assistant.e.i.a.ki r0 = r0.f134216c
            if (r0 != 0) goto L_0x003d
            com.google.assistant.e.i.a.ki r0 = com.google.assistant.p3897e.p3917i.p3918a.C51509ki.f134188k
        L_0x003d:
            r7 = r0
            com.google.protobuf.bn r0 = r13.toBuilder()
            r8 = r0
            com.google.android.apps.gsa.nga.shared.aa.g.ad r8 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80412ad) r8
            int r0 = r7.f134190a
            r4 = 1
            r0 = r0 & r4
            r6 = 2
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r7.f134191b
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.gsa.nga.shared.aa.g.ae r9 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae) r9
            r0.getClass()
            int r10 = r9.f220690a
            r10 = r10 | r6
            r9.f220690a = r10
            r9.f220692c = r0
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.apps.gsa.nga.shared.aa.g.ae r0 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae) r0
            com.google.protobuf.cq r9 = com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae.emptyProtobufList()
            r0.f220693d = r9
        L_0x006c:
            int r13 = r13.f220690a
            r13 = r13 & 4
            if (r13 == 0) goto L_0x0073
            goto L_0x008a
        L_0x0073:
            int r13 = r7.f134190a
            r13 = r13 & 4
            if (r13 == 0) goto L_0x008a
            long r9 = r7.f134194e
            r8.copyOnWrite()
            com.google.protobuf.bv r13 = r8.instance
            com.google.android.apps.gsa.nga.shared.aa.g.ae r13 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae) r13
            int r0 = r13.f220690a
            r0 = r0 | 4
            r13.f220690a = r0
            r13.f220694e = r9
        L_0x008a:
            int r13 = r7.f134190a
            r13 = r13 & 8
            if (r13 == 0) goto L_0x00a1
            long r9 = r7.f134195f
            r8.copyOnWrite()
            com.google.protobuf.bv r13 = r8.instance
            com.google.android.apps.gsa.nga.shared.aa.g.ae r13 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae) r13
            int r0 = r13.f220690a
            r0 = r0 | 8
            r13.f220690a = r0
            r13.f220695f = r9
        L_0x00a1:
            boolean r13 = r1.isPresent()
            if (r13 == 0) goto L_0x00bf
            java.lang.Object r13 = r1.get()
            java.lang.String r13 = (java.lang.String) r13
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.apps.gsa.nga.shared.aa.g.ae r0 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae) r0
            r13.getClass()
            int r1 = r0.f220690a
            r1 = r1 | r4
            r0.f220690a = r1
            r0.f220691b = r13
            goto L_0x00d7
        L_0x00bf:
            int r13 = r7.f134190a
            r13 = r13 & r6
            if (r13 == 0) goto L_0x00d7
            java.lang.String r13 = r7.f134193d
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.apps.gsa.nga.shared.aa.g.ae r0 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae) r0
            r13.getClass()
            int r1 = r0.f220690a
            r1 = r1 | r4
            r0.f220690a = r1
            r0.f220691b = r13
        L_0x00d7:
            com.google.protobuf.cj r13 = new com.google.protobuf.cj
            com.google.protobuf.ch r0 = r7.f134198i
            com.google.protobuf.ci r1 = com.google.assistant.p3897e.p3917i.p3918a.C51509ki.f134187j
            r13.<init>(r0, r1)
            r8.mo74325b(r13)
            int r13 = r7.f134190a
            r13 = r13 & r4
            if (r13 == 0) goto L_0x00f1
            java.lang.String r13 = r7.f134191b
            java.lang.Object r13 = r2.apply(r13)
            com.google.common.util.concurrent.cx r13 = (com.google.common.util.concurrent.C60870cx) r13
            goto L_0x00f9
        L_0x00f1:
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
        L_0x00f9:
            r9 = r13
            int r13 = r7.f134190a
            r13 = r13 & 16
            if (r13 == 0) goto L_0x0163
            com.google.assistant.e.i.a.kk r13 = r7.f134196g
            if (r13 != 0) goto L_0x0106
            com.google.assistant.e.i.a.kk r13 = com.google.assistant.p3897e.p3917i.p3918a.C51511kk.f134200c
        L_0x0106:
            com.google.android.apps.gsa.nga.b.a.j r0 = com.google.android.apps.gsa.nga.b.a.j.c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.nga.b.a.i r0 = (com.google.android.apps.gsa.nga.b.a.i) r0
            com.google.protobuf.cq r1 = r13.f134202a
            java.util.Iterator r1 = r1.iterator()
        L_0x0114:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0128
            java.lang.Object r2 = r1.next()
            com.google.assistant.e.i.a.kd r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51504kd) r2
            com.google.android.apps.gsa.nga.b.a.f r2 = com.google.android.apps.gsa.nga.engine.understanding.p6236c.C79028k.m126972a(r2)
            r0.a(r2)
            goto L_0x0114
        L_0x0128:
            com.google.protobuf.cq r13 = r13.f134203b
            java.util.Iterator r13 = r13.iterator()
        L_0x012e:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x015c
            java.lang.Object r1 = r13.next()
            com.google.assistant.e.i.a.kd r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51504kd) r1
            com.google.android.apps.gsa.nga.b.a.f r1 = com.google.android.apps.gsa.nga.engine.understanding.p6236c.C79028k.m126972a(r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.nga.b.a.j r2 = (com.google.android.apps.gsa.nga.b.a.j) r2
            r1.getClass()
            com.google.protobuf.cq r10 = r2.b
            boolean r11 = r10.mo58948c()
            if (r11 != 0) goto L_0x0156
            com.google.protobuf.cq r10 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r10)
            r2.b = r10
        L_0x0156:
            com.google.protobuf.cq r2 = r2.b
            r2.add(r1)
            goto L_0x012e
        L_0x015c:
            com.google.protobuf.bv r13 = r0.build()
            com.google.android.apps.gsa.nga.b.a.j r13 = (com.google.android.apps.gsa.nga.b.a.j) r13
            goto L_0x0165
        L_0x0163:
            com.google.android.apps.gsa.nga.b.a.j r13 = com.google.android.apps.gsa.nga.b.a.j.c
        L_0x0165:
            r11 = r13
            com.google.protobuf.cq r13 = r11.a
            j$.util.stream.Stream r13 = p3186j$.util.Collection.EL.stream(r13)
            com.google.android.apps.gsa.nga.engine.understanding.c.e r0 = com.google.android.apps.gsa.nga.engine.understanding.p6236c.C79022e.f217314a
            j$.util.stream.Stream r13 = r13.flatMap(r0)
            com.google.android.apps.gsa.nga.engine.understanding.c.f r0 = com.google.android.apps.gsa.nga.engine.understanding.p6236c.C79023f.f217315a
            j$.util.stream.Stream r13 = r13.map(r0)
            j$.util.stream.Stream r13 = r13.distinct()
            j$.util.stream.Collector r0 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r13 = r13.collect(r0)
            com.google.common.b.gu r13 = (com.google.common.p4522b.C58485gu) r13
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at.m128762f(r13, r3)
            com.google.android.apps.gsa.nga.engine.understanding.c.g r1 = new com.google.android.apps.gsa.nga.engine.understanding.c.g
            r1.<init>(r13)
            com.google.common.util.concurrent.bg r13 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r13)
            com.google.common.util.concurrent.cx[] r13 = new com.google.common.util.concurrent.C60870cx[r6]
            r13[r5] = r9
            r13[r4] = r10
            com.google.common.util.concurrent.cf r13 = com.google.common.util.concurrent.C60856cj.m92895d(r13)
            com.google.android.apps.gsa.nga.engine.understanding.c.h r0 = new com.google.android.apps.gsa.nga.engine.understanding.c.h
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r13 = r13.mo57334a(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.understanding.p6236c.C79026i.apply(java.lang.Object):java.lang.Object");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
