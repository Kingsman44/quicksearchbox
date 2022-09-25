package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9099b.p9101b;

import com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120601c;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120609d;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120580d;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.C120643b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.b.b.e */
/* compiled from: PG */
public final class C120595e implements C120609d {

    /* renamed from: a */
    final /* synthetic */ C120643b f335427a;

    /* renamed from: b */
    final /* synthetic */ Executor f335428b;

    /* renamed from: c */
    final /* synthetic */ C120580d f335429c;

    /* renamed from: d */
    final /* synthetic */ C60870cx f335430d;

    public C120595e(C120643b bVar, Executor executor, C120580d dVar, C60870cx cxVar) {
        this.f335427a = bVar;
        this.f335428b = executor;
        this.f335429c = dVar;
        this.f335430d = cxVar;
    }

    /* renamed from: a */
    public final C120601c mo104698a() {
        C120601c a = this.f335427a.mo104698a();
        C69664n.m101060f(a, "it.prefetchResult()");
        return a;
    }

    /* renamed from: b */
    public final C60870cx mo104699b() {
        return C47633f.m84733g(this.f335427a.mo104699b()).mo51514f(Exception.class, new C120594d(this.f335429c, this.f335430d), this.f335428b);
    }
}
