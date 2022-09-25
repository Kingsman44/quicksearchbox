package com.google.android.libraries.search.assistant.notification.data;

import android.os.Parcel;
import android.os.Parcelable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.i */
/* compiled from: PG */
final class C34888i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Optional a = C34897r.m63754a(parcel);
        Optional ofNullable = Optional.ofNullable(parcel.readString());
        Optional a2 = C34897r.m63754a(parcel);
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new AutoValue_StandardNotification(readString, readString2, a, ofNullable, a2, z, parcel.readString(), C34894o.m63749a(parcel), C34894o.m63749a(parcel), C34893n.m63747a(parcel), C34892m.m63746a(parcel));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_StandardNotification[i];
    }
}
