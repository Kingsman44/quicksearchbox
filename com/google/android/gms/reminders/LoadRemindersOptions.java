package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class LoadRemindersOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145776e();

    /* renamed from: a */
    public static final LoadRemindersOptions f394113a = new C145775d().mo121943a();

    /* renamed from: b */
    public final List f394114b;

    /* renamed from: c */
    public final List f394115c;

    /* renamed from: d */
    public final Long f394116d;

    /* renamed from: e */
    public final Long f394117e;

    /* renamed from: f */
    public final Long f394118f;

    /* renamed from: g */
    public final Long f394119g;

    /* renamed from: h */
    public final boolean f394120h;

    /* renamed from: i */
    public final int f394121i;

    /* renamed from: j */
    public final boolean f394122j;

    /* renamed from: k */
    public final boolean f394123k;

    /* renamed from: l */
    public final int f394124l;

    /* renamed from: m */
    public final int f394125m;

    /* renamed from: n */
    public final List f394126n;

    /* renamed from: o */
    public final Long f394127o;

    /* renamed from: p */
    public final Long f394128p;

    public LoadRemindersOptions(List list, List list2, Long l, Long l2, Long l3, Long l4, boolean z, int i, boolean z2, boolean z3, int i2, int i3, List list3, Long l5, Long l6) {
        this.f394114b = list;
        this.f394115c = list2;
        this.f394116d = l;
        this.f394117e = l2;
        this.f394118f = l3;
        this.f394119g = l4;
        this.f394120h = z;
        this.f394121i = i;
        this.f394122j = z2;
        this.f394123k = z3;
        this.f394124l = i2;
        this.f394125m = i3;
        this.f394126n = list3;
        this.f394127o = l5;
        this.f394128p = l6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234078A(parcel, 3, this.f394114b);
        C143947c.m234100s(parcel, 4, this.f394115c);
        C143947c.m234104w(parcel, 5, this.f394116d);
        C143947c.m234104w(parcel, 6, this.f394117e);
        C143947c.m234104w(parcel, 7, this.f394118f);
        C143947c.m234104w(parcel, 8, this.f394119g);
        C143947c.m234084c(parcel, 9, this.f394120h);
        C143947c.m234089h(parcel, 10, this.f394121i);
        C143947c.m234084c(parcel, 11, this.f394122j);
        C143947c.m234084c(parcel, 12, this.f394123k);
        C143947c.m234089h(parcel, 13, this.f394124l);
        C143947c.m234089h(parcel, 14, this.f394125m);
        C143947c.m234078A(parcel, 15, this.f394126n);
        C143947c.m234104w(parcel, 16, this.f394127o);
        C143947c.m234104w(parcel, 17, this.f394128p);
        C143947c.m234083b(parcel, a);
    }
}
