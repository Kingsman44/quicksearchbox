package com.google.android.libraries.search.p3005i.p3012f;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.p10811h.C144351b;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.search.integrations.p3013a.p3014a.C38487e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.search.i.f.e */
/* compiled from: PG */
public final class C38460e implements C38456a {

    /* renamed from: a */
    private final Context f101785a;

    /* renamed from: b */
    private final C60887da f101786b;

    /* renamed from: c */
    private final C58833ax f101787c;

    /* renamed from: d */
    private final boolean f101788d;

    /* renamed from: com.google.android.libraries.search.i.f.e$a */
    /* compiled from: PG */
    public interface C38461a {
        /* renamed from: of */
        C38487e mo41429of();
    }

    public C38460e(Context context, C60887da daVar, C58833ax axVar, boolean z) {
        this.f101785a = context;
        this.f101786b = daVar;
        this.f101787c = axVar;
        this.f101788d = z;
    }

    /* renamed from: a */
    public final C60870cx mo41427a(AccountId accountId) {
        C60870cx cxVar;
        if (this.f101788d) {
            cxVar = C60846c.m92878g(C43205e.m76192b(C144351b.m234629a(((C38462f) ((C58847bk) this.f101787c).f156646a).f101789a).mo119866c()), Exception.class, C47810es.m84963c(C38457b.f101781a), this.f101786b);
        } else {
            cxVar = C60856cj.m92900i(BuildConfig.FLAVOR);
        }
        C47633f h = ((C38461a) C47245e.m84045a(this.f101785a, C38461a.class, accountId)).mo41429of().mo41441a().mo51515h(C38458c.f101782a, this.f101786b);
        return C60856cj.m92893b(cxVar, h).mo57334a(C47810es.m84978r(new C38459d(cxVar, h)), this.f101786b);
    }
}
