package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public class RecurrenceEntity extends AbstractSafeParcelable implements Recurrence {
    public static final Parcelable.Creator CREATOR = new C145844p();

    /* renamed from: a */
    public final Integer f394294a;

    /* renamed from: b */
    public final Integer f394295b;

    /* renamed from: c */
    public final RecurrenceStartEntity f394296c;

    /* renamed from: d */
    public final RecurrenceEndEntity f394297d;

    /* renamed from: e */
    public final DailyPatternEntity f394298e;

    /* renamed from: f */
    public final WeeklyPatternEntity f394299f;

    /* renamed from: g */
    public final MonthlyPatternEntity f394300g;

    /* renamed from: h */
    public final YearlyPatternEntity f394301h;

    public RecurrenceEntity(Recurrence recurrence) {
        this(recurrence.mo122052o(), recurrence.mo122051n(), recurrence.mo122048k(), recurrence.mo122047j(), recurrence.mo122045h(), recurrence.mo122049l(), recurrence.mo122046i(), recurrence.mo122050m(), false);
    }

    public RecurrenceEntity(Integer num, Integer num2, RecurrenceStartEntity recurrenceStartEntity, RecurrenceEndEntity recurrenceEndEntity, DailyPatternEntity dailyPatternEntity, WeeklyPatternEntity weeklyPatternEntity, MonthlyPatternEntity monthlyPatternEntity, YearlyPatternEntity yearlyPatternEntity) {
        this.f394294a = num;
        this.f394295b = num2;
        this.f394296c = recurrenceStartEntity;
        this.f394297d = recurrenceEndEntity;
        this.f394298e = dailyPatternEntity;
        this.f394299f = weeklyPatternEntity;
        this.f394300g = monthlyPatternEntity;
        this.f394301h = yearlyPatternEntity;
    }

    /* renamed from: b */
    public static int m237441b(Recurrence recurrence) {
        return Arrays.hashCode(new Object[]{recurrence.mo122052o(), recurrence.mo122051n(), recurrence.mo122048k(), recurrence.mo122047j(), recurrence.mo122045h(), recurrence.mo122049l(), recurrence.mo122046i(), recurrence.mo122050m()});
    }

    /* renamed from: c */
    public static boolean m237442c(Recurrence recurrence, Recurrence recurrence2) {
        return C143912ba.m233950b(recurrence.mo122052o(), recurrence2.mo122052o()) && C143912ba.m233950b(recurrence.mo122051n(), recurrence2.mo122051n()) && C143912ba.m233950b(recurrence.mo122048k(), recurrence2.mo122048k()) && C143912ba.m233950b(recurrence.mo122047j(), recurrence2.mo122047j()) && C143912ba.m233950b(recurrence.mo122045h(), recurrence2.mo122045h()) && C143912ba.m233950b(recurrence.mo122049l(), recurrence2.mo122049l()) && C143912ba.m233950b(recurrence.mo122046i(), recurrence2.mo122046i()) && C143912ba.m233950b(recurrence.mo122050m(), recurrence2.mo122050m());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Recurrence)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237442c(this, (Recurrence) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final DailyPattern mo122045h() {
        return this.f394298e;
    }

    public final int hashCode() {
        return m237441b(this);
    }

    /* renamed from: i */
    public final MonthlyPattern mo122046i() {
        return this.f394300g;
    }

    /* renamed from: j */
    public final RecurrenceEnd mo122047j() {
        return this.f394297d;
    }

    /* renamed from: k */
    public final RecurrenceStart mo122048k() {
        return this.f394296c;
    }

    /* renamed from: l */
    public final WeeklyPattern mo122049l() {
        return this.f394299f;
    }

    /* renamed from: m */
    public final YearlyPattern mo122050m() {
        return this.f394301h;
    }

    /* renamed from: n */
    public final Integer mo122051n() {
        return this.f394295b;
    }

    /* renamed from: o */
    public final Integer mo122052o() {
        return this.f394294a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145844p.m237594a(this, parcel, i);
    }

    public RecurrenceEntity(Integer num, Integer num2, RecurrenceStart recurrenceStart, RecurrenceEnd recurrenceEnd, DailyPattern dailyPattern, WeeklyPattern weeklyPattern, MonthlyPattern monthlyPattern, YearlyPattern yearlyPattern, boolean z) {
        RecurrenceStartEntity recurrenceStartEntity;
        RecurrenceEndEntity recurrenceEndEntity;
        DailyPatternEntity dailyPatternEntity;
        WeeklyPatternEntity weeklyPatternEntity;
        MonthlyPatternEntity monthlyPatternEntity;
        this.f394294a = num;
        this.f394295b = num2;
        if (z) {
            this.f394296c = (RecurrenceStartEntity) recurrenceStart;
            this.f394297d = (RecurrenceEndEntity) recurrenceEnd;
            this.f394298e = (DailyPatternEntity) dailyPattern;
            this.f394299f = (WeeklyPatternEntity) weeklyPattern;
            this.f394300g = (MonthlyPatternEntity) monthlyPattern;
            this.f394301h = (YearlyPatternEntity) yearlyPattern;
            return;
        }
        YearlyPatternEntity yearlyPatternEntity = null;
        if (recurrenceStart == null) {
            recurrenceStartEntity = null;
        } else {
            recurrenceStartEntity = new RecurrenceStartEntity(recurrenceStart);
        }
        this.f394296c = recurrenceStartEntity;
        if (recurrenceEnd == null) {
            recurrenceEndEntity = null;
        } else {
            recurrenceEndEntity = new RecurrenceEndEntity(recurrenceEnd);
        }
        this.f394297d = recurrenceEndEntity;
        if (dailyPattern == null) {
            dailyPatternEntity = null;
        } else {
            dailyPatternEntity = new DailyPatternEntity(dailyPattern);
        }
        this.f394298e = dailyPatternEntity;
        if (weeklyPattern == null) {
            weeklyPatternEntity = null;
        } else {
            weeklyPatternEntity = new WeeklyPatternEntity(weeklyPattern);
        }
        this.f394299f = weeklyPatternEntity;
        if (monthlyPattern == null) {
            monthlyPatternEntity = null;
        } else {
            monthlyPatternEntity = new MonthlyPatternEntity(monthlyPattern);
        }
        this.f394300g = monthlyPatternEntity;
        this.f394301h = yearlyPattern != null ? new YearlyPatternEntity(yearlyPattern) : yearlyPatternEntity;
    }
}
