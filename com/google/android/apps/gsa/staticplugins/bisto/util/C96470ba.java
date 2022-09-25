package com.google.android.apps.gsa.staticplugins.bisto.util;

import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.ba */
/* compiled from: PG */
public final class C96470ba {

    /* renamed from: a */
    private final C89656k f269892a;

    /* renamed from: b */
    private final C84516aa f269893b;

    public C96470ba(C89656k kVar, C84516aa aaVar) {
        this.f269892a = kVar;
        this.f269893b = aaVar;
    }

    /* renamed from: a */
    public final int mo90164a(boolean z) {
        boolean h = this.f269892a.mo83553h("key_personal_results_enabled");
        boolean h2 = this.f269892a.mo83553h("key_personal_results_headphones_enabled");
        if (!h) {
            return 1;
        }
        boolean isDeviceLocked = this.f269893b.f230023b.isDeviceLocked();
        C58976aa aaVar = C58975e.f156826a;
        if (!isDeviceLocked || h2) {
            return (!this.f269893b.f230023b.isDeviceLocked() || !z) ? 0 : 3;
        }
        return 2;
    }
}
