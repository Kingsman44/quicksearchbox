package com.google.android.libraries.search.assistant.proactive.p2771c;

import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;

/* renamed from: com.google.android.libraries.search.assistant.proactive.c.b */
/* compiled from: PG */
public final /* synthetic */ class C36243b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C36245d f94673a;

    /* renamed from: b */
    public final /* synthetic */ C52091ex f94674b;

    public /* synthetic */ C36243b(C36245d dVar, C52091ex exVar) {
        this.f94673a = dVar;
        this.f94674b = exVar;
    }

    public final void run() {
        C36245d dVar = this.f94673a;
        C52091ex exVar = this.f94674b;
        C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
        for (C52232kc kcVar : exVar.f136712a) {
            C58528ij ijVar = C36245d.f94677a;
            if (((C58759qy) ijVar).f156534a.equals(kcVar.f137065b)) {
                ewVar.mo53792e(kcVar);
            }
        }
        dVar.f94679c = (C52091ex) ewVar.build();
    }
}
