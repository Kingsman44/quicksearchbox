package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class EqualizerBandSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143608q();

    /* renamed from: a */
    public final float f388619a;

    /* renamed from: b */
    public final float f388620b;

    /* renamed from: c */
    public final float f388621c;

    public EqualizerBandSettings(float f, float f2, float f3) {
        this.f388619a = f;
        this.f388620b = f2;
        this.f388621c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EqualizerBandSettings)) {
            return false;
        }
        EqualizerBandSettings equalizerBandSettings = (EqualizerBandSettings) obj;
        return this.f388619a == equalizerBandSettings.f388619a && this.f388620b == equalizerBandSettings.f388620b && this.f388621c == equalizerBandSettings.f388621c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f388619a), Float.valueOf(this.f388620b), Float.valueOf(this.f388621c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234087f(parcel, 2, this.f388619a);
        C143947c.m234087f(parcel, 3, this.f388620b);
        C143947c.m234087f(parcel, 4, this.f388621c);
        C143947c.m234083b(parcel, a);
    }
}
