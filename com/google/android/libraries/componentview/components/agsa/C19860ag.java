package com.google.android.libraries.componentview.components.agsa;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.componentview.components.agsa.p1684a.C19852k;
import com.google.android.libraries.componentview.components.agsa.p1684a.C19853l;
import com.google.android.libraries.componentview.components.base.C19898a;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.agsa.ag */
/* compiled from: PG */
public class C19860ag extends C19898a {

    /* renamed from: a */
    public C19853l f55550a;

    public C19860ag(C56425d dVar, Context context, C20537f fVar, C20601ca caVar, C20621l lVar) {
        super(dVar, context, fVar, caVar, lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C19926b mo25154e() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C56425d mo25128f() {
        C56425d dVar = this.f55550a.f55527b;
        return dVar == null ? C56425d.f150537g : dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C19852k kVar = (C19852k) this.f55550a.toBuilder();
            kVar.copyOnWrite();
            C19853l lVar = (C19853l) kVar.instance;
            lVar.f55527b = dVar;
            lVar.f55526a |= 1;
            this.f55550a = (C19853l) kVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19853l.f55524e, this.f55550a);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo25129h(View view) {
        view.setOnClickListener(new C19859af(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo25130i(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19853l.f55524e);
        dVar.mo58887l(r0);
        if (dVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C19853l.f55524e);
            dVar.mo58887l(r02);
            Object l = dVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            this.f55550a = (C19853l) obj;
            return;
        }
        C20520h.m38497b(5, "YouTubeLinkComponent", new IllegalArgumentException(), "Missing YouTubeLinkArgs", new Object[0]);
        this.f55550a = C19853l.f55523d;
    }
}
