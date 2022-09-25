package com.google.android.apps.gsa.sidekick.shared.training;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.sidekick.shared.training.InterestLauncherHelper;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.training.b */
/* compiled from: PG */
final class C91922b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        InterestLauncherHelper.Options options = new InterestLauncherHelper.Options();
        options.f256343a = parcel.readString();
        options.f256344b = parcel.readInt();
        return options;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InterestLauncherHelper.Options[i];
    }
}
