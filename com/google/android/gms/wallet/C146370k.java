package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.identity.intents.model.UserAddress;

/* renamed from: com.google.android.gms.wallet.k */
/* compiled from: PG */
public final class C146370k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        CardInfo cardInfo = null;
        UserAddress userAddress = null;
        PaymentMethodToken paymentMethodToken = null;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        Bundle bundle2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 2:
                    cardInfo = (CardInfo) C143946b.m234063l(parcel, readInt, CardInfo.CREATOR);
                    break;
                case 3:
                    userAddress = (UserAddress) C143946b.m234063l(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 4:
                    paymentMethodToken = (PaymentMethodToken) C143946b.m234063l(parcel, readInt, PaymentMethodToken.CREATOR);
                    break;
                case 5:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    bundle = C143946b.m234061j(parcel, readInt);
                    break;
                case 7:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                case 8:
                    bundle2 = C143946b.m234061j(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new PaymentData(str, cardInfo, userAddress, paymentMethodToken, str2, bundle, str3, bundle2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentData[i];
    }
}
