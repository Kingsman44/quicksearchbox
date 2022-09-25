package com.google.android.apps.gsa.opa.smartspace.p6452a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7041h.C89782n;
import com.google.android.apps.gsa.shared.p7041h.C89783o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.a.c */
/* compiled from: PG */
public final class C83727c {

    /* renamed from: a */
    public final C89782n f228201a;

    /* renamed from: b */
    public final C21370a f228202b;

    /* renamed from: c */
    public final C86124t f228203c;

    /* renamed from: d */
    private final C22871g f228204d;

    public C83727c(C22871g gVar, C89783o oVar, C21370a aVar, C39226b bVar, C86124t tVar) {
        this.f228204d = gVar;
        this.f228201a = oVar.mo83625a(bVar);
        this.f228202b = aVar;
        this.f228203c = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo77052a(long j) {
        return this.f228204d.mo28201a("loadActiveEvents", new C83726b(this, j));
    }
}
