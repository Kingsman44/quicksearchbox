package com.google.android.libraries.assistant.soda.p1606e.p1607a;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17046am;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.base.C58817ah;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.soda.e.a.k */
/* compiled from: PG */
public final /* synthetic */ class C19297k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C19299m f54020a;

    public /* synthetic */ C19297k(C19299m mVar) {
        this.f54020a = mVar;
    }

    public final Object apply(Object obj) {
        C19299m mVar = this.f54020a;
        C17046am amVar = (C17046am) obj;
        C29689e eVar = C29689e.DOWNLOADED;
        C29690f fVar = amVar.f49658b;
        if (fVar == null) {
            fVar = C29690f.f80408m;
        }
        C29689e a = C29689e.m54781a(fVar.f80415f);
        if (a == null) {
            a = C29689e.UNSPECIFIED;
        }
        if (!eVar.equals(a)) {
            return Optional.empty();
        }
        C29690f fVar2 = amVar.f49658b;
        if (fVar2 == null) {
            fVar2 = C29690f.f80408m;
        }
        Optional findFirst = Collection.EL.stream(fVar2.f80416g).filter(C19288b.f54011a).map(C19289c.f54012a).map(C19290d.f54013a).map(new C19291e(mVar)).filter(C19292f.f54015a).map(C19293g.f54016a).findFirst();
        findFirst.ifPresentOrElse(C19294h.f54017a, new C19295i(amVar));
        return findFirst;
    }
}
