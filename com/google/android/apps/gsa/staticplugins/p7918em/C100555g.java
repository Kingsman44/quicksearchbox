package com.google.android.apps.gsa.staticplugins.p7918em;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6715dn.C85398a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4479cg.C58075g;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.em.g */
/* compiled from: PG */
public final class C100555g extends C86734a implements C85398a {

    /* renamed from: a */
    public static final C59071e f281139a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.em.g");

    /* renamed from: b */
    private final C42876ab f281140b;

    /* renamed from: c */
    private final Executor f281141c;

    public C100555g(C42876ab abVar, C22871g gVar) {
        super(C118575h.WORKER_VAA_PDS, "vaapds");
        this.f281140b = abVar;
        this.f281141c = new C100550b(gVar);
    }

    /* renamed from: a */
    public final C60870cx mo78919a() {
        return this.f281140b.mo46042d();
    }

    /* renamed from: b */
    public final void mo78920b(C58075g gVar) {
        C60856cj.m92911t(this.f281140b.mo46039a(new C100552d(gVar), this.f281141c), new C100553e(), this.f281141c);
    }

    /* renamed from: c */
    public final void mo78921c() {
        C60856cj.m92911t(this.f281140b.mo46039a(C100548a.f281135a, this.f281141c), new C100554f(), this.f281141c);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
