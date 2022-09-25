package com.google.android.apps.gsa.staticplugins.opa.samson.host;

import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.host.f */
/* compiled from: PG */
public final class C110168f {

    /* renamed from: c */
    private static final C59071e f306984c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.host.f");

    /* renamed from: a */
    public final Context f306985a;

    /* renamed from: b */
    final Set f306986b = new HashSet();

    public C110168f(Context context) {
        this.f306985a = context;
    }

    /* renamed from: a */
    public final synchronized void mo98443a() {
        for (C110177o c : (C110177o[]) this.f306986b.toArray(new C110177o[0])) {
            c.mo98453c();
        }
    }

    /* renamed from: b */
    public final void mo98444b(C110177o oVar) {
        try {
            if (!this.f306985a.bindService(new Intent().setPackage("com.google.android.googlequicksearchbox").setAction("com.google.android.apps.gsa.publicsearch.IPublicSearchService"), oVar, 1)) {
                oVar.mo98453c();
            } else {
                synchronized (this) {
                    this.f306986b.add(oVar);
                }
            }
            C58976aa aaVar = C58975e.f156826a;
        } catch (Throwable th) {
            C59104x d = f306984c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AmbBndrSnClnt");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(25725)).mo56386p("Failure when trying to bind");
        }
    }

    /* renamed from: c */
    public final synchronized void mo98445c(C110177o oVar) {
        this.f306986b.remove(oVar);
    }
}
