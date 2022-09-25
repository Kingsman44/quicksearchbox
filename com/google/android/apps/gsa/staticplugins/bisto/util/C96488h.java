package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.h */
/* compiled from: PG */
public final /* synthetic */ class C96488h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C96497q f269949a;

    /* renamed from: b */
    public final /* synthetic */ String f269950b;

    /* renamed from: c */
    public final /* synthetic */ Account f269951c;

    public /* synthetic */ C96488h(C96497q qVar, String str, Account account) {
        this.f269949a = qVar;
        this.f269950b = str;
        this.f269951c = account;
    }

    public final void run() {
        C96497q qVar = this.f269949a;
        String str = this.f269950b;
        ((C89492cd) qVar.f269968b.mo27525b()).mo83380V(str, this.f269951c.name, C96492l.f269961a);
        qVar.f269971e.mo90176d(str, false);
        ((C89492cd) qVar.f269968b.mo27525b()).mo83377S(str, false);
    }
}
