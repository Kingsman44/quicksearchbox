package com.google.android.apps.search.googleapp.accounts.p10126ui;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0192bk;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.l */
/* compiled from: PG */
public final class C133344l implements C45987ay {

    /* renamed from: a */
    public final AccountMenuActivity f363349a;

    /* renamed from: b */
    public final C136247a f363350b;

    /* renamed from: c */
    public final C133148g f363351c;

    /* renamed from: d */
    public final C0192bk f363352d = new C133343k(this);

    /* renamed from: e */
    private final C28310af f363353e;

    /* renamed from: f */
    private final C28306ab f363354f;

    public C133344l(AccountMenuActivity accountMenuActivity, C45989b bVar, C136247a aVar, C28310af afVar, C28306ab abVar, C32158h hVar, C133148g gVar) {
        this.f363349a = accountMenuActivity;
        this.f363350b = aVar;
        this.f363353e = afVar;
        this.f363354f = abVar;
        this.f363351c = gVar;
        hVar.mo37971b(accountMenuActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C47558bi a = C47831fm.m85006a("AccountMenuActivityPeer#onAccountChanged");
        try {
            C133252d a2 = C133252d.m216261a(awVar.f120815a.f120816a, C133189b.f363045d);
            C0154a aVar = new C0154a(this.f363349a.f727a.f739a.f744e);
            aVar.mo689v(R.id.googleapp_account_menu_fragment_container, a2, "GoogleApp_AccountDiscFragment");
            aVar.mo509f();
            a.close();
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f363349a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28306ab abVar = this.f363354f;
        AccountMenuActivity accountMenuActivity = this.f363349a;
        C28313c a = this.f363353e.mo33805a(C28427h.m53115a(126137));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C28375ak.m53061c(126141));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        int i = C28485y.f77298f;
        abVar.mo33801b(accountMenuActivity.mo1322k().mo1177e(16908290), a);
    }
}
