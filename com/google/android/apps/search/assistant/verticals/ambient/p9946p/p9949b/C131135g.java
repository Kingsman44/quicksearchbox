package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b;

import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130883x;
import com.google.assistant.p4016z.C53738w;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.b.g */
/* compiled from: PG */
public final /* synthetic */ class C131135g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131136h f358635a;

    /* renamed from: b */
    public final /* synthetic */ C53738w f358636b;

    /* renamed from: c */
    public final /* synthetic */ C130883x f358637c;

    public /* synthetic */ C131135g(C131136h hVar, C53738w wVar, C130883x xVar) {
        this.f358635a = hVar;
        this.f358636b = wVar;
        this.f358637c = xVar;
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            com.google.android.apps.search.assistant.verticals.ambient.p.b.h r2 = r1.f358635a
            com.google.assistant.z.w r0 = r1.f358636b
            com.google.android.apps.search.assistant.verticals.ambient.k.x r3 = r1.f358637c
            r4 = r20
            com.google.android.libraries.mdi.f r4 = (com.google.android.libraries.mdi.C29690f) r4
            com.google.android.apps.search.assistant.verticals.ambient.p.b.w r5 = r2.f358639b     // Catch:{ IOException -> 0x0299 }
            if (r4 == 0) goto L_0x0296
            com.google.protobuf.cq r6 = r4.f80416g     // Catch:{ IOException -> 0x0299 }
            int r6 = r6.size()     // Catch:{ IOException -> 0x0299 }
            if (r6 != 0) goto L_0x001a
            goto L_0x0296
        L_0x001a:
            com.google.cg.k r6 = r0.f141082b     // Catch:{ IOException -> 0x0299 }
            if (r6 != 0) goto L_0x0020
            com.google.cg.k r6 = com.google.p4479cg.C58079k.f155250c     // Catch:{ IOException -> 0x0299 }
        L_0x0020:
            com.google.protobuf.cq r4 = r4.f80416g     // Catch:{ IOException -> 0x0299 }
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)     // Catch:{ IOException -> 0x0299 }
            com.google.android.apps.search.assistant.verticals.ambient.p.b.p r7 = com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131144p.f358656a     // Catch:{ IOException -> 0x0299 }
            j$.util.stream.Stream r4 = r4.filter(r7)     // Catch:{ IOException -> 0x0299 }
            com.google.android.apps.search.assistant.verticals.ambient.p.b.q r7 = com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131145q.f358657a     // Catch:{ IOException -> 0x0299 }
            com.google.android.apps.search.assistant.verticals.ambient.p.b.r r8 = com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131146r.f358658a     // Catch:{ IOException -> 0x0299 }
            com.google.android.apps.search.assistant.verticals.ambient.p.b.s r9 = com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131147s.f358659a     // Catch:{ IOException -> 0x0299 }
            j$.util.stream.Collector r7 = com.google.common.p4522b.C58370cn.m89403c(r7, r8, r9)     // Catch:{ IOException -> 0x0299 }
            java.lang.Object r4 = r4.collect(r7)     // Catch:{ IOException -> 0x0299 }
            com.google.common.b.hd r4 = (com.google.common.p4522b.C58495hd) r4     // Catch:{ IOException -> 0x0299 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ IOException -> 0x0299 }
            r7.<init>()     // Catch:{ IOException -> 0x0299 }
            double r8 = r6.f155252a     // Catch:{ IOException -> 0x0299 }
            double r10 = r6.f155253b     // Catch:{ IOException -> 0x0299 }
            java.lang.Double r6 = r3.mo109848e()     // Catch:{ IOException -> 0x0299 }
            double r12 = r6.doubleValue()     // Catch:{ IOException -> 0x0299 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ IOException -> 0x0299 }
            r6.<init>()     // Catch:{ IOException -> 0x0299 }
            com.google.common.g.at r8 = com.google.common.p4535g.C59127at.m91610b(r8, r10)     // Catch:{ IOException -> 0x0299 }
            com.google.common.g.bb r8 = r8.mo56453d()     // Catch:{ IOException -> 0x0299 }
            com.google.common.n.g.c r9 = new com.google.common.n.g.c     // Catch:{ IOException -> 0x0299 }
            r9.<init>(r12)     // Catch:{ IOException -> 0x0299 }
            double r9 = r9.mo56958a()     // Catch:{ IOException -> 0x0299 }
            r11 = 4708598830872920064(0x41584db080000000, double:6371010.0)
            double r9 = r9 / r11
            com.google.common.g.l r11 = new com.google.common.g.l     // Catch:{ IOException -> 0x0299 }
            r11.<init>(r9)     // Catch:{ IOException -> 0x0299 }
            com.google.common.g.r r8 = com.google.common.p4535g.C59224r.m91905c(r8, r11)     // Catch:{ IOException -> 0x0299 }
            com.google.common.g.cf r9 = com.google.common.p4535g.C59171cj.m91769b()     // Catch:{ IOException -> 0x0299 }
            r10 = 12
            r9.f157214a = r10     // Catch:{ IOException -> 0x0299 }
            com.google.common.g.cj r10 = new com.google.common.g.cj     // Catch:{ IOException -> 0x0299 }
            r10.<init>(r9)     // Catch:{ IOException -> 0x0299 }
            com.google.common.g.u r9 = r10.mo56548a(r8)     // Catch:{ IOException -> 0x0299 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x0299 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x0299 }
        L_0x008b:
            boolean r10 = r4.hasNext()     // Catch:{ IOException -> 0x0299 }
            if (r10 == 0) goto L_0x026b
            java.lang.Object r10 = r4.next()     // Catch:{ IOException -> 0x0299 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ IOException -> 0x0299 }
            java.lang.Object r11 = r10.getKey()     // Catch:{ IOException -> 0x0299 }
            com.google.common.g.t r11 = (com.google.common.p4535g.C59226t) r11     // Catch:{ IOException -> 0x0299 }
            boolean r12 = r9.mo56681c(r11)     // Catch:{ IOException -> 0x0299 }
            if (r12 == 0) goto L_0x0267
            java.lang.Object r10 = r10.getValue()     // Catch:{ IOException -> 0x0299 }
            android.net.Uri r10 = (android.net.Uri) r10     // Catch:{ IOException -> 0x0299 }
            com.google.common.g.u r12 = new com.google.common.g.u     // Catch:{ IOException -> 0x0299 }
            r12.<init>()     // Catch:{ IOException -> 0x0299 }
            java.util.ArrayList r13 = r12.f157335a     // Catch:{ IOException -> 0x0299 }
            r13.clear()     // Catch:{ IOException -> 0x0299 }
            boolean r13 = r9.mo56680b(r11)     // Catch:{ IOException -> 0x0299 }
            if (r13 == 0) goto L_0x00bf
            java.util.ArrayList r13 = r12.f157335a     // Catch:{ IOException -> 0x0299 }
            r13.add(r11)     // Catch:{ IOException -> 0x0299 }
            goto L_0x00fc
        L_0x00bf:
            java.util.ArrayList r13 = r9.f157335a     // Catch:{ IOException -> 0x0299 }
            com.google.common.g.t r14 = r11.mo56678y()     // Catch:{ IOException -> 0x0299 }
            int r13 = java.util.Collections.binarySearch(r13, r14)     // Catch:{ IOException -> 0x0299 }
            if (r13 >= 0) goto L_0x00ce
            int r13 = -r13
            int r13 = r13 + -1
        L_0x00ce:
            com.google.common.g.t r11 = r11.mo56677x()     // Catch:{ IOException -> 0x0299 }
            java.util.ArrayList r14 = r9.f157335a     // Catch:{ IOException -> 0x0299 }
            int r14 = r14.size()     // Catch:{ IOException -> 0x0299 }
        L_0x00d8:
            if (r13 >= r14) goto L_0x00fc
            java.util.ArrayList r15 = r9.f157335a     // Catch:{ IOException -> 0x0299 }
            java.lang.Object r15 = r15.get(r13)     // Catch:{ IOException -> 0x0299 }
            com.google.common.g.t r15 = (com.google.common.p4535g.C59226t) r15     // Catch:{ IOException -> 0x0299 }
            boolean r15 = r15.mo56662H(r11)     // Catch:{ IOException -> 0x0299 }
            if (r15 == 0) goto L_0x00fc
            java.util.ArrayList r15 = r12.f157335a     // Catch:{ IOException -> 0x0299 }
            java.util.ArrayList r1 = r9.f157335a     // Catch:{ IOException -> 0x0299 }
            int r16 = r13 + 1
            java.lang.Object r1 = r1.get(r13)     // Catch:{ IOException -> 0x0299 }
            com.google.common.g.t r1 = (com.google.common.p4535g.C59226t) r1     // Catch:{ IOException -> 0x0299 }
            r15.add(r1)     // Catch:{ IOException -> 0x0299 }
            r1 = r19
            r13 = r16
            goto L_0x00d8
        L_0x00fc:
            com.google.android.libraries.storage.a.k r1 = r5.f358663a     // Catch:{ IOException -> 0x0299 }
            com.google.android.libraries.storage.a.f.f r11 = new com.google.android.libraries.storage.a.f.f     // Catch:{ IOException -> 0x0299 }
            r11.<init>()     // Catch:{ IOException -> 0x0299 }
            java.lang.Object r1 = r1.mo45889c(r10, r11)     // Catch:{ IOException -> 0x0299 }
            java.nio.MappedByteBuffer r1 = (java.nio.MappedByteBuffer) r1     // Catch:{ IOException -> 0x0299 }
            com.google.android.apps.search.assistant.verticals.ambient.p.b.n r10 = new com.google.android.apps.search.assistant.verticals.ambient.p.b.n     // Catch:{ IOException -> 0x0299 }
            r10.<init>(r1)     // Catch:{ IOException -> 0x0299 }
            com.google.common.b.gp r1 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ IOException -> 0x0299 }
            java.util.ArrayList r11 = r12.f157335a     // Catch:{ IOException -> 0x0299 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ IOException -> 0x0299 }
        L_0x0118:
            boolean r12 = r11.hasNext()     // Catch:{ IOException -> 0x0299 }
            r13 = 0
            if (r12 == 0) goto L_0x017f
            java.lang.Object r12 = r11.next()     // Catch:{ IOException -> 0x0299 }
            com.google.common.g.t r12 = (com.google.common.p4535g.C59226t) r12     // Catch:{ IOException -> 0x0299 }
            com.google.android.apps.search.assistant.verticals.ambient.p.b.j r14 = new com.google.android.apps.search.assistant.verticals.ambient.p.b.j     // Catch:{ IOException -> 0x0299 }
            r14.<init>(r12)     // Catch:{ IOException -> 0x0299 }
            com.google.android.apps.search.assistant.verticals.ambient.p.b.l r14 = r10.mo110098a(r14, r13)     // Catch:{ IOException -> 0x0299 }
            com.google.android.apps.search.assistant.verticals.ambient.p.b.k r15 = new com.google.android.apps.search.assistant.verticals.ambient.p.b.k     // Catch:{ IOException -> 0x0299 }
            r15.<init>(r12)     // Catch:{ IOException -> 0x0299 }
            r12 = r14
            com.google.android.apps.search.assistant.verticals.ambient.p.b.a r12 = (com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131124a) r12     // Catch:{ IOException -> 0x0299 }
            int r12 = r12.f358618a     // Catch:{ IOException -> 0x0299 }
            com.google.android.apps.search.assistant.verticals.ambient.p.b.l r12 = r10.mo110098a(r15, r12)     // Catch:{ IOException -> 0x0299 }
            java.nio.ByteBuffer r15 = r10.f358646a     // Catch:{ IOException -> 0x0299 }
            r13 = r14
            com.google.android.apps.search.assistant.verticals.ambient.p.b.a r13 = (com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131124a) r13     // Catch:{ IOException -> 0x0299 }
            int r13 = r13.f358619b     // Catch:{ IOException -> 0x0299 }
            r15.position(r13)     // Catch:{ IOException -> 0x0299 }
            com.google.android.apps.search.assistant.verticals.ambient.p.b.a r12 = (com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131124a) r12     // Catch:{ IOException -> 0x0299 }
            int r12 = r12.f358619b     // Catch:{ IOException -> 0x0299 }
            com.google.android.apps.search.assistant.verticals.ambient.p.b.a r14 = (com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131124a) r14     // Catch:{ IOException -> 0x0299 }
            int r13 = r14.f358619b     // Catch:{ IOException -> 0x0299 }
            int r12 = r12 - r13
            byte[] r13 = new byte[r12]     // Catch:{ IOException -> 0x0299 }
            java.nio.ByteBuffer r14 = r10.f358646a     // Catch:{ IOException -> 0x0299 }
            r14.get(r13)     // Catch:{ IOException -> 0x0299 }
            r14 = 0
            com.google.protobuf.ae r12 = com.google.protobuf.C62897ae.m95112O(r13, r14, r12)     // Catch:{ IOException -> 0x0299 }
        L_0x015b:
            boolean r13 = r12.mo58661D()     // Catch:{ IOException -> 0x0299 }
            if (r13 != 0) goto L_0x0118
            com.google.assistant.z.aq r13 = com.google.assistant.p4016z.C53692aq.f140937k     // Catch:{ IOException -> 0x0299 }
            com.google.protobuf.eb r13 = r13.getParserForType()     // Catch:{ IOException -> 0x0299 }
            com.google.protobuf.ba r14 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ IOException -> 0x0299 }
            com.google.protobuf.MessageLite r13 = r12.mo58689x(r13, r14)     // Catch:{ IOException -> 0x0299 }
            com.google.assistant.z.aq r13 = (com.google.assistant.p4016z.C53692aq) r13     // Catch:{ IOException -> 0x0299 }
            com.google.common.g.bb r14 = com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131129ae.m213652a(r13)     // Catch:{ IOException -> 0x0299 }
            boolean r14 = r8.mo56643d(r14)     // Catch:{ IOException -> 0x0299 }
            if (r14 == 0) goto L_0x015b
            r1.mo55395g(r13)     // Catch:{ IOException -> 0x0299 }
            goto L_0x015b
        L_0x017f:
            r14 = 0
            com.google.common.b.gu r1 = r1.mo55394f()     // Catch:{ IOException -> 0x0299 }
            r11 = r1
            com.google.common.b.pq r11 = (com.google.common.p4522b.C58724pq) r11     // Catch:{ IOException -> 0x0299 }
            int r11 = r11.f156474d     // Catch:{ IOException -> 0x0299 }
            r13 = 0
        L_0x018a:
            if (r13 >= r11) goto L_0x0267
            java.lang.Object r12 = r1.get(r13)     // Catch:{ IOException -> 0x0299 }
            com.google.assistant.z.aq r12 = (com.google.assistant.p4016z.C53692aq) r12     // Catch:{ IOException -> 0x0299 }
            com.google.assistant.z.b r14 = r12.f140946h     // Catch:{ IOException -> 0x0299 }
            if (r14 != 0) goto L_0x0198
            com.google.assistant.z.b r14 = com.google.assistant.p4016z.C53702b.f140971f     // Catch:{ IOException -> 0x0299 }
        L_0x0198:
            com.google.protobuf.ch r14 = r14.f140977e     // Catch:{ IOException -> 0x0299 }
            int r14 = r14.size()     // Catch:{ IOException -> 0x0299 }
            if (r14 <= 0) goto L_0x0254
            com.google.assistant.z.b r14 = r12.f140946h     // Catch:{ IOException -> 0x0299 }
            if (r14 != 0) goto L_0x01a6
            com.google.assistant.z.b r14 = com.google.assistant.p4016z.C53702b.f140971f     // Catch:{ IOException -> 0x0299 }
        L_0x01a6:
            com.google.protobuf.bn r14 = r14.toBuilder()     // Catch:{ IOException -> 0x0299 }
            com.google.assistant.z.a r14 = (com.google.assistant.p4016z.C53675a) r14     // Catch:{ IOException -> 0x0299 }
            com.google.assistant.z.b r15 = r12.f140946h     // Catch:{ IOException -> 0x0299 }
            if (r15 != 0) goto L_0x01b2
            com.google.assistant.z.b r15 = com.google.assistant.p4016z.C53702b.f140971f     // Catch:{ IOException -> 0x0299 }
        L_0x01b2:
            com.google.protobuf.ch r15 = r15.f140977e     // Catch:{ IOException -> 0x0299 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ IOException -> 0x0299 }
        L_0x01b8:
            boolean r16 = r15.hasNext()     // Catch:{ IOException -> 0x0299 }
            if (r16 == 0) goto L_0x0228
            java.lang.Object r16 = r15.next()     // Catch:{ IOException -> 0x0299 }
            java.lang.Integer r16 = (java.lang.Integer) r16     // Catch:{ IOException -> 0x0299 }
            int r16 = r16.intValue()     // Catch:{ IOException -> 0x0299 }
            r20 = r1
            com.google.android.apps.search.assistant.verticals.ambient.p.b.o r1 = com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131143o.CHAINS     // Catch:{ IOException -> 0x0299 }
            com.google.assistant.z.d r17 = com.google.assistant.p4016z.C53719d.f141028f     // Catch:{ IOException -> 0x0299 }
            r18 = r4
            com.google.protobuf.eb r4 = r17.getParserForType()     // Catch:{ IOException -> 0x0299 }
            r17 = r5
            java.util.EnumMap r5 = r10.f358650e     // Catch:{ IOException -> 0x0299 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ IOException -> 0x0299 }
            com.google.android.apps.search.assistant.verticals.ambient.p.b.m r5 = (com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131141m) r5     // Catch:{ IOException -> 0x0299 }
            if (r5 == 0) goto L_0x0214
            java.nio.ByteBuffer r1 = r10.f358646a     // Catch:{ IOException -> 0x0299 }
            int r5 = r5.mo110094b()     // Catch:{ IOException -> 0x0299 }
            int r5 = r5 + r16
            r1.position(r5)     // Catch:{ IOException -> 0x0299 }
            java.nio.ByteBuffer r1 = r10.f358646a     // Catch:{ IOException -> 0x0299 }
            com.google.protobuf.ae r1 = com.google.protobuf.C62897ae.m95111N(r1)     // Catch:{ IOException -> 0x0299 }
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ IOException -> 0x0299 }
            com.google.protobuf.MessageLite r1 = r1.mo58689x(r4, r5)     // Catch:{ IOException -> 0x0299 }
            com.google.assistant.z.d r1 = (com.google.assistant.p4016z.C53719d) r1     // Catch:{ IOException -> 0x0299 }
            r14.copyOnWrite()     // Catch:{ IOException -> 0x0299 }
            com.google.protobuf.bv r4 = r14.instance     // Catch:{ IOException -> 0x0299 }
            com.google.assistant.z.b r4 = (com.google.assistant.p4016z.C53702b) r4     // Catch:{ IOException -> 0x0299 }
            r1.getClass()     // Catch:{ IOException -> 0x0299 }
            r4.mo54007a()     // Catch:{ IOException -> 0x0299 }
            com.google.protobuf.cq r4 = r4.f140976d     // Catch:{ IOException -> 0x0299 }
            r4.add(r1)     // Catch:{ IOException -> 0x0299 }
            r1 = r20
            r5 = r17
            r4 = r18
            goto L_0x01b8
        L_0x0214:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0299 }
            java.lang.String r3 = "HammerDB file does not have a section "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0299 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0299 }
            java.lang.String r1 = r3.concat(r1)     // Catch:{ IOException -> 0x0299 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0299 }
            throw r0     // Catch:{ IOException -> 0x0299 }
        L_0x0228:
            r20 = r1
            r18 = r4
            r17 = r5
            com.google.protobuf.bn r1 = r12.toBuilder()     // Catch:{ IOException -> 0x0299 }
            com.google.assistant.z.an r1 = (com.google.assistant.p4016z.C53689an) r1     // Catch:{ IOException -> 0x0299 }
            r1.copyOnWrite()     // Catch:{ IOException -> 0x0299 }
            com.google.protobuf.bv r4 = r1.instance     // Catch:{ IOException -> 0x0299 }
            com.google.assistant.z.aq r4 = (com.google.assistant.p4016z.C53692aq) r4     // Catch:{ IOException -> 0x0299 }
            com.google.protobuf.bv r5 = r14.build()     // Catch:{ IOException -> 0x0299 }
            com.google.assistant.z.b r5 = (com.google.assistant.p4016z.C53702b) r5     // Catch:{ IOException -> 0x0299 }
            r5.getClass()     // Catch:{ IOException -> 0x0299 }
            r4.f140946h = r5     // Catch:{ IOException -> 0x0299 }
            int r5 = r4.f140939a     // Catch:{ IOException -> 0x0299 }
            r5 = r5 | 512(0x200, float:7.175E-43)
            r4.f140939a = r5     // Catch:{ IOException -> 0x0299 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ IOException -> 0x0299 }
            r12 = r1
            com.google.assistant.z.aq r12 = (com.google.assistant.p4016z.C53692aq) r12     // Catch:{ IOException -> 0x0299 }
            goto L_0x025a
        L_0x0254:
            r20 = r1
            r18 = r4
            r17 = r5
        L_0x025a:
            r6.add(r12)     // Catch:{ IOException -> 0x0299 }
            int r13 = r13 + 1
            r1 = r20
            r5 = r17
            r4 = r18
            goto L_0x018a
        L_0x0267:
            r1 = r19
            goto L_0x008b
        L_0x026b:
            java.util.Iterator r1 = r6.iterator()     // Catch:{ IOException -> 0x0299 }
        L_0x026f:
            boolean r4 = r1.hasNext()     // Catch:{ IOException -> 0x0299 }
            if (r4 == 0) goto L_0x0291
            java.lang.Object r4 = r1.next()     // Catch:{ IOException -> 0x0299 }
            com.google.assistant.z.aq r4 = (com.google.assistant.p4016z.C53692aq) r4     // Catch:{ IOException -> 0x0299 }
            com.google.common.n.g.c r5 = com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131129ae.m213653b(r4, r0, r3)     // Catch:{ IOException -> 0x0299 }
            java.lang.Object r6 = r7.get(r4)     // Catch:{ IOException -> 0x0299 }
            com.google.common.n.g.c r6 = (com.google.common.p4543n.p4551g.C59443c) r6     // Catch:{ IOException -> 0x0299 }
            if (r6 == 0) goto L_0x028d
            int r6 = r6.compareTo(r5)     // Catch:{ IOException -> 0x0299 }
            if (r6 <= 0) goto L_0x026f
        L_0x028d:
            r7.put(r4, r5)     // Catch:{ IOException -> 0x0299 }
            goto L_0x026f
        L_0x0291:
            com.google.common.b.hd r0 = com.google.common.p4522b.C58495hd.m89898l(r7)     // Catch:{ IOException -> 0x0299 }
            goto L_0x02aa
        L_0x0296:
            com.google.common.b.hd r0 = com.google.common.p4522b.C58729pv.f156485a     // Catch:{ IOException -> 0x0299 }
            goto L_0x02aa
        L_0x0299:
            r0 = move-exception
            com.google.common.f.a.d r1 = r2.f358638a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Failed to read places."
            r3 = 39040(0x9880, float:5.4707E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            com.google.common.b.hd r0 = com.google.common.p4522b.C58729pv.f156485a
        L_0x02aa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131135g.apply(java.lang.Object):java.lang.Object");
    }
}
