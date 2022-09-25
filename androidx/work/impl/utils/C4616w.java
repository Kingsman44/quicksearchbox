package androidx.work.impl.utils;

import androidx.work.C4406bc;
import androidx.work.impl.C4452ag;
import androidx.work.impl.C4620v;

/* renamed from: androidx.work.impl.utils.w */
/* compiled from: PG */
public final class C4616w implements Runnable {

    /* renamed from: a */
    private final C4452ag f14511a;

    /* renamed from: b */
    private final C4620v f14512b;

    /* renamed from: c */
    private final C4406bc f14513c;

    public C4616w(C4452ag agVar, C4620v vVar, C4406bc bcVar) {
        this.f14511a = agVar;
        this.f14512b = vVar;
        this.f14513c = bcVar;
    }

    public final void run() {
        this.f14511a.f14145g.mo9518g(this.f14512b);
    }
}
