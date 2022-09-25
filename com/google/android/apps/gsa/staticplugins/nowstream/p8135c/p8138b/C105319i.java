package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8138b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87311aj;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87316ao;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.C105322c;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105407o;
import com.google.android.libraries.gsa.monet.service.C23052c;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.b.i */
/* compiled from: PG */
public final class C105319i implements C105322c {

    /* renamed from: a */
    public final C105407o f293849a;

    /* renamed from: b */
    public final C87334q f293850b;

    /* renamed from: c */
    public C87316ao f293851c;

    /* renamed from: d */
    private final C23052c f293852d;

    /* renamed from: e */
    private final boolean f293853e;

    /* renamed from: f */
    private C87311aj f293854f;

    /* renamed from: g */
    private boolean f293855g;

    public C105319i(C86124t tVar, C23052c cVar, C105407o oVar, C87334q qVar) {
        this.f293852d = cVar;
        this.f293849a = oVar;
        this.f293850b = qVar;
        this.f293853e = tVar.mo79746e(C90010bp.f246972ao);
    }

    /* renamed from: a */
    public final void mo94715a() {
        this.f293855g = false;
        if (this.f293853e) {
            C87316ao aoVar = this.f293851c;
            if (aoVar != null) {
                this.f293850b.mo80981d(aoVar, 9);
                return;
            }
            return;
        }
        C87311aj ajVar = this.f293854f;
        if (ajVar != null) {
            this.f293850b.mo80981d(ajVar, 9);
        }
    }

    /* renamed from: b */
    public final void mo94716b(String str, boolean z) {
        this.f293855g = true;
        if (this.f293853e) {
            C105318h hVar = new C105318h(this.f293852d, str);
            this.f293851c = hVar;
            hVar.f235809b = new C105316f(this);
            this.f293850b.mo80980c(hVar);
            return;
        }
        C23052c cVar = this.f293852d;
        C105407o oVar = this.f293849a;
        Objects.requireNonNull(oVar);
        C87311aj ajVar = new C87311aj(cVar, str, new C105317g(oVar), z);
        this.f293854f = ajVar;
        this.f293850b.mo80980c(ajVar);
    }

    /* renamed from: c */
    public final boolean mo94717c() {
        return this.f293855g;
    }
}
