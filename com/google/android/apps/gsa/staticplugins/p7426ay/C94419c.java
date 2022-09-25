package com.google.android.apps.gsa.staticplugins.p7426ay;

import com.google.android.apps.gsa.binaries.satin.app.C74198oj;
import com.google.android.apps.gsa.binaries.satin.app.ol;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6546am.C84710b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87841fo;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90118fp;
import com.google.android.apps.gsa.staticplugins.p7426ay.p7427a.C94417a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.ay.c */
/* compiled from: PG */
public final class C94419c extends C86734a implements C84710b {

    /* renamed from: a */
    public static final C59071e f263964a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ay.c");

    /* renamed from: b */
    public final C68214a f263965b;

    /* renamed from: c */
    private final C86124t f263966c;

    /* renamed from: f */
    private final C86610af f263967f;

    /* renamed from: g */
    private final C22871g f263968g;

    /* renamed from: h */
    private final C94417a f263969h;

    public C94419c(C94417a aVar, C68214a aVar2, C86124t tVar, C86610af afVar, C22871g gVar) {
        super(C118575h.WORKER_GCM, "gcm");
        this.f263969h = aVar;
        this.f263965b = aVar2;
        this.f263966c = tVar;
        this.f263967f = afVar;
        this.f263968g = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo78434a() {
        return this.f263968g.mo28201a("GcmWorker.getRegistrationState", new C94416a(this));
    }

    /* renamed from: c */
    public final void mo78436c(long j, boolean z) {
        this.f263967f.mo80225f(C118826c.f331423b, j, true != z ? 0 : 8000);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return this.f263966c.mo79746e(C90118fp.f250756b);
    }

    /* renamed from: b */
    public final C60870cx mo78435b(C87841fo foVar) {
        C94417a aVar = this.f263969h;
        C118575h hVar = this.f234292d;
        C74198oj ojVar = aVar.f263952a;
        C84466a aVar2 = aVar.f263953b;
        foVar.getClass();
        ojVar.f207195c = foVar;
        ojVar.f207196d = aVar2.mo78026b("gcm", C118575h.GRAPH_GCM, hVar);
        C68225k.m98529a(ojVar.f207195c, C87841fo.class);
        C68225k.m98529a(ojVar.f207196d, C89356b.class);
        return new ol(ojVar.f207193a, ojVar.f207194b, ojVar.f207195c, ojVar.f207196d).c.mo60297gq();
    }
}
