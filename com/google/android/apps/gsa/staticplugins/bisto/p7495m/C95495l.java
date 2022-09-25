package com.google.android.apps.gsa.staticplugins.bisto.p7495m;

import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95857h;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.m.l */
/* compiled from: PG */
public final class C95495l {

    /* renamed from: a */
    private final C95857h f267230a;

    public C95495l(C95857h hVar) {
        this.f267230a = hVar;
    }

    /* renamed from: a */
    public final void mo89391a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_device_id", str);
        this.f267230a.mo89824a(amo.BISTO_WORK_REQUEST, C87739bu.BISTO_UPDATE_CUSTOMIZATION, bundle);
    }
}
