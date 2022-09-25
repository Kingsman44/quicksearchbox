package com.google.android.apps.gsa.staticplugins.p7653ch;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.C85637av;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.p375ai.p378b.C7891nu;

/* renamed from: com.google.android.apps.gsa.staticplugins.ch.h */
/* compiled from: PG */
public final /* synthetic */ class C97638h implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C97641k f272695a;

    /* renamed from: b */
    public final /* synthetic */ String f272696b;

    /* renamed from: c */
    public final /* synthetic */ C7891nu f272697c;

    public /* synthetic */ C97638h(C97641k kVar, String str, C7891nu nuVar) {
        this.f272695a = kVar;
        this.f272696b = str;
        this.f272697c = nuVar;
    }

    public final void run() {
        C97641k kVar = this.f272695a;
        String str = this.f272696b;
        C7891nu nuVar = this.f272697c;
        Account w = ((C86054o) kVar.f272707b.mo27525b()).mo79689w(str);
        w.getClass();
        int c = ((C85651bb) kVar.f272710g.mo27525b()).mo79142c(str);
        if (c == 0 || c == 3) {
            c = ((C85651bb) kVar.f272710g.mo27525b()).mo79143d(str);
        }
        if (c == 1) {
            ((C85637av) kVar.f272708c.mo27525b()).mo79116b(w, nuVar);
        }
    }
}
