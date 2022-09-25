package androidx.media3.exoplayer.p145h;

import android.util.SparseArray;
import androidx.media3.common.C2598ay;
import androidx.media3.common.C2671o;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2874cc;
import androidx.media3.exoplayer.p139c.C2862e;
import androidx.media3.exoplayer.p139c.C2867j;
import androidx.media3.exoplayer.p139c.C2868k;
import androidx.media3.exoplayer.p139c.C2869l;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;
import java.io.EOFException;

/* renamed from: androidx.media3.exoplayer.h.ce */
/* compiled from: PG */
public class C3094ce implements C3368bf {

    /* renamed from: A */
    private C2680x f9033A;

    /* renamed from: B */
    private C2680x f9034B;

    /* renamed from: C */
    private boolean f9035C;

    /* renamed from: D */
    private boolean f9036D;

    /* renamed from: E */
    private long f9037E;

    /* renamed from: F */
    private C2869l f9038F;

    /* renamed from: a */
    private final C3091cb f9039a = new C3091cb();

    /* renamed from: b */
    public final C3090ca f9040b;

    /* renamed from: c */
    public C3093cd f9041c;

    /* renamed from: d */
    public int f9042d;

    /* renamed from: e */
    public int f9043e;

    /* renamed from: f */
    public int f9044f;

    /* renamed from: g */
    public long f9045g = Long.MIN_VALUE;

    /* renamed from: h */
    public boolean f9046h;

    /* renamed from: i */
    public int f9047i;

    /* renamed from: j */
    public boolean f9048j;

    /* renamed from: k */
    private final C3106cq f9049k = new C3106cq((byte[]) null);

    /* renamed from: l */
    private final C2868k f9050l;

    /* renamed from: m */
    private C2680x f9051m;

    /* renamed from: n */
    private int f9052n = 1000;

    /* renamed from: o */
    private int[] f9053o = new int[1000];

    /* renamed from: p */
    private long[] f9054p = new long[1000];

    /* renamed from: q */
    private int[] f9055q = new int[1000];

    /* renamed from: r */
    private int[] f9056r = new int[1000];

    /* renamed from: s */
    private long[] f9057s = new long[1000];

    /* renamed from: t */
    private C3367be[] f9058t = new C3367be[1000];

    /* renamed from: u */
    private int f9059u;

    /* renamed from: v */
    private long f9060v = Long.MIN_VALUE;

    /* renamed from: w */
    private long f9061w = Long.MIN_VALUE;

    /* renamed from: x */
    private boolean f9062x;

    /* renamed from: y */
    private boolean f9063y = true;

    /* renamed from: z */
    private boolean f9064z = true;

    public C3094ce(C3241g gVar, C2868k kVar) {
        this.f9050l = kVar;
        this.f9040b = new C3090ca(gVar);
    }

