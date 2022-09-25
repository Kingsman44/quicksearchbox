package com.google.android.apps.gsa.shared.logger.p7053c;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4552o.C60537to;

/* renamed from: com.google.android.apps.gsa.shared.logger.c.c */
/* compiled from: PG */
public final class C89880c {
    /* renamed from: a */
    public static C60537to m146354a(Query query) {
        C60537to toVar = C60537to.NO_LONGER_HANDLED;
        if (query.mo84452df()) {
            return C60537to.CORPUS_SWITCH;
        }
        if (query.mo84456dj()) {
            return C60537to.NEW_HOTWORD_QUERY;
        }
        return !query.mo84385cR() ? toVar : C60537to.NEW_SENTINEL_QUERY;
    }
}
