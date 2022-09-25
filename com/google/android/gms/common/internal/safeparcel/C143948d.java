package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.common.internal.safeparcel.d */
/* compiled from: PG */
public final class C143948d {
    /* renamed from: a */
    public static SafeParcelable m234108a(byte[] bArr, Parcelable.Creator creator) {
        C143919bh.m233958a(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }

    /* renamed from: b */
    public static SafeParcelable m234109b(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return m234108a(byteArrayExtra, creator);
    }

    /* renamed from: c */
    public static byte[] m234110c(SafeParcelable safeParcelable) {
        Parcel obtain = Parcel.obtain();
        safeParcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
