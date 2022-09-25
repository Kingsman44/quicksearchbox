package com.google.android.apps.gsa.opaonboarding.p6461c;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.gsa.opaonboarding.C83906bl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.opaonboarding.c.a */
/* compiled from: PG */
public final /* synthetic */ class C83910a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C69464a f228535a;

    /* renamed from: b */
    public final /* synthetic */ C83906bl f228536b;

    public /* synthetic */ C83910a(C69464a aVar, C83906bl blVar) {
        this.f228535a = aVar;
        this.f228536b = blVar;
    }

    public final void run() {
        C69464a aVar = this.f228535a;
        C83906bl blVar = this.f228536b;
        C58976aa aaVar = C58975e.f156826a;
        Activity activity = (Activity) aVar.mo17428b();
        if (activity != null) {
            Intent intent = new Intent(activity.getIntent());
            intent.addFlags(603979776);
            activity.startActivity(intent);
        }
        blVar.mo77312a();
    }
}
