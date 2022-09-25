package androidx.media3.extractor.p172k;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2603ab;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.C3636z;
import java.util.Arrays;

/* renamed from: androidx.media3.extractor.k.f */
/* compiled from: PG */
public final class C3553f implements C3557j {

    /* renamed from: b */
    private static final byte[] f11154b = {73, 68, 51};

    /* renamed from: a */
    public long f11155a;

    /* renamed from: c */
    private final boolean f11156c;

    /* renamed from: d */
    private final C2603ab f11157d = new C2603ab(new byte[7], 7);

    /* renamed from: e */
    private final C2604ac f11158e = new C2604ac(Arrays.copyOf(f11154b, 10));

    /* renamed from: f */
    private final String f11159f;

    /* renamed from: g */
    private String f11160g;

    /* renamed from: h */
    private C3368bf f11161h;

    /* renamed from: i */
    private C3368bf f11162i;

    /* renamed from: j */
    private int f11163j;

    /* renamed from: k */
    private int f11164k;

    /* renamed from: l */
    private int f11165l;

    /* renamed from: m */
    private boolean f11166m;

    /* renamed from: n */
    private boolean f11167n;

    /* renamed from: o */
    private int f11168o;

    /* renamed from: p */
    private int f11169p;

    /* renamed from: q */
    private int f11170q;

    /* renamed from: r */
    private boolean f11171r;

    /* renamed from: s */
    private int f11172s;

    /* renamed from: t */
    private long f11173t;

    /* renamed from: u */
    private C3368bf f11174u;

    /* renamed from: v */
    private long f11175v;

    public C3553f(boolean z, String str) {
        m10254h();
        this.f11168o = -1;
        this.f11169p = -1;
        this.f11155a = -9223372036854775807L;
        this.f11173t = -9223372036854775807L;
        this.f11156c = z;
        this.f11159f = str;
    }

