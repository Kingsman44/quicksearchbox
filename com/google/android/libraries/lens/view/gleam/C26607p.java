package com.google.android.libraries.lens.view.gleam;

import com.google.android.libraries.lens.view.session.C27793m;

/* renamed from: com.google.android.libraries.lens.view.gleam.p */
/* compiled from: PG */
public final /* synthetic */ class C26607p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26633u f72536a;

    /* renamed from: b */
    public final /* synthetic */ C27793m f72537b;

    public /* synthetic */ C26607p(C26633u uVar, C27793m mVar) {
        this.f72536a = uVar;
        this.f72537b = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0246, code lost:
        r5 = com.google.common.base.C58836b.f156633a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            com.google.android.libraries.lens.view.gleam.u r1 = r0.f72536a
            com.google.android.libraries.lens.view.session.m r2 = r0.f72537b
            boolean r3 = r2.mo33302j()
            if (r3 != 0) goto L_0x000e
            goto L_0x050d
        L_0x000e:
            com.google.bp.f.b.a.aa r3 = r2.mo33243h()
            androidx.c.g r4 = new androidx.c.g
            r4.<init>()
            com.google.protobuf.cq r3 = r3.f149750a
            java.util.Iterator r3 = r3.iterator()
        L_0x001d:
            boolean r5 = r3.hasNext()
            r6 = 0
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r5 == 0) goto L_0x006e
            java.lang.Object r5 = r3.next()
            com.google.bp.f.b.a.y r5 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56327y) r5
            com.google.common.base.ax r8 = com.google.android.libraries.lens.view.gleam.C26633u.m49198g(r5)
            java.lang.Object r8 = r8.mo56111f()
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x001d
            com.google.protobuf.cq r5 = r5.f150143f
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)
            com.google.android.libraries.lens.view.gleam.m r9 = com.google.android.libraries.lens.view.gleam.C26604m.f72533a
            j$.util.stream.Stream r5 = r5.filter(r9)
            com.google.android.libraries.lens.view.gleam.n r9 = com.google.android.libraries.lens.view.gleam.C26605n.f72534a
            j$.util.stream.Stream r5 = r5.map(r9)
            com.google.android.libraries.lens.view.gleam.o r9 = com.google.android.libraries.lens.view.gleam.C26606o.f72535a
            java.util.Comparator r9 = p3186j$.util.Comparator.CC.comparingDouble(r9)
            j$.util.Optional r5 = r5.max(r9)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r5 = r5.orElse(r7)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x001d
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r4.put(r8, r5)
            goto L_0x001d
        L_0x006e:
            java.util.Collection r3 = r4.values()
            androidx.c.i r4 = new androidx.c.i
            r5 = 0
            r4.<init>((int) r5)
            com.google.bp.f.b.a.aa r8 = r2.mo33243h()
            com.google.protobuf.cq r8 = r8.f149750a
            java.util.Iterator r8 = r8.iterator()
        L_0x0082:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0433
            java.lang.Object r9 = r8.next()
            com.google.bp.f.b.a.y r9 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56327y) r9
            com.google.common.base.ax r10 = com.google.android.libraries.lens.view.gleam.C26633u.m49198g(r9)
            java.lang.Object r10 = r10.mo56111f()
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x050d
            com.google.common.base.ax r11 = r2.mo33241f()
            com.google.android.libraries.lens.view.am.y r12 = com.google.android.libraries.lens.view.p2069am.C25349y.UNKNOWN
            com.google.android.libraries.lens.view.am.y r12 = com.google.android.libraries.lens.view.gleam.C26551eb.m49036a(r9)
            int r12 = r12.ordinal()
            r13 = 10
            switch(r12) {
                case 4: goto L_0x014d;
                case 5: goto L_0x0114;
                case 6: goto L_0x00ad;
                case 7: goto L_0x0108;
                case 8: goto L_0x00d8;
                case 9: goto L_0x00cb;
                case 10: goto L_0x00be;
                case 11: goto L_0x00b1;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            com.google.common.base.b r11 = com.google.common.base.C58836b.f156633a
            goto L_0x0158
        L_0x00b1:
            r11 = 130711(0x1fe97, float:1.83165E-40)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)
            goto L_0x0158
        L_0x00be:
            r11 = 91443(0x16533, float:1.28139E-40)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)
            goto L_0x0158
        L_0x00cb:
            r11 = 87132(0x1545c, float:1.22098E-40)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)
            goto L_0x0158
        L_0x00d8:
            boolean r11 = com.google.android.libraries.lens.view.gleam.C26551eb.m49043h(r9)
            if (r11 != 0) goto L_0x00df
            goto L_0x0105
        L_0x00df:
            com.google.protobuf.cq r11 = r9.f150143f
            com.google.android.libraries.lens.view.gleam.dy r12 = com.google.android.libraries.lens.view.gleam.C26547dy.f72366a
            java.lang.Iterable r11 = com.google.common.p4522b.C58557jl.m90124e(r11, r12)
            java.util.Iterator r12 = r11.iterator()
            boolean r12 = r12.hasNext()
            if (r12 == 0) goto L_0x0105
            com.google.android.libraries.lens.view.gleam.dz r12 = com.google.android.libraries.lens.view.gleam.C26548dz.f72367a
            boolean r11 = com.google.common.p4522b.C58557jl.m90138s(r11, r12)
            if (r11 == 0) goto L_0x0105
            r11 = 88127(0x1583f, float:1.23492E-40)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)
            goto L_0x0158
        L_0x0105:
            com.google.common.base.b r11 = com.google.common.base.C58836b.f156633a
            goto L_0x0158
        L_0x0108:
            r11 = 72044(0x1196c, float:1.00955E-40)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)
            goto L_0x0158
        L_0x0114:
            boolean r12 = r11.mo56113h()
            if (r12 != 0) goto L_0x011b
            goto L_0x0141
        L_0x011b:
            java.lang.Object r11 = r11.mo56107c()
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x0125:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0141
            java.lang.Object r12 = r11.next()
            com.google.lens.e.d r12 = (com.google.lens.p4699e.C62223d) r12
            int r12 = r12.f168007a
            if (r12 != r13) goto L_0x0125
            r11 = 81523(0x13e73, float:1.14238E-40)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)
            goto L_0x0158
        L_0x0141:
            r11 = 72045(0x1196d, float:1.00957E-40)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)
            goto L_0x0158
        L_0x014d:
            r11 = 72040(0x11968, float:1.0095E-40)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)
        L_0x0158:
            boolean r12 = r11.mo56113h()
            r16 = 8
            r13 = 1
            if (r12 == 0) goto L_0x036e
            java.util.Map r12 = r1.f72635d
            java.lang.Object r11 = r11.mo56107c()
            java.lang.Integer r11 = (java.lang.Integer) r11
            p3186j$.util.Map.EL.putIfAbsent(r12, r10, r11)
            android.util.Size r11 = r2.mo33236b()
            boolean r12 = r3.isEmpty()
            if (r12 != 0) goto L_0x01ce
            com.google.protobuf.cq r12 = r9.f150143f
            int r12 = r12.size()
            if (r12 != 0) goto L_0x017f
            goto L_0x01ce
        L_0x017f:
            com.google.protobuf.cq r12 = r9.f150143f
            j$.util.stream.Stream r12 = p3186j$.util.Collection.EL.stream(r12)
            com.google.android.libraries.lens.view.gleam.m r15 = com.google.android.libraries.lens.view.gleam.C26604m.f72533a
            j$.util.stream.Stream r12 = r12.filter(r15)
            com.google.android.libraries.lens.view.gleam.n r15 = com.google.android.libraries.lens.view.gleam.C26605n.f72534a
            j$.util.stream.Stream r12 = r12.map(r15)
            com.google.android.libraries.lens.view.gleam.q r15 = com.google.android.libraries.lens.view.gleam.C26608q.f72538a
            java.util.Comparator r15 = p3186j$.util.Comparator.CC.comparingDouble(r15)
            j$.util.Optional r12 = r12.max(r15)
            java.lang.Float r15 = java.lang.Float.valueOf(r7)
            java.lang.Object r12 = r12.orElse(r15)
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            int r15 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r15 >= 0) goto L_0x01b2
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            r15 = r8
            r6 = r12
            goto L_0x01d1
        L_0x01b2:
            j$.util.stream.Stream r15 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.libraries.lens.view.gleam.r r6 = new com.google.android.libraries.lens.view.gleam.r
            r6.<init>(r12)
            j$.util.stream.Stream r6 = r15.filter(r6)
            r15 = r8
            long r7 = r6.count()
            int r6 = (int) r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            goto L_0x01d1
        L_0x01ce:
            r15 = r8
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
        L_0x01d1:
            java.util.Map r7 = r1.f72636e
            boolean r7 = r7.containsKey(r10)
            if (r7 == 0) goto L_0x01de
            r6 = 7
            r17 = 2
            goto L_0x036a
        L_0x01de:
            com.google.common.o.i.ab r7 = com.google.common.p4552o.p4563i.C59866ab.f161790e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.common.o.i.y r7 = (com.google.common.p4552o.p4563i.C59975y) r7
            com.google.protobuf.cq r8 = r9.f150143f
            java.util.Iterator r8 = r8.iterator()
        L_0x01ec:
            boolean r18 = r8.hasNext()
            if (r18 == 0) goto L_0x0246
            java.lang.Object r18 = r8.next()
            r12 = r18
            com.google.bp.f.b.a.r r12 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56320r) r12
            com.google.bp.f.b.a.h r14 = r12.f150100g
            if (r14 != 0) goto L_0x0200
            com.google.bp.f.b.a.h r14 = com.google.p4242bp.p4257f.p4260b.p4261a.C56310h.f150072g
        L_0x0200:
            int r14 = r14.f150074a
            r14 = r14 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x01ec
            com.google.bp.f.b.a.h r8 = r12.f150100g
            if (r8 != 0) goto L_0x020c
            com.google.bp.f.b.a.h r8 = com.google.p4242bp.p4257f.p4260b.p4261a.C56310h.f150072g
        L_0x020c:
            com.google.lens.f.d r8 = r8.f150079f
            if (r8 != 0) goto L_0x0212
            com.google.lens.f.d r8 = com.google.lens.p4700f.C62249d.f168055c
        L_0x0212:
            int r12 = r8.f168057a
            r12 = r12 & r13
            if (r12 == 0) goto L_0x0246
            java.lang.String r12 = r8.f168058b
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0220
            goto L_0x0246
        L_0x0220:
            com.google.common.o.alz r12 = com.google.common.p4552o.alz.f159118c
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.common.o.aly r12 = (com.google.common.p4552o.aly) r12
            java.lang.String r8 = r8.f168058b
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.common.o.alz r14 = (com.google.common.p4552o.alz) r14
            r8.getClass()
            int r5 = r14.f159120a
            r5 = r5 | r13
            r14.f159120a = r5
            r14.f159121b = r8
            com.google.protobuf.bv r5 = r12.build()
            com.google.common.o.alz r5 = (com.google.common.p4552o.alz) r5
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90834k(r5)
            goto L_0x0248
        L_0x0246:
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a
        L_0x0248:
            boolean r8 = r5.mo56113h()
            if (r8 == 0) goto L_0x0266
            java.lang.Object r5 = r5.mo56107c()
            com.google.common.o.alz r5 = (com.google.common.p4552o.alz) r5
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.common.o.i.ab r8 = (com.google.common.p4552o.p4563i.C59866ab) r8
            r5.getClass()
            r8.f161793b = r5
            int r5 = r8.f161792a
            r12 = 4
            r5 = r5 | r12
            r8.f161792a = r5
        L_0x0266:
            boolean r5 = r6.mo56113h()
            if (r5 == 0) goto L_0x0285
            java.lang.Object r5 = r6.mo56107c()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r6 = r7.instance
            com.google.common.o.i.ab r6 = (com.google.common.p4552o.p4563i.C59866ab) r6
            int r8 = r6.f161792a
            r8 = r8 | 16
            r6.f161792a = r8
            r6.f161795d = r5
        L_0x0285:
            com.google.android.libraries.lens.view.flags.b r5 = r1.f72633b
            com.google.android.libraries.lens.view.flags.a r6 = com.google.android.libraries.lens.view.flags.C26239a.ENABLE_BOUNDING_BOX_GLEAM_VE_LOGGING
            boolean r5 = r5.mo31462g(r6)
            if (r5 == 0) goto L_0x032a
            boolean r5 = com.google.android.libraries.lens.view.gleam.C26551eb.m49041f(r9)
            if (r5 != 0) goto L_0x029b
            boolean r5 = com.google.android.libraries.lens.view.gleam.C26551eb.m49039d(r9)
            if (r5 == 0) goto L_0x032a
        L_0x029b:
            int r5 = r9.f150139b
            r6 = 7
            if (r5 != r6) goto L_0x02a5
            java.lang.Object r5 = r9.f150140c
            com.google.lens.j.bv r5 = (com.google.lens.p4707j.C62445bv) r5
            goto L_0x02a7
        L_0x02a5:
            com.google.lens.j.bv r5 = com.google.lens.p4707j.C62445bv.f168618e
        L_0x02a7:
            com.google.lens.j.br r5 = r5.f168621b
            if (r5 != 0) goto L_0x02ad
            com.google.lens.j.br r5 = com.google.lens.p4707j.C62441br.f168608h
        L_0x02ad:
            com.google.lens.j.br r5 = com.google.android.libraries.lens.common.p1998a.C24095c.m44763h(r5, r11)
            com.google.common.o.i.aa r8 = com.google.common.p4552o.p4563i.C59865aa.f161782g
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.common.o.i.z r8 = (com.google.common.p4552o.p4563i.C59976z) r8
            float r11 = r5.f168611b
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.common.o.i.aa r12 = (com.google.common.p4552o.p4563i.C59865aa) r12
            int r14 = r12.f161784a
            r14 = r14 | r13
            r12.f161784a = r14
            r12.f161785b = r11
            float r11 = r5.f168612c
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.common.o.i.aa r12 = (com.google.common.p4552o.p4563i.C59865aa) r12
            int r14 = r12.f161784a
            r17 = 2
            r14 = r14 | 2
            r12.f161784a = r14
            r12.f161786c = r11
            float r11 = r5.f168614e
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.common.o.i.aa r12 = (com.google.common.p4552o.p4563i.C59865aa) r12
            int r14 = r12.f161784a
            r14 = r14 | 8
            r12.f161784a = r14
            r12.f161788e = r11
            float r11 = r5.f168613d
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.common.o.i.aa r12 = (com.google.common.p4552o.p4563i.C59865aa) r12
            int r14 = r12.f161784a
            r18 = 4
            r14 = r14 | 4
            r12.f161784a = r14
            r12.f161787d = r11
            float r5 = r5.f168615f
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.common.o.i.aa r11 = (com.google.common.p4552o.p4563i.C59865aa) r11
            int r12 = r11.f161784a
            r12 = r12 | 16
            r11.f161784a = r12
            r11.f161789f = r5
            com.google.protobuf.bv r5 = r8.build()
            com.google.common.o.i.aa r5 = (com.google.common.p4552o.p4563i.C59865aa) r5
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.common.o.i.ab r8 = (com.google.common.p4552o.p4563i.C59866ab) r8
            r5.getClass()
            r8.f161794c = r5
            int r5 = r8.f161792a
            r5 = r5 | 8
            r8.f161792a = r5
            goto L_0x032d
        L_0x032a:
            r6 = 7
            r17 = 2
        L_0x032d:
            com.google.protobuf.bv r5 = r7.instance
            com.google.common.o.i.ab r5 = (com.google.common.p4552o.p4563i.C59866ab) r5
            int r5 = r5.f161792a
            r8 = r5 & 4
            if (r8 == 0) goto L_0x0338
            goto L_0x0340
        L_0x0338:
            r8 = r5 & 16
            if (r8 != 0) goto L_0x0340
            r5 = r5 & 8
            if (r5 == 0) goto L_0x036a
        L_0x0340:
            java.util.Map r5 = r1.f72636e
            com.google.common.o.ado r8 = com.google.common.p4552o.ado.f158388g
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.common.o.adn r8 = (com.google.common.p4552o.adn) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.common.o.ado r11 = (com.google.common.p4552o.ado) r11
            com.google.protobuf.bv r7 = r7.build()
            com.google.common.o.i.ab r7 = (com.google.common.p4552o.p4563i.C59866ab) r7
            r7.getClass()
            r11.f158392b = r7
            int r7 = r11.f158391a
            r7 = r7 | r13
            r11.f158391a = r7
            com.google.protobuf.bv r7 = r8.build()
            com.google.common.o.ado r7 = (com.google.common.p4552o.ado) r7
            r5.put(r10, r7)
        L_0x036a:
            r4.add(r10)
            goto L_0x0372
        L_0x036e:
            r15 = r8
            r6 = 7
            r17 = 2
        L_0x0372:
            com.google.android.libraries.lens.view.am.y r5 = com.google.android.libraries.lens.view.gleam.C26551eb.m49036a(r9)
            com.google.android.libraries.lens.view.am.y r7 = com.google.android.libraries.lens.view.p2069am.C25349y.TEXT_GLEAM
            if (r5 != r7) goto L_0x042c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.google.protobuf.cq r7 = r9.f150143f
            java.util.Iterator r7 = r7.iterator()
        L_0x0385:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0429
            java.lang.Object r8 = r7.next()
            com.google.bp.f.b.a.r r8 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56320r) r8
            int r9 = r8.f150094a
            r9 = r9 & 64
            if (r9 == 0) goto L_0x0385
            com.google.bp.f.b.a.h r9 = r8.f150100g
            if (r9 != 0) goto L_0x039d
            com.google.bp.f.b.a.h r9 = com.google.p4242bp.p4257f.p4260b.p4261a.C56310h.f150072g
        L_0x039d:
            int r9 = r9.f150075b
            r10 = 6
            if (r9 == 0) goto L_0x03c7
            r11 = 5
            if (r9 == r11) goto L_0x03c5
            switch(r9) {
                case 7: goto L_0x03c3;
                case 8: goto L_0x03c1;
                case 9: goto L_0x03bf;
                case 10: goto L_0x03bd;
                case 11: goto L_0x03bb;
                case 12: goto L_0x03b9;
                default: goto L_0x03a8;
            }
        L_0x03a8:
            switch(r9) {
                case 14: goto L_0x03b6;
                case 15: goto L_0x03b3;
                case 16: goto L_0x03b0;
                case 17: goto L_0x03ad;
                default: goto L_0x03ab;
            }
        L_0x03ab:
            r9 = 0
            goto L_0x03c9
        L_0x03ad:
            r9 = 11
            goto L_0x03c9
        L_0x03b0:
            r9 = 10
            goto L_0x03c9
        L_0x03b3:
            r9 = 9
            goto L_0x03c9
        L_0x03b6:
            r9 = 8
            goto L_0x03c9
        L_0x03b9:
            r9 = 7
            goto L_0x03c9
        L_0x03bb:
            r9 = 6
            goto L_0x03c9
        L_0x03bd:
            r9 = 5
            goto L_0x03c9
        L_0x03bf:
            r9 = 4
            goto L_0x03c9
        L_0x03c1:
            r9 = 3
            goto L_0x03c9
        L_0x03c3:
            r9 = 2
            goto L_0x03c9
        L_0x03c5:
            r9 = 1
            goto L_0x03c9
        L_0x03c7:
            r9 = 12
        L_0x03c9:
            int r11 = r9 + -1
            if (r9 == 0) goto L_0x0427
            if (r11 == r13) goto L_0x03ef
            r9 = 4
            if (r11 == r9) goto L_0x03e3
            if (r11 == r10) goto L_0x03d7
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            goto L_0x03fa
        L_0x03d7:
            r9 = 92684(0x16a0c, float:1.29878E-40)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r9)
            goto L_0x03fa
        L_0x03e3:
            r9 = 77842(0x13012, float:1.0908E-40)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r9)
            goto L_0x03fa
        L_0x03ef:
            r9 = 77843(0x13013, float:1.09081E-40)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r9)
        L_0x03fa:
            boolean r10 = r9.mo56113h()
            if (r10 == 0) goto L_0x0385
            com.google.bp.f.b.a.p r10 = r8.f150101h
            if (r10 != 0) goto L_0x0406
            com.google.bp.f.b.a.p r10 = com.google.p4242bp.p4257f.p4260b.p4261a.C56318p.f150087c
        L_0x0406:
            int r10 = r10.f150089a
            r11 = 4
            r10 = r10 & r11
            if (r10 == 0) goto L_0x0415
            com.google.bp.f.b.a.p r8 = r8.f150101h
            if (r8 != 0) goto L_0x0412
            com.google.bp.f.b.a.p r8 = com.google.p4242bp.p4257f.p4260b.p4261a.C56318p.f150087c
        L_0x0412:
            java.lang.String r8 = r8.f150090b
            goto L_0x0417
        L_0x0415:
            java.lang.String r8 = ""
        L_0x0417:
            java.util.Map r10 = r1.f72635d
            java.lang.Object r9 = r9.mo56107c()
            java.lang.Integer r9 = (java.lang.Integer) r9
            p3186j$.util.Map.EL.putIfAbsent(r10, r8, r9)
            r5.add(r8)
            goto L_0x0385
        L_0x0427:
            r1 = 0
            throw r1
        L_0x0429:
            r4.addAll(r5)
        L_0x042c:
            r8 = r15
            r5 = 0
            r6 = 0
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0082
        L_0x0433:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map r3 = r1.f72635d
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0442:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0458
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = r4.contains(r5)
            if (r6 != 0) goto L_0x0442
            r2.add(r5)
            goto L_0x0442
        L_0x0458:
            int r3 = r2.size()
            r5 = 0
        L_0x045d:
            if (r5 >= r3) goto L_0x0486
            java.lang.Object r4 = r2.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Set r6 = r1.f72637f
            boolean r6 = r6.contains(r4)
            if (r6 == 0) goto L_0x0479
            com.google.android.libraries.logging.ve.synthetic.b r6 = r1.f72638g
            if (r6 == 0) goto L_0x0474
            r6.mo33911e(r4)
        L_0x0474:
            java.util.Set r6 = r1.f72637f
            r6.remove(r4)
        L_0x0479:
            java.util.Map r6 = r1.f72635d
            r6.remove(r4)
            java.util.Map r6 = r1.f72636e
            r6.remove(r4)
            int r5 = r5 + 1
            goto L_0x045d
        L_0x0486:
            com.google.android.libraries.logging.ve.synthetic.b r2 = r1.f72638g
            if (r2 != 0) goto L_0x0499
            com.google.common.f.a.d r1 = com.google.android.libraries.lens.view.gleam.C26633u.f72632a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "attachVEs(): invalid syntheticContainer state"
            r3 = 49423(0xc10f, float:6.9256E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0499:
            com.google.android.libraries.lens.view.filters.d.a r2 = r1.f72634c
            com.google.common.o.i.k r2 = r2.mo31166a()
            java.util.Map r3 = r1.f72635d
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x04a9:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x050d
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.Set r5 = r1.f72637f
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto L_0x04a9
            java.util.Map r5 = r1.f72636e
            com.google.common.o.ado r6 = com.google.common.p4552o.ado.f158388g
            java.lang.Object r5 = p3186j$.util.Map.EL.getOrDefault(r5, r4, r6)
            com.google.common.o.ado r5 = (com.google.common.p4552o.ado) r5
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.common.o.adn r5 = (com.google.common.p4552o.adn) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.common.o.ado r6 = (com.google.common.p4552o.ado) r6
            r2.getClass()
            r6.f158395e = r2
            int r7 = r6.f158391a
            r7 = r7 | 16
            r6.f158391a = r7
            com.google.protobuf.bv r5 = r5.build()
            com.google.common.o.ado r5 = (com.google.common.p4552o.ado) r5
            java.util.Map r6 = r1.f72635d
            java.lang.Object r6 = r6.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.getClass()
            int r6 = r6.intValue()
            com.google.android.libraries.logging.ve.synthetic.b r7 = r1.f72638g
            com.google.android.libraries.logging.ve.synthetic.a r6 = r7.mo33909c(r6)
            com.google.protobuf.bt r7 = com.google.android.libraries.lens.view.p2090ba.C25686g.f69825a
            com.google.android.libraries.logging.ve.e r8 = new com.google.android.libraries.logging.ve.e
            r8.<init>(r7, r5)
            r6.mo33858f(r8)
            r6.mo33899a(r4)
            java.util.Set r5 = r1.f72637f
            r5.add(r4)
            goto L_0x04a9
        L_0x050d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.gleam.C26607p.run():void");
    }
}
