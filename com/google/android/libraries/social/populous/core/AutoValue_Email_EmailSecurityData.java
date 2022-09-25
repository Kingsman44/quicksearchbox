package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutoValue_Email_EmailSecurityData extends C$AutoValue_Email_EmailSecurityData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42365z();

    /* renamed from: b */
    private static final ClassLoader f110685b = AutoValue_Email_EmailSecurityData.class.getClassLoader();

    public AutoValue_Email_EmailSecurityData(Parcel parcel) {
        super(((Boolean) parcel.readValue(f110685b)).booleanValue());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(Boolean.valueOf(this.f110638a));
    }

    public AutoValue_Email_EmailSecurityData(boolean z) {
        super(z);
    }
}
