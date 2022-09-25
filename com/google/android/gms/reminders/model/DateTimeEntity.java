package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public class DateTimeEntity extends AbstractSafeParcelable implements DateTime {
    public static final Parcelable.Creator CREATOR = new C145835g();

    /* renamed from: a */
    public final Integer f394261a;

    /* renamed from: b */
    public final Integer f394262b;

    /* renamed from: c */
    public final Integer f394263c;

    /* renamed from: d */
    public final TimeEntity f394264d;

    /* renamed from: e */
    public final Integer f394265e;

    /* renamed from: f */
    public final Integer f394266f;

    /* renamed from: g */
    public final Long f394267g;

    /* renamed from: h */
    public final Boolean f394268h;

    /* renamed from: i */
    public final Boolean f394269i;

    public DateTimeEntity(DateTime dateTime) {
        this(dateTime.mo121999o(), dateTime.mo121997m(), dateTime.mo121996l(), dateTime.mo121992h(), dateTime.mo121998n(), dateTime.mo121995k(), dateTime.mo122000p(), dateTime.mo121994j(), dateTime.mo121993i(), false);
    }

    public DateTimeEntity(Integer num, Integer num2, Integer num3, TimeEntity timeEntity, Integer num4, Integer num5, Long l, Boolean bool, Boolean bool2) {
        this.f394261a = num;
        this.f394262b = num2;
        this.f394263c = num3;
        this.f394264d = timeEntity;
        this.f394265e = num4;
        this.f394266f = num5;
        this.f394267g = l;
        this.f394268h = bool;
        this.f394269i = bool2;
    }

    /* renamed from: b */
    public static int m237348b(DateTime dateTime) {
        return Arrays.hashCode(new Object[]{dateTime.mo121999o(), dateTime.mo121997m(), dateTime.mo121996l(), dateTime.mo121992h(), dateTime.mo121998n(), dateTime.mo121995k(), dateTime.mo122000p(), dateTime.mo121994j(), dateTime.mo121993i()});
    }

    /* renamed from: c */
    public static boolean m237349c(DateTime dateTime, DateTime dateTime2) {
        return C143912ba.m233950b(dateTime.mo121999o(), dateTime2.mo121999o()) && C143912ba.m233950b(dateTime.mo121997m(), dateTime2.mo121997m()) && C143912ba.m233950b(dateTime.mo121996l(), dateTime2.mo121996l()) && C143912ba.m233950b(dateTime.mo121992h(), dateTime2.mo121992h()) && C143912ba.m233950b(dateTime.mo121998n(), dateTime2.mo121998n()) && C143912ba.m233950b(dateTime.mo121995k(), dateTime2.mo121995k()) && C143912ba.m233950b(dateTime.mo122000p(), dateTime2.mo122000p()) && C143912ba.m233950b(dateTime.mo121994j(), dateTime2.mo121994j()) && C143912ba.m233950b(dateTime.mo121993i(), dateTime2.mo121993i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DateTime)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237349c(this, (DateTime) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final Time mo121992h() {
        return this.f394264d;
    }

    public final int hashCode() {
        return m237348b(this);
    }

    /* renamed from: i */
    public final Boolean mo121993i() {
        return this.f394269i;
    }

    /* renamed from: j */
    public final Boolean mo121994j() {
        return this.f394268h;
    }

    /* renamed from: k */
    public final Integer mo121995k() {
        return this.f394266f;
    }

    /* renamed from: l */
    public final Integer mo121996l() {
        return this.f394263c;
    }

    /* renamed from: m */
    public final Integer mo121997m() {
        return this.f394262b;
    }

    /* renamed from: n */
    public final Integer mo121998n() {
        return this.f394265e;
    }

    /* renamed from: o */
    public final Integer mo121999o() {
        return this.f394261a;
    }

    /* renamed from: p */
    public final Long mo122000p() {
        return this.f394267g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145835g.m237581a(this, parcel, i);
    }

    public DateTimeEntity(Integer num, Integer num2, Integer num3, Time time, Integer num4, Integer num5, Long l, Boolean bool, Boolean bool2, boolean z) {
        TimeEntity timeEntity;
        this.f394261a = num;
        this.f394262b = num2;
        this.f394263c = num3;
        this.f394265e = num4;
        this.f394266f = num5;
        this.f394267g = l;
        this.f394268h = bool;
        this.f394269i = bool2;
        if (z) {
            this.f394264d = (TimeEntity) time;
            return;
        }
        if (time == null) {
            timeEntity = null;
        } else {
            timeEntity = new TimeEntity(time);
        }
        this.f394264d = timeEntity;
    }
}
