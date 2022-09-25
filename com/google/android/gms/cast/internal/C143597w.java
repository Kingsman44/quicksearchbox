package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.cast.internal.w */
/* compiled from: PG */
public final class C143597w implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        ApplicationMetadata applicationMetadata = null;
        EqualizerSettings equalizerSettings = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    d = C143946b.m234053b(parcel2, readInt);
                    break;
                case 3:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 4:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 5:
                    applicationMetadata = (ApplicationMetadata) C143946b.m234063l(parcel2, readInt, ApplicationMetadata.CREATOR);
                    break;
                case 6:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 7:
                    equalizerSettings = (EqualizerSettings) C143946b.m234063l(parcel2, readInt, EqualizerSettings.CREATOR);
                    break;
                case 8:
                    d2 = C143946b.m234053b(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new DeviceStatus(d, z, i, applicationMetadata, i2, equalizerSettings, d2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceStatus[i];
    }
}
