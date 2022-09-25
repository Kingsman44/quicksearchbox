package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wallet.g */
/* compiled from: PG */
public final class C146366g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        ArrayList arrayList6 = arrayList3;
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        TimeInterval timeInterval = null;
        String str11 = null;
        String str12 = null;
        LoyaltyPoints loyaltyPoints = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 4:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 5:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 6:
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    str6 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 8:
                    str7 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 9:
                    str8 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 10:
                    str9 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 11:
                    str10 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 12:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 13:
                    arrayList4 = C143946b.m234073v(parcel2, readInt, WalletObjectMessage.CREATOR);
                    break;
                case 14:
                    timeInterval = (TimeInterval) C143946b.m234063l(parcel2, readInt, TimeInterval.CREATOR);
                    break;
                case 15:
                    arrayList5 = C143946b.m234073v(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 17:
                    str12 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 18:
                    arrayList6 = C143946b.m234073v(parcel2, readInt, LabelValueRow.CREATOR);
                    break;
                case 19:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 20:
                    arrayList7 = C143946b.m234073v(parcel2, readInt, UriData.CREATOR);
                    break;
                case 21:
                    arrayList8 = C143946b.m234073v(parcel2, readInt, TextModuleData.CREATOR);
                    break;
                case 22:
                    arrayList9 = C143946b.m234073v(parcel2, readInt, UriData.CREATOR);
                    break;
                case 23:
                    loyaltyPoints = (LoyaltyPoints) C143946b.m234063l(parcel2, readInt, LoyaltyPoints.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new LoyaltyWalletObject(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i, arrayList4, timeInterval, arrayList5, str11, str12, arrayList6, z, arrayList7, arrayList8, arrayList9, loyaltyPoints);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyWalletObject[i];
    }
}
