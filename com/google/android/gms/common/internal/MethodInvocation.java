package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143909ay();

    /* renamed from: a */
    public final int f390028a;

    /* renamed from: b */
    public final int f390029b;

    /* renamed from: c */
    public final int f390030c;

    /* renamed from: d */
    public final long f390031d;

    /* renamed from: e */
    public final long f390032e;

    /* renamed from: f */
    public final String f390033f;

    /* renamed from: g */
    public final String f390034g;

    /* renamed from: h */
    public final int f390035h;

    /* renamed from: i */
    public final int f390036i;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f390028a = i;
        this.f390029b = i2;
        this.f390030c = i3;
        this.f390031d = j;
        this.f390032e = j2;
        this.f390033f = str;
        this.f390034g = str2;
        this.f390035h = i4;
        this.f390036i = i5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f390028a);
        C143947c.m234089h(parcel, 2, this.f390029b);
        C143947c.m234089h(parcel, 3, this.f390030c);
        C143947c.m234090i(parcel, 4, this.f390031d);
        C143947c.m234090i(parcel, 5, this.f390032e);
        C143947c.m234106y(parcel, 6, this.f390033f);
        C143947c.m234106y(parcel, 7, this.f390034g);
        C143947c.m234089h(parcel, 8, this.f390035h);
        C143947c.m234089h(parcel, 9, this.f390036i);
        C143947c.m234083b(parcel, a);
    }
}
