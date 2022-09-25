package com.google.android.apps.search.googleapp.customtabs.features.buttons.share;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.incognito.C136226a;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.logging.p2185ve.synthetic.C28463g;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
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

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.share.f */
/* compiled from: PG */
public final class C133856f implements C45987ay {

    /* renamed from: a */
    private static final C59071e f364588a = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.features.buttons.share.f");

    /* renamed from: b */
    private final ShareActivity f364589b;

    /* renamed from: c */
    private final C28463g f364590c;

    /* renamed from: d */
    private final C136226a f364591d;

    public C133856f(ShareActivity shareActivity, C45989b bVar, C28463g gVar, C32158h hVar, C136226a aVar) {
        this.f364589b = shareActivity;
        this.f364590c = gVar;
        this.f364591d = aVar;
        hVar.mo37971b(shareActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        this.f364591d.mo112853b(awVar);
        AccountId accountId = awVar.f120815a.f120816a;
        C133862l lVar = new C133862l();
        C68324h.m98669f(lVar);
        C47247a.m84047b(lVar, accountId);
        C0154a aVar = new C0154a(this.f364589b.f727a.f739a.f744e);
        aVar.mo689v(16908290, lVar, (String) null);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f364588a.mo56226d()).mo56382g(th)).mo56372aa(40156)).mo56386p("#onAccountError");
        this.f364589b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28313c a = this.f364590c.mo33917a(C28427h.m53115a(94024));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        a.mo33859g(C28375ak.m53061c(94022));
        this.f364590c.mo33920d(a.mo33808a());
        this.f364590c.mo33922f();
    }
}
