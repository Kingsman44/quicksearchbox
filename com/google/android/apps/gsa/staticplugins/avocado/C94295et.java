package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.et */
/* compiled from: PG */
final class C94295et extends C84036z {

    /* renamed from: a */
    final /* synthetic */ C94297ev f263489a;

    /* renamed from: b */
    private final C60870cx f263490b;

    public C94295et(C94297ev evVar, C60870cx cxVar) {
        this.f263489a = evVar;
        this.f263490b = cxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!this.f263490b.isDone() || this.f263490b.isCancelled()) {
            C59104x c = C94297ev.f263493a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "progressUpdate");
            ((C59052c) ((C59052c) c).mo56372aa(14421)).mo56386p("Cloud validation or flip the bit failed!");
            return this.f263489a.mo88437b(AvocadoUtils.m155379c(C94303fa.CLOUD_VALIDATION_OR_FLIP_THE_AVOCADO_BIT_CANCELED));
        }
        try {
            C94327n nVar = (C94327n) C90877ak.m148472f(this.f263490b);
            if (!nVar.f263602d) {
                C59104x c2 = C94297ev.f263493a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "progressUpdate");
                ((C59052c) ((C59052c) c2).mo56372aa(14423)).mo56386p("Failure status!");
                return this.f263489a.mo88437b(nVar);
            }
            C59104x b = C94297ev.f263493a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "progressUpdate");
            ((C59052c) ((C59052c) b).mo56372aa(14422)).mo56386p("Successful!");
            this.f263489a.f263495c = 2;
            return C58485gu.m89845m();
        } catch (Exception e) {
            C59104x c3 = C94297ev.f263493a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "progressUpdate");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(14424)).mo56386p("Cloud validation or flip the bit failed with exception!");
            return this.f263489a.mo88437b(AvocadoUtils.m155379c(C94303fa.CLOUD_VALIDATION_OR_FLIP_THE_AVOCADO_BIT_EXCEPTION));
        }
    }
}
