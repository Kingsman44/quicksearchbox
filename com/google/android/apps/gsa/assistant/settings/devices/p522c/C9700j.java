package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.content.SharedPreferences;
import android.widget.CompoundButton;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.j */
/* compiled from: PG */
public final /* synthetic */ class C9700j implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C9702l f33522a;

    /* renamed from: b */
    public final /* synthetic */ String f33523b;

    /* renamed from: c */
    public final /* synthetic */ ItemView f33524c;

    public /* synthetic */ C9700j(C9702l lVar, String str, ItemView itemView) {
        this.f33522a = lVar;
        this.f33523b = str;
        this.f33524c = itemView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9702l lVar = this.f33522a;
        String str = this.f33523b;
        ItemView itemView = this.f33524c;
        ((SharedPreferences) lVar.f33530c.mo27525b()).edit().putBoolean(str, z).apply();
        itemView.setEnabled(z);
    }
}
