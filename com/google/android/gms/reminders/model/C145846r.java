package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.reminders.model.r */
/* compiled from: PG */
public final class C145846r implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237596a(RecurrenceEndEntity recurrenceEndEntity, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, recurrenceEndEntity.f394290a, i);
        C143947c.m234101t(parcel, 4, recurrenceEndEntity.f394291b);
        C143947c.m234092k(parcel, 5, recurrenceEndEntity.f394292c);
        C143947c.m234105x(parcel, 6, recurrenceEndEntity.f394293d, i);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        DateTimeEntity dateTimeEntity = null;
        Integer num = null;
        Boolean bool = null;
        DateTimeEntity dateTimeEntity2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                dateTimeEntity = (DateTimeEntity) C143946b.m234063l(parcel, readInt, DateTimeEntity.CREATOR);
            } else if (c == 4) {
                num = C143946b.m234067p(parcel, readInt);
            } else if (c == 5) {
                bool = C143946b.m234064m(parcel, readInt);
            } else if (c != 6) {
                C143946b.m234076y(parcel, readInt);
            } else {
                dateTimeEntity2 = (DateTimeEntity) C143946b.m234063l(parcel, readInt, DateTimeEntity.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new RecurrenceEndEntity(dateTimeEntity, num, bool, dateTimeEntity2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RecurrenceEndEntity[i];
    }
}
