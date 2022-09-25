package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import com.google.android.apps.gsa.nga.engine.au.i;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76582az;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.C79326x;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80378h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.al */
/* compiled from: PG */
public final class C77320al implements C76591c {

    /* renamed from: a */
    private static final C58974d f213242a = C58974d.m91136j();

    /* renamed from: b */
    private final C77319ak f213243b;

    /* renamed from: c */
    private final Set f213244c;

    public C77320al(C77319ak akVar, Set set) {
        this.f213243b = akVar;
        this.f213244c = set;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.OPEN_WEBSITE));
        h.mo72277g("Open_website", C90126fx.f251256fQ);
        C80378h hVar = (C80378h) C80379i.f220555h.createBuilder();
        hVar.copyOnWrite();
        ((C80379i) hVar.instance).f220558b = true;
        h.mo72245d((C80379i) hVar.build());
        h.mo72244c(C58485gu.m89846n("Open_website"));
        ((C76541a) h).f211766c = 10804;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C79326x a = new C79326x(Optional.m71637of(f213242a)).mo73900a("\nOpenWebsiteFulfiller");
        a.mo73900a("Input FunctionCall").mo73900a(bgVar.f211837a.f166811b);
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        Optional g = bgVar.mo72265g(C76564ah.f211801a, "website");
        Optional g2 = bgVar.mo72265g(C76582az.f211822a, "website");
        boolean z = g2.isPresent() && ((i) g2.get()).a;
        if (!g.isPresent()) {
            a.mo73900a("Abort - Website argument not found.");
        } else {
            if (this.f213243b.mo72522a((String) g.get(), lVar, this.f213244c, nVar, z, a)) {
                lVar.mo74319k(30681);
                a.mo73900a("Success - Generated open website intent");
                return C60856cj.m92900i((C80401n) lVar.build());
            }
        }
        a.mo73900a("Abort - Generated open website intent failed.");
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
