package com.google.android.youtube.player.p3561b;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.youtube.player.b.as */
public final class C45460as {
    static {
        C45460as.class.getClassLoader();
    }

    private C45460as() {
    }

    /* renamed from: a */
    public static Parcelable m81137a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m81138b(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: c */
    public static void m81139c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: d */
    public static void m81140d(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: e */
    public static boolean m81141e(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
