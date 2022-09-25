package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.accounts.Account;
import android.widget.CompoundButton;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8419b.p8420a.C110045b;
import com.google.common.base.C58847bk;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.a */
/* compiled from: PG */
public final /* synthetic */ class C9644a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C9672b f33366a;

    /* renamed from: b */
    public final /* synthetic */ Account f33367b;

    public /* synthetic */ C9644a(C9672b bVar, Account account) {
        this.f33366a = bVar;
        this.f33367b = account;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ((C110045b) ((C58847bk) this.f33366a.f33449a).f156646a).f306609a.edit().putBoolean("key_prefix_am_chip_optin__".concat(String.valueOf(this.f33367b.name)), z).apply();
    }
}
