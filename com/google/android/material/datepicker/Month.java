package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: PG */
final class Month implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C44612ah();

    /* renamed from: a */
    public final Calendar f116198a;

    /* renamed from: b */
    final int f116199b;

    /* renamed from: c */
    final int f116200c;

    /* renamed from: d */
    final int f116201d;

    /* renamed from: e */
    final int f116202e;

    /* renamed from: f */
    final long f116203f;

    /* renamed from: g */
    private String f116204g;

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar e = C44625au.m79084e(calendar);
        this.f116198a = e;
        this.f116199b = e.get(2);
        this.f116200c = e.get(1);
        this.f116201d = e.getMaximum(7);
        this.f116202e = e.getActualMaximum(5);
        this.f116203f = e.getTimeInMillis();
    }

    /* renamed from: d */
    static Month m79034d(long j) {
        Calendar g = C44625au.m79086g((Calendar) null);
        g.setTimeInMillis(j);
        return new Month(g);
    }

    /* renamed from: e */
    static Month m79035e(int i, int i2) {
        Calendar g = C44625au.m79086g((Calendar) null);
        g.set(1, i);
        g.set(2, i2);
        return new Month(g);
    }

    /* renamed from: f */
    static Month m79036f() {
        return new Month(C44625au.m79085f());
    }

    /* renamed from: a */
    public final int compareTo(Month month) {
        return this.f116198a.compareTo(month.f116198a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo47822b(Month month) {
        if (this.f116198a instanceof GregorianCalendar) {
            return ((month.f116200c - this.f116200c) * 12) + (month.f116199b - this.f116199b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo47823c(int i) {
        Calendar e = C44625au.m79084e(this.f116198a);
        e.set(5, i);
        return e.getTimeInMillis();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f116199b == month.f116199b && this.f116200c == month.f116200c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Month mo47827g(int i) {
        Calendar e = C44625au.m79084e(this.f116198a);
        e.add(2, i);
        return new Month(e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final String mo47828h() {
        if (this.f116204g == null) {
            this.f116204g = DateUtils.formatDateTime((Context) null, this.f116198a.getTimeInMillis(), 8228);
        }
        return this.f116204g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f116199b), Integer.valueOf(this.f116200c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f116200c);
        parcel.writeInt(this.f116199b);
    }
}
