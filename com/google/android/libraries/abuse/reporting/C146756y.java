package com.google.android.libraries.abuse.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.abuse.reporting.y */
/* compiled from: PG */
final class C146756y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new ReportAbuseCardConfigParcel(parcel);
        } catch (C62974ct e) {
            Log.d("UrawCardConfigParcel", "Could not parse proto from parcel", e);
            return null;
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ReportAbuseCardConfigParcel[i];
    }
}
