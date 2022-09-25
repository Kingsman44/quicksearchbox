package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a;

import com.google.android.apps.gsa.binaries.satin.app.aqv;
import com.google.android.libraries.search.p2904c.p2908b.p2910b.C37378e;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.o */
/* compiled from: PG */
public final class C34517o {

    /* renamed from: a */
    public static final C59071e f91740a = C59071e.m91331h();

    /* renamed from: b */
    public final C37378e f91741b;

    /* renamed from: c */
    public final Executor f91742c;

    /* renamed from: d */
    public final C71422aw f91743d;

    /* renamed from: e */
    public final C69585o f91744e;

    public C34517o(C37378e eVar, aqv aqv, Executor executor, C71422aw awVar, C69585o oVar) {
        C69664n.m101061g(aqv, "contentPipeFactory");
        C69664n.m101061g(executor, "backgroundExecutor");
        C69664n.m101061g(awVar, "backgroundScope");
        C69664n.m101061g(oVar, "backgroundContext");
        this.f91741b = eVar;
        this.f91742c = executor;
        this.f91743d = awVar;
        this.f91744e = oVar;
    }
}
