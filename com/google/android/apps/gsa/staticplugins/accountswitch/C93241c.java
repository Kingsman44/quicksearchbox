package com.google.android.apps.gsa.staticplugins.accountswitch;

import android.content.Intent;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.C37298n;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accountswitch.c */
/* compiled from: PG */
public final class C93241c {

    /* renamed from: a */
    public final AccountSwitchActivity f260009a;

    /* renamed from: b */
    public final C93245g f260010b;

    /* renamed from: c */
    public final C37215b f260011c;

    public C93241c(AccountSwitchActivity accountSwitchActivity, C37215b bVar, C93245g gVar) {
        this.f260009a = accountSwitchActivity;
        this.f260010b = gVar;
        this.f260011c = bVar;
    }

    /* renamed from: a */
    public final void mo87575a(Intent intent) {
        ((C37298n) this.f260011c).mo40849c(C37182a.f98144hE);
        this.f260010b.mo87578a(intent.getStringExtra("agsa_selected_account"), new C93240b(this));
    }
}
