package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.apps.search.googleapp.promomanager.p10374c.C137034c;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137035d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58729pv;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p4880aq.C63721aj;
import com.google.protos.p4880aq.C63723al;
import com.google.protos.p4880aq.C63728aq;
import com.google.protos.p4880aq.C63756m;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.x */
/* compiled from: PG */
public final class C137029x {

    /* renamed from: a */
    public final C63723al f372910a;

    /* renamed from: b */
    public final Executor f372911b;

    /* renamed from: c */
    public boolean f372912c = false;

    /* renamed from: d */
    public boolean f372913d = false;

    /* renamed from: e */
    public C58495hd f372914e = C58662ni.m90343b(C58729pv.f156485a);

    /* renamed from: f */
    public C58495hd f372915f = C58662ni.m90343b(C58729pv.f156485a);

    /* renamed from: g */
    private final C63728aq f372916g;

    /* renamed from: h */
    private final C63721aj f372917h;

    /* renamed from: i */
    private final boolean f372918i;

    /* renamed from: j */
    private final C136931am f372919j;

    /* renamed from: k */
    private final C21370a f372920k;

    public C137029x(C21370a aVar, C136931am amVar, Executor executor, boolean z, C63721aj ajVar, C63723al alVar, C63728aq aqVar) {
        this.f372918i = z;
        this.f372916g = aqVar;
        this.f372910a = alVar;
        this.f372917h = ajVar;
        this.f372919j = amVar;
        this.f372911b = executor;
        this.f372920k = aVar;
    }

    /* renamed from: c */
    private static boolean m222717c(C63042fg fgVar, Duration duration, Instant instant) {
        return C62950b.m95474e(fgVar).plus(duration).isBefore(instant);
    }

    /* renamed from: d */
    private static boolean m222718d(C137034c cVar, int i, Instant instant) {
        C63042fg fgVar = cVar.f372928c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        return cVar.f372927b >= i && instant.isBefore(C62950b.m95474e(fgVar));
    }

