package androidx.media3.extractor.p172k;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3347av;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.k.l */
/* compiled from: PG */
public final class C3559l implements C3557j {

    /* renamed from: a */
    private static final double[] f11200a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: b */
    private String f11201b;

    /* renamed from: c */
    private C3368bf f11202c;

    /* renamed from: d */
    private final C3548au f11203d;

    /* renamed from: e */
    private final C2604ac f11204e;

    /* renamed from: f */
    private final C3571x f11205f;

    /* renamed from: g */
    private final boolean[] f11206g;

    /* renamed from: h */
    private final C3558k f11207h;

    /* renamed from: i */
    private long f11208i;

    /* renamed from: j */
    private boolean f11209j;

    /* renamed from: k */
    private boolean f11210k;

    /* renamed from: l */
    private long f11211l;

    /* renamed from: m */
    private long f11212m;

    /* renamed from: n */
    private long f11213n;

    /* renamed from: o */
    private long f11214o;

    /* renamed from: p */
    private boolean f11215p;

    /* renamed from: q */
    private boolean f11216q;

    public C3559l() {
        this((C3548au) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x020b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7466a(androidx.media3.common.p136b.C2604ac r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            androidx.media3.extractor.bf r2 = r0.f11202c
            androidx.media3.common.p136b.C2601a.m6829a(r2)
            int r2 = r1.f7235b
            int r3 = r1.f7236c
            byte[] r4 = r1.f7234a
            int r5 = r3 - r2
            long r6 = r0.f11208i
            long r8 = (long) r5
            long r6 = r6 + r8
            r0.f11208i = r6
            androidx.media3.extractor.bf r6 = r0.f11202c
            r6.mo6851c(r1, r5)
        L_0x001c:
            boolean[] r5 = r0.f11206g
            int r5 = androidx.media3.extractor.C3347av.m9692a(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x0035
            boolean r1 = r0.f11210k
            if (r1 != 0) goto L_0x002d
            androidx.media3.extractor.k.k r1 = r0.f11207h
            r1.mo7471a(r4, r2, r3)
        L_0x002d:
            androidx.media3.extractor.k.x r1 = r0.f11205f
            if (r1 == 0) goto L_0x0034
            r1.mo7480a(r4, r2, r3)
        L_0x0034:
            return
        L_0x0035:
            int r6 = r5 + 3
            byte[] r7 = r1.f7234a
            byte r7 = r7[r6]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r5 - r2
            boolean r9 = r0.f11210k
            r11 = 0
            if (r9 != 0) goto L_0x0149
            if (r8 <= 0) goto L_0x004b
            androidx.media3.extractor.k.k r9 = r0.f11207h
            r9.mo7471a(r4, r2, r5)
        L_0x004b:
            if (r8 >= 0) goto L_0x004f
            int r9 = -r8
            goto L_0x0050
        L_0x004f:
            r9 = 0
        L_0x0050:
            androidx.media3.extractor.k.k r13 = r0.f11207h
            boolean r14 = r13.f11196b
            if (r14 == 0) goto L_0x0136
            int r14 = r13.f11197c
            int r14 = r14 - r9
            r13.f11197c = r14
            int r9 = r13.f11198d
            if (r9 != 0) goto L_0x006b
            r9 = 181(0xb5, float:2.54E-43)
            if (r7 != r9) goto L_0x006b
            r13.f11198d = r14
            r16 = r2
            r7 = 181(0xb5, float:2.54E-43)
            goto L_0x0141
        L_0x006b:
            r13.f11196b = r11
            java.lang.String r9 = r0.f11201b
            r9.getClass()
            byte[] r11 = r13.f11199e
            byte[] r11 = java.util.Arrays.copyOf(r11, r14)
            r14 = 4
            byte r10 = r11[r14]
            r16 = 5
            byte r12 = r11[r16]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << r14
            int r17 = r12 >> 4
            r10 = r10 | r17
            r12 = r12 & 15
            r15 = 8
            int r12 = r12 << r15
            r18 = 6
            byte r15 = r11[r18]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r12 = r12 | r15
            r15 = 7
            byte r14 = r11[r15]
            r14 = r14 & 240(0xf0, float:3.36E-43)
            r15 = 4
            int r14 = r14 >> r15
            r15 = 2
            if (r14 == r15) goto L_0x00b3
            r15 = 3
            if (r14 == r15) goto L_0x00ad
            r15 = 4
            if (r14 == r15) goto L_0x00a7
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00ba
        L_0x00a7:
            int r14 = r12 * 121
            float r14 = (float) r14
            int r15 = r10 * 100
            goto L_0x00b8
        L_0x00ad:
            int r14 = r12 * 16
            float r14 = (float) r14
            int r15 = r10 * 9
            goto L_0x00b8
        L_0x00b3:
            int r14 = r12 * 4
            float r14 = (float) r14
            int r15 = r10 * 3
        L_0x00b8:
            float r15 = (float) r15
            float r14 = r14 / r15
        L_0x00ba:
            androidx.media3.common.w r15 = new androidx.media3.common.w
            r15.<init>()
            r15.f7449a = r9
            java.lang.String r9 = "video/mpeg2"
            r15.f7459k = r9
            r15.f7464p = r10
            r15.f7465q = r12
            r15.f7468t = r14
            java.util.List r9 = java.util.Collections.singletonList(r11)
            r15.f7461m = r9
            androidx.media3.common.x r9 = new androidx.media3.common.x
            r9.<init>(r15)
            r10 = 7
            byte r10 = r11[r10]
            r10 = r10 & 15
            int r10 = r10 + -1
            r14 = 0
            if (r10 < 0) goto L_0x0115
            r12 = 8
            if (r10 >= r12) goto L_0x0115
            double[] r12 = f11200a
            r14 = r12[r10]
            int r10 = r13.f11198d
            int r10 = r10 + 9
            byte r10 = r11[r10]
            r11 = r10 & 96
            int r11 = r11 >> 5
            r10 = r10 & 31
            if (r11 == r10) goto L_0x010b
            double r11 = (double) r11
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r11)
            double r11 = r11 + r17
            int r10 = r10 + 1
            r16 = r2
            double r1 = (double) r10
            java.lang.Double.isNaN(r1)
            double r11 = r11 / r1
            double r14 = r14 * r11
            goto L_0x010d
        L_0x010b:
            r16 = r2
        L_0x010d:
            r1 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r1 = r1 / r14
            long r14 = (long) r1
            goto L_0x0117
        L_0x0115:
            r16 = r2
        L_0x0117:
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            android.util.Pair r1 = android.util.Pair.create(r9, r1)
            androidx.media3.extractor.bf r2 = r0.f11202c
            java.lang.Object r9 = r1.first
            androidx.media3.common.x r9 = (androidx.media3.common.C2680x) r9
            r2.mo6850b(r9)
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r0.f11211l = r1
            r1 = 1
            r0.f11210k = r1
            goto L_0x014b
        L_0x0136:
            r16 = r2
            r1 = 1
            r2 = 179(0xb3, float:2.51E-43)
            if (r7 != r2) goto L_0x0141
            r13.f11196b = r1
            r7 = 179(0xb3, float:2.51E-43)
        L_0x0141:
            byte[] r1 = androidx.media3.extractor.p172k.C3558k.f11195a
            r2 = 3
            r9 = 0
            r13.mo7471a(r1, r9, r2)
            goto L_0x014b
        L_0x0149:
            r16 = r2
        L_0x014b:
            androidx.media3.extractor.k.x r1 = r0.f11205f
            if (r1 == 0) goto L_0x0196
            if (r8 <= 0) goto L_0x0158
            r2 = r16
            r1.mo7480a(r4, r2, r5)
            r9 = 0
            goto L_0x0159
        L_0x0158:
            int r9 = -r8
        L_0x0159:
            androidx.media3.extractor.k.x r1 = r0.f11205f
            boolean r1 = r1.mo7483d(r9)
            if (r1 == 0) goto L_0x017f
            androidx.media3.extractor.k.x r1 = r0.f11205f
            byte[] r2 = r1.f11359b
            int r1 = r1.f11360c
            int r1 = androidx.media3.extractor.C3347av.m9693b(r2, r1)
            androidx.media3.common.b.ac r2 = r0.f11204e
            int r8 = androidx.media3.common.p136b.C2612ak.f7249a
            androidx.media3.extractor.k.x r8 = r0.f11205f
            byte[] r8 = r8.f11359b
            r2.mo6157y(r8, r1)
            androidx.media3.extractor.k.au r1 = r0.f11203d
            long r8 = r0.f11214o
            androidx.media3.common.b.ac r2 = r0.f11204e
            r1.mo7464a(r8, r2)
        L_0x017f:
            r1 = 178(0xb2, float:2.5E-43)
            if (r7 != r1) goto L_0x0196
            r2 = r20
            byte[] r7 = r2.f7234a
            int r8 = r5 + 2
            byte r7 = r7[r8]
            r8 = 1
            if (r7 != r8) goto L_0x0193
            androidx.media3.extractor.k.x r7 = r0.f11205f
            r7.mo7482c(r1)
        L_0x0193:
            r7 = 178(0xb2, float:2.5E-43)
            goto L_0x0198
        L_0x0196:
            r2 = r20
        L_0x0198:
            if (r7 == 0) goto L_0x01a9
            r1 = 179(0xb3, float:2.51E-43)
            if (r7 != r1) goto L_0x019f
            goto L_0x01a9
        L_0x019f:
            r1 = 184(0xb8, float:2.58E-43)
            if (r7 != r1) goto L_0x01a6
            r1 = 1
            r0.f11215p = r1
        L_0x01a6:
            r5 = r3
            goto L_0x020e
        L_0x01a9:
            int r1 = r3 - r5
            boolean r5 = r0.f11216q
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == 0) goto L_0x01d6
            boolean r5 = r0.f11210k
            if (r5 == 0) goto L_0x01d6
            long r9 = r0.f11214o
            int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x01d6
            boolean r11 = r0.f11215p
            long r12 = r0.f11208i
            long r14 = r0.f11213n
            androidx.media3.extractor.bf r8 = r0.f11202c
            long r12 = r12 - r14
            int r5 = (int) r12
            int r12 = r5 - r1
            r14 = 0
            r13 = r1
            r5 = r3
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.mo6852d(r9, r11, r12, r13, r14)
            goto L_0x01d8
        L_0x01d6:
            r5 = r3
            r2 = r14
        L_0x01d8:
            boolean r8 = r0.f11209j
            if (r8 == 0) goto L_0x01e4
            boolean r8 = r0.f11216q
            if (r8 == 0) goto L_0x01e1
            goto L_0x01e4
        L_0x01e1:
            r1 = 0
            r2 = 1
            goto L_0x0207
        L_0x01e4:
            long r8 = r0.f11208i
            long r10 = (long) r1
            long r8 = r8 - r10
            r0.f11213n = r8
            long r14 = r0.f11212m
            int r1 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x01f1
            goto L_0x01fd
        L_0x01f1:
            long r8 = r0.f11214o
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x01fc
            long r10 = r0.f11211l
            long r14 = r8 + r10
            goto L_0x01fd
        L_0x01fc:
            r14 = r2
        L_0x01fd:
            r0.f11214o = r14
            r1 = 0
            r0.f11215p = r1
            r0.f11212m = r2
            r2 = 1
            r0.f11209j = r2
        L_0x0207:
            if (r7 != 0) goto L_0x020b
            r11 = 1
            goto L_0x020c
        L_0x020b:
            r11 = 0
        L_0x020c:
            r0.f11216q = r11
        L_0x020e:
            r1 = r20
            r3 = r5
            r2 = r6
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p172k.C3559l.mo7466a(androidx.media3.common.b.ac):void");
    }

    /* renamed from: b */
    public final void mo7467b(C3329ad adVar, C3545ar arVar) {
        arVar.mo7462a();
        arVar.mo7463b();
        this.f11201b = arVar.f11109b;
        arVar.mo7463b();
        this.f11202c = adVar.mo6987eZ(arVar.f11108a, 2);
        C3548au auVar = this.f11203d;
        if (auVar != null) {
            auVar.mo7465b(adVar, arVar);
        }
    }

    /* renamed from: c */
    public final void mo7468c() {
    }

    /* renamed from: d */
    public final void mo7469d(long j, int i) {
        this.f11212m = j;
    }

    /* renamed from: e */
    public final void mo7470e() {
        C3347av.m9695d(this.f11206g);
        C3558k kVar = this.f11207h;
        kVar.f11196b = false;
        kVar.f11197c = 0;
        kVar.f11198d = 0;
        C3571x xVar = this.f11205f;
        if (xVar != null) {
            xVar.mo7481b();
        }
        this.f11208i = 0;
        this.f11209j = false;
        this.f11212m = -9223372036854775807L;
        this.f11214o = -9223372036854775807L;
    }

    public C3559l(C3548au auVar) {
        C2604ac acVar;
        this.f11203d = auVar;
        this.f11206g = new boolean[4];
        this.f11207h = new C3558k();
        if (auVar != null) {
            this.f11205f = new C3571x(178);
            acVar = new C2604ac();
        } else {
            acVar = null;
            this.f11205f = null;
        }
        this.f11204e = acVar;
        this.f11212m = -9223372036854775807L;
        this.f11214o = -9223372036854775807L;
    }
}
