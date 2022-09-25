package com.google.android.libraries.componentview.components.elements;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.google.android.libraries.componentview.components.base.C19898a;
import com.google.android.libraries.componentview.components.base.p1687a.C19899a;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.libraries.componentview.components.elements.p1696a.C20392q;
import com.google.android.libraries.componentview.components.elements.p1696a.C20393r;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20613d;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.elements.bb */
/* compiled from: PG */
public class C20428bb extends C19898a implements View.OnClickListener {

    /* renamed from: a */
    private C19926b f57439a;

    /* renamed from: b */
    private C20393r f57440b;

    public C20428bb(C56425d dVar, C20537f fVar, C20601ca caVar, Context context, C20621l lVar) {
        super(dVar, context, fVar, caVar, lVar);
    }

    /* renamed from: e */
    public final C19926b mo25154e() {
        return this.f57439a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C56425d mo25128f() {
        C56425d dVar = this.f57440b.f57356b;
        return dVar == null ? C56425d.f150537g : dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C20392q qVar = (C20392q) this.f57440b.toBuilder();
            qVar.copyOnWrite();
            C20393r rVar = (C20393r) qVar.instance;
            rVar.f57356b = dVar;
            rVar.f57355a |= 1;
            this.f57440b = (C20393r) qVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20393r.f57353g, this.f57440b);
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
        C62940bt r0 = C62942bv.checkIsLite(C20393r.f57353g);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        this.f57440b = (C20393r) obj;
        C19899a aVar = (C19899a) C19926b.f55754e.createBuilder();
        aVar.copyOnWrite();
        C19926b bVar = (C19926b) aVar.instance;
        bVar.f55756a |= 1;
        bVar.f55757b = false;
        this.f57439a = (C19926b) aVar.build();
    }

    public final void onClick(View view) {
        Rect rect;
        C20393r rVar = this.f57440b;
        String str = rVar.f57357c;
        int i = rVar.f57359e;
        String str2 = rVar.f57358d;
        if (view == null) {
            rect = null;
        } else {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            rect = new Rect(i2, iArr[1], view.getMeasuredWidth() + i2, iArr[1] + view.getMeasuredHeight());
        }
        mo25421J(2, new C20452o(str, i, str2, rect));
        C56429h H = mo25419H();
        if (H != null) {
            C20601ca caVar = this.f55671g;
            C20613d dVar = new C20613d();
            dVar.mo25529b(this.f57440b.f57358d);
            dVar.mo25530c(H.f150556h);
            dVar.f57816c = H.f150555g;
            dVar.f57817d = H.f150558j;
            caVar.mo21037a(dVar.mo25528a());
        }
    }
}
