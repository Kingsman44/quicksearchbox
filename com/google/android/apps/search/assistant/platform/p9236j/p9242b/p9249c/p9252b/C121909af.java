package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33562c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.af */
/* compiled from: PG */
public final class C121909af implements C33562c {

    /* renamed from: a */
    public C121916am f338293a;

    /* renamed from: b */
    public final long f338294b;

    /* renamed from: c */
    private final Executor f338295c;

    public C121909af(C121916am amVar, Executor executor, long j) {
        C69664n.m101061g(executor, "uiExecutor");
        this.f338293a = amVar;
        this.f338295c = executor;
        this.f338294b = j;
    }

    /* renamed from: a */
    public final C60870cx mo38981a() {
        C121908ae aeVar = new C121908ae(this);
        return C60856cj.m92903l(C47810es.m84977q(aeVar), this.f338295c);
    }
}
