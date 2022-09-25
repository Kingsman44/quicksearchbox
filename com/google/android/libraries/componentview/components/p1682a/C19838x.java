package com.google.android.libraries.componentview.components.p1682a;

import com.google.android.libraries.componentview.components.base.C20069c;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19767l;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.android.libraries.p1730f.p1731a.C21378h;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.a.x */
/* compiled from: PG */
public final class C19838x extends C19787af {
    public C19838x(C56425d dVar, C21378h hVar, C20601ca caVar, C20537f fVar) {
        super(dVar, caVar, fVar);
        Object obj;
        C56425d dVar2 = this.f57588z;
        C62940bt r2 = C62942bv.checkIsLite(C19767l.f55219k);
        dVar2.mo58887l(r2);
        Object l = dVar2.f169962ag.mo58854l(r2.f169971d);
        if (l == null) {
            obj = r2.f169969b;
        } else {
            obj = r2.mo58889c(l);
        }
        this.f55282c = (C19767l) obj;
        C19767l lVar = this.f55282c;
        if ((lVar.f55221a & 128) != 0) {
            C20537f fVar2 = this.f55281b;
            C56425d dVar3 = lVar.f55229i;
            this.f57601m = fVar2.mo25450a(this, dVar3 == null ? C56425d.f150537g : dVar3);
            C20470a aVar = this.f57601m;
            if (!(aVar instanceof C20069c)) {
                C20598by G = mo25418G();
                G.mo25535e(C19742a.INVALID_CHILD);
                G.mo25536f("FreshnessLabelComponent child is not BaselineTextViewComponent");
                C20520h.m38498c("FreshnessLabelComponent", G.mo25531a(), this.f55280a, new Object[0]);
                return;
            }
            this.f55283d = (C20069c) aVar;
            return;
        }
        C20598by G2 = mo25418G();
        G2.mo25535e(C19742a.INVALID_CHILD);
        G2.mo25536f("FreshnessLabelComponent has a null child");
        C20520h.m38498c("FreshnessLabelComponent", G2.mo25531a(), this.f55280a, new Object[0]);
    }
}
