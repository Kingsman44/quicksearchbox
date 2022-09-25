package com.google.android.libraries.search.p2904c.p2967t;

import com.google.android.libraries.search.p2904c.C37465cn;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.C37657hd;
import com.google.android.libraries.search.p2904c.C37658he;
import com.google.android.libraries.search.p2904c.C37662hi;
import com.google.android.libraries.search.p2904c.C37670hq;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2942m.C37877c;
import com.google.android.libraries.search.p2904c.p2942m.C37894h;
import com.google.android.libraries.search.p2904c.p2942m.C37897k;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37833af;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37838ak;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2942m.p2949f.C37889a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.t.s */
/* compiled from: PG */
public final class C38110s {

    /* renamed from: a */
    private static final C59071e f100979a = C59071e.m91332i("com.google.android.libraries.search.c.t.s");

    /* renamed from: b */
    private final C38103l f100980b;

    /* renamed from: c */
    private final C37889a f100981c;

    /* renamed from: d */
    private final Executor f100982d;

    /* renamed from: e */
    private C37897k f100983e;

    /* renamed from: f */
    private C60870cx f100984f;

    public C38110s(C38103l lVar, C37889a aVar, Executor executor) {
        this.f100980b = lVar;
        this.f100981c = aVar;
        this.f100982d = executor;
    }

    /* renamed from: a */
    public final synchronized C37657hd mo41270a(int i, C37565ef efVar) {
        if (!this.f100981c.mo41134c(i)) {
            C59104x d = f100979a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.HWCSessionMgr");
            ((C59052c) ((C59052c) d).mo56372aa(52892)).mo56387q("#audio# stopListening failed: listening session token inactive. sessionToken: %d", i);
            return new C37838ak(C37846as.m66801g(C37512ds.FAILED_CLOSING_DUE_TO_INACTIVE_SESSION), efVar);
        }
        C59104x b = f100979a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.HWCSessionMgr");
        ((C59052c) ((C59052c) b).mo56372aa(52891)).mo56352E("#audio# stop(reason(%s)) listening hotword session(token(%d))", efVar.name(), i);
        this.f100981c.mo41133b(i);
        this.f100983e = null;
        C60870cx cxVar = this.f100984f;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
        return this.f100980b.mo41215c(efVar);
    }

    /* renamed from: b */
    public final synchronized C37658he mo41271b(int i, C37565ef efVar) {
        if (!this.f100981c.mo41134c(i)) {
            C59104x d = f100979a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.HWCSessionMgr");
            ((C59052c) ((C59052c) d).mo56372aa(52893)).mo56386p("#audio# stopListeningForSeamlessMode failed: listening session token inactive.");
            C37512ds dsVar = C37512ds.FAILED_CLOSING_DUE_TO_INACTIVE_SESSION;
            return C37846as.m66806l(C37846as.m66801g(dsVar), C37670hq.f100052c, efVar);
        }
        return this.f100980b.mo41216d(efVar);
    }

    /* renamed from: c */
    public final synchronized C37897k mo41272c(int i) {
        if (this.f100983e != null) {
            if (this.f100981c.mo41134c(i)) {
                C37897k kVar = this.f100983e;
                kVar.getClass();
                return kVar;
            }
        }
        C59104x d = f100979a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.HWCSessionMgr");
        ((C59052c) ((C59052c) d).mo56372aa(52894)).mo56387q("#audio# getHotwordListeningSession failed for sessionToken %d: session is inactive", i);
        return new C37894h(new C37833af(C37519dz.FAILED_OPENING_DUE_TO_INACTIVE_SESSION, C37512ds.FAILED_CLOSING_DUE_TO_INACTIVE_SESSION), -1);
    }

    /* renamed from: d */
    public final synchronized C37897k mo41273d(C37662hi hiVar, C37877c cVar) {
        C37894h hVar;
        mo41274e(C37565ef.NEW_HOTWORD_CLIENT_LISTENING);
        int a = this.f100981c.mo41132a();
        C59104x b = f100979a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.HWCSessionMgr");
        C59052c cVar2 = (C59052c) ((C59052c) b).mo56372aa(52895);
        C37773c cVar3 = hiVar.f100037f;
        if (cVar3 == null) {
            cVar3 = C37773c.f100243c;
        }
        cVar2.mo56359L("#audio# hotword client(%s) session(token(%d)) is being started on route(%s)", C37772b.m66674a(cVar3.f100245a).name(), Integer.valueOf(a), C37465cn.m66491a(cVar.mo41096a().f99460a).name());
        C60870cx j = C60856cj.m92901j(cVar.mo41099e());
        this.f100984f = j;
        C60856cj.m92911t(j, C47810es.m84974n(new C38109r(this, a)), this.f100982d);
        hVar = new C37894h(this.f100980b.mo41217e(a, hiVar, cVar), a);
        this.f100983e = hVar;
        return hVar;
    }

    /* renamed from: e */
    public final synchronized void mo41274e(C37565ef efVar) {
        C37897k kVar = this.f100983e;
        if (kVar != null) {
            mo41270a(((C37894h) kVar).f100479b, efVar);
        }
    }

    /* renamed from: f */
    public final synchronized boolean mo41275f() {
        return this.f100983e != null;
    }
}
