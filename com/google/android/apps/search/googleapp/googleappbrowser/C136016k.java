package com.google.android.apps.search.googleapp.googleappbrowser;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10287d.C135741d;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10287d.C135751l;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139789b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.k */
/* compiled from: PG */
public final class C136016k implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C136018m f370423a;

    public C136016k(C136018m mVar) {
        this.f370423a = mVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C136018m.f370425a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(40579));
        cVar.mo56386p("Failed to load first run data");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f370423a.mo112688l();
            return;
        }
        C136018m mVar = this.f370423a;
        if (!mVar.f370431g.isPresent()) {
            throw new IllegalStateException("Check failed.");
        } else if (mVar.f370427c.getChildFragmentManager().f634a.mo671c("first_run_v2_fragment") == null) {
            C0154a aVar = new C0154a(mVar.f370427c.getChildFragmentManager());
            C135751l lVar = (C135751l) mVar.f370431g.get();
            C139789b bVar = mVar.f370426b.f369066f;
            if (bVar == null) {
                bVar = C139789b.f379928d;
            }
            AccountId accountId = lVar.f369764a;
            C69664n.m101060f(bVar, "urlHandlerLoggingData");
            C69664n.m101061g(accountId, "accountId");
            C69664n.m101061g(bVar, "urlHandlerLoggingData");
            C135741d dVar = new C135741d();
            C68324h.m98669f(dVar);
            C47247a.m84047b(dVar, accountId);
            C47243l.m84039a(dVar, bVar);
            aVar.mo511h(R.id.googleapp_browser_root, dVar, "first_run_v2_fragment", 1);
            aVar.mo509f();
        }
    }
}
