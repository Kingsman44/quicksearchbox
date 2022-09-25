package com.google.android.gms.mobiledataplan.carriersupport;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.mobiledataplan.carriersupport.a */
/* compiled from: PG */
public final class C145518a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 2:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 3:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                case 4:
                    str4 = C143946b.m234069r(parcel, readInt);
                    break;
                case 5:
                    str5 = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new CarrierSupportChannel(str, str2, str3, str4, str5, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CarrierSupportChannel[i];
    }
}
