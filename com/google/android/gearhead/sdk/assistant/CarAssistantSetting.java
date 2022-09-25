package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: PG */
public class CarAssistantSetting extends AbstractBundleable {
    public static final Parcelable.Creator CREATOR = new C142655a(CarAssistantSetting.class);

    /* renamed from: a */
    public int f387094a;

    /* renamed from: b */
    public boolean f387095b;

    /* renamed from: c */
    public int f387096c;

    /* renamed from: d */
    public String f387097d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117436a(Bundle bundle) {
        this.f387094a = bundle.getInt("SETTING_KEY");
        this.f387095b = bundle.getBoolean("BOOL_VALUE");
        this.f387096c = bundle.getInt("INT_VALUE");
        this.f387097d = bundle.getString("STRING_VALUE");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo117437b(Bundle bundle) {
        bundle.putInt("SETTING_KEY", this.f387094a);
        bundle.putBoolean("BOOL_VALUE", this.f387095b);
        bundle.putInt("INT_VALUE", this.f387096c);
        bundle.putString("STRING_VALUE", this.f387097d);
    }
}
