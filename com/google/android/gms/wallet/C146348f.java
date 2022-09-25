package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wallet.f */
/* compiled from: PG */
public final class C146348f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList = C143946b.m234070s(parcel, readInt);
                    break;
                case 4:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 5:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    arrayList2 = C143946b.m234070s(parcel, readInt);
                    break;
                case 7:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 8:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new IsReadyToPayRequest(arrayList, str, str2, arrayList2, z, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new IsReadyToPayRequest[i];
    }
}
