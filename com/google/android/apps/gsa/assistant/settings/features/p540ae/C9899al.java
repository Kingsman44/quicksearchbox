package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.accounts.Account;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.shared.C73739b;
import com.google.android.apps.gsa.assistant.settings.shared.a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.al */
/* compiled from: PG */
public final /* synthetic */ class C9899al implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9907at f33958a;

    public /* synthetic */ C9899al(C9907at atVar) {
        this.f33958a = atVar;
    }

    public final void onClick(View view) {
        C9907at atVar = this.f33958a;
        a c = C73739b.m108291c();
        Account a = atVar.f33975f.a();
        a.getClass();
        c.b(a.name);
        atVar.f33972c.startActivityForResult(c.a().mo65211b(), 51234);
    }
}
