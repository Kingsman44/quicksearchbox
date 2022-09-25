package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.libraries.search.assistant.p2570h.p2571a.p2572a.p2573a.C33434b;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2572a.p2573a.C33435c;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2572a.p2573a.C33437e;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.C68286a;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.h */
/* compiled from: PG */
public final /* synthetic */ class C119994h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C119996j f334116a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f334117b;

    public /* synthetic */ C119994h(C119996j jVar, Throwable th) {
        this.f334116a = jVar;
        this.f334117b = th;
    }

    public final void run() {
        C119996j jVar = this.f334116a;
        Throwable th = this.f334117b;
        if (!jVar.f334124f) {
            jVar.f334124f = true;
            C58976aa aaVar = C58975e.f156826a;
            if (th != null) {
                jVar.f334121c.mo20122b(th);
            } else {
                jVar.f334121c.mo20121a();
            }
            C33435c cVar = jVar.f334126h;
            C58838bb.m90866a(cVar, "shutdown happened before #connect");
            C33437e b = ((C33434b) C68286a.m98629a(cVar.f89535a, C33434b.class)).mo38839b();
            synchronized (b.f89538a) {
                if (!b.f89540c) {
                    b.f89540c = true;
                    C58485gu j = C58485gu.m89842j(b.f89539b);
                    b.f89539b.clear();
                    C58801sm G = j.listIterator(0);
                    while (G.hasNext()) {
                        ((Runnable) G.next()).run();
                    }
                }
            }
        }
    }
}
