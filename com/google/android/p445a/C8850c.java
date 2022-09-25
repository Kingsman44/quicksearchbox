package com.google.android.p445a;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: com.google.android.a.c */
/* compiled from: PG */
public final class C8850c {

    /* renamed from: a */
    public static final ClassLoader f30763a = C8850c.class.getClassLoader();

    private C8850c() {
    }

    /* renamed from: a */
    public static Parcelable m23492a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static CharSequence m23493b(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    /* renamed from: c */
    public static void m23494c(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
        }
    }

    /* renamed from: d */
    public static void m23495d(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: e */
    public static void m23496e(Parcel parcel, CharSequence charSequence) {
        if (charSequence != null) {
            parcel.writeInt(1);
            TextUtils.writeToParcel(charSequence, parcel, 1);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: f */
    public static void m23497f(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: g */
    public static void m23498g(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }

    /* renamed from: h */
    public static void m23499h(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: i */
    public static boolean m23500i(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
