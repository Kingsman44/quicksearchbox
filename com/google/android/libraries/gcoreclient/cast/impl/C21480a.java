package com.google.android.libraries.gcoreclient.cast.impl;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import com.google.android.libraries.gcoreclient.cast.GcoreCastDevice;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.cast.impl.a */
/* compiled from: PG */
public final class C21480a {
    /* renamed from: a */
    public static final GcoreCastDevice m40590a(Bundle bundle) {
        CastDevice a = CastDevice.m232553a(bundle);
        if (a != null) {
            return new GcoreCastDeviceImpl(a);
        }
        return null;
    }
}
