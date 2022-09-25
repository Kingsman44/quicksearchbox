package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Locale;

/* compiled from: PG */
public class CarUiInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143114az();

    /* renamed from: a */
    public boolean f387976a;

    /* renamed from: b */
    public boolean f387977b;

    /* renamed from: c */
    public boolean f387978c;

    /* renamed from: d */
    public boolean f387979d;

    /* renamed from: e */
    public int[] f387980e;

    /* renamed from: f */
    public boolean f387981f;

    /* renamed from: g */
    public int f387982g;

    /* renamed from: h */
    public boolean f387983h;

    /* renamed from: i */
    public int f387984i;

    /* renamed from: j */
    public int f387985j;

    CarUiInfo() {
    }

    public CarUiInfo(boolean z, boolean z2, boolean z3, boolean z4, int[] iArr, boolean z5, int i, boolean z6, int i2, int i3) {
        this.f387976a = z;
        this.f387977b = z2;
        this.f387978c = z3;
        this.f387979d = z4;
        this.f387980e = iArr;
        this.f387981f = z5;
        this.f387982g = i;
        this.f387983h = z6;
        this.f387984i = i2;
        this.f387985j = i3;
    }

    public final String toString() {
        return String.format(Locale.US, "CarUiInfo (hasRotaryController: %b, touchscreenType: %d, hasSearchButton: %b, hasTouchpadForUiNavigation: %b, hasDpad: %b, isTouchpadUiAbsolute: %b, touchpadMoveThresholdPx: %d, touchpadMultimoveThresholdPx: %d)", new Object[]{Boolean.valueOf(this.f387976a), Integer.valueOf(this.f387982g), Boolean.valueOf(this.f387978c), Boolean.valueOf(this.f387979d), Boolean.valueOf(this.f387981f), Boolean.valueOf(this.f387983h), Integer.valueOf(this.f387984i), Integer.valueOf(this.f387985j)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f387976a);
        C143947c.m234084c(parcel, 2, this.f387977b);
        C143947c.m234084c(parcel, 3, this.f387978c);
        C143947c.m234084c(parcel, 4, this.f387979d);
        C143947c.m234099r(parcel, 5, this.f387980e);
        C143947c.m234084c(parcel, 6, this.f387981f);
        C143947c.m234089h(parcel, 7, this.f387982g);
        C143947c.m234084c(parcel, 8, this.f387983h);
        C143947c.m234089h(parcel, 9, this.f387984i);
        C143947c.m234089h(parcel, 10, this.f387985j);
        C143947c.m234083b(parcel, a);
    }
}
