package androidx.camera.core;

import androidx.camera.core.p069a.p070a.p072b.C1255d;
import java.util.concurrent.CancellationException;

/* renamed from: androidx.camera.core.bn */
/* compiled from: PG */
final class C1468bn implements C1255d {

    /* renamed from: a */
    final /* synthetic */ C1469bo f4044a;

    public C1468bn(C1469bo boVar) {
        this.f4044a = boVar;
    }

    /* renamed from: a */
    public final void mo3794a(Throwable th) {
        synchronized (this.f4044a.f4049e) {
            if (th instanceof CancellationException) {
                C1469bo boVar = this.f4044a;
                boVar.f4046b = null;
                boVar.f4047c = null;
                boVar.mo4350b();
            } else {
                C1470bp.m3947n(th);
                th.getMessage();
                throw null;
            }
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3795b(Object obj) {
        C1473bs bsVar = (C1473bs) obj;
        synchronized (this.f4044a.f4049e) {
            bsVar.getClass();
            new C1530dg(bsVar).mo4307g(this.f4044a);
            this.f4044a.f4048d++;
            throw null;
        }
    }
}
