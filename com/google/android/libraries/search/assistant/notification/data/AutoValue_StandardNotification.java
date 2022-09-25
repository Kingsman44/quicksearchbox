package com.google.android.libraries.search.assistant.notification.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class AutoValue_StandardNotification extends C$AutoValue_StandardNotification {
    public static final Parcelable.Creator CREATOR = new C34888i();

    public AutoValue_StandardNotification(String str, String str2, Optional optional, Optional optional2, Optional optional3, boolean z, String str3, Optional optional4, Optional optional5, Optional optional6, CharSequence charSequence) {
        super(str, str2, optional, optional2, optional3, z, str3, optional4, optional5, optional6, charSequence);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f92495a);
        parcel.writeString(this.f92496b);
        C34897r.m63755b(this.f92497c, parcel);
        C34896q.m63753a(this.f92498d, parcel);
        C34897r.m63755b(this.f92499e, parcel);
        parcel.writeInt(this.f92500f ? 1 : 0);
        parcel.writeString(this.f92501g);
        C34894o.m63750b(this.f92502h, parcel);
        C34894o.m63750b(this.f92503i, parcel);
        C34893n.m63748b(this.f92504j, parcel);
        TextUtils.writeToParcel(this.f92505k, parcel, 0);
    }
}
