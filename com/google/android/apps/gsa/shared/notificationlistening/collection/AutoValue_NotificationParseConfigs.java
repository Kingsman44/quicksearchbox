package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
final class AutoValue_NotificationParseConfigs extends C$AutoValue_NotificationParseConfigs {
    public static final Parcelable.Creator CREATOR = new C90395b();

    public AutoValue_NotificationParseConfigs(C58485gu guVar, C58485gu guVar2, C58485gu guVar3, C58485gu guVar4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        super(guVar, guVar2, guVar3, guVar4, z, z2, z3, z4, z5, z6, z7, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f252355a);
        parcel.writeList(this.f252356b);
        parcel.writeList(this.f252357c);
        parcel.writeList(this.f252358d);
        parcel.writeInt(this.f252359e ? 1 : 0);
        parcel.writeInt(this.f252360f ? 1 : 0);
        parcel.writeInt(this.f252361g ? 1 : 0);
        parcel.writeInt(this.f252362h ? 1 : 0);
        parcel.writeInt(this.f252363i ? 1 : 0);
        parcel.writeInt(this.f252364j ? 1 : 0);
        parcel.writeInt(this.f252365k ? 1 : 0);
        parcel.writeInt(this.f252366l);
    }
}
