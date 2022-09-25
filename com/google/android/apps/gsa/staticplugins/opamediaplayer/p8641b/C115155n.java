package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b;

import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84271k;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58781rt;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.b.n */
/* compiled from: PG */
public final class C115155n extends C115141a implements C90991b {

    /* renamed from: a */
    public final Queue f319587a = new C58781rt(new C58425eo(10));

    /* renamed from: b */
    private final C21370a f319588b;

    /* renamed from: c */
    private C58833ax f319589c = C58836b.f156633a;

    public C115155n(C21370a aVar) {
        this.f319588b = aVar;
    }

    /* renamed from: e */
    private final void m190857e(C115153l lVar) {
        C115151j jVar = new C115151j(this, this.f319588b.mo26870b(), lVar);
        this.f319589c = C58833ax.m90834k(jVar);
        this.f319587a.add(jVar);
    }

    /* renamed from: a */
    public final void mo77783a(C52176ia iaVar) {
        C115152k g = C115153l.m190849g(1);
        ((C115143b) g).f319558e = C58833ax.m90834k(Long.valueOf(iaVar.f136917e));
        m190857e(g.mo101847a());
    }

    /* renamed from: b */
    public final void mo77784b(C84275o oVar) {
        if (oVar.mo77806l().mo56113h() && C115485b.m191568b((String) oVar.mo77806l().mo56107c()).mo56113h()) {
            C115152k g = C115153l.m190849g(3);
            C115143b bVar = (C115143b) g;
            bVar.f319554a = C58833ax.m90834k(oVar);
            if (this.f319589c.mo56113h() && ((C115151j) this.f319589c.mo56107c()).f319585b.mo101854f() == 3) {
                C115153l lVar = ((C115151j) this.f319589c.mo56107c()).f319585b;
                if (lVar.mo101851d().mo56113h() && ((C84275o) lVar.mo101851d().mo56107c()).mo77806l().mo56113h() && ((String) ((C84275o) lVar.mo101851d().mo56107c()).mo77806l().mo56107c()).equals(oVar.mo77806l().mo56107c())) {
                    bVar.f319555b = C58833ax.m90834k(true);
                }
            }
            m190857e(g.mo101847a());
        }
    }

    /* renamed from: c */
    public final void mo101846c(C84269i iVar, C84271k kVar) {
        C115152k g = C115153l.m190849g(2);
        C115143b bVar = (C115143b) g;
        bVar.f319556c = C58833ax.m90834k(iVar);
        bVar.f319557d = C58833ax.m90834k(kVar);
        m190857e(g.mo101847a());
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OpaMediaPlayer");
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Recent events");
        synchronized (this.f319587a) {
            for (C115151j m : this.f319587a) {
                e.mo85286m(m);
            }
        }
    }
}
