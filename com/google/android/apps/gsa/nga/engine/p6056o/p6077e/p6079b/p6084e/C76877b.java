package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6084e;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76584ba;
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
import com.google.protos.p4850an.p4854c.C63408ai;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.e.b */
/* compiled from: PG */
public final class C76877b implements C76591c {

    /* renamed from: a */
    private static final C58974d f212306a = C58974d.m91136j();

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.MAPS_SHOW_LOCATION));
        h.mo72277g("Navigate_to_location", C90126fx.f251324gf);
        h.mo72244c(C58485gu.m89846n("Show_location"));
        ((C76541a) h).f211766c = 11102;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        Optional g = bgVar.mo72265g(C76584ba.f211830a, "destination");
        if (g.isEmpty()) {
            ((C58970a) ((C58970a) f212306a.mo56226d()).mo56372aa(3781)).mo56386p("Destination not found");
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        String str = ((C63408ai) g.get()).f171356d;
        if (TextUtils.isEmpty(str)) {
            ((C58970a) ((C58970a) f212306a.mo56226d()).mo56372aa(3780)).mo56386p("Destination empty");
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        C81442m.m129557s(lVar, t.u(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=".concat(String.valueOf(str)))).setPackage("com.google.android.apps.maps").addFlags(32768), 1, nVar.mo71336k(), false, false));
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
