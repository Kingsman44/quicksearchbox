package com.google.android.apps.gsa.staticplugins.accl.p7339i;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6491a.C84371q;
import com.google.android.apps.gsa.search.core.p6519al.p6520a.C84605a;
import com.google.android.apps.gsa.search.core.p6519al.p6757s.C85577a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.staticplugins.accl.p7331c.C92817z;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.i.a */
/* compiled from: PG */
public final class C92853a extends C86734a implements C84605a {

    /* renamed from: a */
    private final C92817z f259062a;

    /* renamed from: b */
    private final C58833ax f259063b;

    /* renamed from: c */
    private final C85577a f259064c;

    /* renamed from: f */
    private final C86124t f259065f;

    protected C92853a(C92817z zVar, C58833ax axVar, C86124t tVar, C85577a aVar) {
        super(C118575h.WORKER_ACCL, "accl");
        this.f259062a = zVar;
        this.f259063b = axVar;
        this.f259065f = tVar;
        this.f259064c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo78369a(C60870cx cxVar) {
        return this.f259062a.mo87467a(cxVar).mo87466a();
    }

    /* renamed from: b */
    public final C60870cx mo78370b(int i, C60870cx cxVar) {
        if (i == 6 || (this.f259065f.mo79746e(C90086ek.f250429cv) && i == 5)) {
            return this.f259064c.mo79082a(cxVar);
        }
        return C60856cj.m92900i(((C84371q) this.f259063b.mo56107c()).mo77930b(i));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
