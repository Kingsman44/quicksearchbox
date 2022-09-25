package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.mobstore.w */
/* compiled from: PG */
public final class C145575w implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Uri uri = null;
        Uri uri2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                uri = (Uri) C143946b.m234063l(parcel, readInt, Uri.CREATOR);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                uri2 = (Uri) C143946b.m234063l(parcel, readInt, Uri.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new RenameRequest(uri, uri2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RenameRequest[i];
    }
}