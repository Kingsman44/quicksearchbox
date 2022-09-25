package com.google.android.libraries.gsa.util;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.libraries.gsa.util.c */
/* compiled from: PG */
public final class C23338c {
    /* renamed from: a */
    public static Integer m43769a(Parcel parcel) {
        if (parcel.readByte() == 0) {
            return null;
        }
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: c */
    public static void m43771c(Integer num, Parcel parcel) {
        if (num == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeInt(num.intValue());
    }

    /* renamed from: d */
    public static boolean m43772d(Parcel parcel) {
        return parcel.readByte() == 1;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public static byte[] m43773e(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return parcel.createByteArray();
        }
        byte[] bArr = new byte[readInt];
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = 0;
        int i2 = 0;
        while (i < readInt) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i2);
                readStrongBinder.transact(1, obtain, obtain2, 0);
                byte[] createByteArray = obtain2.createByteArray();
                int length = createByteArray.length;
                if (length != 0) {
                    System.arraycopy(createByteArray, 0, bArr, i, length);
                    i += length;
                    obtain.recycle();
                    obtain2.recycle();
                    i2++;
                } else {
                    throw new IllegalStateException("Expected non-zero length chunk");
                }
            } catch (Throwable th) {
                obtain.recycle();
                obtain2.recycle();
                throw th;
            }
        }
        return bArr;
    }

    /* renamed from: b */
    public static void m43770b(Parcel parcel, byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) < 65536) {
            parcel.writeInt(0);
            parcel.writeByteArray(bArr);
            return;
        }
        parcel.writeInt(length);
        parcel.writeStrongBinder(new C23337b(bArr));
    }
}
