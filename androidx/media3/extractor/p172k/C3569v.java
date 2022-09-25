package androidx.media3.extractor.p172k;

import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2603ab;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3324a;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3352b;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.k.v */
/* compiled from: PG */
public final class C3569v implements C3557j {

    /* renamed from: a */
    private final String f11325a;

    /* renamed from: b */
    private final C2604ac f11326b;

    /* renamed from: c */
    private final C2603ab f11327c;

    /* renamed from: d */
    private C3368bf f11328d;

    /* renamed from: e */
    private String f11329e;

    /* renamed from: f */
    private C2680x f11330f;

    /* renamed from: g */
    private int f11331g;

    /* renamed from: h */
    private int f11332h;

    /* renamed from: i */
    private int f11333i;

    /* renamed from: j */
    private int f11334j;

    /* renamed from: k */
    private long f11335k = -9223372036854775807L;

    /* renamed from: l */
    private boolean f11336l;

    /* renamed from: m */
    private int f11337m;

    /* renamed from: n */
    private int f11338n;

    /* renamed from: o */
    private int f11339o;

    /* renamed from: p */
    private boolean f11340p;

    /* renamed from: q */
    private long f11341q;

    /* renamed from: r */
    private int f11342r;

    /* renamed from: s */
    private long f11343s;

    /* renamed from: t */
    private int f11344t;

    /* renamed from: u */
    private String f11345u;

    public C3569v(String str) {
        this.f11325a = str;
        C2604ac acVar = new C2604ac(1024);
        this.f11326b = acVar;
        byte[] bArr = acVar.f7234a;
        this.f11327c = new C2603ab(bArr, bArr.length);
    }

    /* renamed from: f */
    private final int m10322f(C2603ab abVar) {
        int a = abVar.mo6116a();
        C3324a b = C3352b.m9712b(abVar, true);
        this.f11345u = b.f10032c;
        this.f11342r = b.f10030a;
        this.f11344t = b.f10031b;
        return a - abVar.mo6116a();
    }

