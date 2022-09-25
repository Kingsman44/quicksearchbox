package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;

/* renamed from: com.google.android.apps.gsa.shared.util.bn */
/* compiled from: PG */
final class C90770bn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new UserHandleCompat((UserHandle) parcel.readParcelable(UserHandle.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UserHandleCompat[i];
    }
}
