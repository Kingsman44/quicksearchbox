package com.google.android.apps.gsa.p6467p;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.p.d */
/* compiled from: PG */
public final class C84040d {

    /* renamed from: a */
    public final Context f228912a;

    /* renamed from: b */
    private final C86034c f228913b;

    /* renamed from: c */
    private final Executor f228914c;

    public C84040d(Context context, C86034c cVar, Executor executor) {
        this.f228912a = context;
        this.f228913b = cVar;
        this.f228914c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo77502a() {
        return C47633f.m84733g(this.f228913b.mo79697b()).mo51516i(new C84038b(this), this.f228914c);
    }
}
