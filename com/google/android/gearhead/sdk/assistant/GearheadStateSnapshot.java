package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.p060c.C0985o;

/* compiled from: PG */
public class GearheadStateSnapshot extends AbstractBundleable {
    public static final Parcelable.Creator CREATOR = new C142655a(GearheadStateSnapshot.class);
    @Deprecated

    /* renamed from: a */
    public int f387108a;

    /* renamed from: b */
    public int f387109b;

    /* renamed from: c */
    public boolean f387110c;

    /* renamed from: d */
    public String f387111d;

    /* renamed from: e */
    public C0985o f387112e = new C0985o(10);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117436a(Bundle bundle) {
        this.f387108a = bundle.getInt("UI_MODE");
        this.f387109b = bundle.getInt("FACET_TYPE");
        this.f387110c = bundle.getBoolean("IS_NAVIGATING");
        this.f387111d = bundle.getString("PRIMARY_REGION_APP_PACKAGE");
        Bundle bundle2 = bundle.getBundle("DEFAULT_PACKAGES");
        if (bundle2 != null) {
            this.f387112e.mo3730i(1, bundle2.getString("1"));
            this.f387112e.mo3730i(2, bundle2.getString("2"));
            this.f387112e.mo3730i(3, bundle2.getString("3"));
            this.f387112e.mo3730i(4, bundle2.getString("4"));
            this.f387112e.mo3730i(5, bundle2.getString("5"));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo117437b(Bundle bundle) {
        bundle.putInt("UI_MODE", this.f387108a);
        bundle.putInt("FACET_TYPE", this.f387109b);
        bundle.putBoolean("IS_NAVIGATING", this.f387110c);
        bundle.putString("PRIMARY_REGION_APP_PACKAGE", this.f387111d);
        Bundle bundle2 = new Bundle();
        bundle2.putString("1", (String) this.f387112e.mo3726e(1));
        bundle2.putString("2", (String) this.f387112e.mo3726e(2));
        bundle2.putString("3", (String) this.f387112e.mo3726e(3));
        bundle2.putString("4", (String) this.f387112e.mo3726e(4));
        bundle2.putString("5", (String) this.f387112e.mo3726e(5));
        bundle.putBundle("DEFAULT_PACKAGES", bundle2);
    }
}
