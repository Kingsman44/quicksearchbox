package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.p6927e.C87544b;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.do */
/* compiled from: PG */
final class C116658do implements C116647dd {
    /* renamed from: a */
    public final C87544b mo102820a() {
        return C87544b.NO_SIGNAL;
    }

    /* renamed from: b */
    public final boolean mo102821b(SearchError searchError) {
        int intValue = ((Integer) searchError.f236026j.mo56109e(Integer.valueOf(searchError.mo81135N()))).intValue();
        if (C116666dw.m193615a(searchError)) {
            return intValue == 262220 || intValue == 262219;
        }
        return false;
    }
}
