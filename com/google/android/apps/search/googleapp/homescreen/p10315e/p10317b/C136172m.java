package com.google.android.apps.search.googleapp.homescreen.p10315e.p10317b;

import android.accounts.Account;
import com.google.android.gms.awareness.C142929d;
import com.google.android.libraries.search.location.C38694al;
import com.google.android.libraries.search.location.C38695am;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.e.b.m */
/* compiled from: PG */
public final /* synthetic */ class C136172m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C136173n f370845a;

    public /* synthetic */ C136172m(C136173n nVar) {
        this.f370845a = nVar;
    }

    public final C60870cx apply(Object obj) {
        C136173n nVar = this.f370845a;
        C63042fg fgVar = ((C136166g) obj).f370837c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        long j = fgVar.f170154a;
        if (j != 0 && !nVar.mo112815d(Duration.ofSeconds(j))) {
            return C60866ct.f164955a;
        }
        C38695am amVar = nVar.f370850e;
        C142929d a = C142929d.m231886a(nVar.f370846a.getPackageName(), (Account) null);
        C47633f i = C47633f.m84733g(amVar.f102174b.mo41547a()).mo51516i(new C38694al(amVar, C39226b.TAG_GOOGLE_APP_HOMESCREEN, a), C60826bg.f164896a);
        C136167h hVar = C136167h.f370840a;
        return C47633f.m84733g(C60922j.m93044g(i, C47810es.m84963c(hVar), nVar.f370849d)).mo51515h(new C136171l(nVar), nVar.f370849d).mo51516i(new C136169j(nVar), nVar.f370848c);
    }
}
