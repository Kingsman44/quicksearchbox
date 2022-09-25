package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.languageprofile.p10819a.C144441e;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
public final class LanguagePreference extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144444d();

    /* renamed from: a */
    public final Locale f391048a;

    /* renamed from: b */
    public final float f391049b;

    /* renamed from: c */
    public final float f391050c;

    public LanguagePreference(Locale locale, float f, float f2) {
        this.f391048a = locale;
        this.f391049b = f;
        this.f391050c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguagePreference) {
            LanguagePreference languagePreference = (LanguagePreference) obj;
            return C143912ba.m233950b(this.f391048a, languagePreference.f391048a) && C143912ba.m233950b(Float.valueOf(this.f391049b), Float.valueOf(languagePreference.f391049b)) && C143912ba.m233950b(Float.valueOf(this.f391050c), Float.valueOf(languagePreference.f391050c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f391048a, Float.valueOf(this.f391049b), Float.valueOf(this.f391050c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, C144441e.m234701a(this.f391048a));
        C143947c.m234087f(parcel, 2, this.f391049b);
        C143947c.m234087f(parcel, 3, this.f391050c);
        C143947c.m234083b(parcel, a);
    }
}
