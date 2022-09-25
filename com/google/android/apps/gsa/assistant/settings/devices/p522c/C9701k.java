package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.content.SharedPreferences;
import android.widget.CompoundButton;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.k */
/* compiled from: PG */
public final /* synthetic */ class C9701k implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C9702l f33525a;

    /* renamed from: b */
    public final /* synthetic */ String f33526b;

    /* renamed from: c */
    public final /* synthetic */ ItemView f33527c;

    public /* synthetic */ C9701k(C9702l lVar, String str, ItemView itemView) {
        this.f33525a = lVar;
        this.f33526b = str;
        this.f33527c = itemView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9702l lVar = this.f33525a;
        String str = this.f33526b;
        ItemView itemView = this.f33527c;
        ((SharedPreferences) lVar.f33530c.mo27525b()).edit().putBoolean(str, z).apply();
        itemView.t().setChecked(z);
    }
}
