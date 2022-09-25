package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.common.p4535g.C59203do;
import java.util.Arrays;

/* compiled from: PG */
public class Flag extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new C145733k();

    /* renamed from: a */
    public final String f394003a;

    /* renamed from: b */
    final long f394004b;

    /* renamed from: c */
    final boolean f394005c;

    /* renamed from: d */
    final double f394006d;

    /* renamed from: e */
    final String f394007e;

    /* renamed from: f */
    final byte[] f394008f;

    /* renamed from: g */
    public final int f394009g;

    /* renamed from: h */
    public final int f394010h;

    public Flag(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2) {
        this.f394003a = str;
        this.f394004b = j;
        this.f394005c = z;
        this.f394006d = d;
        this.f394007e = str2;
        this.f394008f = bArr;
        this.f394009g = i;
        this.f394010h = i2;
    }

    /* renamed from: g */
    private static int m236919g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    /* renamed from: a */
    public final double mo121836a() {
        if (this.f394009g == 3) {
            return this.f394006d;
        }
        throw new IllegalArgumentException("Not a double type");
    }

    /* renamed from: b */
    public final long mo121837b() {
        if (this.f394009g == 1) {
            return this.f394004b;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    /* renamed from: c */
    public final String mo121838c() {
        if (this.f394009g == 4) {
            String str = this.f394007e;
            C143919bh.m233958a(str);
            return str;
        }
        throw new IllegalArgumentException("Not a String type");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.gms.phenotype.Flag r9 = (com.google.android.gms.phenotype.Flag) r9
            java.lang.String r0 = r8.f394003a
            java.lang.String r1 = r9.f394003a
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L_0x000e
            goto L_0x00ac
        L_0x000e:
            int r0 = r8.f394009g
            int r1 = r9.f394009g
            int r1 = m236919g(r0, r1)
            if (r1 == 0) goto L_0x001b
            r0 = r1
            goto L_0x00ac
        L_0x001b:
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x009c
            r4 = 2
            if (r0 == r4) goto L_0x0091
            r4 = 3
            if (r0 == r4) goto L_0x0088
            r4 = 4
            if (r0 == r4) goto L_0x0076
            r4 = 5
            if (r0 != r4) goto L_0x0062
            byte[] r0 = r8.f394008f
            byte[] r4 = r9.f394008f
            if (r0 != r4) goto L_0x0034
            goto L_0x0097
        L_0x0034:
            if (r0 != 0) goto L_0x0038
            goto L_0x00a4
        L_0x0038:
            if (r4 != 0) goto L_0x003c
            goto L_0x00ab
        L_0x003c:
            byte[] r0 = r8.f394008f
            int r0 = r0.length
            byte[] r1 = r9.f394008f
            int r1 = r1.length
            int r0 = java.lang.Math.min(r0, r1)
            if (r2 >= r0) goto L_0x0057
            byte[] r0 = r8.f394008f
            byte r0 = r0[r2]
            byte[] r1 = r9.f394008f
            byte r1 = r1[r2]
            int r0 = r0 - r1
            if (r0 == 0) goto L_0x0054
            goto L_0x00ac
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x003c
        L_0x0057:
            byte[] r0 = r8.f394008f
            int r0 = r0.length
            byte[] r9 = r9.f394008f
            int r9 = r9.length
            int r0 = m236919g(r0, r9)
            goto L_0x00ac
        L_0x0062:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid enum value: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L_0x0076:
            java.lang.String r0 = r8.f394007e
            java.lang.String r9 = r9.f394007e
            if (r0 != r9) goto L_0x007d
            goto L_0x0097
        L_0x007d:
            if (r0 != 0) goto L_0x0080
            goto L_0x00a4
        L_0x0080:
            if (r9 != 0) goto L_0x0083
            goto L_0x00ab
        L_0x0083:
            int r0 = r0.compareTo(r9)
            goto L_0x00ac
        L_0x0088:
            double r0 = r8.f394006d
            double r2 = r9.f394006d
            int r0 = java.lang.Double.compare(r0, r2)
            goto L_0x00ac
        L_0x0091:
            boolean r0 = r8.f394005c
            boolean r9 = r9.f394005c
            if (r0 != r9) goto L_0x0099
        L_0x0097:
            r0 = 0
            goto L_0x00ac
        L_0x0099:
            if (r0 == 0) goto L_0x00a4
            goto L_0x00ab
        L_0x009c:
            long r4 = r8.f394004b
            long r6 = r9.f394004b
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x00a6
        L_0x00a4:
            r0 = -1
            goto L_0x00ac
        L_0x00a6:
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x00ab
            goto L_0x0097
        L_0x00ab:
            r0 = 1
        L_0x00ac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.Flag.compareTo(java.lang.Object):int");
    }

    /* renamed from: d */
    public final String mo121840d(StringBuilder sb) {
        sb.append("Flag(");
        sb.append(this.f394003a);
        sb.append(", ");
        int i = this.f394009g;
        if (i == 1) {
            sb.append(this.f394004b);
        } else if (i == 2) {
            sb.append(this.f394005c);
        } else if (i == 3) {
            sb.append(this.f394006d);
        } else if (i == 4) {
            sb.append("'");
            String str = this.f394007e;
            C143919bh.m233958a(str);
            sb.append(str);
            sb.append("'");
        } else if (i == 5) {
            sb.append("'");
            sb.append(Base64.encodeToString((byte[]) C143919bh.m233958a(this.f394008f), 3));
            sb.append("'");
        } else {
            String str2 = this.f394003a;
            throw new AssertionError("Invalid type: " + str2 + ", " + i);
        }
        sb.append(", ");
        sb.append(this.f394009g);
        sb.append(", ");
        sb.append(this.f394010h);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: e */
    public final boolean mo121841e() {
        if (this.f394009g == 2) {
            return this.f394005c;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof Flag) {
            Flag flag = (Flag) obj;
            if (C145717aa.m236984a(this.f394003a, flag.f394003a) && (i = this.f394009g) == flag.f394009g && this.f394010h == flag.f394010h) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                return C145717aa.m236984a(this.f394007e, flag.f394007e);
                            }
                            if (i == 5) {
                                return Arrays.equals(this.f394008f, flag.f394008f);
                            }
                            throw new AssertionError("Invalid enum value: " + i);
                        } else if (this.f394006d == flag.f394006d) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (this.f394005c == flag.f394005c) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (this.f394004b == flag.f394004b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final byte[] mo121843f() {
        if (this.f394009g == 5) {
            return (byte[]) C143919bh.m233958a(this.f394008f);
        }
        throw new IllegalArgumentException("Not a bytes type");
    }

    public final String toString() {
        return mo121840d(new StringBuilder());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        String str = this.f394003a;
        if (!C145733k.m237000b(str)) {
            C143947c.m234106y(parcel, 2, str);
        }
        long j = this.f394004b;
        if (j != 0) {
            C143947c.m234090i(parcel, 3, j);
        }
        if (this.f394005c) {
            C143947c.m234084c(parcel, 4, true);
        }
        double d = this.f394006d;
        if (d != C59203do.f157270a) {
            C143947c.m234086e(parcel, 5, d);
        }
        String str2 = this.f394007e;
        if (!C145733k.m237000b(str2)) {
            C143947c.m234106y(parcel, 6, str2);
        }
        byte[] bArr = this.f394008f;
        if (!C145733k.m237000b(bArr)) {
            C143947c.m234094m(parcel, 7, bArr);
        }
        int i2 = this.f394009g;
        if (!C145733k.m236999a(i2)) {
            C143947c.m234089h(parcel, 8, i2);
        }
        int i3 = this.f394010h;
        if (!C145733k.m236999a(i3)) {
            C143947c.m234089h(parcel, 9, i3);
        }
        C143947c.m234083b(parcel, a);
    }
}
