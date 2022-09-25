package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.apps.gsa.publicsearch.C84203c;
import com.google.android.apps.gsa.publicsearch.C84205e;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17844g;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17846i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.i */
/* compiled from: PG */
final class C107358i implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C107359j f298777a;

    public C107358i(C107359j jVar) {
        this.f298777a = jVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C84205e eVar;
        C17846i iVar;
        C58976aa aaVar = C58975e.f156826a;
        if (iBinder == null) {
            eVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
            eVar = queryLocalInterface instanceof C84205e ? (C84205e) queryLocalInterface : new C84203c(iBinder);
        }
        try {
            IBinder e = eVar.mo77677e("opa_app_integration", (IBinder) null, (Bundle) null);
            if (e == null) {
                C59104x d = C107359j.f298778a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
                ((C59052c) ((C59052c) d).mo56372aa(23726)).mo56386p("binder is null");
                this.f298777a.f298784g.clear();
                C107359j jVar = this.f298777a;
                if (jVar.f298790m != null) {
                    jVar.f298797t.getApplicationContext().unbindService(this.f298777a.f298790m);
                    this.f298777a.f298790m = null;
                    return;
                }
                C59104x d2 = C107359j.f298778a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
                ((C59052c) ((C59052c) d2).mo56372aa(23727)).mo56386p("connection must not be null");
                return;
            }
            IInterface queryLocalInterface2 = e.queryLocalInterface("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSession");
            if (queryLocalInterface2 instanceof C17846i) {
                iVar = (C17846i) queryLocalInterface2;
            } else {
                iVar = new C17844g(e);
            }
            for (byte[] a : this.f298777a.f298784g) {
                iVar.mo23480a(a);
            }
            this.f298777a.f298784g.clear();
            C107359j jVar2 = this.f298777a;
            if (jVar2.f298790m != null) {
                jVar2.f298797t.getApplicationContext().unbindService(this.f298777a.f298790m);
                this.f298777a.f298790m = null;
                return;
            }
            C59104x d3 = C107359j.f298778a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
            ((C59052c) ((C59052c) d3).mo56372aa(23722)).mo56386p("connection must not be null");
        } catch (RemoteException e2) {
            C59104x d4 = C107359j.f298778a.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
            ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(e2)).mo56372aa(23723)).mo56386p("Failed to get a binder");
            this.f298777a.f298784g.clear();
            C107359j jVar3 = this.f298777a;
            if (jVar3.f298790m != null) {
                jVar3.f298797t.getApplicationContext().unbindService(this.f298777a.f298790m);
                this.f298777a.f298790m = null;
                return;
            }
            C59104x d5 = C107359j.f298778a.mo56226d();
            d5.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
            ((C59052c) ((C59052c) d5).mo56372aa(23724)).mo56386p("connection must not be null");
        } catch (Throwable th) {
            this.f298777a.f298784g.clear();
            C107359j jVar4 = this.f298777a;
            if (jVar4.f298790m != null) {
                jVar4.f298797t.getApplicationContext().unbindService(this.f298777a.f298790m);
                this.f298777a.f298790m = null;
            } else {
                C59104x d6 = C107359j.f298778a.mo56226d();
                d6.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
                ((C59052c) ((C59052c) d6).mo56372aa(23725)).mo56386p("connection must not be null");
            }
            throw th;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C59104x d = C107359j.f298778a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
        ((C59052c) ((C59052c) d).mo56372aa(23728)).mo56386p("onServiceDisconnected");
        this.f298777a.f298784g.clear();
        this.f298777a.f298790m = null;
    }
}
