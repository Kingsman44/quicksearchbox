package com.google.android.apps.search.assistant.verticals.languagelearning;

import android.support.p031v4.app.C0154a;
import com.google.android.libraries.search.p2476a.p2477a.C32151a;
import com.google.android.libraries.search.silk.web.androiduri.C40672c;
import com.google.android.libraries.search.silk.web.androiduri.SilkAndroidUriFeature;
import com.google.android.libraries.search.silk.web.close.C40727c;
import com.google.android.libraries.search.silk.web.close.SilkCloseFeature;
import com.google.android.libraries.search.silk.web.core.C40756j;
import com.google.android.libraries.search.silk.web.core.C40757k;
import com.google.android.libraries.search.silk.web.core.C40758l;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.android.libraries.web.webview.contrib.stuckjs.StuckJsFeature;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.apk;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.assistant.verticals.languagelearning.d */
/* compiled from: PG */
public final class C132396d implements C45987ay {

    /* renamed from: a */
    private final LanguageLearningActivity f361384a;

    /* renamed from: b */
    private final C132405m f361385b;

    public C132396d(LanguageLearningActivity languageLearningActivity, C45989b bVar, C132405m mVar) {
        this.f361384a = languageLearningActivity;
        this.f361385b = mVar;
        C32151a.m59929e(languageLearningActivity, this, bVar, C58485gu.m89845m());
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        AccountId accountId = awVar.f120815a.f120816a;
        C132400h hVar = new C132400h();
        C68324h.m98669f(hVar);
        C47247a.m84047b(hVar, accountId);
        AccountId accountId2 = awVar.f120815a.f120816a;
        C132405m mVar = this.f361385b;
        C43259j jVar = new C43259j();
        jVar.f113058a = false;
        jVar.mo46375e("AssistantLanguageLearning/0");
        C40758l lVar = mVar.f361398a;
        C40756j jVar2 = (C40756j) C40757k.f106857c.createBuilder();
        apk apk = apk.TNG_ASSISTANT;
        jVar2.copyOnWrite();
        C40757k kVar = (C40757k) jVar2.instance;
        kVar.f106860b = apk.f159677E;
        kVar.f106859a |= 1;
        jVar.mo46372b(StuckJsFeature.m78405e(), lVar.mo42702a((C40757k) jVar2.build()), SilkCloseFeature.m70571e(new C40727c()), SilkAndroidUriFeature.m70461e(new C40672c()));
        C43264o a = C43265p.m76349a(accountId2, jVar.mo46371a());
        C0154a aVar = new C0154a(this.f361384a.f727a.f739a.f744e);
        aVar.mo689v(16908290, a, (String) null);
        aVar.mo509f();
        a.mo17754z().mo46380b(hVar);
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f361384a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
