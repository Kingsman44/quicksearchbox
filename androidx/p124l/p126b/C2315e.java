package androidx.p124l.p126b;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: androidx.l.b.e */
/* compiled from: PG */
final class C2315e extends FutureTask {

    /* renamed from: a */
    final /* synthetic */ C2317g f6477a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2315e(C2317g gVar, Callable callable) {
        super(callable);
        this.f6477a = gVar;
    }

    /* access modifiers changed from: protected */
    public final void done() {
        try {
            this.f6477a.mo5701e(get());
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException unused) {
            this.f6477a.mo5701e((Object) null);
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
