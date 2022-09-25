package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.p8474c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111058h;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.c.d */
/* compiled from: PG */
public final class C111034d implements C111058h {

    /* renamed from: a */
    private final C86124t f309232a;

    /* renamed from: b */
    private final List f309233b;

    public C111034d(C86124t tVar, List list) {
        this.f309232a = tVar;
        this.f309233b = list;
    }

    /* renamed from: b */
    public final boolean mo99033b(String str) {
        for (C90129h c : this.f309233b) {
            if (this.f309232a.mo79745c(c).contains(str)) {
                return true;
            }
        }
        return false;
    }
}
