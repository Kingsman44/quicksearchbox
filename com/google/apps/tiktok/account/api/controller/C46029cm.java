package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.apps.tiktok.account.api.controller.cm */
/* compiled from: PG */
final class C46029cm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        boolean z2 = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        return new AutoValue_ValidationResult(z2, z, (Intent) parcel.readParcelable(getClass().getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ValidationResult[i];
    }
}
