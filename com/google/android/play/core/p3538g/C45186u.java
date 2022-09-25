package com.google.android.play.core.p3538g;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.p3527b.C45051b;
import com.google.android.play.core.p3529c.C45053a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.google.android.play.core.g.u */
/* compiled from: PG */
public final class C45186u extends C45051b {

    /* renamed from: c */
    private static C45186u f117935c;

    /* renamed from: d */
    private final Handler f117936d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private final C45169d f117937e;

    /* renamed from: f */
    private final Set f117938f = new LinkedHashSet();

    public C45186u(Context context, C45169d dVar) {
        super(new C45053a("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f117937e = dVar;
    }

    /* renamed from: f */
    public static synchronized C45186u m80446f(Context context) {
        C45186u uVar;
        synchronized (C45186u.class) {
            if (f117935c == null) {
                f117935c = new C45186u(context, C45176k.f117918a);
            }
            uVar = f117935c;
        }
        return uVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48865a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra != null) {
            C45137aw j = C45137aw.m80340j(bundleExtra);
            this.f117689a.mo48883a("ListenerRegistryBroadcastReceiver.onReceive: %s", j);
            C45170e a = this.f117937e.mo49010a();
            C45113a aVar = (C45113a) j;
            if (aVar.f117788b != 3 || a == null) {
                mo49016g(j);
            } else {
                a.mo48917b(aVar.f117794h, new C45184s(this, j, intent, context));
            }
        }
    }

    /* renamed from: g */
    public final synchronized void mo49016g(C45137aw awVar) {
        Iterator it = new LinkedHashSet(this.f117938f).iterator();
        while (it.hasNext()) {
            ((C45140az) it.next()).mo33446a(awVar);
        }
        super.mo48881d(awVar);
    }

    /* renamed from: h */
    public final void mo49017h(C45137aw awVar, int i, int i2) {
        this.f117936d.post(new C45185t(this, awVar, i, i2));
    }
}
