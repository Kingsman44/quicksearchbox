package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wearable.internal.bb */
/* compiled from: PG */
public final class C146444bb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        NodeParcelable nodeParcelable = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                nodeParcelable = (NodeParcelable) C143946b.m234063l(parcel, readInt, NodeParcelable.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetLocalNodeResponse(i, nodeParcelable);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetLocalNodeResponse[i];
    }
}
