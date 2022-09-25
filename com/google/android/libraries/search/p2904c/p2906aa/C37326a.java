package com.google.android.libraries.search.p2904c.p2906aa;

import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37819l;
import java.util.concurrent.Executor;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.aa.a */
/* compiled from: PG */
public final class C37326a implements C37362b {

    /* renamed from: a */
    final /* synthetic */ Executor f99166a;

    /* renamed from: b */
    final /* synthetic */ C71361ao f99167b;

    public C37326a(C71361ao aoVar, Executor executor) {
        this.f99167b = aoVar;
        this.f99166a = executor;
    }

    /* renamed from: b */
    public final void mo39010b(C37819l lVar) {
        C69664n.m101061g(lVar, "audioData");
        this.f99167b.mo62730w(lVar);
        if (lVar.f100343b == 2) {
            this.f99167b.mo62727D((Throwable) null);
        }
    }

    /* renamed from: k */
    public final Executor mo39011k() {
        return this.f99166a;
    }
}
