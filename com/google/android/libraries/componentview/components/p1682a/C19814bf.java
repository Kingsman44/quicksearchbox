package com.google.android.libraries.componentview.components.p1682a;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.componentview.components.base.C19898a;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19755aa;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19756ab;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20610cj;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20533b;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.p4522b.C58495hd;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.a.bf */
/* compiled from: PG */
public class C19814bf extends C19898a {

    /* renamed from: a */
    public C19756ab f55377a;

    /* renamed from: b */
    public final C20610cj f55378b;

    /* renamed from: c */
    public final C56429h f55379c;

    /* renamed from: d */
    public final C20533b f55380d;

    public C19814bf(C56425d dVar, Context context, C20537f fVar, C20610cj cjVar, C20601ca caVar, C20621l lVar, C20533b bVar) {
        super(dVar, context, fVar, caVar, lVar);
        this.f55378b = cjVar;
        C56429h hVar = dVar.f150542d;
        this.f55379c = hVar == null ? C56429h.f150547k : hVar;
        this.f55380d = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C56425d mo25128f() {
        C19756ab abVar = this.f55377a;
        if ((abVar.f55179a & 1) == 0) {
            return null;
        }
        C56425d dVar = abVar.f55180b;
        return dVar == null ? C56425d.f150537g : dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        C19755aa aaVar = (C19755aa) this.f55377a.toBuilder();
        if (dVar != null) {
            aaVar.copyOnWrite();
            C19756ab abVar = (C19756ab) aaVar.instance;
            abVar.f55180b = dVar;
            abVar.f55179a |= 1;
        }
        C19756ab abVar2 = (C19756ab) aaVar.build();
        this.f55377a = abVar2;
        if (!abVar2.f55182d.isEmpty()) {
            this.f55378b.mo25491a("ZeroStateSaveState", C58495hd.m89901o("CardId", mo25097c(), "ZeroStateSaveStateActionName", this.f55377a.f55182d));
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19756ab.f55177f, this.f55377a);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo25129h(View view) {
        view.setOnClickListener(new C19813be(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo25130i(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19756ab.f55177f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        this.f55377a = (C19756ab) obj;
    }
}
