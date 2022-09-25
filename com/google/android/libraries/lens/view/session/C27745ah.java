package com.google.android.libraries.lens.view.session;

import android.location.Location;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.view.session.ah */
/* compiled from: PG */
final class C27745ah implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C27747aj f75732a;

    public C27745ah(C27747aj ajVar) {
        this.f75732a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C27747aj.f75733a.mo56224b()).mo56382g(th)).mo56372aa(49943)).mo56386p("Unable to access user's last location.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            this.f75732a.f75740h = location;
        }
    }
}
