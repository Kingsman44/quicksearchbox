package com.google.android.apps.search.googleapp.notifications.webuisettings;

import android.content.Intent;
import android.net.Uri;
import android.os.LocaleList;
import android.support.p031v4.app.C0154a;
import android.support.p033v7.app.C0401v;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.apps.search.googleapp.incognito.C136226a;
import com.google.android.apps.search.googleapp.notifications.webuisettings.p10367a.C136795f;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
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
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.notifications.webuisettings.d */
/* compiled from: PG */
public final class C136805d implements C45987ay {

    /* renamed from: a */
    private static final C59071e f372393a = C59071e.m91332i("com.google.android.apps.search.googleapp.notifications.webuisettings.d");

    /* renamed from: b */
    private final WebUiSettingsActivity f372394b;

    /* renamed from: c */
    private final C28310af f372395c;

    /* renamed from: d */
    private final C136226a f372396d;

    /* renamed from: e */
    private final C136809h f372397e;

    public C136805d(WebUiSettingsActivity webUiSettingsActivity, C45989b bVar, C28310af afVar, C136226a aVar, C133155c cVar, C136809h hVar) {
        this.f372394b = webUiSettingsActivity;
        this.f372395c = afVar;
        this.f372396d = aVar;
        this.f372397e = hVar;
        webUiSettingsActivity.setContentView((int) R.layout.googleapp_webuisettings_activity);
        cVar.mo110998a(webUiSettingsActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        Optional optional;
        Locale locale;
        this.f372396d.mo112853b(awVar);
        Intent intent = this.f372394b.getIntent();
        if (!intent.hasExtra("EXTRA_ENDPOINT_URL")) {
            optional = Optional.empty();
        } else {
            optional = Optional.ofNullable(intent.getStringExtra("EXTRA_ENDPOINT_URL"));
        }
        if (optional.isPresent()) {
            C136809h hVar = this.f372397e;
            Uri parse = Uri.parse((String) optional.get());
            Uri.Builder buildUpon = parse.buildUpon();
            if (!parse.getQueryParameterNames().contains("cs")) {
                C133933a aVar = hVar.f372398a;
                int i = C0401v.f1356b;
                if (C133933a.m217248a(aVar.f364779a)) {
                    buildUpon.appendQueryParameter("cs", "1");
                }
            }
            if (!parse.getQueryParameterNames().contains("hl")) {
                LocaleList locales = hVar.f372399b.getResources().getConfiguration().getLocales();
                if (locales == null || locales.isEmpty()) {
                    locale = Locale.getDefault();
                } else {
                    locale = locales.get(0);
                }
                buildUpon.appendQueryParameter("hl", locale.getLanguage());
            }
            String uri = buildUpon.build().toString();
            AccountId accountId = awVar.f120815a.f120816a;
            C136795f fVar = new C136795f();
            C68324h.m98669f(fVar);
            C47247a.m84047b(fVar, accountId);
            C47243l.m84040b(fVar, uri);
            C0154a aVar2 = new C0154a(this.f372394b.f727a.f739a.f744e);
            aVar2.mo689v(R.id.googleapp_stamp_viewer_activity_container, fVar, (String) null);
            aVar2.mo509f();
            return;
        }
        ((C59052c) ((C59052c) f372393a.mo56225c()).mo56372aa(40826)).mo56386p("No Endpoint URL.");
        this.f372394b.finish();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f372393a.mo56226d()).mo56382g(th)).mo56372aa(40827)).mo56386p("#onAccountError");
        this.f372394b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28313c a = this.f372395c.f76997b.mo33800a(C28427h.m53115a(true != this.f372394b.getIntent().getBooleanExtra("EXTRA_ENDPOINT_TYPE", true) ? 151545 : 93055));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        a.mo33859g(C28375ak.m53061c(93056));
        a.mo33810c(this.f372394b);
    }
}
