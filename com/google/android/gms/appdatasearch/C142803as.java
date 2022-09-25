package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.as */
/* compiled from: PG */
public final class C142803as implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        DocumentId documentId = null;
        String str = null;
        DocumentContents documentContents = null;
        String str2 = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        int i2 = -1;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    documentId = (DocumentId) C143946b.m234063l(parcel2, readInt, DocumentId.CREATOR);
                    break;
                case 2:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 3:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 4:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 5:
                    documentContents = (DocumentContents) C143946b.m234063l(parcel2, readInt, DocumentContents.CREATOR);
                    break;
                case 6:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 7:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 8:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 9:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new UsageInfo(documentId, j, i, str, documentContents, z, i2, i3, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UsageInfo[i];
    }
}
