package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.p4751a.C62949a;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.ap */
/* compiled from: PG */
public final class C33776ap {

    /* renamed from: a */
    public static final C58974d f90220a = C58974d.m91134h("ApaViHandler");

    /* renamed from: b */
    public final C21370a f90221b;

    /* renamed from: c */
    public final Duration f90222c;

    /* renamed from: d */
    public final AtomicReference f90223d = new AtomicReference((Object) null);

    public C33776ap(C21370a aVar, C62910ar arVar) {
        C69664n.m101061g(aVar, "clock");
        this.f90221b = aVar;
        this.f90222c = C62949a.m95468c(arVar);
    }

    /* renamed from: a */
    public final void mo39075a() {
        this.f90223d.set(Duration.ofMillis(this.f90221b.mo26871c()));
        this.f90223d.get();
    }
}
