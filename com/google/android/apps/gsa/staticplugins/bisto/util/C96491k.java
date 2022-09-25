package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.accounts.Account;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124551g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.k */
/* compiled from: PG */
public final /* synthetic */ class C96491k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Account f269959a;

    /* renamed from: b */
    public final /* synthetic */ String f269960b;

    public /* synthetic */ C96491k(Account account, String str) {
        this.f269959a = account;
        this.f269960b = str;
    }

    public final C60870cx apply(Object obj) {
        Account account = this.f269959a;
        String str = this.f269960b;
        C124548d dVar = (C124548d) obj;
        if ((dVar.mo106518p(account.name).f343763a & 1) != 0) {
            return C60856cj.m92900i(dVar.mo106518p(account.name));
        }
        C59104x d = C96497q.f269967a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoAssistantSettingsHelper");
        ((C59052c) ((C59052c) d).mo56372aa(17113)).mo56389s("DUSI Missing for %s", str);
        throw new C124551g();
    }
}
