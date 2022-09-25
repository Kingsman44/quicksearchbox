package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.i */
/* compiled from: PG */
public final /* synthetic */ class C96489i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C96497q f269952a;

    /* renamed from: b */
    public final /* synthetic */ boolean f269953b;

    /* renamed from: c */
    public final /* synthetic */ String f269954c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f269955d;

    public /* synthetic */ C96489i(C96497q qVar, boolean z, String str, C58833ax axVar) {
        this.f269952a = qVar;
        this.f269953b = z;
        this.f269954c = str;
        this.f269955d = axVar;
    }

    public final void run() {
        C96497q qVar = this.f269952a;
        boolean z = this.f269953b;
        String str = this.f269954c;
        C58833ax axVar = this.f269955d;
        C59104x b = C96497q.f269967a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoAssistantSettingsHelper");
        ((C59052c) ((C59052c) b).mo56372aa(17119)).mo56357J("pr_enabled = %b for device %s", z, str);
        ((C89492cd) qVar.f269968b.mo27525b()).mo83377S(str, z);
        ((C89492cd) qVar.f269968b.mo27525b()).mo83380V(str, ((Account) axVar.mo56107c()).name, new C96486f(z));
    }
}
