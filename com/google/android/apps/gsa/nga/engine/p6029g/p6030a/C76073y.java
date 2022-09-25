package com.google.android.apps.gsa.nga.engine.p6029g.p6030a;

import com.google.android.apps.gsa.nga.engine.p6029g.C76088d;
import com.google.android.apps.gsa.nga.engine.p6029g.C76090f;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120119j;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.nga.engine.g.a.y */
/* compiled from: PG */
public final /* synthetic */ class C76073y implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C76043ar f210960a;

    public /* synthetic */ C76073y(C76043ar arVar) {
        this.f210960a = arVar;
    }

    public final void run() {
        C76090f e;
        C76090f fVar;
        SettableFuture settableFuture;
        int i;
        C76043ar arVar = this.f210960a;
        if (arVar.f210903d.mo73911c()) {
            C90875ai.m148465b(new C76041ap(arVar), arVar.f210903d.mo73909a(), arVar.f210904e, "[NGA] NgaConfigurationManager.deferredConfiguration").mo85223a(new C76060l(arVar));
            return;
        }
        synchronized (arVar.f210901b) {
            e = arVar.mo72023e();
            fVar = (C76090f) arVar.f210915p.getAndSet(e);
            settableFuture = (SettableFuture) arVar.f210919t.get();
            arVar.f210918s = false;
            if (!e.mo72041f()) {
                C120119j jVar = arVar.f210920u;
                if (jVar != null) {
                    jVar.close();
                    ((C58970a) ((C58970a) C76043ar.f210894a.mo56224b()).mo56372aa(3123)).mo56386p("Unsubscribed to apa or classic variant change.");
                }
            } else if (arVar.f210920u == null) {
                arVar.f210920u = arVar.f210908i.mo104673b(arVar);
                ((C58970a) ((C58970a) C76043ar.f210894a.mo56224b()).mo56372aa(3124)).mo56386p("Subscribed to apa or classic variant change.");
            }
        }
        if (!e.equals(fVar)) {
            C58485gu g = arVar.mo72025g();
            int size = g.size();
            for (i = 0; i < size; i++) {
                C76088d dVar = (C76088d) g.get(i);
                try {
                    dVar.mo71863Q();
                } catch (Exception e2) {
                    ((C58970a) ((C58970a) ((C58970a) C76043ar.f210894a.mo56225c()).mo56382g(e2)).mo56372aa(3119)).mo56354G("Crash when calling NGA component %s with configuration %s", dVar, e);
                }
            }
        }
        settableFuture.mo57356n(C118826c.f331422a);
    }
}
