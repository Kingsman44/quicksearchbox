package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.assistant.p3781ad.p3789d.p3791b.C48716bx;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.ci */
/* compiled from: PG */
public final class C113088ci extends C112473ar {

    /* renamed from: b */
    public static final /* synthetic */ int f313341b = 0;

    /* renamed from: c */
    private static final C65753ak f313342c = C65753ak.TAPAS_USER_PROFILE;

    /* renamed from: a */
    public final C21370a f313343a;

    /* renamed from: d */
    private final C42876ab f313344d;

    /* renamed from: e */
    private final C22871g f313345e;

    /* renamed from: f */
    private final C86124t f313346f;

    /* renamed from: g */
    private final i f313347g;

    /* renamed from: h */
    private final C86054o f313348h;

    public C113088ci(C42876ab abVar, C22871g gVar, C21370a aVar, C86124t tVar, i iVar, C86054o oVar) {
        this.f313344d = abVar;
        this.f313345e = gVar;
        this.f313343a = aVar;
        this.f313346f = tVar;
        this.f313347g = iVar;
        this.f313348h = oVar;
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        C60870cx cxVar;
        C60870cx i = this.f313345e.mo28209i(this.f313344d.mo46042d(), "readLogEntriesFromPDS", C113085cf.f313338a);
        if (!this.f313346f.mo79746e(C90063do.f249332bY)) {
            cxVar = C60856cj.m92900i(C58485gu.m89845m());
        } else {
            String F = this.f313348h.mo79659F();
            if (F == null) {
                cxVar = C60856cj.m92900i(C58485gu.m89845m());
            } else {
                cxVar = this.f313347g.a(F, f313342c, (String) null, C63662ac.f172144a, C48716bx.f126043g);
            }
        }
        return this.f313345e.mo28209i(C60856cj.m92897f(i, cxVar), "fetch TapasUserProfileSignal", new C113084ce(this));
    }
}
