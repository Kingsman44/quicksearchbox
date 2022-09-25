package com.google.android.apps.gsa.staticplugins.actions.p7361g;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.g.i */
/* compiled from: PG */
public final class C93395i {

    /* renamed from: a */
    private final C86124t f260482a;

    /* renamed from: b */
    private final C89994f f260483b;

    public C93395i(C86124t tVar, C89994f fVar) {
        this.f260482a = tVar;
        this.f260483b = fVar;
    }

    /* renamed from: a */
    public final boolean mo87657a(Query query) {
        String str;
        if (query == null) {
            return false;
        }
        if (query.mo84403cj()) {
            str = this.f260483b.mo83863Z();
        } else {
            str = this.f260483b.mo83885ae();
        }
        return this.f260482a.mo79745c(C90120fr.f250763C).contains(str);
    }
}
