package com.google.android.apps.search.podcasts.p10573k.p10574a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.podcasts.k.a.j */
/* compiled from: PG */
final class C140431j implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C140433l f381455a;

    public C140431j(C140433l lVar) {
        this.f381455a = lVar;
    }

    /* renamed from: a */
    public final void mo115668a(long j) {
        C46459k.m82829b(this.f381455a.f381467i.mo29164d(C47810es.m84977q(new C140430i(this, C47810es.m84977q(new C140429h(this)))), j, TimeUnit.MILLISECONDS), "Failed to schedule service unbinding. ", new Object[0]);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f381455a.f381468j.execute(C47810es.m84977q(new C140428g(this, iBinder)));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f381455a.f381468j.execute(C47810es.m84977q(new C140427f(this)));
    }
}
