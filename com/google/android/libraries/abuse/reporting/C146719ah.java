package com.google.android.libraries.abuse.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.abuse.reporting.ah */
/* compiled from: PG */
final class C146719ah implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new ReportAbuseComponentState(parcel);
        } catch (C62974ct unused) {
            return null;
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ReportAbuseComponentState[i];
    }
}
