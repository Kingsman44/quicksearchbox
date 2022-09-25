package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.usonia.PeerAddress;

/* renamed from: com.google.android.gms.usonia.directory.internal.bp */
/* compiled from: PG */
public final class C146253bp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        PeerAddress peerAddress = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                peerAddress = (PeerAddress) C143946b.m234063l(parcel, readInt, PeerAddress.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new OnDistributedServiceOfflineParams(str, peerAddress);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OnDistributedServiceOfflineParams[i];
    }
}
