package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144878ai();

    /* renamed from: a */
    public final List f391752a;

    /* renamed from: b */
    public final int f391753b;

    /* renamed from: c */
    public final String f391754c;

    /* renamed from: d */
    public final String f391755d;

    public GeofencingRequest(List list, int i, String str, String str2) {
        this.f391752a = list;
        this.f391753b = i;
        this.f391754c = str;
        this.f391755d = str2;
    }

    public final String toString() {
        return "GeofencingRequest[geofences=" + this.f391752a + ", initialTrigger=" + this.f391753b + ", tag=" + this.f391754c + ", attributionTag=" + this.f391755d + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, this.f391752a);
        C143947c.m234089h(parcel, 2, this.f391753b);
        C143947c.m234106y(parcel, 3, this.f391754c);
        C143947c.m234106y(parcel, 4, this.f391755d);
        C143947c.m234083b(parcel, a);
    }
}
