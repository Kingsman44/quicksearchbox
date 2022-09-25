package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices;

import android.content.Context;
import com.google.android.apps.gsa.searchbox.p6960ui.C88714o;
import com.google.android.apps.gsa.searchbox.shared.component.Elector;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.b */
/* compiled from: PG */
public final class C88672b implements Elector {

    /* renamed from: a */
    private final Context f239748a;

    /* renamed from: b */
    private final C21370a f239749b;

    public C88672b(Context context, C21370a aVar) {
        this.f239748a = context;
        this.f239749b = aVar;
    }

    /* renamed from: a */
    public final void setElections(C88714o oVar) {
        C88675e eVar = new C88675e(this.f239749b);
        oVar.mo82442f(new C88680j(this.f239748a));
        oVar.mo82441e(new C88678h(this.f239748a, eVar));
        oVar.mo82437a(eVar);
    }
}
