package com.google.android.libraries.lens.view.srpx;

import com.google.android.libraries.lens.view.p2056af.C25073c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.web.contrib.logging.C43712o;
import com.google.android.libraries.web.contrib.logging.C43713p;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.libraries.lens.view.srpx.q */
/* compiled from: PG */
public final class C28052q implements C43712o {

    /* renamed from: a */
    private final C37215b f76354a;

    /* renamed from: b */
    private final C25073c f76355b;

    public C28052q(C37215b bVar, C25073c cVar) {
        this.f76354a = bVar;
        this.f76355b = cVar;
    }

    /* renamed from: a */
    public final C43713p mo32339a(C43367l lVar) {
        C43366k kVar = C43366k.UNSPECIFIED;
        C43366k a = C43366k.m76517a(lVar.f113299e);
        if (a == null) {
            a = C43366k.UNSPECIFIED;
        }
        if (a.ordinal() != 2) {
            return null;
        }
        C37215b bVar = this.f76354a;
        C25073c cVar = this.f76355b;
        bVar.getClass();
        cVar.getClass();
        return new C28047m(bVar, cVar);
    }
}
