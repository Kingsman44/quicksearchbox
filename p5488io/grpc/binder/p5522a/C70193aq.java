package p5488io.grpc.binder.p5522a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import p5488io.grpc.Status;

/* renamed from: io.grpc.binder.a.aq */
/* compiled from: PG */
final class C70193aq implements ServiceConnection, C70197b {

    /* renamed from: a */
    private static final Logger f187072a = Logger.getLogger(C70193aq.class.getName());

    /* renamed from: b */
    private final Intent f187073b;

    /* renamed from: c */
    private final int f187074c;

    /* renamed from: d */
    private final C70176a f187075d;

    /* renamed from: e */
    private final Executor f187076e;

    /* renamed from: f */
    private Context f187077f;

    /* renamed from: g */
    private int f187078g;

    /* renamed from: h */
    private int f187079h;

    public C70193aq(Executor executor, Context context, Intent intent, C70176a aVar) {
        synchronized (this) {
            this.f187073b = intent;
            this.f187074c = 1;
            this.f187075d = aVar;
            this.f187077f = context;
            this.f187076e = executor;
            this.f187078g = 1;
            this.f187079h = 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo61806a() {
        /*
            r7 = this;
            java.lang.String r0 = "bindService("
            monitor-enter(r7)
            int r1 = r7.f187078g     // Catch:{ all -> 0x007c }
            r2 = 1
            if (r1 != r2) goto L_0x007a
            r1 = 2
            r7.f187078g = r1     // Catch:{ all -> 0x007c }
            android.content.Context r1 = r7.f187077f     // Catch:{ all -> 0x007c }
            android.content.Intent r2 = r7.f187073b     // Catch:{ all -> 0x007c }
            int r3 = r7.f187074c     // Catch:{ all -> 0x007c }
            boolean r1 = r1.bindService(r2, r7, r3)     // Catch:{ SecurityException -> 0x0044, RuntimeException -> 0x0036 }
            if (r1 != 0) goto L_0x0033
            io.grpc.Status r1 = p5488io.grpc.Status.f186914l     // Catch:{ SecurityException -> 0x0044, RuntimeException -> 0x0036 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ SecurityException -> 0x0044, RuntimeException -> 0x0036 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0044, RuntimeException -> 0x0036 }
            r3.<init>(r0)     // Catch:{ SecurityException -> 0x0044, RuntimeException -> 0x0036 }
            r3.append(r2)     // Catch:{ SecurityException -> 0x0044, RuntimeException -> 0x0036 }
            java.lang.String r0 = ") returned false"
            r3.append(r0)     // Catch:{ SecurityException -> 0x0044, RuntimeException -> 0x0036 }
            java.lang.String r0 = r3.toString()     // Catch:{ SecurityException -> 0x0044, RuntimeException -> 0x0036 }
            io.grpc.Status r0 = r1.withDescription(r0)     // Catch:{ SecurityException -> 0x0044, RuntimeException -> 0x0036 }
            goto L_0x0051
        L_0x0033:
            io.grpc.Status r0 = p5488io.grpc.Status.f186902OK     // Catch:{ SecurityException -> 0x0044, RuntimeException -> 0x0036 }
            goto L_0x0051
        L_0x0036:
            r0 = move-exception
            io.grpc.Status r1 = p5488io.grpc.Status.f186915m     // Catch:{ all -> 0x007c }
            io.grpc.Status r0 = r1.mo61678e(r0)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "RuntimeException from bindService"
            io.grpc.Status r0 = r0.withDescription(r1)     // Catch:{ all -> 0x007c }
            goto L_0x0051
        L_0x0044:
            r0 = move-exception
            io.grpc.Status r1 = p5488io.grpc.Status.f186909g     // Catch:{ all -> 0x007c }
            io.grpc.Status r0 = r1.mo61678e(r0)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "SecurityException from bindService"
            io.grpc.Status r0 = r0.withDescription(r1)     // Catch:{ all -> 0x007c }
        L_0x0051:
            boolean r1 = r0.mo61679g()     // Catch:{ all -> 0x007c }
            if (r1 != 0) goto L_0x007a
            android.content.Context r1 = r7.f187077f     // Catch:{ all -> 0x007c }
            r1.unbindService(r7)     // Catch:{ RuntimeException -> 0x005d }
            goto L_0x006b
        L_0x005d:
            r6 = move-exception
            java.util.logging.Logger r1 = f187072a     // Catch:{ all -> 0x007c }
            java.util.logging.Level r2 = java.util.logging.Level.FINE     // Catch:{ all -> 0x007c }
            java.lang.String r3 = "io.grpc.binder.internal.ServiceBinding"
            java.lang.String r4 = "handleBindServiceFailure"
            java.lang.String r5 = "Could not clean up after bindService() failure."
            r1.logp(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x007c }
        L_0x006b:
            r1 = 4
            r7.f187078g = r1     // Catch:{ all -> 0x007c }
            java.util.concurrent.Executor r1 = r7.f187076e     // Catch:{ all -> 0x007c }
            io.grpc.binder.a.ap r2 = new io.grpc.binder.a.ap     // Catch:{ all -> 0x007c }
            r2.<init>(r7, r0)     // Catch:{ all -> 0x007c }
            r1.execute(r2)     // Catch:{ all -> 0x007c }
            monitor-exit(r7)
            return
        L_0x007a:
            monitor-exit(r7)
            return
        L_0x007c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.binder.p5522a.C70193aq.mo61806a():void");
    }

    /* renamed from: b */
    public final void mo61807b(Status status) {
        Logger logger = f187072a;
        logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", status);
        this.f187077f = null;
        if (this.f187079h != 4) {
            this.f187079h = 4;
            logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
            this.f187075d.mo61752b(status);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo61808c(Status status) {
        Context context;
        synchronized (this) {
            int i = this.f187078g;
            if (i != 2) {
                if (i != 3) {
                    context = null;
                    this.f187078g = 4;
                }
            }
            context = this.f187077f;
            this.f187078g = 4;
        }
        this.f187076e.execute(new C70191ao(this, status));
        if (context != null) {
            context.unbindService(this);
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        mo61808c(Status.f186916n.withDescription("onBindingDied: ".concat(String.valueOf(String.valueOf(componentName)))));
    }

    public final void onNullBinding(ComponentName componentName) {
        mo61808c(Status.f186914l.withDescription("onNullBinding: ".concat(String.valueOf(String.valueOf(componentName)))));
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        synchronized (this) {
            if (this.f187078g == 2) {
                this.f187078g = 3;
                z = true;
            } else {
                z = false;
            }
        }
        if (z && this.f187079h == 1) {
            this.f187079h = 3;
            f187072a.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyBound", "notify bound - notifying");
            this.f187075d.mo61751a(iBinder);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        mo61808c(Status.f186916n.withDescription("onServiceDisconnected: ".concat(String.valueOf(String.valueOf(componentName)))));
    }
}
