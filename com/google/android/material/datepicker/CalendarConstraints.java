package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.p097i.C1968c;
import java.util.Arrays;
import java.util.Calendar;

/* compiled from: PG */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C44604a();

    /* renamed from: a */
    public final Month f116188a;

    /* renamed from: b */
    public final Month f116189b;

    /* renamed from: c */
    public final DateValidator f116190c;

    /* renamed from: d */
    public Month f116191d;

    /* renamed from: e */
    public final int f116192e;

    /* renamed from: f */
    public final int f116193f;

    /* renamed from: g */
    public final int f116194g;

    /* compiled from: PG */
    public interface DateValidator extends Parcelable {
        /* renamed from: a */
        boolean mo47798a(long j);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        this.f116188a = month;
        this.f116189b = month2;
        this.f116191d = month3;
        this.f116192e = i;
        this.f116190c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i < 0 || i > C44625au.m79086g((Calendar) null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else {
            this.f116194g = month.mo47822b(month2) + 1;
            this.f116193f = (month2.f116200c - month.f116200c) + 1;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f116188a.equals(calendarConstraints.f116188a) && this.f116189b.equals(calendarConstraints.f116189b) && C1968c.m5305b(this.f116191d, calendarConstraints.f116191d) && this.f116192e == calendarConstraints.f116192e && this.f116190c.equals(calendarConstraints.f116190c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f116188a, this.f116189b, this.f116191d, Integer.valueOf(this.f116192e), this.f116190c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f116188a, 0);
        parcel.writeParcelable(this.f116189b, 0);
        parcel.writeParcelable(this.f116191d, 0);
        parcel.writeParcelable(this.f116190c, 0);
        parcel.writeInt(this.f116192e);
    }
}
