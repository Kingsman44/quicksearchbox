package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.mobstore.a */
/* compiled from: PG */
public final class C145552a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Uri uri = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                uri = (Uri) C143946b.m234063l(parcel, readInt, Uri.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new DeleteFileRequest(uri);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DeleteFileRequest[i];
    }
}
