package com.google.android.libraries.web.contrib.p3384g.p3385a.p3387b;

import android.content.Context;
import com.google.android.libraries.web.contrib.p3384g.C43582c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.web.contrib.g.a.b.c */
/* compiled from: PG */
public final class C43577c implements C43582c {

    /* renamed from: a */
    public final Context f113765a;

    /* renamed from: b */
    private final C60887da f113766b;

    /* renamed from: c */
    private final AtomicBoolean f113767c = new AtomicBoolean(false);

    public C43577c(Context context, C60887da daVar) {
        this.f113765a = context;
        this.f113766b = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo46627a() {
        if (!this.f113767c.getAndSet(true)) {
            return this.f113766b.mo19399b(C47810es.m84978r(new C43576b(this)));
        }
        return C60866ct.f164955a;
    }
}
