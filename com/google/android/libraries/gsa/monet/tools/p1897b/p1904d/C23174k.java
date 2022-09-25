package com.google.android.libraries.gsa.monet.tools.p1897b.p1904d;

import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23213j;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23217n;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23255e;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.C23148h;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.p1900a.C23141d;

/* renamed from: com.google.android.libraries.gsa.monet.tools.b.d.k */
/* compiled from: PG */
public final class C23174k implements C23255e {

    /* renamed from: a */
    public final C23148h f63552a;

    /* renamed from: b */
    public int f63553b;

    /* renamed from: c */
    public C22939d f63554c;

    /* renamed from: d */
    public Runnable f63555d;

    /* renamed from: e */
    private final C22945j f63556e;

    /* renamed from: f */
    private final C23219p f63557f;

    public C23174k(String str, C22945j jVar) {
        C23219p pVar = new C23219p(str, jVar, false);
        this.f63556e = jVar;
        this.f63557f = pVar;
        C23148h hVar = new C23148h(jVar, str);
        this.f63552a = hVar;
        C23247a.m43563d(jVar, hVar);
    }

    /* renamed from: a */
    public final void mo28617a(C23170g gVar) {
        if (this.f63556e.mo28316z()) {
            this.f63553b = ((C23141d) this.f63552a.f63498a.f63720e).f63491a.size();
        } else {
            this.f63556e.mo28312m(new C23173j(this));
        }
        C23219p pVar = this.f63557f;
        C23172i iVar = new C23172i(this, gVar);
        C23067b.m43233f(pVar.f63652c == null, "setAnimationCallbacks(...) has already been called for this child.");
        pVar.f63652c = new C23213j(iVar, pVar.f63651b);
        pVar.f63650a.mo28693c(new C23217n(pVar));
    }
}
