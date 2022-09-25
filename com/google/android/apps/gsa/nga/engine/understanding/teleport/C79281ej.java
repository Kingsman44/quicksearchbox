package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.engine.au.c;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ej */
/* compiled from: PG */
public final /* synthetic */ class C79281ej implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C79290es f217752a;

    /* renamed from: b */
    public final /* synthetic */ C79326x f217753b;

    public /* synthetic */ C79281ej(C79290es esVar, C79326x xVar) {
        this.f217752a = esVar;
        this.f217753b = xVar;
    }

    public final Object apply(Object obj) {
        C79290es esVar = this.f217752a;
        C79326x xVar = this.f217753b;
        Optional map = ((Optional) obj).map(C79237ct.f217704a).map(C79238cu.f217705a);
        if (!map.isPresent()) {
            xVar.mo73900a("No webUrl.");
            return Optional.empty();
        }
        xVar.mo73900a("Got web url: ".concat(String.valueOf((String) map.get())));
        return Optional.m71637of(new C79318p(C79315m.m127255b(c.a((String) map.get(), esVar.f217777p.b)), true));
    }
}
