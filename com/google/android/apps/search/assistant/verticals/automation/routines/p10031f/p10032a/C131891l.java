package com.google.android.apps.search.assistant.verticals.automation.routines.p10031f.p10032a;

import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131874q;
import com.google.android.libraries.search.location.p3029a.p3031b.C38608a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.f.a.l */
/* compiled from: PG */
final class C131891l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f360158a;

    public C131891l(C70862aj ajVar) {
        this.f360158a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C131893n.f360160a.mo56225c()).mo56382g(th)).mo56372aa(39472)).mo56386p("Geofence update failed");
        if ((th instanceof C38608a) || (th instanceof SecurityException)) {
            this.f360158a.mo20122b(new C70761fa(Status.f186909g.mo61678e(th), (C70334de) null, true));
        } else if (th instanceof IllegalArgumentException) {
            this.f360158a.mo20122b(new C70761fa(Status.f186906d.mo61678e(th), (C70334de) null, true));
        } else {
            this.f360158a.mo20122b(new C70761fa(Status.f186915m.mo61678e(th), (C70334de) null, true));
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f360158a.mo20123c((C131874q) obj);
        this.f360158a.mo20121a();
    }
}
