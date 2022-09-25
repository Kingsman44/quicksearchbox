package com.google.android.apps.gsa.staticplugins.bisto.p7516r;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.r.d */
/* compiled from: PG */
public final class C95853d {

    /* renamed from: a */
    public final C95852c f268411a;

    /* renamed from: b */
    private final C95857h f268412b;

    public C95853d(C95852c cVar, C95857h hVar) {
        this.f268411a = cVar;
        this.f268412b = hVar;
    }

    /* renamed from: a */
    public final void mo89823a(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("start_activity_intent", intent);
        this.f268412b.mo89824a(amo.BISTO_START_ACTIVITY, C87739bu.BISTO_START_ACTIVITY_REQUEST, bundle);
    }
}
