package com.google.android.libraries.notifications.p2301l.p2304b;

import android.content.BroadcastReceiver;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.p2266c.C29782a;
import com.google.android.libraries.notifications.p2266c.C29783b;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;
import p5304e.p5305a.p5306a.p5383k.p5384a.C68792a;

/* renamed from: com.google.android.libraries.notifications.l.b.c */
/* compiled from: PG */
public final class C30053c implements C29783b {

    /* renamed from: a */
    private final C60887da f81315a;

    /* renamed from: b */
    private final C46459k f81316b;

    /* renamed from: c */
    private final C46428ao f81317c;

    public C30053c(C60887da daVar, C46459k kVar, C46428ao aoVar) {
        this.f81315a = daVar;
        this.f81316b = kVar;
        this.f81317c = aoVar;
    }

    /* renamed from: a */
    public final C60870cx mo34979a(Callable callable) {
        return this.f81315a.mo19399b(C47810es.m84978r(callable));
    }

    /* renamed from: b */
    public final void mo34980b(Runnable runnable) {
        this.f81315a.execute(C47810es.m84977q(runnable));
    }

    /* renamed from: c */
    public final void mo34981c(BroadcastReceiver.PendingResult pendingResult, boolean z, Runnable runnable, C30007h hVar) {
        int hashCode = runnable.hashCode();
        C30058b.m55793e("ChimeExecutorApiImpl-Tiktok", "Submitting Broadcast execution [%d] to tiktok executor.", Integer.valueOf(hashCode));
        C60870cx a = this.f81315a.mo19398a(C47810es.m84977q(runnable));
        C46459k kVar = this.f81316b;
        kVar.mo50456d(a, C47831fm.m85015j());
        kVar.mo50457e(a, 60, TimeUnit.SECONDS);
        boolean c = C68792a.m99309c();
        C29782a aVar = new C29782a(pendingResult, z, hashCode);
        if (c && !hVar.mo35312f()) {
            C46428ao aoVar = this.f81317c;
            Objects.requireNonNull(aVar);
            aoVar.postDelayed(new C30051a(aVar), hVar.mo35310c());
        }
        a.mo4106b(new C30052b(c, aVar, z, pendingResult, hashCode), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo34982d(Runnable runnable) {
        C60870cx a = this.f81315a.mo19398a(C47810es.m84977q(runnable));
        C46459k kVar = this.f81316b;
        String j = C47831fm.m85015j();
        kVar.mo50455c(a, j);
        kVar.mo50456d(a, j);
        kVar.mo50457e(a, 60, TimeUnit.SECONDS);
    }
}
