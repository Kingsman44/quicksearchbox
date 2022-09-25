package com.google.android.apps.search.googleapp.urlhandler.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4552o.C60492rx;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
final class AutoValue_UrlIntentResult extends C$AutoValue_UrlIntentResult {
    public static final Parcelable.Creator CREATOR = new C139800b();

    public AutoValue_UrlIntentResult(ProtoParsers.ParcelableProto parcelableProto, boolean z, boolean z2, int i, String str, boolean z3, boolean z4, Intent intent, boolean z5, C60492rx rxVar, boolean z6, Integer num) {
        super(parcelableProto, z, z2, i, str, z3, z4, intent, z5, rxVar, z6, num);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f379948a, i);
        parcel.writeInt(this.f379949b ? 1 : 0);
        parcel.writeInt(this.f379950c ? 1 : 0);
        parcel.writeString(C139822w.m227349a(this.f379959l));
        parcel.writeString(this.f379951d);
        parcel.writeInt(this.f379952e ? 1 : 0);
        parcel.writeInt(this.f379953f ? 1 : 0);
        parcel.writeParcelable(this.f379954g, i);
        parcel.writeInt(this.f379955h ? 1 : 0);
        parcel.writeString(this.f379956i.name());
        parcel.writeInt(this.f379957j ? 1 : 0);
        parcel.writeInt(this.f379958k.intValue());
    }
}
