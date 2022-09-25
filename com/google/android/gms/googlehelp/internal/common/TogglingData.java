package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class TogglingData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C144306al();

    /* renamed from: a */
    String f390823a;

    /* renamed from: b */
    String f390824b;

    /* renamed from: c */
    String f390825c;

    private TogglingData() {
    }

    public TogglingData(String str, String str2, String str3) {
        this.f390823a = str;
        this.f390824b = str2;
        this.f390825c = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f390823a);
        C143947c.m234106y(parcel, 3, this.f390824b);
        C143947c.m234106y(parcel, 4, this.f390825c);
        C143947c.m234083b(parcel, a);
    }
}
