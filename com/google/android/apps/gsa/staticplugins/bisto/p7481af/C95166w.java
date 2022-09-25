package com.google.android.apps.gsa.staticplugins.bisto.p7481af;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.bisto.C89678q;
import com.google.android.apps.gsa.shared.bisto.C89681t;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.af.w */
/* compiled from: PG */
public final /* synthetic */ class C95166w implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95144aj f266265a;

    /* renamed from: b */
    public final /* synthetic */ Intent f266266b;

    public /* synthetic */ C95166w(C95144aj ajVar, Intent intent) {
        this.f266265a = ajVar;
        this.f266266b = intent;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95144aj ajVar = this.f266265a;
        Intent intent = this.f266266b;
        if (!C124636bb.OPA_ENABLED.equals(((C124548d) obj).mo106521s())) {
            SharedPreferences sharedPreferences = ajVar.f266198f;
            if (C89681t.m146048n(sharedPreferences)) {
                C89681t.m146040f((Set) Collection.EL.stream(C89681t.m146036b(sharedPreferences)).filter(C89678q.f242804a).collect(Collectors.toSet()), sharedPreferences);
            }
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C89681t.m146038d(ajVar.f266198f);
        ajVar.mo89070v(intent);
    }
}
