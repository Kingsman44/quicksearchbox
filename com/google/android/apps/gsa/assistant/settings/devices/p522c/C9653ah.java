package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.accounts.Account;
import android.widget.CompoundButton;
import com.google.android.apps.gsa.assistant.shared.v;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.ah */
/* compiled from: PG */
public final /* synthetic */ class C9653ah implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ v f33392a;

    /* renamed from: b */
    public final /* synthetic */ Account f33393b;

    public /* synthetic */ C9653ah(v vVar, Account account) {
        this.f33392a = vVar;
        this.f33393b = account;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f33392a.b(this.f33393b.name, z);
    }
}
