package androidx.media3.extractor.p172k;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3347av;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.k.o */
/* compiled from: PG */
public final class C3562o implements C3557j {

    /* renamed from: a */
    private static final float[] f11231a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: b */
    private final C3548au f11232b;

    /* renamed from: c */
    private final C2604ac f11233c;

    /* renamed from: d */
    private final boolean[] f11234d;

    /* renamed from: e */
    private final C3560m f11235e;

    /* renamed from: f */
    private final C3571x f11236f;

    /* renamed from: g */
    private C3561n f11237g;

    /* renamed from: h */
    private long f11238h;

    /* renamed from: i */
    private String f11239i;

    /* renamed from: j */
    private C3368bf f11240j;

    /* renamed from: k */
    private boolean f11241k;

    /* renamed from: l */
    private long f11242l;

    public C3562o() {
        this((C3548au) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0138  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7466a(androidx.media3.common.p136b.C2604ac r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            androidx.media3.extractor.k.n r2 = r0.f11237g
            androidx.media3.common.p136b.C2601a.m6829a(r2)
            androidx.media3.extractor.bf r2 = r0.f11240j
            androidx.media3.common.p136b.C2601a.m6829a(r2)
            int r2 = r1.f7235b
            int r3 = r1.f7236c
            byte[] r4 = r1.f7234a
            int r5 = r3 - r2
            long r6 = r0.f11238h
            long r8 = (long) r5
            long r6 = r6 + r8
            r0.f11238h = r6
            androidx.media3.extractor.bf r6 = r0.f11240j
            r6.mo6851c(r1, r5)
        L_0x0021:
            boolean[] r5 = r0.f11234d
            int r5 = androidx.media3.extractor.C3347av.m9692a(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x003d
            boolean r1 = r0.f11241k
            if (r1 != 0) goto L_0x0032
            androidx.media3.extractor.k.m r1 = r0.f11235e
            r1.mo7472a(r4, r2, r3)
        L_0x0032:
            androidx.media3.extractor.k.n r1 = r0.f11237g
            r1.mo7474a(r4, r2, r3)
            androidx.media3.extractor.k.x r1 = r0.f11236f
            r1.mo7480a(r4, r2, r3)
            return
        L_0x003d:
            int r6 = r5 + 3
            byte[] r7 = r1.f7234a
            byte r7 = r7[r6]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r5 - r2
            boolean r9 = r0.f11241k
            r12 = 1
            if (r9 != 0) goto L_0x01d4
            if (r8 <= 0) goto L_0x0053
            androidx.media3.extractor.k.m r9 = r0.f11235e
            r9.mo7472a(r4, r2, r5)
        L_0x0053:
            if (r8 >= 0) goto L_0x0057
            int r9 = -r8
            goto L_0x0058
        L_0x0057:
            r9 = 0
        L_0x0058:
            androidx.media3.extractor.k.m r13 = r0.f11235e
            int r14 = r13.f11219c
            if (r14 == 0) goto L_0x01bf
            java.lang.String r11 = "Unexpected start code value"
            r10 = 2
            java.lang.String r15 = "H263Reader"
            if (r14 == r12) goto L_0x01ae
            if (r14 == r10) goto L_0x019d
            r10 = 3
            if (r14 == r10) goto L_0x0186
            r10 = 179(0xb3, float:2.51E-43)
            if (r7 == r10) goto L_0x0079
            r10 = 181(0xb5, float:2.54E-43)
            if (r7 != r10) goto L_0x0075
            r7 = 181(0xb5, float:2.54E-43)
            goto L_0x0079
        L_0x0075:
            r17 = r6
            goto L_0x01cc
        L_0x0079:
            int r10 = r13.f11220d
            int r10 = r10 - r9
            r13.f11220d = r10
            r9 = 0
            r13.f11218b = r9
            androidx.media3.extractor.bf r9 = r0.f11240j
            int r11 = r13.f11221e
            java.lang.String r14 = r0.f11239i
            r14.getClass()
            byte[] r13 = r13.f11222f
            byte[] r10 = java.util.Arrays.copyOf(r13, r10)
            androidx.media3.common.b.ab r13 = new androidx.media3.common.b.ab
            int r12 = r10.length
            r13.<init>(r10, r12)
            r13.mo6127l(r11)
            r11 = 4
            r13.mo6127l(r11)
            r13.mo6125j()
            r12 = 8
            r13.mo6126k(r12)
            boolean r16 = r13.mo6128m()
            if (r16 == 0) goto L_0x00b2
            r13.mo6126k(r11)
            r12 = 3
            r13.mo6126k(r12)
        L_0x00b2:
            int r11 = r13.mo6119d(r11)
            java.lang.String r12 = "Invalid aspect ratio"
            r17 = r6
            r6 = 15
            if (r11 != r6) goto L_0x00d3
            r6 = 8
            int r11 = r13.mo6119d(r6)
            int r6 = r13.mo6119d(r6)
            if (r6 != 0) goto L_0x00ce
            androidx.media3.common.p136b.C2633u.m7050e(r15, r12)
            goto L_0x00de
        L_0x00ce:
            float r11 = (float) r11
            float r6 = (float) r6
            float r12 = r11 / r6
            goto L_0x00e0
        L_0x00d3:
            r6 = 7
            if (r11 >= r6) goto L_0x00db
            float[] r6 = f11231a
            r12 = r6[r11]
            goto L_0x00e0
        L_0x00db:
            androidx.media3.common.p136b.C2633u.m7050e(r15, r12)
        L_0x00de:
            r12 = 1065353216(0x3f800000, float:1.0)
        L_0x00e0:
            boolean r6 = r13.mo6128m()
            if (r6 == 0) goto L_0x011a
            r6 = 2
            r13.mo6126k(r6)
            r6 = 1
            r13.mo6126k(r6)
            boolean r6 = r13.mo6128m()
            if (r6 == 0) goto L_0x011a
            r6 = 15
            r13.mo6126k(r6)
            r13.mo6125j()
            r13.mo6126k(r6)
            r13.mo6125j()
            r13.mo6126k(r6)
            r13.mo6125j()
            r11 = 3
            r13.mo6126k(r11)
            r11 = 11
            r13.mo6126k(r11)
            r13.mo6125j()
            r13.mo6126k(r6)
            r13.mo6125j()
        L_0x011a:
            r6 = 2
            int r6 = r13.mo6119d(r6)
            if (r6 == 0) goto L_0x0126
            java.lang.String r6 = "Unhandled video object layer shape"
            androidx.media3.common.p136b.C2633u.m7050e(r15, r6)
        L_0x0126:
            r13.mo6125j()
            r6 = 16
            int r6 = r13.mo6119d(r6)
            r13.mo6125j()
            boolean r11 = r13.mo6128m()
            if (r11 == 0) goto L_0x014d
            if (r6 != 0) goto L_0x0140
            java.lang.String r6 = "Invalid vop_increment_time_resolution"
            androidx.media3.common.p136b.C2633u.m7050e(r15, r6)
            goto L_0x014d
        L_0x0140:
            int r6 = r6 + -1
            r11 = 0
        L_0x0143:
            if (r6 <= 0) goto L_0x014a
            int r11 = r11 + 1
            int r6 = r6 >> 1
            goto L_0x0143
        L_0x014a:
            r13.mo6126k(r11)
        L_0x014d:
            r13.mo6125j()
            r6 = 13
            int r11 = r13.mo6119d(r6)
            r13.mo6125j()
            int r6 = r13.mo6119d(r6)
            r13.mo6125j()
            r13.mo6125j()
            androidx.media3.common.w r13 = new androidx.media3.common.w
            r13.<init>()
            r13.f7449a = r14
            java.lang.String r14 = "video/mp4v-es"
            r13.f7459k = r14
            r13.f7464p = r11
            r13.f7465q = r6
            r13.f7468t = r12
            java.util.List r6 = java.util.Collections.singletonList(r10)
            r13.f7461m = r6
            androidx.media3.common.x r6 = new androidx.media3.common.x
            r6.<init>(r13)
            r9.mo6850b(r6)
            r6 = 1
            r0.f11241k = r6
            goto L_0x01d6
        L_0x0186:
            r17 = r6
            r6 = r7 & 240(0xf0, float:3.36E-43)
            r9 = 32
            if (r6 == r9) goto L_0x0195
            androidx.media3.common.p136b.C2633u.m7050e(r15, r11)
            r13.mo7473b()
            goto L_0x01cc
        L_0x0195:
            int r6 = r13.f11220d
            r13.f11221e = r6
            r6 = 4
            r13.f11219c = r6
            goto L_0x01cc
        L_0x019d:
            r17 = r6
            r6 = 31
            if (r7 <= r6) goto L_0x01aa
            androidx.media3.common.p136b.C2633u.m7050e(r15, r11)
            r13.mo7473b()
            goto L_0x01cc
        L_0x01aa:
            r6 = 3
            r13.f11219c = r6
            goto L_0x01cc
        L_0x01ae:
            r17 = r6
            r6 = 181(0xb5, float:2.54E-43)
            if (r7 == r6) goto L_0x01bb
            androidx.media3.common.p136b.C2633u.m7050e(r15, r11)
            r13.mo7473b()
            goto L_0x01cc
        L_0x01bb:
            r6 = 2
            r13.f11219c = r6
            goto L_0x01cc
        L_0x01bf:
            r17 = r6
            r6 = 176(0xb0, float:2.47E-43)
            if (r7 != r6) goto L_0x01cc
            r9 = 1
            r13.f11219c = r9
            r13.f11218b = r9
            r7 = 176(0xb0, float:2.47E-43)
        L_0x01cc:
            byte[] r6 = androidx.media3.extractor.p172k.C3560m.f11217a
            r9 = 3
            r10 = 0
            r13.mo7472a(r6, r10, r9)
            goto L_0x01d6
        L_0x01d4:
            r17 = r6
        L_0x01d6:
            androidx.media3.extractor.k.n r6 = r0.f11237g
            r6.mo7474a(r4, r2, r5)
            androidx.media3.extractor.k.x r6 = r0.f11236f
            if (r8 <= 0) goto L_0x01e4
            r6.mo7480a(r4, r2, r5)
            r9 = 0
            goto L_0x01e5
        L_0x01e4:
            int r9 = -r8
        L_0x01e5:
            androidx.media3.extractor.k.x r2 = r0.f11236f
            boolean r2 = r2.mo7483d(r9)
            if (r2 == 0) goto L_0x020b
            androidx.media3.extractor.k.x r2 = r0.f11236f
            byte[] r6 = r2.f11359b
            int r2 = r2.f11360c
            int r2 = androidx.media3.extractor.C3347av.m9693b(r6, r2)
            androidx.media3.common.b.ac r6 = r0.f11233c
            int r8 = androidx.media3.common.p136b.C2612ak.f7249a
            androidx.media3.extractor.k.x r8 = r0.f11236f
            byte[] r8 = r8.f11359b
            r6.mo6157y(r8, r2)
            androidx.media3.extractor.k.au r2 = r0.f11232b
            long r8 = r0.f11242l
            androidx.media3.common.b.ac r6 = r0.f11233c
            r2.mo7464a(r8, r6)
        L_0x020b:
            r2 = 178(0xb2, float:2.5E-43)
            if (r7 != r2) goto L_0x0220
            byte[] r6 = r1.f7234a
            int r7 = r5 + 2
            byte r6 = r6[r7]
            r9 = 1
            if (r6 != r9) goto L_0x021d
            androidx.media3.extractor.k.x r6 = r0.f11236f
            r6.mo7482c(r2)
        L_0x021d:
            r7 = 178(0xb2, float:2.5E-43)
            goto L_0x0221
        L_0x0220:
            r9 = 1
        L_0x0221:
            int r2 = r3 - r5
            long r5 = r0.f11238h
            long r10 = (long) r2
            long r5 = r5 - r10
            androidx.media3.extractor.k.n r8 = r0.f11237g
            boolean r10 = r0.f11241k
            int r11 = r8.f11227e
            r12 = 182(0xb6, float:2.55E-43)
            if (r11 != r12) goto L_0x025a
            if (r10 == 0) goto L_0x025a
            boolean r10 = r8.f11224b
            if (r10 == 0) goto L_0x025a
            long r10 = r8.f11230h
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x025a
            long r13 = r8.f11229g
            boolean r15 = r8.f11226d
            androidx.media3.extractor.bf r9 = r8.f11223a
            long r13 = r5 - r13
            int r14 = (int) r13
            r24 = 0
            r18 = r9
            r19 = r10
            r21 = r15
            r22 = r14
            r23 = r2
            r18.mo6852d(r19, r21, r22, r23, r24)
        L_0x025a:
            int r2 = r8.f11227e
            r9 = 179(0xb3, float:2.51E-43)
            if (r2 == r9) goto L_0x0262
            r8.f11229g = r5
        L_0x0262:
            androidx.media3.extractor.k.n r2 = r0.f11237g
            long r5 = r0.f11242l
            r2.f11227e = r7
            r8 = 0
            r2.f11226d = r8
            if (r7 == r12) goto L_0x0276
            if (r7 != r9) goto L_0x0273
            r9 = 1
            r10 = 179(0xb3, float:2.51E-43)
            goto L_0x0278
        L_0x0273:
            r10 = r7
            r9 = 0
            goto L_0x0278
        L_0x0276:
            r10 = r7
            r9 = 1
        L_0x0278:
            r2.f11224b = r9
            if (r10 != r12) goto L_0x027e
            r12 = 1
            goto L_0x027f
        L_0x027e:
            r12 = 0
        L_0x027f:
            r2.f11225c = r12
            r2.f11228f = r8
            r2.f11230h = r5
            r2 = r17
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p172k.C3562o.mo7466a(androidx.media3.common.b.ac):void");
    }

    /* renamed from: b */
    public final void mo7467b(C3329ad adVar, C3545ar arVar) {
        arVar.mo7462a();
        arVar.mo7463b();
        this.f11239i = arVar.f11109b;
        arVar.mo7463b();
        this.f11240j = adVar.mo6987eZ(arVar.f11108a, 2);
        this.f11237g = new C3561n(this.f11240j);
        this.f11232b.mo7465b(adVar, arVar);
    }

    /* renamed from: c */
    public final void mo7468c() {
    }

    /* renamed from: d */
    public final void mo7469d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f11242l = j;
        }
    }

    /* renamed from: e */
    public final void mo7470e() {
        C3347av.m9695d(this.f11234d);
        this.f11235e.mo7473b();
        C3561n nVar = this.f11237g;
        if (nVar != null) {
            nVar.f11224b = false;
            nVar.f11225c = false;
            nVar.f11226d = false;
            nVar.f11227e = -1;
        }
        this.f11236f.mo7481b();
        this.f11238h = 0;
        this.f11242l = -9223372036854775807L;
    }

    public C3562o(C3548au auVar) {
        this.f11232b = auVar;
        this.f11234d = new boolean[4];
        this.f11235e = new C3560m();
        this.f11242l = -9223372036854775807L;
        this.f11236f = new C3571x(178);
        this.f11233c = new C2604ac();
    }
}
