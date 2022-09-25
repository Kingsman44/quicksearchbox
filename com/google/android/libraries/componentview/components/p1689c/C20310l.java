package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.componentview.components.base.C19898a;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20167m;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20168n;
import com.google.android.libraries.componentview.services.application.C20573b;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Locale;

/* renamed from: com.google.android.libraries.componentview.components.c.l */
/* compiled from: PG */
public class C20310l extends C19898a {

    /* renamed from: a */
    public C20168n f57068a;

    /* renamed from: b */
    public final C20573b f57069b;

    /* renamed from: c */
    public Locale f57070c = Locale.ENGLISH;

    /* renamed from: d */
    public C56429h f57071d;

    /* renamed from: j */
    public final C20601ca f57072j;

    public C20310l(C56425d dVar, Context context, C20537f fVar, C20601ca caVar, C20621l lVar, C20573b bVar) {
        super(dVar, context, fVar, caVar, lVar);
        this.f57069b = bVar;
        this.f57072j = caVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C56425d mo25128f() {
        C56425d dVar = this.f57068a.f56577b;
        return dVar == null ? C56425d.f150537g : dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C20167m mVar = (C20167m) this.f57068a.toBuilder();
            mVar.copyOnWrite();
            C20168n nVar = (C20168n) mVar.instance;
            nVar.f56577b = dVar;
            nVar.f56576a |= 1;
            this.f57068a = (C20168n) mVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20168n.f56574g, this.f57068a);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo25129h(View view) {
        view.setOnClickListener(new C20309k(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo25130i(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20168n.f56574g);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20168n nVar = (C20168n) obj;
        this.f57068a = nVar;
        if ((nVar.f56576a & 4) != 0) {
            this.f57070c = new Locale(nVar.f56579d);
        }
        C56429h hVar = dVar.f150542d;
        if (hVar == null) {
            hVar = C56429h.f150547k;
        }
        this.f57071d = hVar;
    }
}
