package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.android.libraries.assistant.contexttrigger.C17658d;
import com.google.android.libraries.assistant.contexttrigger.p1466j.C17804t;
import com.google.android.libraries.assistant.contexttrigger.p1466j.C17805u;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48911m;
import com.google.assistant.p3803ag.p3807b.p3808a.C48912n;
import com.google.assistant.p3803ag.p3807b.p3808a.C48913o;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3809c.C49010dc;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62953e;
import java.util.HashMap;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalTime;
import p3186j$.time.ZoneId;
import p3186j$.time.ZonedDateTime;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.h */
/* compiled from: PG */
public final class C17716h {

    /* renamed from: a */
    static final C62910ar f50915a = C62948a.m95456g(30);

    /* renamed from: e */
    public static final /* synthetic */ int f50916e = 0;

    /* renamed from: f */
    private static final C59071e f50917f = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.f.h");

    /* renamed from: b */
    public final C48917s f50918b;

    /* renamed from: c */
    public int f50919c = 0;

    /* renamed from: d */
    public Map f50920d;

    /* renamed from: g */
    private final String f50921g;

    /* renamed from: h */
    private final C60950i f50922h;

    /* renamed from: i */
    private final C17658d f50923i;

    public C17716h(C60950i iVar, C48917s sVar, C17658d dVar) {
        this.f50922h = iVar;
        this.f50918b = sVar;
        C48919u uVar = sVar.f126581b;
        this.f50921g = C17709ao.m34990a(uVar == null ? C48919u.f126586g : uVar);
        this.f50920d = new HashMap();
        this.f50923i = dVar;
    }

    /* renamed from: c */
    private final int m34994c() {
        int i = this.f50919c;
        this.f50919c = i + 1;
        return i;
    }

    /* renamed from: d */
    private static C63042fg m34995d(C49010dc dcVar) {
        ZoneId systemDefault = ZoneId.systemDefault();
        C52393qb qbVar = dcVar.f126771a;
        if (qbVar == null) {
            qbVar = C52393qb.f137479e;
        }
        int i = qbVar.f137482b;
        C52393qb qbVar2 = dcVar.f126771a;
        int i2 = (qbVar2 == null ? C52393qb.f137479e : qbVar2).f137483c;
        if (qbVar2 == null) {
            qbVar2 = C52393qb.f137479e;
        }
        LocalDate of = LocalDate.m71157of(i, i2, qbVar2.f137484d);
        C52403ql qlVar = dcVar.f126772b;
        if (qlVar == null) {
            qlVar = C52403ql.f137512f;
        }
        int i3 = qlVar.f137515b;
        C52403ql qlVar2 = dcVar.f126772b;
        int i4 = (qlVar2 == null ? C52403ql.f137512f : qlVar2).f137516c;
        if (qlVar2 == null) {
            qlVar2 = C52403ql.f137512f;
        }
        return C62953e.m95484i(ZonedDateTime.m71296of(of, LocalTime.m71212of(i3, i4, qlVar2.f137517d), systemDefault).toInstant().toEpochMilli());
    }

