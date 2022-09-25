package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.p6927e.C87544b;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ds */
/* compiled from: PG */
final class C116662ds implements C116647dd {
    /* renamed from: a */
    public final C87544b mo102820a() {
        return C87544b.SEARCH_TIMED_OUT;
    }

    /* renamed from: b */
    public final boolean mo102821b(SearchError searchError) {
        return searchError.mo81138R(1024);
    }
}
