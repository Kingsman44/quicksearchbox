package com.google.apps.tiktok.concurrent;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.Process;
import com.google.android.libraries.p11012aj.C147605d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;

/* renamed from: com.google.apps.tiktok.concurrent.k */
/* compiled from: PG */
public final class C46459k {

    /* renamed from: a */
    public static final C59071e f121564a = C59071e.m91332i("com.google.apps.tiktok.concurrent.k");

    /* renamed from: b */
    public final C46460l f121565b;

    /* renamed from: c */
    public final Context f121566c;

    /* renamed from: d */
    public final Map f121567d;

    /* renamed from: e */
    public final C46472x f121568e;

    /* renamed from: f */
    public final C147605d f121569f;

    /* renamed from: g */
    private final PowerManager f121570g;

    /* renamed from: h */
    private final C60887da f121571h;

    /* renamed from: i */
    private final C60888db f121572i;

    /* renamed from: j */
    private final C60888db f121573j;

    /* renamed from: k */
    private final C58881cr f121574k = C58886cw.m90973a(new C46433e(this));

    /* renamed from: l */
    private boolean f121575l = false;

    public C46459k(Context context, PowerManager powerManager, C46460l lVar, C60887da daVar, C46472x xVar, Map map, C60888db dbVar, C60888db dbVar2, C147605d dVar) {
        this.f121566c = context;
        this.f121570g = powerManager;
        this.f121571h = daVar;
        this.f121572i = dbVar;
        this.f121573j = dbVar2;
        this.f121565b = lVar;
        this.f121567d = map;
        this.f121568e = xVar;
        this.f121569f = dVar;
    }

    /* renamed from: a */
    static /* synthetic */ void m82828a(C60870cx cxVar, String str, Object[] objArr) {
        try {
            C60856cj.m92909r(cxVar);
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) f121564a.mo56225c()).mo56382g(e.getCause())).mo56372aa(54725)).mo56368U(str, objArr);
        } catch (CancellationException unused) {
        }
    }

    /* renamed from: b */
    public static void m82829b(C60870cx cxVar, String str, Object... objArr) {
        cxVar.mo4106b(C47810es.m84977q(new C46457i(cxVar, str, objArr)), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo50455c(C60870cx cxVar, String str) {
        long j;
        Intent intent = (Intent) this.f121574k.mo6453a();
        if (!cxVar.isDone()) {
            C46460l lVar = this.f121565b;
            lVar.f121580e.put(cxVar, str);
            while (true) {
                long j2 = lVar.f121578c.get();
                int i = (int) (j2 >> 32);
                if (i == 0) {
                    int i2 = ((int) (j2 & 4294967295L)) + 1;
                    j = ((long) i2) | 4294967296L;
                    if (lVar.f121578c.compareAndSet(j2, j)) {
                        synchronized (lVar.f121579d) {
                            lVar.f121581f.put(i2, new SettableFuture());
                        }
                        if (lVar.f121584i.startService(intent.cloneFilter().putExtra("EXTRA_FUTURE_INDEX", i2).putExtra("EXTRA_PROCESS_UUID", lVar.f121583h.getMostSignificantBits()).putExtra("EXTRA_PROCESS_UUID2", lVar.f121583h.getLeastSignificantBits()).putExtra("EXTRA_PROCESS_PID", Process.myPid())) == null) {
                            ((C59052c) ((C59052c) C46460l.f121576a.mo56225c()).mo56372aa(54726)).mo56386p("startService() returned null");
                        }
                    }
                } else {
                    j = C46460l.m82834a(i + 1, j2);
                    if (lVar.f121578c.compareAndSet(j2, j)) {
                        break;
                    }
                }
            }
            cxVar.mo4106b(new C46456h(this, cxVar, (int) (j & 4294967295L)), C60826bg.f164896a);
        }
    }

    /* renamed from: d */
    public final void mo50456d(C60870cx cxVar, String str) {
        if (!cxVar.isDone()) {
            try {
                PowerManager.WakeLock newWakeLock = this.f121570g.newWakeLock(1, str);
                newWakeLock.acquire();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                C60870cx j = C60856cj.m92901j(cxVar);
                C60856cj.m92911t(C60856cj.m92908q(j, 45, timeUnit, this.f121572i), C47810es.m84974n(new C46458j(j, str)), C60826bg.f164896a);
                C60870cx q = C60856cj.m92908q(C60856cj.m92901j(cxVar), 3600, TimeUnit.SECONDS, this.f121573j);
                Objects.requireNonNull(newWakeLock);
                q.mo4106b(new C46432d(newWakeLock), C60826bg.f164896a);
            } catch (SecurityException e) {
                if (!this.f121575l) {
                    try {
                        PackageInfo packageInfo = this.f121566c.getPackageManager().getPackageInfo(this.f121566c.getPackageName(), 4096);
                        if (packageInfo.requestedPermissions != null) {
                            for (String equals : packageInfo.requestedPermissions) {
                                if ("android.permission.WAKE_LOCK".equals(equals)) {
                                    this.f121575l = true;
                                    ((C59052c) ((C59052c) ((C59052c) f121564a.mo56225c()).mo56382g(e)).mo56372aa(54723)).mo56386p("Failed to acquire wakelock");
                                    return;
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(e, new Object[]{e2});
                        } catch (Exception unused) {
                        }
                    }
                    throw e;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo50457e(C60870cx cxVar, long j, TimeUnit timeUnit) {
        cxVar.mo4106b(C47810es.m84977q(new C46455g(this.f121572i.mo29164d(C47810es.m84977q(new C46434f(cxVar, j, timeUnit)), j, timeUnit), cxVar)), this.f121571h);
    }

    /* renamed from: f */
    public final void mo50458f(C60870cx cxVar, long j, TimeUnit timeUnit) {
        C60870cx q = C60856cj.m92908q(cxVar, j, timeUnit, this.f121572i);
        q.mo4106b(C47810es.m84977q(new C46431c(q)), this.f121571h);
    }
}
