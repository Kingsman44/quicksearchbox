package androidx.p124l.p126b;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* renamed from: androidx.l.b.d */
/* compiled from: PG */
final class C2314d implements Callable {

    /* renamed from: a */
    final /* synthetic */ C2317g f6476a;

    public C2314d(C2317g gVar) {
        this.f6476a = gVar;
    }

    public final Object call() {
        Throwable th;
        Object obj;
        this.f6476a.f6483e.set(true);
        try {
            Process.setThreadPriority(10);
            obj = this.f6476a.mo5687a();
            try {
                Binder.flushPendingCommands();
                this.f6476a.mo5700d(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                try {
                    this.f6476a.f6482d.set(true);
                    throw th;
                } catch (Throwable th3) {
                    this.f6476a.mo5700d(obj);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            obj = null;
            this.f6476a.f6482d.set(true);
            throw th;
        }
    }
}
