package com.google.android.setupcompat.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.setupcompat.C45237a;
import com.google.android.setupcompat.p3550b.C45245b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.setupcompat.internal.o */
/* compiled from: PG */
public final class C45267o {

    /* renamed from: a */
    public static final C45245b f118240a = new C45245b("SetupCompatServiceProvider");

    /* renamed from: b */
    static final Intent f118241b = new Intent().setPackage("com.google.android.setupwizard").setAction("com.google.android.setupcompat.SetupCompatService.BIND");

    /* renamed from: d */
    private static volatile C45267o f118242d;

    /* renamed from: c */
    final ServiceConnection f118243c = new C45264l(this);

    /* renamed from: e */
    private volatile C45265m f118244e = new C45265m(1, (C45237a) null);

    /* renamed from: f */
    private final Context f118245f;

    /* renamed from: g */
    private final AtomicReference f118246g = new AtomicReference();

    public C45267o(Context context) {
        this.f118245f = context.getApplicationContext();
    }

    /* renamed from: a */
    static C45267o m80643a(Context context) {
        C45259g.m80634c(context, "Context object cannot be null.");
        C45267o oVar = f118242d;
        if (oVar == null) {
            synchronized (C45267o.class) {
                oVar = f118242d;
                if (oVar == null) {
                    oVar = new C45267o(context.getApplicationContext());
                    f118242d = oVar;
                    f118242d.m80645e();
                }
            }
        }
        return oVar;
    }

    /* renamed from: d */
    private final synchronized C45265m m80644d() {
        return this.f118244e;
    }

    /* renamed from: e */
    private final synchronized void m80645e() {
        int i = m80644d().f118238a;
        if (i == 4) {
            f118240a.mo49112b("Refusing to rebind since current state is already connected");
            return;
        }
        if (i != 1) {
            f118240a.mo49112b("Unbinding existing service connection.");
            this.f118245f.unbindService(this.f118243c);
        }
        try {
            if (this.f118245f.bindService(f118241b, this.f118243c, 1)) {
                if (this.f118244e.f118238a != 4) {
                    mo49152b(new C45265m(3, (C45237a) null));
                    f118240a.mo49112b("Context#bindService went through, now waiting for service connection");
                    return;
                }
                return;
            }
        } catch (SecurityException e) {
            f118240a.mo49113c("Unable to bind to compat service. ".concat(e.toString()));
        }
        mo49152b(new C45265m(2, (C45237a) null));
        f118240a.mo49113c("Context#bindService did not succeed.");
    }

    /* renamed from: f */
    private final C45237a m80646f(long j, TimeUnit timeUnit) {
        CountDownLatch countDownLatch;
        C45265m d = m80644d();
        if (d.f118238a == 4) {
            return d.f118239b;
        }
        loop0:
        while (true) {
            countDownLatch = (CountDownLatch) this.f118246g.get();
            if (countDownLatch != null) {
                break;
            }
            countDownLatch = new CountDownLatch(1);
            AtomicReference atomicReference = this.f118246g;
            while (true) {
                if (atomicReference.compareAndSet((Object) null, countDownLatch)) {
                    break loop0;
                } else if (atomicReference.get() != null) {
                }
            }
        }
        C45245b bVar = f118240a;
        bVar.mo49112b("Waiting for service to get connected");
        if (countDownLatch.await(j, timeUnit)) {
            C45265m d2 = m80644d();
            bVar.mo49112b(String.format("Finished waiting for service to get connected. Current state = %s", new Object[]{C45266n.m80642a(d2.f118238a)}));
            return d2.f118239b;
        }
        m80645e();
        throw new TimeoutException(String.format("Failed to acquire connection after [%s %s]", new Object[]{Long.valueOf(j), timeUnit}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo49152b(C45265m mVar) {
        f118240a.mo49112b(String.format("State changed: %s -> %s", new Object[]{C45266n.m80642a(this.f118244e.f118238a), C45266n.m80642a(mVar.f118238a)}));
        this.f118244e = mVar;
        CountDownLatch countDownLatch = (CountDownLatch) this.f118246g.getAndSet((Object) null);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* renamed from: c */
    public final C45237a mo49153c(long j, TimeUnit timeUnit) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C45265m d = m80644d();
            switch (d.f118238a - 1) {
                case 1:
                case 5:
                    return null;
                case 2:
                case 4:
                    return m80646f(j, timeUnit);
                case 3:
                    return d.f118239b;
                case 6:
                    m80645e();
                    return m80646f(j, timeUnit);
                default:
                    f118240a.mo49115e("NOT_STARTED state only possible before instance is created.");
                    return null;
            }
        } else {
            throw new IllegalStateException("getService blocks and should not be called from the main thread.");
        }
    }
}
