package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class WeatherImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142952o();

    /* renamed from: a */
    public final float f387863a;

    /* renamed from: b */
    public final float f387864b;

    /* renamed from: c */
    public final float f387865c;

    /* renamed from: d */
    public final int f387866d;

    /* renamed from: e */
    public final int[] f387867e;

    public WeatherImpl(float f, float f2, float f3, int i, int[] iArr) {
        this.f387863a = f;
        this.f387864b = f2;
        this.f387865c = f3;
        this.f387866d = i;
        this.f387867e = iArr;
    }

    /* renamed from: a */
    public static float m231896a(float f) {
        return ((f - 0.125f) * 5.0f) / 9.0f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Temp=");
        sb.append(this.f387863a);
        sb.append("F/");
        sb.append(m231896a(this.f387863a));
        sb.append("C, Feels=");
        sb.append(this.f387864b);
        sb.append("F/");
        sb.append(m231896a(this.f387864b));
        sb.append("C, Dew=");
        sb.append(this.f387865c);
        sb.append("F/");
        sb.append(m231896a(this.f387865c));
        sb.append("C, Humidity=");
        sb.append(this.f387866d);
        sb.append(", Condition=");
        if (this.f387867e == null) {
            sb.append("unknown");
        } else {
            sb.append("[");
            int[] iArr = this.f387867e;
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(",");
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append("]");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234087f(parcel, 2, this.f387863a);
        C143947c.m234087f(parcel, 3, this.f387864b);
        C143947c.m234087f(parcel, 4, this.f387865c);
        C143947c.m234089h(parcel, 5, this.f387866d);
        C143947c.m234099r(parcel, 6, this.f387867e);
        C143947c.m234083b(parcel, a);
    }
}
