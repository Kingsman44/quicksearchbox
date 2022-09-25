package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.reminders.model.v */
/* compiled from: PG */
public final class C145850v implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237601a(RecurrenceStartEntity recurrenceStartEntity, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, recurrenceStartEntity.f394306a, i);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        DateTimeEntity dateTimeEntity = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                dateTimeEntity = (DateTimeEntity) C143946b.m234063l(parcel, readInt, DateTimeEntity.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new RecurrenceStartEntity(dateTimeEntity);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RecurrenceStartEntity[i];
    }
}
