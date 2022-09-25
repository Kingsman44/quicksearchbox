package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class OverflowMenuItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144303ai();

    /* renamed from: a */
    final int f390820a;

    /* renamed from: b */
    final String f390821b;

    /* renamed from: c */
    final Intent f390822c;

    public OverflowMenuItem(int i, String str, Intent intent) {
        this.f390820a = i;
        this.f390821b = str;
        this.f390822c = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f390820a);
        C143947c.m234106y(parcel, 3, this.f390821b);
        C143947c.m234105x(parcel, 4, this.f390822c, i);
        C143947c.m234083b(parcel, a);
    }
}
