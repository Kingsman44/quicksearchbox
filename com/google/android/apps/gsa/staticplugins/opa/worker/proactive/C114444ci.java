package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6491a.C84373s;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109458d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aar;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ci */
/* compiled from: PG */
public final /* synthetic */ class C114444ci implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317327a;

    /* renamed from: b */
    public final /* synthetic */ aas f317328b;

    /* renamed from: c */
    public final /* synthetic */ C84373s f317329c;

    public /* synthetic */ C114444ci(C114464db dbVar, aas aas, C84373s sVar) {
        this.f317327a = dbVar;
        this.f317328b = aas;
        this.f317329c = sVar;
    }

    public final C60870cx apply(Object obj) {
        C114464db dbVar = this.f317327a;
        aas aas = this.f317328b;
        C84373s sVar = this.f317329c;
        C51962fo foVar = (C51962fo) obj;
        if (foVar != C51962fo.DISPLAYED) {
            C59104x b = C114464db.f317374a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ProactiveNotifications");
            ((C59052c) ((C59052c) b).mo56372aa(29041)).mo56386p("#handleNotificationArgs: Status is NOT DISPLAYED. Suppressed.");
            return C60856cj.m92899h(new C114463da(foVar));
        }
        int a = aar.m86269a(aas.f134664b);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 3) {
                dbVar.mo101332j(aas);
                dbVar.f317392m.mo101314d(aas);
                return C118826c.f331423b;
            } else if (i2 == 4) {
                return dbVar.mo101327d(aas);
            } else {
                if (i2 != 5) {
                    if (i2 != 999) {
                        C59104x d = C114464db.f317374a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "ProactiveNotifications");
                        C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(29040);
                        int a2 = aar.m86269a(aas.f134664b);
                        if (a2 != 0) {
                            i = a2;
                        }
                        cVar.mo56387q("Unhandled notification type %d", i - 1);
                        return C118826c.f331423b;
                    }
                    sVar.mo77931a().mo77919a(C109458d.m182153a(C58485gu.m89846n(aas.f134670h), aas.f134669g.mo59174N()));
                    return C118826c.f331423b;
                }
            }
        }
        dbVar.f317392m.mo101314d(aas);
        return C60922j.m93045h(dbVar.mo101326c(aas), C47810es.m84966f(new C114443ch(dbVar, aas, sVar)), C60826bg.f164896a);
    }
}
