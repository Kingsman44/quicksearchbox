package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.cast.r */
/* compiled from: PG */
public final class C143609r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        EqualizerBandSettings equalizerBandSettings = null;
        EqualizerBandSettings equalizerBandSettings2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                equalizerBandSettings = (EqualizerBandSettings) C143946b.m234063l(parcel, readInt, EqualizerBandSettings.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                equalizerBandSettings2 = (EqualizerBandSettings) C143946b.m234063l(parcel, readInt, EqualizerBandSettings.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new EqualizerSettings(equalizerBandSettings, equalizerBandSettings2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new EqualizerSettings[i];
    }
}
