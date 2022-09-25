package com.google.android.libraries.gsa.conversation.p1853g.p1854a;

import com.google.android.libraries.gsa.conversation.p1853g.C22641ba;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.gsa.conversation.g.a.p */
/* compiled from: PG */
final class C22611p implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ int f62286a;

    /* renamed from: b */
    final /* synthetic */ long f62287b;

    /* renamed from: c */
    final /* synthetic */ C52081en f62288c;

    /* renamed from: d */
    final /* synthetic */ C22612q f62289d;

    /* renamed from: e */
    final /* synthetic */ C22641ba f62290e;

    public C22611p(C22612q qVar, int i, long j, C52081en enVar, C22641ba baVar) {
        this.f62289d = qVar;
        this.f62286a = i;
        this.f62287b = j;
        this.f62288c = enVar;
        this.f62290e = baVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C22612q qVar = this.f62289d;
        if (qVar.mo27729j(this.f62286a)) {
            qVar.mo27731l(this.f62288c, this.f62290e, qVar.mo27732m(3, this.f62287b));
        } else {
            qVar.mo27728i(qVar.mo27723d(this.f62287b));
        }
    }

    /* JADX WARNING: type inference failed for: r9v62, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo17911gm(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            android.util.Pair r2 = (android.util.Pair) r2
            com.google.android.libraries.gsa.conversation.g.a.q r0 = r1.f62289d
            int r3 = r1.f62286a
            boolean r3 = r0.mo27729j(r3)
            if (r3 != 0) goto L_0x001a
            long r2 = r1.f62287b
            com.google.common.o.a.l r2 = r0.mo27723d(r2)
            r0.mo27728i(r2)
            return
        L_0x001a:
            java.lang.Object r0 = r2.second
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r3 = r0.mo56113h()
            if (r3 == 0) goto L_0x0047
            com.google.common.f.e r2 = com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22612q.f62291a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "%s"
            java.lang.Object r0 = r0.mo56107c()
            r4 = 48407(0xbd17, float:6.7833E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56389s(r3, r0)
            com.google.android.libraries.gsa.conversation.g.a.q r0 = r1.f62289d
            com.google.assistant.e.j.en r2 = r1.f62288c
            com.google.android.libraries.gsa.conversation.g.ba r3 = r1.f62290e
            r4 = 3
            long r5 = r1.f62287b
            com.google.common.o.a.l r4 = r0.mo27732m(r4, r5)
            r0.mo27731l(r2, r3, r4)
            return
        L_0x0047:
            java.lang.Object r0 = r2.first
            java.lang.String r0 = (java.lang.String) r0
            com.google.common.l.i r3 = com.google.common.p4541l.C59326i.f157516d
            boolean r3 = r3.mo56829i(r0)
            if (r3 == 0) goto L_0x005e
            com.google.common.l.i r3 = com.google.common.p4541l.C59326i.f157516d
            byte[] r0 = r3.mo56836k(r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0060
        L_0x005e:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0060:
            boolean r3 = r0.mo56113h()
            if (r3 == 0) goto L_0x0089
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ ct -> 0x0079 }
            byte[] r0 = (byte[]) r0     // Catch:{ ct -> 0x0079 }
            com.google.assistant.e.c.c.dk r3 = com.google.assistant.p3897e.p3902c.p3907c.C51020dk.f132842d     // Catch:{ ct -> 0x0079 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r0)     // Catch:{ ct -> 0x0079 }
            com.google.assistant.e.c.c.dk r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51020dk) r0     // Catch:{ ct -> 0x0079 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ ct -> 0x0079 }
            goto L_0x0099
        L_0x0079:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22612q.f62291a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Failed to parse JwnResult"
            r5 = 48413(0xbd1d, float:6.7841E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0097
        L_0x0089:
            com.google.common.f.e r0 = com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22612q.f62291a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r3 = "Failed to decode JwnResult"
            r4 = 48410(0xbd1a, float:6.7837E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
        L_0x0097:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0099:
            boolean r3 = r0.mo56113h()
            r4 = 4
            if (r3 != 0) goto L_0x00b2
            java.lang.Object r0 = r2.first
            com.google.android.libraries.gsa.conversation.g.a.q r0 = r1.f62289d
            com.google.assistant.e.j.en r2 = r1.f62288c
            com.google.android.libraries.gsa.conversation.g.ba r3 = r1.f62290e
            long r5 = r1.f62287b
            com.google.common.o.a.l r4 = r0.mo27732m(r4, r5)
            r0.mo27731l(r2, r3, r4)
            return
        L_0x00b2:
            com.google.android.libraries.gsa.conversation.g.a.q r2 = r1.f62289d
            com.google.assistant.e.j.en r3 = r1.f62288c
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.e.c.c.dk r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51020dk) r0
            com.google.android.libraries.gsa.conversation.g.ba r5 = r1.f62290e
            long r6 = r1.f62287b
            com.google.common.base.ax r8 = com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22612q.m42119b(r3)
            boolean r9 = r8.mo56113h()
            if (r9 == 0) goto L_0x00d7
            boolean r9 = r0.f132845b
            if (r9 != 0) goto L_0x00d7
            java.util.Map r9 = r2.f62293c
            java.lang.Object r8 = r8.mo56107c()
            r9.remove(r8)
        L_0x00d7:
            boolean r8 = r0.f132846c
            r9 = 1
            if (r8 == 0) goto L_0x00ea
            com.google.assistant.e.j.en r0 = r0.f132844a
            if (r0 != 0) goto L_0x00e2
            com.google.assistant.e.j.en r0 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
        L_0x00e2:
            com.google.common.o.a.l r3 = r2.mo27724e(r9, r6)
            r2.mo27731l(r0, r5, r3)
            return
        L_0x00ea:
            com.google.assistant.e.j.en r0 = r0.f132844a
            if (r0 != 0) goto L_0x00f0
            com.google.assistant.e.j.en r0 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
        L_0x00f0:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.el r0 = (com.google.assistant.p3897e.p3921j.C52079el) r0
            int r8 = r3.f136681a
            r8 = r8 & r9
            if (r8 == 0) goto L_0x010e
            com.google.protobuf.z r8 = r3.f136682b
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.assistant.e.j.en r10 = (com.google.assistant.p3897e.p3921j.C52081en) r10
            r8.getClass()
            int r11 = r10.f136681a
            r11 = r11 | r9
            r10.f136681a = r11
            r10.f136682b = r8
        L_0x010e:
            int r8 = r3.f136681a
            r8 = r8 & r4
            if (r8 == 0) goto L_0x0126
            com.google.protobuf.z r3 = r3.f136683c
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.assistant.e.j.en r8 = (com.google.assistant.p3897e.p3921j.C52081en) r8
            r3.getClass()
            int r10 = r8.f136681a
            r4 = r4 | r10
            r8.f136681a = r4
            r8.f136683c = r3
        L_0x0126:
            com.google.android.libraries.gsa.conversation.h.w r3 = new com.google.android.libraries.gsa.conversation.h.w
            r3.<init>()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.en r4 = (com.google.assistant.p3897e.p3921j.C52081en) r4
            com.google.assistant.e.j.ex r4 = r4.f136685e
            if (r4 != 0) goto L_0x0135
            com.google.assistant.e.j.ex r4 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x0135:
            r3.mo27876c(r4)
            com.google.assistant.e.i.a.ho r4 = com.google.assistant.p3897e.p3917i.p3918a.C51434ho.f133959c
            com.google.common.base.ax r4 = r3.mo27875b(r4)
            boolean r8 = r4.mo56113h()
            if (r8 != 0) goto L_0x0147
        L_0x0144:
            r1 = 0
            goto L_0x06c5
        L_0x0147:
            java.lang.Object r8 = r4.mo56107c()
            com.google.assistant.e.i.a.ho r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51434ho) r8
            int r8 = r8.f133961a
            r8 = r8 & r9
            if (r8 == 0) goto L_0x06a8
            java.lang.Object r8 = r4.mo56107c()
            com.google.assistant.e.i.a.ho r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51434ho) r8
            com.google.assistant.e.i.a.hk r8 = r8.f133962b
            if (r8 != 0) goto L_0x015e
            com.google.assistant.e.i.a.hk r8 = com.google.assistant.p3897e.p3917i.p3918a.C51430hk.f133950c
        L_0x015e:
            com.google.protobuf.bv r11 = r0.build()
            com.google.assistant.e.j.en r11 = (com.google.assistant.p3897e.p3921j.C52081en) r11
            com.google.android.libraries.gsa.conversation.g.a.d r12 = new com.google.android.libraries.gsa.conversation.g.a.d
            r12.<init>()
            com.google.protobuf.cq r11 = r11.f136684d
            java.util.Iterator r11 = r11.iterator()
        L_0x016f:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0187
            java.lang.Object r13 = r11.next()
            com.google.assistant.e.j.ep r13 = (com.google.assistant.p3897e.p3921j.C52083ep) r13
            java.util.Set r14 = r12.f62259c
            int r13 = r13.f136694d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14.add(r13)
            goto L_0x016f
        L_0x0187:
            r11 = -1
            com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22600e.m42094b(r8, r11, r12)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.Map r11 = r12.f62257a
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x019a:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x02ce
            java.lang.Object r13 = r11.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getValue()
            com.google.assistant.e.d.a.e r14 = (com.google.assistant.p3897e.p3908d.p3909a.C51174e) r14
            com.google.protobuf.bv r15 = r14.instance
            com.google.assistant.e.d.a.f r15 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r15
            com.google.protobuf.ch r15 = r15.f133211e
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x02ca
            com.google.protobuf.bv r15 = r14.instance
            com.google.assistant.e.d.a.f r15 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r15
            com.google.protobuf.ch r15 = r15.f133209c
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            java.util.Iterator r15 = r15.iterator()
        L_0x01ca:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0221
            java.lang.Object r16 = r15.next()
            java.lang.Integer r16 = (java.lang.Integer) r16
            int r16 = r16.intValue()
            java.util.Map r10 = r12.f62257a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r16)
            java.lang.Object r9 = r10.get(r9)
            com.google.assistant.e.d.a.e r9 = (com.google.assistant.p3897e.p3908d.p3909a.C51174e) r9
            r9.getClass()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.d.a.f r10 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r10
            com.google.protobuf.ch r10 = r10.f133210d
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            com.google.protobuf.bv r1 = r14.instance
            com.google.assistant.e.d.a.f r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r1
            int r1 = r1.f133208b
            java.util.List r1 = com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22600e.m42095c(r10, r1)
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.d.a.f r10 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r10
            r16 = r11
            com.google.protobuf.ch r11 = com.google.assistant.p3897e.p3908d.p3909a.C51175f.emptyIntList()
            r10.f133210d = r11
            r9.copyOnWrite()
            com.google.protobuf.bv r9 = r9.instance
            com.google.assistant.e.d.a.f r9 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r9
            r9.mo53535b()
            com.google.protobuf.ch r9 = r9.f133210d
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r9)
            r1 = r20
            r11 = r16
            r9 = 1
            goto L_0x01ca
        L_0x0221:
            r16 = r11
            com.google.protobuf.bv r1 = r14.instance
            com.google.assistant.e.d.a.f r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r1
            com.google.protobuf.ch r1 = r1.f133210d
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0231:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x02ba
            java.lang.Object r9 = r1.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.util.Map r10 = r12.f62257a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            java.lang.Object r10 = r10.get(r11)
            com.google.assistant.e.d.a.e r10 = (com.google.assistant.p3897e.p3908d.p3909a.C51174e) r10
            r10.getClass()
            com.google.protobuf.bv r11 = r10.instance
            com.google.assistant.e.d.a.f r11 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r11
            com.google.protobuf.ch r11 = r11.f133209c
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            com.google.protobuf.bv r15 = r14.instance
            com.google.assistant.e.d.a.f r15 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r15
            int r15 = r15.f133208b
            java.util.List r11 = com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22600e.m42095c(r11, r15)
            r10.copyOnWrite()
            com.google.protobuf.bv r15 = r10.instance
            com.google.assistant.e.d.a.f r15 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r15
            r18 = r1
            com.google.protobuf.ch r1 = com.google.assistant.p3897e.p3908d.p3909a.C51175f.emptyIntList()
            r15.f133209c = r1
            r10.copyOnWrite()
            com.google.protobuf.bv r1 = r10.instance
            com.google.assistant.e.d.a.f r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r1
            r1.mo53534a()
            com.google.protobuf.ch r1 = r1.f133209c
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r11, (java.util.List) r1)
            com.google.protobuf.bv r1 = r14.instance
            com.google.assistant.e.d.a.f r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r1
            com.google.protobuf.ch r1 = r1.f133209c
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0290:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x02b6
            java.lang.Object r11 = r1.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r10.mo53532c(r11)
            java.util.Map r15 = r12.f62257a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r11 = r15.get(r11)
            com.google.assistant.e.d.a.e r11 = (com.google.assistant.p3897e.p3908d.p3909a.C51174e) r11
            r11.getClass()
            r11.mo53533d(r9)
            goto L_0x0290
        L_0x02b6:
            r1 = r18
            goto L_0x0231
        L_0x02ba:
            java.lang.Object r1 = r13.getKey()
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.add(r1)
            r1 = r20
            r11 = r16
            r9 = 1
            goto L_0x019a
        L_0x02ca:
            r1 = r20
            goto L_0x019a
        L_0x02ce:
            java.util.Iterator r1 = r8.iterator()
        L_0x02d2:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x02ec
            java.lang.Object r8 = r1.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.util.Map r9 = r12.f62257a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.remove(r8)
            goto L_0x02d2
        L_0x02ec:
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.Map r9 = r12.f62257a
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0300:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0314
            java.lang.Object r10 = r9.next()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22600e.m42097e(r10, r1, r8, r12)
            goto L_0x0300
        L_0x0314:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
        L_0x0319:
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto L_0x0394
            java.lang.Object r9 = r1.getFirst()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r1.removeFirst()
            java.util.Map r10 = r12.f62257a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            java.lang.Object r10 = r10.get(r11)
            com.google.assistant.e.d.a.e r10 = (com.google.assistant.p3897e.p3908d.p3909a.C51174e) r10
            r10.getClass()
            com.google.protobuf.bv r10 = r10.instance
            com.google.assistant.e.d.a.f r10 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r10
            com.google.protobuf.ch r10 = r10.f133209c
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            java.util.Iterator r10 = r10.iterator()
            r11 = 0
        L_0x034a:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x036f
            java.lang.Object r13 = r10.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r13 = r8.get(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            r13.getClass()
            int r13 = r13.intValue()
            if (r11 >= r13) goto L_0x034a
            r11 = r13
            goto L_0x034a
        L_0x036f:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r11 = r11 + 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r8.put(r9, r10)
            java.util.Map r11 = r12.f62258b
            java.lang.Object r11 = r11.get(r10)
            java.util.Set r11 = (java.util.Set) r11
            if (r11 != 0) goto L_0x0390
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.Map r13 = r12.f62258b
            r13.put(r10, r11)
        L_0x0390:
            r11.add(r9)
            goto L_0x0319
        L_0x0394:
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            com.google.assistant.e.d.a.n r8 = com.google.assistant.p3897e.p3908d.p3909a.C51183n.f133226e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.d.a.m r8 = (com.google.assistant.p3897e.p3908d.p3909a.C51182m) r8
            java.util.Map r9 = r12.f62257a
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x03ab:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x03ca
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getValue()
            com.google.assistant.e.d.a.e r11 = (com.google.assistant.p3897e.p3908d.p3909a.C51174e) r11
            r8.mo53548c(r11)
            java.lang.Object r10 = r10.getKey()
            java.lang.Integer r10 = (java.lang.Integer) r10
            r1.add(r10)
            goto L_0x03ab
        L_0x03ca:
            java.util.Map r9 = r12.f62258b
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x03d4:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x04ed
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.util.TreeSet r11 = new java.util.TreeSet
            java.lang.Object r10 = r10.getValue()
            java.util.Collection r10 = (java.util.Collection) r10
            r11.<init>(r10)
            com.google.assistant.e.d.a.l r10 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.d.a.i r10 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r10
            com.google.assistant.e.d.a.k r13 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.START_BBS
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.assistant.e.d.a.l r14 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r14
            int r13 = r13.f133220f
            r14.f133224b = r13
            int r13 = r14.f133223a
            r15 = 1
            r13 = r13 | r15
            r14.f133223a = r13
            java.util.Iterator r11 = r11.iterator()
        L_0x040a:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x04ce
            java.lang.Object r13 = r11.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            com.google.assistant.e.d.a.l r14 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.assistant.e.d.a.i r14 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r14
            com.google.assistant.e.d.a.k r15 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.JOIN_BBS
            r14.copyOnWrite()
            r16 = r9
            com.google.protobuf.bv r9 = r14.instance
            com.google.assistant.e.d.a.l r9 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r9
            int r15 = r15.f133220f
            r9.f133224b = r15
            int r15 = r9.f133223a
            r17 = 1
            r15 = r15 | 1
            r9.f133223a = r15
            java.util.TreeSet r9 = new java.util.TreeSet
            r9.<init>()
            java.util.Map r15 = r12.f62257a
            r18 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            java.lang.Object r11 = r15.get(r11)
            com.google.assistant.e.d.a.e r11 = (com.google.assistant.p3897e.p3908d.p3909a.C51174e) r11
            r11.getClass()
            com.google.protobuf.bv r11 = r11.instance
            com.google.assistant.e.d.a.f r11 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r11
            com.google.protobuf.ch r11 = r11.f133209c
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            java.util.Iterator r11 = r11.iterator()
        L_0x045d:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x047e
            java.lang.Object r15 = r11.next()
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            boolean r19 = r1.contains(r15)
            if (r19 == 0) goto L_0x045d
            r9.add(r15)
            r1.remove(r15)
            goto L_0x045d
        L_0x047e:
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x04c5
            r14.mo53542a(r9)
            com.google.protobuf.bv r9 = r10.instance
            com.google.assistant.e.d.a.l r9 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r9
            com.google.protobuf.ch r9 = r9.f133225c
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x04bc
            com.google.protobuf.bv r9 = r10.build()
            com.google.assistant.e.d.a.l r9 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r9
            r8.mo53551f(r9)
            com.google.assistant.e.d.a.l r9 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r9 = r9.createBuilder()
            r10 = r9
            com.google.assistant.e.d.a.i r10 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r10
            com.google.assistant.e.d.a.k r9 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.START_BBS
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.assistant.e.d.a.l r11 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r11
            int r9 = r9.f133220f
            r11.f133224b = r9
            int r9 = r11.f133223a
            r15 = 1
            r9 = r9 | r15
            r11.f133223a = r9
        L_0x04bc:
            com.google.protobuf.bv r9 = r14.build()
            com.google.assistant.e.d.a.l r9 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r9
            r8.mo53551f(r9)
        L_0x04c5:
            r10.mo53543b(r13)
            r9 = r16
            r11 = r18
            goto L_0x040a
        L_0x04ce:
            r16 = r9
            com.google.protobuf.bv r9 = r10.instance
            com.google.assistant.e.d.a.l r9 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r9
            com.google.protobuf.ch r9 = r9.f133225c
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x04e9
            com.google.protobuf.bv r9 = r10.build()
            com.google.assistant.e.d.a.l r9 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r9
            r8.mo53551f(r9)
        L_0x04e9:
            r9 = r16
            goto L_0x03d4
        L_0x04ed:
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto L_0x051a
            com.google.assistant.e.d.a.l r9 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.d.a.i r9 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r9
            com.google.assistant.e.d.a.k r10 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.JOIN_BBS
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.assistant.e.d.a.l r11 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r11
            int r10 = r10.f133220f
            r11.f133224b = r10
            int r10 = r11.f133223a
            r13 = 1
            r10 = r10 | r13
            r11.f133223a = r10
            r9.mo53542a(r1)
            com.google.protobuf.bv r1 = r9.build()
            com.google.assistant.e.d.a.l r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r1
            r8.mo53551f(r1)
        L_0x051a:
            java.util.HashSet r1 = new java.util.HashSet
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.d.a.n r9 = (com.google.assistant.p3897e.p3908d.p3909a.C51183n) r9
            com.google.protobuf.cq r9 = r9.f133229b
            int r9 = r9.size()
            r1.<init>(r9)
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.d.a.n r9 = (com.google.assistant.p3897e.p3908d.p3909a.C51183n) r9
            com.google.protobuf.cq r9 = r9.f133230c
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            java.util.Iterator r9 = r9.iterator()
        L_0x0537:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0557
            java.lang.Object r10 = r9.next()
            com.google.assistant.e.d.a.l r10 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r10
            int r11 = r10.f133224b
            com.google.assistant.e.d.a.k r11 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.m86072a(r11)
            if (r11 != 0) goto L_0x054d
            com.google.assistant.e.d.a.k r11 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.NO_OP
        L_0x054d:
            com.google.assistant.e.d.a.k r13 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.START_BBS
            if (r11 != r13) goto L_0x0537
            com.google.protobuf.ch r10 = r10.f133225c
            r1.addAll(r10)
            goto L_0x0537
        L_0x0557:
            java.util.Map r9 = r12.f62257a
            java.util.Set r9 = r9.keySet()
            boolean r1 = r1.containsAll(r9)
            if (r1 != 0) goto L_0x0575
            com.google.common.f.e r1 = com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22600e.f62261a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r8 = "Not all basic blocks could be started"
            r9 = 48391(0xbd07, float:6.781E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r9)).mo56386p(r8)
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            goto L_0x0661
        L_0x0575:
            java.util.HashSet r1 = new java.util.HashSet
            java.util.Set r9 = r12.f62259c
            r1.<init>(r9)
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.d.a.n r9 = (com.google.assistant.p3897e.p3908d.p3909a.C51183n) r9
            com.google.protobuf.cq r9 = r9.f133230c
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            java.util.Iterator r9 = r9.iterator()
        L_0x058a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x05ef
            java.lang.Object r10 = r9.next()
            com.google.assistant.e.d.a.l r10 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r10
            int r11 = r10.f133224b
            com.google.assistant.e.d.a.k r11 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.m86072a(r11)
            if (r11 != 0) goto L_0x05a0
            com.google.assistant.e.d.a.k r11 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.NO_OP
        L_0x05a0:
            com.google.assistant.e.d.a.k r13 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.START_BBS
            if (r11 != r13) goto L_0x058a
            com.google.protobuf.ch r10 = r10.f133225c
            java.util.Iterator r10 = r10.iterator()
        L_0x05aa:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x058a
            java.lang.Object r11 = r10.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.util.Map r13 = r12.f62257a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r11 = r13.get(r11)
            com.google.assistant.e.d.a.e r11 = (com.google.assistant.p3897e.p3908d.p3909a.C51174e) r11
            r11.getClass()
            com.google.protobuf.bv r11 = r11.instance
            com.google.assistant.e.d.a.f r11 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r11
            com.google.protobuf.ch r11 = r11.f133211e
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            java.util.Iterator r11 = r11.iterator()
        L_0x05d7:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x05aa
            java.lang.Object r13 = r11.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r1.remove(r13)
            goto L_0x05d7
        L_0x05ef:
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto L_0x05f9
            com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22600e.m42096d(r8)
            goto L_0x0657
        L_0x05f9:
            int r9 = com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22600e.m42093a(r12)
            java.util.Map r10 = r12.f62257a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            java.lang.Object r10 = r10.get(r11)
            com.google.assistant.e.d.a.e r10 = (com.google.assistant.p3897e.p3908d.p3909a.C51174e) r10
            r10.getClass()
            r10.mo53530a(r1)
            r8.mo53548c(r10)
            com.google.assistant.e.d.a.l r1 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.d.a.i r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r1
            com.google.assistant.e.d.a.k r10 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.START_BBS
            r1.copyOnWrite()
            com.google.protobuf.bv r11 = r1.instance
            com.google.assistant.e.d.a.l r11 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r11
            int r10 = r10.f133220f
            r11.f133224b = r10
            int r10 = r11.f133223a
            r12 = 1
            r10 = r10 | r12
            r11.f133223a = r10
            r1.mo53543b(r9)
            r8.mo53550e(r1)
            com.google.assistant.e.d.a.l r1 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.d.a.i r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r1
            com.google.assistant.e.d.a.k r10 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.JOIN_BBS
            r1.copyOnWrite()
            com.google.protobuf.bv r11 = r1.instance
            com.google.assistant.e.d.a.l r11 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r11
            int r10 = r10.f133220f
            r11.f133224b = r10
            int r10 = r11.f133223a
            r12 = 1
            r10 = r10 | r12
            r11.f133223a = r10
            r1.mo53543b(r9)
            r8.mo53550e(r1)
            com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22600e.m42096d(r8)
        L_0x0657:
            com.google.protobuf.bv r1 = r8.build()
            com.google.assistant.e.d.a.n r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51183n) r1
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
        L_0x0661:
            boolean r8 = r1.mo56113h()
            if (r8 == 0) goto L_0x06a0
            com.google.assistant.e.i.a.bq r4 = com.google.assistant.p3897e.p3917i.p3918a.C51274bq.f133487i
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.i.a.bn r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51271bn) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r8 = r4.instance
            com.google.assistant.e.i.a.bq r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51274bq) r8
            int r9 = r8.f133489a
            r10 = 1
            r9 = r9 | r10
            r8.f133489a = r9
            r8.f133490b = r10
            java.lang.Object r1 = r1.mo56107c()
            com.google.assistant.e.d.a.n r1 = (com.google.assistant.p3897e.p3908d.p3909a.C51183n) r1
            r4.copyOnWrite()
            com.google.protobuf.bv r8 = r4.instance
            com.google.assistant.e.i.a.bq r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51274bq) r8
            r1.getClass()
            r8.f133495g = r1
            int r1 = r8.f133489a
            r1 = r1 | 32
            r8.f133489a = r1
            com.google.protobuf.bv r1 = r4.build()
            com.google.assistant.e.i.a.bq r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51274bq) r1
            r3.mo27878e(r1)
            goto L_0x06a8
        L_0x06a0:
            java.lang.Object r1 = r4.mo56107c()
            com.google.assistant.e.i.a.ho r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51434ho) r1
            com.google.assistant.e.i.a.hk r1 = r1.f133962b
        L_0x06a8:
            com.google.assistant.e.i.a.ho r1 = com.google.assistant.p3897e.p3917i.p3918a.C51434ho.f133959c
            r3.mo27877d(r1)
            com.google.assistant.e.j.ex r1 = r3.mo27874a()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.en r3 = (com.google.assistant.p3897e.p3921j.C52081en) r3
            r1.getClass()
            r3.f136685e = r1
            int r1 = r3.f136681a
            r1 = r1 | 16
            r3.f136681a = r1
            goto L_0x0144
        L_0x06c5:
            com.google.common.o.a.l r3 = r2.mo27724e(r1, r6)
            r2.mo27728i(r3)
            com.google.android.libraries.gsa.conversation.b.f r1 = r2.f62297g
            com.google.android.libraries.f.a r3 = r2.f62295e
            long r3 = r3.mo26870b()
            long r3 = r3 - r6
            r1.mo27583b(r3)
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.en r0 = (com.google.assistant.p3897e.p3921j.C52081en) r0
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.gsa.conversation.g.ae r1 = r5.f62367a
            com.google.android.libraries.gsa.conversation.l r1 = (com.google.android.libraries.gsa.conversation.C22727l) r1
            com.google.android.libraries.gsa.conversation.e.j r3 = r1.f62548b
            com.google.android.libraries.gsa.conversation.e.j r3 = r3.mo27659b(r0)
            r1.f62548b = r3
            com.google.android.libraries.gsa.conversation.g.bn r1 = r5.f62369c
            com.google.android.libraries.gsa.conversation.g.ae r3 = r5.f62367a
            r4 = 0
            com.google.common.util.concurrent.cx r0 = r1.mo27768i(r0, r3, r4)
            monitor-enter(r2)
            r2.f62296f = r0     // Catch:{ all -> 0x06fa }
            monitor-exit(r2)     // Catch:{ all -> 0x06fa }
            return
        L_0x06fa:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x06fa }
            goto L_0x06fe
        L_0x06fd:
            throw r0
        L_0x06fe:
            goto L_0x06fd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.p1853g.p1854a.C22611p.mo17911gm(java.lang.Object):void");
    }
}
