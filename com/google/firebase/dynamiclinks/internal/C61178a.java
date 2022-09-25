package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.firebase.dynamiclinks.internal.a */
/* compiled from: PG */
public final class C61178a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Uri uri = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 2:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 3:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 4:
                    j = C143946b.m234060i(parcel, readInt);
                    break;
                case 5:
                    bundle = C143946b.m234061j(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) C143946b.m234063l(parcel, readInt, Uri.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new DynamicLinkData(str, str2, i, j, bundle, uri);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DynamicLinkData[i];
    }
}
