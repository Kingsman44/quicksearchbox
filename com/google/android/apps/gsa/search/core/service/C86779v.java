package com.google.android.apps.gsa.search.core.service;

import android.util.LongSparseArray;
import com.google.android.apps.gsa.search.core.service.p6848e.C86682d;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58334be;
import com.google.common.p4522b.C58458fu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.service.v */
/* compiled from: PG */
public final class C86779v extends C86777t {

    /* renamed from: d */
    private static final C59071e f234408d = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.v");

    /* renamed from: a */
    public final C58334be f234409a = new C58458fu(16);

    /* renamed from: b */
    public final C68214a f234410b;

    /* renamed from: c */
    public final C86592a f234411c;

    /* renamed from: e */
    private final C86682d f234412e;

    public C86779v(C68214a aVar, C86592a aVar2, C86682d dVar) {
        this.f234410b = aVar;
        this.f234411c = aVar2;
        this.f234412e = dVar;
    }

    /* renamed from: c */
    private final void m139836c(LongSparseArray longSparseArray, long j) {
        C86775r rVar = (C86775r) this.f234409a.get(Long.valueOf(j));
        if (rVar == null || !rVar.f234387i) {
            int i = 0;
            C86775r rVar2 = null;
            for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                C86775r rVar3 = (C86775r) longSparseArray.valueAt(i2);
                if (rVar3.f234394p && rVar3.f234389k == j && !rVar3.f234393o && (rVar2 == null || rVar3.f234395q > rVar2.f234395q)) {
                    rVar2 = rVar3;
                }
            }
            if (rVar2 != null) {
                C58976aa aaVar = C58975e.f156826a;
                if (mo80395a(rVar2, longSparseArray)) {
                    return;
                }
            }
            while (i < longSparseArray.size()) {
                C86775r rVar4 = (C86775r) longSparseArray.valueAt(i);
                if (rVar4.f234393o || rVar4.f234389k != j || !mo80395a(rVar4, longSparseArray)) {
                    i++;
                    C58976aa aaVar2 = C58975e.f156826a;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo80395a(C86775r rVar, LongSparseArray longSparseArray) {
        if (rVar.f234393o || (this.f234409a.get(Long.valueOf(rVar.f234389k)) != null && rVar.f234384f.mo81902t())) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (!rVar.f234392n || longSparseArray.get(rVar.f234381c) != rVar) {
            C59104x d = f234408d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MultiClientLifecycle");
            ((C59052c) ((C59052c) d).mo56372aa(8377)).mo56386p("Abort, client detached.");
        } else {
            if (rVar != this.f234409a.get(Long.valueOf(rVar.f234389k))) {
                C86775r rVar2 = (C86775r) this.f234409a.get(Long.valueOf(rVar.f234389k));
                if (rVar2 == null || ClientConfig.m142636a(rVar.f234384f, rVar2.f234384f) >= 0) {
                    C59081b.m91349a(C58979ad.FULL, "stack size");
                    if (rVar.f234392n) {
                        C86775r rVar3 = (C86775r) this.f234409a.get(Long.valueOf(rVar.f234389k));
                        if (rVar3 != null) {
                            ((C86669cg) this.f234410b.mo27525b()).mo80272g(rVar3);
                        }
                        ((C58458fu) this.f234409a).mo55338d(Long.valueOf(rVar.f234389k), rVar, true);
                        ((C86669cg) this.f234410b.mo27525b()).mo80271f(rVar);
                        if (rVar != null) {
                            rVar.mo80386h(true);
                        }
                    } else {
                        C59104x c = f234408d.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "MultiClientLifecycle");
                        ((C59052c) ((C59052c) c).mo56372aa(8370)).mo56389s("Trying to activate client, %s and it is not started", rVar);
                    }
                } else {
                    C59104x d2 = f234408d.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "MultiClientLifecycle");
                    ((C59052c) ((C59052c) d2).mo56372aa(8380)).mo56386p("Abort, client has too low priority.");
                }
            }
            return true;
        }
        C86775r rVar4 = (C86775r) longSparseArray.get(rVar.f234389k);
        if (rVar4 != null) {
            C59104x d3 = f234408d.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "MultiClientLifecycle");
            ((C59052c) ((C59052c) d3).mo56372aa(8373)).mo56354G("Abort, client [%s] has too low priority against [%s].", rVar.f234384f.f236951d, rVar4.f234384f.f236951d);
        } else {
            C59104x d4 = f234408d.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "MultiClientLifecycle");
            ((C59052c) ((C59052c) d4).mo56372aa(8372)).mo56389s("Abort, client [%s] has too low priority.", rVar.f234384f.f236951d);
        }
        rVar.f234383e.mo80379b(new C87684al(C88244um.CLIENT_NOT_ACTIVATED).mo81964a());
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo80396b(LongSparseArray longSparseArray, C58833ax axVar) {
        if (!axVar.mo56113h()) {
            for (int i = 0; i < longSparseArray.size(); i++) {
                C86775r rVar = (C86775r) longSparseArray.valueAt(i);
                if (this.f234412e.mo80288a(rVar.f234384f.f236953f)) {
                    m139836c(longSparseArray, rVar.f234389k);
                }
            }
            return;
        }
        m139836c(longSparseArray, ((Long) axVar.mo56107c()).longValue());
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("MultiClientLifecycleManager");
        fVar.mo85279c("Active multi-client enabled clients").mo85276a(C90752i.m148230d(Integer.valueOf(((C58458fu) this.f234409a).f156073c)));
        C91006f e = fVar.mo85281e((Object) null);
        for (C86775r n : this.f234409a.mo55028h()) {
            e.mo85287n(n);
        }
    }
}
