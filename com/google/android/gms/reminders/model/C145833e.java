package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.reminders.model.e */
/* compiled from: PG */
public final class C145833e implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237579a(DailyPatternEntity dailyPatternEntity, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, dailyPatternEntity.f394258a, i);
        C143947c.m234101t(parcel, 3, dailyPatternEntity.f394259b);
        C143947c.m234092k(parcel, 4, dailyPatternEntity.f394260c);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        TimeEntity timeEntity = null;
        Integer num = null;
        Boolean bool = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                timeEntity = (TimeEntity) C143946b.m234063l(parcel, readInt, TimeEntity.CREATOR);
            } else if (c == 3) {
                num = C143946b.m234067p(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bool = C143946b.m234064m(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new DailyPatternEntity(timeEntity, num, bool);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DailyPatternEntity[i];
    }
}
