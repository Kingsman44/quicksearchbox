package com.google.android.libraries.assistant.p1594s.p1595a.p1596a;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.assistant.p1594s.p1600d.p1601a.C19220d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.s.a.a.a */
/* compiled from: PG */
public final class C19128a {

    /* renamed from: a */
    public static final C59071e f53594a = C59071e.m91332i("com.google.android.libraries.assistant.s.a.a.a");

    /* renamed from: b */
    protected final Context f53595b;

    public C19128a(Context context) {
        this.f53595b = context;
    }

    /* renamed from: a */
    public final void mo24293a(C19220d dVar) {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent();
        intent.setClassName(this.f53595b, "com.google.android.apps.gsa.staticplugins.opa.appintegration.service.AppIntegrationService");
        intent.putExtra("com.google.android.apps.gsa.opa.EXTRA_CALLBACK_EVENT", dVar.toByteArray());
        this.f53595b.startService(intent);
    }
}