    /* renamed from: f */
    public static boolean m10252f(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: g */
    private final void m10253g() {
        this.f11167n = false;
        m10254h();
    }

    /* renamed from: h */
    private final void m10254h() {
        this.f11163j = 0;
        this.f11164k = 0;
        this.f11165l = 256;
    }

    /* renamed from: i */
    private final void m10255i() {
        this.f11163j = 3;
        this.f11164k = 0;
    }

    /* renamed from: j */
    private final void m10256j(C3368bf bfVar, long j, int i, int i2) {
        this.f11163j = 4;
        this.f11164k = i;
        this.f11174u = bfVar;
        this.f11175v = j;
        this.f11172s = i2;
    }

    /* renamed from: k */
    private final boolean m10257k(C2604ac acVar, byte[] bArr, int i) {
        int min = Math.min(acVar.f7236c - acVar.f7235b, i - this.f11164k);
        acVar.mo6155w(bArr, this.f11164k, min);
        int i2 = this.f11164k + min;
        this.f11164k = i2;
        return i2 == i;
    }

    /* renamed from: l */
    private static final boolean m10258l(byte b) {
        return m10252f((b & 255) | 65280);
    }

    /* renamed from: m */
    private static final boolean m10259m(C2604ac acVar, byte[] bArr, int i) {
        if (acVar.f7236c - acVar.f7235b < i) {
            return false;
        }
        acVar.mo6155w(bArr, 0, i);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0228, code lost:
        r6.f11170q = (r1 & 8) >> 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0230, code lost:
        if (1 == ((r1 & 1) ^ 1)) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0232, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0234, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0235, code lost:
        r6.f11166m = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0239, code lost:
        if (r6.f11167n != false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x023b, code lost:
        r6.f11163j = 1;
        r6.f11164k = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0241, code lost:
        m10255i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0244, code lost:
        r7.mo6131A(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7466a(androidx.media3.common.p136b.C2604ac r17) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            androidx.media3.extractor.bf r0 = r6.f11161h
            r0.getClass()
            int r0 = androidx.media3.common.p136b.C2612ak.f7249a
        L_0x000b:
            int r0 = r7.f7236c
            int r1 = r7.f7235b
            int r2 = r0 - r1
            if (r2 <= 0) goto L_0x0298
            int r3 = r6.f11163j
            r4 = 13
            r5 = 7
            r8 = -1
            r9 = 4
            r10 = 3
            r11 = 0
            r12 = 2
            r13 = 1
            if (r3 == 0) goto L_0x0178
            if (r3 == r13) goto L_0x0149
            r0 = 10
            if (r3 == r12) goto L_0x011e
            if (r3 == r10) goto L_0x005d
            int r0 = r6.f11172s
            int r1 = r6.f11164k
            int r0 = r0 - r1
            int r0 = java.lang.Math.min(r2, r0)
            androidx.media3.extractor.bf r1 = r6.f11174u
            r1.mo6851c(r7, r0)
            int r1 = r6.f11164k
            int r1 = r1 + r0
            r6.f11164k = r1
            int r12 = r6.f11172s
            if (r1 != r12) goto L_0x000b
            long r9 = r6.f11173t
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0059
            androidx.media3.extractor.bf r8 = r6.f11174u
            r11 = 1
            r13 = 0
            r14 = 0
            r8.mo6852d(r9, r11, r12, r13, r14)
            long r0 = r6.f11173t
            long r2 = r6.f11175v
            long r0 = r0 + r2
            r6.f11173t = r0
        L_0x0059:
            r16.m10254h()
            goto L_0x000b
        L_0x005d:
            boolean r1 = r6.f11166m
            r2 = 5
            if (r13 == r1) goto L_0x0064
            r1 = 5
            goto L_0x0065
        L_0x0064:
            r1 = 7
        L_0x0065:
            androidx.media3.common.b.ab r3 = r6.f11157d
            byte[] r3 = r3.f7230a
            boolean r1 = r6.m10257k(r7, r3, r1)
            if (r1 == 0) goto L_0x000b
            androidx.media3.common.b.ab r1 = r6.f11157d
            r1.mo6124i(r11)
            boolean r1 = r6.f11171r
            if (r1 != 0) goto L_0x00f9
            androidx.media3.common.b.ab r0 = r6.f11157d
            int r0 = r0.mo6119d(r12)
            int r0 = r0 + r13
            if (r0 == r12) goto L_0x0099
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Detected audio object type: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = ", but assuming AAC LC."
            r1.append(r0)
            java.lang.String r0 = "AdtsReader"
            java.lang.String r1 = r1.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r0, r1)
        L_0x0099:
            androidx.media3.common.b.ab r0 = r6.f11157d
            r0.mo6126k(r2)
            androidx.media3.common.b.ab r0 = r6.f11157d
            int r0 = r0.mo6119d(r10)
            int r1 = r6.f11169p
            int r2 = androidx.media3.extractor.C3352b.f10125a
            byte[] r2 = new byte[r12]
            int r3 = r1 >> 1
            r3 = r3 & r5
            r3 = r3 | 16
            byte r3 = (byte) r3
            r2[r11] = r3
            int r1 = r1 << r5
            r1 = r1 & 128(0x80, float:1.794E-43)
            int r0 = r0 << r10
            r0 = r0 & 120(0x78, float:1.68E-43)
            r0 = r0 | r1
            byte r0 = (byte) r0
            r2[r13] = r0
            androidx.media3.extractor.a r0 = androidx.media3.extractor.C3352b.m9711a(r2)
            androidx.media3.common.w r1 = new androidx.media3.common.w
            r1.<init>()
            java.lang.String r3 = r6.f11160g
            r1.f7449a = r3
            java.lang.String r3 = "audio/mp4a-latm"
            r1.f7459k = r3
            java.lang.String r3 = r0.f10032c
            r1.f7456h = r3
            int r3 = r0.f10031b
            r1.f7472x = r3
            int r0 = r0.f10030a
            r1.f7473y = r0
            java.util.List r0 = java.util.Collections.singletonList(r2)
            r1.f7461m = r0
            java.lang.String r0 = r6.f11159f
            r1.f7451c = r0
            androidx.media3.common.x r0 = new androidx.media3.common.x
            r0.<init>(r1)
            int r1 = r0.f7478B
            long r1 = (long) r1
            r10 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r10 = r10 / r1
            r6.f11155a = r10
            androidx.media3.extractor.bf r1 = r6.f11161h
            r1.mo6850b(r0)
            r6.f11171r = r13
            goto L_0x00fe
        L_0x00f9:
            androidx.media3.common.b.ab r1 = r6.f11157d
            r1.mo6126k(r0)
        L_0x00fe:
            androidx.media3.common.b.ab r0 = r6.f11157d
            r0.mo6126k(r9)
            androidx.media3.common.b.ab r0 = r6.f11157d
            int r0 = r0.mo6119d(r4)
            int r0 = r0 + -7
            boolean r1 = r6.f11166m
            if (r1 == 0) goto L_0x0111
            int r0 = r0 + -2
        L_0x0111:
            r5 = r0
            androidx.media3.extractor.bf r1 = r6.f11161h
            long r2 = r6.f11155a
            r4 = 0
            r0 = r16
            r0.m10256j(r1, r2, r4, r5)
            goto L_0x000b
        L_0x011e:
            androidx.media3.common.b.ac r1 = r6.f11158e
            byte[] r1 = r1.f7234a
            boolean r1 = r6.m10257k(r7, r1, r0)
            if (r1 == 0) goto L_0x000b
            androidx.media3.extractor.bf r1 = r6.f11162i
            androidx.media3.common.b.ac r2 = r6.f11158e
            r1.mo6851c(r2, r0)
            androidx.media3.common.b.ac r1 = r6.f11158e
            r2 = 6
            r1.mo6131A(r2)
            androidx.media3.extractor.bf r1 = r6.f11162i
            r2 = 0
            r4 = 10
            androidx.media3.common.b.ac r5 = r6.f11158e
            int r5 = r5.mo6138f()
            int r5 = r5 + r0
            r0 = r16
            r0.m10256j(r1, r2, r4, r5)
            goto L_0x000b
        L_0x0149:
            androidx.media3.common.b.ab r0 = r6.f11157d
            byte[] r2 = r0.f7230a
            byte[] r3 = r7.f7234a
            byte r1 = r3[r1]
            r2[r11] = r1
            r0.mo6124i(r12)
            androidx.media3.common.b.ab r0 = r6.f11157d
            int r0 = r0.mo6119d(r9)
            int r1 = r6.f11169p
            if (r1 == r8) goto L_0x0167
            if (r0 == r1) goto L_0x0167
            r16.m10253g()
            goto L_0x000b
        L_0x0167:
            boolean r1 = r6.f11167n
            if (r1 != 0) goto L_0x0173
            r6.f11167n = r13
            int r1 = r6.f11170q
            r6.f11168o = r1
            r6.f11169p = r0
        L_0x0173:
            r16.m10255i()
            goto L_0x000b
        L_0x0178:
            byte[] r2 = r7.f7234a
        L_0x017a:
            if (r1 >= r0) goto L_0x0293
            int r3 = r1 + 1
            byte r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r14 = r6.f11165l
            r15 = 512(0x200, float:7.175E-43)
            if (r14 != r15) goto L_0x0249
            byte r14 = (byte) r1
            boolean r14 = m10258l(r14)
            if (r14 == 0) goto L_0x0249
            boolean r14 = r6.f11167n
            if (r14 != 0) goto L_0x0228
            int r14 = r3 + -2
            int r15 = r14 + 1
            r7.mo6131A(r15)
            androidx.media3.common.b.ab r15 = r6.f11157d
            byte[] r15 = r15.f7230a
            boolean r15 = m10259m(r7, r15, r13)
            if (r15 != 0) goto L_0x01a6
            goto L_0x0249
        L_0x01a6:
            androidx.media3.common.b.ab r15 = r6.f11157d
            r15.mo6124i(r9)
            androidx.media3.common.b.ab r15 = r6.f11157d
            int r15 = r15.mo6119d(r13)
            int r11 = r6.f11168o
            if (r11 == r8) goto L_0x01b7
            if (r15 != r11) goto L_0x0249
        L_0x01b7:
            int r11 = r6.f11169p
            if (r11 == r8) goto L_0x01da
            androidx.media3.common.b.ab r11 = r6.f11157d
            byte[] r11 = r11.f7230a
            boolean r11 = m10259m(r7, r11, r13)
            if (r11 != 0) goto L_0x01c6
            goto L_0x0228
        L_0x01c6:
            androidx.media3.common.b.ab r11 = r6.f11157d
            r11.mo6124i(r12)
            androidx.media3.common.b.ab r11 = r6.f11157d
            int r11 = r11.mo6119d(r9)
            int r12 = r6.f11169p
            if (r11 != r12) goto L_0x0249
            int r11 = r14 + 2
            r7.mo6131A(r11)
        L_0x01da:
            androidx.media3.common.b.ab r11 = r6.f11157d
            byte[] r11 = r11.f7230a
            boolean r11 = m10259m(r7, r11, r9)
            if (r11 == 0) goto L_0x0228
            androidx.media3.common.b.ab r11 = r6.f11157d
            r12 = 14
            r11.mo6124i(r12)
            androidx.media3.common.b.ab r11 = r6.f11157d
            int r11 = r11.mo6119d(r4)
            if (r11 < r5) goto L_0x0249
            byte[] r12 = r7.f7234a
            int r4 = r7.f7236c
            int r14 = r14 + r11
            if (r14 >= r4) goto L_0x0228
            byte r11 = r12[r14]
            if (r11 != r8) goto L_0x0210
            int r14 = r14 + 1
            if (r14 == r4) goto L_0x0228
            byte r4 = r12[r14]
            boolean r11 = m10258l(r4)
            if (r11 == 0) goto L_0x0249
            r4 = r4 & 8
            int r4 = r4 >> r10
            if (r4 != r15) goto L_0x0249
            goto L_0x0228
        L_0x0210:
            r15 = 73
            if (r11 != r15) goto L_0x0249
            int r11 = r14 + 1
            if (r11 == r4) goto L_0x0228
            byte r11 = r12[r11]
            r15 = 68
            if (r11 != r15) goto L_0x0249
            int r14 = r14 + 2
            if (r14 == r4) goto L_0x0228
            byte r4 = r12[r14]
            r11 = 51
            if (r4 != r11) goto L_0x0249
        L_0x0228:
            r0 = r1 & 8
            int r0 = r0 >> r10
            r6.f11170q = r0
            r0 = r1 & 1
            r0 = r0 ^ r13
            if (r13 == r0) goto L_0x0234
            r0 = 0
            goto L_0x0235
        L_0x0234:
            r0 = 1
        L_0x0235:
            r6.f11166m = r0
            boolean r0 = r6.f11167n
            if (r0 != 0) goto L_0x0241
            r6.f11163j = r13
            r0 = 0
            r6.f11164k = r0
            goto L_0x0244
        L_0x0241:
            r16.m10255i()
        L_0x0244:
            r7.mo6131A(r3)
            goto L_0x000b
        L_0x0249:
            int r4 = r6.f11165l
            r1 = r1 | r4
            r11 = 329(0x149, float:4.61E-43)
            if (r1 == r11) goto L_0x0287
            r11 = 511(0x1ff, float:7.16E-43)
            if (r1 == r11) goto L_0x0282
            r11 = 836(0x344, float:1.171E-42)
            if (r1 == r11) goto L_0x027d
            r11 = 1075(0x433, float:1.506E-42)
            if (r1 == r11) goto L_0x026b
            r1 = 256(0x100, float:3.59E-43)
            if (r4 == r1) goto L_0x0268
            r6.f11165l = r1
            int r1 = r3 + -1
            r4 = 13
            r11 = 0
            goto L_0x0290
        L_0x0268:
            r4 = 2
            r11 = 0
            goto L_0x028d
        L_0x026b:
            r4 = 2
            r6.f11163j = r4
            r6.f11164k = r10
            r11 = 0
            r6.f11172s = r11
            androidx.media3.common.b.ac r0 = r6.f11158e
            r0.mo6131A(r11)
            r7.mo6131A(r3)
            goto L_0x000b
        L_0x027d:
            r4 = 2
            r11 = 0
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x028b
        L_0x0282:
            r1 = 512(0x200, float:7.175E-43)
            r4 = 2
            r11 = 0
            goto L_0x028b
        L_0x0287:
            r4 = 2
            r11 = 0
            r1 = 768(0x300, float:1.076E-42)
        L_0x028b:
            r6.f11165l = r1
        L_0x028d:
            r1 = r3
            r4 = 13
        L_0x0290:
            r12 = 2
            goto L_0x017a
        L_0x0293:
            r7.mo6131A(r1)
            goto L_0x000b
        L_0x0298:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p172k.C3553f.mo7466a(androidx.media3.common.b.ac):void");
    }

    /* renamed from: b */
    public final void mo7467b(C3329ad adVar, C3545ar arVar) {
        arVar.mo7462a();
        arVar.mo7463b();
        this.f11160g = arVar.f11109b;
        arVar.mo7463b();
        C3368bf eZ = adVar.mo6987eZ(arVar.f11108a, 1);
        this.f11161h = eZ;
        this.f11174u = eZ;
        if (this.f11156c) {
            arVar.mo7462a();
            arVar.mo7463b();
            C3368bf eZ2 = adVar.mo6987eZ(arVar.f11108a, 5);
            this.f11162i = eZ2;
            C2679w wVar = new C2679w();
            arVar.mo7463b();
            wVar.f7449a = arVar.f11109b;
            wVar.f7459k = "application/id3";
            eZ2.mo6850b(new C2680x(wVar));
            return;
        }
        this.f11162i = new C3636z();
    }

    /* renamed from: c */
    public final void mo7468c() {
    }

    /* renamed from: d */
    public final void mo7469d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f11173t = j;
        }
    }

    /* renamed from: e */
    public final void mo7470e() {
        this.f11173t = -9223372036854775807L;
        m10253g();
    }
}
