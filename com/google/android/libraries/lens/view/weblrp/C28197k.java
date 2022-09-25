package com.google.android.libraries.lens.view.weblrp;

import com.google.android.libraries.lens.view.p2056af.C25073c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.web.contrib.logging.C43712o;
import com.google.android.libraries.web.contrib.logging.C43713p;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.libraries.lens.view.weblrp.k */
/* compiled from: PG */
public final class C28197k implements C43712o {

    /* renamed from: a */
    private final C37215b f76754a;

    /* renamed from: b */
    private final C25073c f76755b;

    public C28197k(C37215b bVar, C25073c cVar) {
        this.f76754a = bVar;
        this.f76755b = cVar;
    }

    /* renamed from: a */
    public final C43713p mo32339a(C43367l lVar) {
        C43366k a = C43366k.m76517a(lVar.f113299e);
        if (a == null) {
            a = C43366k.UNSPECIFIED;
        }
        if (a != C43366k.BROWSER_INITIATED_NEW_PAGE) {
            return null;
        }
        C37215b bVar = this.f76754a;
        C25073c cVar = this.f76755b;
        bVar.getClass();
        cVar.getClass();
        return new C28189d(bVar, cVar);
    }
}
