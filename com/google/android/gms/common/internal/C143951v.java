package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.common.internal.v */
/* compiled from: PG */
public final class C143951v implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) C143946b.m234063l(parcel, readInt, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 3:
                    z2 = C143946b.m234077z(parcel, readInt);
                    break;
                case 4:
                    iArr = C143946b.m234045B(parcel, readInt);
                    break;
                case 5:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 6:
                    iArr2 = C143946b.m234045B(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArr, i, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
