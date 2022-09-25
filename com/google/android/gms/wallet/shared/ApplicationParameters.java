package com.google.android.gms.wallet.shared;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* compiled from: PG */
public final class ApplicationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146380b();

    /* renamed from: a */
    public int f395396a;

    /* renamed from: b */
    public Account f395397b;

    /* renamed from: c */
    public Bundle f395398c;

    /* renamed from: d */
    boolean f395399d;

    /* renamed from: e */
    int f395400e;

    /* renamed from: f */
    public WalletCustomTheme f395401f;

    /* renamed from: g */
    int f395402g;

    /* renamed from: h */
    double f395403h;

    /* renamed from: i */
    double f395404i;

    /* renamed from: j */
    int f395405j;

    /* renamed from: k */
    int f395406k;

    public ApplicationParameters() {
        this.f395399d = false;
        this.f395396a = 1;
        this.f395400e = 1;
        this.f395402g = 0;
        this.f395405j = 0;
        this.f395406k = -1;
    }

    public ApplicationParameters(int i, Account account, Bundle bundle, boolean z, int i2, WalletCustomTheme walletCustomTheme, int i3, double d, double d2, int i4, int i5) {
        this.f395396a = i;
        this.f395397b = account;
        this.f395398c = bundle;
        this.f395399d = z;
        this.f395400e = i2;
        this.f395401f = walletCustomTheme;
        this.f395402g = i3;
        this.f395403h = d;
        this.f395404i = d2;
        this.f395405j = i4;
        this.f395406k = i5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395396a);
        C143947c.m234105x(parcel, 3, this.f395397b, i);
        C143947c.m234093l(parcel, 4, this.f395398c);
        C143947c.m234084c(parcel, 5, this.f395399d);
        C143947c.m234089h(parcel, 6, this.f395400e);
        C143947c.m234105x(parcel, 7, this.f395401f, i);
        C143947c.m234089h(parcel, 8, this.f395402g);
        C143947c.m234086e(parcel, 9, this.f395403h);
        C143947c.m234086e(parcel, 10, this.f395404i);
        C143947c.m234089h(parcel, 11, this.f395405j);
        C143947c.m234089h(parcel, 12, this.f395406k);
        C143947c.m234083b(parcel, a);
    }
}
