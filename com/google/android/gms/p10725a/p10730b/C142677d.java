package com.google.android.gms.p10725a.p10730b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.SystemClock;
import com.google.android.gms.common.C143697a;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.C144022y;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.p10781d.C143860a;
import com.google.android.gms.p10725a.p10730b.p10732b.C142675a;
import com.google.common.p4535g.C59203do;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.a.b.d */
/* compiled from: PG */
public final class C142677d {

    /* renamed from: a */
    C143697a f387160a;

    /* renamed from: b */
    boolean f387161b;

    /* renamed from: c */
    final Object f387162c = new Object();

    /* renamed from: d */
    C142674b f387163d;

    /* renamed from: e */
    final long f387164e;

    /* renamed from: f */
    C142675a f387165f;

    /* renamed from: g */
    private final Context f387166g;

    public C142677d(Context context, long j, boolean z) {
        Context applicationContext;
        C143919bh.m233958a(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f387166g = context;
        this.f387161b = false;
        this.f387164e = j;
    }

    /* renamed from: b */
    public static C142676c m231497b(Context context) {
        C142677d dVar = new C142677d(context, -1, true);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            dVar.mo117458d();
            C142676c c = dVar.mo117457c();
            m231498e(c, SystemClock.elapsedRealtime() - elapsedRealtime, (Throwable) null);
            dVar.mo117456a();
            return c;
        } catch (Throwable th) {
            dVar.mo117456a();
            throw th;
        }
    }

    /* renamed from: e */
    static final void m231498e(C142676c cVar, long j, Throwable th) {
        if (Math.random() <= C59203do.f157270a) {
            HashMap hashMap = new HashMap();
            String str = "1";
            hashMap.put("app_context", str);
            if (cVar != null) {
                if (true != cVar.f387159b) {
                    str = "0";
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = cVar.f387158a;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new C142671a(hashMap).start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117456a() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C143919bh.m233965h(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f387166g     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.common.a r0 = r3.f387160a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f387161b     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.d.a r0 = com.google.android.gms.common.p10781d.C143860a.m233845a()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f387166g     // Catch:{ all -> 0x001f }
            com.google.android.gms.common.a r2 = r3.f387160a     // Catch:{ all -> 0x001f }
            r0.mo119311b(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f387161b = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f387165f = r0     // Catch:{ all -> 0x0033 }
            r3.f387160a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p10725a.p10730b.C142677d.mo117456a():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:38|39|(3:41|42|43)|44|45|(1:47)|48) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0082 */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.p10725a.p10730b.C142676c mo117457c() {
        /*
            r7 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C143919bh.m233965h(r0)
            monitor-enter(r7)
            boolean r0 = r7.f387161b     // Catch:{ all -> 0x00a6 }
            if (r0 != 0) goto L_0x003a
            java.lang.Object r0 = r7.f387162c     // Catch:{ all -> 0x00a6 }
            monitor-enter(r0)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.a.b.b r1 = r7.f387163d     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x002f
            boolean r1 = r1.f387155b     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x002f
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            r7.mo117458d()     // Catch:{ Exception -> 0x0026 }
            boolean r0 = r7.f387161b     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x001e
            goto L_0x003a
        L_0x001e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x00a6 }
            throw r0     // Catch:{ all -> 0x00a6 }
        L_0x0026:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00a6 }
            throw r1     // Catch:{ all -> 0x00a6 }
        L_0x002f:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x0037 }
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r1     // Catch:{ all -> 0x00a6 }
        L_0x003a:
            com.google.android.gms.common.a r0 = r7.f387160a     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r0)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.a.b.b.a r0 = r7.f387165f     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r0)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.a.b.c r0 = new com.google.android.gms.a.b.c     // Catch:{ RemoteException -> 0x0096 }
            com.google.android.gms.a.b.b.a r1 = r7.f387165f     // Catch:{ RemoteException -> 0x0096 }
            android.os.Parcel r2 = r1.mo17260gA()     // Catch:{ RemoteException -> 0x0096 }
            r3 = 1
            android.os.Parcel r1 = r1.mo17261gT(r3, r2)     // Catch:{ RemoteException -> 0x0096 }
            java.lang.String r2 = r1.readString()     // Catch:{ RemoteException -> 0x0096 }
            r1.recycle()     // Catch:{ RemoteException -> 0x0096 }
            com.google.android.gms.a.b.b.a r1 = r7.f387165f     // Catch:{ RemoteException -> 0x0096 }
            android.os.Parcel r4 = r1.mo17260gA()     // Catch:{ RemoteException -> 0x0096 }
            com.google.android.p445a.C8850c.m23495d(r4, r3)     // Catch:{ RemoteException -> 0x0096 }
            r3 = 2
            android.os.Parcel r1 = r1.mo17261gT(r3, r4)     // Catch:{ RemoteException -> 0x0096 }
            boolean r3 = com.google.android.p445a.C8850c.m23500i(r1)     // Catch:{ RemoteException -> 0x0096 }
            r1.recycle()     // Catch:{ RemoteException -> 0x0096 }
            r0.<init>(r2, r3)     // Catch:{ RemoteException -> 0x0096 }
            monitor-exit(r7)     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r7.f387162c
            monitor-enter(r1)
            com.google.android.gms.a.b.b r2 = r7.f387163d     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x0082
            java.util.concurrent.CountDownLatch r2 = r2.f387154a     // Catch:{ all -> 0x0093 }
            r2.countDown()     // Catch:{ all -> 0x0093 }
            com.google.android.gms.a.b.b r2 = r7.f387163d     // Catch:{ InterruptedException -> 0x0082 }
            r2.join()     // Catch:{ InterruptedException -> 0x0082 }
        L_0x0082:
            long r2 = r7.f387164e     // Catch:{ all -> 0x0093 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0091
            com.google.android.gms.a.b.b r4 = new com.google.android.gms.a.b.b     // Catch:{ all -> 0x0093 }
            r4.<init>(r7, r2)     // Catch:{ all -> 0x0093 }
            r7.f387163d = r4     // Catch:{ all -> 0x0093 }
        L_0x0091:
            monitor-exit(r1)     // Catch:{ all -> 0x0093 }
            return r0
        L_0x0093:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0093 }
            throw r0
        L_0x0096:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "GMS remote exception "
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x00a6 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x00a6 }
            throw r0     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00a6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p10725a.p10730b.C142677d.mo117457c():com.google.android.gms.a.b.c");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo117458d() {
        C142675a aVar;
        C143919bh.m233965h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f387161b) {
                mo117456a();
            }
            Context context = this.f387166g;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int j = C143876h.f389991d.mo119362j(context, 12451000);
                if (j != 0) {
                    if (j != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                C143697a aVar2 = new C143697a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (C143860a.m233845a().mo119313d(context, intent, aVar2, 1)) {
                    this.f387160a = aVar2;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    C143919bh.m233965h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                    if (!aVar2.f389593a) {
                        aVar2.f389593a = true;
                        IBinder iBinder = (IBinder) aVar2.f389594b.poll(10000, timeUnit);
                        if (iBinder != null) {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            if (queryLocalInterface instanceof C142675a) {
                                aVar = (C142675a) queryLocalInterface;
                            } else {
                                aVar = new C142675a(iBinder);
                            }
                            this.f387165f = aVar;
                            this.f387161b = true;
                        } else {
                            throw new TimeoutException("Timed out waiting for the service connection");
                        }
                    } else {
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new C144022y();
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        mo117456a();
        super.finalize();
    }
}
