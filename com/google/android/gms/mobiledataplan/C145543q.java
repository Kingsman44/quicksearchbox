package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.mobiledataplan.q */
/* compiled from: PG */
public final class C145543q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        MdpDataPlanStatus[] mdpDataPlanStatusArr = null;
        Bundle bundle = null;
        String str2 = null;
        WalletBalanceInfo walletBalanceInfo = null;
        Integer num = null;
        Long l = null;
        Long l2 = null;
        CellularInfo[] cellularInfoArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 2:
                    mdpDataPlanStatusArr = (MdpDataPlanStatus[]) C143946b.m234047D(parcel, readInt, MdpDataPlanStatus.CREATOR);
                    break;
                case 3:
                    bundle = C143946b.m234061j(parcel, readInt);
                    break;
                case 4:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 5:
                    walletBalanceInfo = (WalletBalanceInfo) C143946b.m234063l(parcel, readInt, WalletBalanceInfo.CREATOR);
                    break;
                case 6:
                    num = C143946b.m234067p(parcel, readInt);
                    break;
                case 7:
                    l = C143946b.m234068q(parcel, readInt);
                    break;
                case 8:
                    l2 = C143946b.m234068q(parcel, readInt);
                    break;
                case 9:
                    cellularInfoArr = (CellularInfo[]) C143946b.m234047D(parcel, readInt, CellularInfo.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new MdpDataPlanStatusResponse(str, mdpDataPlanStatusArr, bundle, str2, walletBalanceInfo, num, l, l2, cellularInfoArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MdpDataPlanStatusResponse[i];
    }
}
