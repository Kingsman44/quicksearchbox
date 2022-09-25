package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wearable.internal.g */
/* compiled from: PG */
public final class C146507g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        ArrayList arrayList = null;
        WebIconParcelable webIconParcelable = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 2) {
                arrayList = C143946b.m234073v(parcel, readInt, AppParcelable.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                webIconParcelable = (WebIconParcelable) C143946b.m234063l(parcel, readInt, WebIconParcelable.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new AppRecommendationsResponse(i, arrayList, webIconParcelable);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AppRecommendationsResponse[i];
    }
}
