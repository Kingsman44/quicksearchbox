package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a;

import com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120601c;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.android.libraries.search.assistant.p2511d.C32542e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.d.a.u */
/* compiled from: PG */
public final class C120637u implements C120601c {

    /* renamed from: a */
    public final C32534ai f335556a;

    /* renamed from: b */
    public final C71816z f335557b = new C71816z();

    public C120637u(C71422aw awVar, Executor executor) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f335556a = new C32534ai(executor);
    }

    /* renamed from: a */
    public final C60870cx mo104690a(C32542e eVar) {
        C69664n.m101061g(eVar, "consumer");
        return this.f335556a.mo38133a(eVar);
    }
}
