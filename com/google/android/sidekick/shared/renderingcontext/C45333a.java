package com.google.android.sidekick.shared.renderingcontext;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.sidekick.shared.renderingcontext.a */
/* compiled from: PG */
final class C45333a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = parcel.readByte() != 0;
        DeviceCapabilityContext deviceCapabilityContext = new DeviceCapabilityContext();
        deviceCapabilityContext.f118464b.set(z);
        return deviceCapabilityContext;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceCapabilityContext[i];
    }
}
