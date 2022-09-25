package com.google.android.libraries.componentview.components.elements;

import android.content.Context;
import com.google.android.libraries.componentview.components.elements.p1696a.C20381f;
import com.google.android.libraries.componentview.components.elements.p1696a.C20384i;
import com.google.android.libraries.componentview.components.elements.p1696a.C20385j;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.elements.z */
/* compiled from: PG */
public class C20469z extends C20451n {

    /* renamed from: f */
    protected C20385j f57586f;

    public C20469z(Context context, C56425d dVar, C20537f fVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, caVar, atVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo25111g(C56425d dVar) {
        this.f57586f = mo25416n(dVar);
        super.mo25111g(dVar);
    }

    /* renamed from: kG */
    public final C56425d mo25385kG(C56425d dVar, C20381f fVar) {
        C20384i iVar = (C20384i) this.f57586f.toBuilder();
        iVar.copyOnWrite();
        C20385j jVar = (C20385j) iVar.instance;
        fVar.getClass();
        jVar.f57322b = fVar;
        jVar.f57321a |= 1;
        this.f57586f = (C20385j) iVar.build();
        return mo25417o(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo25397m() {
        return this.f57586f.f57323c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C20385j mo25416n(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20385j.f57319e);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        return (C20385j) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C56425d mo25417o(C56425d dVar) {
        C56424c cVar = (C56424c) dVar.toBuilder();
        cVar.mo58885m(C20385j.f57319e, this.f57586f);
        return (C56425d) cVar.build();
    }

    /* renamed from: kF */
    public final C20381f mo25384kF(C56425d dVar) {
        C20385j jVar = this.f57586f;
        if ((jVar.f57321a & 1) != 0) {
            C20381f fVar = jVar.f57322b;
            return fVar == null ? C20381f.f57303f : fVar;
        }
        C20520h.m38497b(5, "CarouselLazy", new IllegalArgumentException(), "Missing CarouselEagerArgs", new Object[0]);
        return C20381f.f57303f;
    }
}
