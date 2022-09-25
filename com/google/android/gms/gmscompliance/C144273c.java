package com.google.android.gms.gmscompliance;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.gmscompliance.c */
/* compiled from: PG */
public final class C144273c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        PendingIntent pendingIntent = null;
        byte[] bArr = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 2:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) C143946b.m234063l(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 4:
                    z2 = C143946b.m234077z(parcel, readInt);
                    break;
                case 5:
                    j = C143946b.m234060i(parcel, readInt);
                    break;
                case 6:
                    bArr = C143946b.m234044A(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new GmsDeviceComplianceResponse(i, z, pendingIntent, z2, j, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GmsDeviceComplianceResponse[i];
    }
}
