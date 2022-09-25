package com.google.android.apps.gsa.staticplugins.opa.util.calendar;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import p3186j$.util.Objects;

/* compiled from: PG */
public class OpenCalendarEventIntentData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C113835o();

    /* renamed from: a */
    public final String f315216a;

    /* renamed from: b */
    public final String f315217b;

    /* renamed from: c */
    public final String f315218c;

    /* renamed from: d */
    public final int f315219d;

    protected OpenCalendarEventIntentData(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f315216a = readString;
        this.f315217b = parcel.readString();
        this.f315218c = parcel.readString();
        this.f315219d = new int[]{1, 2}[parcel.readInt()];
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenCalendarEventIntentData)) {
            return false;
        }
        OpenCalendarEventIntentData openCalendarEventIntentData = (OpenCalendarEventIntentData) obj;
        return this.f315219d == openCalendarEventIntentData.f315219d && Objects.equals(this.f315216a, openCalendarEventIntentData.f315216a) && Objects.equals(this.f315217b, openCalendarEventIntentData.f315217b) && Objects.equals(this.f315218c, openCalendarEventIntentData.f315218c);
    }

    public final int hashCode() {
        return Objects.hash(this.f315216a, this.f315217b, this.f315218c, Integer.valueOf(this.f315219d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f315216a);
        parcel.writeString(this.f315217b);
        parcel.writeString(this.f315218c);
        int i2 = this.f315219d;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            return;
        }
        throw null;
    }

    public OpenCalendarEventIntentData(String str, String str2, String str3, int i) {
        C58838bb.m90869d(!C58837ba.m90859h(str), "The fallback url must not be empty");
        this.f315216a = str;
        this.f315217b = str2;
        this.f315218c = str3;
        this.f315219d = i;
    }
}
