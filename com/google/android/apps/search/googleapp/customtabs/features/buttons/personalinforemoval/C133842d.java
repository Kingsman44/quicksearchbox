package com.google.android.apps.search.googleapp.customtabs.features.buttons.personalinforemoval;

import android.content.Intent;
import android.net.Uri;
import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.apps.search.googleapp.silkpane.p10485a.C139272a;
import com.google.android.apps.search.googleapp.silkpane.p10486b.C139279a;
import com.google.android.apps.search.googleapp.silkpane.p10486b.C139280b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.personalinforemoval.d */
/* compiled from: PG */
public final class C133842d implements C45987ay {

    /* renamed from: b */
    private static final C59071e f364556b = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.features.buttons.personalinforemoval.d");

    /* renamed from: a */
    public final PersonalInfoRemovalActivity f364557a;

    public C133842d(PersonalInfoRemovalActivity personalInfoRemovalActivity, C45989b bVar, C133155c cVar) {
        this.f364557a = personalInfoRemovalActivity;
        cVar.mo110998a(personalInfoRemovalActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        Uri uri;
        AccountId accountId = awVar.f120815a.f120816a;
        C133847i iVar = new C133847i();
        C68324h.m98669f(iVar);
        C47247a.m84047b(iVar, accountId);
        C0154a aVar = new C0154a(this.f364557a.f727a.f739a.f744e);
        aVar.mo689v(16908290, iVar, "INFO_REMOVAL_FRAGMENT");
        aVar.mo509f();
        Intent intent = this.f364557a.getIntent();
        if (intent == null) {
            uri = null;
        } else {
            uri = intent.getData();
        }
        if (uri == null) {
            this.f364557a.finish();
            return;
        }
        C133848j a = iVar.mo17754z();
        C139272a aVar2 = a.f364565b;
        C139279a aVar3 = (C139279a) C139280b.f378830g.createBuilder();
        String uri2 = a.f364568e.mo113405k().appendPath("remove-results-about-you").appendQueryParameter("url", uri.toString()).build().toString();
        aVar3.copyOnWrite();
        C139280b bVar = (C139280b) aVar3.instance;
        uri2.getClass();
        bVar.f378832a |= 1;
        bVar.f378833b = uri2;
        aVar3.copyOnWrite();
        C139280b bVar2 = (C139280b) aVar3.instance;
        bVar2.f378832a |= 2;
        bVar2.f378834c = true;
        C47709i.m84861a(a.f364564a, aVar2.mo114864a((C139280b) aVar3.build(), a.f364566c));
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f364556b.mo56226d()).mo56382g(th)).mo56372aa(40145)).mo56386p("#onAccountError");
        this.f364557a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
