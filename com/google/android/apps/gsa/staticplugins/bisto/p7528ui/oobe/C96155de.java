package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124549e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.de */
/* compiled from: PG */
public final /* synthetic */ class C96155de implements C124549e {

    /* renamed from: a */
    public final /* synthetic */ Account f269178a;

    public /* synthetic */ C96155de(Account account) {
        this.f269178a = account;
    }

    /* renamed from: a */
    public final boolean mo89077a(C124548d dVar) {
        return dVar.mo106521s() == C124636bb.OPA_ENABLED && !dVar.mo106517o(this.f269178a).f343764b.isEmpty();
    }
}
