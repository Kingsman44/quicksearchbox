package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class ConditionalUserPropertyParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145509y();

    /* renamed from: a */
    public String f392524a;

    /* renamed from: b */
    public String f392525b;

    /* renamed from: c */
    public UserAttributeParcel f392526c;

    /* renamed from: d */
    public long f392527d;

    /* renamed from: e */
    public boolean f392528e;

    /* renamed from: f */
    public String f392529f;

    /* renamed from: g */
    public EventParcel f392530g;

    /* renamed from: h */
    public long f392531h;

    /* renamed from: i */
    public EventParcel f392532i;

    /* renamed from: j */
    public long f392533j;

    /* renamed from: k */
    public EventParcel f392534k;

    public ConditionalUserPropertyParcel(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        C143919bh.m233958a(conditionalUserPropertyParcel);
        this.f392524a = conditionalUserPropertyParcel.f392524a;
        this.f392525b = conditionalUserPropertyParcel.f392525b;
        this.f392526c = conditionalUserPropertyParcel.f392526c;
        this.f392527d = conditionalUserPropertyParcel.f392527d;
        this.f392528e = conditionalUserPropertyParcel.f392528e;
        this.f392529f = conditionalUserPropertyParcel.f392529f;
        this.f392530g = conditionalUserPropertyParcel.f392530g;
        this.f392531h = conditionalUserPropertyParcel.f392531h;
        this.f392532i = conditionalUserPropertyParcel.f392532i;
        this.f392533j = conditionalUserPropertyParcel.f392533j;
        this.f392534k = conditionalUserPropertyParcel.f392534k;
    }

    public ConditionalUserPropertyParcel(String str, String str2, UserAttributeParcel userAttributeParcel, long j, boolean z, String str3, EventParcel eventParcel, long j2, EventParcel eventParcel2, long j3, EventParcel eventParcel3) {
        this.f392524a = str;
        this.f392525b = str2;
        this.f392526c = userAttributeParcel;
        this.f392527d = j;
        this.f392528e = z;
        this.f392529f = str3;
        this.f392530g = eventParcel;
        this.f392531h = j2;
        this.f392532i = eventParcel2;
        this.f392533j = j3;
        this.f392534k = eventParcel3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f392524a);
        C143947c.m234106y(parcel, 3, this.f392525b);
        C143947c.m234105x(parcel, 4, this.f392526c, i);
        C143947c.m234090i(parcel, 5, this.f392527d);
        C143947c.m234084c(parcel, 6, this.f392528e);
        C143947c.m234106y(parcel, 7, this.f392529f);
        C143947c.m234105x(parcel, 8, this.f392530g, i);
        C143947c.m234090i(parcel, 9, this.f392531h);
        C143947c.m234105x(parcel, 10, this.f392532i, i);
        C143947c.m234090i(parcel, 11, this.f392533j);
        C143947c.m234105x(parcel, 12, this.f392534k, i);
        C143947c.m234083b(parcel, a);
    }
}
