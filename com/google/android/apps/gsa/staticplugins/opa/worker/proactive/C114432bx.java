package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6491a.C84373s;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.p7066m.C90052dd;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.C90731ao;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109458d;
import com.google.android.libraries.search.assistant.proactive.C36207ac;
import com.google.android.libraries.search.assistant.proactive.C36334o;
import com.google.android.libraries.search.assistant.proactive.p2779j.C36328e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3905b.p3906a.C50926c;
import com.google.assistant.p3897e.p3902c.p3905b.p3906a.C50927d;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajy;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bx */
/* compiled from: PG */
public final /* synthetic */ class C114432bx implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317292a;

    /* renamed from: b */
    public final /* synthetic */ aas f317293b;

    /* renamed from: c */
    public final /* synthetic */ C36334o f317294c;

    /* renamed from: d */
    public final /* synthetic */ C84373s f317295d;

    public /* synthetic */ C114432bx(C114464db dbVar, aas aas, C36334o oVar, C84373s sVar) {
        this.f317292a = dbVar;
        this.f317293b = aas;
        this.f317294c = oVar;
        this.f317295d = sVar;
    }

    public final C60870cx apply(Object obj) {
        Object obj2;
        C114464db dbVar = this.f317292a;
        aas aas = this.f317293b;
        C36334o oVar = this.f317294c;
        C84373s sVar = this.f317295d;
        C36207ac acVar = (C36207ac) obj;
        int i = acVar.f94595b;
        if (i == 2) {
            return C60856cj.m92899h(new C114463da(C51962fo.THROTTLED, acVar.f94594a));
        }
        if (i == 3) {
            dbVar.f317399t.mo101317a(aas, ajy.GCM, C51962fo.THROTTLED, (String) null, acVar.f94594a);
        }
        C62940bt r13 = C62942bv.checkIsLite(abc.f134692p);
        aas.mo58887l(r13);
        Object l = aas.f169962ag.mo58854l(r13.f169971d);
        if (l == null) {
            obj2 = r13.f169969b;
        } else {
            obj2 = r13.mo58889c(l);
        }
        C50927d dVar = ((abc) obj2).f134702i;
        if (dVar == null) {
            dVar = C50927d.f132578b;
        }
        int a = C50926c.m85980a(dVar.f132580a);
        if (a == 0) {
            a = 2;
        }
        C58976aa aaVar = C58975e.f156826a;
        int i2 = a - 1;
        if (i2 == 0 || i2 == 1) {
            return dbVar.mo101330h(aas, oVar, ajy.GCM);
        }
        if (i2 == 2) {
            if (dbVar.f317393n.mo79746e(C90052dd.f248931b)) {
                C36328e eVar = (C36328e) dbVar.f317398s.mo27525b();
                if ((!eVar.f94860b.isInteractive() || eVar.f94859a.isKeyguardLocked()) && aas.f134682t && !C90731ao.m148192b(dbVar.f317381b) && !C90731ao.m148191a(dbVar.f317381b)) {
                    e eVar2 = e.bi;
                    C87565h hVar = new C87565h();
                    hVar.f236556b = eVar2;
                    hVar.f236507K = true;
                    hVar.f236504H = true;
                    hVar.f236509M = true;
                    hVar.f236560f = 3;
                    hVar.f236572r = QueryTriggerType.OPA_PROACTIVE_NOTIFICATION;
                    hVar.mo81686b();
                    hVar.f236523a = "and.opa.notification";
                    hVar.f236517U = C109458d.m182154b(aas.f134669g.mo59174N()).toByteArray();
                    ((C87568k) dbVar.f317390k.mo56107c()).mo81688b(dbVar.f317381b, hVar.mo81685a());
                    return C60856cj.m92900i(C118826c.f331422a);
                }
            }
            return C114464db.m189729g(aas, sVar);
        } else if (i2 != 4) {
            return C60846c.m92879h(C114464db.m189729g(aas, sVar), Throwable.class, C47810es.m84966f(new C114434bz(dbVar, aas, oVar)), C60826bg.f164896a);
        } else {
            return C60922j.m93045h(dbVar.mo101330h(aas, oVar, ajy.GCM), C47810es.m84966f(new C114423bo(aas, sVar)), C60826bg.f164896a);
        }
    }
}
