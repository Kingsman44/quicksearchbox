package androidx.p182p;

import android.os.SystemClock;
import androidx.p186q.p187a.C4049d;
import p5462h.C69788q;

/* renamed from: androidx.p.b */
/* compiled from: PG */
public final /* synthetic */ class C3936b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3938c f12595a;

    public /* synthetic */ C3936b(C3938c cVar) {
        this.f12595a = cVar;
    }

    public final void run() {
        C69788q qVar;
        C3938c cVar = this.f12595a;
        synchronized (cVar.f12600c) {
            if (SystemClock.uptimeMillis() - cVar.f12604g >= cVar.f12601d) {
                if (cVar.f12603f == 0) {
                    Runnable runnable = cVar.f12599b;
                    if (runnable != null) {
                        ((C3967t) runnable).f12671a.mo8311a();
                        qVar = C69788q.f186170a;
                    } else {
                        qVar = null;
                    }
                    if (qVar != null) {
                        C4049d dVar = cVar.f12605h;
                        if (dVar != null && dVar.mo8252k()) {
                            dVar.close();
                        }
                        cVar.f12605h = null;
                        return;
                    }
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
            }
        }
    }
}
