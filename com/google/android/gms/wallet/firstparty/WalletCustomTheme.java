package com.google.android.gms.wallet.firstparty;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class WalletCustomTheme extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146360h();

    /* renamed from: a */
    public int f395369a;

    /* renamed from: b */
    public int f395370b;

    /* renamed from: c */
    public int f395371c;

    /* renamed from: d */
    Bundle f395372d;

    /* renamed from: e */
    String f395373e;

    public WalletCustomTheme() {
        this.f395370b = 0;
        this.f395371c = 0;
        this.f395369a = 0;
        this.f395372d = new Bundle();
        this.f395373e = BuildConfig.FLAVOR;
    }

    public WalletCustomTheme(int i, Bundle bundle, String str, int i2, int i3) {
        this.f395372d = bundle;
        this.f395369a = i;
        this.f395370b = i2;
        this.f395371c = i3;
        this.f395373e = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395369a);
        C143947c.m234093l(parcel, 3, this.f395372d);
        C143947c.m234106y(parcel, 4, this.f395373e);
        C143947c.m234089h(parcel, 5, this.f395370b);
        C143947c.m234089h(parcel, 6, this.f395371c);
        C143947c.m234083b(parcel, a);
    }
}
