package com.google.android.libraries.componentview.components.agsa;

import com.google.android.libraries.componentview.components.agsa.p1684a.C19845d;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20546a;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.agsa.m */
/* compiled from: PG */
public final class C19874m extends C19866e {
    public C19874m(C56425d dVar, C20537f fVar, C20601ca caVar, C20546a aVar) {
        super(dVar, fVar, caVar, aVar);
        Object obj;
        C56425d dVar2 = this.f57588z;
        C62940bt r2 = C62942bv.checkIsLite(C19845d.f55483f);
        dVar2.mo58887l(r2);
        Object l = dVar2.f169962ag.mo58854l(r2.f169971d);
        if (l == null) {
            obj = r2.f169969b;
        } else {
            obj = r2.mo58889c(l);
        }
        this.f55580d = (C19845d) obj;
        C19845d dVar3 = this.f55580d;
        if ((dVar3.f55485a & 1) != 0) {
            this.f55579c.mo25477b(dVar3.f55488d, dVar3.f55487c);
            C20537f fVar2 = this.f55577a;
            C56425d dVar4 = this.f55580d.f55486b;
            this.f57601m = fVar2.mo25450a(this, dVar4 == null ? C56425d.f150537g : dVar4);
            return;
        }
        C20598by G = mo25418G();
        G.mo25535e(C19742a.INVALID_CHILD);
        G.mo25536f("AmpViewerComponent has a null child");
        C20520h.m38498c("AmpViewerComponent", G.mo25531a(), this.f55578b, new Object[0]);
    }
}
