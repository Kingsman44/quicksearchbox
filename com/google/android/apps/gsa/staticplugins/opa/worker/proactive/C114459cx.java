package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36271a;
import com.google.assistant.p3803ag.p3809c.C49065fd;
import com.google.assistant.p3897e.p3921j.aar;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.common.p4552o.ajy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p5036r.C65329o;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.cx */
/* compiled from: PG */
public final /* synthetic */ class C114459cx implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317363a;

    /* renamed from: b */
    public final /* synthetic */ C65329o f317364b;

    public /* synthetic */ C114459cx(C114464db dbVar, C65329o oVar) {
        this.f317363a = dbVar;
        this.f317364b = oVar;
    }

    public final C60870cx apply(Object obj) {
        C114464db dbVar = this.f317363a;
        C49065fd fdVar = (C49065fd) obj;
        C62971cq<aas> cqVar = this.f317364b.f176679b;
        ArrayList arrayList = new ArrayList();
        for (aas aas : cqVar) {
            int a = aar.m86269a(aas.f134664b);
            if (a != 0 && a == 2 && C36271a.m64734a(fdVar, aas)) {
                arrayList.add(dbVar.mo101328e(dbVar.mo101331i(aas, ajy.CLIENT_SYNC), aas, ajy.CLIENT_SYNC));
            } else {
                int a2 = aar.m86269a(aas.f134664b);
                if (a2 != 0 && a2 == 5 && C36271a.m64734a(fdVar, aas)) {
                    if (!dbVar.f317388i.mo101321a(aas)) {
                        arrayList.add(C60856cj.m92899h(new C114463da(C51962fo.NOT_TARGETING_THIS_DEVICE)));
                    } else {
                        arrayList.add(dbVar.mo101327d(aas));
                    }
                }
            }
        }
        return C118826c.m197212b(arrayList);
    }
}
