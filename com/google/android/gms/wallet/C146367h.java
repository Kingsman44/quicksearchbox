package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.identity.intents.model.UserAddress;

/* renamed from: com.google.android.gms.wallet.h */
/* compiled from: PG */
public final class C146367h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        Address address = null;
        Address address2 = null;
        LoyaltyWalletObject[] loyaltyWalletObjectArr = null;
        OfferWalletObject[] offerWalletObjectArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
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
                    strArr = C143946b.m234048E(parcel, readInt);
                    break;
                case 5:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    address = (Address) C143946b.m234063l(parcel, readInt, Address.CREATOR);
                    break;
                case 7:
                    address2 = (Address) C143946b.m234063l(parcel, readInt, Address.CREATOR);
                    break;
                case 8:
                    loyaltyWalletObjectArr = (LoyaltyWalletObject[]) C143946b.m234047D(parcel, readInt, LoyaltyWalletObject.CREATOR);
                    break;
                case 9:
                    offerWalletObjectArr = (OfferWalletObject[]) C143946b.m234047D(parcel, readInt, OfferWalletObject.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) C143946b.m234063l(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) C143946b.m234063l(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 12:
                    instrumentInfoArr = (InstrumentInfo[]) C143946b.m234047D(parcel, readInt, InstrumentInfo.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new MaskedWallet(str, str2, strArr, str3, address, address2, loyaltyWalletObjectArr, offerWalletObjectArr, userAddress, userAddress2, instrumentInfoArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MaskedWallet[i];
    }
}
