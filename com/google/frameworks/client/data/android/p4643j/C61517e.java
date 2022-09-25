package com.google.frameworks.client.data.android.p4643j;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70906u;

/* renamed from: com.google.frameworks.client.data.android.j.e */
/* compiled from: PG */
final class C61517e extends C70906u {

    /* renamed from: a */
    private final Object f166309a = new Object();

    /* renamed from: b */
    private long f166310b;

    /* renamed from: c */
    private long f166311c;

    /* renamed from: d */
    private final C61516d f166312d;

    public C61517e(C61516d dVar) {
        this.f166312d = dVar;
    }

    /* renamed from: b */
    public final void mo46271b(long j) {
        synchronized (this.f166309a) {
            this.f166311c += j;
        }
    }

    /* renamed from: c */
    public final void mo46272c(long j) {
        synchronized (this.f166309a) {
            this.f166310b += j;
        }
    }

    /* renamed from: e */
    public final void mo58103e() {
        synchronized (this.f166309a) {
            C61516d dVar = this.f166312d;
            long j = this.f166310b;
            boolean z = true;
            C58838bb.m90869d(j >= 0, "Cannot record negative request bytes.");
            dVar.f166305j.add(Long.valueOf(j));
            C61516d dVar2 = this.f166312d;
            long j2 = this.f166311c;
            if (j2 < 0) {
                z = false;
            }
            C58838bb.m90869d(z, "Cannot record negative response bytes.");
            dVar2.f166306k.add(Long.valueOf(j2));
        }
    }
}
