package com.google.android.apps.gsa.staticplugins.opa.samson.host;

import android.content.IntentFilter;
import android.view.View;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.host.j */
/* compiled from: PG */
final class C110172j implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C110176n f306990a;

    public C110172j(C110176n nVar) {
        this.f306990a = nVar;
    }

    public final void onViewAttachedToWindow(View view) {
        C58976aa aaVar = C58975e.f156826a;
        this.f306990a.mo98452a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        C110176n nVar = this.f306990a;
        nVar.f306996b.registerReceiver(nVar.f307002h, intentFilter);
    }

    public final void onViewDetachedFromWindow(View view) {
        C58976aa aaVar = C58975e.f156826a;
        C110176n nVar = this.f306990a;
        nVar.f307005k.mo98443a();
        try {
            nVar.f306996b.unregisterReceiver(nVar.f307002h);
            nVar.f307004j = null;
        } catch (Throwable th) {
            C59104x d = C110176n.f306995a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AmbConViewCtrl");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(25731)).mo56386p("error thrown when unregistering receiver");
        }
        nVar.f306997c.removeCallbacksAndMessages((Object) null);
    }
}
