package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.j */
/* compiled from: PG */
public final /* synthetic */ class C103281j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C103218ak f288075a;

    public /* synthetic */ C103281j(C103218ak akVar) {
        this.f288075a = akVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0142 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            com.google.android.apps.gsa.staticplugins.nga.h.ak r1 = r0.f288075a
            r2 = r19
            com.google.android.apps.gsa.staticplugins.nga.h.bj r2 = (com.google.android.apps.gsa.staticplugins.nga.p8065h.C103244bj) r2
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.f.a r1 = r1.f287983a
            long r4 = r1.mo26870b()
            long r3 = r3.toDays(r4)
            r5 = -90
            long r3 = r3 + r5
            com.google.common.b.ho r1 = new com.google.common.b.ho
            r1.<init>()
            com.google.common.base.u r5 = com.google.common.base.C58911u.f156751b
            com.google.common.base.cf r5 = com.google.common.base.C58869cf.m90936b(r5)
            com.google.common.base.u r6 = com.google.common.base.C58911u.f156751b
            com.google.common.base.cf r5 = r5.mo56152f(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x002c:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0166
            java.lang.Object r6 = r2.next()
            com.google.android.gms.appdatasearch.al r6 = (com.google.android.gms.appdatasearch.C142796al) r6
            java.lang.String r7 = "name"
            java.lang.String r7 = r6.mo117712h(r7)
            if (r7 == 0) goto L_0x002c
            java.util.List r7 = r5.mo56155i(r7)
            r8 = 0
            java.lang.Object r7 = com.google.common.p4522b.C58557jl.m90130k(r7, r8)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x002c
            java.nio.ByteBuffer r9 = r6.mo117714j()
            if (r9 == 0) goto L_0x002c
            boolean r10 = r9.hasRemaining()
            r11 = 0
            if (r10 != 0) goto L_0x005b
            goto L_0x00c5
        L_0x005b:
            com.google.cm.a.b.a.f r10 = com.google.p4500cm.p4501a.p4506b.p4507a.C58148f.f155452f     // Catch:{ ct -> 0x00c3 }
            com.google.protobuf.bv r9 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r10, (java.nio.ByteBuffer) r9)     // Catch:{ ct -> 0x00c3 }
            com.google.cm.a.b.a.f r9 = (com.google.p4500cm.p4501a.p4506b.p4507a.C58148f) r9     // Catch:{ ct -> 0x00c3 }
            com.google.protobuf.cq r9 = r9.f155457d     // Catch:{ ct -> 0x00c3 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ ct -> 0x00c3 }
        L_0x0069:
            boolean r10 = r9.hasNext()     // Catch:{ ct -> 0x00c3 }
            if (r10 == 0) goto L_0x00c4
            java.lang.Object r10 = r9.next()     // Catch:{ ct -> 0x00c3 }
            com.google.cm.a.b.a.d r10 = (com.google.p4500cm.p4501a.p4506b.p4507a.C58146d) r10     // Catch:{ ct -> 0x00c3 }
            java.lang.String r12 = r10.f155446b     // Catch:{ ct -> 0x00c3 }
            java.lang.String r13 = "ContactMethods"
            boolean r12 = r12.equals(r13)     // Catch:{ ct -> 0x00c3 }
            if (r12 == 0) goto L_0x0069
            com.google.protobuf.cq r10 = r10.f155450f     // Catch:{ ct -> 0x00c3 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ ct -> 0x00c3 }
        L_0x0085:
            boolean r12 = r10.hasNext()     // Catch:{ ct -> 0x00c3 }
            if (r12 == 0) goto L_0x0069
            java.lang.Object r12 = r10.next()     // Catch:{ ct -> 0x00c3 }
            com.google.cm.a.b.a.f r12 = (com.google.p4500cm.p4501a.p4506b.p4507a.C58148f) r12     // Catch:{ ct -> 0x00c3 }
            com.google.protobuf.cq r13 = r12.f155457d     // Catch:{ ct -> 0x00c3 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ ct -> 0x00c3 }
        L_0x0097:
            boolean r14 = r13.hasNext()     // Catch:{ ct -> 0x00c3 }
            if (r14 == 0) goto L_0x0085
            java.lang.Object r14 = r13.next()     // Catch:{ ct -> 0x00c3 }
            com.google.cm.a.b.a.d r14 = (com.google.p4500cm.p4501a.p4506b.p4507a.C58146d) r14     // Catch:{ ct -> 0x00c3 }
            java.lang.String r15 = r14.f155446b     // Catch:{ ct -> 0x00c3 }
            java.lang.String r8 = "PackageName"
            boolean r8 = r15.equals(r8)     // Catch:{ ct -> 0x00c3 }
            if (r8 == 0) goto L_0x00c1
            com.google.protobuf.cq r8 = r14.f155449e     // Catch:{ ct -> 0x00c3 }
            java.lang.Object r8 = r8.get(r11)     // Catch:{ ct -> 0x00c3 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ ct -> 0x00c3 }
            java.lang.String r13 = "com.google.android.apps.messaging"
            boolean r8 = r8.equals(r13)     // Catch:{ ct -> 0x00c3 }
            if (r8 == 0) goto L_0x00bf
            r8 = r12
            goto L_0x00c5
        L_0x00bf:
            r8 = 0
            goto L_0x0085
        L_0x00c1:
            r8 = 0
            goto L_0x0097
        L_0x00c3:
        L_0x00c4:
            r8 = 0
        L_0x00c5:
            java.lang.String r9 = r6.mo117711g()
            if (r8 == 0) goto L_0x002c
            if (r9 == 0) goto L_0x002c
            com.google.protobuf.cq r8 = r8.f155457d
            java.util.Iterator r8 = r8.iterator()
            r14 = 0
        L_0x00d5:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0142
            java.lang.Object r10 = r8.next()
            com.google.cm.a.b.a.d r10 = (com.google.p4500cm.p4501a.p4506b.p4507a.C58146d) r10
            java.lang.String r12 = r10.f155446b
            java.lang.String r13 = "ContactMethodRanking"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x00d5
            com.google.protobuf.cq r10 = r10.f155450f
            java.lang.Object r10 = r10.get(r11)
            com.google.cm.a.b.a.f r10 = (com.google.p4500cm.p4501a.p4506b.p4507a.C58148f) r10
            com.google.protobuf.cq r10 = r10.f155457d
            java.util.Iterator r10 = r10.iterator()
        L_0x00f9:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x013f
            java.lang.Object r12 = r10.next()
            com.google.cm.a.b.a.d r12 = (com.google.p4500cm.p4501a.p4506b.p4507a.C58146d) r12
            java.lang.String r13 = r12.f155446b
            java.lang.String r11 = "NumOutgoingMessages"
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x0117
            com.google.protobuf.ck r11 = r12.f155448d
            r13 = 0
            long r14 = r11.mo58927a(r13)
            goto L_0x013d
        L_0x0117:
            r13 = 0
            java.lang.String r11 = r12.f155446b
            java.lang.String r13 = "LastTimeOutgoingMessageMs"
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto L_0x0138
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.protobuf.ck r12 = r12.f155448d
            r16 = r14
            r13 = 0
            long r14 = r12.mo58927a(r13)
            long r11 = r11.toDays(r14)
            int r14 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r14 <= 0) goto L_0x013b
            r12 = 0
            goto L_0x0143
        L_0x0138:
            r16 = r14
            r13 = 0
        L_0x013b:
            r14 = r16
        L_0x013d:
            r11 = 0
            goto L_0x00f9
        L_0x013f:
            r16 = r14
            goto L_0x00d5
        L_0x0142:
            r12 = r14
        L_0x0143:
            java.lang.String r7 = com.google.common.base.C58890d.m90988c(r7)
            java.lang.String r6 = r6.mo117713i()
            java.lang.String r6 = com.google.common.base.C58837ba.m90858g(r6)
            com.google.android.gms.search.b.b r6 = com.google.android.gms.search.p10865b.C145864b.m237624b(r9, r6)
            com.google.android.gms.search.b.a r6 = (com.google.android.gms.search.p10865b.C145861a) r6
            int r6 = r6.f394402a
            com.google.android.apps.gsa.staticplugins.nga.h.d r8 = new com.google.android.apps.gsa.staticplugins.nga.h.d
            r8.<init>(r7, r6)
            double r6 = (double) r12
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            r1.mo55456j(r8, r6)
            goto L_0x002c
        L_0x0166:
            com.google.common.b.hu r1 = r1.mo55453g()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.google.common.b.hd r1 = r1.map
            com.google.android.apps.gsa.staticplugins.nga.h.ae r3 = new com.google.android.apps.gsa.staticplugins.nga.h.ae
            r3.<init>(r2)
            p3186j$.util.Map.EL.forEach(r1, r3)
            java.util.Collection r1 = r2.values()
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.apps.gsa.staticplugins.nga.h.af r3 = com.google.android.apps.gsa.staticplugins.nga.p8065h.C103213af.f287978a
            j$.util.stream.DoubleStream r1 = r1.mapToDouble(r3)
            double r3 = r1.sum()
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = java.lang.Math.max(r3, r5)
            com.google.android.apps.gsa.nga.shared.aa.i.m r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80465m.f220842e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.nga.shared.aa.i.h r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80460h) r1
            com.google.android.apps.gsa.staticplugins.nga.h.ag r5 = new com.google.android.apps.gsa.staticplugins.nga.h.ag
            r5.<init>(r1, r3)
            p3186j$.util.Map.EL.forEach(r2, r5)
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.nga.shared.aa.i.m r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80465m) r1
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nga.p8065h.C103281j.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
