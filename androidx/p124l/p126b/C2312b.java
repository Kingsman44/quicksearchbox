package androidx.p124l.p126b;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import java.util.concurrent.Executor;

/* renamed from: androidx.l.b.b */
/* compiled from: PG */
public class C2312b extends C2313c {

    /* renamed from: a */
    public volatile C2311a f6466a;

    /* renamed from: b */
    public volatile C2311a f6467b;

    /* renamed from: j */
    private Executor f6468j;

    public C2312b(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo5691a() {
        if (this.f6467b == null && this.f6466a != null) {
            boolean z = this.f6466a.f6464a;
            if (this.f6468j == null) {
                this.f6468j = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            C2311a aVar = this.f6466a;
            Executor executor = this.f6468j;
            if (aVar.f6484f != 1) {
                int i = aVar.f6484f;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                } else if (i2 == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                } else if (i2 != 2) {
                    throw new IllegalStateException("We should never reach this state");
                } else {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                aVar.f6484f = 2;
                executor.execute(aVar.f6481c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5692b(C2311a aVar) {
        if (this.f6467b == aVar) {
            SystemClock.uptimeMillis();
            this.f6467b = null;
            mo5691a();
        }
    }

    /* renamed from: c */
    public final void mo5693c() {
        if (this.f6466a != null) {
            if (!this.f6471e) {
                this.f6474h = true;
            }
            if (this.f6467b != null) {
                boolean z = this.f6466a.f6464a;
                this.f6466a = null;
                return;
            }
            boolean z2 = this.f6466a.f6464a;
            C2311a aVar = this.f6466a;
            aVar.f6482d.set(true);
            if (aVar.f6481c.cancel(false)) {
                this.f6467b = this.f6466a;
            }
            this.f6466a = null;
        }
    }
}
