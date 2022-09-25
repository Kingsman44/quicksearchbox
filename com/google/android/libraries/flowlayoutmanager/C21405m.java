package com.google.android.libraries.flowlayoutmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.flowlayoutmanager.FlowLayoutManager;

/* renamed from: com.google.android.libraries.flowlayoutmanager.m */
/* compiled from: PG */
final class C21405m implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FlowLayoutManager.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FlowLayoutManager.SavedState[i];
    }
}
