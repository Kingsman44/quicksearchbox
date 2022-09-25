package com.google.android.apps.gsa.search.shared.api;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.shared.api.a */
/* compiled from: PG */
final class C87503a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Uri uri = (Uri) parcel.readParcelable(UriRequest.class.getClassLoader());
        Map b = UriRequest.m142036b(parcel);
        Map b2 = UriRequest.m142036b(parcel);
        int readInt = parcel.readInt();
        if (readInt <= 0) {
            return new UriRequest(uri, b, b2, (byte[]) null);
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return new UriRequest(uri, b, b2, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UriRequest[i];
    }
}
