package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6092f;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.f.l */
/* compiled from: PG */
public final class C77292l implements C76591c {

    /* renamed from: a */
    private static final C58974d f213178a = C58974d.m91136j();

    /* renamed from: b */
    private final C91142g f213179b;

    /* renamed from: c */
    private final C77301u f213180c;

    public C77292l(C91142g gVar, C77301u uVar) {
        this.f213179b = gVar;
        this.f213180c = uVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.SEARCH_SETTINGS));
        h.mo72277g("Search_device_setting", C90126fx.f251447iw);
        h.mo72244c(C58485gu.m89846n("Search_device_setting"));
        ((C76541a) h).f211766c = 10108;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        if (!this.f213179b.mo85405j(C90126fx.f251447iw)) {
            return C81442m.f222851a;
        }
        Optional g = bgVar.mo72265g(C76564ah.f211801a, "setting");
        if (g.isEmpty()) {
            ((C58970a) ((C58970a) f213178a.mo56225c()).mo56372aa(3861)).mo56386p("Missing search query.");
            return C81442m.f222851a;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        this.f213180c.mo72514s(lVar, (String) g.get(), nVar);
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
