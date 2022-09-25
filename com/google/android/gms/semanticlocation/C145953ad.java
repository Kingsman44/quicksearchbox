package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.semanticlocation.ad */
/* compiled from: PG */
public final class C145953ad implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        Visit visit = null;
        Activity activity = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 2:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 3:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 4:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 5:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 6:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 7:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 8:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 9:
                    visit = (Visit) C143946b.m234063l(parcel2, readInt, Visit.CREATOR);
                    break;
                case 10:
                    activity = (Activity) C143946b.m234063l(parcel2, readInt, Activity.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new SemanticSegment(j, j2, i, i2, z, z2, str, i3, visit, activity);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SemanticSegment[i];
    }
}
