package com.google.android.gms.mobiledataplan.consent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.mobiledataplan.consent.i */
/* compiled from: PG */
public final class C145528i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        ParcelUuid parcelUuid = null;
        ConsentStatus consentStatus = null;
        Long l = null;
        Integer num = null;
        Long l2 = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 2:
                    parcelUuid = (ParcelUuid) C143946b.m234063l(parcel, readInt, ParcelUuid.CREATOR);
                    break;
                case 3:
                    consentStatus = (ConsentStatus) C143946b.m234063l(parcel, readInt, ConsentStatus.CREATOR);
                    break;
                case 4:
                    l = C143946b.m234068q(parcel, readInt);
                    break;
                case 5:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 6:
                    num = C143946b.m234067p(parcel, readInt);
                    break;
                case 7:
                    l2 = C143946b.m234068q(parcel, readInt);
                    break;
                case 8:
                    bundle = C143946b.m234061j(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new SetConsentStatusRequest(str, parcelUuid, consentStatus, l, i, num, l2, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SetConsentStatusRequest[i];
    }
}
