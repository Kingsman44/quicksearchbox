package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8198b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.b.l */
/* compiled from: PG */
final class C106252l implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C106255o f296456a;

    public C106252l(C106255o oVar) {
        this.f296456a = oVar;
    }

    public final void onBindingDied(ComponentName componentName) {
        C59071e eVar = C106261u.f296468a;
        C58976aa aaVar = C58975e.f156826a;
        this.f296456a.f296461c.f296472e.mo28212l("onBindingDied", new C106248h(this));
    }

    public final void onNullBinding(ComponentName componentName) {
        C59071e eVar = C106261u.f296468a;
        C58976aa aaVar = C58975e.f156826a;
        this.f296456a.f296461c.f296472e.mo28212l("onNullBinding", new C106251k(this));
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f296456a.f296461c.f296472e.mo28212l("onServiceConnected", new C106249i(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C59071e eVar = C106261u.f296468a;
        C58976aa aaVar = C58975e.f156826a;
        this.f296456a.f296461c.f296472e.mo28212l("onServiceDisconnected", new C106250j(this));
    }
}