    /* renamed from: E */
    private final int m8932E(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f9057s[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.f9056r[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f9052n) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: F */
    private final int m8933F(int i) {
        int i2 = this.f9059u + i;
        int i3 = this.f9052n;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        return -3;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized int m8934G(androidx.media3.exoplayer.C2874cc r7, androidx.media3.p134c.C2529g r8, boolean r9, boolean r10, androidx.media3.exoplayer.p145h.C3091cb r11) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            r8.f6956d = r0     // Catch:{ all -> 0x0081 }
            boolean r0 = r6.m8944Q()     // Catch:{ all -> 0x0081 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x002a
            if (r10 != 0) goto L_0x0025
            boolean r10 = r6.f9062x     // Catch:{ all -> 0x0081 }
            if (r10 == 0) goto L_0x0014
            goto L_0x0025
        L_0x0014:
            androidx.media3.common.x r8 = r6.f9034B     // Catch:{ all -> 0x0081 }
            if (r8 == 0) goto L_0x0023
            if (r9 != 0) goto L_0x001e
            androidx.media3.common.x r9 = r6.f9051m     // Catch:{ all -> 0x0081 }
            if (r8 == r9) goto L_0x0023
        L_0x001e:
            r6.m8941N(r8, r7)     // Catch:{ all -> 0x0081 }
            monitor-exit(r6)
            return r1
        L_0x0023:
            monitor-exit(r6)
            return r2
        L_0x0025:
            r7 = 4
            r8.f6941a = r7     // Catch:{ all -> 0x0081 }
            monitor-exit(r6)
            return r3
        L_0x002a:
            androidx.media3.exoplayer.h.cq r10 = r6.f9049k     // Catch:{ all -> 0x0081 }
            int r0 = r6.f9043e     // Catch:{ all -> 0x0081 }
            int r4 = r6.f9044f     // Catch:{ all -> 0x0081 }
            int r0 = r0 + r4
            java.lang.Object r10 = r10.mo7093a(r0)     // Catch:{ all -> 0x0081 }
            androidx.media3.exoplayer.h.cc r10 = (androidx.media3.exoplayer.p145h.C3092cc) r10     // Catch:{ all -> 0x0081 }
            androidx.media3.common.x r10 = r10.f9031a     // Catch:{ all -> 0x0081 }
            if (r9 != 0) goto L_0x007c
            androidx.media3.common.x r9 = r6.f9051m     // Catch:{ all -> 0x0081 }
            if (r10 == r9) goto L_0x0040
            goto L_0x007c
        L_0x0040:
            int r7 = r6.f9044f     // Catch:{ all -> 0x0081 }
            int r7 = r6.m8933F(r7)     // Catch:{ all -> 0x0081 }
            boolean r9 = r6.m8945R(r7)     // Catch:{ all -> 0x0081 }
            if (r9 != 0) goto L_0x0051
            r7 = 1
            r8.f6956d = r7     // Catch:{ all -> 0x0081 }
            monitor-exit(r6)
            return r2
        L_0x0051:
            int[] r9 = r6.f9056r     // Catch:{ all -> 0x0081 }
            r9 = r9[r7]     // Catch:{ all -> 0x0081 }
            r8.f6941a = r9     // Catch:{ all -> 0x0081 }
            long[] r10 = r6.f9057s     // Catch:{ all -> 0x0081 }
            r0 = r10[r7]     // Catch:{ all -> 0x0081 }
            r8.f6957e = r0     // Catch:{ all -> 0x0081 }
            long r4 = r6.f9045g     // Catch:{ all -> 0x0081 }
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x0068
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 | r10
            r8.f6941a = r9     // Catch:{ all -> 0x0081 }
        L_0x0068:
            int[] r8 = r6.f9055q     // Catch:{ all -> 0x0081 }
            r8 = r8[r7]     // Catch:{ all -> 0x0081 }
            r11.f9028a = r8     // Catch:{ all -> 0x0081 }
            long[] r8 = r6.f9054p     // Catch:{ all -> 0x0081 }
            r9 = r8[r7]     // Catch:{ all -> 0x0081 }
            r11.f9029b = r9     // Catch:{ all -> 0x0081 }
            androidx.media3.extractor.be[] r8 = r6.f9058t     // Catch:{ all -> 0x0081 }
            r7 = r8[r7]     // Catch:{ all -> 0x0081 }
            r11.f9030c = r7     // Catch:{ all -> 0x0081 }
            monitor-exit(r6)
            return r3
        L_0x007c:
            r6.m8941N(r10, r7)     // Catch:{ all -> 0x0081 }
            monitor-exit(r6)
            return r1
        L_0x0081:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3094ce.m8934G(androidx.media3.exoplayer.cc, androidx.media3.c.g, boolean, boolean, androidx.media3.exoplayer.h.cb):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized long m8935H(long r11, boolean r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.f9042d     // Catch:{ all -> 0x002f }
            r1 = -1
            if (r0 == 0) goto L_0x002d
            long[] r3 = r10.f9057s     // Catch:{ all -> 0x002f }
            int r5 = r10.f9059u     // Catch:{ all -> 0x002f }
            r6 = r3[r5]     // Catch:{ all -> 0x002f }
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r14 == 0) goto L_0x001a
            int r14 = r10.f9044f     // Catch:{ all -> 0x002f }
            if (r14 == r0) goto L_0x001a
            int r0 = r14 + 1
        L_0x001a:
            r6 = r0
            r4 = r10
            r7 = r11
            r9 = r13
            int r11 = r4.m8932E(r5, r6, r7, r9)     // Catch:{ all -> 0x002f }
            r12 = -1
            if (r11 != r12) goto L_0x0027
            monitor-exit(r10)
            return r1
        L_0x0027:
            long r11 = r10.m8937J(r11)     // Catch:{ all -> 0x002f }
            monitor-exit(r10)
            return r11
        L_0x002d:
            monitor-exit(r10)
            return r1
        L_0x002f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3094ce.m8935H(long, boolean, boolean):long");
    }

    /* renamed from: I */
    private final synchronized long m8936I() {
        int i = this.f9042d;
        if (i == 0) {
            return -1;
        }
        return m8937J(i);
    }

    /* renamed from: J */
    private final long m8937J(int i) {
        this.f9060v = Math.max(this.f9060v, m8939L(i));
        this.f9042d -= i;
        int i2 = this.f9043e + i;
        this.f9043e = i2;
        int i3 = this.f9059u + i;
        this.f9059u = i3;
        int i4 = this.f9052n;
        if (i3 >= i4) {
            this.f9059u = i3 - i4;
        }
        int i5 = this.f9044f - i;
        this.f9044f = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.f9044f = 0;
        }
        C3106cq cqVar = this.f9049k;
        while (i6 < cqVar.f9107b.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < cqVar.f9107b.keyAt(i7)) {
                break;
            }
            ((C3092cc) cqVar.f9107b.valueAt(i6)).f9032b.mo6616a();
            cqVar.f9107b.removeAt(i6);
            int i8 = cqVar.f9106a;
            if (i8 > 0) {
                cqVar.f9106a = i8 - 1;
            }
            i6 = i7;
        }
        if (this.f9042d != 0) {
            return this.f9054p[this.f9059u];
        }
        int i9 = this.f9059u;
        if (i9 == 0) {
            i9 = this.f9052n;
        }
        int i10 = i9 - 1;
        return this.f9054p[i10] + ((long) this.f9055q[i10]);
    }

