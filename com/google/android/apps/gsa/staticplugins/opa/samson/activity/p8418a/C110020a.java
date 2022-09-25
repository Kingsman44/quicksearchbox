package com.google.android.apps.gsa.staticplugins.opa.samson.activity.p8418a;

import android.os.Bundle;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.p6931i.C87573b;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.activity.a.a */
/* compiled from: PG */
public final class C110020a implements C118549h {

    /* renamed from: a */
    private static final C59071e f306562a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.activity.a.a");

    /* renamed from: b */
    private final C68214a f306563b;

    /* renamed from: c */
    private final C21370a f306564c;

    /* renamed from: d */
    private final C86338r f306565d;

    public C110020a(C68214a aVar, C21370a aVar2, C86338r rVar) {
        this.f306563b = aVar;
        this.f306564c = aVar2;
        this.f306565d = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C59104x b = f306562a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ROpaAmbActBT");
        ((C59052c) ((C59052c) b).mo56372aa(25591)).mo56386p("Task running");
        C86337q b2 = this.f306565d.mo80076b();
        b2.mo80072g("com.google.android.apps.gsa.staticplugins.opa.samson.idle.last_successful_idle", this.f306564c.mo26870b());
        b2.apply();
        Bundle bundle = new Bundle();
        bundle.putBoolean("launch_ambient_mode_from_assist", true);
        ((C87573b) this.f306563b.mo27525b()).mo81706d(bundle);
        return C118826c.f331423b;
    }
}
