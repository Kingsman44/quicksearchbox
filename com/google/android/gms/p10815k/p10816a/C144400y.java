package com.google.android.gms.p10815k.p10816a;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.api.internal.C143796cq;
import com.google.android.gms.p10814j.C144356a;
import com.google.android.gms.p10815k.C144418r;
import com.google.android.gms.tasks.C146006ab;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.gms.k.a.y */
/* compiled from: PG */
public final /* synthetic */ class C144400y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C144376ar f390979a;

    public /* synthetic */ C144400y(C144376ar arVar) {
        this.f390979a = arVar;
    }

    public final Object apply(Object obj) {
        C144376ar arVar = this.f390979a;
        C144418r rVar = (C144418r) obj;
        C143784ce b = C143785cf.m233680b(C144366ah.f390945a, arVar.f389927B, "accountMessagesListener");
        C144396u uVar = new C144396u(arVar, new C144362ad(b));
        C144397v vVar = new C144397v(arVar);
        C143796cq cqVar = new C143796cq();
        cqVar.f389833c = b;
        cqVar.f389834d = new Feature[]{C144356a.f390936b};
        cqVar.f389831a = uVar;
        cqVar.f389832b = vVar;
        cqVar.f389836f = 28007;
        C146006ab v = arVar.mo119291v(cqVar.mo119255a());
        v.mo122498q(new C144398w(rVar));
        v.mo122496o(new C144399x(rVar));
        return v;
    }
}
