package com.google.android.gms.p10815k.p10816a;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.api.internal.C143796cq;
import com.google.android.gms.p10814j.C144356a;
import com.google.android.gms.p10815k.C144417q;
import com.google.android.gms.tasks.C146006ab;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.gms.k.a.c */
/* compiled from: PG */
public final /* synthetic */ class C144378c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C144376ar f390955a;

    public /* synthetic */ C144378c(C144376ar arVar) {
        this.f390955a = arVar;
    }

    public final Object apply(Object obj) {
        C144376ar arVar = this.f390955a;
        C144417q qVar = (C144417q) obj;
        C143784ce b = C143785cf.m233680b(C144393r.f390970a, arVar.f389927B, "accountHealthListener");
        C144383h hVar = new C144383h(arVar, new C144389n(b));
        C144384i iVar = new C144384i(arVar);
        C143796cq cqVar = new C143796cq();
        cqVar.f389833c = b;
        cqVar.f389834d = new Feature[]{C144356a.f390935a};
        cqVar.f389831a = hVar;
        cqVar.f389832b = iVar;
        cqVar.f389836f = 28001;
        C146006ab v = arVar.mo119291v(cqVar.mo119255a());
        v.mo122498q(new C144385j(qVar));
        v.mo122496o(new C144386k(qVar));
        return v;
    }
}
