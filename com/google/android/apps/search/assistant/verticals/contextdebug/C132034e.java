package com.google.android.apps.search.assistant.verticals.contextdebug;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.assistant.verticals.contextdebug.C132035f;
import com.google.android.apps.search.assistant.verticals.contextdebug.p10039b.C132030a;
import com.google.android.apps.search.assistant.verticals.contextdebug.p10039b.C132031b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.contextdebug.e */
/* compiled from: PG */
final class C132034e implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C132035f f360395a;

    public C132034e(C132035f fVar) {
        this.f360395a = fVar;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C132043m mVar;
        C43264o oVar = (C43264o) this.f360395a.f360397b.f727a.f739a.f744e.f634a.mo671c("ContextDebugWebCoordinator");
        if (oVar == null) {
            mVar = null;
        } else {
            mVar = (C132043m) oVar.mo17754z().mo46379a();
        }
        if (mVar == null) {
            AccountId accountId = awVar.f120815a.f120816a;
            C43259j go = ((C132035f.C132036a) C47245e.m84045a(this.f360395a.f360397b, C132035f.C132036a.class, accountId)).mo110390go();
            C132035f fVar = this.f360395a;
            Optional or = fVar.f360398c.mo110386a(accountId).mo43489or(new C132032c(fVar));
            or.ifPresent(new C132033d(go));
            C43264o a = C43265p.m76349a(accountId, go.mo46371a());
            C0154a aVar = new C0154a(this.f360395a.f360397b.f727a.f739a.f744e);
            aVar.mo689v(R.id.assistant_fragment_container, a, "ContextDebugWebCoordinator");
            aVar.mo509f();
            C132030a aVar2 = (C132030a) C132031b.f360388c.createBuilder();
            Objects.requireNonNull(aVar2);
            or.ifPresent(new C132048r(aVar2));
            C132043m mVar2 = new C132043m();
            C68324h.m98669f(mVar2);
            C47247a.m84047b(mVar2, accountId);
            C47243l.m84039a(mVar2, (C132031b) aVar2.build());
            a.mo17754z().mo46380b(mVar2);
        }
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f360395a.f360397b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
