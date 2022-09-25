package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* compiled from: PG */
public final class Name implements Parcelable, C42304cc {
    public static final Parcelable.Creator CREATOR = new C42307cf();

    /* renamed from: a */
    public final String f110777a;

    /* renamed from: b */
    public final String f110778b;

    /* renamed from: c */
    public final String f110779c;

    /* renamed from: d */
    public final PersonFieldMetadata f110780d;

    /* renamed from: e */
    public final int f110781e;

    /* renamed from: f */
    private final String f110782f;

    public Name(String str, String str2, String str3, String str4, int i, PersonFieldMetadata personFieldMetadata) {
        this.f110777a = str;
        this.f110778b = str2;
        this.f110782f = str3;
        this.f110779c = str4;
        this.f110781e = i;
        this.f110780d = personFieldMetadata;
    }

    /* renamed from: a */
    public static String m74375a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    /* renamed from: b */
    public final PersonFieldMetadata mo44976b() {
        return this.f110780d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Name) {
            Name name = (Name) obj;
            return C58832aw.m90831a(this.f110777a, name.f110777a) && C58832aw.m90831a(this.f110778b, name.f110778b) && C58832aw.m90831a(this.f110782f, name.f110782f) && C58832aw.m90831a(this.f110779c, name.f110779c) && this.f110781e == name.f110781e && C58832aw.m90831a(this.f110780d, name.f110780d);
        }
    }

    public final int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.f110777a;
        objArr[1] = this.f110778b;
        objArr[2] = this.f110782f;
        objArr[3] = this.f110779c;
        int i = this.f110781e;
        int i2 = i - 1;
        if (i != 0) {
            objArr[4] = Integer.valueOf(i2);
            objArr[5] = this.f110780d;
            return Arrays.hashCode(objArr);
        }
        throw null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110777a);
        parcel.writeString(this.f110778b);
        parcel.writeString(this.f110782f);
        parcel.writeString(this.f110779c);
        int i2 = this.f110781e;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            parcel.writeParcelable(this.f110780d, i);
            return;
        }
        throw null;
    }
}
