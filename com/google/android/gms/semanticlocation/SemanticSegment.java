package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class SemanticSegment extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145953ad();

    /* renamed from: a */
    public final long f394630a;

    /* renamed from: b */
    public final long f394631b;

    /* renamed from: c */
    public final int f394632c;

    /* renamed from: d */
    public final int f394633d;

    /* renamed from: e */
    public final boolean f394634e;

    /* renamed from: f */
    public final boolean f394635f;

    /* renamed from: g */
    public final String f394636g;

    /* renamed from: h */
    public final int f394637h;

    /* renamed from: i */
    public final Visit f394638i;

    /* renamed from: j */
    public final Activity f394639j;

    public SemanticSegment(long j, long j2, int i, int i2, boolean z, boolean z2, String str, int i3, Visit visit, Activity activity) {
        this.f394630a = j;
        this.f394631b = j2;
        this.f394632c = i;
        this.f394633d = i2;
        this.f394634e = z;
        this.f394635f = z2;
        this.f394636g = str;
        this.f394637h = i3;
        this.f394638i = visit;
        this.f394639j = activity;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 1, this.f394630a);
        C143947c.m234090i(parcel, 2, this.f394631b);
        C143947c.m234089h(parcel, 3, this.f394632c);
        C143947c.m234089h(parcel, 4, this.f394633d);
        C143947c.m234084c(parcel, 5, this.f394634e);
        C143947c.m234084c(parcel, 6, this.f394635f);
        C143947c.m234106y(parcel, 7, this.f394636g);
        C143947c.m234089h(parcel, 8, this.f394637h);
        C143947c.m234105x(parcel, 9, this.f394638i, i);
        C143947c.m234105x(parcel, 10, this.f394639j, i);
        C143947c.m234083b(parcel, a);
    }
}
