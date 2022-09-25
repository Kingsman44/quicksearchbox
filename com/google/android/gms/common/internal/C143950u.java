package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.common.internal.u */
/* compiled from: PG */
public final class C143950u implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bundle = C143946b.m234061j(parcel, readInt);
            } else if (c == 2) {
                featureArr = (Feature[]) C143946b.m234047D(parcel, readInt, Feature.CREATOR);
            } else if (c == 3) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) C143946b.m234063l(parcel, readInt, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ConnectionInfo(bundle, featureArr, i, connectionTelemetryConfiguration);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionInfo[i];
    }
}
