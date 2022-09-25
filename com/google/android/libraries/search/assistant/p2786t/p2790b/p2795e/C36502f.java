package com.google.android.libraries.search.assistant.p2786t.p2790b.p2795e;

import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.search.assistant.t.b.e.f */
/* compiled from: PG */
final class C36502f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C36499c f95265a;

    /* renamed from: b */
    final /* synthetic */ C58872ci f95266b;

    /* renamed from: c */
    final /* synthetic */ int f95267c;

    /* renamed from: d */
    final /* synthetic */ C36503g f95268d;

    public C36502f(C36503g gVar, C36499c cVar, C58872ci ciVar, int i) {
        this.f95268d = gVar;
        this.f95265a = cVar;
        this.f95266b = ciVar;
        this.f95267c = i;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f95268d.mo40206c(new C36497a(this.f95265a, th instanceof CancellationException ? C36500d.CANCELLED : C36500d.FAILED), this.f95266b, this.f95267c);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f95268d.mo40206c(new C36497a(this.f95265a, C36500d.SUCCEEDED), this.f95266b, this.f95267c);
    }
}
