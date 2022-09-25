package androidx.p182p.p183a;

import android.os.CancellationSignal;
import androidx.p104d.p105a.C2170i;
import androidx.p182p.C3925ah;
import androidx.p182p.C3930am;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: androidx.p.a.e */
/* compiled from: PG */
public final class C3917e {

    /* renamed from: a */
    private static final Executor f12531a = new C3916d();

    /* renamed from: a */
    public static C60870cx m11216a(Executor executor, Callable callable) {
        C2170i iVar = new C2170i();
        executor.execute(new C3915c(callable, iVar));
        return iVar;
    }

    /* renamed from: b */
    public static C60870cx m11217b(C3925ah ahVar, Callable callable, C3930am amVar, CancellationSignal cancellationSignal) {
        C60870cx a = m11216a(ahVar.mo8171O(), callable);
        C3913a aVar = new C3913a(a, cancellationSignal);
        Executor executor = f12531a;
        a.mo4106b(aVar, executor);
        a.mo4106b(new C3914b(amVar), executor);
        return a;
    }
}
