package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.apps.search.googleapp.incognito.C136226a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.bo */
/* compiled from: PG */
public final class C139090bo implements C45987ay {

    /* renamed from: b */
    private static final C59071e f378291b = C59071e.m91332i("com.google.android.apps.search.googleapp.searchwidget.settings.customization.bo");

    /* renamed from: a */
    public C28439i f378292a;

    /* renamed from: c */
    private final WidgetCustomizationActivity f378293c;

    /* renamed from: d */
    private final C28306ab f378294d;

    /* renamed from: e */
    private final C136226a f378295e;

    public C139090bo(WidgetCustomizationActivity widgetCustomizationActivity, C28306ab abVar, C136226a aVar, C133155c cVar, C45989b bVar) {
        this.f378293c = widgetCustomizationActivity;
        this.f378294d = abVar;
        this.f378295e = aVar;
        cVar.mo110998a(widgetCustomizationActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        this.f378295e.mo112853b(awVar);
        AccountId accountId = awVar.f120815a.f120816a;
        C139095bt btVar = new C139095bt();
        C68324h.m98669f(btVar);
        C47247a.m84047b(btVar, accountId);
        C0154a aVar = new C0154a(this.f378293c.f727a.f739a.f744e);
        aVar.mo689v(16908290, btVar, (String) null);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f378292a = null;
        ((C59052c) ((C59052c) ((C59052c) f378291b.mo56226d()).mo56382g(th)).mo56372aa(41338)).mo56386p("#onAccountError");
        this.f378293c.finish();
    }

    /* renamed from: c */
    public final void mo19984c() {
        this.f378292a = null;
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28306ab abVar = this.f378294d;
        WidgetCustomizationActivity widgetCustomizationActivity = this.f378293c;
        C28313c a = abVar.f76990a.mo33805a(C28427h.m53115a(147859));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        a.mo33859g(C28375ak.m53061c(149575));
        int i = C28485y.f77298f;
        this.f378292a = abVar.mo33801b(widgetCustomizationActivity.findViewById(16908290), a);
    }
}
