package com.google.android.gms.car.display;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import p3186j$.util.Objects;

/* compiled from: PG */
public final class CarDisplay extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143183a();

    /* renamed from: a */
    public final CarDisplayId f388284a;

    /* renamed from: b */
    public final int f388285b;

    /* renamed from: c */
    public final int f388286c;

    /* renamed from: d */
    public final Point f388287d;

    /* renamed from: e */
    public final Rect f388288e;

    /* renamed from: f */
    public final int f388289f;

    /* renamed from: g */
    public final String f388290g;

    public CarDisplay(CarDisplayId carDisplayId, int i, int i2, Point point, Rect rect, int i3, String str) {
        this.f388284a = carDisplayId;
        this.f388285b = i;
        this.f388286c = i2;
        this.f388287d = point;
        this.f388288e = rect;
        this.f388289f = i3;
        this.f388290g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarDisplay)) {
            return false;
        }
        CarDisplay carDisplay = (CarDisplay) obj;
        return carDisplay.f388284a.equals(this.f388284a) && carDisplay.f388285b == this.f388285b && carDisplay.f388286c == this.f388286c && Objects.equals(carDisplay.f388287d, this.f388287d) && Objects.equals(carDisplay.f388288e, this.f388288e) && carDisplay.f388289f == this.f388289f && Objects.equals(carDisplay.f388290g, this.f388290g);
    }

    public final int hashCode() {
        return Objects.hash(this.f388284a, Integer.valueOf(this.f388285b), Integer.valueOf(this.f388286c), this.f388287d, this.f388288e, Integer.valueOf(this.f388289f), this.f388290g);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f388284a);
        int i = this.f388285b;
        int i2 = this.f388286c;
        String valueOf2 = String.valueOf(this.f388287d);
        String valueOf3 = String.valueOf(this.f388288e);
        int i3 = this.f388289f;
        String str = this.f388290g;
        return "CarDisplay{carDisplayId=" + valueOf + ", carDisplayType=" + i + ", displayDpi=" + i2 + ", displayDimensions=" + valueOf2 + ", stableInsets=" + valueOf3 + ", initialContentType=" + i3 + ", configurationId=" + str + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f388284a, i);
        C143947c.m234089h(parcel, 2, this.f388285b);
        C143947c.m234089h(parcel, 3, this.f388286c);
        C143947c.m234105x(parcel, 4, this.f388287d, i);
        C143947c.m234105x(parcel, 5, this.f388288e, i);
        C143947c.m234089h(parcel, 6, this.f388289f);
        C143947c.m234106y(parcel, 7, this.f388290g);
        C143947c.m234083b(parcel, a);
    }
}
