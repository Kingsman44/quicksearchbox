package com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88613q;
import com.google.android.apps.gsa.searchbox.shared.component.Elector;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest.b */
/* compiled from: PG */
public final class C116873b implements Elector {

    /* renamed from: a */
    private final Context f324360a;

    /* renamed from: b */
    private final C86124t f324361b;

    public C116873b(Context context, C86124t tVar) {
        this.f324360a = context;
        this.f324361b = tVar;
    }

    /* renamed from: a */
    public final void setElections(C88613q qVar) {
        C116877f fVar = new C116877f();
        qVar.mo82275d(fVar);
        qVar.mo82282k(new C116875d(this.f324360a, this.f324361b, fVar));
        qVar.mo82280i(new C116876e());
    }
}
