package com.google.android.apps.search.assistant.platform.p9141h.p9152d;

import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.h.d.b */
/* compiled from: PG */
public final class C121042b {

    /* renamed from: a */
    public static final C59071e f336430a = C59071e.m91331h();

    /* renamed from: b */
    public final C121048h f336431b;

    /* renamed from: c */
    private final C71422aw f336432c;

    public C121042b(C121048h hVar, C71422aw awVar, Executor executor) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f336431b = hVar;
        this.f336432c = awVar;
    }

    /* renamed from: a */
    public final void mo105031a(String str) {
        C69664n.m101061g(str, "sharedPreferenceValue");
        C71803m.m105043d(this.f336432c, (C69585o) null, (C71424ay) null, new C121037a(this, str, (C69577g) null), 3);
    }
}
