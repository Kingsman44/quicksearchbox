package com.google.android.apps.search.googleapp.googleappbrowser;

import android.net.Uri;
import android.support.p031v4.app.C0154a;
import android.view.ActionMode;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135458d;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135459e;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136053ak;
import com.google.android.apps.search.googleapp.incognito.C136226a;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.android.googlequicksearchbox.R;
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
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.b */
/* compiled from: PG */
public final class C135503b extends C135570e implements C45987ay {

    /* renamed from: d */
    private static final C59071e f369132d = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.b");

    /* renamed from: a */
    public final GoogleAppBrowserActivity f369133a;

    /* renamed from: b */
    public final C133148g f369134b;

    /* renamed from: e */
    private final C28306ab f369135e;

    /* renamed from: f */
    private final C136226a f369136f;

    /* renamed from: g */
    private final boolean f369137g;

    public C135503b(GoogleAppBrowserActivity googleAppBrowserActivity, C45989b bVar, C28306ab abVar, C136226a aVar, C133155c cVar, boolean z, C133148g gVar) {
        this.f369133a = googleAppBrowserActivity;
        this.f369135e = abVar;
        this.f369136f = aVar;
        this.f369137g = z;
        this.f369134b = gVar;
        cVar.mo110998a(googleAppBrowserActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        this.f369136f.mo112853b(awVar);
        mo112370f(awVar.f120815a.f120816a, this.f369133a.getIntent().getData(), C135458d.m219648a(this.f369133a.getIntent()));
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f369132d.mo56226d()).mo56382g(th)).mo56372aa(40578)).mo56386p("#onAccountError");
        this.f369133a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        if (!this.f369137g) {
            this.f369136f.mo112852a(this.f369133a, axVar);
        }
        C28306ab abVar = this.f369135e;
        GoogleAppBrowserActivity googleAppBrowserActivity = this.f369133a;
        C28313c a = abVar.f76990a.mo33805a(C28427h.m53115a(79655));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C28375ak.m53061c(79656));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        int i = C28485y.f77298f;
        abVar.mo33801b(googleAppBrowserActivity.mo1322k().mo1177e(16908290), a);
    }

    /* renamed from: e */
    public final C136109q mo112369e() {
        C136020o k;
        GoogleAppBrowserCoordinatorFragment googleAppBrowserCoordinatorFragment = (GoogleAppBrowserCoordinatorFragment) this.f369133a.f727a.f739a.f744e.f634a.mo670b(R.id.googleapp_browser_fragment);
        if (googleAppBrowserCoordinatorFragment == null || (k = googleAppBrowserCoordinatorFragment.mo17754z().mo112687k()) == null) {
            return null;
        }
        return k.mo17754z();
    }

    /* renamed from: f */
    public final void mo112370f(AccountId accountId, Uri uri, C135462h hVar) {
        C135459e eVar = (C135459e) hVar.toBuilder();
        if (uri != null && !uri.toString().isEmpty()) {
            String uri2 = uri.toString();
            eVar.copyOnWrite();
            C135462h hVar2 = (C135462h) eVar.instance;
            uri2.getClass();
            hVar2.f369061a |= 1;
            hVar2.f369062b = uri2;
        }
        GoogleAppBrowserCoordinatorFragment a = GoogleAppBrowserCoordinatorFragment.m219623a(accountId, (C135462h) eVar.build());
        C0154a aVar = new C0154a(this.f369133a.f727a.f739a.f744e);
        aVar.mo689v(R.id.googleapp_browser_fragment, a, (String) null);
        aVar.mo509f();
    }

    /* renamed from: g */
    public final void mo112371g(ActionMode actionMode) {
        C136053ak c;
        C136109q e = mo112369e();
        if (e != null && (c = e.mo112758c()) != null) {
            c.f370534v = actionMode;
        }
    }
}
