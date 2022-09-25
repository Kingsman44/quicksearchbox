package com.google.android.play.core.p3533e;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.play.core.p3529c.C45053a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.play.core.e.k */
/* compiled from: PG */
public final class C45079k {

    /* renamed from: n */
    private static final Map f117724n = new HashMap();

    /* renamed from: a */
    public final Context f117725a;

    /* renamed from: b */
    public final C45053a f117726b;

    /* renamed from: c */
    public final String f117727c;

    /* renamed from: d */
    public final List f117728d = new ArrayList();

    /* renamed from: e */
    public final Set f117729e = new HashSet();

    /* renamed from: f */
    public final Object f117730f = new Object();

    /* renamed from: g */
    public boolean f117731g;

    /* renamed from: h */
    public final Intent f117732h;

    /* renamed from: i */
    public final C45075g f117733i;

    /* renamed from: j */
    public final WeakReference f117734j;

    /* renamed from: k */
    public final IBinder.DeathRecipient f117735k = new C45071c(this);

    /* renamed from: l */
    public ServiceConnection f117736l;

    /* renamed from: m */
    public IInterface f117737m;

    /* renamed from: o */
    private final AtomicInteger f117738o = new AtomicInteger(0);

    public C45079k(Context context, C45053a aVar, String str, Intent intent, C45075g gVar) {
        this.f117725a = context;
        this.f117726b = aVar;
        this.f117727c = str;
        this.f117732h = intent;
        this.f117733i = gVar;
        this.f117734j = new WeakReference((Object) null);
    }

    /* renamed from: a */
    public final Handler mo48907a() {
        Handler handler;
        Map map = f117724n;
        synchronized (map) {
            if (!map.containsKey(this.f117727c)) {
                HandlerThread handlerThread = new HandlerThread(this.f117727c, 10);
                handlerThread.start();
                map.put(this.f117727c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f117727c);
        }
        return handler;
    }

    /* renamed from: b */
    public final RemoteException mo48908b() {
        return new RemoteException(String.valueOf(this.f117727c).concat(" : Binder has died."));
    }

    /* renamed from: c */
    public final void mo48909c(C45069a aVar, C146010af afVar) {
        synchronized (this.f117730f) {
            this.f117729e.add(afVar);
            afVar.f394698a.mo122493l(C146013ai.f394700a, new C45070b(this, afVar));
        }
        synchronized (this.f117730f) {
            if (this.f117738o.getAndIncrement() > 0) {
                this.f117726b.mo48883a("Already connected to the service.", new Object[0]);
            }
        }
        mo48907a().post(new C45072d(this, aVar.f117713d, aVar));
    }

    /* renamed from: d */
    public final void mo48910d() {
        synchronized (this.f117730f) {
            for (C146010af afVar : this.f117729e) {
                afVar.f394698a.mo122509w(mo48908b());
            }
            this.f117729e.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        mo48907a().post(new com.google.android.play.core.p3533e.C45073e(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48911e() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f117730f
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicInteger r1 = r4.f117738o     // Catch:{ all -> 0x002e }
            int r1 = r1.get()     // Catch:{ all -> 0x002e }
            if (r1 <= 0) goto L_0x0020
            java.util.concurrent.atomic.AtomicInteger r1 = r4.f117738o     // Catch:{ all -> 0x002e }
            int r1 = r1.decrementAndGet()     // Catch:{ all -> 0x002e }
            if (r1 > 0) goto L_0x0014
            goto L_0x0020
        L_0x0014:
            com.google.android.play.core.c.a r1 = r4.f117726b     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "Leaving the connection open for other ongoing calls."
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x002e }
            r1.mo48886d(r2, r3)     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            com.google.android.play.core.e.e r0 = new com.google.android.play.core.e.e
            r0.<init>(r4)
            android.os.Handler r1 = r4.mo48907a()
            r1.post(r0)
            return
        L_0x002e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p3533e.C45079k.mo48911e():void");
    }

    /* renamed from: f */
    public final void mo48912f(C146010af afVar) {
        synchronized (this.f117730f) {
            this.f117729e.remove(afVar);
        }
        mo48911e();
    }
}
