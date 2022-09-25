package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.cast.d */
/* compiled from: PG */
public final class C143377d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 3:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 4:
                    C143946b.m234073v(parcel, readInt, WebImage.CREATOR);
                    break;
                case 5:
                    arrayList = C143946b.m234072u(parcel, readInt);
                    break;
                case 6:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                case 7:
                    uri = (Uri) C143946b.m234063l(parcel, readInt, Uri.CREATOR);
                    break;
                case 8:
                    str4 = C143946b.m234069r(parcel, readInt);
                    break;
                case 9:
                    str5 = C143946b.m234069r(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new ApplicationMetadata(str, str2, arrayList, str3, uri, str4, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ApplicationMetadata[i];
    }
}
