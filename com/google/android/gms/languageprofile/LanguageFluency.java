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
public final class LanguageFluency extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144443c();

    /* renamed from: a */
    public final Locale f391045a;

    /* renamed from: b */
    public final float f391046b;

    /* renamed from: c */
    public final float f391047c;

    public LanguageFluency(Locale locale, float f, float f2) {
        this.f391045a = locale;
        this.f391046b = f;
        this.f391047c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguageFluency) {
            LanguageFluency languageFluency = (LanguageFluency) obj;
            return C143912ba.m233950b(this.f391045a, languageFluency.f391045a) && C143912ba.m233950b(Float.valueOf(this.f391046b), Float.valueOf(languageFluency.f391046b)) && C143912ba.m233950b(Float.valueOf(this.f391047c), Float.valueOf(languageFluency.f391047c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f391045a, Float.valueOf(this.f391046b), Float.valueOf(this.f391047c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, C144441e.m234701a(this.f391045a));
        C143947c.m234087f(parcel, 2, this.f391046b);
        C143947c.m234087f(parcel, 3, this.f391047c);
        C143947c.m234083b(parcel, a);
    }
}
