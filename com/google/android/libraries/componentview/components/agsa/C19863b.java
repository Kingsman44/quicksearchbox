package com.google.android.libraries.componentview.components.agsa;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.componentview.components.agsa.p1684a.C19842a;
import com.google.android.libraries.componentview.components.agsa.p1684a.C19843b;
import com.google.android.libraries.componentview.components.base.C19898a;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.libraries.componentview.p1697d.C20477h;
import com.google.android.libraries.componentview.services.application.C20546a;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20613d;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.p4522b.C58485gu;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.agsa.b */
/* compiled from: PG */
public class C19863b extends C19898a implements View.OnClickListener {

    /* renamed from: a */
    private final C20546a f55563a;

    /* renamed from: b */
    private C19843b f55564b;

    public C19863b(C56425d dVar, Context context, C20537f fVar, C20601ca caVar, C20546a aVar, C20621l lVar) {
        super(dVar, context, fVar, caVar, lVar);
        this.f55563a = aVar;
    }

    /* renamed from: e */
    public final C19926b mo25154e() {
        C19843b bVar = this.f55564b;
        if ((bVar.f55477a & 4) == 0) {
            return null;
        }
        C19926b bVar2 = bVar.f55480d;
        return bVar2 == null ? C19926b.f55754e : bVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C56425d mo25128f() {
        C19843b bVar = this.f55564b;
        if ((bVar.f55477a & 1) == 0) {
            return null;
        }
        C56425d dVar = bVar.f55478b;
        return dVar == null ? C56425d.f150537g : dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C19842a aVar = (C19842a) this.f55564b.toBuilder();
            aVar.copyOnWrite();
            C19843b bVar = (C19843b) aVar.instance;
            bVar.f55478b = dVar;
            bVar.f55477a |= 1;
            this.f55564b = (C19843b) aVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19843b.f55475f, this.f55564b);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo25129h(View view) {
        view.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo25130i(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19843b.f55475f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19843b bVar = (C19843b) obj;
        this.f55564b = bVar;
        String str = bVar.f55479c;
        this.f55563a.mo25477b(Integer.toString(str.hashCode()), C58485gu.m89846n(str));
    }

    public final void onClick(View view) {
        mo25421J(4, (C20477h) null);
        String str = this.f55564b.f55479c;
        C20546a aVar = this.f55563a;
        Integer.toString(str.hashCode());
        aVar.mo25478d(C58485gu.m89846n(str), 0);
        C56429h H = mo25419H();
        if (H != null) {
            C20601ca caVar = this.f55671g;
            C20613d dVar = new C20613d();
            dVar.mo25529b(str);
            dVar.mo25530c(H.f150556h);
            dVar.f57816c = H.f150555g;
            dVar.f57817d = H.f150558j;
            caVar.mo21037a(dVar.mo25528a());
        }
    }
}
