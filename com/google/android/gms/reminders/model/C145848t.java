package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.reminders.model.t */
/* compiled from: PG */
public final class C145848t implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237599a(RecurrenceInfoEntity recurrenceInfoEntity, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, recurrenceInfoEntity.f394302a, i);
        C143947c.m234106y(parcel, 3, recurrenceInfoEntity.f394303b);
        C143947c.m234092k(parcel, 4, recurrenceInfoEntity.f394304c);
        C143947c.m234092k(parcel, 5, recurrenceInfoEntity.f394305d);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        RecurrenceEntity recurrenceEntity = null;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                recurrenceEntity = (RecurrenceEntity) C143946b.m234063l(parcel, readInt, RecurrenceEntity.CREATOR);
            } else if (c == 3) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 4) {
                bool = C143946b.m234064m(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bool2 = C143946b.m234064m(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new RecurrenceInfoEntity(recurrenceEntity, str, bool, bool2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RecurrenceInfoEntity[i];
    }
}
