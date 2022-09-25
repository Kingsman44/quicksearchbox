package androidx.work.impl.utils;

import androidx.work.C4384ah;
import androidx.work.C4388al;
import androidx.work.impl.C4452ag;
import androidx.work.impl.C4558n;

/* renamed from: androidx.work.impl.utils.s */
/* compiled from: PG */
public final class C4612s implements Runnable {

    /* renamed from: a */
    public final C4558n f14503a = new C4558n();

    /* renamed from: b */
    private final C4452ag f14504b;

    public C4612s(C4452ag agVar) {
        this.f14504b = agVar;
    }

    public final void run() {
        try {
            this.f14504b.f14143e.mo9364F().mo9435o();
            this.f14503a.mo9510b(C4388al.f14014a);
        } catch (Throwable th) {
            this.f14503a.mo9510b(new C4384ah(th));
        }
    }
}
