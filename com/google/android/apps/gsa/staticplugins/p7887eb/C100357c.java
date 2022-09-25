package com.google.android.apps.gsa.staticplugins.p7887eb;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6749o.C85536a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7020bd.C89411d;
import com.google.android.apps.gsa.shared.p7020bd.C89412e;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.eb.c */
/* compiled from: PG */
public final class C100357c implements C118549h {

    /* renamed from: a */
    public final C85536a f280640a;

    /* renamed from: b */
    private final C86124t f280641b;

    /* renamed from: c */
    private final C22871g f280642c;

    public C100357c(C85536a aVar, C86124t tVar, C22871g gVar) {
        this.f280641b = tVar;
        this.f280640a = aVar;
        this.f280642c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f280641b.mo79746e(C89972ak.f246562c)) {
            return this.f280640a.mo79050b();
        }
        C60870cx cxVar = C118826c.f331423b;
        C62940bt r1 = C62942bv.checkIsLite(C89412e.f242397a);
        akVar.mo58887l(r1);
        Object l = akVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        if (((C89411d) obj).f242396b) {
            cxVar = this.f280640a.mo79050b();
        }
        return this.f280642c.mo28210j(this.f280642c.mo28210j(cxVar, "setup tips", new C100335a(this)), "process tips", new C100355b(this));
    }
}
