package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.g */
/* compiled from: PG */
public final class C142810g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        Bundle bundle = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 2:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 3:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 4:
                    j3 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 5:
                    bundle = C143946b.m234061j(parcel2, readInt);
                    break;
                case 6:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new CorpusStatus(z, j, j2, j3, bundle, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CorpusStatus[i];
    }
}
