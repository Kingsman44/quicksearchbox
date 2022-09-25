package com.google.android.apps.gsa.search.core.service.p6859i.p6861b.p6862a;

import com.google.android.apps.gsa.search.core.service.p6845b.C86632a;
import com.google.android.apps.gsa.search.core.service.p6845b.C86633b;
import com.google.android.apps.gsa.search.core.service.p6859i.p6861b.p6862a.p6863a.C86754b;
import com.google.android.apps.gsa.search.core.service.p6859i.p6861b.p6862a.p6863a.C86755c;
import com.google.android.apps.gsa.search.core.service.p6859i.p6861b.p6862a.p6863a.C86761i;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.service.i.b.a.a */
/* compiled from: PG */
public final class C86752a implements C90964a, C86632a {

    /* renamed from: a */
    private C86755c f234326a;

    public C86752a(String str, C86761i iVar) {
        this.f234326a = iVar.mo80375a(str, C60866ct.f164955a);
    }

    /* renamed from: a */
    public final synchronized void mo80257a() {
        C86755c cVar = this.f234326a;
        if (cVar != null) {
            cVar.mo80257a();
            this.f234326a = null;
        }
    }

    /* renamed from: b */
    public final synchronized C60870cx mo80364b() {
        C86755c cVar = this.f234326a;
        if (cVar == null) {
            return C60856cj.m92899h(new C86633b("WorkerHandler is disposed"));
        }
        C86754b b = cVar.mo80372b();
        this.f234326a = b.mo80367a();
        return b.mo80368b();
    }

    /* renamed from: c */
    public final synchronized void mo80365c() {
        C86755c cVar = this.f234326a;
        if (cVar != null) {
            cVar.mo80374e();
        }
    }

    /* renamed from: e */
    public final synchronized void mo80366e() {
        C86755c cVar = this.f234326a;
        if (cVar != null) {
            this.f234326a = cVar.mo80373c();
        }
    }

    /* renamed from: gS */
    public final synchronized void mo17602gS(C91006f fVar) {
        C86755c cVar = this.f234326a;
        if (cVar == null) {
            fVar.mo85279c("disposed").mo85276a(C90752i.m148228b(true));
        } else {
            fVar.mo85285l(cVar);
        }
    }
}
