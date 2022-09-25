package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.languageprofile.f */
/* compiled from: PG */
public final class C144446f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        float f = -1.0f;
        Integer num = null;
        int i = 1;
        int i2 = 2;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                f = C143946b.m234054c(parcel, readInt);
            } else if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                i2 = C143946b.m234057f(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                num = C143946b.m234067p(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new LanguagePreferenceParams(f, i, i2, num);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LanguagePreferenceParams[i];
    }
}
