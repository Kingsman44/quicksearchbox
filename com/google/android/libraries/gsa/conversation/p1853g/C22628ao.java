package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.android.libraries.gsa.conversation.p1837a.C22329j;
import com.google.android.libraries.gsa.conversation.p1837a.C22333n;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.gsa.conversation.g.ao */
/* compiled from: PG */
public final /* synthetic */ class C22628ao implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C22654bn f62330a;

    /* renamed from: b */
    public final /* synthetic */ C22618ae f62331b;

    /* renamed from: c */
    public final /* synthetic */ int f62332c;

    public /* synthetic */ C22628ao(C22654bn bnVar, int i, C22618ae aeVar) {
        this.f62330a = bnVar;
        this.f62332c = i;
        this.f62331b = aeVar;
    }

    public final void run() {
        C22654bn bnVar = this.f62330a;
        int i = this.f62332c;
        C22618ae aeVar = this.f62331b;
        if (i != 3) {
            C22329j jVar = bnVar.f62404b;
            C58976aa aaVar = C58975e.f156826a;
            jVar.mo27561c(C22333n.INPUT);
            bnVar.f62404b.mo27561c(C22333n.OUTPUT);
        }
        C22668l lVar = bnVar.f62413k;
        if (lVar == null) {
            return;
        }
        if (i == 3) {
            bnVar.f62416n = true;
            return;
        }
        if (!lVar.f62438b.isDone()) {
            bnVar.f62413k.f62438b.cancel(false);
        }
        if (i == 2 && bnVar.f62410h && bnVar.mo27774p(bnVar.f62413k.mo27781d(true))) {
            bnVar.mo27767h(C58836b.f156633a, aeVar);
        }
        bnVar.mo27770l();
        bnVar.f62413k = null;
    }
}
