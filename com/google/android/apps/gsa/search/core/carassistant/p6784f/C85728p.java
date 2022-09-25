package com.google.android.apps.gsa.search.core.carassistant.p6784f;

import com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.f.p */
/* compiled from: PG */
public final class C85728p {

    /* renamed from: a */
    private final C85710c f231797a;

    /* renamed from: b */
    private final C86124t f231798b;

    public C85728p(C85710c cVar, C86124t tVar) {
        this.f231797a = cVar;
        this.f231798b = tVar;
    }

    /* renamed from: a */
    public final boolean mo79377a() {
        if (this.f231798b.mo79746e(C90086ek.f250458dX)) {
            return true;
        }
        Locale b = this.f231797a.mo79344b();
        if (b == null) {
            return false;
        }
        String locale = b.toString();
        StringTokenizer stringTokenizer = new StringTokenizer(this.f231798b.mo79758x(C90086ek.f250459dY), ",");
        while (stringTokenizer.hasMoreTokens()) {
            if (stringTokenizer.nextToken().equals(locale)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo79378b() {
        return this.f231798b.mo79746e(C90086ek.f250460dZ) && mo79377a();
    }
}
