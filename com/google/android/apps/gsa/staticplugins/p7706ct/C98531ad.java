package com.google.android.apps.gsa.staticplugins.p7706ct;

import com.google.android.apps.gsa.binaries.satin.app.aiw;
import com.google.android.apps.gsa.binaries.satin.app.aiy;
import com.google.android.apps.gsa.p5851g.p5854f.C74528a;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84418a;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6642ce.C85080a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.p5294a.C68225k;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.ad */
/* compiled from: PG */
public final class C98531ad extends C86734a implements C85080a {

    /* renamed from: a */
    private final C89859i f275127a;

    /* renamed from: b */
    private final C84418a f275128b;

    /* renamed from: c */
    private final AtomicReference f275129c = new AtomicReference(C58836b.f156633a);

    /* renamed from: f */
    private final aiw f275130f;

    /* renamed from: g */
    private final C84466a f275131g;

    public C98531ad(aiw aiw, C84466a aVar, C89859i iVar, C84418a aVar2) {
        super(C118575h.WORKER_PUMPKIN, "pumpkin");
        this.f275130f = aiw;
        this.f275127a = iVar;
        this.f275131g = aVar;
        this.f275128b = aVar2;
    }

    /* renamed from: e */
    private final C74528a m163212e(Query query) {
        this.f275127a.mo83702b(C89849ae.PUMPKIN_GRAPH_CREATE);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 190;
        String b = C39191a.m68623b(query.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        C89356b a = this.f275131g.mo78025a("pumpkin", 136, 23);
        aiw aiw = this.f275130f;
        query.getClass();
        aiw.f196258c = query;
        AtomicReference atomicReference = this.f275129c;
        atomicReference.getClass();
        aiw.f196259d = atomicReference;
        aiw.f196260e = C58833ax.m90833j(this.f275128b.mo77986c());
        aiw.f196261f = a;
        C68225k.m98529a(aiw.f196258c, Query.class);
        C68225k.m98529a(aiw.f196259d, AtomicReference.class);
        C68225k.m98529a(aiw.f196260e, C58833ax.class);
        C68225k.m98529a(aiw.f196261f, C89356b.class);
        return new aiy(aiw.f196256a, aiw.f196257b, aiw.f196258c, aiw.f196259d, aiw.f196260e, aiw.f196261f);
    }

    /* renamed from: f */
    private final void m163213f() {
        if (((C58833ax) this.f275129c.get()).mo56113h()) {
            this.f275129c.set(C58836b.f156633a);
            ((C98555y) ((C58833ax) this.f275129c.get()).mo56107c()).mo91171f();
        }
    }

    /* renamed from: a */
    public final C60870cx mo78692a(Query query) {
        return C60856cj.m92900i(m163212e(query));
    }

    /* renamed from: c */
    public final C60870cx mo78693c(Query query) {
        if (!query.mo84412cs() || query.mo84329bN()) {
            return m163212e(query).mo70837b();
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            m163213f();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("PumpkinWorker");
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        m163213f();
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
