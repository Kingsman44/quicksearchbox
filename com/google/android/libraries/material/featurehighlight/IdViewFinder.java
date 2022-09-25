package com.google.android.libraries.material.featurehighlight;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
public final class IdViewFinder extends ViewFinder {
    public static final Parcelable.Creator CREATOR = new C28513ad();

    /* renamed from: a */
    private final int f77358a;

    public IdViewFinder(int i) {
        this.f77358a = i;
    }

    public IdViewFinder(Parcel parcel) {
        this.f77358a = parcel.readInt();
    }

    /* renamed from: a */
    public final View mo33963a(Activity activity, View view) {
        View findViewById = view != null ? view.findViewById(this.f77358a) : null;
        return findViewById == null ? activity.findViewById(this.f77358a) : findViewById;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f77358a);
    }
}
