package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.x */
/* compiled from: PG */
public final class C142827x implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        CorpusId[] corpusIdArr = null;
        CorpusScoringInfo[] corpusScoringInfoArr = null;
        String str = null;
        byte[] bArr = null;
        int[] iArr = null;
        byte[] bArr2 = null;
        STSortSpec sTSortSpec = null;
        String str2 = null;
        CacheSpec cacheSpec = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    corpusIdArr = (CorpusId[]) C143946b.m234047D(parcel2, readInt, CorpusId.CREATOR);
                    break;
                case 2:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 3:
                    corpusScoringInfoArr = (CorpusScoringInfo[]) C143946b.m234047D(parcel2, readInt, CorpusScoringInfo.CREATOR);
                    break;
                case 4:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 5:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 6:
                    i4 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 7:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 8:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 9:
                    bArr = C143946b.m234044A(parcel2, readInt);
                    break;
                case 10:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 11:
                    z3 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 12:
                    z4 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 13:
                    iArr = C143946b.m234045B(parcel2, readInt);
                    break;
                case 14:
                    bArr2 = C143946b.m234044A(parcel2, readInt);
                    break;
                case 15:
                    sTSortSpec = (STSortSpec) C143946b.m234063l(parcel2, readInt, STSortSpec.CREATOR);
                    break;
                case 16:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 18:
                    cacheSpec = (CacheSpec) C143946b.m234063l(parcel2, readInt, CacheSpec.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new GlobalSearchQuerySpecification(corpusIdArr, i, corpusScoringInfoArr, i2, i3, i4, str, z, bArr, z2, z3, z4, iArr, bArr2, sTSortSpec, str2, cacheSpec);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchQuerySpecification[i];
    }
}
