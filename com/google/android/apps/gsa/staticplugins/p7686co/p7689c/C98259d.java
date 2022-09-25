package com.google.android.apps.gsa.staticplugins.p7686co.p7689c;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.c.d */
/* compiled from: PG */
public final /* synthetic */ class C98259d implements C86091a {

    /* renamed from: a */
    public final /* synthetic */ C85651bb f274357a;

    public /* synthetic */ C98259d(C85651bb bbVar) {
        this.f274357a = bbVar;
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        C85651bb bbVar = this.f274357a;
        C59071e eVar = C98264i.f274366a;
        Account a = ((C86054o) bbVar.f231495f.mo27525b()).mo79668a();
        if (a != null && a.name != null && !((C86338r) bbVar.f231492c.mo27525b()).contains(C85651bb.m137446l(a.name))) {
            boolean M = bbVar.mo79140M();
            C86337q b = ((C86338r) bbVar.f231492c.mo27525b()).mo80076b();
            b.mo80073h(C85651bb.m137446l(a.name), "unset");
            b.mo80073h(C85651bb.m137445k(a.name), String.format("%b %s", new Object[]{Boolean.valueOf(M), "unset"}));
            b.apply();
        }
    }
}
