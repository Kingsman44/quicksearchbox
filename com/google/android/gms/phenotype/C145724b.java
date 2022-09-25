package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.phenotype.b */
/* compiled from: PG */
public final class C145724b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        Configuration[] configurationArr = null;
        byte[] bArr = null;
        long j = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 3:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 4:
                    configurationArr = (Configuration[]) C143946b.m234047D(parcel, readInt, Configuration.CREATOR);
                    break;
                case 5:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 6:
                    bArr = C143946b.m234044A(parcel, readInt);
                    break;
                case 7:
                    j = C143946b.m234060i(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new Configurations(str, str2, configurationArr, z, bArr, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Configurations[i];
    }
}
