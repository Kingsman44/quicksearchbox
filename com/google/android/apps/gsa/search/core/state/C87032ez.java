package com.google.android.apps.gsa.search.core.state;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90725ai;
import com.google.android.apps.gsa.shared.util.C90741ay;

/* renamed from: com.google.android.apps.gsa.search.core.state.ez */
/* compiled from: PG */
public final class C87032ez {
    /* renamed from: a */
    public static final boolean m140541a(Query query, String str) {
        if (!query.mo84391cX() || !query.mo84433dN()) {
            return false;
        }
        String b = C90741ay.m148210b(query.f252768g);
        return TextUtils.isEmpty(b) || C90725ai.m148181c(b, str);
    }
}
