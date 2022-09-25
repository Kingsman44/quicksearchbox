package com.google.android.apps.gsa.search.shared.actions.errors;

import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.p7012bb.p7014b.C89357a;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.errors.c */
/* compiled from: PG */
public final class C87415c {
    /* renamed from: a */
    public static SearchError m141581a(Query query, Throwable th) {
        C90456c a = C89357a.m145329a(th);
        if (query.mo84438dS()) {
            return new NativeSearchError(query, a);
        }
        return new SearchError(query, (String) null, a);
    }
}
