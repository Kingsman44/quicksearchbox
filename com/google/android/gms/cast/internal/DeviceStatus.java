package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
public class DeviceStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143597w();

    /* renamed from: a */
    public double f389253a;

    /* renamed from: b */
    public boolean f389254b;

    /* renamed from: c */
    public int f389255c;

    /* renamed from: d */
    public ApplicationMetadata f389256d;

    /* renamed from: e */
    public int f389257e;

    /* renamed from: f */
    public EqualizerSettings f389258f;

    /* renamed from: g */
    public double f389259g;

    public DeviceStatus() {
        this(Double.NaN, false, -1, (ApplicationMetadata) null, -1, (EqualizerSettings) null, Double.NaN);
    }

    public DeviceStatus(double d, boolean z, int i, ApplicationMetadata applicationMetadata, int i2, EqualizerSettings equalizerSettings, double d2) {
        this.f389253a = d;
        this.f389254b = z;
        this.f389255c = i;
        this.f389256d = applicationMetadata;
        this.f389257e = i2;
        this.f389258f = equalizerSettings;
        this.f389259g = d2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceStatus)) {
            return false;
        }
        DeviceStatus deviceStatus = (DeviceStatus) obj;
        if (this.f389253a == deviceStatus.f389253a && this.f389254b == deviceStatus.f389254b && this.f389255c == deviceStatus.f389255c && C143596v.m233278k(this.f389256d, deviceStatus.f389256d) && this.f389257e == deviceStatus.f389257e) {
            EqualizerSettings equalizerSettings = this.f389258f;
            return C143596v.m233278k(equalizerSettings, equalizerSettings) && this.f389259g == deviceStatus.f389259g;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f389253a), Boolean.valueOf(this.f389254b), Integer.valueOf(this.f389255c), this.f389256d, Integer.valueOf(this.f389257e), this.f389258f, Double.valueOf(this.f389259g)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", new Object[]{Double.valueOf(this.f389253a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234086e(parcel, 2, this.f389253a);
        C143947c.m234084c(parcel, 3, this.f389254b);
        C143947c.m234089h(parcel, 4, this.f389255c);
        C143947c.m234105x(parcel, 5, this.f389256d, i);
        C143947c.m234089h(parcel, 6, this.f389257e);
        C143947c.m234105x(parcel, 7, this.f389258f, i);
        C143947c.m234086e(parcel, 8, this.f389259g);
        C143947c.m234083b(parcel, a);
    }
}
