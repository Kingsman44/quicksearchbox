package com.google.android.libraries.lens.view;

import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;

/* renamed from: com.google.android.libraries.lens.view.s */
/* compiled from: PG */
public final /* synthetic */ class C27682s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C28206x f75600a;

    public /* synthetic */ C27682s(C28206x xVar) {
        this.f75600a = xVar;
    }

    public final void run() {
        C28206x xVar = this.f75600a;
        if (!xVar.f76788J || !xVar.f76795f.mo31462g(C26239a.ONELRP_REMOVE_ELEMENTS_PREWARMING) || ((C25989d) xVar.f76802m.mo27525b()).f70642a.f70649b != C25980d.AUTO_FILTER) {
            ((C40305b) xVar.f76815z.mo17428b()).mo32554n().mo42409a();
        }
    }
}
