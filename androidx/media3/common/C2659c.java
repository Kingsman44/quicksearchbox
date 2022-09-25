package androidx.media3.common;

import android.net.Uri;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import java.util.Arrays;

/* renamed from: androidx.media3.common.c */
/* compiled from: PG */
public final class C2659c implements C2668l {

    /* renamed from: a */
    public static final C2659c f7412a = new C2659c((Object) null, new C2600b[0], 0, -9223372036854775807L);

    /* renamed from: h */
    private static final C2600b f7413h = new C2600b(0).mo6109b(0);

    /* renamed from: b */
    public final Object f7414b;

    /* renamed from: c */
    public final int f7415c;

    /* renamed from: d */
    public final long f7416d;

    /* renamed from: e */
    public final long f7417e;

    /* renamed from: f */
    public final int f7418f;

    /* renamed from: g */
    public final C2600b[] f7419g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2659c(java.lang.Object r9, long... r10) {
        /*
            r8 = this;
            int r0 = r10.length
            androidx.media3.common.b[] r3 = new androidx.media3.common.C2600b[r0]
            r1 = 0
        L_0x0004:
            if (r1 >= r0) goto L_0x0012
            androidx.media3.common.b r2 = new androidx.media3.common.b
            r4 = r10[r1]
            r2.<init>(r4)
            r3[r1] = r2
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0012:
            r4 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r8
            r2 = r9
            r1.<init>(r2, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.C2659c.<init>(java.lang.Object, long[]):void");
    }

    /* renamed from: a */
    public final int mo6319a(long j, long j2) {
        if (j != Long.MIN_VALUE) {
            int i = 0;
            if (j2 == -9223372036854775807L || j < j2) {
                while (i < this.f7415c) {
                    if (mo6321c(i).f7218a == Long.MIN_VALUE || mo6321c(i).f7218a > j) {
                        C2600b c = mo6321c(i);
                        if (c.f7219b == -1 || c.mo6108a(-1) < c.f7219b) {
                            break;
                        }
                    }
                    i++;
                }
                if (i < this.f7415c) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final C2600b mo6321c(int i) {
        return i < 0 ? f7413h : this.f7419g[i];
    }

    /* renamed from: d */
    public final C2659c mo6322d(int i, int i2) {
        C2601a.m6830b(i2 > 0);
        C2600b[] bVarArr = this.f7419g;
        if (bVarArr[i].f7219b == i2) {
            return this;
        }
        C2600b[] bVarArr2 = (C2600b[]) C2612ak.m6965ao(bVarArr, bVarArr.length);
        bVarArr2[i] = this.f7419g[i].mo6109b(i2);
        return new C2659c(this.f7414b, bVarArr2, this.f7416d, this.f7417e);
    }

    /* renamed from: e */
    public final C2659c mo6323e(int i, int i2) {
        C2600b[] bVarArr = this.f7419g;
        C2600b[] bVarArr2 = (C2600b[]) C2612ak.m6965ao(bVarArr, bVarArr.length);
        bVarArr2[i] = bVarArr2[i].mo6110c(4, i2);
        return new C2659c(this.f7414b, bVarArr2, this.f7416d, this.f7417e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2659c cVar = (C2659c) obj;
            return C2612ak.m6951aa(this.f7414b, cVar.f7414b) && this.f7415c == cVar.f7415c && this.f7416d == cVar.f7416d && this.f7417e == cVar.f7417e && Arrays.equals(this.f7419g, cVar.f7419g);
        }
    }

    /* renamed from: f */
    public final C2659c mo6325f(long j) {
        if (this.f7416d == j) {
            return this;
        }
        return new C2659c(this.f7414b, this.f7419g, j, this.f7417e);
    }

    /* renamed from: g */
    public final C2659c mo6326g(int i) {
        C2600b bVar;
        C2600b[] bVarArr = this.f7419g;
        C2600b[] bVarArr2 = (C2600b[]) C2612ak.m6965ao(bVarArr, bVarArr.length);
        C2600b bVar2 = bVarArr2[i];
        if (bVar2.f7219b == -1) {
            long j = bVar2.f7223f;
            boolean z = bVar2.f7224g;
            bVar = new C2600b(bVar2.f7218a, 0, new int[0], new Uri[0], new long[0]);
        } else {
            int[] iArr = bVar2.f7221d;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = copyOf[i2];
                if (i3 == 1 || i3 == 0) {
                    copyOf[i2] = 2;
                }
            }
            long j2 = bVar2.f7218a;
            Uri[] uriArr = bVar2.f7220c;
            long[] jArr = bVar2.f7222e;
            long j3 = bVar2.f7223f;
            boolean z2 = bVar2.f7224g;
            bVar = new C2600b(j2, length, copyOf, uriArr, jArr);
        }
        bVarArr2[i] = bVar;
        return new C2659c(this.f7414b, bVarArr2, this.f7416d, this.f7417e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = mo6321c(r4);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6327h(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f7415c
            r1 = 0
            if (r4 < r0) goto L_0x0006
            return r1
        L_0x0006:
            androidx.media3.common.b r4 = r3.mo6321c(r4)
            int r0 = r4.f7219b
            r2 = -1
            if (r0 == r2) goto L_0x001b
            if (r5 < r0) goto L_0x0012
            goto L_0x001b
        L_0x0012:
            int[] r4 = r4.f7221d
            r4 = r4[r5]
            r5 = 4
            if (r4 != r5) goto L_0x001b
            r4 = 1
            return r4
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.C2659c.mo6327h(int, int):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f7414b);
        sb.append(", adResumePositionUs=");
        sb.append(this.f7416d);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.f7419g.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f7419g[i].f7218a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.f7419g[i].f7221d.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.f7419g[i].f7221d[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f7419g[i].f7222e[i2]);
                sb.append(')');
                if (i2 < this.f7419g[i].f7221d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.f7419g.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    /* renamed from: b */
    public final int mo6320b(long j, long j2) {
        int i = this.f7415c - 1;
        while (i >= 0 && j != Long.MIN_VALUE) {
            long j3 = mo6321c(i).f7218a;
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
            } else if (j2 != -9223372036854775807L && j >= j2) {
                break;
            }
            i--;
        }
        if (i < 0 || !mo6321c(i).mo6111d()) {
            return -1;
        }
        return i;
    }

    public final int hashCode() {
        int i;
        int i2 = this.f7415c * 31;
        Object obj = this.f7414b;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return ((((((i2 + i) * 31) + ((int) this.f7416d)) * 31) + ((int) this.f7417e)) * 961) + Arrays.hashCode(this.f7419g);
    }

    public C2659c(Object obj, C2600b[] bVarArr, long j, long j2) {
        this.f7414b = obj;
        this.f7416d = j;
        this.f7417e = j2;
        this.f7415c = bVarArr.length;
        this.f7419g = bVarArr;
        this.f7418f = 0;
    }
}
