package com.google.android.libraries.search.assistant.p2716p.p2717a.p2718a.p2719a;

import android.content.Context;
import com.google.android.libraries.assistant.gallium.framework.p1507b.C18226d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3795af.p3799c.p3800a.p3801a.p3802a.C48778a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.search.assistant.p.a.a.a.b */
/* compiled from: PG */
public final class C34922b {

    /* renamed from: a */
    private final Context f92579a;

    /* renamed from: b */
    private final C60887da f92580b;

    /* renamed from: c */
    private C18226d f92581c = null;

    public C34922b(Context context, C60887da daVar) {
        this.f92579a = context;
        this.f92580b = daVar;
    }

    /* renamed from: a */
    public final synchronized C18226d mo39634a() {
        if (this.f92581c == null) {
            this.f92581c = new C48778a(this.f92579a);
        }
        return this.f92581c;
    }

    /* renamed from: b */
    public final C60870cx mo39635b() {
        C34921a aVar = new C34921a(this);
        return C60856cj.m92904m(C47810es.m84978r(aVar), this.f92580b);
    }
}
