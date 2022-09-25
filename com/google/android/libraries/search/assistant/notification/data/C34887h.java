package com.google.android.libraries.search.assistant.notification.data;

import android.app.RemoteInput;
import android.os.Parcel;
import android.os.Parcelable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.h */
/* compiled from: PG */
final class C34887h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_MessageNotification_Actions(C34895p.m63751a(parcel), C34895p.m63751a(parcel), Optional.ofNullable((RemoteInput) parcel.readParcelable(RemoteInput.class.getClassLoader())));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_MessageNotification_Actions[i];
    }
}
