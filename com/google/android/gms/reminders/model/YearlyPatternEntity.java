package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class YearlyPatternEntity extends AbstractSafeParcelable implements YearlyPattern {
    public static final Parcelable.Creator CREATOR = new C145829ai();

    /* renamed from: a */
    public final MonthlyPatternEntity f394338a;

    /* renamed from: b */
    public final List f394339b;

    public YearlyPatternEntity(MonthlyPattern monthlyPattern, List list, boolean z) {
        MonthlyPatternEntity monthlyPatternEntity;
        if (z) {
            this.f394338a = (MonthlyPatternEntity) monthlyPattern;
            this.f394339b = list;
            return;
        }
        ArrayList arrayList = null;
        if (monthlyPattern == null) {
            monthlyPatternEntity = null;
        } else {
            monthlyPatternEntity = new MonthlyPatternEntity(monthlyPattern);
        }
        this.f394338a = monthlyPatternEntity;
        this.f394339b = list != null ? new ArrayList(list) : arrayList;
    }

    public YearlyPatternEntity(MonthlyPatternEntity monthlyPatternEntity, List list) {
        this.f394338a = monthlyPatternEntity;
        this.f394339b = list;
    }

    /* renamed from: b */
    public static int m237550b(YearlyPattern yearlyPattern) {
        return Arrays.hashCode(new Object[]{yearlyPattern.mo122094h(), yearlyPattern.mo122095i()});
    }

    /* renamed from: c */
    public static boolean m237551c(YearlyPattern yearlyPattern, YearlyPattern yearlyPattern2) {
        return C143912ba.m233950b(yearlyPattern.mo122094h(), yearlyPattern2.mo122094h()) && C143912ba.m233950b(yearlyPattern.mo122095i(), yearlyPattern2.mo122095i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YearlyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237551c(this, (YearlyPattern) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final MonthlyPattern mo122094h() {
        return this.f394338a;
    }

    public final int hashCode() {
        return m237550b(this);
    }

    /* renamed from: i */
    public final List mo122095i() {
        return this.f394339b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145829ai.m237574a(this, parcel, i);
    }

    public YearlyPatternEntity(YearlyPattern yearlyPattern) {
        this(yearlyPattern.mo122094h(), yearlyPattern.mo122095i(), false);
    }
}
