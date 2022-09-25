package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a;

import com.google.android.apps.gsa.binaries.satin.app.ask;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.a.a.d */
/* compiled from: PG */
public final class C33643d {

    /* renamed from: a */
    public final C34053bp f89897a;

    /* renamed from: b */
    public final C71422aw f89898b;

    /* renamed from: c */
    public final Executor f89899c;

    /* renamed from: d */
    public final ask f89900d;

    public C33643d(C34053bp bpVar, ask ask, C71422aw awVar, Executor executor) {
        C69664n.m101061g(bpVar, "invocationToken");
        C69664n.m101061g(ask, "audioInputSessionImplFactory");
        C69664n.m101061g(awVar, "blockingScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f89897a = bpVar;
        this.f89900d = ask;
        this.f89898b = awVar;
        this.f89899c = executor;
    }
}
