package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.measurement.internal.y */
/* compiled from: PG */
public final class C145509y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        UserAttributeParcel userAttributeParcel = null;
        String str3 = null;
        EventParcel eventParcel = null;
        EventParcel eventParcel2 = null;
        EventParcel eventParcel3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 4:
                    userAttributeParcel = (UserAttributeParcel) C143946b.m234063l(parcel2, readInt, UserAttributeParcel.CREATOR);
                    break;
                case 5:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 6:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 7:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 8:
                    eventParcel = (EventParcel) C143946b.m234063l(parcel2, readInt, EventParcel.CREATOR);
                    break;
                case 9:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 10:
                    eventParcel2 = (EventParcel) C143946b.m234063l(parcel2, readInt, EventParcel.CREATOR);
                    break;
                case 11:
                    j3 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 12:
                    eventParcel3 = (EventParcel) C143946b.m234063l(parcel2, readInt, EventParcel.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new ConditionalUserPropertyParcel(str, str2, userAttributeParcel, j, z, str3, eventParcel, j2, eventParcel2, j3, eventParcel3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConditionalUserPropertyParcel[i];
    }
}
