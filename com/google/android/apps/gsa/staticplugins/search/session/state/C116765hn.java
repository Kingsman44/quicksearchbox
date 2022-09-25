package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58800sl;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.hn */
/* compiled from: PG */
public final /* synthetic */ class C116765hn implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C58471gg f323922a;

    /* renamed from: b */
    public final /* synthetic */ String f323923b;

    public /* synthetic */ C116765hn(C58471gg ggVar, String str) {
        this.f323922a = ggVar;
        this.f323923b = str;
    }

    public final void run() {
        C58471gg ggVar = this.f323922a;
        String str = this.f323923b;
        C58800sl lA = ggVar.iterator();
        while (lA.hasNext()) {
            ((C116780ib) lA.next()).mo80592hl(str);
        }
    }
}
