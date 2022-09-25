package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public class TimeEntity extends AbstractSafeParcelable implements Time {
    public static final Parcelable.Creator CREATOR = new C145825ae();

    /* renamed from: a */
    public final Integer f394334a;

    /* renamed from: b */
    public final Integer f394335b;

    /* renamed from: c */
    public final Integer f394336c;

    public TimeEntity(Time time) {
        this(time.mo122086h(), time.mo122087i(), time.mo122088j());
    }

    public TimeEntity(Integer num, Integer num2, Integer num3) {
        this.f394334a = num;
        this.f394335b = num2;
        this.f394336c = num3;
    }

    /* renamed from: b */
    public static int m237535b(Time time) {
        return Arrays.hashCode(new Object[]{time.mo122086h(), time.mo122087i(), time.mo122088j()});
    }

    /* renamed from: c */
    public static boolean m237536c(Time time, Time time2) {
        return C143912ba.m233950b(time.mo122086h(), time2.mo122086h()) && C143912ba.m233950b(time.mo122087i(), time2.mo122087i()) && C143912ba.m233950b(time.mo122088j(), time2.mo122088j());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Time)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237536c(this, (Time) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final Integer mo122086h() {
        return this.f394334a;
    }

    public final int hashCode() {
        return m237535b(this);
    }

    /* renamed from: i */
    public final Integer mo122087i() {
        return this.f394335b;
    }

    /* renamed from: j */
    public final Integer mo122088j() {
        return this.f394336c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145825ae.m237568a(this, parcel);
    }
}
