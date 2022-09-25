package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.accounts.Account;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.google.android.apps.gsa.assistant.shared.v;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.ak */
/* compiled from: PG */
public final /* synthetic */ class C9656ak implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C9664as f33399a;

    /* renamed from: b */
    public final /* synthetic */ Switch f33400b;

    public /* synthetic */ C9656ak(C9664as asVar, Switch switchR) {
        this.f33399a = asVar;
        this.f33400b = switchR;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9664as asVar = this.f33399a;
        Switch switchR = this.f33400b;
        Account a = asVar.f33410a.a();
        if (a != null) {
            ((v) asVar.f33411b.mo27525b()).a(a.name, z);
            ((v) asVar.f33411b.mo27525b()).h(a.name);
            switchR.setChecked(z);
            asVar.f33420k.setEnabled(z);
            asVar.f33420k.t().setChecked(z);
            asVar.f33421l.setEnabled(z);
            asVar.f33421l.t().setChecked(z);
            asVar.f33422m.setEnabled(z);
            asVar.f33418i.mo86698c(z);
        }
    }
}
