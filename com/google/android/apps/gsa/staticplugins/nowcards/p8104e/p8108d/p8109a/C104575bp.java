package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.android.apps.gsa.sidekick.main.p7205h.C91419e;
import com.google.android.libraries.gsa.monet.service.C23056g;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.bp */
/* compiled from: PG */
final class C104575bp implements C91419e {

    /* renamed from: a */
    final /* synthetic */ C104576bq f291019a;

    public C104575bp(C104576bq bqVar) {
        this.f291019a = bqVar;
    }

    /* renamed from: c */
    public final void mo85766c(C23056g gVar) {
        if (this.f291019a.f291027h.containsKey(gVar)) {
            C104576bq bqVar = this.f291019a;
            bqVar.f291025f.mo85738b(bqVar, ((Long) bqVar.f291027h.get(gVar)).longValue());
            this.f291019a.f291027h.remove(gVar);
        }
    }

    /* renamed from: d */
    public final void mo85767d(C23056g gVar) {
        this.f291019a.f291025f.mo85737a();
    }
}
