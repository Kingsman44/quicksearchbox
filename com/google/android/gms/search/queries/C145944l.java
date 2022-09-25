package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.search.queries.l */
/* compiled from: PG */
public final class C145944l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        QuerySpecification querySpecification = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
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
                    strArr = C143946b.m234048E(parcel, readInt);
                    break;
                case 4:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 5:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                case 6:
                    querySpecification = (QuerySpecification) C143946b.m234063l(parcel, readInt, QuerySpecification.CREATOR);
                    break;
                case 7:
                    bundle = C143946b.m234061j(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new QueryCall$Request(str, str2, strArr, i, i2, querySpecification, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new QueryCall$Request[i];
    }
}