    /* renamed from: g */
    private static long m10323g(C2603ab abVar) {
        return (long) abVar.mo6119d((abVar.mo6119d(2) + 1) * 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014b, code lost:
        if (r14.f11336l == false) goto L_0x01ae;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7466a(androidx.media3.common.p136b.C2604ac r15) {
        /*
            r14 = this;
            androidx.media3.extractor.bf r0 = r14.f11328d
            androidx.media3.common.p136b.C2601a.m6829a(r0)
        L_0x0005:
            int r0 = r15.f7236c
            int r1 = r15.f7235b
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x0209
            int r1 = r14.f11331g
            r2 = 86
            r3 = 1
            if (r1 == 0) goto L_0x01ff
            r4 = 2
            r5 = 0
            if (r1 == r3) goto L_0x01e9
            r2 = 3
            r6 = 8
            if (r1 == r4) goto L_0x01c3
            int r1 = r14.f11333i
            int r4 = r14.f11332h
            int r1 = r1 - r4
            int r0 = java.lang.Math.min(r0, r1)
            androidx.media3.common.b.ab r1 = r14.f11327c
            byte[] r1 = r1.f7230a
            int r4 = r14.f11332h
            r15.mo6155w(r1, r4, r0)
            int r1 = r14.f11332h
            int r1 = r1 + r0
            r14.f11332h = r1
            int r0 = r14.f11333i
            if (r1 != r0) goto L_0x0005
            androidx.media3.common.b.ab r0 = r14.f11327c
            r0.mo6124i(r5)
            androidx.media3.common.b.ab r0 = r14.f11327c
            boolean r1 = r0.mo6128m()
            r4 = 0
            if (r1 != 0) goto L_0x0149
            r14.f11336l = r3
            int r1 = r0.mo6119d(r3)
            if (r1 != r3) goto L_0x0053
            int r1 = r0.mo6119d(r3)
            r7 = 1
            goto L_0x0055
        L_0x0053:
            r7 = r1
            r1 = 0
        L_0x0055:
            r14.f11337m = r1
            if (r1 != 0) goto L_0x0144
            if (r7 != r3) goto L_0x005f
            m10323g(r0)
            r7 = 1
        L_0x005f:
            boolean r1 = r0.mo6128m()
            if (r1 == 0) goto L_0x013f
            r1 = 6
            int r8 = r0.mo6119d(r1)
            r14.f11338n = r8
            r8 = 4
            int r9 = r0.mo6119d(r8)
            int r10 = r0.mo6119d(r2)
            if (r9 != 0) goto L_0x013a
            if (r10 != 0) goto L_0x013a
            if (r7 != 0) goto L_0x00cf
            int r9 = r0.mo6118c()
            int r10 = r14.m10322f(r0)
            r0.mo6124i(r9)
            int r9 = r10 + 7
            int r9 = r9 / r6
            byte[] r9 = new byte[r9]
            r0.mo6129n(r9, r10)
            androidx.media3.common.w r10 = new androidx.media3.common.w
            r10.<init>()
            java.lang.String r11 = r14.f11329e
            r10.f7449a = r11
            java.lang.String r11 = "audio/mp4a-latm"
            r10.f7459k = r11
            java.lang.String r11 = r14.f11345u
            r10.f7456h = r11
            int r11 = r14.f11344t
            r10.f7472x = r11
            int r11 = r14.f11342r
            r10.f7473y = r11
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r10.f7461m = r9
            java.lang.String r9 = r14.f11325a
            r10.f7451c = r9
            androidx.media3.common.x r9 = new androidx.media3.common.x
            r9.<init>(r10)
            androidx.media3.common.x r10 = r14.f11330f
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x00dc
            r14.f11330f = r9
            int r10 = r9.f7478B
            long r10 = (long) r10
            r12 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r12 = r12 / r10
            r14.f11343s = r12
            androidx.media3.extractor.bf r10 = r14.f11328d
            r10.mo6850b(r9)
            goto L_0x00dc
        L_0x00cf:
            long r9 = m10323g(r0)
            int r10 = (int) r9
            int r9 = r14.m10322f(r0)
            int r10 = r10 - r9
            r0.mo6126k(r10)
        L_0x00dc:
            int r9 = r0.mo6119d(r2)
            r14.f11339o = r9
            if (r9 == 0) goto L_0x0107
            if (r9 == r3) goto L_0x0101
            if (r9 == r2) goto L_0x00fd
            if (r9 == r8) goto L_0x00fd
            r2 = 5
            if (r9 == r2) goto L_0x00fd
            if (r9 == r1) goto L_0x00f9
            r1 = 7
            if (r9 != r1) goto L_0x00f3
            goto L_0x00f9
        L_0x00f3:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L_0x00f9:
            r0.mo6126k(r3)
            goto L_0x010a
        L_0x00fd:
            r0.mo6126k(r1)
            goto L_0x010a
        L_0x0101:
            r1 = 9
            r0.mo6126k(r1)
            goto L_0x010a
        L_0x0107:
            r0.mo6126k(r6)
        L_0x010a:
            boolean r1 = r0.mo6128m()
            r14.f11340p = r1
            r8 = 0
            r14.f11341q = r8
            if (r1 == 0) goto L_0x0130
            if (r7 == r3) goto L_0x012a
        L_0x0118:
            boolean r1 = r0.mo6128m()
            long r2 = r14.f11341q
            long r2 = r2 << r6
            int r7 = r0.mo6119d(r6)
            long r7 = (long) r7
            long r2 = r2 + r7
            r14.f11341q = r2
            if (r1 != 0) goto L_0x0118
            goto L_0x0130
        L_0x012a:
            long r1 = m10323g(r0)
            r14.f11341q = r1
        L_0x0130:
            boolean r1 = r0.mo6128m()
            if (r1 == 0) goto L_0x014e
            r0.mo6126k(r6)
            goto L_0x014e
        L_0x013a:
            androidx.media3.common.az r15 = androidx.media3.common.C2599az.m6819a(r4, r4)
            throw r15
        L_0x013f:
            androidx.media3.common.az r15 = androidx.media3.common.C2599az.m6819a(r4, r4)
            throw r15
        L_0x0144:
            androidx.media3.common.az r15 = androidx.media3.common.C2599az.m6819a(r4, r4)
            throw r15
        L_0x0149:
            boolean r1 = r14.f11336l
            if (r1 != 0) goto L_0x014e
            goto L_0x01ae
        L_0x014e:
            int r1 = r14.f11337m
            if (r1 != 0) goto L_0x01be
            int r1 = r14.f11338n
            if (r1 != 0) goto L_0x01b9
            int r1 = r14.f11339o
            if (r1 != 0) goto L_0x01b4
            r1 = 0
        L_0x015b:
            int r2 = r0.mo6119d(r6)
            int r11 = r1 + r2
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x01b2
            int r1 = r0.mo6118c()
            r2 = r1 & 7
            if (r2 != 0) goto L_0x0175
            androidx.media3.common.b.ac r2 = r14.f11326b
            int r1 = r1 >> 3
            r2.mo6131A(r1)
            goto L_0x0183
        L_0x0175:
            androidx.media3.common.b.ac r1 = r14.f11326b
            byte[] r1 = r1.f7234a
            int r2 = r11 * 8
            r0.mo6129n(r1, r2)
            androidx.media3.common.b.ac r1 = r14.f11326b
            r1.mo6131A(r5)
        L_0x0183:
            androidx.media3.extractor.bf r1 = r14.f11328d
            androidx.media3.common.b.ac r2 = r14.f11326b
            r1.mo6851c(r2, r11)
            long r8 = r14.f11335k
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x01a4
            androidx.media3.extractor.bf r7 = r14.f11328d
            r10 = 1
            r12 = 0
            r13 = 0
            r7.mo6852d(r8, r10, r11, r12, r13)
            long r1 = r14.f11335k
            long r3 = r14.f11343s
            long r1 = r1 + r3
            r14.f11335k = r1
        L_0x01a4:
            boolean r1 = r14.f11340p
            if (r1 == 0) goto L_0x01ae
            long r1 = r14.f11341q
            int r2 = (int) r1
            r0.mo6126k(r2)
        L_0x01ae:
            r14.f11331g = r5
            goto L_0x0005
        L_0x01b2:
            r1 = r11
            goto L_0x015b
        L_0x01b4:
            androidx.media3.common.az r15 = androidx.media3.common.C2599az.m6819a(r4, r4)
            throw r15
        L_0x01b9:
            androidx.media3.common.az r15 = androidx.media3.common.C2599az.m6819a(r4, r4)
            throw r15
        L_0x01be:
            androidx.media3.common.az r15 = androidx.media3.common.C2599az.m6819a(r4, r4)
            throw r15
        L_0x01c3:
            int r0 = r14.f11334j
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r0 = r0 << r6
            int r1 = r15.mo6139g()
            r0 = r0 | r1
            r14.f11333i = r0
            androidx.media3.common.b.ac r1 = r14.f11326b
            byte[] r3 = r1.f7234a
            int r3 = r3.length
            if (r0 <= r3) goto L_0x01e3
            r1.mo6156x(r0)
            androidx.media3.common.b.ab r0 = r14.f11327c
            androidx.media3.common.b.ac r1 = r14.f11326b
            byte[] r1 = r1.f7234a
            int r3 = r1.length
            r0.mo6123h(r1, r3)
        L_0x01e3:
            r14.f11332h = r5
            r14.f11331g = r2
            goto L_0x0005
        L_0x01e9:
            int r0 = r15.mo6139g()
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r3 = 224(0xe0, float:3.14E-43)
            if (r1 != r3) goto L_0x01f9
            r14.f11334j = r0
            r14.f11331g = r4
            goto L_0x0005
        L_0x01f9:
            if (r0 == r2) goto L_0x0005
            r14.f11331g = r5
            goto L_0x0005
        L_0x01ff:
            int r0 = r15.mo6139g()
            if (r0 != r2) goto L_0x0005
            r14.f11331g = r3
            goto L_0x0005
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p172k.C3569v.mo7466a(androidx.media3.common.b.ac):void");
    }

    /* renamed from: b */
    public final void mo7467b(C3329ad adVar, C3545ar arVar) {
        arVar.mo7462a();
        arVar.mo7463b();
        this.f11328d = adVar.mo6987eZ(arVar.f11108a, 1);
        arVar.mo7463b();
        this.f11329e = arVar.f11109b;
    }

    /* renamed from: c */
    public final void mo7468c() {
    }

    /* renamed from: d */
    public final void mo7469d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f11335k = j;
        }
    }

    /* renamed from: e */
    public final void mo7470e() {
        this.f11331g = 0;
        this.f11335k = -9223372036854775807L;
        this.f11336l = false;
    }
}
