package com.google.android.apps.gsa.staticplugins.p7653ch;

import android.accounts.Account;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.C85637av;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.p375ai.p378b.C7880nj;
import com.google.p375ai.p378b.C7881nk;
import com.google.p375ai.p378b.C7882nl;
import com.google.p375ai.p378b.C7891nu;

/* renamed from: com.google.android.apps.gsa.staticplugins.ch.f */
/* compiled from: PG */
public final /* synthetic */ class C97636f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C97641k f272689a;

    /* renamed from: b */
    public final /* synthetic */ C7880nj f272690b;

    /* renamed from: c */
    public final /* synthetic */ C7891nu f272691c;

    /* renamed from: d */
    public final /* synthetic */ String f272692d;

    public /* synthetic */ C97636f(C97641k kVar, C7880nj njVar, C7891nu nuVar, String str) {
        this.f272689a = kVar;
        this.f272690b = njVar;
        this.f272691c = nuVar;
        this.f272692d = str;
    }

    public final void run() {
        C97641k kVar = this.f272689a;
        C7880nj njVar = this.f272690b;
        C7891nu nuVar = this.f272691c;
        String str = this.f272692d;
        Account[] r = ((C86054o) kVar.f272707b.mo27525b()).mo79684r();
        r.getClass();
        int length = r.length;
        C7881nk nkVar = (C7881nk) C7882nl.f27651i.createBuilder();
        nkVar.copyOnWrite();
        C7882nl nlVar = (C7882nl) nkVar.instance;
        nlVar.f27654b = njVar.f27650D;
        nlVar.f27653a |= 1;
        nkVar.copyOnWrite();
        C7882nl nlVar2 = (C7882nl) nkVar.instance;
        nlVar2.f27653a |= 2;
        nlVar2.f27656d = 2;
        nkVar.copyOnWrite();
        C7882nl nlVar3 = (C7882nl) nkVar.instance;
        nlVar3.f27658f = nuVar.f27730O;
        nlVar3.f27653a |= 8;
        nkVar.copyOnWrite();
        C7882nl nlVar4 = (C7882nl) nkVar.instance;
        nlVar4.f27653a |= 16;
        nlVar4.f27660h = length;
        if (((C85637av) kVar.f272708c.mo27525b()).mo79115a((C7882nl) nkVar.build()) != null) {
            ((SharedPreferences) kVar.f272711h.mo27525b()).edit().putInt(C90507o.f253032v.concat(str), njVar.f27650D).apply();
        }
    }
}
