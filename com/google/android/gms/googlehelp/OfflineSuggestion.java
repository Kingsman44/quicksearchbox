package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class OfflineSuggestion extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144334l();

    /* renamed from: a */
    final String f390785a;

    /* renamed from: b */
    final String f390786b;

    /* renamed from: c */
    final String f390787c;

    /* renamed from: d */
    final String f390788d;

    public OfflineSuggestion(String str, String str2, String str3, String str4) {
        this.f390785a = str;
        this.f390786b = str2;
        this.f390787c = str4;
        this.f390788d = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f390785a);
        C143947c.m234106y(parcel, 3, this.f390786b);
        C143947c.m234106y(parcel, 4, this.f390787c);
        C143947c.m234106y(parcel, 5, this.f390788d);
        C143947c.m234083b(parcel, a);
    }
}
