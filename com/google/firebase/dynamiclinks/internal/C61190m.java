package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
import java.util.ArrayList;

/* renamed from: com.google.firebase.dynamiclinks.internal.m */
/* compiled from: PG */
public final class C61190m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                uri = (Uri) C143946b.m234063l(parcel, readInt, Uri.CREATOR);
            } else if (c == 2) {
                uri2 = (Uri) C143946b.m234063l(parcel, readInt, Uri.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList = C143946b.m234073v(parcel, readInt, ShortDynamicLinkImpl.WarningImpl.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ShortDynamicLinkImpl(uri, uri2, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ShortDynamicLinkImpl[i];
    }
}
