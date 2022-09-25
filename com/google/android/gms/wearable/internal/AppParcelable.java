package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import p3186j$.util.Objects;

/* compiled from: PG */
public class AppParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146506f();

    /* renamed from: a */
    public final String f395538a;

    /* renamed from: b */
    public final String f395539b;

    /* renamed from: c */
    public final WebIconParcelable f395540c;

    /* renamed from: d */
    public final String f395541d;

    /* renamed from: e */
    public final String f395542e;

    /* renamed from: f */
    public final Float f395543f;

    /* renamed from: g */
    public final AppWearDetailsParcelable f395544g;

    public AppParcelable(String str, String str2, WebIconParcelable webIconParcelable, String str3, String str4, Float f, AppWearDetailsParcelable appWearDetailsParcelable) {
        this.f395538a = str;
        this.f395539b = str2;
        this.f395540c = webIconParcelable;
        this.f395541d = str3;
        this.f395542e = str4;
        this.f395543f = f;
        this.f395544g = appWearDetailsParcelable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AppParcelable appParcelable = (AppParcelable) obj;
            return Objects.equals(this.f395538a, appParcelable.f395538a) && Objects.equals(this.f395539b, appParcelable.f395539b) && Objects.equals(this.f395540c, appParcelable.f395540c) && Objects.equals(this.f395541d, appParcelable.f395541d) && Objects.equals(this.f395542e, appParcelable.f395542e) && Objects.equals(this.f395543f, appParcelable.f395543f) && Objects.equals(this.f395544g, appParcelable.f395544g);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f395538a, this.f395539b, this.f395540c, this.f395541d, this.f395542e, this.f395543f, this.f395544g);
    }

    public final String toString() {
        String str = this.f395539b;
        String str2 = this.f395541d;
        String str3 = this.f395542e;
        Float f = this.f395543f;
        String valueOf = String.valueOf(this.f395544g);
        String str4 = this.f395538a;
        String valueOf2 = String.valueOf(this.f395540c);
        return "AppParcelable{title='" + str + "', developerName='" + str2 + "', formattedPrice='" + str3 + "', starRating=" + f + ", wearDetails=" + valueOf + ", deepLinkUri='" + str4 + "', icon=" + valueOf2 + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f395538a);
        C143947c.m234106y(parcel, 2, this.f395539b);
        C143947c.m234105x(parcel, 3, this.f395540c, i);
        C143947c.m234106y(parcel, 4, this.f395541d);
        C143947c.m234106y(parcel, 5, this.f395542e);
        C143947c.m234097p(parcel, 6, this.f395543f);
        C143947c.m234105x(parcel, 7, this.f395544g, i);
        C143947c.m234083b(parcel, a);
    }
}
