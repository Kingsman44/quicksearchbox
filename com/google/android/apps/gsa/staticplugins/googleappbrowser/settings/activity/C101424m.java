package com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity;

import android.support.p033v7.app.C0392m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity.p7966a.C101412b;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.contrib.p3356a.p3357a.C43381b;
import com.google.android.libraries.web.contrib.p3356a.p3357a.C43386g;
import com.google.android.libraries.web.profile.C44075j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60901do;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity.m */
/* compiled from: PG */
public final class C101424m {

    /* renamed from: a */
    public static final Duration f282975a = Duration.ofSeconds(1);

    /* renamed from: b */
    public static final Duration f282976b = Duration.ofMillis(500);

    /* renamed from: c */
    public static final C59071e f282977c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity.m");

    /* renamed from: d */
    public final C118561t f282978d;

    /* renamed from: e */
    public final C43386g f282979e;

    /* renamed from: f */
    public final C46439e f282980f;

    /* renamed from: g */
    public final C101417f f282981g;

    /* renamed from: h */
    public final C101412b f282982h;

    /* renamed from: i */
    public final C60888db f282983i;

    /* renamed from: j */
    public final C46440f f282984j = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x d = C101424m.f282977c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ClearFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(20128)).mo56386p("Failed to clear cookies and data");
            C101424m.m167724c(C101424m.this);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C118561t tVar = C101424m.this.f282978d;
            C118522by byVar = C118522by.REFRESH_SEARCH_COOKIES;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 16;
            agVar.f328826f = false;
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328821a |= 8;
            agVar2.f328825e = false;
            afVar.copyOnWrite();
            C118472ag agVar3 = (C118472ag) afVar.instance;
            agVar3.f328824d = 1;
            agVar3.f328821a |= 4;
            tVar.mo103751b(byVar, (C118472ag) afVar.build());
            C101424m mVar = C101424m.this;
            mVar.f282980f.mo50428h(C46438d.m82810b(mVar.f282983i.mo29164d(C60901do.f165001a, C101424m.f282975a.toMillis(), TimeUnit.MILLISECONDS)).f121541a, (Object) null, mVar.f282985k);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: k */
    public final C46440f f282985k = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x d = C101424m.f282977c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ClearFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(20129)).mo56386p("Failed to schedule clearDoneView");
            C101424m.m167724c(C101424m.this);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C101424m mVar = C101424m.this;
            C46439e eVar = mVar.f282980f;
            C46438d b = C46438d.m82810b(mVar.f282983i.mo29164d(C60901do.f165001a, C101424m.f282976b.toMillis(), TimeUnit.MILLISECONDS));
            eVar.mo50428h(b.f121541a, (Object) null, mVar.f282986l);
            if (mVar.f282987m != null) {
                View inflate = LayoutInflater.from(mVar.f282981g.requireContext()).inflate(R.layout.google_app_browser_clearing_done, (ViewGroup) null);
                C0392m mVar2 = mVar.f282987m;
                mVar2.getClass();
                mVar2.setContentView(inflate);
                inflate.announceForAccessibility(mVar.f282981g.requireContext().getString(R.string.google_app_browser_clear_done));
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: l */
    public final C46440f f282986l = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x d = C101424m.f282977c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ClearFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(20130)).mo56386p("Failed to schedule closeActivity");
            C101424m.m167724c(C101424m.this);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C101424m.this.mo92295b();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: m */
    public C0392m f282987m;

    public C101424m(C101417f fVar, C46439e eVar, C101412b bVar, C43381b bVar2, C118561t tVar, C60888db dbVar, C44075j jVar) {
        boolean z = true;
        if (!bVar.f282960b && !bVar.f282961c) {
            z = false;
        }
        C58838bb.m90884s(z, "At least one clear argument should be set.");
        this.f282981g = fVar;
        this.f282980f = eVar;
        this.f282979e = bVar2.mo46482a(jVar.mo47043a(C43271v.WEB_LAYER));
        this.f282982h = bVar;
        this.f282978d = tVar;
        this.f282983i = dbVar;
    }

    /* renamed from: a */
    static C101417f m167723a(AccountId accountId, C101412b bVar) {
        C101417f fVar = new C101417f();
        C68324h.m98669f(fVar);
        C47247a.m84047b(fVar, accountId);
        C47243l.m84039a(fVar, bVar);
        return fVar;
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m167724c(C101424m mVar) {
        Toast.makeText(mVar.f282981g.requireContext(), R.string.google_app_browser_clear_error, 0).show();
        mVar.mo92295b();
    }

    /* renamed from: b */
    public final void mo92295b() {
        this.f282987m = null;
        this.f282981g.requireActivity().finish();
    }
}
