package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.search.queries.j */
/* compiled from: PG */
public final class C145942j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        GlobalSearchQuerySpecification globalSearchQuerySpecification = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                i2 = C143946b.m234057f(parcel, readInt);
            } else if (c == 4) {
                globalSearchQuerySpecification = (GlobalSearchQuerySpecification) C143946b.m234063l(parcel, readInt, GlobalSearchQuerySpecification.CREATOR);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bundle = C143946b.m234061j(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GlobalQueryCall$Request(str, i, i2, globalSearchQuerySpecification, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalQueryCall$Request[i];
    }
}
