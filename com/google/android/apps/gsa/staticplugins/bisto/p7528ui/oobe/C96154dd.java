package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89636g;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.dd */
/* compiled from: PG */
public final /* synthetic */ class C96154dd implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C96162dl f269175a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f269176b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f269177c;

    public /* synthetic */ C96154dd(C96162dl dlVar, C58833ax axVar, C58833ax axVar2) {
        this.f269175a = dlVar;
        this.f269176b = axVar;
        this.f269177c = axVar2;
    }

    public final C60870cx apply(Object obj) {
        C96162dl dlVar = this.f269175a;
        C58833ax axVar = this.f269176b;
        C58833ax axVar2 = this.f269177c;
        Account account = (Account) axVar.mo56107c();
        C89636g.m145901g(dlVar.f269186b, dlVar.f269189e, dlVar.f269192h, C58833ax.m90834k(account.name), axVar2);
        return ((C89496ch) dlVar.f269187c.mo27525b()).mo83410p(dlVar.f269189e, new C96155de(account), dlVar.f269195k);
    }
}
