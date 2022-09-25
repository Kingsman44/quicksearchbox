package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8559d;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112145l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9223c.C121431c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48665z;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.d.r */
/* compiled from: PG */
public final class C112267r extends C112145l {

    /* renamed from: f */
    public static final /* synthetic */ int f311582f = 0;

    /* renamed from: g */
    private static final C121537f f311583g = C121537f.m200840b("Ng3ScoreAdjuster", C112145l.f311417q);

    /* renamed from: h */
    private static final C59071e f311584h = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.d.r");

    /* renamed from: a */
    public final C121431c f311585a;

    /* renamed from: b */
    public final C21370a f311586b;

    /* renamed from: c */
    public final C112471ap f311587c;

    /* renamed from: d */
    public final C111248k f311588d;

    /* renamed from: e */
    public final Executor f311589e;

    public C112267r(C121431c cVar, C21370a aVar, C112471ap apVar, C111248k kVar, Executor executor) {
        this.f311585a = cVar;
        this.f311586b = aVar;
        this.f311587c = apVar;
        this.f311588d = kVar;
        this.f311589e = executor;
    }

    /* renamed from: b */
    public static long m186117b(C48665z zVar, long j, int i) {
        return Collection.EL.stream(zVar.f125774b).filter(new C112260k(j, i)).mapToLong(C112261l.f311569a).sum();
    }

    /* renamed from: a */
    public final C48667ab mo99422a() {
        return C48667ab.NG3_SCORE_ADJUSTER;
    }

    /* renamed from: c */
    public final void mo99479c(Level level, String str, Object... objArr) {
        this.f311588d.mo99076a(C111255r.NG3_LOG, String.format(str, objArr));
        ((C59052c) f311584h.mo56223a(level).mo56372aa(27658)).mo56368U(str, objArr);
    }

    /* renamed from: i */
    public final C60870cx mo99416i(C113405ep epVar, Map map) {
        return f311583g.mo105234c("ng3_adjust", new C112256g(this, epVar, map));
    }
}
