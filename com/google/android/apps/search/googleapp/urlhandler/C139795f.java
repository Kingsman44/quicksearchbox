package com.google.android.apps.search.googleapp.urlhandler;

import android.net.Uri;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.urlhandler.internal.C139805g;
import com.google.android.apps.search.googleapp.urlhandler.internal.C139808i;
import com.google.android.apps.search.googleapp.urlhandler.p10528a.C139781a;
import com.google.android.apps.search.googleapp.urlhandler.p10528a.C139782b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.f */
/* compiled from: PG */
public final class C139795f {

    /* renamed from: a */
    private final Fragment f379945a;

    /* renamed from: b */
    private final AccountId f379946b;

    public C139795f(Fragment fragment, AccountId accountId) {
        this.f379945a = fragment;
        this.f379946b = accountId;
    }

    /* renamed from: c */
    private final C139826m m227270c() {
        C139826m mVar = (C139826m) this.f379945a.getChildFragmentManager().f634a.mo671c("url_handler_fragment");
        if (mVar != null) {
            return mVar;
        }
        AccountId accountId = this.f379946b;
        C139826m mVar2 = new C139826m();
        C68324h.m98669f(mVar2);
        C47247a.m84047b(mVar2, accountId);
        C0154a aVar = new C0154a(this.f379945a.getChildFragmentManager());
        aVar.mo685r(mVar2, "url_handler_fragment");
        aVar.mo509f();
        return mVar2;
    }

    /* renamed from: d */
    private final void m227271d() {
        boolean z = false;
        if (this.f379945a.isAdded() && !this.f379945a.isStateSaved()) {
            z = true;
        }
        C58838bb.m90884s(z, "UrlHandler can only be used while the fragment is attached and state is not saved");
    }

    /* renamed from: a */
    public final void mo115250a(Uri uri, C139823j jVar) {
        C19559g.m37304c();
        m227271d();
        m227270c().mo17754z().f379943a.mo115294c(uri, jVar);
    }

    /* renamed from: b */
    public final void mo115251b(C60870cx cxVar, C139823j jVar) {
        C19559g.m37304c();
        m227271d();
        C139824k kVar = m227270c().mo17754z().f379943a;
        C19559g.m37304c();
        kVar.mo115293b();
        kVar.mo115292a();
        kVar.mo115296e(jVar);
        C139808i iVar = kVar.f380080a;
        C139805g gVar = kVar.f380081b;
        iVar.f379995b.mo115285c(jVar);
        iVar.f379996c.mo115307d();
        C139782b bVar = iVar.f379997d;
        C139781a aVar = new C139781a(bVar);
        C60856cj.m92911t(cxVar, C47810es.m84974n(aVar), bVar.f379910b);
        C60870cx b = iVar.f379998e.mo115235b(cxVar);
        iVar.f379994a.mo50445g(new C46438d(iVar.f380000g.mo115288b(b, iVar.f379999f.mo115286a(b, jVar, iVar.mo115284b(), iVar.f380001h, iVar.mo115283a()))), C46436b.m82808a(jVar), gVar.f379983j);
    }
}
