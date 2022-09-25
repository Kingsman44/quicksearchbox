package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;

/* renamed from: com.google.android.apps.gsa.search.core.state.gj */
/* compiled from: PG */
public final class C87087gj implements C90991b {
    /* renamed from: a */
    public static final boolean m140725a(Query query) {
        if (!query.mo84412cs() && !query.mo84337bV() && !query.mo84326bK() && !query.mo84403cj()) {
            if (query.mo84369cB()) {
                return true;
            }
            if (!query.mo84467du() || (!query.mo84392cY() && !query.mo84420dA() && !query.mo84373cF())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchResultsActivityUtils");
    }
}
