package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.measurement.internal.aq */
/* compiled from: PG */
public final class C145237aq implements Parcelable.Creator {
    /* renamed from: a */
    static void m235976a(EventParcel eventParcel, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, eventParcel.f392536a);
        C143947c.m234105x(parcel, 3, eventParcel.f392537b, i);
        C143947c.m234106y(parcel, 4, eventParcel.f392538c);
        C143947c.m234090i(parcel, 5, eventParcel.f392539d);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        EventParams eventParams = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                eventParams = (EventParams) C143946b.m234063l(parcel, readInt, EventParams.CREATOR);
            } else if (c == 4) {
                str2 = C143946b.m234069r(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                j = C143946b.m234060i(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new EventParcel(str, eventParams, str2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new EventParcel[i];
    }
}
