package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.c */
/* compiled from: PG */
public final class C143947c {
    /* renamed from: A */
    public static void m234078A(Parcel parcel, int i, List list) {
        if (list != null) {
            int a = m234082a(parcel, i);
            parcel.writeStringList(list);
            m234083b(parcel, a);
        }
    }

    /* renamed from: B */
    public static void m234079B(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int a = m234082a(parcel, i);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m234081D(parcel, parcelable, i2);
                }
            }
            m234083b(parcel, a);
        }
    }

    /* renamed from: C */
    public static void m234080C(Parcel parcel, int i, List list) {
        if (list != null) {
            int a = m234082a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m234081D(parcel, parcelable, 0);
                }
            }
            m234083b(parcel, a);
        }
    }

    /* renamed from: D */
    private static void m234081D(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static int m234082a(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: b */
    public static void m234083b(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: c */
    public static void m234084c(Parcel parcel, int i, boolean z) {
        m234088g(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m234085d(Parcel parcel, int i, byte b) {
        m234088g(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: e */
    public static void m234086e(Parcel parcel, int i, double d) {
        m234088g(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: f */
    public static void m234087f(Parcel parcel, int i, float f) {
        m234088g(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: g */
    public static void m234088g(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: h */
    public static void m234089h(Parcel parcel, int i, int i2) {
        m234088g(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: i */
    public static void m234090i(Parcel parcel, int i, long j) {
        m234088g(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: j */
    public static void m234091j(Parcel parcel, int i, boolean[] zArr) {
        if (zArr != null) {
            int a = m234082a(parcel, i);
            parcel.writeBooleanArray(zArr);
            m234083b(parcel, a);
        }
    }

    /* renamed from: k */
    public static void m234092k(Parcel parcel, int i, Boolean bool) {
        if (bool != null) {
            m234088g(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    /* renamed from: l */
    public static void m234093l(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int a = m234082a(parcel, i);
            parcel.writeBundle(bundle);
            m234083b(parcel, a);
        }
    }

    /* renamed from: m */
    public static void m234094m(Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            int a = m234082a(parcel, i);
            parcel.writeByteArray(bArr);
            m234083b(parcel, a);
        }
    }

    /* renamed from: n */
    public static void m234095n(Parcel parcel, int i, byte[][] bArr) {
        if (bArr != null) {
            int a = m234082a(parcel, i);
            parcel.writeInt(r0);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            m234083b(parcel, a);
        }
    }

    /* renamed from: o */
    public static void m234096o(Parcel parcel, int i, Double d) {
        if (d != null) {
            m234088g(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        }
    }

    /* renamed from: p */
    public static void m234097p(Parcel parcel, int i, Float f) {
        if (f != null) {
            m234088g(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        }
    }

    /* renamed from: q */
    public static void m234098q(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int a = m234082a(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m234083b(parcel, a);
        }
    }

    /* renamed from: r */
    public static void m234099r(Parcel parcel, int i, int[] iArr) {
        if (iArr != null) {
            int a = m234082a(parcel, i);
            parcel.writeIntArray(iArr);
            m234083b(parcel, a);
        }
    }

    /* renamed from: s */
    public static void m234100s(Parcel parcel, int i, List list) {
        if (list != null) {
            int a = m234082a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            m234083b(parcel, a);
        }
    }

    /* renamed from: t */
    public static void m234101t(Parcel parcel, int i, Integer num) {
        if (num != null) {
            m234088g(parcel, i, 4);
            parcel.writeInt(num.intValue());
        }
    }

    /* renamed from: u */
    public static void m234102u(Parcel parcel, int i, long[] jArr) {
        if (jArr != null) {
            int a = m234082a(parcel, i);
            parcel.writeLongArray(jArr);
            m234083b(parcel, a);
        }
    }

    /* renamed from: v */
    public static void m234103v(Parcel parcel, int i, List list) {
        if (list != null) {
            int a = m234082a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeLong(((Long) list.get(i2)).longValue());
            }
            m234083b(parcel, a);
        }
    }

    /* renamed from: w */
    public static void m234104w(Parcel parcel, int i, Long l) {
        if (l != null) {
            m234088g(parcel, i, 8);
            parcel.writeLong(l.longValue());
        }
    }

    /* renamed from: x */
    public static void m234105x(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int a = m234082a(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m234083b(parcel, a);
        }
    }

    /* renamed from: y */
    public static void m234106y(Parcel parcel, int i, String str) {
        if (str != null) {
            int a = m234082a(parcel, i);
            parcel.writeString(str);
            m234083b(parcel, a);
        }
    }

    /* renamed from: z */
    public static void m234107z(Parcel parcel, int i, String[] strArr) {
        if (strArr != null) {
            int a = m234082a(parcel, i);
            parcel.writeStringArray(strArr);
            m234083b(parcel, a);
        }
    }
}
