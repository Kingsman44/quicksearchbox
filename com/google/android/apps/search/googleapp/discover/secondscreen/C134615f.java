package com.google.android.apps.search.googleapp.discover.secondscreen;

import android.support.p031v4.app.C0154a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.nav.C47490a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57060ab;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.secondscreen.f */
/* compiled from: PG */
public final class C134615f implements C45987ay {

    /* renamed from: c */
    private static final C59071e f366582c = C59071e.m91331h();

    /* renamed from: a */
    public final SecondScreenActivity f366583a;

    /* renamed from: b */
    public final C134614e f366584b;

    /* renamed from: d */
    private final C45989b f366585d;

    /* renamed from: e */
    private final C32158h f366586e;

    /* renamed from: f */
    private final C28310af f366587f;

    public C134615f(SecondScreenActivity secondScreenActivity, C45989b bVar, C32158h hVar, C28310af afVar, C47490a aVar) {
        C69664n.m101061g(bVar, "accountController");
        C69664n.m101061g(hVar, "accountHandler");
        C69664n.m101061g(afVar, "visualElements");
        this.f366583a = secondScreenActivity;
        this.f366585d = bVar;
        this.f366586e = hVar;
        this.f366587f = afVar;
        C134614e eVar = (C134614e) aVar.mo51343a(C134614e.f366576d);
        this.f366584b = eVar;
        if (eVar != null) {
            if (eVar.f366580c) {
                secondScreenActivity.mo1322k().mo1191s(2);
            } else {
                secondScreenActivity.mo1322k().mo1191s(1);
            }
        }
        hVar.mo37971b(secondScreenActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C59071e eVar = f366582c;
        C59052c cVar = (C59052c) eVar.mo56224b();
        cVar.mo56379ah(new C59094n(40408));
        cVar.mo56389s("onAccountChanged %s", awVar);
        AccountId accountId = awVar.f120815a.f120816a;
        C69664n.m101060f(accountId, "accountContext.accountId");
        C28313c a = this.f366587f.f76997b.mo33800a(C28427h.m53115a(114074));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C28375ak.m53061c(114085));
        a.mo33859g(C45954d.m82060a(accountId));
        a.mo33810c(this.f366583a);
        C134614e eVar2 = this.f366584b;
        C69788q qVar = null;
        if (eVar2 != null) {
            if ((eVar2.f366578a & 1) != 0) {
                C0154a aVar = new C0154a(this.f366583a.f727a.f739a.f744e);
                AccountId accountId2 = awVar.f120815a.f120816a;
                C134620k kVar = (C134620k) C134621l.f366592c.createBuilder();
                C57060ab abVar = eVar2.f366579b;
                if (abVar == null) {
                    abVar = C57060ab.f152318h;
                }
                kVar.copyOnWrite();
                C134621l lVar = (C134621l) kVar.instance;
                abVar.getClass();
                lVar.f366595b = abVar;
                lVar.f366594a |= 1;
                C134619j jVar = new C134619j();
                C68324h.m98669f(jVar);
                C47247a.m84047b(jVar, accountId2);
                C47243l.m84039a(jVar, (C134621l) kVar.build());
                aVar.mo689v(R.id.googleapp_second_screen_content, jVar, (String) null);
                aVar.mo509f();
            }
            qVar = C69788q.f186170a;
        }
        if (qVar == null) {
            C59052c cVar2 = (C59052c) eVar.mo56226d();
            cVar2.mo56379ah(new C59094n(40409));
            cVar2.mo56386p("No openData included for secondscreen");
            this.f366583a.finish();
        }
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C69664n.m101061g(th, "reason");
        C59052c cVar = (C59052c) ((C59052c) f366582c.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(40410));
        cVar.mo56386p("Account exception.");
        this.f366583a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
