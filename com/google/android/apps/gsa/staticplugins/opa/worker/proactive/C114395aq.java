package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage.C114481a;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage.C114484d;
import com.google.android.libraries.search.assistant.proactive.p2776h.C36314g;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.aq */
/* compiled from: PG */
public final /* synthetic */ class C114395aq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114396ar f317196a;

    /* renamed from: b */
    public final /* synthetic */ aas f317197b;

    public /* synthetic */ C114395aq(C114396ar arVar, aas aas) {
        this.f317196a = arVar;
        this.f317197b = aas;
    }

    public final C60870cx apply(Object obj) {
        C114396ar arVar = this.f317196a;
        aas aas = this.f317197b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            C36314g gVar = arVar.f317203e;
            aap aap = aas.f134676n;
            if (aap == null) {
                aap = aap.f134650h;
            }
            gVar.mo40101c(aap, 2);
            return C60856cj.m92899h(new C114463da(C51962fo.DELAYED_SCHEDULING_FAILED));
        }
        long longValue = ((Long) axVar.mo56107c()).longValue();
        C114484d dVar = arVar.f317200b;
        C114481a aVar = new C114481a();
        aVar.mo101337b(aas.f134670h);
        aVar.mo101338c(aas.toByteArray());
        aVar.mo101339d(longValue);
        dVar.mo101350d(aVar.mo101336a());
        return C118826c.f331423b;
    }
}