    /* renamed from: e */
    private static String m34996e(String str, int i) {
        return str + ":" + i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Optional mo23446a() {
        C48913o oVar = this.f50918b.f126584e;
        if (oVar == null) {
            oVar = C48913o.f126569d;
        }
        C48912n nVar = oVar.f126573c;
        if (nVar == null) {
            nVar = C48912n.f126565c;
        }
        C17804t tVar = (C17804t) C17805u.f51097g.createBuilder();
        tVar.copyOnWrite();
        C17805u uVar = (C17805u) tVar.instance;
        uVar.f51104f = 2;
        uVar.f51099a |= 16;
        String str = this.f50921g;
        tVar.copyOnWrite();
        C17805u uVar2 = (C17805u) tVar.instance;
        str.getClass();
        uVar2.f51100b = 2;
        uVar2.f51101c = str;
        int i = nVar.f126567a;
        int a = C48911m.m85305a(i);
        int i2 = a - 1;
        if (a != 0) {
            long j = 0;
            if (i2 == 0) {
                if (i == 1) {
                    j = ((Long) nVar.f126568b).longValue();
                }
                C63042fg i3 = C62953e.m95484i(j);
                tVar.copyOnWrite();
                C17805u uVar3 = (C17805u) tVar.instance;
                i3.getClass();
                uVar3.f51103e = i3;
                uVar3.f51102d = 4;
                String str2 = this.f50921g;
                tVar.copyOnWrite();
                C17805u uVar4 = (C17805u) tVar.instance;
                str2.getClass();
                uVar4.f51100b = 2;
                uVar4.f51101c = str2;
                return Optional.m71637of((C17805u) tVar.build());
            } else if (i2 != 1) {
                if (i2 == 2) {
                    C59052c cVar = (C59052c) ((C59052c) f50917f.mo56226d()).mo56372aa(47012);
                    C48919u uVar5 = this.f50918b.f126581b;
                    if (uVar5 == null) {
                        uVar5 = C48919u.f126586g;
                    }
                    String str3 = uVar5.f126591d;
                    C48919u uVar6 = this.f50918b.f126581b;
                    if (uVar6 == null) {
                        uVar6 = C48919u.f126586g;
                    }
                    C48900b a2 = C48900b.m85301a(uVar6.f126589b);
                    if (a2 == null) {
                        a2 = C48900b.UNSPECIFIED;
                    }
                    cVar.mo56354G("No expiration policy for request: %s from client: %s", str3, a2.name());
                }
                return Optional.empty();
            } else {
                Instant a3 = this.f50922h.mo57444a();
                if (nVar.f126567a == 2) {
                    j = ((Long) nVar.f126568b).longValue();
                }
                C63042fg i4 = C62953e.m95484i(a3.plusMillis(j).toEpochMilli());
                tVar.copyOnWrite();
                C17805u uVar7 = (C17805u) tVar.instance;
                i4.getClass();
                uVar7.f51103e = i4;
                uVar7.f51102d = 4;
                String str4 = this.f50921g;
                tVar.copyOnWrite();
                C17805u uVar8 = (C17805u) tVar.instance;
                str4.getClass();
                uVar8.f51100b = 2;
                uVar8.f51101c = str4;
                return Optional.m71637of((C17805u) tVar.build());
            }
        } else {
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v59, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r2v71, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23447b(com.google.assistant.p3803ag.p3809c.C48952az r14, com.google.assistant.p3803ag.p3807b.p3808a.C48893ah r15) {
        /*
            r13 = this;
            int r0 = r14.f126659a
            int r1 = com.google.assistant.p3803ag.p3809c.C48949aw.m85320b(r0)
            int r2 = r1 + -1
            r3 = 0
            if (r1 == 0) goto L_0x0519
            r1 = 0
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0269
            if (r2 == r7) goto L_0x0028
            if (r2 == r6) goto L_0x0028
            if (r2 == r4) goto L_0x0020
            java.lang.Exception r14 = new java.lang.Exception
            java.lang.String r15 = "Must have a leaf or composite condition."
            r14.<init>(r15)
            throw r14
        L_0x0020:
            java.lang.Exception r14 = new java.lang.Exception
            java.lang.String r15 = "NOT is not supported."
            r14.<init>(r15)
            throw r14
        L_0x0028:
            if (r0 != r6) goto L_0x002f
            java.lang.Object r0 = r14.f126660b
            com.google.assistant.ag.c.ay r0 = (com.google.assistant.p3803ag.p3809c.C48951ay) r0
            goto L_0x0031
        L_0x002f:
            com.google.assistant.ag.c.ay r0 = com.google.assistant.p3803ag.p3809c.C48951ay.f126654b
        L_0x0031:
            com.google.protobuf.cq r0 = r0.f126656a
            int r0 = r0.size()
            if (r0 > r7) goto L_0x004f
            int r0 = r14.f126659a
            if (r0 != r4) goto L_0x0042
            java.lang.Object r0 = r14.f126660b
            com.google.assistant.ag.c.ay r0 = (com.google.assistant.p3803ag.p3809c.C48951ay) r0
            goto L_0x0044
        L_0x0042:
            com.google.assistant.ag.c.ay r0 = com.google.assistant.p3803ag.p3809c.C48951ay.f126654b
        L_0x0044:
            com.google.protobuf.cq r0 = r0.f126656a
            int r0 = r0.size()
            if (r0 <= r7) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r0 = 0
            goto L_0x0050
        L_0x004f:
            r0 = 1
        L_0x0050:
            java.lang.String r2 = "Should be AND or OR"
            com.google.common.base.C58838bb.m90869d(r0, r2)
            int r0 = r14.f126659a
            if (r0 != r6) goto L_0x005b
            r2 = 1
            goto L_0x005c
        L_0x005b:
            r2 = 0
        L_0x005c:
            if (r2 == 0) goto L_0x0065
            java.lang.Object r0 = r14.f126660b
            com.google.assistant.ag.c.ay r0 = (com.google.assistant.p3803ag.p3809c.C48951ay) r0
            com.google.protobuf.cq r0 = r0.f126656a
            goto L_0x0070
        L_0x0065:
            if (r0 != r4) goto L_0x006c
            java.lang.Object r0 = r14.f126660b
            com.google.assistant.ag.c.ay r0 = (com.google.assistant.p3803ag.p3809c.C48951ay) r0
            goto L_0x006e
        L_0x006c:
            com.google.assistant.ag.c.ay r0 = com.google.assistant.p3803ag.p3809c.C48951ay.f126654b
        L_0x006e:
            com.google.protobuf.cq r0 = r0.f126656a
        L_0x0070:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r8 = r13.m34994c()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0082:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x00c3
            java.lang.Object r10 = r0.next()
            com.google.assistant.ag.c.az r10 = (com.google.assistant.p3803ag.p3809c.C48952az) r10
            com.google.assistant.ag.b.a.al r11 = com.google.assistant.p3803ag.p3807b.p3808a.C48897al.f126526e
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.ag.b.a.ah r11 = (com.google.assistant.p3803ag.p3807b.p3808a.C48893ah) r11
            r13.mo23447b(r10, r11)
            com.google.protobuf.bv r10 = r11.instance
            com.google.assistant.ag.b.a.al r10 = (com.google.assistant.p3803ag.p3807b.p3808a.C48897al) r10
            int r12 = r10.f126529b
            if (r12 != r5) goto L_0x00bf
            java.util.Map r12 = r13.f50920d
            java.lang.Object r10 = r10.f126530c
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r12.get(r10)
            com.google.assistant.ag.b.a.ac r10 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r10
            r10.getClass()
            int r10 = r10.f126515g
            int r10 = com.google.assistant.p3803ag.p3807b.p3808a.C48887ab.m85291b(r10)
            if (r10 != 0) goto L_0x00b9
            goto L_0x00bf
        L_0x00b9:
            if (r10 != r6) goto L_0x00bf
            r9.add(r11)
            goto L_0x0082
        L_0x00bf:
            r3.add(r11)
            goto L_0x0082
        L_0x00c3:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x013e
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r9)
            com.google.android.libraries.assistant.contexttrigger.f.e r1 = new com.google.android.libraries.assistant.contexttrigger.f.e
            r1.<init>(r13)
            r0.forEach(r1)
            java.lang.String r0 = r13.f50921g
            java.lang.String r0 = m34996e(r0, r8)
            com.google.assistant.ag.b.a.ac r1 = com.google.assistant.p3803ag.p3807b.p3808a.C48888ac.f126507h
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.ag.b.a.z r1 = (com.google.assistant.p3803ag.p3807b.p3808a.C48924z) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.ag.b.a.ac r2 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r2
            r14.getClass()
            r2.f126512d = r14
            int r3 = r2.f126509a
            r3 = r3 | r5
            r2.f126509a = r3
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.ag.b.a.ac r2 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r2
            int r3 = r2.f126509a
            r3 = r3 | r7
            r2.f126509a = r3
            r2.f126510b = r0
            java.lang.String r2 = r13.f50921g
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.ag.b.a.ac r3 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r3
            r2.getClass()
            int r4 = r3.f126509a
            r4 = r4 | r6
            r3.f126509a = r4
            r3.f126511c = r2
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.ag.b.a.ac r2 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r2
            r2.f126515g = r7
            int r3 = r2.f126509a
            r3 = r3 | 32
            r2.f126509a = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.ag.b.a.ac r1 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r1
            java.util.Map r2 = r13.f50920d
            r2.put(r0, r1)
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            com.google.assistant.ag.b.a.al r1 = (com.google.assistant.p3803ag.p3807b.p3808a.C48897al) r1
            com.google.assistant.ag.b.a.al r2 = com.google.assistant.p3803ag.p3807b.p3808a.C48897al.f126526e
            r1.f126529b = r5
            r1.f126530c = r0
            goto L_0x0504
        L_0x013e:
            com.google.assistant.ag.b.a.ak r0 = com.google.assistant.p3803ag.p3807b.p3808a.C48896ak.f126523b
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.ag.b.a.aj r0 = (com.google.assistant.p3803ag.p3807b.p3808a.C48895aj) r0
            int r8 = r9.size()
            if (r8 <= r7) goto L_0x021c
            com.google.assistant.ag.c.ay r1 = com.google.assistant.p3803ag.p3809c.C48951ay.f126654b
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.ag.c.ax r1 = (com.google.assistant.p3803ag.p3809c.C48950ax) r1
            j$.util.stream.Stream r8 = p3186j$.util.Collection.EL.stream(r9)
            com.google.android.libraries.assistant.contexttrigger.f.f r9 = new com.google.android.libraries.assistant.contexttrigger.f.f
            r9.<init>(r13, r1)
            r8.forEach(r9)
            java.lang.String r8 = r13.f50921g
            int r9 = r13.m34994c()
            java.lang.String r8 = m34996e(r8, r9)
            com.google.assistant.ag.b.a.ac r9 = com.google.assistant.p3803ag.p3807b.p3808a.C48888ac.f126507h
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.ag.b.a.z r9 = (com.google.assistant.p3803ag.p3807b.p3808a.C48924z) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.ag.b.a.ac r10 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r10
            int r11 = r10.f126509a
            r11 = r11 | r7
            r10.f126509a = r11
            r10.f126510b = r8
            java.lang.String r10 = r13.f50921g
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.assistant.ag.b.a.ac r11 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r11
            r10.getClass()
            int r12 = r11.f126509a
            r12 = r12 | r6
            r11.f126509a = r12
            r11.f126511c = r10
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.ag.b.a.ac r10 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r10
            r10.f126515g = r7
            int r11 = r10.f126509a
            r11 = r11 | 32
            r10.f126509a = r11
            if (r2 == 0) goto L_0x01c7
            com.google.assistant.ag.c.az r4 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.ag.c.av r4 = (com.google.assistant.p3803ag.p3809c.C48948av) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.assistant.ag.c.az r10 = (com.google.assistant.p3803ag.p3809c.C48952az) r10
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.ag.c.ay r1 = (com.google.assistant.p3803ag.p3809c.C48951ay) r1
            r1.getClass()
            r10.f126660b = r1
            r10.f126659a = r6
            com.google.protobuf.bv r1 = r4.build()
            com.google.assistant.ag.c.az r1 = (com.google.assistant.p3803ag.p3809c.C48952az) r1
            goto L_0x01e9
        L_0x01c7:
            com.google.assistant.ag.c.az r10 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.ag.c.av r10 = (com.google.assistant.p3803ag.p3809c.C48948av) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.assistant.ag.c.az r11 = (com.google.assistant.p3803ag.p3809c.C48952az) r11
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.ag.c.ay r1 = (com.google.assistant.p3803ag.p3809c.C48951ay) r1
            r1.getClass()
            r11.f126660b = r1
            r11.f126659a = r4
            com.google.protobuf.bv r1 = r10.build()
            com.google.assistant.ag.c.az r1 = (com.google.assistant.p3803ag.p3809c.C48952az) r1
        L_0x01e9:
            java.util.Map r4 = r13.f50920d
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.ag.b.a.ac r10 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r10
            r1.getClass()
            r10.f126512d = r1
            int r1 = r10.f126509a
            r1 = r1 | r5
            r10.f126509a = r1
            com.google.protobuf.bv r1 = r9.build()
            com.google.assistant.ag.b.a.ac r1 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r1
            r4.put(r8, r1)
            com.google.assistant.ag.b.a.al r1 = com.google.assistant.p3803ag.p3807b.p3808a.C48897al.f126526e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.ag.b.a.ah r1 = (com.google.assistant.p3803ag.p3807b.p3808a.C48893ah) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.assistant.ag.b.a.al r4 = (com.google.assistant.p3803ag.p3807b.p3808a.C48897al) r4
            r4.f126529b = r5
            r4.f126530c = r8
            r0.mo53192a(r1)
            goto L_0x022b
        L_0x021c:
            int r4 = r9.size()
            if (r4 != r7) goto L_0x022b
            java.lang.Object r1 = r9.get(r1)
            com.google.assistant.ag.b.a.ah r1 = (com.google.assistant.p3803ag.p3807b.p3808a.C48893ah) r1
            r0.mo53192a(r1)
        L_0x022b:
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.libraries.assistant.contexttrigger.f.g r3 = new com.google.android.libraries.assistant.contexttrigger.f.g
            r3.<init>(r0)
            r1.forEach(r3)
            if (r2 == 0) goto L_0x0251
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.ag.b.a.ak r0 = (com.google.assistant.p3803ag.p3807b.p3808a.C48896ak) r0
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            com.google.assistant.ag.b.a.al r1 = (com.google.assistant.p3803ag.p3807b.p3808a.C48897al) r1
            com.google.assistant.ag.b.a.al r2 = com.google.assistant.p3803ag.p3807b.p3808a.C48897al.f126526e
            r0.getClass()
            r1.f126530c = r0
            r1.f126529b = r7
            goto L_0x0504
        L_0x0251:
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.ag.b.a.ak r0 = (com.google.assistant.p3803ag.p3807b.p3808a.C48896ak) r0
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            com.google.assistant.ag.b.a.al r1 = (com.google.assistant.p3803ag.p3807b.p3808a.C48897al) r1
            com.google.assistant.ag.b.a.al r2 = com.google.assistant.p3803ag.p3807b.p3808a.C48897al.f126526e
            r0.getClass()
            r1.f126530c = r0
            r1.f126529b = r6
            goto L_0x0504
        L_0x0269:
            if (r0 != r7) goto L_0x026c
            r1 = 1
        L_0x026c:
            java.lang.String r0 = "Should be a leaf condition."
            com.google.common.base.C58838bb.m90869d(r1, r0)
            java.lang.String r0 = r13.f50921g
            int r1 = r13.m34994c()
            java.lang.String r0 = m34996e(r0, r1)
            com.google.assistant.ag.b.a.ac r1 = com.google.assistant.p3803ag.p3807b.p3808a.C48888ac.f126507h
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.ag.b.a.z r1 = (com.google.assistant.p3803ag.p3807b.p3808a.C48924z) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.ag.b.a.ac r2 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r2
            r14.getClass()
            r2.f126512d = r14
            int r8 = r2.f126509a
            r8 = r8 | r5
            r2.f126509a = r8
            java.lang.String r2 = r13.f50921g
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.assistant.ag.b.a.ac r8 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r8
            r2.getClass()
            int r9 = r8.f126509a
            r9 = r9 | r6
            r8.f126509a = r9
            r8.f126511c = r2
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.ag.b.a.ac r2 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r2
            int r8 = r2.f126509a
            r8 = r8 | r7
            r2.f126509a = r8
            r2.f126510b = r0
            int r2 = r14.f126659a
            if (r2 != r7) goto L_0x02be
            java.lang.Object r2 = r14.f126660b
            com.google.assistant.ag.c.br r2 = (com.google.assistant.p3803ag.p3809c.C48971br) r2
            goto L_0x02c0
        L_0x02be:
            com.google.assistant.ag.c.br r2 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x02c0:
            int r2 = r2.f126691a
            int r2 = com.google.assistant.p3803ag.p3809c.C48966bm.m85328a(r2)
            int r8 = r2 + -1
            if (r2 == 0) goto L_0x0518
            if (r8 == 0) goto L_0x0427
            if (r8 == r7) goto L_0x02fc
            if (r8 == r6) goto L_0x0400
            r2 = 10
            if (r8 == r2) goto L_0x02eb
            r2 = 12
            if (r8 == r2) goto L_0x02da
            goto L_0x0417
        L_0x02da:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.ag.b.a.ac r2 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r2
            r2.f126515g = r5
            int r3 = r2.f126509a
            r3 = r3 | 32
            r2.f126509a = r3
            goto L_0x0436
        L_0x02eb:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.ag.b.a.ac r2 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r2
            r2.f126515g = r4
            int r3 = r2.f126509a
            r3 = r3 | 32
            r2.f126509a = r3
            goto L_0x0436
        L_0x02fc:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.ag.b.a.ac r2 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r2
            r2.f126515g = r6
            int r8 = r2.f126509a
            r8 = r8 | 32
            r2.f126509a = r8
            int r2 = r14.f126659a
            if (r2 != r7) goto L_0x0314
            java.lang.Object r2 = r14.f126660b
            com.google.assistant.ag.c.br r2 = (com.google.assistant.p3803ag.p3809c.C48971br) r2
            goto L_0x0316
        L_0x0314:
            com.google.assistant.ag.c.br r2 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x0316:
            int r8 = r2.f126691a
            if (r8 != r6) goto L_0x031f
            java.lang.Object r2 = r2.f126692b
            com.google.assistant.ag.c.dj r2 = (com.google.assistant.p3803ag.p3809c.C49017dj) r2
            goto L_0x0321
        L_0x031f:
            com.google.assistant.ag.c.dj r2 = com.google.assistant.p3803ag.p3809c.C49017dj.f126788c
        L_0x0321:
            int r8 = r2.f126790a
            if (r8 != r7) goto L_0x0367
            java.lang.Object r2 = r2.f126791b
            com.google.assistant.ag.c.cy r2 = (com.google.assistant.p3803ag.p3809c.C49005cy) r2
            com.google.assistant.ag.c.z r3 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.ag.c.y r3 = (com.google.assistant.p3803ag.p3809c.C49155y) r3
            long r8 = r2.f126764b
            com.google.protobuf.fg r8 = com.google.protobuf.p4750c.C62953e.m95484i(r8)
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            com.google.assistant.ag.c.z r9 = (com.google.assistant.p3803ag.p3809c.C49156z) r9
            r8.getClass()
            r9.f127114b = r8
            int r8 = r9.f127113a
            r8 = r8 | r7
            r9.f127113a = r8
            long r8 = r2.f126765c
            com.google.protobuf.fg r2 = com.google.protobuf.p4750c.C62953e.m95484i(r8)
            r3.copyOnWrite()
            com.google.protobuf.bv r8 = r3.instance
            com.google.assistant.ag.c.z r8 = (com.google.assistant.p3803ag.p3809c.C49156z) r8
            r2.getClass()
            r8.f127115c = r2
            int r2 = r8.f127113a
            r2 = r2 | r6
            r8.f127113a = r2
            com.google.protobuf.bv r2 = r3.build()
            r3 = r2
            com.google.assistant.ag.c.z r3 = (com.google.assistant.p3803ag.p3809c.C49156z) r3
            goto L_0x03b7
        L_0x0367:
            if (r8 != r5) goto L_0x03b7
            java.lang.Object r2 = r2.f126791b
            com.google.assistant.ag.c.de r2 = (com.google.assistant.p3803ag.p3809c.C49012de) r2
            com.google.assistant.ag.c.z r3 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.ag.c.y r3 = (com.google.assistant.p3803ag.p3809c.C49155y) r3
            com.google.assistant.ag.c.dc r8 = r2.f126777b
            if (r8 != 0) goto L_0x037b
            com.google.assistant.ag.c.dc r8 = com.google.assistant.p3803ag.p3809c.C49010dc.f126769c
        L_0x037b:
            com.google.protobuf.fg r8 = m34995d(r8)
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            com.google.assistant.ag.c.z r9 = (com.google.assistant.p3803ag.p3809c.C49156z) r9
            r8.getClass()
            r9.f127114b = r8
            int r8 = r9.f127113a
            r8 = r8 | r7
            r9.f127113a = r8
            int r8 = r2.f126776a
            r8 = r8 & r6
            if (r8 == 0) goto L_0x03b0
            com.google.assistant.ag.c.dc r2 = r2.f126778c
            if (r2 != 0) goto L_0x039b
            com.google.assistant.ag.c.dc r2 = com.google.assistant.p3803ag.p3809c.C49010dc.f126769c
        L_0x039b:
            com.google.protobuf.fg r2 = m34995d(r2)
            r3.copyOnWrite()
            com.google.protobuf.bv r8 = r3.instance
            com.google.assistant.ag.c.z r8 = (com.google.assistant.p3803ag.p3809c.C49156z) r8
            r2.getClass()
            r8.f127115c = r2
            int r2 = r8.f127113a
            r2 = r2 | r6
            r8.f127113a = r2
        L_0x03b0:
            com.google.protobuf.bv r2 = r3.build()
            r3 = r2
            com.google.assistant.ag.c.z r3 = (com.google.assistant.p3803ag.p3809c.C49156z) r3
        L_0x03b7:
            if (r3 == 0) goto L_0x0400
            com.google.assistant.ag.c.az r2 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.ag.c.av r2 = (com.google.assistant.p3803ag.p3809c.C48948av) r2
            com.google.assistant.ag.c.br r8 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.ag.c.bl r8 = (com.google.assistant.p3803ag.p3809c.C48965bl) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.ag.c.br r9 = (com.google.assistant.p3803ag.p3809c.C48971br) r9
            r9.f126692b = r3
            r9.f126691a = r7
            com.google.protobuf.bv r3 = r8.build()
            com.google.assistant.ag.c.br r3 = (com.google.assistant.p3803ag.p3809c.C48971br) r3
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.ag.c.az r8 = (com.google.assistant.p3803ag.p3809c.C48952az) r8
            r3.getClass()
            r8.f126660b = r3
            r8.f126659a = r7
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.ag.c.az r2 = (com.google.assistant.p3803ag.p3809c.C48952az) r2
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.ag.b.a.ac r3 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r3
            r2.getClass()
            r3.f126512d = r2
            int r2 = r3.f126509a
            r2 = r2 | r5
            r3.f126509a = r2
            goto L_0x0436
        L_0x0400:
            com.google.android.libraries.assistant.contexttrigger.d r2 = r13.f50923i
            boolean r2 = r2.f50790c
            if (r2 == 0) goto L_0x0417
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.ag.b.a.ac r2 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r2
            r3 = 5
            r2.f126515g = r3
            int r3 = r2.f126509a
            r3 = r3 | 32
            r2.f126509a = r3
            goto L_0x0436
        L_0x0417:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.ag.b.a.ac r2 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r2
            r2.f126515g = r7
            int r3 = r2.f126509a
            r3 = r3 | 32
            r2.f126509a = r3
            goto L_0x0436
        L_0x0427:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.ag.b.a.ac r2 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r2
            r2.f126515g = r6
            int r3 = r2.f126509a
            r3 = r3 | 32
            r2.f126509a = r3
        L_0x0436:
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.ag.b.a.ac r2 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r2
            int r3 = r2.f126515g
            int r3 = com.google.assistant.p3803ag.p3807b.p3808a.C48887ab.m85291b(r3)
            if (r3 != 0) goto L_0x0444
            goto L_0x04ec
        L_0x0444:
            if (r3 != r4) goto L_0x04ec
            com.google.assistant.ag.c.az r2 = r2.f126512d
            if (r2 != 0) goto L_0x044c
            com.google.assistant.ag.c.az r2 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x044c:
            int r3 = r2.f126659a
            if (r3 != r7) goto L_0x0455
            java.lang.Object r2 = r2.f126660b
            com.google.assistant.ag.c.br r2 = (com.google.assistant.p3803ag.p3809c.C48971br) r2
            goto L_0x0457
        L_0x0455:
            com.google.assistant.ag.c.br r2 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x0457:
            int r3 = r2.f126691a
            if (r3 != r7) goto L_0x0460
            java.lang.Object r2 = r2.f126692b
            com.google.assistant.ag.c.z r2 = (com.google.assistant.p3803ag.p3809c.C49156z) r2
            goto L_0x0462
        L_0x0460:
            com.google.assistant.ag.c.z r2 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d
        L_0x0462:
            int r3 = r2.f127113a
            r3 = r3 & r6
            if (r3 != 0) goto L_0x04ec
            com.google.protobuf.bn r3 = r2.toBuilder()
            com.google.assistant.ag.c.y r3 = (com.google.assistant.p3803ag.p3809c.C49155y) r3
            com.google.protobuf.fg r2 = r2.f127114b
            if (r2 != 0) goto L_0x0473
            com.google.protobuf.fg r2 = com.google.protobuf.C63042fg.f170152c
        L_0x0473:
            com.google.protobuf.ar r4 = f50915a
            com.google.protobuf.fg r2 = com.google.protobuf.p4750c.C62953e.m95481f(r2, r4)
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.ag.c.z r4 = (com.google.assistant.p3803ag.p3809c.C49156z) r4
            r2.getClass()
            r4.f127115c = r2
            int r2 = r4.f127113a
            r2 = r2 | r6
            r4.f127113a = r2
            com.google.protobuf.bv r2 = r3.build()
            com.google.assistant.ag.c.z r2 = (com.google.assistant.p3803ag.p3809c.C49156z) r2
            com.google.assistant.ag.c.az r3 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.ag.c.av r3 = (com.google.assistant.p3803ag.p3809c.C48948av) r3
            com.google.protobuf.bv r4 = r1.instance
            com.google.assistant.ag.b.a.ac r4 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r4
            com.google.assistant.ag.c.az r4 = r4.f126512d
            if (r4 != 0) goto L_0x04a2
            com.google.assistant.ag.c.az r4 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x04a2:
            int r6 = r4.f126659a
            if (r6 != r7) goto L_0x04ab
            java.lang.Object r4 = r4.f126660b
            com.google.assistant.ag.c.br r4 = (com.google.assistant.p3803ag.p3809c.C48971br) r4
            goto L_0x04ad
        L_0x04ab:
            com.google.assistant.ag.c.br r4 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x04ad:
            com.google.protobuf.bn r4 = r4.toBuilder()
            com.google.assistant.ag.c.bl r4 = (com.google.assistant.p3803ag.p3809c.C48965bl) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.assistant.ag.c.br r6 = (com.google.assistant.p3803ag.p3809c.C48971br) r6
            r2.getClass()
            r6.f126692b = r2
            r6.f126691a = r7
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.assistant.ag.c.az r2 = (com.google.assistant.p3803ag.p3809c.C48952az) r2
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.ag.c.br r4 = (com.google.assistant.p3803ag.p3809c.C48971br) r4
            r4.getClass()
            r2.f126660b = r4
            r2.f126659a = r7
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.ag.b.a.ac r2 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r2
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.ag.c.az r3 = (com.google.assistant.p3803ag.p3809c.C48952az) r3
            r3.getClass()
            r2.f126512d = r3
            int r3 = r2.f126509a
            r3 = r3 | r5
            r2.f126509a = r3
        L_0x04ec:
            java.util.Map r2 = r13.f50920d
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.ag.b.a.ac r1 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r1
            r2.put(r0, r1)
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            com.google.assistant.ag.b.a.al r1 = (com.google.assistant.p3803ag.p3807b.p3808a.C48897al) r1
            com.google.assistant.ag.b.a.al r2 = com.google.assistant.p3803ag.p3807b.p3808a.C48897al.f126526e
            r1.f126529b = r5
            r1.f126530c = r0
        L_0x0504:
            java.lang.String r14 = com.google.android.libraries.search.assistant.proactive.p2776h.C36314g.m64795a(r14)
            r15.copyOnWrite()
            com.google.protobuf.bv r15 = r15.instance
            com.google.assistant.ag.b.a.al r15 = (com.google.assistant.p3803ag.p3807b.p3808a.C48897al) r15
            int r0 = r15.f126528a
            r0 = r0 | 16
            r15.f126528a = r0
            r15.f126531d = r14
            return
        L_0x0518:
            throw r3
        L_0x0519:
            goto L_0x051b
        L_0x051a:
            throw r3
        L_0x051b:
            goto L_0x051a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.contexttrigger.p1462f.C17716h.mo23447b(com.google.assistant.ag.c.az, com.google.assistant.ag.b.a.ah):void");
    }
}
