package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68121n;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68122o;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68129v;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.aj */
/* compiled from: PG */
final class C115213aj implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ String f319738a;

    /* renamed from: b */
    final /* synthetic */ C68121n f319739b;

    /* renamed from: c */
    final /* synthetic */ C115214ak f319740c;

    public C115213aj(C115214ak akVar, String str, C68121n nVar) {
        this.f319740c = akVar;
        this.f319738a = str;
        this.f319739b = nVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f319740c.f319742b.mo83702b(C89849ae.SPEAKR_READ_STATE_UPDATE_SUCCEEDED);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C59104x c = C115214ak.f319741a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SpeakrReadSU");
        C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(29782);
        String str = this.f319738a;
        C68122o a = C68122o.m98452a(this.f319739b.f184375b);
        if (a == null) {
            a = C68122o.UNRECOGNIZED;
        }
        cVar.mo56354G("Could not update read state for: %s to %s.", str, a);
        this.f319740c.f319742b.mo83702b(C89849ae.SPEAKR_READ_STATE_UPDATE_FAILED);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C68129v vVar = (C68129v) obj;
    }
}
