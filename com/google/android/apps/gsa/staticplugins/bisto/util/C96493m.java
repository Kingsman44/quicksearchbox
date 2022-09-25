package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.accounts.Account;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.assistant.p3861at.acz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.m */
/* compiled from: PG */
public final /* synthetic */ class C96493m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C96497q f269962a;

    /* renamed from: b */
    public final /* synthetic */ C49891cv f269963b;

    /* renamed from: c */
    public final /* synthetic */ Account f269964c;

    public /* synthetic */ C96493m(C96497q qVar, C49891cv cvVar, Account account) {
        this.f269962a = qVar;
        this.f269963b = cvVar;
        this.f269964c = account;
    }

    public final C60870cx apply(Object obj) {
        C96497q qVar = this.f269962a;
        C49891cv cvVar = this.f269963b;
        Account account = this.f269964c;
        C124620am amVar = (C124620am) obj;
        if ((amVar.f343763a & 1) != 0) {
            C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
            C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
            String str = amVar.f343764b;
            dfVar.copyOnWrite();
            C49903dg dgVar = (C49903dg) dfVar.instance;
            str.getClass();
            dgVar.f129714a |= 1;
            dgVar.f129715b = str;
            C49875cf cfVar = C49875cf.ASSISTANT_SDK;
            dfVar.copyOnWrite();
            C49903dg dgVar2 = (C49903dg) dfVar.instance;
            dgVar2.f129716c = cfVar.f129621v;
            dgVar2.f129714a |= 2;
            dfVar.copyOnWrite();
            C49903dg dgVar3 = (C49903dg) dfVar.instance;
            cvVar.getClass();
            dgVar3.f129719f = cvVar;
            dgVar3.f129714a |= 32;
            daVar.mo53371b(dfVar);
            C49898db dbVar = (C49898db) daVar.build();
            acw acw = (acw) acx.f128971H.createBuilder();
            acw.copyOnWrite();
            acx acx = (acx) acw.instance;
            dbVar.getClass();
            acx.f128991h = dbVar;
            acx.f128984a |= 32;
            return qVar.f269969c.d(account, (acx) acw.build(), 10, TimeUnit.SECONDS, qVar.getClass().getSimpleName());
        }
        C59104x b = C96497q.f269967a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoAssistantSettingsHelper");
        ((C59052c) ((C59052c) b).mo56372aa(17114)).mo56386p("No DUSI");
        return C60856cj.m92900i(acz.f129010n);
    }
}
