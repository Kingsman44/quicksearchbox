package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8198b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.gsa.publicsearch.C84203c;
import com.google.android.apps.gsa.publicsearch.C84205e;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8197a.C106223a;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8197a.C106225c;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.b.i */
/* compiled from: PG */
public final /* synthetic */ class C106249i implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C106252l f296452a;

    /* renamed from: b */
    public final /* synthetic */ IBinder f296453b;

    public /* synthetic */ C106249i(C106252l lVar, IBinder iBinder) {
        this.f296452a = lVar;
        this.f296453b = iBinder;
    }

    public final void run() {
        C84205e eVar;
        C106225c cVar;
        C106252l lVar = this.f296452a;
        IBinder iBinder = this.f296453b;
        C59104x b = C106261u.f296468a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NgaEntryPointEventSendr");
        ((C59052c) ((C59052c) b).mo56372aa(25177)).mo56386p("onServiceConnected");
        C106255o oVar = lVar.f296456a;
        if (iBinder == null) {
            eVar = null;
        } else {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
                eVar = queryLocalInterface instanceof C84205e ? (C84205e) queryLocalInterface : new C84203c(iBinder);
            } catch (Throwable th) {
                C59104x c = C106261u.f296468a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "NgaEntryPointEventSendr");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(25184)).mo56386p("Couldn't begin binder session");
                oVar.mo95473c("Couldn't begin binder session");
                return;
            }
        }
        IBinder e = eVar.mo77677e("nga_entry_point", new C106254n(oVar), (Bundle) null);
        if (e == null) {
            oVar.mo95473c("onServiceConnected - binder is null");
            return;
        }
        IInterface queryLocalInterface2 = e.queryLocalInterface("com.google.android.apps.gsa.staticplugins.opa.nga.ngaentrypoint.aidl.INgaEntryPointBinderSession");
        if (queryLocalInterface2 instanceof C106225c) {
            cVar = (C106225c) queryLocalInterface2;
        } else {
            cVar = new C106223a(e);
        }
        if (cVar == null) {
            oVar.mo95473c("onServiceConnected - binder session is null");
            return;
        }
        oVar.f296459a.mo57356n(cVar);
        C106261u uVar = oVar.f296461c;
        uVar.mo95477b(new C106259s(uVar, oVar.f296460b, cVar));
    }
}
