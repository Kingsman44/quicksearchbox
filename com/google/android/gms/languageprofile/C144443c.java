package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.languageprofile.p10819a.C144441e;

/* renamed from: com.google.android.gms.languageprofile.c */
/* compiled from: PG */
public final class C144443c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        float f = 0.0f;
        float f2 = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 2) {
                f = C143946b.m234054c(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                f2 = C143946b.m234054c(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new LanguageFluency(C144441e.m234702b(str), f, f2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LanguageFluency[i];
    }
}
