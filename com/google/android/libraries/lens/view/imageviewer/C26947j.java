package com.google.android.libraries.lens.view.imageviewer;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.web.contrib.logging.C43712o;
import com.google.android.libraries.web.contrib.logging.C43713p;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.libraries.lens.view.imageviewer.j */
/* compiled from: PG */
public final class C26947j implements C43712o {

    /* renamed from: a */
    private final C37215b f73457a;

    public C26947j(C37215b bVar) {
        this.f73457a = bVar;
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
        C37215b bVar = this.f73457a;
        bVar.getClass();
        return new C26938b(bVar);
    }
}
