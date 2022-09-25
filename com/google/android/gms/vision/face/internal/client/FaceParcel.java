package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class FaceParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146313c();

    /* renamed from: a */
    public final int f395186a;

    /* renamed from: b */
    public final int f395187b;

    /* renamed from: c */
    public final float f395188c;

    /* renamed from: d */
    public final float f395189d;

    /* renamed from: e */
    public final float f395190e;

    /* renamed from: f */
    public final float f395191f;

    /* renamed from: g */
    public final float f395192g;

    /* renamed from: h */
    public final float f395193h;

    /* renamed from: i */
    public final float f395194i;

    /* renamed from: j */
    public final LandmarkParcel[] f395195j;

    /* renamed from: k */
    public final float f395196k;

    /* renamed from: l */
    public final float f395197l;

    /* renamed from: m */
    public final float f395198m;

    /* renamed from: n */
    public final ContourParcel[] f395199n;

    /* renamed from: o */
    public final float f395200o;

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, LandmarkParcel[] landmarkParcelArr, float f8, float f9, float f10, ContourParcel[] contourParcelArr, float f11) {
        this.f395186a = i;
        this.f395187b = i2;
        this.f395188c = f;
        this.f395189d = f2;
        this.f395190e = f3;
        this.f395191f = f4;
        this.f395192g = f5;
        this.f395193h = f6;
        this.f395194i = f7;
        this.f395195j = landmarkParcelArr;
        this.f395196k = f8;
        this.f395197l = f9;
        this.f395198m = f10;
        this.f395199n = contourParcelArr;
        this.f395200o = f11;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f395186a);
        C143947c.m234089h(parcel, 2, this.f395187b);
        C143947c.m234087f(parcel, 3, this.f395188c);
        C143947c.m234087f(parcel, 4, this.f395189d);
        C143947c.m234087f(parcel, 5, this.f395190e);
        C143947c.m234087f(parcel, 6, this.f395191f);
        C143947c.m234087f(parcel, 7, this.f395192g);
        C143947c.m234087f(parcel, 8, this.f395193h);
        C143947c.m234079B(parcel, 9, this.f395195j, i);
        C143947c.m234087f(parcel, 10, this.f395196k);
        C143947c.m234087f(parcel, 11, this.f395197l);
        C143947c.m234087f(parcel, 12, this.f395198m);
        C143947c.m234079B(parcel, 13, this.f395199n, i);
        C143947c.m234087f(parcel, 14, this.f395194i);
        C143947c.m234087f(parcel, 15, this.f395200o);
        C143947c.m234083b(parcel, a);
    }
}
