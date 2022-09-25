package com.google.android.apps.search.googleapp.p10381r;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.p10381r.C137148g;
import com.google.android.apps.search.googleapp.search.settings.C137587b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.r.k */
/* compiled from: PG */
final class C137154k implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C137153j f373205a;

    public C137154k(C137153j jVar) {
        this.f373205a = jVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C137153j jVar = this.f373205a;
        String a = ((C137148g.C137149a) bVar).mo113564a();
        if (jVar.f373203a.getChildFragmentManager().f634a.mo671c(a) == null) {
            C0154a aVar = new C0154a(jVar.f373203a.getChildFragmentManager());
            AccountId accountId = jVar.f373204b;
            C137587b bVar2 = new C137587b();
            C68324h.m98669f(bVar2);
            C47247a.m84047b(bVar2, accountId);
            aVar.mo511h(R.id.googleapp_incognito_settings_fragment_container, bVar2, a, 1);
            aVar.mo509f();
        }
        return C47392e.f123115a;
    }
}
