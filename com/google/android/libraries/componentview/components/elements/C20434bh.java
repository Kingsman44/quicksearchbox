package com.google.android.libraries.componentview.components.elements;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.android.libraries.componentview.components.elements.p1696a.C20397v;
import com.google.android.libraries.componentview.components.elements.views.C20461b;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.elements.bh */
/* compiled from: PG */
public class C20434bh extends C20061bs {
    public C20434bh(Context context, C56425d dVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ View mo25110e(Context context) {
        return new C20461b(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20397v.f57367g);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20397v vVar = (C20397v) obj;
        if ((vVar.f57369a & 1) != 0) {
            C20461b bVar = (C20461b) this.f56305p;
            C19995r rVar = vVar.f57370b;
            if (rVar == null) {
                rVar = C19995r.f56032g;
            }
            bVar.mo25404b(C20566at.m38590a(rVar));
        }
        if ((vVar.f57369a & 2) != 0) {
            C20461b bVar2 = (C20461b) this.f56305p;
            C19995r rVar2 = vVar.f57371c;
            if (rVar2 == null) {
                rVar2 = C19995r.f56032g;
            }
            bVar2.mo25403a(C20566at.m38590a(rVar2));
        }
        C20461b bVar3 = (C20461b) this.f56305p;
        float f = vVar.f57372d;
        if (bVar3.f57549a != f) {
            bVar3.f57549a = f;
            bVar3.invalidate();
        }
        if ((vVar.f57369a & 8) != 0) {
            C19916aq aqVar = vVar.f57373e;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            mo25249w(aqVar);
        }
    }
}
