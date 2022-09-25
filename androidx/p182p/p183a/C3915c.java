package androidx.p182p.p183a;

import androidx.p104d.p105a.C2170i;
import java.util.concurrent.Callable;

/* renamed from: androidx.p.a.c */
/* compiled from: PG */
final class C3915c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Callable f12529a;

    /* renamed from: b */
    final /* synthetic */ C2170i f12530b;

    public C3915c(Callable callable, C2170i iVar) {
        this.f12529a = callable;
        this.f12530b = iVar;
    }

    public final void run() {
        try {
            this.f12530b.mo5422f(this.f12529a.call());
        } catch (Throwable th) {
            this.f12530b.mo5423g(th);
        }
    }
}
