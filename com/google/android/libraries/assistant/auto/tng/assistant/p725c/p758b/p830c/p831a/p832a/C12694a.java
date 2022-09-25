package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p832a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12867k;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.a.a */
/* compiled from: PG */
final class C12694a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C12709p f39757a;

    public C12694a(C12709p pVar) {
        this.f39757a = pVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C12709p pVar = this.f39757a;
        C12702i iVar = new C12702i(pVar, th);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(iVar), pVar.f39792b), "Error failing ConversationDelta stream", new Object[0]);
        C59104x d = C12695b.f39758a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ConversationDeltaRendrr");
        ((C59052c) ((C59052c) d).mo56372aa(44399)).mo56386p("Error getting conversation result");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C12867k kVar = (C12867k) obj;
        C12709p pVar = this.f39757a;
        C12704k kVar2 = new C12704k(pVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(kVar2), pVar.f39792b), "Error ending ConversationDelta stream", new Object[0]);
    }
}
