package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.measurement.internal.kb */
/* compiled from: PG */
public final class C145492kb implements Parcelable.Creator {
    /* renamed from: a */
    static void m236480a(UserAttributeParcel userAttributeParcel, Parcel parcel) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, userAttributeParcel.f392540a);
        C143947c.m234106y(parcel, 2, userAttributeParcel.f392541b);
        C143947c.m234090i(parcel, 3, userAttributeParcel.f392542c);
        C143947c.m234104w(parcel, 4, userAttributeParcel.f392543d);
        C143947c.m234106y(parcel, 6, userAttributeParcel.f392544e);
        C143947c.m234106y(parcel, 7, userAttributeParcel.f392545f);
        C143947c.m234096o(parcel, 8, userAttributeParcel.f392546g);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 4:
                    l = C143946b.m234068q(parcel2, readInt);
                    break;
                case 5:
                    f = C143946b.m234066o(parcel2, readInt);
                    break;
                case 6:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 8:
                    d = C143946b.m234065n(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new UserAttributeParcel(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UserAttributeParcel[i];
    }
}
