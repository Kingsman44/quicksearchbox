package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c;

import com.google.speech.p5208h.C66611ci;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p5573a.C71348ab;
import kotlinx.coroutines.p5573a.C71350ad;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.c.e.a.c.u */
/* compiled from: PG */
public final class C17256u implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C71361ao f50030a;

    public C17256u(C71361ao aoVar) {
        this.f50030a = aoVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f50030a.mo62727D((Throwable) null);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, "throwable");
        this.f50030a.mo62727D(th);
    }

    /* renamed from: d */
    public final void mo20123c(C66611ci ciVar) {
        C69664n.m101061g(ciVar, "value");
        try {
            C71348ab.m103986d(C71350ad.m103990a(this.f50030a, ciVar));
        } catch (CancellationException unused) {
        }
    }
}
