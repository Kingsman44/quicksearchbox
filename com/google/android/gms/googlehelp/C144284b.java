package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.googlehelp.b */
/* compiled from: PG */
public final class C144284b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Boolean bool = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        byte[][] bArr = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 3:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                case 4:
                    arrayList = C143946b.m234072u(parcel, readInt);
                    break;
                case 5:
                    arrayList2 = C143946b.m234071t(parcel, readInt);
                    break;
                case 6:
                    arrayList3 = C143946b.m234072u(parcel, readInt);
                    break;
                case 7:
                    arrayList4 = C143946b.m234071t(parcel, readInt);
                    break;
                case 8:
                    bArr = C143946b.m234050G(parcel, readInt);
                    break;
                case 9:
                    bool = C143946b.m234064m(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new FRDProductSpecificDataEntry(i, i2, arrayList, arrayList2, arrayList3, arrayList4, bArr, bool.booleanValue());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FRDProductSpecificDataEntry[i];
    }
}
