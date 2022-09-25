package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2682f;

import java.io.Closeable;
import java.util.Set;
import kotlinx.coroutines.p5574b.C71548cy;
import p5462h.C69685i;
import p5462h.p5463a.C69514bd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.f.o */
/* compiled from: PG */
final class C34625o implements Closeable {

    /* renamed from: a */
    final /* synthetic */ C34632v f91950a;

    /* renamed from: b */
    final /* synthetic */ long f91951b;

    /* renamed from: c */
    final /* synthetic */ C34623m f91952c;

    public C34625o(C34632v vVar, long j, C34623m mVar) {
        this.f91950a = vVar;
        this.f91951b = j;
        this.f91952c = mVar;
    }

    public final void close() {
        Object e;
        C71548cy cyVar = this.f91950a.f91964b;
        long j = this.f91951b;
        C34623m mVar = this.f91952c;
        do {
            e = cyVar.mo62784e();
        } while (!cyVar.mo62808g(e, C69514bd.m100890d((Set) e, new C69685i(Long.valueOf(j), mVar))));
    }
}
