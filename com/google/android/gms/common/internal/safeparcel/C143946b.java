package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
/* compiled from: PG */
public final class C143946b {
    /* renamed from: A */
    public static byte[] m234044A(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + g);
        return createByteArray;
    }

    /* renamed from: B */
    public static int[] m234045B(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + g);
        return createIntArray;
    }

    /* renamed from: C */
    public static long[] m234046C(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + g);
        return createLongArray;
    }

    /* renamed from: D */
    public static Object[] m234047D(Parcel parcel, int i, Parcelable.Creator creator) {
        int g = m234058g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + g);
        return createTypedArray;
    }

    /* renamed from: E */
    public static String[] m234048E(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + g);
        return createStringArray;
    }

    /* renamed from: F */
    public static boolean[] m234049F(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + g);
        return createBooleanArray;
    }

    /* renamed from: G */
    public static byte[][] m234050G(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + g);
        return bArr;
    }

    /* renamed from: H */
    private static void m234051H(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String hexString = Integer.toHexString(i);
            throw new C143945a("Expected size " + i2 + " got " + i + " (0x" + hexString + ")", parcel);
        }
    }

    /* renamed from: a */
    public static byte m234052a(Parcel parcel, int i) {
        m234075x(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: b */
    public static double m234053b(Parcel parcel, int i) {
        m234075x(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: c */
    public static float m234054c(Parcel parcel, int i) {
        m234075x(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: d */
    public static int m234055d(int i) {
        return (char) i;
    }

    /* renamed from: e */
    public static int m234056e(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: f */
    public static int m234057f(Parcel parcel, int i) {
        m234075x(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: g */
    public static int m234058g(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: h */
    public static int m234059h(Parcel parcel) {
        int readInt = parcel.readInt();
        int g = m234058g(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) == 20293) {
            int i = g + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            throw new C143945a("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
        }
        throw new C143945a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    /* renamed from: i */
    public static long m234060i(Parcel parcel, int i) {
        m234075x(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: j */
    public static Bundle m234061j(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + g);
        return readBundle;
    }

    /* renamed from: k */
    public static IBinder m234062k(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + g);
        return readStrongBinder;
    }

    /* renamed from: l */
    public static Parcelable m234063l(Parcel parcel, int i, Parcelable.Creator creator) {
        int g = m234058g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + g);
        return parcelable;
    }

    /* renamed from: m */
    public static Boolean m234064m(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        if (g == 0) {
            return null;
        }
        m234051H(parcel, g, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: n */
    public static Double m234065n(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        if (g == 0) {
            return null;
        }
        m234051H(parcel, g, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: o */
    public static Float m234066o(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        if (g == 0) {
            return null;
        }
        m234051H(parcel, g, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: p */
    public static Integer m234067p(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        if (g == 0) {
            return null;
        }
        m234051H(parcel, g, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: q */
    public static Long m234068q(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        if (g == 0) {
            return null;
        }
        m234051H(parcel, g, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: r */
    public static String m234069r(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + g);
        return readString;
    }

    /* renamed from: s */
    public static ArrayList m234070s(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + g);
        return arrayList;
    }

    /* renamed from: t */
    public static ArrayList m234071t(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + g);
        return arrayList;
    }

    /* renamed from: u */
    public static ArrayList m234072u(Parcel parcel, int i) {
        int g = m234058g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + g);
        return createStringArrayList;
    }

    /* renamed from: v */
    public static ArrayList m234073v(Parcel parcel, int i, Parcelable.Creator creator) {
        int g = m234058g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + g);
        return createTypedArrayList;
    }

    /* renamed from: w */
    public static void m234074w(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new C143945a("Overread allowed size end=" + i, parcel);
        }
    }

    /* renamed from: x */
    public static void m234075x(Parcel parcel, int i, int i2) {
        int g = m234058g(parcel, i);
        if (g != i2) {
            String hexString = Integer.toHexString(g);
            throw new C143945a("Expected size " + i2 + " got " + g + " (0x" + hexString + ")", parcel);
        }
    }

    /* renamed from: y */
    public static void m234076y(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m234058g(parcel, i));
    }

    /* renamed from: z */
    public static boolean m234077z(Parcel parcel, int i) {
        m234075x(parcel, i, 4);
        return parcel.readInt() != 0;
    }
}
