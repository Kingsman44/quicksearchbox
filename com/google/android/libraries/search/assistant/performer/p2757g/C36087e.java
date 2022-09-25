package com.google.android.libraries.search.assistant.performer.p2757g;

import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.e */
/* compiled from: PG */
public final class C36087e {

    /* renamed from: a */
    public final Context f94400a;

    /* renamed from: b */
    private final AccountId f94401b;

    /* renamed from: c */
    private final C46175b f94402c;

    /* renamed from: d */
    private final C46128f f94403d;

    /* renamed from: e */
    private final Executor f94404e;

    public C36087e(Context context, C46175b bVar, AccountId accountId, C46128f fVar, Executor executor) {
        this.f94400a = context;
        this.f94402c = bVar;
        this.f94401b = accountId;
        this.f94403d = fVar;
        this.f94404e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo39967a(Intent intent) {
        String str = intent.getPackage();
        if (str == null || !"com.google.android.apps.books".equals(str)) {
            return C60856cj.m92900i(false);
        }
        C60870cx c = this.f94402c.mo50246c(this.f94401b);
        C60870cx b = this.f94403d.mo50215b(this.f94401b);
        C60870cx a = C47638k.m84753d(c, b).mo51520a(new C36085c(c, b), this.f94404e);
        C36086d dVar = new C36086d(this, intent);
        return C60922j.m93044g(a, C47810es.m84963c(dVar), this.f94404e);
    }
}
