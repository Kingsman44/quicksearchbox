package com.google.android.gms.lockbox.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.lockbox.C144982d;

/* compiled from: PG */
public class LockboxOptInFlags extends AbstractSafeParcelable implements C144982d {
    public static final Parcelable.Creator CREATOR = new C144991g();

    /* renamed from: a */
    public final String f391956a;

    /* renamed from: b */
    public final boolean f391957b;

    /* renamed from: c */
    public final boolean f391958c;

    public LockboxOptInFlags(String str, boolean z, boolean z2) {
        this.f391956a = str;
        this.f391957b = z;
        this.f391958c = z2;
    }

    /* renamed from: b */
    public final boolean mo120481b() {
        return this.f391958c;
    }

    /* renamed from: c */
    public final boolean mo120482c() {
        return this.f391957b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f391956a);
        C143947c.m234084c(parcel, 3, this.f391957b);
        C143947c.m234084c(parcel, 4, this.f391958c);
        C143947c.m234083b(parcel, a);
    }
}
