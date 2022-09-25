package com.google.android.apps.search.googleapp.stampviewer.p10497i;

import android.content.Context;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139338t;
import com.google.android.apps.search.googleapp.stampviewer.p10493e.C139387f;
import com.google.android.apps.search.googleapp.urlhandler.p10531c.C139792b;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.nav.gateway.C47505k;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4242bp.p4253e.p4254a.C56198r;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.i.i */
/* compiled from: PG */
final class C139430i implements C47506l {

    /* renamed from: a */
    public final C139338t f379119a;

    /* renamed from: b */
    public final C139387f f379120b;

    /* renamed from: c */
    public final boolean f379121c;

    /* renamed from: d */
    public final C56198r f379122d;

    /* renamed from: e */
    private final C32158h f379123e;

    /* renamed from: f */
    private final Context f379124f;

    /* renamed from: g */
    private final Executor f379125g;

    /* renamed from: com.google.android.apps.search.googleapp.stampviewer.i.i$a */
    /* compiled from: PG */
    interface C139431a {
        /* renamed from: cV */
        C139792b mo114958cV();
    }

    public C139430i(C32158h hVar, C139338t tVar, C139387f fVar, boolean z, Context context, Executor executor, C56198r rVar) {
        this.f379123e = hVar;
        this.f379119a = tVar;
        this.f379120b = fVar;
        this.f379121c = z;
        this.f379124f = context;
        this.f379125g = executor;
        this.f379122d = rVar;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo20002a() {
        return 0;
    }

    /* renamed from: b */
    public final /* synthetic */ int mo20003b() {
        return 0;
    }

    /* renamed from: c */
    public final C58833ax mo20004c() {
        return this.f379123e.mo37970a();
    }

    /* renamed from: e */
    public final /* synthetic */ GatewayHandler.GatewayDestination mo20006e() {
        return GatewayHandler.GatewayDestination.m84513a((String) null);
    }

    /* renamed from: d */
    public final C60870cx mo20005d(C47505k kVar) {
        Context context = this.f379124f;
        AccountId accountId = kVar.f123336a;
        accountId.getClass();
        return C60922j.m93045h(((C139431a) C47245e.m84045a(context, C139431a.class, accountId)).mo114958cV().mo115249a(), C47810es.m84966f(new C139429h(this, kVar)), this.f379125g);
    }
}
