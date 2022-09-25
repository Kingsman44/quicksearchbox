package com.google.android.apps.search.faceviewer;

import android.support.p031v4.app.C0154a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.faceviewer.e */
/* compiled from: PG */
final class C132681e implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C132682f f362063a;

    public C132681e(C132682f fVar) {
        this.f362063a = fVar;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        AccountId accountId = awVar.f120815a.f120816a;
        C132686j jVar = new C132686j();
        C68324h.m98669f(jVar);
        C47247a.m84047b(jVar, accountId);
        C43264o a = C43265p.m76349a(awVar.f120815a.f120816a, this.f362063a.f362066c);
        C0154a aVar = new C0154a(this.f362063a.f362065b.f727a.f739a.f744e);
        aVar.mo689v(R.id.faceviewer_fragment_container, a, "WebCoordinatorFragment");
        aVar.mo509f();
        a.mo17754z().mo46380b(jVar);
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f362063a.f362065b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
