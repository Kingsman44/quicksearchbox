package com.google.android.apps.search.googleapp.discover.p10203o;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4580v.C60950i;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.o.d */
/* compiled from: PG */
public final class C134475d {

    /* renamed from: a */
    public static final Duration f366232a = Duration.ofMinutes(15);

    /* renamed from: b */
    public final C42876ab f366233b;

    /* renamed from: c */
    public final Executor f366234c;

    /* renamed from: d */
    public final C69585o f366235d;

    /* renamed from: e */
    public final C60950i f366236e;

    public C134475d(C42876ab abVar, Executor executor, C69585o oVar, C60950i iVar) {
        C69664n.m101061g(abVar, "store");
        C69664n.m101061g(executor, "executor");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(iVar, "timeSource");
        this.f366233b = abVar;
        this.f366234c = executor;
        this.f366235d = oVar;
        this.f366236e = iVar;
    }
}
