package com.google.android.apps.search.googleapp.accounts.p10126ui;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.C133234q;
import com.google.android.apps.search.googleapp.incognito.education.C136261d;
import com.google.android.apps.search.googleapp.incognito.p10322c.C136242b;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30312u;
import com.google.android.libraries.search.p2476a.p2482d.C32213b;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47538ax;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.q */
/* compiled from: PG */
public final /* synthetic */ class C133360q implements C30312u {

    /* renamed from: a */
    public final /* synthetic */ C133361r f363379a;

    /* renamed from: b */
    public final /* synthetic */ C133234q f363380b;

    public /* synthetic */ C133360q(C133361r rVar, C133234q qVar) {
        this.f363379a = rVar;
        this.f363380b = qVar;
    }

    /* renamed from: a */
    public final void mo35877a(boolean z) {
        C133361r rVar = this.f363379a;
        C133234q qVar = this.f363380b;
        C136242b bVar = rVar.f363382a;
        boolean e = qVar.mo111033e();
        C47538ax c = bVar.f371032d.mo51613c("onIncognitoStateChanged");
        if (!z) {
            C47393f.m84236g(new C32213b(2), bVar.f371029a);
        } else if (e) {
            try {
                C136261d a = C136261d.m221395a(bVar.f371030b);
                C0154a aVar = new C0154a(bVar.f371029a.getChildFragmentManager());
                aVar.mo685r(a, "INCOGNITO_EDUCATION");
                aVar.mo509f();
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else {
            bVar.f371031c.mo112856a();
        }
        if (c != null) {
            c.close();
            return;
        }
        return;
        throw th;
    }
}
