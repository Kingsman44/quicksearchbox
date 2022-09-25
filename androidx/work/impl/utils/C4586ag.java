package androidx.work.impl.utils;

import android.content.Context;
import android.os.Build;
import androidx.work.C4378ab;
import androidx.work.C4380ad;
import androidx.work.C4636q;
import androidx.work.impl.p207b.C4470ae;
import androidx.work.impl.utils.p209a.C4579m;
import androidx.work.impl.utils.p210b.C4595b;

/* renamed from: androidx.work.impl.utils.ag */
/* compiled from: PG */
public final class C4586ag implements Runnable {

    /* renamed from: a */
    static final String f14460a = C4380ad.m12561i("WorkForegroundRunnable");

    /* renamed from: b */
    public final C4579m f14461b = new C4579m();

    /* renamed from: c */
    final Context f14462c;

    /* renamed from: d */
    final C4470ae f14463d;

    /* renamed from: e */
    final C4378ab f14464e;

    /* renamed from: f */
    final C4636q f14465f;

    /* renamed from: g */
    final C4595b f14466g;

    public C4586ag(Context context, C4470ae aeVar, C4378ab abVar, C4636q qVar, C4595b bVar) {
        this.f14462c = context;
        this.f14463d = aeVar;
        this.f14464e = abVar;
        this.f14465f = qVar;
        this.f14466g = bVar;
    }

    public final void run() {
        if (!this.f14463d.f14233r || Build.VERSION.SDK_INT >= 31) {
            this.f14461b.mo9537e((Object) null);
            return;
        }
        C4579m mVar = new C4579m();
        this.f14466g.f14488c.execute(new C4584ae(this, mVar));
        mVar.mo4106b(new C4585af(this, mVar), this.f14466g.f14488c);
    }
}
