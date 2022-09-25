package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.reminders.model.g */
/* compiled from: PG */
public final class C145835g implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237581a(DateTimeEntity dateTimeEntity, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234101t(parcel, 2, dateTimeEntity.f394261a);
        C143947c.m234101t(parcel, 3, dateTimeEntity.f394262b);
        C143947c.m234101t(parcel, 4, dateTimeEntity.f394263c);
        C143947c.m234105x(parcel, 5, dateTimeEntity.f394264d, i);
        C143947c.m234101t(parcel, 6, dateTimeEntity.f394265e);
        C143947c.m234101t(parcel, 7, dateTimeEntity.f394266f);
        C143947c.m234104w(parcel, 8, dateTimeEntity.f394267g);
        C143947c.m234092k(parcel, 9, dateTimeEntity.f394268h);
        C143947c.m234092k(parcel, 10, dateTimeEntity.f394269i);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        TimeEntity timeEntity = null;
        Integer num4 = null;
        Integer num5 = null;
        Long l = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    num = C143946b.m234067p(parcel, readInt);
                    break;
                case 3:
                    num2 = C143946b.m234067p(parcel, readInt);
                    break;
                case 4:
                    num3 = C143946b.m234067p(parcel, readInt);
                    break;
                case 5:
                    timeEntity = (TimeEntity) C143946b.m234063l(parcel, readInt, TimeEntity.CREATOR);
                    break;
                case 6:
                    num4 = C143946b.m234067p(parcel, readInt);
                    break;
                case 7:
                    num5 = C143946b.m234067p(parcel, readInt);
                    break;
                case 8:
                    l = C143946b.m234068q(parcel, readInt);
                    break;
                case 9:
                    bool = C143946b.m234064m(parcel, readInt);
                    break;
                case 10:
                    bool2 = C143946b.m234064m(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new DateTimeEntity(num, num2, num3, timeEntity, num4, num5, l, bool, bool2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DateTimeEntity[i];
    }
}
