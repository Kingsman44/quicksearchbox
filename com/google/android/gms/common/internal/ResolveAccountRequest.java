package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143920bi();

    /* renamed from: a */
    final int f390037a;

    /* renamed from: b */
    public final Account f390038b;

    /* renamed from: c */
    public final int f390039c;

    /* renamed from: d */
    public final GoogleSignInAccount f390040d;

    public ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f390037a = i;
        this.f390038b = account;
        this.f390039c = i2;
        this.f390040d = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f390037a);
        C143947c.m234105x(parcel, 2, this.f390038b, i);
        C143947c.m234089h(parcel, 3, this.f390039c);
        C143947c.m234105x(parcel, 4, this.f390040d, i);
        C143947c.m234083b(parcel, a);
    }
}
