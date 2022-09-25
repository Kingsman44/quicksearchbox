package com.google.android.gms.libs.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.gms.libs.identity.a */
/* compiled from: PG */
public final class C144867a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        List m = C58485gu.m89845m();
        String str = null;
        String str2 = null;
        String str3 = null;
        ClientIdentity clientIdentity = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 2:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                case 3:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 4:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 5:
                    i3 = C143946b.m234057f(parcel, readInt);
                    break;
                case 6:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                case 7:
                    clientIdentity = (ClientIdentity) C143946b.m234063l(parcel, readInt, ClientIdentity.CREATOR);
                    break;
                case 8:
                    m = C143946b.m234073v(parcel, readInt, Feature.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new ClientIdentity(i, i2, str, str2, str3, i3, m, clientIdentity);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientIdentity[i];
    }
}
