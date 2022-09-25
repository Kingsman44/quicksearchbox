package com.google.android.apps.search.googleapp.discover.settings.interestmanagement;

import android.content.Intent;
import android.net.Uri;
import android.os.LocaleList;
import android.support.p031v4.app.C0154a;
import android.support.p033v7.app.C0401v;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.apps.search.googleapp.discover.settings.interestmanagement.p10223a.C134676a;
import com.google.android.apps.search.googleapp.discover.settings.interestmanagement.p10223a.C134682c;
import com.google.android.apps.search.googleapp.incognito.C136226a;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.libraries.web.coordinator.C43727a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Locale;
import p5462h.p5473f.C69614a;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69657g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.interestmanagement.d */
/* compiled from: PG */
public final class C134688d implements C45987ay {

    /* renamed from: b */
    private static final C59071e f366778b = C59071e.m91331h();

    /* renamed from: a */
    public final InterestManagementActivity f366779a;

    /* renamed from: c */
    private final C136226a f366780c;

    /* renamed from: d */
    private final C134693i f366781d;

    /* renamed from: e */
    private final C28306ab f366782e;

    public C134688d(InterestManagementActivity interestManagementActivity, C136226a aVar, C134693i iVar, C28306ab abVar, C45989b bVar, C133155c cVar) {
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(bVar, "accountController");
        this.f366779a = interestManagementActivity;
        this.f366780c = aVar;
        this.f366781d = iVar;
        this.f366782e = abVar;
        cVar.mo110998a(interestManagementActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        Locale locale;
        this.f366780c.mo112853b(awVar);
        Intent intent = this.f366779a.getIntent();
        C69664n.m101060f(intent, "activity.intent");
        C69664n.m101061g(intent, "intent");
        String stringExtra = !intent.hasExtra("EXTRA_ENDPOINT_URL") ? null : intent.getStringExtra("EXTRA_ENDPOINT_URL");
        if (stringExtra == null) {
            C59052c cVar = (C59052c) f366778b.mo56225c();
            cVar.mo56379ah(new C59094n(40418));
            cVar.mo56386p("No Endpoint URL.");
            this.f366779a.finish();
            return;
        }
        C134693i iVar = this.f366781d;
        Uri parse = Uri.parse(stringExtra);
        Uri.Builder buildUpon = parse.buildUpon();
        if (!parse.getQueryParameterNames().contains("cs")) {
            C133933a aVar = iVar.f366790a;
            int i = C0401v.f1356b;
            if (C133933a.m217248a(aVar.f364779a)) {
                buildUpon.appendQueryParameter("cs", "1");
            }
        }
        if (!parse.getQueryParameterNames().contains("hl")) {
            LocaleList locales = iVar.f366791b.getResources().getConfiguration().getLocales();
            C69664n.m101060f(locales, "context.resources.configuration.locales");
            if (locales.isEmpty()) {
                locale = locales.get(0);
            } else {
                locale = Locale.getDefault();
            }
            C69664n.m101060f(locale, "{\n      val localeList =…etDefault()\n      }\n    }");
            buildUpon.appendQueryParameter("hl", locale.getLanguage());
        }
        String uri = buildUpon.build().toString();
        C69664n.m101060f(uri, "builder.build().toString()");
        AccountId accountId = awVar.f120815a.f120816a;
        C69664n.m101060f(accountId, "accountContext.accountId");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(uri, "endpointUrl");
        C134682c cVar2 = new C134682c();
        C68324h.m98669f(cVar2);
        C47247a.m84047b(cVar2, accountId);
        C47243l.m84040b(cVar2, uri);
        int i2 = C69649af.f186028a;
        C43727a.m77222b(cVar2, C69614a.m101026a(new C69657g(C134676a.class)));
        C0154a aVar2 = new C0154a(this.f366779a.f727a.f739a.f744e);
        aVar2.mo689v(R.id.googleapp_stamp_viewer_activity_container, cVar2, (String) null);
        aVar2.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) f366778b.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(40419));
        cVar.mo56386p("#onAccountError");
        this.f366779a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28306ab abVar = this.f366782e;
        InterestManagementActivity interestManagementActivity = this.f366779a;
        C28313c a = abVar.f76990a.mo33805a(C28427h.m53115a(147740));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        int i = C28485y.f77298f;
        abVar.mo33801b(interestManagementActivity.findViewById(16908290), a);
    }
}
