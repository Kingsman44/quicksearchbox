package com.google.android.libraries.search.udcdataservice.ulr;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.search.udcdataservice.ulr.g */
/* compiled from: PG */
public final class C41427g implements C47102r {

    /* renamed from: a */
    public static final C59071e f108206a = C59071e.m91332i("com.google.android.libraries.search.udcdataservice.ulr.g");

    /* renamed from: b */
    public final Context f108207b;

    /* renamed from: c */
    public final C39141kp f108208c;

    /* renamed from: d */
    private final C60887da f108209d;

    /* renamed from: e */
    private final C46175b f108210e;

    /* renamed from: f */
    private final C60887da f108211f;

    /* renamed from: g */
    private final boolean f108212g;

    /* renamed from: com.google.android.libraries.search.udcdataservice.ulr.g$a */
    /* compiled from: PG */
    interface C41428a {
        /* renamed from: gn */
        C41438q mo43953gn();
    }

    public C41427g(C39141kp kpVar, C60887da daVar, C60887da daVar2, C46175b bVar, Context context, boolean z) {
        this.f108209d = daVar;
        this.f108211f = daVar2;
        this.f108210e = bVar;
        this.f108207b = context;
        this.f108208c = kpVar;
        this.f108212g = z;
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        ((C19567d) this.f108208c.f103003db.mo6453a()).mo24822a(1, new Object[0]);
        if (!this.f108212g) {
            return C60866ct.f164955a;
        }
        C60870cx d = this.f108210e.mo50247d();
        C41425e eVar = new C41425e(this);
        C60870cx h = C60922j.m93045h(d, C47810es.m84966f(eVar), this.f108209d);
        C41426f fVar = new C41426f(this);
        return C60846c.m92878g(h, Exception.class, C47810es.m84963c(fVar), this.f108211f);
    }
}
