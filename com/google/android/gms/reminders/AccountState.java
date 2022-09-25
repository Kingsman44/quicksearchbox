package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class AccountState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145772a();

    /* renamed from: a */
    public final boolean[] f394107a;

    /* renamed from: b */
    public final boolean[] f394108b;

    public AccountState(boolean[] zArr, boolean[] zArr2) {
        this.f394107a = zArr;
        this.f394108b = zArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234091j(parcel, 2, this.f394107a);
        C143947c.m234091j(parcel, 3, this.f394108b);
        C143947c.m234083b(parcel, a);
    }
}
