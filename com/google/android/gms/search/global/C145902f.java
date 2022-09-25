package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.search.global.f */
/* compiled from: PG */
public final class C145902f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        GetGlobalSearchSourcesCall$CorpusInfo[] getGlobalSearchSourcesCall$CorpusInfoArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 2:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 3:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                case 4:
                    i3 = C143946b.m234057f(parcel, readInt);
                    break;
                case 5:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    str4 = C143946b.m234069r(parcel, readInt);
                    break;
                case 7:
                    str5 = C143946b.m234069r(parcel, readInt);
                    break;
                case 8:
                    getGlobalSearchSourcesCall$CorpusInfoArr = (GetGlobalSearchSourcesCall$CorpusInfo[]) C143946b.m234047D(parcel, readInt, GetGlobalSearchSourcesCall$CorpusInfo.CREATOR);
                    break;
                case 9:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 10:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetGlobalSearchSourcesCall$GlobalSearchSource(str, str2, i, i2, i3, str3, str4, str5, getGlobalSearchSourcesCall$CorpusInfoArr, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetGlobalSearchSourcesCall$GlobalSearchSource[i];
    }
}
