package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.componentview.components.base.C19898a;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20104aa;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20105ab;
import com.google.android.libraries.componentview.services.application.C20576bc;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.c.ar */
/* compiled from: PG */
public class C20198ar extends C19898a {

    /* renamed from: a */
    public final C20576bc f56692a;

    /* renamed from: b */
    public final C20601ca f56693b;

    /* renamed from: c */
    private C20105ab f56694c;

    public C20198ar(C56425d dVar, Context context, C20537f fVar, C20576bc bcVar, C20601ca caVar, C20621l lVar) {
        super(dVar, context, fVar, caVar, lVar);
        this.f56692a = bcVar;
        this.f56693b = caVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C19926b mo25154e() {
        C20105ab abVar = this.f56694c;
        if ((abVar.f56345a & 4) == 0) {
            return null;
        }
        C19926b bVar = abVar.f56347c;
        return bVar == null ? C19926b.f55754e : bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C56425d mo25128f() {
        C56425d dVar = this.f56694c.f56346b;
        return dVar == null ? C56425d.f150537g : dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C20104aa aaVar = (C20104aa) this.f56694c.toBuilder();
            aaVar.copyOnWrite();
            C20105ab abVar = (C20105ab) aaVar.instance;
            abVar.f56346b = dVar;
            abVar.f56345a |= 1;
            this.f56694c = (C20105ab) aaVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20105ab.f56343e, this.f56694c);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo25129h(View view) {
        view.setOnClickListener(new C20197aq(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo25130i(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20105ab.f56343e);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        this.f56694c = (C20105ab) obj;
    }
}
