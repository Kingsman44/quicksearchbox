package com.google.android.libraries.abuse.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel;

/* renamed from: com.google.android.libraries.abuse.reporting.z */
/* compiled from: PG */
final class C146757z implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ReportAbuseCardConfigParcel.ButtonState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ReportAbuseCardConfigParcel.ButtonState[i];
    }
}
