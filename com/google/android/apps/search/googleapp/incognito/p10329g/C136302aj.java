package com.google.android.apps.search.googleapp.incognito.p10329g;

import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60845bz;
import java.util.UUID;

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.aj */
/* compiled from: PG */
public final class C136302aj implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C136304al f371121a;

    public C136302aj(C136304al alVar) {
        this.f371121a = alVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C95883aa.m158984e(C136304al.f371122a.mo56226d(), "Failed to enqueue IncognitoTimeoutWorker.", 40710, C38505d.f101864b, 179082779, th);
        C46459k.m82829b(this.f371121a.f371125d.mo112854a(9), "Failed to finish Incognito session.", new Object[0]);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        UUID uuid = (UUID) obj;
    }
}
