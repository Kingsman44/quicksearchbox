package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.vision.face.internal.client.d */
/* compiled from: PG */
public final class C146314d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        float f = -1.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 3:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                case 4:
                    i3 = C143946b.m234057f(parcel, readInt);
                    break;
                case 5:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 6:
                    z2 = C143946b.m234077z(parcel, readInt);
                    break;
                case 7:
                    f = C143946b.m234054c(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new FaceSettingsParcel(i, i2, i3, z, z2, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FaceSettingsParcel[i];
    }
}
