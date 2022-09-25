package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.C4380ad;
import androidx.work.impl.C4452ag;
import androidx.work.impl.C4539d;
import androidx.work.impl.C4562r;
import androidx.work.impl.C4621w;
import androidx.work.impl.p207b.C4509r;
import androidx.work.impl.utils.C4582ac;
import androidx.work.impl.utils.C4592am;
import androidx.work.impl.utils.p210b.C4595b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.m */
/* compiled from: PG */
public final class C4533m implements C4539d {

    /* renamed from: a */
    static final String f14327a = C4380ad.m12561i("SystemAlarmDispatcher");

    /* renamed from: b */
    final Context f14328b;

    /* renamed from: c */
    public final C4592am f14329c;

    /* renamed from: d */
    public final C4562r f14330d;

    /* renamed from: e */
    public final C4452ag f14331e;

    /* renamed from: f */
    final C4523c f14332f;

    /* renamed from: g */
    final List f14333g = new ArrayList();

    /* renamed from: h */
    Intent f14334h = null;

    /* renamed from: i */
    public C4531k f14335i;

    /* renamed from: j */
    final C4595b f14336j;

    /* renamed from: k */
    private final C4621w f14337k;

    public C4533m(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f14328b = applicationContext;
        C4621w wVar = new C4621w();
        this.f14337k = wVar;
        this.f14332f = new C4523c(applicationContext, wVar);
        C4452ag j = C4452ag.m12686j(context);
        this.f14331e = j;
        this.f14329c = new C4592am(j.f14142d.f14065e);
        C4562r rVar = j.f14145g;
        this.f14330d = rVar;
        this.f14336j = j.f14151m;
        rVar.mo9514b(this);
    }

    /* renamed from: e */
    public static final void m12887e() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: a */
    public final void mo9473a(C4509r rVar, boolean z) {
        this.f14336j.f14488c.execute(new C4530j(this, C4523c.m12876d(this.f14328b, rVar, z), 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9490b() {
        C4380ad.m12560h().mo9309a(f14327a, "Destroying SystemAlarmDispatcher");
        this.f14330d.mo9515c(this);
        this.f14335i = null;
    }

    /* renamed from: c */
    public final void mo9491c() {
        m12887e();
        PowerManager.WakeLock a = C4582ac.m12985a(this.f14328b, "ProcessCommand");
        try {
            a.acquire();
            C4595b bVar = this.f14331e.f14151m;
            bVar.f14486a.execute(new C4529i(this));
        } finally {
            a.release();
        }
    }

    /* renamed from: d */
    public final void mo9492d(Intent intent, int i) {
        C4380ad h = C4380ad.m12560h();
        String str = f14327a;
        h.mo9309a(str, "Adding command " + intent + " (" + i + ")");
        m12887e();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C4380ad.m12560h().mo9314f(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m12887e();
            synchronized (this.f14333g) {
                for (Intent action2 : this.f14333g) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(action2.getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f14333g) {
            boolean z = !this.f14333g.isEmpty();
            this.f14333g.add(intent);
            if (!z) {
                mo9491c();
            }
        }
    }
}
