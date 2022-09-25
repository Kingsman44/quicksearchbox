package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.accounts.Account;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.b */
/* compiled from: PG */
public final /* synthetic */ class C96469b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C96497q f269889a;

    /* renamed from: b */
    public final /* synthetic */ Account f269890b;

    /* renamed from: c */
    public final /* synthetic */ String f269891c;

    public /* synthetic */ C96469b(C96497q qVar, Account account, String str) {
        this.f269889a = qVar;
        this.f269890b = account;
        this.f269891c = str;
    }

    public final C60870cx apply(Object obj) {
        C96497q qVar = this.f269889a;
        Account account = this.f269890b;
        String str = this.f269891c;
        C124620am amVar = (C124620am) obj;
        if ((amVar.f343763a & 1) == 0 || (!amVar.f343766d && !amVar.f343767e)) {
            return C118826c.f331423b;
        }
        C59104x b = C96497q.f269967a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoAssistantSettingsHelper");
        ((C59052c) ((C59052c) b).mo56372aa(17115)).mo56386p("#resetAssistantSettingsToDefaults");
        C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
        cnVar.copyOnWrite();
        C49891cv cvVar = (C49891cv) cnVar.instance;
        cvVar.f129663a |= 1024;
        cvVar.f129670h = false;
        cnVar.copyOnWrite();
        C49891cv cvVar2 = (C49891cv) cnVar.instance;
        cvVar2.f129666d = 2;
        cvVar2.f129663a = 2 | cvVar2.f129663a;
        return qVar.mo90180g(account, str, (C49891cv) cnVar.build(), new C96488h(qVar, str, account));
    }
}
