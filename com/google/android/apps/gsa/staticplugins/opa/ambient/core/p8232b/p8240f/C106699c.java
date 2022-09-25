package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8240f;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.f.c */
/* compiled from: PG */
public final /* synthetic */ class C106699c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106701e f297391a;

    public /* synthetic */ C106699c(C106701e eVar) {
        this.f297391a = eVar;
    }

    public final Object apply(Object obj) {
        C106701e eVar = this.f297391a;
        Optional findFirst = Collection.EL.stream((C58485gu) obj).filter(C106674a.f297345a).map(C106698b.f297390a).findFirst();
        eVar.f297395c.mo77192a(C118569b.SMARTSPACE_HABITS_AWAKE_PROFILE_PRESENT, true != findFirst.isPresent() ? 0 : 1);
        return findFirst;
    }
}
