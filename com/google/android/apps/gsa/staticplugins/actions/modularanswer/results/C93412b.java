package com.google.android.apps.gsa.staticplugins.actions.modularanswer.results;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ClockResult;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.b */
/* compiled from: PG */
final class C93412b implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ClockResult.TimeInfo(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ClockResult.TimeInfo[i];
    }
}
