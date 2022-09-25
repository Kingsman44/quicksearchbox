package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a;

import android.os.RemoteException;
import com.google.android.apps.gsa.shared.monet.p7113e.C90321e;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.MinimizeUiUpdatesObserverParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.b.a.ab */
/* compiled from: PG */
final class C105719ab implements C90321e {

    /* renamed from: a */
    final /* synthetic */ C105721ad f294993a;

    public C105719ab(C105721ad adVar) {
        this.f294993a = adVar;
    }

    /* renamed from: a */
    public final void mo84002a() {
        C58833ax axVar = (C58833ax) ((C23249a) this.f294993a.f295001b.mo94994g()).mo28725a();
        if (axVar.mo56113h()) {
            try {
                ((MinimizeUiUpdatesObserverParcelable) axVar.mo56107c()).f295116a.mo94962a();
            } catch (RemoteException e) {
                C59104x d = C105721ad.f294995a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "StreamRenderer");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(22433)).mo56386p("Failed to notify controller start minimizing UI updates");
            }
        }
    }

    /* renamed from: b */
    public final void mo84003b() {
        C58833ax axVar = (C58833ax) ((C23249a) this.f294993a.f295001b.mo94994g()).mo28725a();
        if (axVar.mo56113h()) {
            try {
                ((MinimizeUiUpdatesObserverParcelable) axVar.mo56107c()).f295116a.mo94963b();
            } catch (RemoteException e) {
                C59104x d = C105721ad.f294995a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "StreamRenderer");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(22434)).mo56386p("Failed to notify controller stop minimizing UI updates");
            }
        }
    }
}
