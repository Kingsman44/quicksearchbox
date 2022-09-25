package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8238e;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.e.f */
/* compiled from: PG */
public final /* synthetic */ class C106670f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106672h f297337a;

    public /* synthetic */ C106670f(C106672h hVar) {
        this.f297337a = hVar;
    }

    public final Object apply(Object obj) {
        C106672h hVar = this.f297337a;
        Optional map = Collection.EL.stream((C58485gu) obj).filter(C106653a.f297313a).findFirst().map(C106666b.f297333a);
        hVar.f297341c.mo77192a(C118569b.SMARTSPACE_HABITS_MEDIA_PROFILE_PRESENT, true != map.isPresent() ? 0 : 1);
        map.ifPresent(new C106667c(hVar));
        return map;
    }
}
