package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.personalresults;

import android.support.p031v4.app.C0154a;
import androidx.activity.result.C0816c;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.personalresults.p9417a.C124986b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.personalresults.f */
/* compiled from: PG */
final class C125001f implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C125002g f344904a;

    /* renamed from: b */
    private final String f344905b;

    /* renamed from: c */
    private final C0816c f344906c;

    public C125001f(C125002g gVar, String str, C0816c cVar) {
        this.f344904a = gVar;
        this.f344905b = str;
        this.f344906c = cVar;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        this.f344904a.f344908b.setContentView((int) R.layout.assistant_pr_enrollment_activity);
        AccountId accountId = awVar.f120815a.f120816a;
        String str = this.f344905b;
        C124986b bVar = new C124986b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84040b(bVar, str);
        C0154a aVar = new C0154a(this.f344904a.f344908b.f727a.f739a.f744e);
        aVar.mo511h(R.id.assistant_fragment_container, bVar, (String) null, 1);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C59104x c = C125002g.f344907a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PRNActivity");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(36402)).mo56386p("Account error");
        C125002g.m204932b(this.f344906c, 8);
        this.f344904a.f344908b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
