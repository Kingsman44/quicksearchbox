package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45977ao;
import com.google.apps.tiktok.account.api.controller.C45978ap;
import com.google.apps.tiktok.account.api.controller.C45981as;
import com.google.apps.tiktok.account.api.controller.C46009bt;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.cp */
/* compiled from: PG */
public final class C126836cp implements C45977ao, C45978ap {

    /* renamed from: a */
    private final C46325t f349300a;

    /* renamed from: b */
    private final C46128f f349301b;

    public C126836cp(C46325t tVar, C46128f fVar) {
        this.f349300a = tVar;
        this.f349301b = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo37983a(C45981as asVar) {
        C47558bi a = C47831fm.m85006a("Get Search Account from the Chrome Email");
        try {
            Bundle extras = ((C46009bt) asVar).f120852a.getExtras();
            if (extras != null) {
                if (!C58837ba.m90859h(extras.getString("com.android.chrome.voice.INTENT_USER_EMAIL"))) {
                    String string = extras.getString("com.android.chrome.voice.INTENT_USER_EMAIL");
                    C58976aa aaVar = C58975e.f156826a;
                    C126835co coVar = C126835co.f349299a;
                    C60870cx g = C60846c.m92878g(this.f349301b.mo50216c(string), C46167as.class, C47810es.m84963c(coVar), C60826bg.f164896a);
                    a.close();
                    return g;
                }
            }
            C60870cx cxVar = C60866ct.f164955a;
            a.close();
            return cxVar;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: b */
    public final C60870cx mo37984b(AccountId accountId) {
        return this.f349300a.mo50282b(accountId);
    }
}
