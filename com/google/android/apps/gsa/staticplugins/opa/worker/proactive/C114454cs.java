package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.assistant.proactive.p2776h.C36314g;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aar;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4985f.p5036r.C65316b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.cs */
/* compiled from: PG */
public final /* synthetic */ class C114454cs implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317349a;

    /* renamed from: b */
    public final /* synthetic */ aas f317350b;

    /* renamed from: c */
    public final /* synthetic */ int f317351c;

    public /* synthetic */ C114454cs(C114464db dbVar, aas aas, int i) {
        this.f317349a = dbVar;
        this.f317350b = aas;
        this.f317351c = i;
    }

    public final Object call() {
        C114464db dbVar = this.f317349a;
        aas aas = this.f317350b;
        int i = this.f317351c;
        int a = aar.m86269a(aas.f134664b);
        if (a == 0 || a != 5) {
            C36314g gVar = dbVar.f317402w;
            String a2 = C65316b.m96664a(i);
            if (i != 0) {
                C58976aa aaVar = C58975e.f156826a;
                ((C19567d) gVar.f94826a.f94821b.mo6453a()).mo24822a(1, a2);
                C36314g gVar2 = dbVar.f317402w;
                aap aap = aas.f134676n;
                if (aap == null) {
                    aap = aap.f134650h;
                }
                gVar2.mo40101c(aap, 4);
            } else {
                throw null;
            }
        }
        return C118826c.f331422a;
    }
}
