package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.accounts.Account;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.shared.C73739b;
import com.google.android.apps.gsa.assistant.settings.shared.a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.bj */
/* compiled from: PG */
public final /* synthetic */ class C9926bj implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9935bs f34029a;

    public /* synthetic */ C9926bj(C9935bs bsVar) {
        this.f34029a = bsVar;
    }

    public final void onClick(View view) {
        C9935bs bsVar = this.f34029a;
        a c = C73739b.m108291c();
        Account a = bsVar.f34045e.a();
        a.getClass();
        c.b(a.name);
        bsVar.f34042b.startActivityForResult(c.a().mo65211b(), 0);
    }
}
