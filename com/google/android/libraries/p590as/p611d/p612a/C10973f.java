package com.google.android.libraries.p590as.p611d.p612a;

import android.content.Context;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.as.d.a.f */
/* compiled from: PG */
public final class C10973f {

    /* renamed from: a */
    public static final C59071e f36103a = C59071e.m91332i("com.google.android.libraries.as.d.a.f");

    /* renamed from: b */
    public final Context f36104b;

    /* renamed from: c */
    public C10971d f36105c;

    /* renamed from: d */
    private final C60887da f36106d;

    public C10973f(Context context, C60887da daVar) {
        this.f36104b = context;
        this.f36106d = daVar;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo19350a() {
        C10971d dVar = this.f36105c;
        if (dVar == null) {
            return this.f36106d.mo19399b(C47810es.m84978r(new C10972e(this)));
        }
        return C60856cj.m92900i(dVar);
    }
}
