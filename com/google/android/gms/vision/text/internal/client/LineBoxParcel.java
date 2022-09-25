package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class LineBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146329d();

    /* renamed from: a */
    public final WordBoxParcel[] f395236a;

    /* renamed from: b */
    public final BoundingBoxParcel f395237b;

    /* renamed from: c */
    public final BoundingBoxParcel f395238c;

    /* renamed from: d */
    public final BoundingBoxParcel f395239d;

    /* renamed from: e */
    public final String f395240e;

    /* renamed from: f */
    public final float f395241f;

    /* renamed from: g */
    public final String f395242g;

    /* renamed from: h */
    public final int f395243h;

    /* renamed from: i */
    public final boolean f395244i;

    /* renamed from: j */
    public final int f395245j;

    /* renamed from: k */
    public final int f395246k;

    public LineBoxParcel(WordBoxParcel[] wordBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, BoundingBoxParcel boundingBoxParcel3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.f395236a = wordBoxParcelArr;
        this.f395237b = boundingBoxParcel;
        this.f395238c = boundingBoxParcel2;
        this.f395239d = boundingBoxParcel3;
        this.f395240e = str;
        this.f395241f = f;
        this.f395242g = str2;
        this.f395243h = i;
        this.f395244i = z;
        this.f395245j = i2;
        this.f395246k = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234079B(parcel, 2, this.f395236a, i);
        C143947c.m234105x(parcel, 3, this.f395237b, i);
        C143947c.m234105x(parcel, 4, this.f395238c, i);
        C143947c.m234105x(parcel, 5, this.f395239d, i);
        C143947c.m234106y(parcel, 6, this.f395240e);
        C143947c.m234087f(parcel, 7, this.f395241f);
        C143947c.m234106y(parcel, 8, this.f395242g);
        C143947c.m234089h(parcel, 9, this.f395243h);
        C143947c.m234084c(parcel, 10, this.f395244i);
        C143947c.m234089h(parcel, 11, this.f395245j);
        C143947c.m234089h(parcel, 12, this.f395246k);
        C143947c.m234083b(parcel, a);
    }
}
