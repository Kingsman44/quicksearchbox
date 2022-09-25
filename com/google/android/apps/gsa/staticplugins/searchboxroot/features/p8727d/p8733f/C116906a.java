package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8733f;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.searchbox.p6944c.C88613q;
import com.google.android.apps.gsa.searchbox.shared.component.Elector;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.f.a */
/* compiled from: PG */
public final class C116906a implements Elector {

    /* renamed from: a */
    private final C86124t f324574a;

    /* renamed from: b */
    private final C86338r f324575b;

    /* renamed from: c */
    private final C21370a f324576c;

    public C116906a(C86124t tVar, C86338r rVar, C21370a aVar) {
        this.f324574a = tVar;
        this.f324575b = rVar;
        this.f324576c = aVar;
    }

    /* renamed from: a */
    public final void setElections(C88613q qVar) {
        qVar.mo82272a(new C116907b(this.f324574a, this.f324575b, this.f324576c));
        qVar.mo82273b(new C116908c(this.f324574a, this.f324575b));
    }
}
