package com.google.android.sidekick.shared.renderingcontext;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.sidekick.shared.remoteapi.RenderingContextParcelable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public class DeviceCapabilityContext extends RenderingContextParcelable {
    public static final Parcelable.Creator CREATOR = new C45333a();

    /* renamed from: a */
    public static final String f118463a = "com.google.android.sidekick.shared.renderingcontext.DeviceCapabilityContext";

    /* renamed from: b */
    public final AtomicBoolean f118464b = new AtomicBoolean();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f118464b.get() ? (byte) 1 : 0);
    }
}
