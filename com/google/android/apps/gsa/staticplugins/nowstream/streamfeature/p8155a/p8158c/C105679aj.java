package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c;

import com.google.android.apps.gsa.sidekick.main.entry.C91318aw;
import com.google.android.apps.gsa.sidekick.main.entry.C91319ax;
import com.google.android.apps.gsa.sidekick.main.p7200c.C91282g;
import com.google.common.base.C58817ah;
import com.google.p375ai.p378b.C7726hr;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.aj */
/* compiled from: PG */
public final /* synthetic */ class C105679aj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C105681al f294812a;

    public /* synthetic */ C105679aj(C105681al alVar) {
        this.f294812a = alVar;
    }

    public final Object apply(Object obj) {
        C105681al alVar = this.f294812a;
        C91319ax axVar = (C91319ax) alVar.f294819e.f294868g.mo27525b();
        C91318aw awVar = new C91318aw(axVar.f254862a);
        C7726hr a = axVar.mo85610a((C7726hr) obj, awVar);
        if (awVar.f254859a > 0 || awVar.f254860b > 0) {
            axVar.f254863b.add(awVar);
        }
        ((C91282g) alVar.f294819e.f294869h.mo27525b()).mo85558c(alVar.f294815a, Collections.singletonList(a));
        return a;
    }
}
