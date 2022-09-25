package com.google.android.libraries.lens.view.p2057ag;

import com.google.android.libraries.lens.view.education.C25794x;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.ag.d */
/* compiled from: PG */
public final class C25102d {

    /* renamed from: a */
    public static final C58974d f68376a = C58974d.m91135i("LatexFontDownloadController");

    /* renamed from: b */
    public final C37215b f68377b;

    /* renamed from: c */
    public final C25758g f68378c;

    /* renamed from: d */
    public final C68214a f68379d;

    /* renamed from: e */
    public final C25794x f68380e;

    /* renamed from: f */
    public boolean f68381f = false;

    /* renamed from: g */
    private final Executor f68382g;

    /* renamed from: h */
    private final Executor f68383h;

    public C25102d(C68214a aVar, Executor executor, Executor executor2, C37215b bVar, C25794x xVar) {
        this.f68382g = executor;
        this.f68383h = executor2;
        this.f68379d = aVar;
        this.f68380e = xVar;
        this.f68377b = bVar;
        this.f68378c = new C25758g(C58836b.f156633a);
    }

    /* renamed from: a */
    public final C25752a mo30257a(C58833ax axVar) {
        if (axVar.mo56113h()) {
            this.f68380e.mo30933a(((C25101c) axVar.mo56107c()).name(), ((C58833ax) this.f68378c.mo3842a()).mo56113h());
        }
        return this.f68378c;
    }

    /* renamed from: b */
    public final void mo30258b(C25101c cVar) {
        boolean h = ((C58833ax) this.f68378c.mo3842a()).mo56113h();
        ((C19567d) this.f68380e.f70065b.mo6453a()).mo24822a(1, new Object[0]);
        this.f68380e.mo30933a(cVar.name(), h);
        if (h) {
            this.f68380e.mo30934b("CACHE_HIT");
        } else if (!this.f68381f) {
            this.f68377b.mo19974a(C37194a.f98535bs);
            this.f68381f = true;
            C25097a aVar = new C25097a(this);
            C60870cx n = C60856cj.m92905n(C47810es.m84965e(aVar), this.f68383h);
            C25100b bVar = new C25100b(this);
            C60856cj.m92911t(n, C47810es.m84974n(bVar), this.f68382g);
        }
    }
}
