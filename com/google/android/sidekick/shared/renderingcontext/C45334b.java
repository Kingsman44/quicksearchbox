package com.google.android.sidekick.shared.renderingcontext;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.sidekick.shared.renderingcontext.b */
/* compiled from: PG */
final class C45334b implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new NavigationContext(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new NavigationContext[i];
    }
}
