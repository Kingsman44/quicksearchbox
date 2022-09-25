package com.google.android.apps.gsa.search.core.google;

import android.content.res.Resources;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.google.p6796f.C85983e;
import com.google.android.apps.gsa.search.core.google.p6797g.C85985a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;

/* renamed from: com.google.android.apps.gsa.search.core.google.bl */
/* compiled from: PG */
public final class C85889bl implements C85983e {

    /* renamed from: a */
    private final Resources f232220a;

    /* renamed from: b */
    private final C86124t f232221b;

    public C85889bl(Resources resources, C86124t tVar) {
        this.f232220a = resources;
        this.f232221b = tVar;
    }

    /* renamed from: a */
    public final void mo79521a(C85981c cVar, Query query) {
        if (query.mo84416cw()) {
            cVar.mo79638d("gsas", "1");
        } else if (!query.mo84403cj() || !this.f232221b.mo79746e(C90014bt.f247760nI) || !this.f232221b.mo79746e(C90014bt.f247677lf)) {
            cVar.mo79638d("padt", Integer.toString(C85985a.m138247b(this.f232220a, true, true)));
            cVar.mo79638d("padb", Integer.toString(C85985a.m138247b(this.f232220a, false, true)));
        } else {
            Resources resources = this.f232220a;
            cVar.mo79638d("padb", Integer.toString((int) Math.ceil((double) (((float) C85985a.m138246a(resources)) / resources.getDisplayMetrics().density))));
        }
    }

    /* renamed from: d */
    public final void mo79436d(C85981c cVar, Query query) {
        mo79521a(cVar, query);
    }
}
