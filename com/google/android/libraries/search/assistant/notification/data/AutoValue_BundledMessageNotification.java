package com.google.android.libraries.search.assistant.notification.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
public final class AutoValue_BundledMessageNotification extends C$AutoValue_BundledMessageNotification {
    public static final Parcelable.Creator CREATOR = new C34884e();

    public AutoValue_BundledMessageNotification(C58485gu guVar) {
        super(guVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f92469a);
    }
}
