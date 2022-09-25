package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.libraries.componentview.components.base.p1687a.C19952bz;
import com.google.android.libraries.componentview.components.base.p1687a.C19954ca;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.p1699f.C20524l;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20610cj;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.base.ay */
/* compiled from: PG */
public class C20028ay extends C19898a {

    /* renamed from: a */
    public final C20524l f56140a;

    /* renamed from: b */
    public final C56429h f56141b;

    /* renamed from: c */
    public final C20610cj f56142c;

    /* renamed from: d */
    public C19983f f56143d;

    /* renamed from: j */
    private C19954ca f56144j;

    public C20028ay(C56425d dVar, Context context, C20537f fVar, C20524l lVar, C20601ca caVar, C20621l lVar2, C20610cj cjVar) {
        super(dVar, context, fVar, caVar, lVar2);
        C56429h hVar = dVar.f150542d;
        this.f56141b = hVar == null ? C56429h.f150547k : hVar;
        this.f56140a = lVar;
        this.f56142c = cjVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C19926b mo25154e() {
        C19954ca caVar = this.f56144j;
        if ((caVar.f55855a & 8) == 0) {
            return null;
        }
        C19926b bVar = caVar.f55858d;
        return bVar == null ? C19926b.f55754e : bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C56425d mo25128f() {
        C19954ca caVar = this.f56144j;
        if ((caVar.f55855a & 1) == 0) {
            return null;
        }
        C56425d dVar = caVar.f55856b;
        return dVar == null ? C56425d.f150537g : dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        C19952bz bzVar = (C19952bz) this.f56144j.toBuilder();
        C19983f fVar = this.f56143d;
        if (fVar != null) {
            bzVar.copyOnWrite();
            C19954ca caVar = (C19954ca) bzVar.instance;
            caVar.f55857c = fVar;
            caVar.f55855a |= 2;
        }
        if (dVar != null) {
            bzVar.copyOnWrite();
            C19954ca caVar2 = (C19954ca) bzVar.instance;
            caVar2.f55856b = dVar;
            caVar2.f55855a |= 1;
        }
        this.f56144j = (C19954ca) bzVar.build();
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19954ca.f55853f, this.f56144j);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo25129h(View view) {
        view.setOnClickListener(new C20027ax(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo25130i(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19954ca.f55853f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19954ca caVar = (C19954ca) obj;
        this.f56144j = caVar;
        if ((caVar.f55855a & 2) != 0) {
            C19983f fVar = caVar.f55857c;
            if (fVar == null) {
                fVar = C19983f.f56002g;
            }
            this.f56143d = fVar;
        }
    }
}
