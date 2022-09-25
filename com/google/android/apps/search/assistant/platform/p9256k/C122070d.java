package com.google.android.apps.search.assistant.platform.p9256k;

import com.google.android.libraries.social.populous.android.C42181t;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.p5573a.C71348ab;
import kotlinx.coroutines.p5573a.C71350ad;
import kotlinx.coroutines.p5573a.C71354ah;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.k.d */
/* compiled from: PG */
public final class C122070d implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f338670a;

    /* renamed from: b */
    final /* synthetic */ C71361ao f338671b;

    public C122070d(C71361ao aoVar, AtomicBoolean atomicBoolean) {
        this.f338671b = aoVar;
        this.f338670a = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f338670a.set(true);
        this.f338671b.mo62727D((Throwable) null);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        this.f338671b.mo62727D(th);
    }

    /* renamed from: c */
    public final void mo20123c(Object obj) {
        try {
            C71348ab.m103986d(C71350ad.m103990a(this.f338671b, obj));
        } catch (C71354ah unused) {
        }
    }
}
