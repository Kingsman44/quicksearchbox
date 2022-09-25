package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class MonthlyPatternEntity extends AbstractSafeParcelable implements MonthlyPattern {
    public static final Parcelable.Creator CREATOR = new C145842n();

    /* renamed from: a */
    public final List f394287a;

    /* renamed from: b */
    public final Integer f394288b;

    /* renamed from: c */
    public final Integer f394289c;

    public MonthlyPatternEntity(MonthlyPattern monthlyPattern) {
        this(monthlyPattern.mo122030j(), monthlyPattern.mo122028h(), monthlyPattern.mo122029i(), false);
    }

    public MonthlyPatternEntity(List list, Integer num, Integer num2) {
        this.f394287a = list;
        this.f394288b = num;
        this.f394289c = num2;
    }

    /* renamed from: b */
    public static int m237414b(MonthlyPattern monthlyPattern) {
        return Arrays.hashCode(new Object[]{monthlyPattern.mo122030j(), monthlyPattern.mo122028h(), monthlyPattern.mo122029i()});
    }

    /* renamed from: c */
    public static boolean m237415c(MonthlyPattern monthlyPattern, MonthlyPattern monthlyPattern2) {
        return C143912ba.m233950b(monthlyPattern.mo122030j(), monthlyPattern2.mo122030j()) && C143912ba.m233950b(monthlyPattern.mo122028h(), monthlyPattern2.mo122028h()) && C143912ba.m233950b(monthlyPattern.mo122029i(), monthlyPattern2.mo122029i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MonthlyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237415c(this, (MonthlyPattern) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final Integer mo122028h() {
        return this.f394288b;
    }

    public final int hashCode() {
        return m237414b(this);
    }

    /* renamed from: i */
    public final Integer mo122029i() {
        return this.f394289c;
    }

    /* renamed from: j */
    public final List mo122030j() {
        return this.f394287a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145842n.m237591a(this, parcel);
    }

    public MonthlyPatternEntity(List list, Integer num, Integer num2, boolean z) {
        this.f394288b = num;
        this.f394289c = num2;
        if (z) {
            this.f394287a = list;
        } else {
            this.f394287a = list == null ? null : new ArrayList(list);
        }
    }
}
