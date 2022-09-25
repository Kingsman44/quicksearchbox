package com.google.android.apps.gsa.search.shared.actions.errors;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.errors.e */
/* compiled from: PG */
final class C87417e implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new WebSearchConnectionError(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WebSearchConnectionError[i];
    }
}
