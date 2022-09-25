package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class EqualizerSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143609r();

    /* renamed from: a */
    public final EqualizerBandSettings f388622a;

    /* renamed from: b */
    public final EqualizerBandSettings f388623b;

    public EqualizerSettings(EqualizerBandSettings equalizerBandSettings, EqualizerBandSettings equalizerBandSettings2) {
        this.f388622a = equalizerBandSettings;
        this.f388623b = equalizerBandSettings2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EqualizerSettings)) {
            return false;
        }
        EqualizerSettings equalizerSettings = (EqualizerSettings) obj;
        return C143596v.m233278k(this.f388622a, equalizerSettings.f388622a) && C143596v.m233278k(this.f388623b, equalizerSettings.f388623b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f388622a, this.f388623b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f388622a, i);
        C143947c.m234105x(parcel, 3, this.f388623b, i);
        C143947c.m234083b(parcel, a);
    }
}
