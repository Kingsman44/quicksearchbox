package com.google.android.libraries.gcoreclient.cast.impl;

import android.os.Parcel;
import com.google.android.gms.cast.CastDevice;
import com.google.android.libraries.gcoreclient.cast.GcoreCastDevice;

@Deprecated
/* compiled from: PG */
public abstract class BaseGcoreCastDeviceImpl implements GcoreCastDevice {

    /* renamed from: a */
    public final CastDevice f59914a;

    public BaseGcoreCastDeviceImpl() {
        this.f59914a = null;
    }

    public BaseGcoreCastDeviceImpl(Parcel parcel) {
        this.f59914a = (CastDevice) parcel.readParcelable(GcoreCastDeviceImpl.class.getClassLoader());
    }

    public BaseGcoreCastDeviceImpl(CastDevice castDevice) {
        this.f59914a = castDevice;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f59914a, i);
    }
}
