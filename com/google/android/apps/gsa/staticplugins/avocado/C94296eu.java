package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.assistant.p3861at.act;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.eu */
/* compiled from: PG */
final class C94296eu extends C84036z {

    /* renamed from: a */
    final /* synthetic */ C94297ev f263491a;

    /* renamed from: b */
    private final C60870cx f263492b;

    public C94296eu(C94297ev evVar, C60870cx cxVar) {
        this.f263491a = evVar;
        this.f263492b = cxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!this.f263492b.isDone() || this.f263492b.isCancelled()) {
            C59104x c = C94297ev.f263493a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "progressUpdate");
            ((C59052c) ((C59052c) c).mo56372aa(14425)).mo56386p("Flip the bit failed!");
            return this.f263491a.mo88437b(AvocadoUtils.m155379c(C94303fa.FLIP_THE_AVOCADO_BIT_FAILED));
        }
        try {
            C94327n a = C94256dh.m155535a((act) C90877ak.m148472f(this.f263492b), this.f263491a.f263494b);
            if (!a.f263602d) {
                C59104x c2 = C94297ev.f263493a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "progressUpdate");
                ((C59052c) ((C59052c) c2).mo56372aa(14427)).mo56386p("Failure status!");
                return this.f263491a.mo88437b(a);
            }
            C59104x b = C94297ev.f263493a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "progressUpdate");
            ((C59052c) ((C59052c) b).mo56372aa(14426)).mo56386p("Successful!");
            this.f263491a.f263495c = 2;
            return C58485gu.m89845m();
        } catch (Exception e) {
            C59104x c3 = C94297ev.f263493a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "progressUpdate");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(14428)).mo56386p("Check status failed with exception!");
            return this.f263491a.mo88437b(AvocadoUtils.m155379c(C94303fa.CHECK_ENROLLMENT_STATUS_FAILED));
        }
    }
}
