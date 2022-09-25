package com.google.android.gms.usonia.iam.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.usonia.PeerAddress;

/* renamed from: com.google.android.gms.usonia.iam.internal.b */
/* compiled from: PG */
public final class C146292b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        PeerAddress peerAddress = null;
        String[] strArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                peerAddress = (PeerAddress) C143946b.m234063l(parcel, readInt, PeerAddress.CREATOR);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                strArr = C143946b.m234048E(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new MayPeerAccessServiceParams(peerAddress, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MayPeerAccessServiceParams[i];
    }
}
