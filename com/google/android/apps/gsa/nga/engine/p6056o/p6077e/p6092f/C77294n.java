package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6092f;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p5913am.p5945z.C74980b;
import com.google.android.apps.gsa.nga.engine.p6056o.C76540c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.f.n */
/* compiled from: PG */
public final class C77294n implements C76591c {

    /* renamed from: a */
    private static final C58974d f213181a = C58974d.m91136j();

    /* renamed from: b */
    private final C77301u f213182b;

    public C77294n(C77301u uVar) {
        this.f213182b = uVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.SET_DEVICE_SETTINGS));
        h.mo72277g("Set_device_setting", C90126fx.f251261fV);
        h.mo72244c(C58485gu.m89846n("Set_device_setting"));
        ((C76541a) h).f211766c = 10104;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        Optional j = bgVar.mo72268j("setting");
        if (j.isEmpty()) {
            ((C58970a) ((C58970a) f213181a.mo56225c()).mo56372aa(3866)).mo56386p("No device setting set");
            return C81442m.f222851a;
        }
        C63490p pVar = (C63490p) j.get();
        Optional k = bgVar.mo72269k("absolute_value");
        if (k.isEmpty()) {
            return C81442m.f222851a;
        }
        if (C77301u.m124047p(k)) {
            return C81442m.f222851a;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        if (this.f213182b.mo72511o(pVar)) {
            this.f213182b.mo72501e(lVar, nVar.mo71342q());
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        this.f213182b.mo72507k(lVar, new C76540c(pVar, (C74980b) k.get()));
        this.f213182b.mo72499c(lVar, pVar, nVar.mo71342q());
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
