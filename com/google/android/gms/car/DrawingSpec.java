package com.google.android.gms.car;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class DrawingSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143126bj();

    /* renamed from: a */
    public int f387987a;

    /* renamed from: b */
    public int f387988b;

    /* renamed from: c */
    public int f387989c;

    /* renamed from: d */
    public Surface f387990d;

    /* renamed from: e */
    public Rect f387991e;

    /* renamed from: f */
    public int f387992f;

    public DrawingSpec(int i, int i2, int i3, Surface surface, Rect rect, int i4) {
        this.f387987a = i;
        this.f387988b = i2;
        this.f387989c = i3;
        this.f387990d = surface;
        this.f387991e = rect;
        this.f387992f = i4;
    }

    /* renamed from: b */
    private static boolean m231915b(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    /* renamed from: a */
    public final boolean mo117900a(Configuration configuration) {
        return configuration.densityDpi == this.f387989c && m231915b(configuration.screenHeightDp, (int) (((float) this.f387988b) * (160.0f / ((float) this.f387989c))), this.f387992f) && m231915b(configuration.screenWidthDp, (int) (((float) this.f387987a) * (160.0f / ((float) this.f387989c))), this.f387992f);
    }

    public final String toString() {
        int i = this.f387987a;
        int i2 = this.f387988b;
        int i3 = this.f387989c;
        String valueOf = String.valueOf(this.f387990d);
        String valueOf2 = String.valueOf(this.f387991e);
        return "DrawingSpec{width=" + i + ", height=" + i2 + ", dpi=" + i3 + ", surface=" + valueOf + ", systemWindowInsets=" + valueOf2 + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f387987a);
        C143947c.m234089h(parcel, 2, this.f387988b);
        C143947c.m234089h(parcel, 3, this.f387989c);
        C143947c.m234105x(parcel, 4, this.f387990d, i);
        C143947c.m234105x(parcel, 5, this.f387991e, i);
        C143947c.m234089h(parcel, 6, this.f387992f);
        C143947c.m234083b(parcel, a);
    }
}
