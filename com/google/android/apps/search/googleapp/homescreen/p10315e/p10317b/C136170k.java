package com.google.android.apps.search.googleapp.homescreen.p10315e.p10317b;

import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.e.b.k */
/* compiled from: PG */
public final /* synthetic */ class C136170k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C136173n f370843a;

    public /* synthetic */ C136170k(C136173n nVar) {
        this.f370843a = nVar;
    }

    public final Object apply(Object obj) {
        C136173n nVar = this.f370843a;
        C136166g gVar = (C136166g) obj;
        if (C136166g.f370833f.equals(gVar)) {
            return C46688af.f121976a;
        }
        int i = gVar.f370835a;
        if ((i & 2) == 0 || (i & 4) == 0) {
            return C46688af.f121976a;
        }
        C63042fg fgVar = gVar.f370837c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        Duration ofSeconds = Duration.ofSeconds(fgVar.f170154a);
        if (nVar.mo112815d(ofSeconds)) {
            return C46688af.m83206c(gVar);
        }
        return C46688af.m83205b(gVar, ofSeconds.toMillis());
    }
}
