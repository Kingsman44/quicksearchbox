package com.google.android.libraries.search.p2904c.p2967t;

import com.google.android.libraries.search.p2904c.C37401bf;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37454cc;
import com.google.android.libraries.search.p2904c.C37465cn;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.C37677hx;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2942m.C37872b;
import com.google.android.libraries.search.p2904c.p2942m.C37877c;
import com.google.android.libraries.search.p2904c.p2942m.C37886e;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37830ac;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37831ad;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37839al;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37865t;
import com.google.android.libraries.search.p2904c.p2942m.p2949f.C37889a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.t.c */
/* compiled from: PG */
public final class C38056c {

    /* renamed from: a */
    private static final C59071e f100831a = C59071e.m91332i("com.google.android.libraries.search.c.t.c");

    /* renamed from: b */
    private final C38103l f100832b;

    /* renamed from: c */
    private final C37889a f100833c;

    /* renamed from: d */
    private final Executor f100834d;

    /* renamed from: e */
    private final int f100835e;

    /* renamed from: f */
    private final C37773c f100836f;

    /* renamed from: g */
    private C37872b f100837g;

    /* renamed from: h */
    private C60870cx f100838h;

    public C38056c(C38103l lVar, C37889a aVar, Executor executor, int i, C37773c cVar) {
        this.f100832b = lVar;
        this.f100833c = aVar;
        this.f100834d = executor;
        this.f100835e = i;
        this.f100836f = cVar;
    }

    /* renamed from: a */
    public final synchronized C37401bf mo41220a() {
        C37872b bVar = this.f100837g;
        if (bVar != null) {
            return mo41221b(((C37886e) bVar).f100462b, C37565ef.CLIENT_DEACTIVATED);
        }
        return new C37839al(C37512ds.FAILED_CLOSING_DUE_TO_INACTIVE_SESSION, C37565ef.CLIENT_DEACTIVATED);
    }

    /* renamed from: b */
    public final synchronized C37401bf mo41221b(int i, C37565ef efVar) {
        if (!this.f100833c.mo41134c(i)) {
            C59104x d = f100831a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.ARCSessionMgr");
            ((C59052c) ((C59052c) d).mo56372aa(52880)).mo56387q("#audio# stopListening failed: listening session token inactive. sessionToken: %d", i);
            return new C37839al(C37512ds.FAILED_CLOSING_DUE_TO_INACTIVE_SESSION, efVar);
        }
        C59104x b = f100831a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.ARCSessionMgr");
        ((C59052c) ((C59052c) b).mo56372aa(52879)).mo56352E("#audio# stop(reason(%s)) listening audio request session(token(%d))", efVar.name(), i);
        this.f100833c.mo41133b(i);
        this.f100837g = null;
        C60870cx cxVar = this.f100838h;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
        return this.f100832b.mo41213a(efVar);
    }

    /* renamed from: c */
    public final synchronized C37677hx mo41222c(C37454cc ccVar) {
        if (this.f100837g != null) {
            if (this.f100833c.mo41134c(ccVar.f99431b)) {
                C37872b bVar = this.f100837g;
                bVar.getClass();
                return new C37865t(((C37886e) bVar).f100461a);
            }
        }
        return new C37831ad(C37519dz.FAILED_OPENING_DUE_TO_INACTIVE_SESSION, C37512ds.FAILED_CLOSING_DUE_TO_INACTIVE_SESSION);
    }

    /* renamed from: d */
    public final synchronized C37872b mo41223d(int i) {
        if (this.f100837g != null) {
            if (this.f100833c.mo41134c(i)) {
                C37872b bVar = this.f100837g;
                bVar.getClass();
                return bVar;
            }
        }
        C59104x d = f100831a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.ARCSessionMgr");
        ((C59052c) ((C59052c) d).mo56372aa(52881)).mo56387q("#audio# getAudioRequestListeningSession failed for sessionToken %d: session is inactive", i);
        return new C37886e(new C37830ac(C37519dz.FAILED_OPENING_DUE_TO_INACTIVE_SESSION, C37512ds.FAILED_CLOSING_DUE_TO_INACTIVE_SESSION), -1);
    }

    /* renamed from: e */
    public final synchronized C37872b mo41224e(C37410bo boVar, C37877c cVar) {
        C37872b bVar;
        C37872b bVar2 = this.f100837g;
        if (bVar2 != null) {
            mo41221b(((C37886e) bVar2).f100462b, C37565ef.NEW_AUDIO_REQUEST_CLIENT_LISTENING);
            this.f100837g = null;
        }
        int a = this.f100833c.mo41132a();
        C59104x b = f100831a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.ARCSessionMgr");
        ((C59052c) ((C59052c) b).mo56372aa(52882)).mo56359L("#audio# audio request client(token(%d)) session(token(%d)) is being started on route(%s)", Integer.valueOf(this.f100835e), Integer.valueOf(a), C37465cn.m66491a(cVar.mo41096a().f99460a).name());
        C37402bg b2 = this.f100832b.mo41214b(this.f100835e, a, boVar, this.f100836f, cVar);
        this.f100837g = new C37886e(b2, a);
        C60856cj.m92911t(b2.mo20357d(), C47810es.m84974n(new C37973a(b2)), this.f100834d);
        C60870cx j = C60856cj.m92901j(cVar.mo41099e());
        this.f100838h = j;
        C60856cj.m92911t(j, C47810es.m84974n(new C37978b(this, a)), this.f100834d);
        bVar = this.f100837g;
        bVar.getClass();
        return bVar;
    }

    /* renamed from: f */
    public final boolean mo41225f() {
        C37872b bVar = this.f100837g;
        return bVar != null && this.f100833c.mo41134c(((C37886e) bVar).f100462b);
    }
}
