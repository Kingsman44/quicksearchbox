package com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity;

import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity.p7966a.C101411a;
import com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity.p7966a.C101412b;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity.b */
/* compiled from: PG */
public final class C101413b implements C45987ay {

    /* renamed from: a */
    private static final C59071e f282962a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity.b");

    /* renamed from: b */
    private final GoogleAppBrowserClearActivity f282963b;

    public C101413b(C45989b bVar, GoogleAppBrowserClearActivity googleAppBrowserClearActivity) {
        this.f282963b = googleAppBrowserClearActivity;
        bVar.mo50082e(this);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        Intent intent = this.f282963b.getIntent();
        C101411a aVar = (C101411a) C101412b.f282957d.createBuilder();
        boolean booleanExtra = intent.getBooleanExtra("GoogleAppBrowserDataCache", false);
        aVar.copyOnWrite();
        C101412b bVar = (C101412b) aVar.instance;
        bVar.f282959a |= 2;
        bVar.f282961c = booleanExtra;
        boolean booleanExtra2 = intent.getBooleanExtra("GoogleAppBrowserClearCache", false);
        aVar.copyOnWrite();
        C101412b bVar2 = (C101412b) aVar.instance;
        bVar2.f282959a |= 1;
        bVar2.f282960b = booleanExtra2;
        C101424m.m167723a(awVar.f120815a.f120816a, (C101412b) aVar.build()).showNow(this.f282963b.f727a.f739a.f744e, "GoogleAppBrowserClearTag");
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f282962a.mo56226d()).mo56382g(th)).mo56372aa(20127)).mo56386p("#onAccountError");
        this.f282963b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
