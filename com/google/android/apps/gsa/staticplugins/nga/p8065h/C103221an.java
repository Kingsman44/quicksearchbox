package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80455c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80456d;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58526ih;
import p3186j$.util.Collection;
import p3186j$.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.an */
/* compiled from: PG */
public final /* synthetic */ class C103221an implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C103221an f287986a = new C103221an();

    private /* synthetic */ C103221an() {
    }

    public final Object apply(Object obj) {
        C58526ih ihVar = new C58526ih();
        Iterator.EL.forEachRemaining(((C103244bj) obj).iterator(), new C103222ao(ihVar));
        C80455c cVar = (C80455c) C80456d.f220820b.createBuilder();
        Collection.EL.stream(ihVar.mo55486f()).map(C103223ap.f287988a).forEach(new C103224aq(cVar));
        return (C80456d) cVar.build();
    }
}
