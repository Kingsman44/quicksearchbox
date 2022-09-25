package com.google.android.hotword.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.shared.service.C88499t;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.hotword.service.c */
/* compiled from: PG */
final class C146585c extends C88499t {

    /* renamed from: a */
    private final C91093c f395938a;

    public C146585c(Context context) {
        this.f395938a = new C91093c(context);
    }

    /* renamed from: fO */
    public final void mo49088fO(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        intent.addFlags(268435456);
        this.f395938a.mo65089a(intent);
    }
}
