package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6092f;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.f.w */
/* compiled from: PG */
public final class C77303w implements C76591c {

    /* renamed from: a */
    private static final C58974d f213209a = C58974d.m91136j();

    /* renamed from: b */
    private final C77301u f213210b;

    /* renamed from: c */
    private final C91142g f213211c;

    public C77303w(C77301u uVar, C91142g gVar) {
        this.f213210b = uVar;
        this.f213211c = gVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.SHOW_SETTINGS));
        h.mo72277g("Show_setting", C90126fx.f251264fY);
        h.mo72277g("Show_device_setting", C90126fx.f251264fY);
        h.mo72244c(C58485gu.m89847o("Show_setting", "Show_device_setting"));
        ((C76541a) h).f211766c = 10105;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        Optional j = bgVar.mo72268j("setting");
        if (j.isEmpty()) {
            this.f213210b.mo72498b(lVar, new Intent("android.settings.SETTINGS"), nVar);
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        C63490p pVar = (C63490p) j.get();
        if (this.f213211c.mo85405j(C90126fx.f251639mc) && C89988b.m146551d(this.f213211c.mo85403h(C90126fx.f251638mb)).contains(pVar.name())) {
            return C81442m.f222851a;
        }
        if (this.f213210b.mo72513r(lVar, (C63490p) j.get(), nVar, this.f213211c)) {
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        if (this.f213210b.mo72512q(lVar, (C63490p) j.get(), nVar)) {
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        ((C58970a) ((C58970a) f213209a.mo56225c()).mo56372aa(3868)).mo56387q("Unknown setting: %s", ((C63490p) j.get()).getNumber());
        this.f213210b.mo72498b(lVar, new Intent("android.settings.SETTINGS"), nVar);
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
