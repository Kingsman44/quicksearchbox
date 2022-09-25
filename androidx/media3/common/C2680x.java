package androidx.media3.common;

import androidx.media3.common.p136b.C2612ak;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.common.x */
/* compiled from: PG */
public final class C2680x implements C2668l {

    /* renamed from: a */
    public static final C2680x f7475a = new C2680x(new C2679w());

    /* renamed from: b */
    public static final C2667k f7476b = C2678v.f7444a;

    /* renamed from: A */
    public final int f7477A;

    /* renamed from: B */
    public final int f7478B;

    /* renamed from: C */
    public final int f7479C;

    /* renamed from: D */
    public final int f7480D;

    /* renamed from: E */
    public final int f7481E;

    /* renamed from: F */
    public final int f7482F;

    /* renamed from: G */
    public final int f7483G;

    /* renamed from: H */
    private int f7484H;

    /* renamed from: c */
    public final String f7485c;

    /* renamed from: d */
    public final String f7486d;

    /* renamed from: e */
    public final String f7487e;

    /* renamed from: f */
    public final int f7488f;

    /* renamed from: g */
    public final int f7489g;

    /* renamed from: h */
    public final int f7490h;

    /* renamed from: i */
    public final int f7491i;

    /* renamed from: j */
    public final int f7492j;

    /* renamed from: k */
    public final String f7493k;

    /* renamed from: l */
    public final Metadata f7494l;

    /* renamed from: m */
    public final String f7495m;

    /* renamed from: n */
    public final String f7496n;

    /* renamed from: o */
    public final int f7497o;

    /* renamed from: p */
    public final List f7498p;

    /* renamed from: q */
    public final DrmInitData f7499q;

    /* renamed from: r */
    public final long f7500r;

    /* renamed from: s */
    public final int f7501s;

    /* renamed from: t */
    public final int f7502t;

    /* renamed from: u */
    public final float f7503u;

    /* renamed from: v */
    public final int f7504v;

    /* renamed from: w */
    public final float f7505w;

    /* renamed from: x */
    public final byte[] f7506x;

    /* renamed from: y */
    public final int f7507y;

    /* renamed from: z */
    public final C2670n f7508z;

    public C2680x(C2679w wVar) {
        this.f7485c = wVar.f7449a;
        this.f7486d = wVar.f7450b;
        this.f7487e = C2612ak.m6938U(wVar.f7451c);
        this.f7488f = wVar.f7452d;
        this.f7489g = wVar.f7453e;
        int i = wVar.f7454f;
        this.f7490h = i;
        int i2 = wVar.f7455g;
        this.f7491i = i2;
        this.f7492j = i2 != -1 ? i2 : i;
        this.f7493k = wVar.f7456h;
        this.f7494l = wVar.f7457i;
        this.f7495m = wVar.f7458j;
        this.f7496n = wVar.f7459k;
        this.f7497o = wVar.f7460l;
        List list = wVar.f7461m;
        this.f7498p = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData = wVar.f7462n;
        this.f7499q = drmInitData;
        this.f7500r = wVar.f7463o;
        this.f7501s = wVar.f7464p;
        this.f7502t = wVar.f7465q;
        this.f7503u = wVar.f7466r;
        int i3 = wVar.f7467s;
        int i4 = 0;
        this.f7504v = i3 == -1 ? 0 : i3;
        float f = wVar.f7468t;
        this.f7505w = f == -1.0f ? 1.0f : f;
        this.f7506x = wVar.f7469u;
        this.f7507y = wVar.f7470v;
        this.f7508z = wVar.f7471w;
        this.f7477A = wVar.f7472x;
        this.f7478B = wVar.f7473y;
        this.f7479C = wVar.f7474z;
        int i5 = wVar.f7445A;
        this.f7480D = i5 == -1 ? 0 : i5;
        int i6 = wVar.f7446B;
        this.f7481E = i6 == -1 ? 0 : i6;
        this.f7482F = wVar.f7447C;
        int i7 = wVar.f7448D;
        if (i7 != 0) {
            i4 = i7;
        } else if (drmInitData != null) {
            this.f7483G = 1;
            return;
        }
        this.f7483G = i4;
    }

