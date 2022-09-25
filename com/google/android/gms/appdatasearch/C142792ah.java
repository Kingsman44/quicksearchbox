package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.ah */
/* compiled from: PG */
public final class C142792ah implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Feature[] featureArr = null;
        String str4 = null;
        ScoringConfig scoringConfig = null;
        boolean z = false;
        int i = 1;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 11) {
                str4 = C143946b.m234069r(parcel, readInt);
            } else if (c != 12) {
                switch (c) {
                    case 1:
                        str = C143946b.m234069r(parcel, readInt);
                        break;
                    case 2:
                        str2 = C143946b.m234069r(parcel, readInt);
                        break;
                    case 3:
                        z = C143946b.m234077z(parcel, readInt);
                        break;
                    case 4:
                        i = C143946b.m234057f(parcel, readInt);
                        break;
                    case 5:
                        z2 = C143946b.m234077z(parcel, readInt);
                        break;
                    case 6:
                        str3 = C143946b.m234069r(parcel, readInt);
                        break;
                    case 7:
                        featureArr = (Feature[]) C143946b.m234047D(parcel, readInt, Feature.CREATOR);
                        break;
                    default:
                        C143946b.m234076y(parcel, readInt);
                        break;
                }
            } else {
                scoringConfig = (ScoringConfig) C143946b.m234063l(parcel, readInt, ScoringConfig.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new RegisterSectionInfo(str, str2, z, i, z2, str3, featureArr, str4, scoringConfig);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterSectionInfo[i];
    }
}
