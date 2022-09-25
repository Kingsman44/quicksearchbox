package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C4380ad;
import androidx.work.impl.C4620v;
import androidx.work.impl.p204a.C4442c;
import androidx.work.impl.p204a.C4444e;
import androidx.work.impl.p204a.p206b.C4441p;
import androidx.work.impl.p207b.C4470ae;
import androidx.work.impl.p207b.C4486au;
import androidx.work.impl.p207b.C4509r;
import androidx.work.impl.utils.C4590ak;
import androidx.work.impl.utils.p210b.C4595b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.background.systemalarm.h */
/* compiled from: PG */
public final class C4528h implements C4442c, C4590ak {

    /* renamed from: a */
    public static final String f14309a = C4380ad.m12561i("DelayMetCommandHandler");

    /* renamed from: b */
    public final Context f14310b;

    /* renamed from: c */
    public final int f14311c;

    /* renamed from: d */
    public final C4509r f14312d;

    /* renamed from: e */
    public final C4533m f14313e;

    /* renamed from: f */
    public final C4444e f14314f;

    /* renamed from: g */
    public int f14315g = 0;

    /* renamed from: h */
    public final Executor f14316h;

    /* renamed from: i */
    public final Executor f14317i;

    /* renamed from: j */
    public PowerManager.WakeLock f14318j;

    /* renamed from: k */
    public boolean f14319k = false;

    /* renamed from: l */
    public final C4620v f14320l;

    /* renamed from: m */
    private final Object f14321m = new Object();

    public C4528h(Context context, int i, C4533m mVar, C4620v vVar) {
        this.f14310b = context;
        this.f14311c = i;
        this.f14313e = mVar;
        this.f14312d = vVar.f14519a;
        this.f14320l = vVar;
        C4441p pVar = mVar.f14331e.f14150l;
        C4595b bVar = mVar.f14336j;
        this.f14316h = bVar.f14486a;
        this.f14317i = bVar.f14488c;
        this.f14314f = new C4444e(pVar, this);
    }

    /* renamed from: a */
    public final void mo9485a() {
        synchronized (this.f14321m) {
            this.f14314f.mo9390b();
            this.f14313e.f14329c.mo9547a(this.f14312d);
            PowerManager.WakeLock wakeLock = this.f14318j;
            if (wakeLock != null && wakeLock.isHeld()) {
                C4380ad h = C4380ad.m12560h();
                String str = f14309a;
                h.mo9309a(str, "Releasing wakelock " + this.f14318j + "for WorkSpec " + this.f14312d);
                this.f14318j.release();
            }
        }
    }

    /* renamed from: b */
    public final void mo9486b(C4509r rVar) {
        C4380ad h = C4380ad.m12560h();
        String str = f14309a;
        new StringBuilder("Exceeded time limits on execution for ").append(rVar);
        h.mo9309a(str, "Exceeded time limits on execution for ".concat(rVar.toString()));
        this.f14316h.execute(new C4526f(this));
    }

    /* renamed from: e */
    public final void mo9387e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C4486au.m12791a((C4470ae) it.next()).equals(this.f14312d)) {
                this.f14316h.execute(new C4527g(this));
                return;
            }
        }
    }

    /* renamed from: f */
    public final void mo9388f(List list) {
        this.f14316h.execute(new C4526f(this));
    }
}
