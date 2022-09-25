package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.accounts.Account;
import android.view.View;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.dx */
/* compiled from: PG */
final class C108921dx implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C108925ea f302849a;

    /* renamed from: b */
    private final boolean f302850b;

    public C108921dx(C108925ea eaVar, boolean z) {
        this.f302849a = eaVar;
        this.f302850b = z;
    }

    public final void onClick(View view) {
        Account a;
        if (!this.f302850b && this.f302849a.getArguments().getBoolean("key_track_opt_out", false) && (a = this.f302849a.f302858g.a()) != null) {
            this.f302849a.f302859h.i(a.name);
        }
        C108925ea eaVar = this.f302849a;
        int i = eaVar.f302866o;
        if (i == 0) {
            if (this.f302850b) {
                C89994f fVar = eaVar.f302855d;
                EventForDump.m147676e(5, "enable personal response");
                fVar.mo83837C(true);
            } else {
                C89994f fVar2 = eaVar.f302855d;
                EventForDump.m147676e(5, "disable personal response");
                fVar2.mo83837C(false);
            }
            this.f302849a.mo77318iT().mo77312a();
        } else if (i == 2) {
            if (this.f302850b) {
                C89994f fVar3 = eaVar.f302855d;
                EventForDump.m147676e(5, "enable personal response");
                fVar3.mo83837C(true);
            } else {
                C89994f fVar4 = eaVar.f302855d;
                EventForDump.m147676e(5, "disable personal response");
                fVar4.mo83837C(false);
            }
            this.f302849a.f302867p.mo98663a(this.f302850b);
            this.f302849a.mo77318iT().mo77312a();
        } else if (i == 1) {
            eaVar.f302867p.mo98663a(this.f302850b);
            this.f302849a.mo77318iT().mo77312a();
        }
    }
}
