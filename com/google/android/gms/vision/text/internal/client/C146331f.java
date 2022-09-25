package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.vision.text.internal.client.f */
/* compiled from: PG */
public final class C146331f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        while (parcel.dataPosition() < h) {
            C143946b.m234076y(parcel, parcel.readInt());
        }
        C143946b.m234074w(parcel, h);
        return new SymbolBoxParcel();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SymbolBoxParcel[i];
    }
}
