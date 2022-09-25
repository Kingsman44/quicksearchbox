package com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10393a;

import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137248f;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137249g;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137250h;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137251i;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137252j;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62971cq;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C137236c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137248f f373376a;

    public /* synthetic */ C137236c(C137248f fVar) {
        this.f373376a = fVar;
    }

    public final Object apply(Object obj) {
        C137248f fVar = this.f373376a;
        C137252j jVar = (C137252j) obj;
        long j = C137238e.f373379a;
        C137251i iVar = (C137251i) jVar.toBuilder();
        C137250h hVar = jVar.f373405b;
        if (hVar == null) {
            hVar = C137250h.f373398b;
        }
        C62971cq cqVar = hVar.f373400a;
        int orElse = IntStream.CC.range(0, cqVar.size()).filter(new C137235b(cqVar)).findFirst().orElse(-1);
        C137249g gVar = (C137249g) hVar.toBuilder();
        if (orElse == -1) {
            gVar.mo113599a(fVar);
        } else {
            gVar.copyOnWrite();
            C137250h hVar2 = (C137250h) gVar.instance;
            fVar.getClass();
            hVar2.mo113600a();
            hVar2.f373400a.add(orElse, fVar);
        }
        C137250h hVar3 = (C137250h) gVar.build();
        iVar.copyOnWrite();
        hVar3.getClass();
        ((C137252j) iVar.instance).f373405b = hVar3;
        return (C137252j) iVar.build();
    }
}
