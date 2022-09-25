package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1192d.p1193a.p1194a;

import com.google.android.libraries.search.assistant.p2786t.p2798c.C36616s;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36617t;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.d.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C15875l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C15878o f47146a;

    public /* synthetic */ C15875l(C15878o oVar) {
        this.f47146a = oVar;
    }

    public final Object apply(Object obj) {
        C15878o oVar = this.f47146a;
        List list = (List) obj;
        C59104x b = C15878o.f47150a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SuggestNotifProcessor");
        ((C59052c) ((C59052c) b).mo56372aa(46480)).mo56387q("Update %d new messages", list.size());
        oVar.f47151b.f47373n = C58485gu.m89842j(list);
        if (!list.isEmpty()) {
            C15877n nVar = new C15877n(oVar);
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(nVar), oVar.f47154e), "Failed to trigger by new message.", new Object[0]);
        }
        C36616s sVar = (C36616s) C36617t.f95460c.createBuilder();
        sVar.copyOnWrite();
        C36617t tVar = (C36617t) sVar.instance;
        tVar.f95463b = 1;
        tVar.f95462a = 1 | tVar.f95462a;
        return (C36617t) sVar.build();
    }
}
