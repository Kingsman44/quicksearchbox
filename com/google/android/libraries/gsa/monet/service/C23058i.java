package com.google.android.libraries.gsa.monet.service;

import com.google.android.libraries.gsa.monet.shared.C23084ao;
import com.google.android.libraries.gsa.monet.shared.p1893c.C23096b;

/* renamed from: com.google.android.libraries.gsa.monet.service.i */
/* compiled from: PG */
public final class C23058i {

    /* renamed from: a */
    public final C23084ao f63407a;

    /* renamed from: b */
    public final C23054e f63408b = new C23057h(this);

    /* renamed from: c */
    public C23051b f63409c;

    /* renamed from: d */
    public C23052c f63410d;

    /* renamed from: e */
    private final C23096b f63411e;

    public C23058i(C23084ao aoVar, C23096b bVar) {
        this.f63407a = aoVar;
        this.f63411e = bVar;
    }

    /* renamed from: a */
    public final void mo28500a(C23052c cVar, C23051b bVar) {
        this.f63407a.mo28328a();
        if (this.f63409c != null) {
            this.f63411e.mo28559a("MonetBackButtonHandling", "setHandler called when there's already a handler present.", new Object[0]);
        }
        this.f63409c = bVar;
        this.f63410d = cVar;
        cVar.mo28427o(this.f63408b);
    }
}
