package com.google.android.libraries.gcoreclient.cast.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;

@Deprecated
/* compiled from: PG */
public class GcoreCastDeviceImpl extends BaseGcoreCastDeviceImpl {
    public static final Parcelable.Creator CREATOR = new C21481b();

    public GcoreCastDeviceImpl() {
    }

    public GcoreCastDeviceImpl(Parcel parcel) {
        super(parcel);
    }

    public GcoreCastDeviceImpl(CastDevice castDevice) {
        super(castDevice);
    }
}
