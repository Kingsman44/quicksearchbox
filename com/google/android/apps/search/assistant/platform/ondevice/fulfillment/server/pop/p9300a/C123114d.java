package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import android.content.Context;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.android.libraries.assistant.gallium.framework.C18309l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.d */
/* compiled from: PG */
public final class C123114d {

    /* renamed from: a */
    public final Context f340752a;

    /* renamed from: b */
    public final String f340753b;

    /* renamed from: c */
    private final Executor f340754c;

    /* renamed from: d */
    private final boolean f340755d;

    public C123114d(Executor executor, Context context, boolean z, String str) {
        this.f340754c = executor;
        this.f340752a = context;
        this.f340755d = z;
        this.f340753b = str;
    }

    /* renamed from: a */
    public final C60870cx mo105890a(C18309l lVar, C18238f fVar) {
        if (!this.f340755d) {
            return C60866ct.f164955a;
        }
        C123086a aVar = new C123086a(this);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(aVar), this.f340754c);
        C123112b bVar = new C123112b(lVar, fVar);
        C60870cx h = C60922j.m93045h(m, C47810es.m84966f(bVar), this.f340754c);
        C123113c cVar = C123113c.f340751a;
        return C60922j.m93045h(h, C47810es.m84966f(cVar), C60826bg.f164896a);
    }
}
