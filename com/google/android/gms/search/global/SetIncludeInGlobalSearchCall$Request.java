package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class SetIncludeInGlobalSearchCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145912p();

    /* renamed from: a */
    public String f394467a;

    /* renamed from: b */
    public String f394468b;

    /* renamed from: c */
    public boolean f394469c;

    public SetIncludeInGlobalSearchCall$Request() {
    }

    public SetIncludeInGlobalSearchCall$Request(String str, String str2, boolean z) {
        this.f394467a = str;
        this.f394468b = str2;
        this.f394469c = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f394467a);
        C143947c.m234084c(parcel, 2, this.f394469c);
        C143947c.m234106y(parcel, 3, this.f394468b);
        C143947c.m234083b(parcel, a);
    }
}
