package com.google.android.libraries.componentview.services.application;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.componentview.services.application.cg */
/* compiled from: PG */
final class C20607cg implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        C20608ch c = NavigationParams.m38563c();
        c.mo25556b(((Boolean) parcel.readValue((ClassLoader) null)).booleanValue());
        ((C20617h) c).f57836a = (Long) parcel.readValue((ClassLoader) null);
        return c.mo25555a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new NavigationParams[i];
    }
}