    /* renamed from: e */
    private static boolean m222719e(C137035d dVar, C63756m mVar, Instant instant) {
        if (!((dVar.f372931a & 1) == 0 || (mVar.f172476a & 1) == 0)) {
            C137034c cVar = dVar.f372932b;
            if (cVar == null) {
                cVar = C137034c.f372924d;
            }
            if (m222718d(cVar, mVar.f172477b, instant)) {
                return true;
            }
        }
        if (!((dVar.f372931a & 2) == 0 || (mVar.f172476a & 2) == 0)) {
            C137034c cVar2 = dVar.f372933c;
            if (cVar2 == null) {
                cVar2 = C137034c.f372924d;
            }
            if (m222718d(cVar2, mVar.f172478c, instant)) {
                return true;
            }
        }
        if (!((dVar.f372931a & 4) == 0 || (mVar.f172476a & 4) == 0)) {
            C137034c cVar3 = dVar.f372934d;
            if (cVar3 == null) {
                cVar3 = C137034c.f372924d;
            }
            if (m222718d(cVar3, mVar.f172479d, instant)) {
                return true;
            }
        }
        if ((dVar.f372931a & 8) == 0 || (mVar.f172476a & 8) == 0) {
            return false;
        }
        C137034c cVar4 = dVar.f372935e;
        if (cVar4 == null) {
            cVar4 = C137034c.f372924d;
        }
        if (m222718d(cVar4, mVar.f172480e, instant)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.google.protos.aq.aw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58495hd mo113480a(java.util.List r7) {
        /*
            r6 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.protos.aw.a.a.a.bm> r1 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm.class
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L_0x000b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0072
            java.lang.Object r1 = r7.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.protos.aq.aj r2 = r6.f372917h
            com.google.protos.aq.aw r3 = com.google.protos.p4880aq.C63734aw.f172313h
            com.google.protobuf.dn r2 = r2.f172283a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            boolean r5 = r2.containsKey(r4)
            if (r5 == 0) goto L_0x0032
            java.lang.Object r2 = r2.get(r4)
            r3 = r2
            com.google.protos.aq.aw r3 = (com.google.protos.p4880aq.C63734aw) r3
        L_0x0032:
            r2 = 0
            boolean r2 = com.google.android.apps.search.googleapp.promomanager.p10372b.C136959bn.m222629b(r3, r2)
            if (r2 == 0) goto L_0x000b
            com.google.protobuf.cj r2 = new com.google.protobuf.cj
            com.google.protobuf.ch r3 = r3.f172318d
            com.google.protobuf.ci r4 = com.google.protos.p4880aq.C63734aw.f172312e
            r2.<init>(r3, r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0046:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x000b
            java.lang.Object r3 = r2.next()
            com.google.protos.aq.ba r3 = (com.google.protos.p4880aq.C63739ba) r3
            com.google.common.b.be r4 = com.google.android.apps.search.googleapp.promomanager.p10372b.C136959bn.f372761a
            com.google.protos.aw.a.a.a.bm r5 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm.UNSPECIFIED
            java.lang.Object r3 = p3186j$.util.Map.EL.getOrDefault(r4, r3, r5)
            com.google.protos.aw.a.a.a.bm r3 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Object r4 = p3186j$.util.Map.EL.getOrDefault(r0, r3, r4)
            java.util.List r4 = (java.util.List) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4.add(r5)
            r0.put(r3, r4)
            goto L_0x0046
        L_0x0072:
            com.google.common.b.hd r7 = com.google.common.p4522b.C58662ni.m90343b(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.promomanager.p10372b.C137029x.mo113480a(java.util.List):com.google.common.b.hd");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: com.google.protos.aq.aw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v64, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: com.google.protos.aq.ao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v65, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v46, resolved type: com.google.android.apps.search.googleapp.promomanager.c.q} */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0198, code lost:
        if (m222717c(r7, p3186j$.time.Duration.ofMillis(r12.f172273d), r3) != false) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01a7, code lost:
        if (r9.f372954e >= r12.f172272c) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01cb, code lost:
        if (m222717c(r5, p3186j$.time.Duration.ofMillis(r12.f172275f), r3) == false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01e9, code lost:
        if (m222717c(r5, p3186j$.time.Duration.ofMillis(r12.f172277h), r3) != false) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01fd, code lost:
        if (m222719e(r5, r6, r3) == false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (m222717c(r6, p3186j$.time.Duration.ofMillis(r0.f372916g.f172298c), r3) != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a3, code lost:
        if (m222717c(r5, p3186j$.time.Duration.ofMillis(r9.f172292c), r3) != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0170, code lost:
        if (m222717c(r15, p3186j$.time.Duration.ofMillis(r12.f172273d), r3) != false) goto L_0x0178;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0176  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo113481b(com.google.android.apps.search.googleapp.promomanager.p10374c.C137041j r17, com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj r18, com.google.common.p4522b.C58495hd r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            com.google.android.libraries.f.a r3 = r0.f372920k
            long r3 = r3.mo26870b()
            j$.time.Instant r3 = p3186j$.time.Instant.ofEpochMilli(r3)
            int r4 = r2.f372882b
            com.google.protos.aw.a.a.a.bm r4 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm.m96318a(r4)
            if (r4 != 0) goto L_0x001a
            com.google.protos.aw.a.a.a.bm r4 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm.UNSPECIFIED
        L_0x001a:
            com.google.android.apps.search.googleapp.promomanager.c.q r5 = r1.f372945e
            if (r5 != 0) goto L_0x0020
            com.google.android.apps.search.googleapp.promomanager.c.q r5 = com.google.android.apps.search.googleapp.promomanager.p10374c.C137048q.f372969d
        L_0x0020:
            int r6 = r5.f372971a
            r7 = 1
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0042
            com.google.protos.aq.aq r6 = r0.f372916g
            int r6 = r6.f172296a
            r6 = r6 & 2
            if (r6 == 0) goto L_0x0042
            com.google.protobuf.fg r6 = r5.f372972b
            if (r6 != 0) goto L_0x0034
            com.google.protobuf.fg r6 = com.google.protobuf.C63042fg.f170152c
        L_0x0034:
            com.google.protos.aq.aq r8 = r0.f372916g
            long r8 = r8.f172298c
            j$.time.Duration r8 = p3186j$.time.Duration.ofMillis(r8)
            boolean r6 = m222717c(r6, r8, r3)
            if (r6 == 0) goto L_0x02e0
        L_0x0042:
            com.google.android.apps.search.googleapp.promomanager.c.d r5 = r5.f372973c
            if (r5 != 0) goto L_0x0048
            com.google.android.apps.search.googleapp.promomanager.c.d r5 = com.google.android.apps.search.googleapp.promomanager.p10374c.C137035d.f372929f
        L_0x0048:
            com.google.protos.aq.aq r6 = r0.f372916g
            com.google.protos.aq.m r6 = r6.f172297b
            if (r6 != 0) goto L_0x0050
            com.google.protos.aq.m r6 = com.google.protos.p4880aq.C63756m.f172474f
        L_0x0050:
            boolean r5 = m222719e(r5, r6, r3)
            if (r5 == 0) goto L_0x0058
            goto L_0x02e0
        L_0x0058:
            int r5 = r4.f172871h
            com.google.android.apps.search.googleapp.promomanager.c.q r6 = com.google.android.apps.search.googleapp.promomanager.p10374c.C137048q.f372969d
            com.google.protobuf.dn r8 = r1.f372944d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r9 = r8.containsKey(r5)
            if (r9 == 0) goto L_0x006f
            java.lang.Object r5 = r8.get(r5)
            r6 = r5
            com.google.android.apps.search.googleapp.promomanager.c.q r6 = (com.google.android.apps.search.googleapp.promomanager.p10374c.C137048q) r6
        L_0x006f:
            com.google.protos.aq.aq r5 = r0.f372916g
            int r8 = r4.f172871h
            com.google.protos.aq.ao r9 = com.google.protos.p4880aq.C63726ao.f172288d
            com.google.protobuf.dn r5 = r5.f172299d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r10 = r5.containsKey(r8)
            if (r10 == 0) goto L_0x0088
            java.lang.Object r5 = r5.get(r8)
            r9 = r5
            com.google.protos.aq.ao r9 = (com.google.protos.p4880aq.C63726ao) r9
        L_0x0088:
            int r5 = r6.f372971a
            r5 = r5 & r7
            if (r5 == 0) goto L_0x00a5
            int r5 = r9.f172290a
            r5 = r5 & 4
            if (r5 == 0) goto L_0x00a5
            com.google.protobuf.fg r5 = r6.f372972b
            if (r5 != 0) goto L_0x0099
            com.google.protobuf.fg r5 = com.google.protobuf.C63042fg.f170152c
        L_0x0099:
            long r10 = r9.f172292c
            j$.time.Duration r8 = p3186j$.time.Duration.ofMillis(r10)
            boolean r5 = m222717c(r5, r8, r3)
            if (r5 == 0) goto L_0x02e0
        L_0x00a5:
            com.google.android.apps.search.googleapp.promomanager.c.d r5 = r6.f372973c
            if (r5 != 0) goto L_0x00ab
            com.google.android.apps.search.googleapp.promomanager.c.d r5 = com.google.android.apps.search.googleapp.promomanager.p10374c.C137035d.f372929f
        L_0x00ab:
            com.google.protos.aq.m r6 = r9.f172291b
            if (r6 != 0) goto L_0x00b1
            com.google.protos.aq.m r6 = com.google.protos.p4880aq.C63756m.f172474f
        L_0x00b1:
            boolean r5 = m222719e(r5, r6, r3)
            if (r5 != 0) goto L_0x02e0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = r19
            java.lang.Object r5 = r6.getOrDefault(r4, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.protobuf.ch r6 = r1.f372942b
            r5.removeAll(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00d2:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x02ce
            java.lang.Object r8 = r5.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            com.google.protos.aq.aj r9 = r0.f372917h
            com.google.protos.aq.aw r10 = com.google.protos.p4880aq.C63734aw.f172313h
            com.google.protobuf.dn r9 = r9.f172283a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            boolean r12 = r9.containsKey(r11)
            if (r12 == 0) goto L_0x00f9
            java.lang.Object r9 = r9.get(r11)
            r10 = r9
            com.google.protos.aq.aw r10 = (com.google.protos.p4880aq.C63734aw) r10
        L_0x00f9:
            com.google.android.apps.search.googleapp.promomanager.c.m r9 = com.google.android.apps.search.googleapp.promomanager.p10374c.C137044m.f372948m
            com.google.protobuf.dn r12 = r1.f372943c
            boolean r13 = r12.containsKey(r11)
            if (r13 == 0) goto L_0x0109
            java.lang.Object r9 = r12.get(r11)
            com.google.android.apps.search.googleapp.promomanager.c.m r9 = (com.google.android.apps.search.googleapp.promomanager.p10374c.C137044m) r9
        L_0x0109:
            com.google.protos.aq.ag r11 = r10.f172317c
            if (r11 != 0) goto L_0x010f
            com.google.protos.aq.ag r11 = com.google.protos.p4880aq.C63718ag.f172268k
        L_0x010f:
            int r12 = r9.f372950a
            r12 = r12 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0127
            com.google.protos.aq.av r12 = r10.f172319f
            if (r12 != 0) goto L_0x011b
            com.google.protos.aq.av r12 = com.google.protos.p4880aq.C63733av.f172308c
        L_0x011b:
            com.google.protos.aq.av r13 = r9.f372961l
            if (r13 != 0) goto L_0x0121
            com.google.protos.aq.av r13 = com.google.protos.p4880aq.C63733av.f172308c
        L_0x0121:
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x00d2
        L_0x0127:
            boolean r12 = r0.f372918i
            r13 = 0
            if (r12 == 0) goto L_0x0144
            boolean r14 = r10.f172320g
            if (r14 != 0) goto L_0x0144
            com.google.protobuf.fg r14 = r9.f372955f
            if (r14 != 0) goto L_0x0136
            com.google.protobuf.fg r14 = com.google.protobuf.C63042fg.f170152c
        L_0x0136:
            com.google.protobuf.fg r15 = r9.f372953d
            if (r15 != 0) goto L_0x013c
            com.google.protobuf.fg r15 = com.google.protobuf.C63042fg.f170152c
        L_0x013c:
            int r14 = com.google.protobuf.p4750c.C62953e.m95476a(r14, r15)
            if (r14 <= 0) goto L_0x0144
            r14 = 1
            goto L_0x0145
        L_0x0144:
            r14 = 0
        L_0x0145:
            if (r12 == 0) goto L_0x014c
            boolean r12 = r10.f172320g
            if (r12 == 0) goto L_0x014c
            r13 = 1
        L_0x014c:
            com.google.protos.aq.ag r12 = r10.f172317c
            if (r12 != 0) goto L_0x0152
            com.google.protos.aq.ag r12 = com.google.protos.p4880aq.C63718ag.f172268k
        L_0x0152:
            int r15 = r12.f172270a
            r15 = r15 & 4
            if (r15 == 0) goto L_0x0176
            int r15 = r9.f372950a
            r15 = r15 & 4
            if (r15 == 0) goto L_0x0176
            com.google.protobuf.fg r15 = r9.f372953d
            if (r15 != 0) goto L_0x0164
            com.google.protobuf.fg r15 = com.google.protobuf.C63042fg.f170152c
        L_0x0164:
            r19 = r8
            long r7 = r12.f172273d
            j$.time.Duration r7 = p3186j$.time.Duration.ofMillis(r7)
            boolean r7 = m222717c(r15, r7, r3)
            if (r7 == 0) goto L_0x0173
            goto L_0x0178
        L_0x0173:
            r7 = 1
            goto L_0x00d2
        L_0x0176:
            r19 = r8
        L_0x0178:
            if (r13 == 0) goto L_0x01ad
            int r7 = r12.f172270a
            r7 = r7 & 4
            if (r7 == 0) goto L_0x019b
            int r7 = r9.f372950a
            r7 = r7 & 16
            if (r7 == 0) goto L_0x019b
            com.google.protobuf.fg r7 = r9.f372955f
            if (r7 != 0) goto L_0x018c
            com.google.protobuf.fg r7 = com.google.protobuf.C63042fg.f170152c
        L_0x018c:
            r13 = r5
            r8 = r6
            long r5 = r12.f172273d
            j$.time.Duration r5 = p3186j$.time.Duration.ofMillis(r5)
            boolean r5 = m222717c(r7, r5, r3)
            if (r5 == 0) goto L_0x01aa
            goto L_0x019d
        L_0x019b:
            r13 = r5
            r8 = r6
        L_0x019d:
            int r5 = r12.f172270a
            r5 = r5 & 2
            if (r5 == 0) goto L_0x01af
            int r5 = r9.f372954e
            int r6 = r12.f172272c
            if (r5 >= r6) goto L_0x01aa
            goto L_0x01af
        L_0x01aa:
            r6 = r8
            r5 = r13
            goto L_0x0173
        L_0x01ad:
            r13 = r5
            r8 = r6
        L_0x01af:
            int r5 = r12.f172270a
            r5 = r5 & 16
            if (r5 == 0) goto L_0x01cd
            int r5 = r9.f372950a
            r5 = r5 & 64
            if (r5 == 0) goto L_0x01cd
            com.google.protobuf.fg r5 = r9.f372957h
            if (r5 != 0) goto L_0x01c1
            com.google.protobuf.fg r5 = com.google.protobuf.C63042fg.f170152c
        L_0x01c1:
            long r6 = r12.f172275f
            j$.time.Duration r6 = p3186j$.time.Duration.ofMillis(r6)
            boolean r5 = m222717c(r5, r6, r3)
            if (r5 == 0) goto L_0x01aa
        L_0x01cd:
            int r5 = r12.f172270a
            r5 = r5 & 64
            if (r5 == 0) goto L_0x01eb
            int r5 = r9.f372950a
            r5 = r5 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x01eb
            com.google.protobuf.fg r5 = r9.f372959j
            if (r5 != 0) goto L_0x01df
            com.google.protobuf.fg r5 = com.google.protobuf.C63042fg.f170152c
        L_0x01df:
            long r6 = r12.f172277h
            j$.time.Duration r6 = p3186j$.time.Duration.ofMillis(r6)
            boolean r5 = m222717c(r5, r6, r3)
            if (r5 == 0) goto L_0x01aa
        L_0x01eb:
            if (r14 != 0) goto L_0x01ff
            com.google.android.apps.search.googleapp.promomanager.c.d r5 = r9.f372960k
            if (r5 != 0) goto L_0x01f3
            com.google.android.apps.search.googleapp.promomanager.c.d r5 = com.google.android.apps.search.googleapp.promomanager.p10374c.C137035d.f372929f
        L_0x01f3:
            com.google.protos.aq.m r6 = r12.f172278i
            if (r6 != 0) goto L_0x01f9
            com.google.protos.aq.m r6 = com.google.protos.p4880aq.C63756m.f172474f
        L_0x01f9:
            boolean r5 = m222719e(r5, r6, r3)
            if (r5 != 0) goto L_0x01aa
        L_0x01ff:
            com.google.android.apps.search.googleapp.promomanager.b.dh r5 = com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh.f372869h
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.search.googleapp.promomanager.b.df r5 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C137005df) r5
            com.google.protos.aq.av r6 = r10.f172319f
            if (r6 != 0) goto L_0x020d
            com.google.protos.aq.av r6 = com.google.protos.p4880aq.C63733av.f172308c
        L_0x020d:
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.apps.search.googleapp.promomanager.b.dh r7 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh) r7
            r6.getClass()
            r7.f372873c = r6
            r6 = 1
            r7.f372872b = r6
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.search.googleapp.promomanager.b.dh r6 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh) r6
            int r7 = r4.f172871h
            r6.f372874d = r7
            int r7 = r6.f372871a
            r7 = r7 | 4
            r6.f372871a = r7
            com.google.protos.aw.a.a.a.aw r6 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw.f172816e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.protos.aw.a.a.a.av r6 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63908av) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.protos.aw.a.a.a.aw r7 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw) r7
            int r9 = r7.f172818a
            r12 = 1
            r9 = r9 | r12
            r7.f172818a = r9
            r9 = r19
            r7.f172819b = r9
            int r7 = r10.f172316b
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.protos.aw.a.a.a.aw r9 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw) r9
            int r12 = r9.f172818a
            r12 = r12 | 2
            r9.f172818a = r12
            r9.f172820c = r7
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.apps.search.googleapp.promomanager.b.dh r7 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh) r7
            com.google.protobuf.bv r6 = r6.build()
            com.google.protos.aw.a.a.a.aw r6 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw) r6
            r6.getClass()
            r7.f372875e = r6
            int r6 = r7.f372871a
            r6 = r6 | 8
            r7.f372871a = r6
            boolean r6 = r10.f172320g
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.apps.search.googleapp.promomanager.b.dh r7 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh) r7
            int r9 = r7.f372871a
            r9 = r9 | 16
            r7.f372871a = r9
            r7.f372876f = r6
            boolean r6 = r11.f172279j
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.apps.search.googleapp.promomanager.b.dh r7 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh) r7
            int r9 = r7.f372871a
            r9 = r9 | 32
            r7.f372871a = r9
            r7.f372877g = r6
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.apps.search.googleapp.promomanager.b.dh r5 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh) r5
            int r6 = r11.f172270a
            r7 = 1
            r6 = r6 & r7
            if (r6 == 0) goto L_0x02bd
            com.google.android.apps.search.googleapp.promomanager.b.am r6 = r0.f372919j
            com.google.protos.aq.ad r7 = r11.f172271b
            if (r7 != 0) goto L_0x02a5
            com.google.protos.aq.ad r7 = com.google.protos.p4880aq.C63715ad.f172262c
        L_0x02a5:
            com.google.common.util.concurrent.cx r6 = r6.mo113440b(r7, r2)
            com.google.android.apps.search.googleapp.promomanager.b.q r7 = new com.google.android.apps.search.googleapp.promomanager.b.q
            r7.<init>(r5)
            java.util.concurrent.Executor r5 = r0.f372911b
            com.google.common.base.ah r7 = com.google.apps.tiktok.tracing.C47810es.m84963c(r7)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60922j.m93044g(r6, r7, r5)
            r8.add(r5)
            goto L_0x01aa
        L_0x02bd:
            com.google.android.apps.search.googleapp.promomanager.b.c r6 = new com.google.android.apps.search.googleapp.promomanager.b.c
            r7 = 1
            r6.<init>(r5, r7)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            r8.add(r5)
            r6 = r8
            r5 = r13
            goto L_0x00d2
        L_0x02ce:
            r8 = r6
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92906o(r8)
            com.google.android.apps.search.googleapp.promomanager.b.r r2 = com.google.android.apps.search.googleapp.promomanager.p10372b.C137023r.f372905a
            java.util.concurrent.Executor r3 = r0.f372911b
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93044g(r1, r2, r3)
            return r1
        L_0x02e0:
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.promomanager.p10372b.C137029x.mo113481b(com.google.android.apps.search.googleapp.promomanager.c.j, com.google.android.apps.search.googleapp.promomanager.b.dj, com.google.common.b.hd):com.google.common.util.concurrent.cx");
    }
}
