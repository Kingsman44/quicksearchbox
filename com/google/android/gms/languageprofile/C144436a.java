package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.languageprofile.a */
/* compiled from: PG */
public final class C144436a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        List emptyList = Collections.emptyList();
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                emptyList = C143946b.m234072u(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ClientLanguageSettings(emptyList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientLanguageSettings[i];
    }
}
