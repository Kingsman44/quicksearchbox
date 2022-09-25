package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.l */
/* compiled from: PG */
public final class C144951l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        String str = null;
        ArrayList arrayList2 = null;
        String str2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = C143946b.m234073v(parcel, readInt, ActivityTransition.CREATOR);
            } else if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                arrayList2 = C143946b.m234073v(parcel, readInt, ClientIdentity.CREATOR);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                str2 = C143946b.m234069r(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ActivityTransitionRequest(arrayList, str, arrayList2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionRequest[i];
    }
}
