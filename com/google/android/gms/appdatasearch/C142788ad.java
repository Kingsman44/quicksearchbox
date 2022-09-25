package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.appdatasearch.ad */
/* compiled from: PG */
public final class C142788ad implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int[] iArr = null;
        byte[] bArr = null;
        STSortSpec sTSortSpec = null;
        String str = null;
        CacheSpec cacheSpec = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = true;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 2:
                    arrayList = C143946b.m234072u(parcel2, readInt);
                    break;
                case 3:
                    arrayList2 = C143946b.m234073v(parcel2, readInt, Section.CREATOR);
                    break;
                case 4:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 5:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 6:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 7:
                    z3 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 8:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 9:
                    z4 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 10:
                    iArr = C143946b.m234045B(parcel2, readInt);
                    break;
                case 11:
                    bArr = C143946b.m234044A(parcel2, readInt);
                    break;
                case 12:
                    sTSortSpec = (STSortSpec) C143946b.m234063l(parcel2, readInt, STSortSpec.CREATOR);
                    break;
                case 13:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 15:
                    cacheSpec = (CacheSpec) C143946b.m234063l(parcel2, readInt, CacheSpec.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new QuerySpecification(z, arrayList, arrayList2, z2, i, i2, z3, i3, z4, iArr, bArr, sTSortSpec, str, cacheSpec);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new QuerySpecification[i];
    }
}
