package com.google.android.apps.search.assistant.platform.appintegration.p9001g;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119861db;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119863dd;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.g.w */
/* compiled from: PG */
public final /* synthetic */ class C119572w implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C119574y f333249a;

    /* renamed from: b */
    public final /* synthetic */ C119834cb f333250b;

    public /* synthetic */ C119572w(C119574y yVar, C119834cb cbVar) {
        this.f333249a = yVar;
        this.f333250b = cbVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C119574y yVar = this.f333249a;
        C119834cb cbVar = this.f333250b;
        C119748c cVar = yVar.f333255b;
        if (cVar != null) {
            C119861db dbVar = (C119861db) C119863dd.f333821c.createBuilder();
            dbVar.copyOnWrite();
            C119863dd ddVar = (C119863dd) dbVar.instance;
            cbVar.getClass();
            ddVar.f333824b = cbVar;
            ddVar.f333823a = 2;
            return cVar.mo104499b((C119863dd) dbVar.build());
        }
        throw new IllegalStateException("sendTextQuery or startVoiceQuery should be called before stopQuery");
    }
}