    /* renamed from: K */
    private final long m8938K(int i) {
        int i2 = this.f9043e;
        int i3 = this.f9042d;
        int i4 = (i2 + i3) - i;
        boolean z = true;
        C2601a.m6830b(i4 >= 0 && i4 <= i3 - this.f9044f);
        int i5 = this.f9042d - i4;
        this.f9042d = i5;
        this.f9061w = Math.max(this.f9060v, m8939L(i5));
        if (i4 != 0 || !this.f9062x) {
            z = false;
        }
        this.f9062x = z;
        C3106cq cqVar = this.f9049k;
        int size = cqVar.f9107b.size() - 1;
        while (size >= 0 && i < cqVar.f9107b.keyAt(size)) {
            ((C3092cc) cqVar.f9107b.valueAt(size)).f9032b.mo6616a();
            cqVar.f9107b.removeAt(size);
            size--;
        }
        cqVar.f9106a = cqVar.f9107b.size() > 0 ? Math.min(cqVar.f9106a, cqVar.f9107b.size() - 1) : -1;
        int i6 = this.f9042d;
        if (i6 == 0) {
            return 0;
        }
        int F = m8933F(i6 - 1);
        return this.f9054p[F] + ((long) this.f9055q[F]);
    }

    /* renamed from: L */
    private final long m8939L(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int F = m8933F(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f9057s[F]);
            if ((this.f9056r[F] & 1) != 0) {
                break;
            }
            F--;
            if (F == -1) {
                F = this.f9052n - 1;
            }
        }
        return j;
    }

    /* renamed from: M */
    private final synchronized void m8940M(long j, int i, long j2, int i2, C3367be beVar) {
        C2867j jVar;
        long j3 = j;
        synchronized (this) {
            int i3 = this.f9042d;
            if (i3 > 0) {
                int F = m8933F(i3 - 1);
                C2601a.m6830b(this.f9054p[F] + ((long) this.f9055q[F]) <= j2);
            }
            this.f9062x = (536870912 & i) != 0;
            this.f9061w = Math.max(this.f9061w, j);
            int F2 = m8933F(this.f9042d);
            this.f9057s[F2] = j3;
            this.f9054p[F2] = j2;
            this.f9055q[F2] = i2;
            this.f9056r[F2] = i;
            this.f9058t[F2] = beVar;
            this.f9053o[F2] = this.f9047i;
            if (this.f9049k.mo7095c() || !((C3092cc) this.f9049k.mo7094b()).f9031a.equals(this.f9034B)) {
                C2868k kVar = this.f9050l;
                if (kVar != null) {
                    jVar = kVar.mo6614e();
                } else {
                    jVar = C2867j.f8049b;
                }
                C3106cq cqVar = this.f9049k;
                int i4 = this.f9043e + this.f9042d;
                C2680x xVar = this.f9034B;
                xVar.getClass();
                C3092cc ccVar = new C3092cc(xVar, jVar);
                if (cqVar.f9106a == -1) {
                    C2601a.m6832d(cqVar.f9107b.size() == 0);
                    cqVar.f9106a = 0;
                }
                if (cqVar.f9107b.size() > 0) {
                    SparseArray sparseArray = cqVar.f9107b;
                    int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    C2601a.m6830b(i4 >= keyAt);
                    if (keyAt == i4) {
                        SparseArray sparseArray2 = cqVar.f9107b;
                        ((C3092cc) sparseArray2.valueAt(sparseArray2.size() - 1)).f9032b.mo6616a();
                    }
                }
                cqVar.f9107b.append(i4, ccVar);
            }
            int i5 = this.f9042d + 1;
            this.f9042d = i5;
            int i6 = this.f9052n;
            if (i5 == i6) {
                int i7 = i6 + 1000;
                int[] iArr = new int[i7];
                long[] jArr = new long[i7];
                long[] jArr2 = new long[i7];
                int[] iArr2 = new int[i7];
                int[] iArr3 = new int[i7];
                C3367be[] beVarArr = new C3367be[i7];
                int i8 = this.f9059u;
                int i9 = i6 - i8;
                System.arraycopy(this.f9054p, i8, jArr, 0, i9);
                System.arraycopy(this.f9057s, this.f9059u, jArr2, 0, i9);
                System.arraycopy(this.f9056r, this.f9059u, iArr2, 0, i9);
                System.arraycopy(this.f9055q, this.f9059u, iArr3, 0, i9);
                System.arraycopy(this.f9058t, this.f9059u, beVarArr, 0, i9);
                System.arraycopy(this.f9053o, this.f9059u, iArr, 0, i9);
                int i10 = this.f9059u;
                System.arraycopy(this.f9054p, 0, jArr, i9, i10);
                System.arraycopy(this.f9057s, 0, jArr2, i9, i10);
                System.arraycopy(this.f9056r, 0, iArr2, i9, i10);
                System.arraycopy(this.f9055q, 0, iArr3, i9, i10);
                System.arraycopy(this.f9058t, 0, beVarArr, i9, i10);
                System.arraycopy(this.f9053o, 0, iArr, i9, i10);
                this.f9054p = jArr;
                this.f9057s = jArr2;
                this.f9056r = iArr2;
                this.f9055q = iArr3;
                this.f9058t = beVarArr;
                this.f9053o = iArr;
                this.f9059u = 0;
                this.f9052n = i7;
            }
        }
    }

    /* renamed from: O */
    private final synchronized void m8942O() {
        this.f9044f = 0;
        C3090ca caVar = this.f9040b;
        caVar.f9024c = caVar.f9023b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r7 <= r6.f9060v) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return false;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m8943P(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f9042d     // Catch:{ all -> 0x0041 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            long r3 = r6.f9060v     // Catch:{ all -> 0x0041 }
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            monitor-exit(r6)
            if (r0 <= 0) goto L_0x000f
            return r1
        L_0x000f:
            return r2
        L_0x0010:
            long r3 = r6.mo7078n()     // Catch:{ all -> 0x0041 }
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x001a
            monitor-exit(r6)
            return r2
        L_0x001a:
            int r0 = r6.f9042d     // Catch:{ all -> 0x0041 }
            int r2 = r0 + -1
            int r2 = r6.m8933F(r2)     // Catch:{ all -> 0x0041 }
        L_0x0022:
            int r3 = r6.f9044f     // Catch:{ all -> 0x0041 }
            if (r0 <= r3) goto L_0x0039
            long[] r3 = r6.f9057s     // Catch:{ all -> 0x0041 }
            r4 = r3[r2]     // Catch:{ all -> 0x0041 }
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0039
            int r0 = r0 + -1
            int r2 = r2 + -1
            r3 = -1
            if (r2 != r3) goto L_0x0022
            int r2 = r6.f9052n     // Catch:{ all -> 0x0041 }
            int r2 = r2 + r3
            goto L_0x0022
        L_0x0039:
            int r7 = r6.f9043e     // Catch:{ all -> 0x0041 }
            int r7 = r7 + r0
            r6.m8938K(r7)     // Catch:{ all -> 0x0041 }
            monitor-exit(r6)
            return r1
        L_0x0041:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0045
        L_0x0044:
            throw r7
        L_0x0045:
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3094ce.m8943P(long):boolean");
    }

    /* renamed from: Q */
    private final boolean m8944Q() {
        return this.f9044f != this.f9042d;
    }

    /* renamed from: R */
    private final boolean m8945R(int i) {
        if (this.f9038F != null) {
            return (this.f9056r[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    /* renamed from: S */
    private final synchronized boolean m8946S(C2680x xVar) {
        this.f9064z = false;
        if (C2612ak.m6951aa(xVar, this.f9034B)) {
            return false;
        }
        if (this.f9049k.mo7095c() || !((C3092cc) this.f9049k.mo7094b()).f9031a.equals(xVar)) {
            this.f9034B = xVar;
        } else {
            this.f9034B = ((C3092cc) this.f9049k.mo7094b()).f9031a;
        }
        C2680x xVar2 = this.f9034B;
        this.f9035C = C2598ay.m6811j(xVar2.f7496n, xVar2.f7493k);
        this.f9036D = false;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        return r1;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo7068A(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m8944Q()     // Catch:{ all -> 0x003e }
            r1 = 1
            if (r0 != 0) goto L_0x001d
            if (r4 != 0) goto L_0x001b
            boolean r4 = r3.f9062x     // Catch:{ all -> 0x003e }
            if (r4 != 0) goto L_0x001b
            androidx.media3.common.x r4 = r3.f9034B     // Catch:{ all -> 0x003e }
            r0 = 0
            if (r4 == 0) goto L_0x001a
            androidx.media3.common.x r2 = r3.f9051m     // Catch:{ all -> 0x003e }
            if (r4 == r2) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            monitor-exit(r3)
            return r0
        L_0x001a:
            r1 = 0
        L_0x001b:
            monitor-exit(r3)
            return r1
        L_0x001d:
            androidx.media3.exoplayer.h.cq r4 = r3.f9049k     // Catch:{ all -> 0x003e }
            int r0 = r3.f9043e     // Catch:{ all -> 0x003e }
            int r2 = r3.f9044f     // Catch:{ all -> 0x003e }
            int r0 = r0 + r2
            java.lang.Object r4 = r4.mo7093a(r0)     // Catch:{ all -> 0x003e }
            androidx.media3.exoplayer.h.cc r4 = (androidx.media3.exoplayer.p145h.C3092cc) r4     // Catch:{ all -> 0x003e }
            androidx.media3.common.x r4 = r4.f9031a     // Catch:{ all -> 0x003e }
            androidx.media3.common.x r0 = r3.f9051m     // Catch:{ all -> 0x003e }
            if (r4 == r0) goto L_0x0032
            monitor-exit(r3)
            return r1
        L_0x0032:
            int r4 = r3.f9044f     // Catch:{ all -> 0x003e }
            int r4 = r3.m8933F(r4)     // Catch:{ all -> 0x003e }
            boolean r4 = r3.m8945R(r4)     // Catch:{ all -> 0x003e }
            monitor-exit(r3)
            return r4
        L_0x003e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3094ce.mo7068A(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        return false;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo7069B(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.m8942O()     // Catch:{ all -> 0x001b }
            int r0 = r3.f9043e     // Catch:{ all -> 0x001b }
            if (r4 < r0) goto L_0x0018
            int r1 = r3.f9042d     // Catch:{ all -> 0x001b }
            int r1 = r1 + r0
            if (r4 <= r1) goto L_0x000e
            goto L_0x0018
        L_0x000e:
            r1 = -9223372036854775808
            r3.f9045g = r1     // Catch:{ all -> 0x001b }
            int r4 = r4 - r0
            r3.f9044f = r4     // Catch:{ all -> 0x001b }
            monitor-exit(r3)
            r4 = 1
            return r4
        L_0x0018:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x001b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3094ce.mo7069B(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        return false;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo7070C(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.m8942O()     // Catch:{ all -> 0x003d }
            int r0 = r8.f9044f     // Catch:{ all -> 0x003d }
            int r2 = r8.m8933F(r0)     // Catch:{ all -> 0x003d }
            boolean r1 = r8.m8944Q()     // Catch:{ all -> 0x003d }
            r7 = 0
            if (r1 == 0) goto L_0x003b
            long[] r1 = r8.f9057s     // Catch:{ all -> 0x003d }
            r3 = r1[r2]     // Catch:{ all -> 0x003d }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x003b
            long r3 = r8.f9061w     // Catch:{ all -> 0x003d }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0021
            if (r11 == 0) goto L_0x003b
        L_0x0021:
            int r11 = r8.f9042d     // Catch:{ all -> 0x003d }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.m8932E(r2, r3, r4, r6)     // Catch:{ all -> 0x003d }
            r0 = -1
            if (r11 != r0) goto L_0x0031
            monitor-exit(r8)
            return r7
        L_0x0031:
            r8.f9045g = r9     // Catch:{ all -> 0x003d }
            int r9 = r8.f9044f     // Catch:{ all -> 0x003d }
            int r9 = r9 + r11
            r8.f9044f = r9     // Catch:{ all -> 0x003d }
            monitor-exit(r8)
            r9 = 1
            return r9
        L_0x003b:
            monitor-exit(r8)
            return r7
        L_0x003d:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3094ce.mo7070C(long, boolean):boolean");
    }

    /* renamed from: a */
    public final /* synthetic */ int mo6849a(C2671o oVar, int i, boolean z) {
        return mo6853e(oVar, i, z);
    }

    /* renamed from: b */
    public final void mo6850b(C2680x xVar) {
        C2680x g = mo7071g(xVar);
        this.f9046h = false;
        this.f9033A = xVar;
        boolean S = m8946S(g);
        C3093cd cdVar = this.f9041c;
        if (cdVar != null && S) {
            cdVar.mo7057u();
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo6851c(C2604ac acVar, int i) {
        mo6854f(acVar, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6852d(long r12, int r14, int r15, int r16, androidx.media3.extractor.C3367be r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f9046h
            if (r0 == 0) goto L_0x000d
            androidx.media3.common.x r0 = r8.f9033A
            androidx.media3.common.p136b.C2601a.m6829a(r0)
            r11.mo6850b(r0)
        L_0x000d:
            r0 = r14 & 1
            boolean r1 = r8.f9063y
            r2 = 0
            if (r1 == 0) goto L_0x0019
            if (r0 != 0) goto L_0x0017
            return
        L_0x0017:
            r8.f9063y = r2
        L_0x0019:
            long r3 = r8.f9037E
            long r3 = r3 + r12
            boolean r1 = r8.f9035C
            if (r1 == 0) goto L_0x0049
            long r5 = r8.f9045g
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0027
            return
        L_0x0027:
            if (r0 != 0) goto L_0x0049
            boolean r1 = r8.f9036D
            if (r1 != 0) goto L_0x0045
            androidx.media3.common.x r1 = r8.f9034B
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r5 = "Overriding unexpected non-sync sample for format: "
            java.lang.String r1 = r5.concat(r1)
            java.lang.String r5 = "SampleQueue"
            androidx.media3.common.p136b.C2633u.m7050e(r5, r1)
            r1 = 1
            r8.f9036D = r1
        L_0x0045:
            r1 = r14 | 1
            r5 = r1
            goto L_0x004a
        L_0x0049:
            r5 = r14
        L_0x004a:
            boolean r1 = r8.f9048j
            if (r1 == 0) goto L_0x005b
            if (r0 == 0) goto L_0x005a
            boolean r0 = r11.m8943P(r3)
            if (r0 != 0) goto L_0x0057
            goto L_0x005a
        L_0x0057:
            r8.f9048j = r2
            goto L_0x005b
        L_0x005a:
            return
        L_0x005b:
            androidx.media3.exoplayer.h.ca r0 = r8.f9040b
            long r0 = r0.f9026e
            r6 = r15
            long r9 = (long) r6
            long r0 = r0 - r9
            r2 = r16
            long r9 = (long) r2
            long r9 = r0 - r9
            r0 = r11
            r1 = r3
            r3 = r5
            r4 = r9
            r7 = r17
            r0.m8940M(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3094ce.mo6852d(long, int, int, int, androidx.media3.extractor.be):void");
    }

    /* renamed from: e */
    public final int mo6853e(C2671o oVar, int i, boolean z) {
        C3090ca caVar = this.f9040b;
        int a = caVar.mo7064a(i);
        C3088bz bzVar = caVar.f9025d;
        int a2 = oVar.mo5879a(bzVar.f9017c.f9718a, bzVar.mo7061a(caVar.f9026e), a);
        if (a2 != -1) {
            caVar.mo7067e(a2);
            return a2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: f */
    public final void mo6854f(C2604ac acVar, int i) {
        C3090ca caVar = this.f9040b;
        while (i > 0) {
            int a = caVar.mo7064a(i);
            C3088bz bzVar = caVar.f9025d;
            acVar.mo6155w(bzVar.f9017c.f9718a, bzVar.mo7061a(caVar.f9026e), a);
            i -= a;
            caVar.mo7067e(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C2680x mo7071g(C2680x xVar) {
        long j = this.f9037E;
        if (j == 0) {
            return xVar;
        }
        long j2 = xVar.f7500r;
        if (j2 == Long.MAX_VALUE) {
            return xVar;
        }
        C2679w wVar = new C2679w(xVar);
        wVar.f7463o = j2 + j;
        return new C2680x(wVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r9 != -1) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        return 0;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo7072h(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f9044f     // Catch:{ all -> 0x0038 }
            int r2 = r8.m8933F(r0)     // Catch:{ all -> 0x0038 }
            boolean r1 = r8.m8944Q()     // Catch:{ all -> 0x0038 }
            r7 = 0
            if (r1 == 0) goto L_0x0036
            long[] r1 = r8.f9057s     // Catch:{ all -> 0x0038 }
            r3 = r1[r2]     // Catch:{ all -> 0x0038 }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0017
            goto L_0x0036
        L_0x0017:
            long r3 = r8.f9061w     // Catch:{ all -> 0x0038 }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0025
            if (r11 != 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            int r9 = r8.f9042d     // Catch:{ all -> 0x0038 }
            int r9 = r9 - r0
            monitor-exit(r8)
            return r9
        L_0x0025:
            int r11 = r8.f9042d     // Catch:{ all -> 0x0038 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.m8932E(r2, r3, r4, r6)     // Catch:{ all -> 0x0038 }
            r10 = -1
            monitor-exit(r8)
            if (r9 != r10) goto L_0x0035
            return r7
        L_0x0035:
            return r9
        L_0x0036:
            monitor-exit(r8)
            return r7
        L_0x0038:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3094ce.mo7072h(long, boolean):int");
    }

    /* renamed from: i */
    public final synchronized int mo7073i() {
        return m8944Q() ? this.f9053o[m8933F(this.f9044f)] : this.f9047i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r0 != 0) goto L_0x0048;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7074j(androidx.media3.exoplayer.C2874cc r9, androidx.media3.p134c.C2529g r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r5 = 1
            goto L_0x0009
        L_0x0007:
            r0 = 0
            r5 = 0
        L_0x0009:
            androidx.media3.exoplayer.h.cb r7 = r8.f9039a
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.m8934G(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L_0x0049
            r9 = 4
            boolean r0 = r10.mo5954fh(r9)
            if (r0 != 0) goto L_0x0048
            r0 = r11 & 1
            r9 = r9 & r11
            if (r9 != 0) goto L_0x003f
            if (r0 == 0) goto L_0x0030
            androidx.media3.exoplayer.h.ca r9 = r8.f9040b
            androidx.media3.exoplayer.h.cb r11 = r8.f9039a
            androidx.media3.exoplayer.h.bz r0 = r9.f9024c
            androidx.media3.common.b.ac r9 = r9.f9022a
            androidx.media3.exoplayer.p145h.C3090ca.m8922b(r0, r10, r11, r9)
            goto L_0x0048
        L_0x0030:
            androidx.media3.exoplayer.h.ca r9 = r8.f9040b
            androidx.media3.exoplayer.h.cb r11 = r8.f9039a
            androidx.media3.exoplayer.h.bz r0 = r9.f9024c
            androidx.media3.common.b.ac r2 = r9.f9022a
            androidx.media3.exoplayer.h.bz r10 = androidx.media3.exoplayer.p145h.C3090ca.m8922b(r0, r10, r11, r2)
            r9.f9024c = r10
            goto L_0x0042
        L_0x003f:
            if (r0 == 0) goto L_0x0042
            goto L_0x0048
        L_0x0042:
            int r9 = r8.f9044f
            int r9 = r9 + r1
            r8.f9044f = r9
            return r12
        L_0x0048:
            r9 = -4
        L_0x0049:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3094ce.mo7074j(androidx.media3.exoplayer.cc, androidx.media3.c.g, int, boolean):int");
    }

    /* renamed from: k */
    public final synchronized long mo7075k() {
        int i = this.f9044f;
        if (i == 0) {
            return -1;
        }
        return m8937J(i);
    }

    /* renamed from: l */
    public final synchronized long mo7076l() {
        if (this.f9042d == 0) {
            return Long.MIN_VALUE;
        }
        return this.f9057s[this.f9059u];
    }

    /* renamed from: m */
    public final synchronized long mo7077m() {
        return this.f9061w;
    }

    /* renamed from: n */
    public final synchronized long mo7078n() {
        return Math.max(this.f9060v, m8939L(this.f9044f));
    }

    /* renamed from: o */
    public final synchronized C2680x mo7079o() {
        if (this.f9064z) {
            return null;
        }
        return this.f9034B;
    }

    /* renamed from: p */
    public final void mo7080p(long j, boolean z, boolean z2) {
        this.f9040b.mo7066d(m8935H(j, z, z2));
    }

    /* renamed from: q */
    public final void mo7081q() {
        this.f9040b.mo7066d(m8936I());
    }

    /* renamed from: r */
    public final void mo7082r(int i) {
        C3090ca caVar = this.f9040b;
        long K = m8938K(i);
        C2601a.m6830b(K <= caVar.f9026e);
        caVar.f9026e = K;
        if (K != 0) {
            C3088bz bzVar = caVar.f9023b;
            if (K != bzVar.f9015a) {
                while (caVar.f9026e > bzVar.f9016b) {
                    bzVar = bzVar.f9018d;
                }
                C3088bz bzVar2 = bzVar.f9018d;
                bzVar2.getClass();
                caVar.mo7065c(bzVar2);
                bzVar.f9018d = new C3088bz(bzVar.f9016b);
                caVar.f9025d = caVar.f9026e == bzVar.f9016b ? bzVar.f9018d : bzVar;
                if (caVar.f9024c == bzVar2) {
                    caVar.f9024c = bzVar.f9018d;
                    return;
                }
                return;
            }
        }
        caVar.mo7065c(caVar.f9023b);
        caVar.f9023b = new C3088bz(caVar.f9026e);
        C3088bz bzVar3 = caVar.f9023b;
        caVar.f9024c = bzVar3;
        caVar.f9025d = bzVar3;
    }

    /* renamed from: t */
    public final void mo7083t() {
        C2869l lVar = this.f9038F;
        if (lVar != null) {
            throw lVar.f8051a;
        }
    }

    /* renamed from: u */
    public final void mo7084u() {
        mo7086w(true);
        mo7085v();
    }

    /* renamed from: v */
    public final void mo7085v() {
        if (this.f9038F != null) {
            this.f9038F = null;
            this.f9051m = null;
        }
    }

    /* renamed from: w */
    public final void mo7086w(boolean z) {
        C3090ca caVar = this.f9040b;
        caVar.mo7065c(caVar.f9023b);
        caVar.f9023b.mo7063c(0);
        C3088bz bzVar = caVar.f9023b;
        caVar.f9024c = bzVar;
        caVar.f9025d = bzVar;
        caVar.f9026e = 0;
        caVar.f9027f.mo7239f();
        this.f9042d = 0;
        this.f9043e = 0;
        this.f9059u = 0;
        this.f9044f = 0;
        this.f9063y = true;
        this.f9045g = Long.MIN_VALUE;
        this.f9060v = Long.MIN_VALUE;
        this.f9061w = Long.MIN_VALUE;
        this.f9062x = false;
        C3106cq cqVar = this.f9049k;
        for (int i = 0; i < cqVar.f9107b.size(); i++) {
            ((C3092cc) cqVar.f9107b.valueAt(i)).f9032b.mo6616a();
        }
        cqVar.f9106a = -1;
        cqVar.f9107b.clear();
        if (z) {
            this.f9033A = null;
            this.f9034B = null;
            this.f9064z = true;
        }
    }

    /* renamed from: x */
    public final void mo7087x(long j) {
        if (this.f9037E != j) {
            this.f9037E = j;
            this.f9046h = true;
        }
    }

    /* renamed from: y */
    public final synchronized void mo7088y(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.f9044f + i <= this.f9042d) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C2601a.m6830b(z);
        this.f9044f += i;
    }

    /* renamed from: z */
    public final synchronized boolean mo7089z() {
        return this.f9062x;
    }

    /* renamed from: D */
    public static C3094ce m8931D(C3241g gVar, C2868k kVar, C2862e eVar) {
        kVar.getClass();
        eVar.getClass();
        return new C3094ce(gVar, kVar);
    }

    /* renamed from: N */
    private final void m8941N(C2680x xVar, C2874cc ccVar) {
        DrmInitData drmInitData;
        C2680x xVar2 = this.f9051m;
        boolean z = xVar2 == null;
        if (z) {
            drmInitData = null;
        } else {
            drmInitData = xVar2.f7499q;
        }
        this.f9051m = xVar;
        DrmInitData drmInitData2 = xVar.f7499q;
        C2868k kVar = this.f9050l;
        ccVar.f8096a = kVar != null ? xVar.mo6357b(kVar.mo6610a(xVar)) : xVar;
        ccVar.f8097b = this.f9038F;
        if (this.f9050l != null) {
            if (z || !C2612ak.m6951aa(drmInitData, drmInitData2)) {
                C2869l d = this.f9050l.mo6613d(xVar);
                this.f9038F = d;
                ccVar.f8097b = d;
            }
        }
    }
}
