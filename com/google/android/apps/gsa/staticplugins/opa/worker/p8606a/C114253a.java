package com.google.android.apps.gsa.staticplugins.opa.worker.p8606a;

import android.content.Intent;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6612bq.C85008a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.C110111i;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.a.a */
/* compiled from: PG */
public final class C114253a extends C86734a implements C85008a {

    /* renamed from: a */
    private final C110111i f316811a;

    public C114253a(C110111i iVar) {
        super(C118575h.WORKER_OPA_AMBIENT, "opaamb");
        this.f316811a = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo78650a(Intent intent) {
        return this.f316811a.mo98384a(intent);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
