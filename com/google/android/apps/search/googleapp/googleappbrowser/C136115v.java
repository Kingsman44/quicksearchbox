package com.google.android.apps.search.googleapp.googleappbrowser;

import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10283i.C135708b;
import com.google.android.apps.search.googleapp.p10527u.C139760a;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139769j;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.tabs.manager.C139741h;
import com.google.android.apps.search.googleapp.tabs.manager.C139744k;
import com.google.android.apps.search.googleapp.tabs.p10523a.C139709a;
import com.google.android.apps.search.googleapp.tabs.p10523a.C139711c;
import com.google.android.apps.search.googleapp.tabs.p10523a.C139712d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.base.C58838bb;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.v */
/* compiled from: PG */
final class C136115v implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C136109q f370714a;

    public C136115v(C136109q qVar) {
        this.f370714a = qVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C135708b bVar2 = (C135708b) bVar;
        C136109q qVar = this.f370714a;
        C58838bb.m90884s(qVar.f370694l.isPresent(), "Feature 'TabsManager' is not included in the build");
        C58838bb.m90884s(qVar.f370701s.mo110979b(), "Feature 'TabsManager' cannot be opened if Tabs is not enabled");
        if (!qVar.f370700r.mo112949a() || !qVar.f370686d.f369069i) {
            C139744k kVar = (C139744k) qVar.f370694l.get();
            AccountId accountId = kVar.f379844b;
            C139741h hVar = new C139741h();
            C68324h.m98669f(hVar);
            C47247a.m84047b(hVar, accountId);
            hVar.showNow(kVar.f379843a.getChildFragmentManager(), "googleappbrowser_tabs_sheet");
            return C47392e.f123115a;
        }
        C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
        C139779t tVar = C139779t.TABS;
        fVar.copyOnWrite();
        C139767h hVar2 = (C139767h) fVar.instance;
        hVar2.f379872b = tVar.f379907i;
        hVar2.f379871a |= 1;
        fVar.copyOnWrite();
        C139767h hVar3 = (C139767h) fVar.instance;
        hVar3.f379871a |= 2;
        hVar3.f379873c = true;
        C139769j jVar = (C139769j) C139770k.f379882c.createBuilder();
        C139709a aVar = (C139709a) C139712d.f379748d.createBuilder();
        C139711c cVar = C139711c.GOOGLE_APP_BROWSER;
        aVar.copyOnWrite();
        C139712d dVar = (C139712d) aVar.instance;
        dVar.f379751b = cVar.f379747d;
        dVar.f379750a = 1 | dVar.f379750a;
        String str = qVar.f370704v.mo46384b().f112969h;
        str.getClass();
        aVar.copyOnWrite();
        C139712d dVar2 = (C139712d) aVar.instance;
        dVar2.f379750a |= 2;
        dVar2.f379752c = str;
        jVar.copyOnWrite();
        C139770k kVar2 = (C139770k) jVar.instance;
        C139712d dVar3 = (C139712d) aVar.build();
        dVar3.getClass();
        kVar2.f379885b = dVar3;
        kVar2.f379884a = 5;
        fVar.copyOnWrite();
        C139767h hVar4 = (C139767h) fVar.instance;
        C139770k kVar3 = (C139770k) jVar.build();
        kVar3.getClass();
        hVar4.f379877g = kVar3;
        hVar4.f379871a |= 16;
        return C47392e.m84229a(new C139760a((C139767h) fVar.build()));
    }
}
