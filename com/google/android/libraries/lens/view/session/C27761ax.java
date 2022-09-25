package com.google.android.libraries.lens.view.session;

import android.util.SizeF;
import com.google.android.libraries.lens.common.p1998a.C24093a;
import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.p2014e.C24233y;
import com.google.android.libraries.lens.view.filters.p2100d.C25972a;
import com.google.android.libraries.lens.view.gleam.C26504ci;
import com.google.android.libraries.lens.view.p2069am.C25332h;
import com.google.android.libraries.lens.view.p2069am.C25333i;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.p2177w.C28185a;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.aac;
import com.google.common.p4552o.aar;
import com.google.common.p4552o.aas;
import com.google.common.p4552o.acc;
import com.google.common.p4552o.acf;
import com.google.common.p4552o.acl;
import com.google.common.p4552o.acp;
import com.google.common.p4552o.p4563i.C59864a;
import com.google.common.p4552o.p4563i.C59891b;
import com.google.common.p4552o.p4563i.C59916by;
import com.google.common.p4552o.p4563i.C59917bz;
import com.google.common.p4552o.p4563i.C59919ca;
import com.google.common.p4552o.p4563i.C59920cb;
import com.google.common.p4552o.p4563i.C59944cz;
import com.google.common.p4552o.p4563i.C59947db;
import com.google.common.p4552o.p4563i.C59948dc;
import com.google.common.p4552o.p4563i.C59949dd;
import com.google.common.p4552o.p4563i.C59950de;
import com.google.common.p4552o.p4563i.C59951df;
import com.google.common.p4552o.p4563i.C59952dg;
import com.google.common.p4552o.p4563i.C59961k;
import com.google.common.p4552o.p4563i.C59967q;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62445bv;
import com.google.lens.p4707j.C62580n;
import com.google.p4017at.p4056g.p4057a.p4058a.C54038cs;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56233an;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56240au;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56241av;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56323u;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56324v;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.Collections;
import java.util.Iterator;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.session.ax */
/* compiled from: PG */
public final class C27761ax {

    /* renamed from: b */
    public static final /* synthetic */ int f75765b = 0;

    /* renamed from: a */
    public final String f75766a;

    /* renamed from: c */
    private final C68214a f75767c;

    static {
        C58974d.m91135i("LoggingUtil");
    }

