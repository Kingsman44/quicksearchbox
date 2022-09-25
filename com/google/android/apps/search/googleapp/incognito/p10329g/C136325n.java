package com.google.android.apps.search.googleapp.incognito.p10329g;

import com.google.android.apps.search.googleapp.incognito.p10329g.p10330a.C136292h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.n */
/* compiled from: PG */
final class C136325n implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C136320j f371183a;

    public C136325n(C136320j jVar) {
        this.f371183a = jVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C136292h hVar = (C136292h) bVar;
        C136320j jVar = this.f371183a;
        AccountId accountId = jVar.f371173d;
        C136294ab abVar = new C136294ab();
        C68324h.m98669f(abVar);
        C47247a.m84047b(abVar, accountId);
        abVar.showNow(jVar.f371172c.getChildFragmentManager(), "incognito_setup_device_biometrics_dialog");
        return C47392e.f123115a;
    }
}
