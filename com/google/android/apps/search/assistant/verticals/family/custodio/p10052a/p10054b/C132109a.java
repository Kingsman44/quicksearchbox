package com.google.android.apps.search.assistant.verticals.family.custodio.p10052a.p10054b;

import android.net.Uri;
import com.google.android.libraries.search.p2476a.p2479c.C32207h;
import com.google.android.libraries.search.p2476a.p2479c.C32208i;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45977ao;
import com.google.apps.tiktok.account.api.controller.C45978ap;
import com.google.apps.tiktok.account.api.controller.C45981as;
import com.google.apps.tiktok.account.api.controller.C46009bt;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.a.b.a */
/* compiled from: PG */
public final class C132109a implements C45977ao, C45978ap {

    /* renamed from: a */
    private final C46325t f360623a;

    /* renamed from: b */
    private final C46128f f360624b;

    public C132109a(C46325t tVar, C46128f fVar) {
        this.f360623a = tVar;
        this.f360624b = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo37983a(C45981as asVar) {
        C47558bi a = C47831fm.m85006a("Get account from custodio intent");
        try {
            Uri data = ((C46009bt) asVar).f120852a.getData();
            if (data == null) {
                C60870cx h = C60856cj.m92899h(new C32208i());
                a.mo51417a(h);
                a.close();
                return h;
            }
            String queryParameter = data.getQueryParameter("account_name");
            if (queryParameter != null) {
                C60870cx c = this.f360624b.mo50216c(queryParameter);
                a.mo51417a(c);
                a.close();
                return c;
            }
            C60870cx h2 = C60856cj.m92899h(new C32207h());
            a.mo51417a(h2);
            a.close();
            return h2;
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
        return this.f360623a.mo50282b(accountId);
    }
}
