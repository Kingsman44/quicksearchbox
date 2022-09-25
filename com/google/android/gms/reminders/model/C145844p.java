package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.reminders.model.p */
/* compiled from: PG */
public final class C145844p implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237594a(RecurrenceEntity recurrenceEntity, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234101t(parcel, 2, recurrenceEntity.f394294a);
        C143947c.m234101t(parcel, 3, recurrenceEntity.f394295b);
        C143947c.m234105x(parcel, 4, recurrenceEntity.f394296c, i);
        C143947c.m234105x(parcel, 5, recurrenceEntity.f394297d, i);
        C143947c.m234105x(parcel, 6, recurrenceEntity.f394298e, i);
        C143947c.m234105x(parcel, 7, recurrenceEntity.f394299f, i);
        C143947c.m234105x(parcel, 8, recurrenceEntity.f394300g, i);
        C143947c.m234105x(parcel, 9, recurrenceEntity.f394301h, i);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Integer num = null;
        Integer num2 = null;
        RecurrenceStartEntity recurrenceStartEntity = null;
        RecurrenceEndEntity recurrenceEndEntity = null;
        DailyPatternEntity dailyPatternEntity = null;
        WeeklyPatternEntity weeklyPatternEntity = null;
        MonthlyPatternEntity monthlyPatternEntity = null;
        YearlyPatternEntity yearlyPatternEntity = null;
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
                    recurrenceStartEntity = (RecurrenceStartEntity) C143946b.m234063l(parcel, readInt, RecurrenceStartEntity.CREATOR);
                    break;
                case 5:
                    recurrenceEndEntity = (RecurrenceEndEntity) C143946b.m234063l(parcel, readInt, RecurrenceEndEntity.CREATOR);
                    break;
                case 6:
                    dailyPatternEntity = (DailyPatternEntity) C143946b.m234063l(parcel, readInt, DailyPatternEntity.CREATOR);
                    break;
                case 7:
                    weeklyPatternEntity = (WeeklyPatternEntity) C143946b.m234063l(parcel, readInt, WeeklyPatternEntity.CREATOR);
                    break;
                case 8:
                    monthlyPatternEntity = (MonthlyPatternEntity) C143946b.m234063l(parcel, readInt, MonthlyPatternEntity.CREATOR);
                    break;
                case 9:
                    yearlyPatternEntity = (YearlyPatternEntity) C143946b.m234063l(parcel, readInt, YearlyPatternEntity.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new RecurrenceEntity(num, num2, recurrenceStartEntity, recurrenceEndEntity, dailyPatternEntity, weeklyPatternEntity, monthlyPatternEntity, yearlyPatternEntity);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RecurrenceEntity[i];
    }
}
