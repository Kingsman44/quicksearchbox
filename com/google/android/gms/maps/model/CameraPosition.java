package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C145019c();

    /* renamed from: a */
    public final LatLng f392008a;

    /* renamed from: b */
    public final float f392009b;

    /* renamed from: c */
    public final float f392010c;

    /* renamed from: d */
    public final float f392011d;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        C143919bh.m233971n(latLng, "camera target must not be null.");
        C143919bh.m233961d(f2 >= 0.0f && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f392008a = latLng;
        this.f392009b = f;
        this.f392010c = f2 + 0.0f;
        this.f392011d = (((double) f3) <= C59203do.f157270a ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f392008a.equals(cameraPosition.f392008a) && Float.floatToIntBits(this.f392009b) == Float.floatToIntBits(cameraPosition.f392009b) && Float.floatToIntBits(this.f392010c) == Float.floatToIntBits(cameraPosition.f392010c) && Float.floatToIntBits(this.f392011d) == Float.floatToIntBits(cameraPosition.f392011d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f392008a, Float.valueOf(this.f392009b), Float.valueOf(this.f392010c), Float.valueOf(this.f392011d)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("target", this.f392008a, arrayList);
        C143910az.m233947b("zoom", Float.valueOf(this.f392009b), arrayList);
        C143910az.m233947b("tilt", Float.valueOf(this.f392010c), arrayList);
        C143910az.m233947b("bearing", Float.valueOf(this.f392011d), arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f392008a, i);
        C143947c.m234087f(parcel, 3, this.f392009b);
        C143947c.m234087f(parcel, 4, this.f392010c);
        C143947c.m234087f(parcel, 5, this.f392011d);
        C143947c.m234083b(parcel, a);
    }
}
