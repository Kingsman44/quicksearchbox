package com.google.android.apps.search.googleapp.accounts.p10126ui.features.help;

import android.support.p031v4.app.C0154a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.hilt.android.internal.managers.C68324h;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.help.b */
/* compiled from: PG */
public final class C133305b extends C133306c implements C45987ay {

    /* renamed from: c */
    private static final C59071e f363257c = C59071e.m91332i("com.google.android.apps.search.googleapp.accounts.ui.features.help.b");

    /* renamed from: a */
    public final HelpAndFeedbackActivity f363258a;

    /* renamed from: d */
    private final C28310af f363259d;

    /* renamed from: e */
    private final C28306ab f363260e;

    public C133305b(C45989b bVar, HelpAndFeedbackActivity helpAndFeedbackActivity, C28310af afVar, C28306ab abVar, C32158h hVar) {
        this.f363258a = helpAndFeedbackActivity;
        this.f363259d = afVar;
        this.f363260e = abVar;
        hVar.mo37971b(helpAndFeedbackActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C47558bi a = C47831fm.m85006a("HelpAndFeedbackActivity#onAccountChanged");
        try {
            AccountId accountId = awVar.f120815a.f120816a;
            C133313j jVar = new C133313j();
            C68324h.m98669f(jVar);
            C47247a.m84047b(jVar, accountId);
            C0154a aVar = new C0154a(this.f363258a.f727a.f739a.f744e);
            aVar.mo689v(R.id.googleapp_help_and_feedback_activity_container, jVar, (String) null);
            aVar.mo509f();
            C133314k a2 = jVar.mo17754z();
            String stringExtra = this.f363258a.getIntent().getStringExtra("EXTRA_SCREENSHOT_FILENAME");
            C46439e eVar = a2.f363280f;
            C133311h hVar = a2.f363277c;
            C46438d dVar = new C46438d(C71663i.m104688a(C71803m.m105042c(hVar.f363270d, (C69585o) null, (C71424ay) null, new C133310g(hVar, stringExtra, (C69577g) null), 3)));
            eVar.mo50428h(dVar.f121541a, (Object) null, a2.f363281g);
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
        ((C59052c) ((C59052c) ((C59052c) f363257c.mo56225c()).mo56382g(th)).mo56372aa(40028)).mo56386p("Account exception.");
        this.f363258a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28306ab abVar = this.f363260e;
        HelpAndFeedbackActivity helpAndFeedbackActivity = this.f363258a;
        C28313c a = this.f363259d.mo33805a(C28427h.m53115a(126138));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C28375ak.m53061c(126142));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        int i = C28485y.f77298f;
        abVar.mo33801b(helpAndFeedbackActivity.mo1322k().mo1177e(16908290), a);
    }
}
