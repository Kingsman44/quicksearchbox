package com.google.android.libraries.performance.primes.metrics.p2409d;

import android.app.Activity;
import com.google.android.libraries.performance.primes.p2398c.C31209a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.performance.primes.metrics.d.b */
/* compiled from: PG */
final class C31379b implements C31209a.C31213d, C31209a.C31212c {

    /* renamed from: a */
    private static final C59071e f84481a = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.d.b");

    /* renamed from: b */
    private final C68214a f84482b;

    /* renamed from: c */
    private boolean f84483c = false;

    /* renamed from: d */
    private Activity f84484d;

    public C31379b(C68214a aVar, C69464a aVar2, C58833ax axVar, Executor executor) {
        this.f84482b = aVar;
        executor.execute(new C31371a(this, aVar2, axVar));
    }

    /* renamed from: a */
    public synchronized void mo36926a(Activity activity) {
        this.f84484d = activity;
        if (this.f84483c) {
            ((C31390m) this.f84482b.mo27525b()).mo37097f(activity);
        }
    }

    /* renamed from: b */
    public synchronized void mo36940b(Activity activity) {
        if (!activity.equals(this.f84484d)) {
            ((C59052c) ((C59052c) f84481a.mo56226d()).mo56372aa(50380)).mo56354G("Activity mismatch (currentActivity=%s, activity=%s)", this.f84484d, activity);
        }
        if (this.f84483c) {
            ((C31390m) this.f84482b.mo27525b()).mo37095b(activity);
        }
        this.f84484d = null;
    }

    /* renamed from: c */
    public /* synthetic */ void mo37079c(C69464a aVar, C58833ax axVar) {
        if (((Boolean) aVar.mo17428b()).booleanValue()) {
            if (axVar.mo56113h() && !((Boolean) ((C69464a) axVar.mo56107c()).mo17428b()).booleanValue()) {
                return;
            }
        } else if (!axVar.mo56113h() || !((Boolean) ((C69464a) axVar.mo56107c()).mo17428b()).booleanValue()) {
            return;
        }
        synchronized (this) {
            this.f84483c = true;
            Activity activity = this.f84484d;
            if (activity != null) {
                mo36926a(activity);
            }
        }
    }
}
