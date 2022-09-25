package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.libraries.assistant.p1467d.p1471b.C17834t;
import com.google.android.libraries.assistant.p1467d.p1471b.C17835u;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17838a;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17840c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.e */
/* compiled from: PG */
final class C107335e implements ServiceConnection {

    /* renamed from: a */
    public int f298702a = 0;

    /* renamed from: b */
    final /* synthetic */ C107336f f298703b;

    public C107335e(C107336f fVar) {
        this.f298703b = fVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C17840c cVar;
        C58976aa aaVar = C58975e.f156826a;
        C107336f fVar = this.f298703b;
        if (iBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService");
            cVar = queryLocalInterface instanceof C17840c ? (C17840c) queryLocalInterface : new C17838a(iBinder);
        }
        fVar.f298708d = C58833ax.m90834k(cVar);
        this.f298702a = 3;
        this.f298703b.mo95916g();
        this.f298703b.f298709e.mo65274a();
        try {
            ((C17840c) this.f298703b.f298708d.mo56107c()).mo23478b(new Binder());
        } catch (RemoteException e) {
            C59104x d = C107336f.f298704a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AppIntegCallbackCntlr");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(23637)).mo56386p("#onServiceConnected(): failed to register death recipient.");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        int a;
        C58976aa aaVar = C58975e.f156826a;
        this.f298702a = 1;
        C107336f fVar = this.f298703b;
        fVar.f298708d = C58836b.f156633a;
        fVar.f298709e.mo65275b();
        if (!this.f298703b.f298712h.mo56113h() && this.f298703b.f298713i.mo56113h() && (a = C17834t.m35075a(((C17835u) this.f298703b.f298713i.mo56107c()).f51171b)) != 0 && a == 2) {
            C107336f fVar2 = this.f298703b;
            fVar2.f298712h = fVar2.f298713i;
            fVar2.f298713i = C58836b.f156633a;
        }
    }
}
