package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.mobiledataplan.s */
/* compiled from: PG */
public final class C145545s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Bundle bundle = null;
        Integer num = null;
        Long l = null;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 2:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 4:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 5:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 6:
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    str6 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 8:
                    bundle = C143946b.m234061j(parcel2, readInt);
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
        return new MdpPurchaseOfferResponse(str, str2, str3, str4, j, str5, str6, bundle, num, l);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MdpPurchaseOfferResponse[i];
    }
}
