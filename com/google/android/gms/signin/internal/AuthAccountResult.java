package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class AuthAccountResult extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C145995a();

    /* renamed from: a */
    final int f394680a;

    /* renamed from: b */
    public int f394681b;

    /* renamed from: c */
    public Intent f394682c;

    public AuthAccountResult() {
        this(2, 0, (Intent) null);
    }

    public AuthAccountResult(int i, int i2, Intent intent) {
        this.f394680a = i;
        this.f394681b = i2;
        this.f394682c = intent;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394681b == 0 ? Status.f389615a : Status.f389619e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f394680a);
        C143947c.m234089h(parcel, 2, this.f394681b);
        C143947c.m234105x(parcel, 3, this.f394682c, i);
        C143947c.m234083b(parcel, a);
    }
}
