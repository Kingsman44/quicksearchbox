package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.reminders.model.ae */
/* compiled from: PG */
public final class C145825ae implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237568a(TimeEntity timeEntity, Parcel parcel) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234101t(parcel, 2, timeEntity.f394334a);
        C143947c.m234101t(parcel, 3, timeEntity.f394335b);
        C143947c.m234101t(parcel, 4, timeEntity.f394336c);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                num = C143946b.m234067p(parcel, readInt);
            } else if (c == 3) {
                num2 = C143946b.m234067p(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                num3 = C143946b.m234067p(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new TimeEntity(num, num2, num3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TimeEntity[i];
    }
}
