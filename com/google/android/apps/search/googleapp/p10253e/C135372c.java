package com.google.android.apps.search.googleapp.p10253e;

import com.google.android.apps.gsa.p8867w.p8879i.p8881b.C118801a;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.search.googleapp.discover.p10182e.p10183a.C134246i;
import com.google.android.apps.search.googleapp.discover.p10182e.p10183a.C134247j;
import com.google.android.apps.search.googleapp.discover.p10182e.p10183a.C134248k;
import com.google.android.libraries.storage.protostore.C43019v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62934bn;
import com.google.protobuf.MessageLite;
import com.google.protobuf.p4750c.p4751a.C62949a;
import java.util.concurrent.Executor;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.e.c */
/* compiled from: PG */
public final class C135372c implements C43019v {

    /* renamed from: a */
    public final C58528ij f368839a;

    /* renamed from: b */
    private final Executor f368840b;

    /* renamed from: c */
    private final C118801a f368841c;

    public C135372c(C118801a aVar, Executor executor, C58528ij ijVar) {
        this.f368841c = aVar;
        this.f368840b = executor;
        this.f368839a = ijVar;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final C60870cx mo18055b(MessageLite messageLite) {
        C86338r rVar = this.f368841c.f331368a;
        C58528ij ijVar = this.f368839a;
        C134248k kVar = (C134248k) messageLite;
        C69664n.m101061g(kVar, "proto");
        C58838bb.m90873h(((C58759qy) ijVar).f156534a.equals(C90507o.f253034x), "Can't access key outside migration: %s", C90507o.f253034x);
        long j = rVar.getLong(C90507o.f253034x, 0);
        C62934bn builder = kVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C134246i a = C69664n.m101061g((C134247j) builder, "builder");
        Instant ofEpochMilli = Instant.ofEpochMilli(j);
        C69664n.m101060f(ofEpochMilli, "ofEpochMilli(firstApplicationLaunchMs)");
        a.mo111661b(C62949a.m95467b(ofEpochMilli));
        return C60856cj.m92900i(a.mo111660a());
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        C135371b bVar = new C135371b(this, this.f368841c.f331368a);
        return C60856cj.m92904m(C47810es.m84978r(bVar), this.f368840b);
    }
}
