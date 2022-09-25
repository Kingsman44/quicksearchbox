package com.google.android.apps.gsa.search.shared.actions.util;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.util.g */
/* compiled from: PG */
final class C87485g implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ImageInfo(parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ImageInfo[i];
    }
}
