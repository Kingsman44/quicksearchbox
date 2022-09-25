package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p677b.p678a;

import android.content.Context;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.gms.car.C143121be;
import com.google.android.gms.car.C143125bi;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p677b.C11552b;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.n */
/* compiled from: PG */
public final /* synthetic */ class C11544n implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C11551u f37438a;

    public /* synthetic */ C11544n(C11551u uVar) {
        this.f37438a = uVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C11551u uVar = this.f37438a;
        C143121be beVar = uVar.f37454h;
        if (beVar == null || !beVar.mo117964b()) {
            C11534d dVar = uVar.f37458l;
            C11545o oVar = new C11545o(cVar);
            Objects.requireNonNull(cVar);
            C11546p pVar = new C11546p(cVar);
            C11552b bVar = uVar.f37455i;
            Context context = dVar.f37418b;
            context.getClass();
            C143121be a = C143125bi.m232178a(context, new C11532b(pVar, bVar, oVar), new C11531a(pVar, bVar), new C11533c(dVar, bVar));
            dVar.f37419c = a;
            uVar.f37454h = a;
            uVar.f37454h.mo117965c();
            return "connect CarClientToken";
        }
        cVar.mo5437b(false);
        return "CarClientToken already connected";
    }
}
