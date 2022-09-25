package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import com.google.common.p4522b.C58714pg;
import com.google.common.p4522b.C58717pj;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.o */
/* compiled from: PG */
public final /* synthetic */ class C95619o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95622r f267612a;

    public /* synthetic */ C95619o(C95622r rVar) {
        this.f267612a = rVar;
    }

    public final void run() {
        C95622r rVar = this.f267612a;
        synchronized (rVar.f267614a) {
            C58976aa aaVar = C58975e.f156826a;
            Iterator it = rVar.f267615b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Iterator it2 = ((C58717pj) entry.getValue()).mo55484d().iterator();
                while (it2.hasNext()) {
                    if (rVar.mo89575a() >= ((Long) ((C58714pg) it2.next()).f156456b.mo55176b()).longValue() - 100) {
                        rVar.f267616c.execute(new C95620p(entry));
                        it2.remove();
                    }
                }
                if (((C58717pj) entry.getValue()).mo54981b()) {
                    it.remove();
                }
            }
            rVar.mo89576b();
        }
    }
}
