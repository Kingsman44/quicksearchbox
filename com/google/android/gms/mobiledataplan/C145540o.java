package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;

/* renamed from: com.google.android.gms.mobiledataplan.o */
/* compiled from: PG */
public final class C145540o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        CarrierSupportInfo carrierSupportInfo = null;
        Integer num = null;
        Long l = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 2:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 3:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 4:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 5:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 6:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 8:
                    carrierSupportInfo = (CarrierSupportInfo) C143946b.m234063l(parcel2, readInt, CarrierSupportInfo.CREATOR);
                    break;
                case 9:
                    num = C143946b.m234067p(parcel2, readInt);
                    break;
                case 10:
                    l = C143946b.m234068q(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new MdpCarrierPlanIdResponse(str, j, str2, str3, j2, str4, i, carrierSupportInfo, num, l);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MdpCarrierPlanIdResponse[i];
    }
}
