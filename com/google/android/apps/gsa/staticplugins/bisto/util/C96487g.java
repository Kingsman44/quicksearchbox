package com.google.android.apps.gsa.staticplugins.bisto.util;

import com.google.assistant.p3861at.C50131ls;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.g */
/* compiled from: PG */
public final /* synthetic */ class C96487g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f269948a;

    public /* synthetic */ C96487g(int i) {
        this.f269948a = i;
    }

    public final Object apply(Object obj) {
        int i = this.f269948a;
        C50131ls lsVar = ((act) obj).f128879F;
        if (lsVar == null) {
            lsVar = C50131ls.f130322b;
        }
        if (!lsVar.f130324a) {
            return Integer.valueOf(i);
        }
        C59104x b = C96497q.f269967a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoAssistantSettingsHelper");
        ((C59052c) ((C59052c) b).mo56372aa(17118)).mo56386p("VM disallowed by GWFE");
        return 1;
    }
}
