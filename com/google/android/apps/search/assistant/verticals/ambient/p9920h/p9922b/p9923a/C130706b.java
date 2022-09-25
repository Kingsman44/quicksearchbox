package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.p9923a;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C130706b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130710f f357880a;

    public /* synthetic */ C130706b(C130710f fVar) {
        this.f357880a = fVar;
    }

    public final Object apply(Object obj) {
        C130710f fVar = this.f357880a;
        Optional findFirst = Collection.EL.stream((C58485gu) obj).filter(C130708d.f357882a).map(C130709e.f357883a).findFirst();
        fVar.f357885b.mo109938k("HP_AWAKE_PROFILE", findFirst.isPresent());
        return findFirst;
    }
}
