package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.mobiledataplan.y */
/* compiled from: PG */
public final class C145551y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        long j = 0;
        String str = null;
        Long l = null;
        String str2 = null;
        String str3 = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        String str4 = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 4:
                    l = C143946b.m234068q(parcel2, readInt);
                    break;
                case 5:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 6:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    l2 = C143946b.m234068q(parcel2, readInt);
                    break;
                case 8:
                    l3 = C143946b.m234068q(parcel2, readInt);
                    break;
                case 9:
                    l4 = C143946b.m234068q(parcel2, readInt);
                    break;
                case 10:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new WalletBalanceInfo(j, str, i, l, str2, str3, l2, l3, l4, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletBalanceInfo[i];
    }
}
