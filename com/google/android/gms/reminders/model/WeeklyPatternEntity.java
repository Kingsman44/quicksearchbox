package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class WeeklyPatternEntity extends AbstractSafeParcelable implements WeeklyPattern {
    public static final Parcelable.Creator CREATOR = new C145827ag();

    /* renamed from: a */
    public final List f394337a;

    public WeeklyPatternEntity(WeeklyPattern weeklyPattern) {
        this(weeklyPattern.mo122091h(), false);
    }

    public WeeklyPatternEntity(List list) {
        this.f394337a = list;
    }

    /* renamed from: b */
    public static int m237543b(WeeklyPattern weeklyPattern) {
        return Arrays.hashCode(new Object[]{weeklyPattern.mo122091h()});
    }

    /* renamed from: c */
    public static boolean m237544c(WeeklyPattern weeklyPattern, WeeklyPattern weeklyPattern2) {
        return C143912ba.m233950b(weeklyPattern.mo122091h(), weeklyPattern2.mo122091h());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WeeklyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237544c(this, (WeeklyPattern) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final List mo122091h() {
        return this.f394337a;
    }

    public final int hashCode() {
        return m237543b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145827ag.m237571a(this, parcel);
    }

    public WeeklyPatternEntity(List list, boolean z) {
        if (z) {
            this.f394337a = list;
        } else {
            this.f394337a = list == null ? null : new ArrayList(list);
        }
    }
}
