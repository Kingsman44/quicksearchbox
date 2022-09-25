package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48645f;
import com.google.common.base.C58881cr;
import com.google.common.base.C58882cs;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4534f.C59081b;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.ap */
/* compiled from: PG */
public final class C112471ap implements C112563r {

    /* renamed from: c */
    private static final C121537f f311988c = C121537f.m200840b("Tapas/TapasSignalAccessor", C121511c.f337208a);

    /* renamed from: a */
    public final C112474as f311989a;

    /* renamed from: b */
    public final C68214a f311990b;

    /* renamed from: d */
    private final C86124t f311991d;

    /* renamed from: e */
    private final C111248k f311992e;

    /* renamed from: f */
    private C58881cr f311993f;

    public C112471ap(C112474as asVar, C86124t tVar, C68214a aVar, C111248k kVar) {
        this.f311989a = asVar;
        this.f311991d = tVar;
        this.f311990b = aVar;
        this.f311992e = kVar;
    }

    /* renamed from: a */
    public final Optional mo99530a() {
        return mo99543n(C48634bw.ASSISTANT_HISTORY_SNAPSHOT).map(C112570y.f312163a);
    }

    /* renamed from: b */
    public final Optional mo99531b() {
        Optional map = mo99543n(C48634bw.APP_ACTIONS_SIGNAL).map(C112458ac.f311974a);
        if (map.isEmpty()) {
            this.f311992e.mo99076a(C111255r.SIGNAL_MANAGER, "Fetch app actions, empty signal from accessor.");
            return Optional.empty();
        }
        f311988c.mo105241j("aaRepo_loadFulfillmentData", new C112459ad(this, map));
        this.f311992e.mo99076a(C111255r.SIGNAL_MANAGER, String.format("Fetch app actions, built app action repo from %d app actions.", new Object[]{Integer.valueOf(((C48645f) map.get()).f125728a.size())}));
        return map;
    }

    /* renamed from: c */
    public final Optional mo99532c(boolean z) {
        if (!z) {
            return mo99531b();
        }
        C58881cr crVar = this.f311993f;
        if (crVar == null || ((Optional) crVar.mo6453a()).isEmpty() || ((C48645f) ((Optional) this.f311993f.mo6453a()).get()).f125728a.isEmpty()) {
            this.f311993f = new C58882cs(new C112564s(this), this.f311991d.mo79743a(C90063do.f249645u), TimeUnit.MINUTES);
        }
        C111248k kVar = this.f311992e;
        C111255r rVar = C111255r.SIGNAL_MANAGER;
        Object[] objArr = new Object[1];
        objArr[0] = ((Optional) this.f311993f.mo6453a()).isPresent() ? Integer.valueOf(((C48645f) ((Optional) this.f311993f.mo6453a()).get()).f125728a.size()) : "EMPTY";
        kVar.mo99076a(rVar, String.format("Fetch app actions, cache hit, %s app actions.", objArr));
        return (Optional) this.f311993f.mo6453a();
    }

    /* renamed from: d */
    public final Optional mo99533d() {
        return mo99543n(C48634bw.APP_INFO_SIGNAL).map(C112468am.f311985a);
    }

    /* renamed from: e */
    public final Optional mo99534e() {
        return mo99543n(C48634bw.ASSISTANT_SETTINGS).map(C112469an.f311986a);
    }

    /* renamed from: f */
    public final Optional mo99535f() {
        return mo99543n(C48634bw.BATTERY_INFO).map(C112463ah.f311980a);
    }

    /* renamed from: g */
    public final Optional mo99536g() {
        return mo99543n(C48634bw.APP_USAGE_SIGNAL).map(C112568w.f312161a);
    }

    /* renamed from: h */
    public final Optional mo99537h() {
        return mo99543n(C48634bw.DESKCLOCK_SIGNAL).map(C112567v.f312160a);
    }

    /* renamed from: i */
    public final Optional mo99538i() {
        return mo99543n(C48634bw.HABIT_PROFILE).map(C112456aa.f311972a);
    }

    /* renamed from: j */
    public final Optional mo99539j() {
        return mo99543n(C48634bw.ICING_SIGNAL).map(C112566u.f312159a);
    }

    /* renamed from: k */
    public final Optional mo99540k() {
        return mo99543n(C48634bw.INSTALLED_APPS).map(C112460ae.f311977a);
    }

    /* renamed from: l */
    public final Optional mo99541l() {
        return mo99543n(C48634bw.PUBLIC_PLACE_LIKELIHOODS).map(C112569x.f312162a);
    }

    /* renamed from: m */
    public final Optional mo99542m() {
        return mo99543n(C48634bw.SERVICE_ONLINE_SIGNAL).map(C112461af.f311978a);
    }

    /* renamed from: n */
    public final Optional mo99543n(C48634bw bwVar) {
        C59081b.m91349a(C58979ad.MEDIUM, "stack size");
        return this.f311989a.mo99549c(bwVar);
    }

    /* renamed from: o */
    public final Optional mo99544o() {
        return mo99543n(C48634bw.TAPAS_USER_PROFILE).map(C112457ab.f311973a);
    }

    /* renamed from: p */
    public final Optional mo99545p() {
        return mo99543n(C48634bw.TAPAS_USER_RETENTION).map(C112466ak.f311983a);
    }

    /* renamed from: q */
    public final Optional mo99546q() {
        return mo99543n(C48634bw.LOCATION_SIGNAL).map(C112571z.f312164a);
    }
}
