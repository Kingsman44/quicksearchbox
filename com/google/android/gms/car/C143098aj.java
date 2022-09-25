package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarCall;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.car.aj */
/* compiled from: PG */
public final class C143098aj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        CarCall carCall = null;
        ArrayList arrayList = null;
        String str = null;
        CarCall.Details details = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 2:
                    carCall = (CarCall) C143946b.m234063l(parcel, readInt, CarCall.CREATOR);
                    break;
                case 3:
                    arrayList = C143946b.m234072u(parcel, readInt);
                    break;
                case 4:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 5:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                case 6:
                    details = (CarCall.Details) C143946b.m234063l(parcel, readInt, CarCall.Details.CREATOR);
                    break;
                case 7:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 8:
                    arrayList2 = C143946b.m234073v(parcel, readInt, CarCall.CREATOR);
                    break;
                case 9:
                    arrayList3 = C143946b.m234073v(parcel, readInt, CarCall.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new CarCall(i, carCall, arrayList, str, i2, details, z, arrayList2, arrayList3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CarCall[i];
    }
}
