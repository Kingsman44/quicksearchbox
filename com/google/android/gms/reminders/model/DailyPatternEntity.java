package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public class DailyPatternEntity extends AbstractSafeParcelable implements DailyPattern {
    public static final Parcelable.Creator CREATOR = new C145833e();

    /* renamed from: a */
    public final TimeEntity f394258a;

    /* renamed from: b */
    public final Integer f394259b;

    /* renamed from: c */
    public final Boolean f394260c;

    public DailyPatternEntity(DailyPattern dailyPattern) {
        this(dailyPattern.mo121987h(), dailyPattern.mo121989j(), dailyPattern.mo121988i(), false);
    }

    public DailyPatternEntity(TimeEntity timeEntity, Integer num, Boolean bool) {
        this.f394258a = timeEntity;
        this.f394259b = num;
        this.f394260c = bool;
    }

    /* renamed from: b */
    public static int m237332b(DailyPattern dailyPattern) {
        return Arrays.hashCode(new Object[]{dailyPattern.mo121987h(), dailyPattern.mo121989j(), dailyPattern.mo121988i()});
    }

    /* renamed from: c */
    public static boolean m237333c(DailyPattern dailyPattern, DailyPattern dailyPattern2) {
        return C143912ba.m233950b(dailyPattern.mo121987h(), dailyPattern2.mo121987h()) && C143912ba.m233950b(dailyPattern.mo121989j(), dailyPattern2.mo121989j()) && C143912ba.m233950b(dailyPattern.mo121988i(), dailyPattern2.mo121988i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DailyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237333c(this, (DailyPattern) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final Time mo121987h() {
        return this.f394258a;
    }

    public final int hashCode() {
        return m237332b(this);
    }

    /* renamed from: i */
    public final Boolean mo121988i() {
        return this.f394260c;
    }

    /* renamed from: j */
    public final Integer mo121989j() {
        return this.f394259b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145833e.m237579a(this, parcel, i);
    }

    public DailyPatternEntity(Time time, Integer num, Boolean bool, boolean z) {
        TimeEntity timeEntity;
        this.f394259b = num;
        this.f394260c = bool;
        if (z) {
            this.f394258a = (TimeEntity) time;
            return;
        }
        if (time == null) {
            timeEntity = null;
        } else {
            timeEntity = new TimeEntity(time);
        }
        this.f394258a = timeEntity;
    }
}
