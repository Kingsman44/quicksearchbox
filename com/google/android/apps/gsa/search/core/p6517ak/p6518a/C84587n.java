package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.n */
/* compiled from: PG */
final class C84587n extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C84589p f230193a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84587n(C84589p pVar) {
        super("Run utterance callback", 1, 0);
        this.f230193a = pVar;
    }

    public final void run() {
        C84589p pVar = this.f230193a;
        C90908be beVar = pVar.f230199d;
        if (beVar != null) {
            synchronized (beVar) {
                if (!pVar.f230202g) {
                    pVar.f230202g = true;
                    C58976aa aaVar = C58975e.f156826a;
                    pVar.f230199d.run();
                }
            }
        }
    }
}
