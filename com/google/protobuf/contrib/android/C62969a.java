package com.google.protobuf.contrib.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.protobuf.contrib.android.a */
/* compiled from: PG */
final class C62969a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        return new ProtoParsers.InternalDontUse(bArr, (MessageLite) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProtoParsers.InternalDontUse[i];
    }
}
