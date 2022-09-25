package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class LanguagePreferenceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144446f();

    /* renamed from: a */
    public final float f391051a;

    /* renamed from: b */
    public final int f391052b;

    /* renamed from: c */
    public final int f391053c;

    /* renamed from: d */
    public final Integer f391054d;

    public LanguagePreferenceParams(float f, int i, int i2, Integer num) {
        this.f391051a = f;
        this.f391052b = i;
        this.f391053c = i2;
        this.f391054d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguagePreferenceParams) {
            LanguagePreferenceParams languagePreferenceParams = (LanguagePreferenceParams) obj;
            return C143912ba.m233950b(Float.valueOf(this.f391051a), Float.valueOf(languagePreferenceParams.f391051a)) && C143912ba.m233950b(Integer.valueOf(this.f391052b), Integer.valueOf(languagePreferenceParams.f391052b)) && C143912ba.m233950b(this.f391054d, languagePreferenceParams.f391054d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f391051a), Integer.valueOf(this.f391052b), this.f391054d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234087f(parcel, 1, this.f391051a);
        C143947c.m234089h(parcel, 2, this.f391052b);
        C143947c.m234089h(parcel, 3, this.f391053c);
        C143947c.m234101t(parcel, 4, this.f391054d);
        C143947c.m234083b(parcel, a);
    }
}
