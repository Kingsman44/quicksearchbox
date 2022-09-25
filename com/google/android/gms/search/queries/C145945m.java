package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.search.queries.m */
/* compiled from: PG */
public final class C145945m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Status status = null;
        SearchResults searchResults = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                status = (Status) C143946b.m234063l(parcel, readInt, Status.CREATOR);
            } else if (c == 2) {
                searchResults = (SearchResults) C143946b.m234063l(parcel, readInt, SearchResults.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bundle = C143946b.m234061j(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new QueryCall$Response(status, searchResults, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new QueryCall$Response[i];
    }
}
