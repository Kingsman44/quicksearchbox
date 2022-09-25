package com.google.android.libraries.componentview.components.elements;

import com.google.android.libraries.componentview.components.elements.p1696a.C20383h;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56426e;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.elements.an */
/* compiled from: PG */
public final class C20413an extends C20466w {
    public C20413an(C56425d dVar, C20537f fVar, C20601ca caVar) {
        super(dVar, fVar, caVar);
        Object obj;
        C56425d dVar2 = this.f57588z;
        C62940bt r3 = C62942bv.checkIsLite(C20383h.f57313d);
        dVar2.mo58887l(r3);
        Object l = dVar2.f169962ag.mo58854l(r3.f169971d);
        if (l == null) {
            obj = r3.f169969b;
        } else {
            obj = r3.mo58889c(l);
        }
        this.f57577c = (C20383h) obj;
        C56429h hVar = this.f57588z.f150542d;
        this.f57578d = (C56426e) (hVar == null ? C56429h.f150547k : hVar).toBuilder();
        C20537f fVar2 = this.f57575a;
        C56425d dVar3 = this.f57577c.f57316b;
        this.f57601m = fVar2.mo25450a(this, dVar3 == null ? C56425d.f150537g : dVar3);
        if (this.f57601m == null) {
            C20598by G = mo25418G();
            G.mo25535e(C19742a.INVALID_CHILD);
            G.mo25536f("CarouselItemComponent has a null child");
            C56425d dVar4 = this.f57588z.f150541c;
            G.mo25534d("child type is ".concat(String.valueOf((dVar4 == null ? C56425d.f150537g : dVar4).f150540b)));
            C20520h.m38498c("CarouselItemComponent", G.mo25531a(), this.f57576b, new Object[0]);
        }
    }
}
