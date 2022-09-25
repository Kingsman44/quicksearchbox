package com.google.android.libraries.componentview.components.agsa;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.componentview.components.agsa.p1684a.C19846e;
import com.google.android.libraries.componentview.components.agsa.p1684a.C19847f;
import com.google.android.libraries.componentview.components.base.C19898a;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.agsa.h */
/* compiled from: PG */
public class C19869h extends C19898a implements View.OnClickListener {

    /* renamed from: a */
    private C19847f f55587a;

    public C19869h(C56425d dVar, Context context, C20537f fVar, C20601ca caVar, C20621l lVar) {
        super(dVar, context, fVar, caVar, lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C56425d mo25128f() {
        C19847f fVar = this.f55587a;
        if ((fVar.f55493a & 1) == 0) {
            return null;
        }
        C56425d dVar = fVar.f55494b;
        return dVar == null ? C56425d.f150537g : dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C19846e eVar = (C19846e) this.f55587a.toBuilder();
            eVar.copyOnWrite();
            C19847f fVar = (C19847f) eVar.instance;
            fVar.f55494b = dVar;
            fVar.f55493a |= 1;
            this.f55587a = (C19847f) eVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19847f.f55491e, this.f55587a);
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
        C62940bt r0 = C62942bv.checkIsLite(C19847f.f55491e);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        this.f55587a = (C19847f) obj;
    }

    public final void onClick(View view) {
        mo25421J(3, new C19872k(this.f55587a.f55495c, mo25419H()));
    }
}
