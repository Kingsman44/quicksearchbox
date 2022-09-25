package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7184t.C91095e;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bl */
/* compiled from: PG */
final class C115008bl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C91097g f319208a;

    /* renamed from: b */
    final /* synthetic */ Intent f319209b;

    public C115008bl(C91097g gVar, Intent intent) {
        this.f319208a = gVar;
        this.f319209b = intent;
    }

    public final void run() {
        this.f319208a.mo65090b(this.f319209b, new C91095e());
    }
}
