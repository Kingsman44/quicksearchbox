package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8242g;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.assistant.p4016z.C53691ap;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.g.f */
/* compiled from: PG */
public final /* synthetic */ class C106709f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106710g f297404a;

    /* renamed from: b */
    public final /* synthetic */ C53691ap f297405b;

    public /* synthetic */ C106709f(C106710g gVar, C53691ap apVar) {
        this.f297404a = gVar;
        this.f297405b = apVar;
    }

    public final Object apply(Object obj) {
        C106710g gVar = this.f297404a;
        C53691ap apVar = this.f297405b;
        Optional findFirst = Collection.EL.stream((C58485gu) obj).filter(C106707d.f297402a).map(C106708e.f297403a).findFirst();
        C118569b bVar = (C118569b) C106710g.f297406a.get(apVar);
        if (bVar != null) {
            gVar.f297408b.mo77192a(bVar, true != findFirst.isPresent() ? 0 : 1);
        }
        return findFirst;
    }
}
