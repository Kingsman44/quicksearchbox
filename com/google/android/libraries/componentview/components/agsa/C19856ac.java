package com.google.android.libraries.componentview.components.agsa;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.componentview.components.agsa.p1684a.C19850i;
import com.google.android.libraries.componentview.components.agsa.p1684a.C19851j;
import com.google.android.libraries.componentview.components.base.C19898a;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.libraries.componentview.p1699f.C20524l;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20609ci;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.agsa.ac */
/* compiled from: PG */
public class C19856ac extends C19898a {

    /* renamed from: a */
    public final C20524l f55532a;

    /* renamed from: b */
    public final C20609ci f55533b;

    /* renamed from: c */
    public C19851j f55534c;

    public C19856ac(C56425d dVar, Context context, C20537f fVar, C20524l lVar, C20609ci ciVar, C20601ca caVar, C20621l lVar2) {
        super(dVar, context, fVar, caVar, lVar2);
        this.f55532a = lVar;
        this.f55533b = ciVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C19926b mo25154e() {
        C19851j jVar = this.f55534c;
        if ((jVar.f55516a & 4) == 0) {
            return null;
        }
        C19926b bVar = jVar.f55519d;
        return bVar == null ? C19926b.f55754e : bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C56425d mo25128f() {
        C19851j jVar = this.f55534c;
        if ((jVar.f55516a & 1) == 0) {
            return null;
        }
        C56425d dVar = jVar.f55517b;
        return dVar == null ? C56425d.f150537g : dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C19850i iVar = (C19850i) this.f55534c.toBuilder();
            iVar.copyOnWrite();
            C19851j jVar = (C19851j) iVar.instance;
            jVar.f55517b = dVar;
            jVar.f55516a |= 1;
            this.f55534c = (C19851j) iVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19851j.f55514h, this.f55534c);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo25129h(View view) {
        view.setOnClickListener(new C19855ab(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo25130i(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19851j.f55514h);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        this.f55534c = (C19851j) obj;
    }
}
