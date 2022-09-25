package com.google.android.apps.search.googleapp.customtabs.features.buttons.help;

import android.content.Intent;
import android.net.Uri;
import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.apps.search.googleapp.amp.p10138a.C133456e;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.logging.p2185ve.synthetic.C28463g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47467e;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.monitoring.feedback.C47486w;
import com.google.apps.tiktok.monitoring.feedback.C47488y;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.help.b */
/* compiled from: PG */
public final class C133829b implements C45987ay {

    /* renamed from: b */
    private static final C59071e f364523b = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.features.buttons.help.b");

    /* renamed from: a */
    public final HelpActivity f364524a;

    /* renamed from: c */
    private final C28310af f364525c;

    /* renamed from: d */
    private final C28463g f364526d;

    public C133829b(HelpActivity helpActivity, C45989b bVar, C28310af afVar, C28463g gVar, C133155c cVar) {
        this.f364524a = helpActivity;
        this.f364525c = afVar;
        this.f364526d = gVar;
        cVar.mo110998a(helpActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        Uri uri;
        AccountId accountId = awVar.f120815a.f120816a;
        C133833f fVar = new C133833f();
        C68324h.m98669f(fVar);
        C47247a.m84047b(fVar, accountId);
        C0154a aVar = new C0154a(this.f364524a.f727a.f739a.f744e);
        aVar.mo689v(16908290, fVar, "HELP_FRAGMENT");
        aVar.mo509f();
        Intent intent = this.f364524a.getIntent();
        if (intent == null) {
            uri = null;
        } else {
            uri = intent.getData();
        }
        if (uri == null) {
            ((C59052c) ((C59052c) f364523b.mo56226d()).mo56372aa(40143)).mo56386p("Current URL not available");
        }
        C133834g a = fVar.mo17754z();
        C47486w d = C47488y.m84500d();
        if (uri == null || !C133456e.m216616c(uri).isPresent()) {
            ((C47467e) d).f123263a = "chrome_custom_tabs";
            d.mo51321b(Uri.parse("https://support.google.com/websearch?p=chrome_custom_tabs"));
        } else {
            ((C47467e) d).f123263a = a.f364534d;
            d.mo51321b(Uri.parse(a.f364535e));
        }
        C47474k g = C47475l.m84477g();
        g.mo51310d(false);
        ((C47465c) g).f123249a = "com.google.android.googlequicksearchbox.USER_INITIATED_FEEDBACK_REPORT";
        a.f364532b.mo51298a(d.mo51320a(), g.mo51332e());
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f364523b.mo56226d()).mo56382g(th)).mo56372aa(40144)).mo56386p("#onAccountError");
        this.f364524a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28463g gVar = this.f364526d;
        C28313c a = this.f364525c.mo33805a(C28427h.m53115a(128682));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        a.mo33859g(C28375ak.m53061c(128683));
        this.f364526d.mo33920d(gVar.mo33918b(a));
        this.f364526d.mo33922f();
    }
}
