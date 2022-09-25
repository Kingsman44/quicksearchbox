package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a;

import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.s */
/* compiled from: PG */
public final /* synthetic */ class C95670s implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95651ae f267815a;

    /* renamed from: b */
    public final /* synthetic */ int f267816b;

    /* renamed from: c */
    public final /* synthetic */ Collection f267817c;

    public /* synthetic */ C95670s(C95651ae aeVar, int i, Collection collection) {
        this.f267815a = aeVar;
        this.f267816b = i;
        this.f267817c = collection;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0181, code lost:
        if (r0.mo89619c(r12.f267908a, r2.intValue(), r12.f267908a.getString(r4.intValue(), new java.lang.Object[]{r1}), com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95694r.m158465a(r9), true, new com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95693q(r12, r9), ((com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r9.iterator().next()).mo84145c()) == false) goto L_0x0183;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.ae r0 = r15.f267815a
            int r8 = r15.f267816b
            java.util.Collection r9 = r15.f267817c
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.as r1 = r0.f267713d
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.z r2 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.d.z
            r2.<init>()
            java.util.List r1 = r1.mo89540c(r2)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x001a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r1.next()
            com.google.android.apps.gsa.shared.notificationlistening.common.b r3 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r3
            java.lang.String r3 = r3.f252589j
            r2.add(r3)
            goto L_0x001a
        L_0x002c:
            java.util.Iterator r1 = r9.iterator()
            r10 = 1
            r3 = 1
            r4 = 1
        L_0x0033:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0053
            java.lang.Object r5 = r1.next()
            com.google.android.apps.gsa.shared.notificationlistening.common.b r5 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r5
            java.util.Set r6 = r0.f267721l
            java.lang.String r7 = r5.f252589j
            boolean r6 = r6.contains(r7)
            r4 = r4 & r6
            java.lang.String r5 = r5.f252589j
            boolean r5 = r2.contains(r5)
            r3 = r3 & r5
            if (r4 != 0) goto L_0x0033
            if (r3 != 0) goto L_0x0033
        L_0x0053:
            if (r4 == 0) goto L_0x0064
            com.google.android.libraries.gsa.k.g r1 = r0.f267711b
            long r2 = com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95651ae.f267709a
            com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.x r4 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.x
            r4.<init>(r0, r8, r9)
            java.lang.String r0 = "timeout"
            r1.mo28213m(r0, r2, r4)
            return
        L_0x0064:
            r11 = 3
            if (r3 == 0) goto L_0x006f
            if (r8 == r11) goto L_0x006c
            if (r8 == 0) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        L_0x006f:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.i.r r12 = r0.f267716g
            r13 = 2
            if (r8 != r13) goto L_0x0077
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        L_0x0077:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.util.Iterator r1 = r9.iterator()
        L_0x007d:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0090
            java.lang.Object r2 = r1.next()
            com.google.android.apps.gsa.shared.notificationlistening.common.b r2 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r2
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.l r4 = r12.f267909b
            r4.mo89661c(r2, r3, r10)
            goto L_0x007d
        L_0x0090:
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L_0x0098
            goto L_0x0183
        L_0x0098:
            if (r8 != 0) goto L_0x0183
            java.util.Iterator r1 = r9.iterator()
            r2 = 0
            r4 = r2
        L_0x00a0:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00c9
            java.lang.Object r5 = r1.next()
            com.google.android.apps.gsa.shared.notificationlistening.common.b r5 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r5
            boolean r6 = r5 instanceof com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification
            if (r6 != 0) goto L_0x00b2
        L_0x00b0:
            r4 = r2
            goto L_0x00c9
        L_0x00b2:
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r5 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r5
            boolean r6 = r5.mo84134g()
            if (r6 != 0) goto L_0x00bb
            goto L_0x00b0
        L_0x00bb:
            if (r4 != 0) goto L_0x00c0
            java.lang.CharSequence r4 = r5.f252541r
            goto L_0x00a0
        L_0x00c0:
            java.lang.CharSequence r5 = r5.f252541r
            boolean r5 = com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95694r.m158466c(r4, r5)
            if (r5 != 0) goto L_0x00a0
            goto L_0x00b0
        L_0x00c9:
            java.util.Iterator r1 = r9.iterator()
            r5 = r2
        L_0x00ce:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00f7
            java.lang.Object r6 = r1.next()
            com.google.android.apps.gsa.shared.notificationlistening.common.b r6 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r6
            boolean r7 = r6 instanceof com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification
            if (r7 != 0) goto L_0x00e0
        L_0x00de:
            r5 = r2
            goto L_0x00f7
        L_0x00e0:
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r6 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r6
            boolean r7 = r6.mo84134g()
            if (r7 == 0) goto L_0x00e9
            goto L_0x00de
        L_0x00e9:
            if (r5 != 0) goto L_0x00ee
            java.lang.CharSequence r5 = r6.f252535E
            goto L_0x00ce
        L_0x00ee:
            java.lang.CharSequence r6 = r6.f252535E
            boolean r6 = com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95694r.m158466c(r5, r6)
            if (r6 != 0) goto L_0x00ce
            goto L_0x00de
        L_0x00f7:
            java.util.Iterator r1 = r9.iterator()
            r6 = r2
        L_0x00fc:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x011b
            java.lang.Object r7 = r1.next()
            com.google.android.apps.gsa.shared.notificationlistening.common.b r7 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r7
            boolean r14 = r7 instanceof com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification
            if (r14 == 0) goto L_0x010d
            goto L_0x011c
        L_0x010d:
            if (r6 != 0) goto L_0x0112
            java.lang.String r6 = r7.f252581b
            goto L_0x00fc
        L_0x0112:
            java.lang.String r7 = r7.f252581b
            boolean r7 = com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95694r.m158466c(r6, r7)
            if (r7 != 0) goto L_0x00fc
            goto L_0x011c
        L_0x011b:
            r2 = r6
        L_0x011c:
            if (r4 == 0) goto L_0x0129
            java.lang.String r1 = r4.toString()
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0142
        L_0x0129:
            if (r5 == 0) goto L_0x0136
            java.lang.String r1 = r5.toString()
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0142
        L_0x0136:
            if (r2 == 0) goto L_0x0183
            java.lang.String r1 = r2.toString()
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0142:
            com.google.android.apps.gsa.staticplugins.bisto.f.ae r4 = r12.f267910c
            int r5 = r2.intValue()
            java.lang.Integer r4 = r4.mo89215g(r5)
            if (r4 == 0) goto L_0x0183
            com.google.android.apps.gsa.staticplugins.bisto.notifications.i.q r6 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.i.q
            r6.<init>(r12, r9)
            android.content.Context r5 = r12.f267908a
            int r2 = r2.intValue()
            android.content.Context r7 = r12.f267908a
            int r4 = r4.intValue()
            java.lang.Object[] r14 = new java.lang.Object[r10]
            r14[r3] = r1
            java.lang.String r3 = r7.getString(r4, r14)
            android.net.Uri r4 = com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95694r.m158465a(r9)
            r7 = 1
            java.util.Iterator r1 = r9.iterator()
            java.lang.Object r1 = r1.next()
            com.google.android.apps.gsa.shared.notificationlistening.common.b r1 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r1
            java.lang.String r14 = r1.mo84145c()
            r1 = r5
            r5 = r7
            r7 = r14
            boolean r0 = r0.mo89619c(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L_0x0186
        L_0x0183:
            r12.mo89644b(r8, r9)
        L_0x0186:
            com.google.common.o.me r0 = com.google.common.p4552o.C60264me.f163045e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.mc r0 = (com.google.common.p4552o.C60262mc) r0
            com.google.common.o.np r1 = com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95311q.m157567a(r9)
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.common.o.me r2 = (com.google.common.p4552o.C60264me) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.common.o.nr r1 = (com.google.common.p4552o.C60305nr) r1
            r1.getClass()
            r2.f163049c = r1
            int r1 = r2.f163047a
            r1 = r1 | r13
            r2.f163047a = r1
            r1 = 4
            if (r8 == 0) goto L_0x01de
            if (r8 == r10) goto L_0x01cf
            if (r8 == r13) goto L_0x01bf
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.common.o.me r2 = (com.google.common.p4552o.C60264me) r2
            r2.f163048b = r1
            int r1 = r2.f163047a
            r1 = r1 | r10
            r2.f163047a = r1
            goto L_0x021e
        L_0x01bf:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.me r1 = (com.google.common.p4552o.C60264me) r1
            r2 = 5
            r1.f163048b = r2
            int r2 = r1.f163047a
            r2 = r2 | r10
            r1.f163047a = r2
            goto L_0x021e
        L_0x01cf:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.me r1 = (com.google.common.p4552o.C60264me) r1
            r1.f163048b = r11
            int r2 = r1.f163047a
            r2 = r2 | r10
            r1.f163047a = r2
            goto L_0x021e
        L_0x01de:
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.common.o.me r2 = (com.google.common.p4552o.C60264me) r2
            r2.f163048b = r10
            int r3 = r2.f163047a
            r3 = r3 | r10
            r2.f163047a = r3
            java.util.Map r2 = r12.f267913f
            java.util.Iterator r3 = r9.iterator()
            java.lang.Object r3 = r3.next()
            com.google.android.apps.gsa.shared.notificationlistening.common.b r3 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r3
            com.google.android.apps.gsa.shared.notificationlistening.common.h r3 = r3.mo84131b()
            java.lang.Object r2 = r2.get(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x021e
            com.google.android.libraries.f.a r3 = r12.f267911d
            long r3 = r3.mo26871c()
            long r5 = r2.longValue()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.common.o.me r2 = (com.google.common.p4552o.C60264me) r2
            int r7 = r2.f163047a
            r1 = r1 | r7
            r2.f163047a = r1
            long r3 = r3 - r5
            int r1 = (int) r3
            r2.f163050d = r1
        L_0x021e:
            com.google.android.apps.gsa.staticplugins.bisto.f.m r1 = r12.f267912e
            com.google.common.o.nm r2 = com.google.common.p4552o.C60300nm.f163138H
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.nk r2 = (com.google.common.p4552o.C60298nk) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.common.o.nm r3 = (com.google.common.p4552o.C60300nm) r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.me r0 = (com.google.common.p4552o.C60264me) r0
            r0.getClass()
            r3.f163153g = r0
            int r0 = r3.f163147a
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r3.f163147a = r0
            r1.mo83545c(r2)
            if (r8 != 0) goto L_0x0262
            java.util.Map r0 = r12.f267913f
            java.util.Iterator r1 = r9.iterator()
            java.lang.Object r1 = r1.next()
            com.google.android.apps.gsa.shared.notificationlistening.common.b r1 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r1
            com.google.android.apps.gsa.shared.notificationlistening.common.h r1 = r1.mo84131b()
            com.google.android.libraries.f.a r2 = r12.f267911d
            long r2 = r2.mo26871c()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r1, r2)
        L_0x0262:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95670s.run():void");
    }
}