    /* renamed from: a */
    public final int mo6356a() {
        int i;
        int i2 = this.f7501s;
        if (i2 == -1 || (i = this.f7502t) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* renamed from: b */
    public final C2680x mo6357b(int i) {
        C2679w wVar = new C2679w(this);
        wVar.f7448D = i;
        return new C2680x(wVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f5  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.common.C2680x mo6358c(androidx.media3.common.C2680x r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            if (r0 != r1) goto L_0x0007
            return r0
        L_0x0007:
            java.lang.String r2 = r0.f7496n
            int r2 = androidx.media3.common.C2598ay.m6803b(r2)
            java.lang.String r3 = r1.f7485c
            java.lang.String r4 = r1.f7486d
            if (r4 != 0) goto L_0x0015
            java.lang.String r4 = r0.f7486d
        L_0x0015:
            java.lang.String r5 = r0.f7487e
            r6 = 3
            r7 = 1
            if (r2 == r6) goto L_0x001e
            if (r2 != r7) goto L_0x0023
            r2 = 1
        L_0x001e:
            java.lang.String r6 = r1.f7487e
            if (r6 == 0) goto L_0x0023
            r5 = r6
        L_0x0023:
            int r6 = r0.f7490h
            r8 = -1
            if (r6 != r8) goto L_0x002a
            int r6 = r1.f7490h
        L_0x002a:
            int r9 = r0.f7491i
            if (r9 != r8) goto L_0x0030
            int r9 = r1.f7491i
        L_0x0030:
            java.lang.String r8 = r0.f7493k
            if (r8 != 0) goto L_0x0042
            java.lang.String r10 = r1.f7493k
            java.lang.String r10 = androidx.media3.common.p136b.C2612ak.m6931N(r10, r2)
            java.lang.String[] r11 = androidx.media3.common.p136b.C2612ak.m6969as(r10)
            int r11 = r11.length
            if (r11 != r7) goto L_0x0042
            r8 = r10
        L_0x0042:
            androidx.media3.common.Metadata r7 = r0.f7494l
            if (r7 != 0) goto L_0x0049
            androidx.media3.common.Metadata r7 = r1.f7494l
            goto L_0x004f
        L_0x0049:
            androidx.media3.common.Metadata r10 = r1.f7494l
            androidx.media3.common.Metadata r7 = r7.mo6060b(r10)
        L_0x004f:
            float r10 = r0.f7503u
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x005c
            r11 = 2
            if (r2 != r11) goto L_0x005c
            float r10 = r1.f7503u
        L_0x005c:
            int r2 = r0.f7488f
            int r11 = r1.f7488f
            r2 = r2 | r11
            int r11 = r0.f7489g
            int r12 = r1.f7489g
            r11 = r11 | r12
            androidx.media3.common.DrmInitData r1 = r1.f7499q
            androidx.media3.common.DrmInitData r12 = r0.f7499q
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            if (r1 == 0) goto L_0x0090
            java.lang.String r14 = r1.f7048b
            androidx.media3.common.DrmInitData$SchemeData[] r1 = r1.f7047a
            int r15 = r1.length
            r16 = r14
            r14 = 0
        L_0x0079:
            if (r14 >= r15) goto L_0x008d
            r17 = r15
            r15 = r1[r14]
            boolean r18 = r15.mo6054a()
            if (r18 == 0) goto L_0x0088
            r13.add(r15)
        L_0x0088:
            int r14 = r14 + 1
            r15 = r17
            goto L_0x0079
        L_0x008d:
            r14 = r16
            goto L_0x0091
        L_0x0090:
            r14 = 0
        L_0x0091:
            if (r12 == 0) goto L_0x00eb
            if (r14 != 0) goto L_0x0098
            java.lang.String r1 = r12.f7048b
            r14 = r1
        L_0x0098:
            int r1 = r13.size()
            androidx.media3.common.DrmInitData$SchemeData[] r12 = r12.f7047a
            int r15 = r12.length
            r16 = r14
            r14 = 0
        L_0x00a2:
            if (r14 >= r15) goto L_0x00e6
            r17 = r15
            r15 = r12[r14]
            boolean r18 = r15.mo6054a()
            if (r18 == 0) goto L_0x00d5
            r18 = r12
            java.util.UUID r12 = r15.f7051a
            r19 = r10
            r10 = 0
        L_0x00b5:
            if (r10 >= r1) goto L_0x00cf
            java.lang.Object r20 = r13.get(r10)
            r21 = r1
            r1 = r20
            androidx.media3.common.DrmInitData$SchemeData r1 = (androidx.media3.common.DrmInitData.SchemeData) r1
            java.util.UUID r1 = r1.f7051a
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00ca
            goto L_0x00db
        L_0x00ca:
            int r10 = r10 + 1
            r1 = r21
            goto L_0x00b5
        L_0x00cf:
            r21 = r1
            r13.add(r15)
            goto L_0x00db
        L_0x00d5:
            r21 = r1
            r19 = r10
            r18 = r12
        L_0x00db:
            int r14 = r14 + 1
            r15 = r17
            r12 = r18
            r10 = r19
            r1 = r21
            goto L_0x00a2
        L_0x00e6:
            r19 = r10
            r14 = r16
            goto L_0x00ed
        L_0x00eb:
            r19 = r10
        L_0x00ed:
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L_0x00f5
            r14 = 0
            goto L_0x00fb
        L_0x00f5:
            androidx.media3.common.DrmInitData r1 = new androidx.media3.common.DrmInitData
            r1.<init>(r14, r13)
            r14 = r1
        L_0x00fb:
            androidx.media3.common.w r1 = new androidx.media3.common.w
            r1.<init>(r0)
            r1.f7449a = r3
            r1.f7450b = r4
            r1.f7451c = r5
            r1.f7452d = r2
            r1.f7453e = r11
            r1.f7454f = r6
            r1.f7455g = r9
            r1.f7456h = r8
            r1.f7457i = r7
            r1.f7462n = r14
            r10 = r19
            r1.f7466r = r10
            androidx.media3.common.x r2 = new androidx.media3.common.x
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.C2680x.mo6358c(androidx.media3.common.x):androidx.media3.common.x");
    }

    /* renamed from: d */
    public final boolean mo6359d(C2680x xVar) {
        if (this.f7498p.size() != xVar.f7498p.size()) {
            return false;
        }
        for (int i = 0; i < this.f7498p.size(); i++) {
            if (!Arrays.equals((byte[]) this.f7498p.get(i), (byte[]) xVar.f7498p.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2680x xVar = (C2680x) obj;
            int i2 = this.f7484H;
            if ((i2 == 0 || (i = xVar.f7484H) == 0 || i2 == i) && this.f7488f == xVar.f7488f && this.f7489g == xVar.f7489g && this.f7490h == xVar.f7490h && this.f7491i == xVar.f7491i && this.f7497o == xVar.f7497o && this.f7500r == xVar.f7500r && this.f7501s == xVar.f7501s && this.f7502t == xVar.f7502t && this.f7504v == xVar.f7504v && this.f7507y == xVar.f7507y && this.f7477A == xVar.f7477A && this.f7478B == xVar.f7478B && this.f7479C == xVar.f7479C && this.f7480D == xVar.f7480D && this.f7481E == xVar.f7481E && this.f7482F == xVar.f7482F && this.f7483G == xVar.f7483G && Float.compare(this.f7503u, xVar.f7503u) == 0 && Float.compare(this.f7505w, xVar.f7505w) == 0 && C2612ak.m6951aa(this.f7485c, xVar.f7485c) && C2612ak.m6951aa(this.f7486d, xVar.f7486d) && C2612ak.m6951aa(this.f7493k, xVar.f7493k) && C2612ak.m6951aa(this.f7495m, xVar.f7495m) && C2612ak.m6951aa(this.f7496n, xVar.f7496n) && C2612ak.m6951aa(this.f7487e, xVar.f7487e) && Arrays.equals(this.f7506x, xVar.f7506x) && C2612ak.m6951aa(this.f7494l, xVar.f7494l) && C2612ak.m6951aa(this.f7508z, xVar.f7508z) && C2612ak.m6951aa(this.f7499q, xVar.f7499q) && mo6359d(xVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f7485c;
        String str2 = this.f7486d;
        String str3 = this.f7495m;
        String str4 = this.f7496n;
        String str5 = this.f7493k;
        int i = this.f7492j;
        String str6 = this.f7487e;
        int i2 = this.f7501s;
        int i3 = this.f7502t;
        float f = this.f7503u;
        int i4 = this.f7477A;
        int i5 = this.f7478B;
        return "Format(" + str + ", " + str2 + ", " + str3 + ", " + str4 + ", " + str5 + ", " + i + ", " + str6 + ", [" + i2 + ", " + i3 + ", " + f + "], [" + i4 + ", " + i5 + "])";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.f7484H;
        if (i6 != 0) {
            return i6;
        }
        String str = this.f7485c;
        int i7 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i8 = (i + 527) * 31;
        String str2 = this.f7486d;
        int hashCode = (i8 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7487e;
        if (str3 == null) {
            i2 = 0;
        } else {
            i2 = str3.hashCode();
        }
        int i9 = (((((((((hashCode + i2) * 31) + this.f7488f) * 31) + this.f7489g) * 31) + this.f7490h) * 31) + this.f7491i) * 31;
        String str4 = this.f7493k;
        if (str4 == null) {
            i3 = 0;
        } else {
            i3 = str4.hashCode();
        }
        int i10 = (i9 + i3) * 31;
        Metadata metadata = this.f7494l;
        if (metadata == null) {
            i4 = 0;
        } else {
            i4 = metadata.hashCode();
        }
        int i11 = (i10 + i4) * 31;
        String str5 = this.f7495m;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i12 = (i11 + i5) * 31;
        String str6 = this.f7496n;
        if (str6 != null) {
            i7 = str6.hashCode();
        }
        int floatToIntBits = ((((((((((((((((((((((((((((((i12 + i7) * 31) + this.f7497o) * 31) + ((int) this.f7500r)) * 31) + this.f7501s) * 31) + this.f7502t) * 31) + Float.floatToIntBits(this.f7503u)) * 31) + this.f7504v) * 31) + Float.floatToIntBits(this.f7505w)) * 31) + this.f7507y) * 31) + this.f7477A) * 31) + this.f7478B) * 31) + this.f7479C) * 31) + this.f7480D) * 31) + this.f7481E) * 31) + this.f7482F) * 31) + this.f7483G;
        this.f7484H = floatToIntBits;
        return floatToIntBits;
    }
}
