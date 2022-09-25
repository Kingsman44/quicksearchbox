package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c;

import com.google.android.libraries.assistant.p1533o.C18502t;
import com.google.protobuf.C63088z;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.c.f */
/* compiled from: PG */
final class C126498f extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C63088z f348386a;

    /* renamed from: b */
    final /* synthetic */ C71422aw f348387b;

    /* renamed from: c */
    final /* synthetic */ C126501i f348388c;

    /* renamed from: d */
    final /* synthetic */ C18502t f348389d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126498f(C63088z zVar, C71422aw awVar, C126501i iVar, C18502t tVar) {
        super(1);
        this.f348386a = zVar;
        this.f348387b = awVar;
        this.f348388c = iVar;
        this.f348389d = tVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0182, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0183, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0187, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo5761a(java.lang.Object r14) {
        /*
            r13 = this;
            com.google.android.libraries.assistant.o.am r14 = (com.google.android.libraries.assistant.p1533o.C18450am) r14
            java.lang.String r0 = "$this$srpData"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r0)
            com.google.protobuf.z r0 = r13.f348386a
            java.io.InputStream r0 = r0.mo59041m()
            kotlinx.coroutines.aw r1 = r13.f348387b
            com.google.android.apps.search.assistant.surfaces.e.d.c.i r2 = r13.f348388c
            com.google.android.libraries.assistant.o.t r3 = r13.f348389d
        L_0x0013:
            boolean r4 = kotlinx.coroutines.C71423ax.m104199d(r1)     // Catch:{ all -> 0x0180 }
            if (r4 == 0) goto L_0x0179
            java.lang.String r4 = "inputStream"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)     // Catch:{ all -> 0x0180 }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x0180 }
            com.google.al.d.a.ac r5 = com.google.p395al.p417d.p418a.C8523ac.f29564e     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bv r4 = com.google.p395al.p417d.p418a.C8523ac.parseDelimitedFrom(r5, r0, r4)     // Catch:{ all -> 0x0180 }
            com.google.al.d.a.ac r4 = (com.google.p395al.p417d.p418a.C8523ac) r4     // Catch:{ all -> 0x0180 }
            if (r4 != 0) goto L_0x002e
            goto L_0x0179
        L_0x002e:
            com.google.protobuf.bt r5 = com.google.p395al.p417d.p418a.C8594u.f29736g     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)     // Catch:{ all -> 0x0180 }
            r4.mo58887l(r5)     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bf r6 = r4.f169962ag     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bs r5 = r5.f169971d     // Catch:{ all -> 0x0180 }
            boolean r5 = r6.mo58857o(r5)     // Catch:{ all -> 0x0180 }
            if (r5 == 0) goto L_0x013e
            boolean r5 = r2.f348398c     // Catch:{ all -> 0x0180 }
            if (r5 != 0) goto L_0x013e
            com.google.protobuf.bt r5 = com.google.p395al.p417d.p418a.C8594u.f29736g     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)     // Catch:{ all -> 0x0180 }
            r4.mo58887l(r5)     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bf r6 = r4.f169962ag     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bs r7 = r5.f169971d     // Catch:{ all -> 0x0180 }
            java.lang.Object r6 = r6.mo58854l(r7)     // Catch:{ all -> 0x0180 }
            if (r6 != 0) goto L_0x005b
            java.lang.Object r5 = r5.f169969b     // Catch:{ all -> 0x0180 }
            goto L_0x005f
        L_0x005b:
            java.lang.Object r5 = r5.mo58889c(r6)     // Catch:{ all -> 0x0180 }
        L_0x005f:
            java.lang.String r6 = "chunk.getExtension(Action.action)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ all -> 0x0180 }
            com.google.al.d.a.u r5 = (com.google.p395al.p417d.p418a.C8594u) r5     // Catch:{ all -> 0x0180 }
            com.google.cm.d.a.b r6 = r5.f29742e     // Catch:{ all -> 0x0180 }
            if (r6 != 0) goto L_0x006c
            com.google.cm.d.a.b r6 = com.google.p4500cm.p4518d.p4519a.C58179b.f155534j     // Catch:{ all -> 0x0180 }
        L_0x006c:
            int r6 = r6.f155536a     // Catch:{ all -> 0x0180 }
            r7 = 2
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0089
            com.google.android.apps.search.assistant.surfaces.e.d.c.e r6 = new com.google.android.apps.search.assistant.surfaces.e.d.c.e     // Catch:{ all -> 0x0180 }
            r6.<init>(r5)     // Catch:{ all -> 0x0180 }
            com.google.android.libraries.assistant.o.aa r6 = com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126558c.m206919a(r6)     // Catch:{ all -> 0x0180 }
            r3.copyOnWrite()     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bv r8 = r3.instance     // Catch:{ all -> 0x0180 }
            com.google.android.libraries.assistant.o.u r8 = (com.google.android.libraries.assistant.p1533o.C18503u) r8     // Catch:{ all -> 0x0180 }
            com.google.android.libraries.assistant.o.u r9 = com.google.android.libraries.assistant.p1533o.C18503u.f52450f     // Catch:{ all -> 0x0180 }
            r6.getClass()     // Catch:{ all -> 0x0180 }
            r8.f52454c = r6     // Catch:{ all -> 0x0180 }
        L_0x0089:
            java.util.Set r6 = r2.f348396a     // Catch:{ all -> 0x0180 }
            java.util.Set r8 = r2.f348397b     // Catch:{ all -> 0x0180 }
            com.google.bb.a.pb r9 = r5.f29740c     // Catch:{ all -> 0x0180 }
            if (r9 != 0) goto L_0x0093
            com.google.bb.a.pb r9 = com.google.p4152bb.p4153a.C55349pb.f145830g     // Catch:{ all -> 0x0180 }
        L_0x0093:
            com.google.protobuf.cq r9 = r9.f145835d     // Catch:{ all -> 0x0180 }
            java.lang.String r10 = "actionPeanut.actionV2List"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)     // Catch:{ all -> 0x0180 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0180 }
            r11 = 10
            int r11 = p5462h.p5463a.C69540x.m100804k(r9, r11)     // Catch:{ all -> 0x0180 }
            r10.<init>(r11)     // Catch:{ all -> 0x0180 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0180 }
        L_0x00a9:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0180 }
            if (r11 == 0) goto L_0x00cf
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0180 }
            com.google.bb.a.ad r11 = (com.google.p4152bb.p4153a.C54946ad) r11     // Catch:{ all -> 0x0180 }
            com.google.bb.a.af r11 = r11.f144536d     // Catch:{ all -> 0x0180 }
            if (r11 != 0) goto L_0x00bb
            com.google.bb.a.af r11 = com.google.p4152bb.p4153a.C54948af.f144541h     // Catch:{ all -> 0x0180 }
        L_0x00bb:
            int r11 = r11.f144544b     // Catch:{ all -> 0x0180 }
            com.google.bb.a.x r11 = com.google.p4152bb.p4153a.C55421x.m87686a(r11)     // Catch:{ all -> 0x0180 }
            if (r11 != 0) goto L_0x00c5
            com.google.bb.a.x r11 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE     // Catch:{ all -> 0x0180 }
        L_0x00c5:
            int r11 = r11.f146230cP     // Catch:{ all -> 0x0180 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0180 }
            r10.add(r11)     // Catch:{ all -> 0x0180 }
            goto L_0x00a9
        L_0x00cf:
            java.util.Iterator r9 = r10.iterator()     // Catch:{ all -> 0x0180 }
        L_0x00d3:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0180 }
            r11 = 1
            if (r10 == 0) goto L_0x00f8
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0180 }
            java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ all -> 0x0180 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0180 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0180 }
            boolean r12 = r6.contains(r10)     // Catch:{ all -> 0x0180 }
            if (r12 != 0) goto L_0x00f0
            r6 = 1
            goto L_0x00f9
        L_0x00f0:
            boolean r10 = r8.contains(r10)     // Catch:{ all -> 0x0180 }
            if (r10 == 0) goto L_0x00d3
            r6 = 2
            goto L_0x00f9
        L_0x00f8:
            r6 = 3
        L_0x00f9:
            int r6 = r6 + -1
            if (r6 == 0) goto L_0x0131
            if (r6 == r11) goto L_0x0111
            boolean r5 = r5.f29739b     // Catch:{ all -> 0x0180 }
            if (r5 == 0) goto L_0x013e
            r3.copyOnWrite()     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x0180 }
            com.google.android.libraries.assistant.o.u r5 = (com.google.android.libraries.assistant.p1533o.C18503u) r5     // Catch:{ all -> 0x0180 }
            com.google.android.libraries.assistant.o.u r6 = com.google.android.libraries.assistant.p1533o.C18503u.f52450f     // Catch:{ all -> 0x0180 }
            r5.f52453b = r11     // Catch:{ all -> 0x0180 }
            r2.f348398c = r11     // Catch:{ all -> 0x0180 }
            goto L_0x013e
        L_0x0111:
            r3.copyOnWrite()     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bv r6 = r3.instance     // Catch:{ all -> 0x0180 }
            com.google.android.libraries.assistant.o.u r6 = (com.google.android.libraries.assistant.p1533o.C18503u) r6     // Catch:{ all -> 0x0180 }
            com.google.android.libraries.assistant.o.u r7 = com.google.android.libraries.assistant.p1533o.C18503u.f52450f     // Catch:{ all -> 0x0180 }
            r6.f52453b = r11     // Catch:{ all -> 0x0180 }
            com.google.bb.a.pb r5 = r5.f29740c     // Catch:{ all -> 0x0180 }
            if (r5 != 0) goto L_0x0122
            com.google.bb.a.pb r5 = com.google.p4152bb.p4153a.C55349pb.f145830g     // Catch:{ all -> 0x0180 }
        L_0x0122:
            r3.copyOnWrite()     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bv r6 = r3.instance     // Catch:{ all -> 0x0180 }
            com.google.android.libraries.assistant.o.u r6 = (com.google.android.libraries.assistant.p1533o.C18503u) r6     // Catch:{ all -> 0x0180 }
            r5.getClass()     // Catch:{ all -> 0x0180 }
            r6.f52456e = r5     // Catch:{ all -> 0x0180 }
            r2.f348398c = r11     // Catch:{ all -> 0x0180 }
            goto L_0x013e
        L_0x0131:
            r3.copyOnWrite()     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x0180 }
            com.google.android.libraries.assistant.o.u r5 = (com.google.android.libraries.assistant.p1533o.C18503u) r5     // Catch:{ all -> 0x0180 }
            com.google.android.libraries.assistant.o.u r6 = com.google.android.libraries.assistant.p1533o.C18503u.f52450f     // Catch:{ all -> 0x0180 }
            r5.f52453b = r7     // Catch:{ all -> 0x0180 }
            r2.f348398c = r11     // Catch:{ all -> 0x0180 }
        L_0x013e:
            com.google.protobuf.bt r5 = com.google.p395al.p417d.p418a.C8533am.f29593t     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)     // Catch:{ all -> 0x0180 }
            r4.mo58887l(r5)     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bf r6 = r4.f169962ag     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bs r5 = r5.f169971d     // Catch:{ all -> 0x0180 }
            boolean r5 = r6.mo58857o(r5)     // Catch:{ all -> 0x0180 }
            if (r5 == 0) goto L_0x0013
            com.google.protobuf.bt r5 = com.google.p395al.p417d.p418a.C8533am.f29593t     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)     // Catch:{ all -> 0x0180 }
            r4.mo58887l(r5)     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bf r4 = r4.f169962ag     // Catch:{ all -> 0x0180 }
            com.google.protobuf.bs r6 = r5.f169971d     // Catch:{ all -> 0x0180 }
            java.lang.Object r4 = r4.mo58854l(r6)     // Catch:{ all -> 0x0180 }
            if (r4 != 0) goto L_0x0167
            java.lang.Object r4 = r5.f169969b     // Catch:{ all -> 0x0180 }
            goto L_0x016b
        L_0x0167:
            java.lang.Object r4 = r5.mo58889c(r4)     // Catch:{ all -> 0x0180 }
        L_0x016b:
            java.lang.String r5 = "chunk.getExtension(Unstr…SearchData.websearchData)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)     // Catch:{ all -> 0x0180 }
            com.google.al.d.a.am r4 = (com.google.p395al.p417d.p418a.C8533am) r4     // Catch:{ all -> 0x0180 }
            com.google.protobuf.z r4 = r4.f29602h     // Catch:{ all -> 0x0180 }
            r14.mo23991b(r4)     // Catch:{ all -> 0x0180 }
            goto L_0x0013
        L_0x0179:
            r14 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r14)
            h.q r14 = p5462h.C69788q.f186170a
            return r14
        L_0x0180:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x0182 }
        L_0x0182:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r14)
            goto L_0x0188
        L_0x0187:
            throw r1
        L_0x0188:
            goto L_0x0187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c.C126498f.mo5761a(java.lang.Object):java.lang.Object");
    }
}
