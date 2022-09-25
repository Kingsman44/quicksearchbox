package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.binaries.satin.app.adn;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6610c.C84998a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.s */
/* compiled from: PG */
public final class C106367s extends C86734a implements C84998a {

    /* renamed from: a */
    private final C106366r f296714a;

    public C106367s(C106366r rVar) {
        super(C118575h.WORKER_OPA_ON_DEVICE_ASR, "opaondeviceasr");
        this.f296714a = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo78649a(C58833ax axVar, C89061q qVar, C89356b bVar, Query query) {
        C106366r rVar = this.f296714a;
        axVar.getClass();
        bVar.getClass();
        query.getClass();
        adn adn = (adn) rVar.f296713a.mo17428b();
        adn.getClass();
        return C60856cj.m92900i(new C106365q(axVar, qVar, bVar, query, adn));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