    public C27761ax(C27232l lVar, C68214a aVar) {
        this.f75766a = (String) lVar.mo32701h().mo56111f();
        this.f75767c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01cb  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.p4552o.abf m51626c(com.google.p4017at.p4056g.p4057a.p4058a.C54038cs r21, java.util.List r22, int r23, int r24) {
        /*
            r0 = r21
            r1 = r23
            r2 = r24
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 2
            r6 = 1
            if (r22 == 0) goto L_0x0129
            java.util.Iterator r8 = r22.iterator()
        L_0x0018:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0129
            java.lang.Object r9 = r8.next()
            com.google.bp.f.b.a.y r9 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56327y) r9
            int r10 = r9.f150139b
            r11 = 7
            if (r10 != r11) goto L_0x002e
            java.lang.Object r10 = r9.f150140c
            com.google.lens.j.bv r10 = (com.google.lens.p4707j.C62445bv) r10
            goto L_0x0030
        L_0x002e:
            com.google.lens.j.bv r10 = com.google.lens.p4707j.C62445bv.f168618e
        L_0x0030:
            com.google.lens.j.br r10 = r10.f168621b
            if (r10 != 0) goto L_0x0036
            com.google.lens.j.br r10 = com.google.lens.p4707j.C62441br.f168608h
        L_0x0036:
            com.google.bp.f.b.a.v r9 = r9.f150144g
            if (r9 != 0) goto L_0x003c
            com.google.bp.f.b.a.v r9 = com.google.p4242bp.p4257f.p4260b.p4261a.C56324v.f150122c
        L_0x003c:
            int r9 = r9.f150125b
            com.google.bp.f.b.a.u r9 = com.google.p4242bp.p4257f.p4260b.p4261a.C56323u.m87968a(r9)
            if (r9 != 0) goto L_0x0046
            com.google.bp.f.b.a.u r9 = com.google.p4242bp.p4257f.p4260b.p4261a.C56323u.GLEAM
        L_0x0046:
            com.google.bp.f.b.a.u r11 = com.google.p4242bp.p4257f.p4260b.p4261a.C56323u.GLEAM
            if (r9 != r11) goto L_0x00eb
            int r11 = r10.f168616g
            int r11 = com.google.lens.p4707j.C62580n.m94802a(r11)
            if (r11 != 0) goto L_0x0054
        L_0x0052:
            r11 = 0
            goto L_0x0057
        L_0x0054:
            if (r11 != r5) goto L_0x0052
            r11 = 1
        L_0x0057:
            if (r11 == 0) goto L_0x0063
            float r12 = r10.f168613d
            float r13 = (float) r1
            float r12 = r12 * r13
            int r12 = java.lang.Math.round(r12)
            goto L_0x0069
        L_0x0063:
            float r12 = r10.f168613d
            int r12 = java.lang.Math.round(r12)
        L_0x0069:
            if (r11 == 0) goto L_0x0075
            float r13 = r10.f168614e
            float r14 = (float) r2
            float r13 = r13 * r14
            int r13 = java.lang.Math.round(r13)
            goto L_0x007b
        L_0x0075:
            float r13 = r10.f168614e
            int r13 = java.lang.Math.round(r13)
        L_0x007b:
            if (r11 == 0) goto L_0x0087
            float r14 = r10.f168611b
            float r15 = (float) r1
            float r14 = r14 * r15
            int r14 = java.lang.Math.round(r14)
            goto L_0x008d
        L_0x0087:
            float r14 = r10.f168611b
            int r14 = java.lang.Math.round(r14)
        L_0x008d:
            if (r11 == 0) goto L_0x0099
            float r11 = r10.f168612c
            float r15 = (float) r2
            float r11 = r11 * r15
            int r11 = java.lang.Math.round(r11)
            goto L_0x009f
        L_0x0099:
            float r11 = r10.f168612c
            int r11 = java.lang.Math.round(r11)
        L_0x009f:
            com.google.common.o.zk r15 = com.google.common.p4552o.C60695zk.f164674f
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.common.o.zj r15 = (com.google.common.p4552o.C60694zj) r15
            r15.copyOnWrite()
            com.google.protobuf.bv r7 = r15.instance
            com.google.common.o.zk r7 = (com.google.common.p4552o.C60695zk) r7
            int r5 = r7.f164676a
            r5 = r5 | r6
            r7.f164676a = r5
            r7.f164677b = r12
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.common.o.zk r5 = (com.google.common.p4552o.C60695zk) r5
            int r7 = r5.f164676a
            r12 = 2
            r7 = r7 | r12
            r5.f164676a = r7
            r5.f164678c = r13
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.common.o.zk r5 = (com.google.common.p4552o.C60695zk) r5
            int r7 = r5.f164676a
            r7 = r7 | 4
            r5.f164676a = r7
            r5.f164679d = r14
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.common.o.zk r5 = (com.google.common.p4552o.C60695zk) r5
            int r7 = r5.f164676a
            r7 = r7 | 8
            r5.f164676a = r7
            r5.f164680e = r11
            com.google.protobuf.bv r5 = r15.build()
            com.google.common.o.zk r5 = (com.google.common.p4552o.C60695zk) r5
            r4.add(r5)
        L_0x00eb:
            com.google.common.o.i.bz r5 = com.google.common.p4552o.p4563i.C59917bz.f161945d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.common.o.i.by r5 = (com.google.common.p4552o.p4563i.C59916by) r5
            com.google.common.o.i.b r7 = m51632i(r10)
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.common.o.i.bz r10 = (com.google.common.p4552o.p4563i.C59917bz) r10
            r7.getClass()
            r10.f161948b = r7
            int r7 = r10.f161947a
            r7 = r7 | r6
            r10.f161947a = r7
            int r7 = m51633j(r9)
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            com.google.common.o.i.bz r9 = (com.google.common.p4552o.p4563i.C59917bz) r9
            int r7 = r7 + -1
            r9.f161949c = r7
            int r7 = r9.f161947a
            r10 = 2
            r7 = r7 | r10
            r9.f161947a = r7
            com.google.protobuf.bv r5 = r5.build()
            com.google.common.o.i.bz r5 = (com.google.common.p4552o.p4563i.C59917bz) r5
            r3.add(r5)
            r5 = 2
            goto L_0x0018
        L_0x0129:
            com.google.bp.f.b.a.aw r5 = r0.f141784a
            if (r5 != 0) goto L_0x012f
            com.google.bp.f.b.a.aw r5 = com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw.f149799b
        L_0x012f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.google.protobuf.cq r8 = r5.f149801a
            java.util.Iterator r8 = r8.iterator()
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0141:
            boolean r15 = r8.hasNext()
            if (r15 == 0) goto L_0x01ec
            java.lang.Object r15 = r8.next()
            com.google.bp.f.b.a.ap r15 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap) r15
            com.google.protobuf.cq r9 = r15.f149783b
            int r9 = r9.size()
            int r11 = r11 + r9
            com.google.protobuf.cq r9 = r15.f149783b
            java.util.Iterator r9 = r9.iterator()
        L_0x015a:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L_0x0141
            java.lang.Object r15 = r9.next()
            com.google.bp.f.b.a.an r15 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56233an) r15
            com.google.protobuf.cq r6 = r15.f149778b
            int r6 = r6.size()
            int r14 = r14 + r6
            com.google.protobuf.cq r6 = r15.f149778b
            java.util.Iterator r6 = r6.iterator()
        L_0x0173:
            boolean r15 = r6.hasNext()
            if (r15 == 0) goto L_0x01e9
            java.lang.Object r15 = r6.next()
            com.google.bp.f.b.a.av r15 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56241av) r15
            r17 = r6
            java.lang.String r6 = r15.f149795c
            int r6 = r6.length()
            int r12 = r12 + r6
            com.google.bp.f.b.a.ae r6 = r15.f149797e
            if (r6 != 0) goto L_0x018e
            com.google.bp.f.b.a.ae r6 = com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae.f149753h
        L_0x018e:
            int r6 = r6.f149755a
            r6 = r6 & 8
            if (r6 == 0) goto L_0x01cd
            com.google.bp.f.b.a.ae r6 = r15.f149797e
            if (r6 != 0) goto L_0x01a1
            com.google.bp.f.b.a.ae r18 = com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae.f149753h
            r20 = r18
            r18 = r8
            r8 = r20
            goto L_0x01a4
        L_0x01a1:
            r18 = r8
            r8 = r6
        L_0x01a4:
            float r8 = r8.f149759e
            if (r6 != 0) goto L_0x01aa
            com.google.bp.f.b.a.ae r6 = com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae.f149753h
        L_0x01aa:
            int r6 = r6.f149761g
            int r6 = com.google.p4242bp.p4257f.p4260b.p4261a.C56223ad.m87941a(r6)
            if (r6 != 0) goto L_0x01b5
            r19 = r9
            goto L_0x01bf
        L_0x01b5:
            r19 = r9
            r9 = 1
            if (r6 == r9) goto L_0x01bf
            int r6 = java.lang.Math.round(r8)
            goto L_0x01c6
        L_0x01bf:
            float r6 = (float) r2
            float r8 = r8 * r6
            int r6 = java.lang.Math.round(r8)
        L_0x01c6:
            if (r6 <= r13) goto L_0x01c9
            r13 = r6
        L_0x01c9:
            if (r6 >= r10) goto L_0x01d1
            r10 = r6
            goto L_0x01d1
        L_0x01cd:
            r18 = r8
            r19 = r9
        L_0x01d1:
            int r6 = r15.f149798f
            int r6 = com.google.p4242bp.p4257f.p4260b.p4261a.C56240au.m87951a(r6)
            if (r6 != 0) goto L_0x01da
            goto L_0x01e2
        L_0x01da:
            r8 = 2
            if (r6 != r8) goto L_0x01e2
            com.google.common.o.i.q r6 = com.google.common.p4552o.p4563i.C59967q.f162073a
            r7.add(r6)
        L_0x01e2:
            r6 = r17
            r8 = r18
            r9 = r19
            goto L_0x0173
        L_0x01e9:
            r6 = 1
            goto L_0x015a
        L_0x01ec:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r10 != r6) goto L_0x01f2
            r10 = 0
        L_0x01f2:
            java.lang.String r6 = r0.f141787d
            com.google.protos.bf.a.a.bs r8 = r0.f141788e
            if (r8 != 0) goto L_0x01fa
            com.google.protos.bf.a.a.bs r8 = com.google.protos.p4963bf.p4964a.p4965a.C64597bs.f175135c
        L_0x01fa:
            int r8 = r8.f175137a
            int r9 = com.google.protos.p4963bf.p4964a.p4965a.C64595bq.m96409a(r8)
            if (r9 != 0) goto L_0x0203
            r9 = 1
        L_0x0203:
            com.google.protos.bf.a.a.bs r0 = r0.f141788e
            if (r0 != 0) goto L_0x0209
            com.google.protos.bf.a.a.bs r0 = com.google.protos.p4963bf.p4964a.p4965a.C64597bs.f175135c
        L_0x0209:
            int r0 = r0.f175138b
            int r0 = com.google.protos.p4963bf.p4964a.p4965a.C64577az.m96408a(r0)
            if (r0 != 0) goto L_0x0212
            r0 = 1
        L_0x0212:
            com.google.common.o.abf r8 = com.google.common.p4552o.abf.f158184p
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.common.o.abe r8 = (com.google.common.p4552o.abe) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r15 = r8.instance
            com.google.common.o.abf r15 = (com.google.common.p4552o.abf) r15
            r22 = r7
            com.google.protobuf.cq r7 = r15.f158187b
            boolean r16 = r7.mo58948c()
            if (r16 != 0) goto L_0x0231
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r15.f158187b = r7
        L_0x0231:
            com.google.protobuf.cq r7 = r15.f158187b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r4, (java.util.List) r7)
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.common.o.abf r4 = (com.google.common.p4552o.abf) r4
            com.google.protobuf.cq r7 = r4.f158200o
            boolean r15 = r7.mo58948c()
            if (r15 != 0) goto L_0x024b
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r4.f158200o = r7
        L_0x024b:
            com.google.protobuf.cq r4 = r4.f158200o
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r3, (java.util.List) r4)
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.common.o.abf r3 = (com.google.common.p4552o.abf) r3
            int r4 = r3.f158186a
            r7 = 1
            r4 = r4 | r7
            r3.f158186a = r4
            r3.f158188c = r11
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.common.o.abf r3 = (com.google.common.p4552o.abf) r3
            int r4 = r3.f158186a
            r4 = r4 | 4
            r3.f158186a = r4
            r3.f158190e = r14
            com.google.protobuf.cq r3 = r5.f149801a
            int r3 = r3.size()
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.common.o.abf r4 = (com.google.common.p4552o.abf) r4
            int r5 = r4.f158186a
            r7 = 2
            r5 = r5 | r7
            r4.f158186a = r5
            r4.f158189d = r3
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.common.o.abf r3 = (com.google.common.p4552o.abf) r3
            int r4 = r3.f158186a
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.f158186a = r4
            r3.f158195j = r12
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.common.o.abf r3 = (com.google.common.p4552o.abf) r3
            r6.getClass()
            int r4 = r3.f158186a
            r4 = r4 | 256(0x100, float:3.59E-43)
            r3.f158186a = r4
            r3.f158196k = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.common.o.abf r3 = (com.google.common.p4552o.abf) r3
            int r9 = r9 + -1
            r3.f158197l = r9
            int r4 = r3.f158186a
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r3.f158186a = r4
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.common.o.abf r3 = (com.google.common.p4552o.abf) r3
            int r0 = r0 + -1
            r3.f158198m = r0
            int r0 = r3.f158186a
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r3.f158186a = r0
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.common.o.abf r0 = (com.google.common.p4552o.abf) r0
            int r3 = r0.f158186a
            r3 = r3 | 8
            r0.f158186a = r3
            r0.f158191f = r10
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.common.o.abf r0 = (com.google.common.p4552o.abf) r0
            int r3 = r0.f158186a
            r3 = r3 | 16
            r0.f158186a = r3
            r0.f158192g = r13
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.common.o.abf r0 = (com.google.common.p4552o.abf) r0
            int r3 = r0.f158186a
            r3 = r3 | 32
            r0.f158186a = r3
            r0.f158193h = r1
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.common.o.abf r0 = (com.google.common.p4552o.abf) r0
            int r1 = r0.f158186a
            r1 = r1 | 64
            r0.f158186a = r1
            r0.f158194i = r2
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.common.o.abf r0 = (com.google.common.p4552o.abf) r0
            com.google.protobuf.cq r1 = r0.f158199n
            boolean r2 = r1.mo58948c()
            if (r2 != 0) goto L_0x0317
            com.google.protobuf.cq r1 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r1)
            r0.f158199n = r1
        L_0x0317:
            com.google.protobuf.cq r0 = r0.f158199n
            r1 = r22
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r0)
            com.google.protobuf.bv r0 = r8.build()
            com.google.common.o.abf r0 = (com.google.common.p4552o.abf) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.session.C27761ax.m51626c(com.google.at.g.a.a.cs, java.util.List, int, int):com.google.common.o.abf");
    }

    /* renamed from: d */
    public static C59920cb m51627d(C26504ci ciVar, C58528ij ijVar) {
        C62445bv bvVar;
        C56327y yVar = ciVar.f72216j;
        if (yVar.f150139b == 7) {
            bvVar = (C62445bv) yVar.f150140c;
        } else {
            bvVar = C62445bv.f168618e;
        }
        C62441br brVar = bvVar.f168621b;
        if (brVar == null) {
            brVar = C62441br.f168608h;
        }
        C56324v vVar = ciVar.f72216j.f150144g;
        if (vVar == null) {
            vVar = C56324v.f150122c;
        }
        C56323u a = C56323u.m87968a(vVar.f150125b);
        if (a == null) {
            a = C56323u.GLEAM;
        }
        float a2 = ciVar.mo31757a();
        C59919ca caVar = (C59919ca) C59920cb.f161950d.createBuilder();
        C59916by byVar = (C59916by) C59917bz.f161945d.createBuilder();
        C59891b i = m51632i(brVar);
        byVar.copyOnWrite();
        C59917bz bzVar = (C59917bz) byVar.instance;
        i.getClass();
        bzVar.f161948b = i;
        bzVar.f161947a |= 1;
        int j = m51633j(a);
        byVar.copyOnWrite();
        C59917bz bzVar2 = (C59917bz) byVar.instance;
        bzVar2.f161949c = j - 1;
        bzVar2.f161947a |= 2;
        C59917bz bzVar3 = (C59917bz) byVar.build();
        caVar.copyOnWrite();
        C59920cb cbVar = (C59920cb) caVar.instance;
        bzVar3.getClass();
        cbVar.f161953b = bzVar3;
        cbVar.f161952a |= 1;
        long count = Collection.EL.stream(ijVar).filter(new C27751an(a2)).count();
        caVar.copyOnWrite();
        C59920cb cbVar2 = (C59920cb) caVar.instance;
        cbVar2.f161952a |= 2;
        cbVar2.f161954c = (int) count;
        return (C59920cb) caVar.build();
    }

    /* renamed from: e */
    public static C59952dg m51628e(C54038cs csVar, int i, int i2) {
        C54038cs csVar2 = csVar;
        SizeF sizeF = new SizeF((float) i, (float) i2);
        C25332h hVar = (C25332h) C25333i.f68945c.createBuilder();
        float width = sizeF.getWidth();
        hVar.copyOnWrite();
        ((C25333i) hVar.instance).f68947a = (int) width;
        float height = sizeF.getHeight();
        hVar.copyOnWrite();
        ((C25333i) hVar.instance).f68948b = (int) height;
        C25333i iVar = (C25333i) hVar.build();
        C56226ag agVar = csVar2.f141785b;
        if (agVar == null) {
            agVar = C56226ag.f149762e;
        }
        C62971cq cqVar = agVar.f149765b;
        C56242aw awVar = csVar2.f141784a;
        if (awVar == null) {
            awVar = C56242aw.f149799b;
        }
        C58528ij ijVar = (C58528ij) Collection.EL.stream(awVar.f149801a).flatMap(C27756as.f75759a).flatMap(C27757at.f75760a).filter(new C27758au(cqVar, iVar)).map(C27755ar.f75758a).collect(C58370cn.f155947b);
        C59944cz czVar = (C59944cz) C59952dg.f162032e.createBuilder();
        C56242aw awVar2 = csVar2.f141784a;
        if (awVar2 == null) {
            awVar2 = C56242aw.f149799b;
        }
        Iterator it = awVar2.f149801a.iterator();
        while (true) {
            int i3 = 2;
            if (!it.hasNext()) {
                break;
            }
            C56235ap apVar = (C56235ap) it.next();
            C59950de deVar = (C59950de) C59951df.f162026e.createBuilder();
            for (C56233an anVar : apVar.f149783b) {
                C58485gu guVar = (C58485gu) Collection.EL.stream(anVar.f149778b).filter(new C27754aq(ijVar)).collect(C58370cn.f155946a);
                C59948dc dcVar = (C59948dc) C59949dd.f162019f.createBuilder();
                int size = guVar.size();
                int i4 = 0;
                while (i4 < size) {
                    int a = C56240au.m87951a(((C56241av) guVar.get(i4)).f149798f);
                    if (a != 0 && a == i3) {
                        C59967q qVar = C59967q.f162073a;
                        dcVar.copyOnWrite();
                        C59949dd ddVar = (C59949dd) dcVar.instance;
                        qVar.getClass();
                        C62971cq cqVar2 = ddVar.f162025e;
                        if (!cqVar2.mo58948c()) {
                            ddVar.f162025e = C62942bv.mutableCopy(cqVar2);
                        }
                        ddVar.f162025e.add(qVar);
                    }
                    i4++;
                    i3 = 2;
                }
                int size2 = guVar.size();
                dcVar.copyOnWrite();
                C59949dd ddVar2 = (C59949dd) dcVar.instance;
                ddVar2.f162021a |= 2;
                ddVar2.f162023c = size2;
                if (size2 > 0 && size2 == anVar.f149778b.size()) {
                    dcVar.copyOnWrite();
                    C59949dd ddVar3 = (C59949dd) dcVar.instance;
                    ddVar3.f162021a |= 4;
                    ddVar3.f162024d = true;
                }
                if (((C59949dd) dcVar.instance).f162023c > 0) {
                    C59947db b = C24093a.m44746b(C28185a.m52692j((C58485gu) Collection.EL.stream(guVar).map(C27755ar.f75758a).collect(C58370cn.f155946a), sizeF), sizeF);
                    dcVar.copyOnWrite();
                    C59949dd ddVar4 = (C59949dd) dcVar.instance;
                    b.getClass();
                    ddVar4.f162022b = b;
                    ddVar4.f162021a |= 1;
                }
                C59949dd ddVar5 = (C59949dd) dcVar.build();
                if (ddVar5.f162023c > 0) {
                    deVar.copyOnWrite();
                    C59951df dfVar = (C59951df) deVar.instance;
                    ddVar5.getClass();
                    C62971cq cqVar3 = dfVar.f162030c;
                    if (!cqVar3.mo58948c()) {
                        dfVar.f162030c = C62942bv.mutableCopy(cqVar3);
                    }
                    dfVar.f162030c.add(ddVar5);
                }
                i3 = 2;
            }
            if (((C59951df) deVar.instance).f162030c.size() > 0 && ((C59951df) deVar.instance).f162030c.size() == apVar.f149783b.size() && Collection.EL.stream(Collections.unmodifiableList(((C59951df) deVar.instance).f162030c)).allMatch(C27750am.f75752a)) {
                deVar.copyOnWrite();
                C59951df dfVar2 = (C59951df) deVar.instance;
                dfVar2.f162028a |= 2;
                dfVar2.f162031d = true;
            }
            if (((C59951df) deVar.instance).f162030c.size() > 0) {
                C59947db b2 = C24093a.m44746b(C28185a.m52692j((C58485gu) Collection.EL.stream(Collections.unmodifiableList(((C59951df) deVar.instance).f162030c)).map(new C27752ao(sizeF)).collect(C58370cn.f155946a), sizeF), sizeF);
                deVar.copyOnWrite();
                C59951df dfVar3 = (C59951df) deVar.instance;
                b2.getClass();
                dfVar3.f162029b = b2;
                dfVar3.f162028a |= 1;
            }
            C59951df dfVar4 = (C59951df) deVar.build();
            if (dfVar4.f162030c.size() > 0) {
                czVar.copyOnWrite();
                C59952dg dgVar = (C59952dg) czVar.instance;
                dfVar4.getClass();
                C62971cq cqVar4 = dgVar.f162036c;
                if (!cqVar4.mo58948c()) {
                    dgVar.f162036c = C62942bv.mutableCopy(cqVar4);
                }
                dgVar.f162036c.add(dfVar4);
            }
        }
        if (((C59952dg) czVar.instance).f162036c.size() > 0 && ((C59952dg) czVar.instance).f162036c.size() == awVar2.f149801a.size() && Collection.EL.stream(Collections.unmodifiableList(((C59952dg) czVar.instance).f162036c)).allMatch(C27759av.f75763a)) {
            czVar.copyOnWrite();
            C59952dg dgVar2 = (C59952dg) czVar.instance;
            dgVar2.f162034a |= 2;
            dgVar2.f162037d = true;
        }
        if (((C59952dg) czVar.instance).f162036c.size() > 0) {
            C59947db b3 = C24093a.m44746b(C28185a.m52692j((C58485gu) Collection.EL.stream(Collections.unmodifiableList(((C59952dg) czVar.instance).f162036c)).map(new C27760aw(sizeF)).collect(C58370cn.f155946a), sizeF), sizeF);
            czVar.copyOnWrite();
            C59952dg dgVar3 = (C59952dg) czVar.instance;
            b3.getClass();
            dgVar3.f162035b = b3;
            dgVar3.f162034a |= 1;
        }
        return (C59952dg) czVar.build();
    }

    /* renamed from: f */
    public static final acp m51629f(C24226r rVar, C24233y yVar) {
        acl acl = (acl) acp.f158315e.createBuilder();
        int n = yVar.mo29771n();
        acl.copyOnWrite();
        acp acp = (acp) acl.instance;
        int i = n - 1;
        if (n != 0) {
            acp.f158318b = i;
            int i2 = 1;
            acp.f158317a |= 1;
            if (rVar == C24226r.GALLERY) {
                i2 = 2;
            } else if (rVar == C24226r.SAMPLE_IMAGES) {
                i2 = 4;
            } else if (rVar.mo29791a()) {
                i2 = 3;
            }
            acl.copyOnWrite();
            acp acp2 = (acp) acl.instance;
            acp2.f158320d = i2 - 1;
            acp2.f158317a |= 4;
            int m = yVar.mo29770m();
            acl.copyOnWrite();
            acp acp3 = (acp) acl.instance;
            int i3 = m - 1;
            if (m != 0) {
                acp3.f158319c = i3;
                acp3.f158317a |= 2;
                return (acp) acl.build();
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: g */
    public static int m51630g(int i, C27777bm bmVar) {
        return (!bmVar.mo33257d() || i == 9) ? 2 : 3;
    }

    /* renamed from: h */
    public static int m51631h(C24226r rVar, C27777bm bmVar, boolean z) {
        int i;
        C24231w c = bmVar.mo33256c();
        if (c == C24231w.MULTIMODAL) {
            return 19;
        }
        int i2 = 11;
        if (z && c == C24231w.POSTCAPTURE_INJECTED_IMAGE) {
            int k = bmVar.mo33263k();
            if (k == 0) {
                throw null;
            } else if (k == 5) {
                return 11;
            }
        }
        if (c == C24231w.MULTIMODAL_SELECTION_CLEAR) {
            return 21;
        }
        if (c == C24231w.MATH_EDITOR) {
            return 20;
        }
        int i3 = 3;
        int i4 = 16;
        int i5 = 9;
        if (bmVar.mo33259f().isEmpty()) {
            if (bmVar.mo33260h() == 1) {
                i = 7;
                if (!(c == C24231w.TEXT || c == C24231w.TRANSLATED_TEXT)) {
                    i = 2;
                }
            } else {
                i = bmVar.mo33260h() == 2 ? c == C24231w.TRANSLATED_TEXT ? 22 : bmVar.mo33257d() ? 4 : 6 : 1;
            }
            i3 = (c == C24231w.RETICLE_SELECTION && bmVar.mo33260h() == 3) ? 17 : i;
        } else {
            C56323u uVar = C56323u.DEFAULT;
            int ordinal = c.ordinal();
            if (ordinal == 4) {
                i3 = 16;
            } else if (ordinal == 9) {
                i3 = 10;
            }
        }
        int k2 = bmVar.mo33263k();
        if (k2 != 0) {
            if (!(k2 == 5 && c == C24231w.FILTER_SHUTTER)) {
                int k3 = bmVar.mo33263k();
                if (k3 != 0) {
                    if (k3 != 5) {
                        i4 = i3;
                    } else if (i3 != 16) {
                        i5 = 8;
                    }
                    if (c != C24231w.FILTER_SHUTTER) {
                        i5 = c == C24231w.FILTER_SWITCH ? 18 : i4;
                    }
                } else {
                    throw null;
                }
            }
            if (!(i5 == 1 && (rVar == C24226r.GALLERY || rVar == C24226r.SAMPLE_IMAGES || rVar.mo29791a() || c == C24231w.POSTCAPTURE_INJECTED_IMAGE || c == C24231w.BACKGROUND_RETRY))) {
                i2 = c == C24231w.SCREEN ? 2 : i5;
            }
            if (c == C24231w.OBJECT) {
                i2 = 23;
            }
            if (c != C24231w.FILTER_SWITCH_SELECTION_RETENTION) {
                return i2;
            }
            if (bmVar.mo33260h() == 4) {
                return 24;
            }
            if (bmVar.mo33260h() == 2) {
                return 25;
            }
            return i2;
        }
        throw null;
    }

    /* renamed from: i */
    private static C59891b m51632i(C62441br brVar) {
        C59864a aVar = (C59864a) C59891b.f161844g.createBuilder();
        float f = brVar.f168611b;
        aVar.copyOnWrite();
        C59891b bVar = (C59891b) aVar.instance;
        int i = 1;
        bVar.f161846a |= 1;
        bVar.f161847b = f;
        float f2 = brVar.f168612c;
        aVar.copyOnWrite();
        C59891b bVar2 = (C59891b) aVar.instance;
        bVar2.f161846a |= 2;
        bVar2.f161848c = f2;
        int a = C62580n.m94802a(brVar.f168616g);
        if (a != 0) {
            i = a;
        }
        aVar.copyOnWrite();
        C59891b bVar3 = (C59891b) aVar.instance;
        bVar3.f161851f = i - 1;
        bVar3.f161846a |= 32;
        float f3 = brVar.f168613d;
        aVar.copyOnWrite();
        C59891b bVar4 = (C59891b) aVar.instance;
        bVar4.f161846a |= 4;
        bVar4.f161849d = f3;
        float f4 = brVar.f168614e;
        aVar.copyOnWrite();
        C59891b bVar5 = (C59891b) aVar.instance;
        bVar5.f161846a |= 8;
        bVar5.f161850e = f4;
        return (C59891b) aVar.build();
    }

    /* renamed from: j */
    private static int m51633j(C56323u uVar) {
        C56323u uVar2 = C56323u.DEFAULT;
        C24231w wVar = C24231w.UNKNOWN;
        switch (uVar.ordinal()) {
            case 1:
                return 4;
            case 2:
                return 16;
            case 3:
                return 7;
            case 4:
                return 15;
            case 5:
                return 3;
            case 6:
                return 9;
            case 7:
                return 11;
            case 8:
                return 12;
            case 9:
                return 13;
            case 10:
                return 14;
            default:
                return 1;
        }
    }

    /* renamed from: a */
    public final C60555uf mo33230a(aac aac) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1502;
        aar b = mo33231b();
        b.copyOnWrite();
        aas aas = (aas) b.instance;
        aas aas2 = aas.f158145p;
        aac.getClass();
        aas.f158156j = aac;
        aas.f158147a |= 32768;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        aas aas3 = (aas) b.build();
        aas3.getClass();
        ufVar2.f164197by = aas3;
        ufVar2.f164253h |= 8;
        return (C60555uf) tzVar.build();
    }

    /* renamed from: b */
    public final aar mo33231b() {
        aar aar = (aar) aas.f158145p.createBuilder();
        C59961k a = ((C25972a) this.f75767c.mo27525b()).mo31166a();
        aar.copyOnWrite();
        aas aas = (aas) aar.instance;
        a.getClass();
        aas.f158155i = a;
        aas.f158147a |= 16384;
        if (this.f75766a != null) {
            acc acc = (acc) acf.f158284h.createBuilder();
            String str = this.f75766a;
            str.getClass();
            acc.copyOnWrite();
            acf acf = (acf) acc.instance;
            acf.f158286a |= 1;
            acf.f158287b = str;
            acf acf2 = (acf) acc.build();
            aar.copyOnWrite();
            aas aas2 = (aas) aar.instance;
            acf2.getClass();
            aas2.f158151e = acf2;
            aas2.f158147a |= 256;
        }
        return aar;
    }
}
