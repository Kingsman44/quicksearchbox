package com.google.android.enterprise.connectedapps;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.CrossProfileApps;
import android.os.Bundle;
import android.os.UserHandle;
import android.os.UserManager;
import android.util.Log;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.google.android.enterprise.connectedapps.internal.C142577b;
import com.google.android.enterprise.connectedapps.internal.CrossProfileBundleCallSender;
import com.google.android.enterprise.connectedapps.p10714a.C142540a;
import com.google.android.enterprise.connectedapps.p10715b.C142561b;
import com.google.android.enterprise.connectedapps.p10715b.C142562c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.enterprise.connectedapps.ac */
/* compiled from: PG */
public final class C142543ac {

    /* renamed from: a */
    public static final Object f386804a = new Object();

    /* renamed from: b */
    public static final Set f386805b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: s */
    private static final BroadcastReceiver f386806s = new C142622y();

    /* renamed from: t */
    private static final AtomicBoolean f386807t = new AtomicBoolean(false);

    /* renamed from: c */
    public final ScheduledExecutorService f386808c;

    /* renamed from: d */
    public final Context f386809d;

    /* renamed from: e */
    public final ComponentName f386810e;

    /* renamed from: f */
    public final boolean f386811f;

    /* renamed from: g */
    public final C142540a f386812g;

    /* renamed from: h */
    public final AtomicReference f386813h = new AtomicReference();

    /* renamed from: i */
    public final AtomicReference f386814i = new AtomicReference();

    /* renamed from: j */
    public final AtomicReference f386815j = new AtomicReference();

    /* renamed from: k */
    public final Set f386816k = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: l */
    public final Map f386817l = new WeakHashMap();

    /* renamed from: m */
    public final Set f386818m = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: n */
    public final ConcurrentLinkedDeque f386819n = new ConcurrentLinkedDeque();

    /* renamed from: o */
    public final ServiceConnection f386820o = new C142620w(this);

    /* renamed from: p */
    public volatile CountDownLatch f386821p;

    /* renamed from: q */
    public int f386822q;

    /* renamed from: r */
    public final C142539a f386823r;

    /* renamed from: u */
    private final C142571f f386824u;

    /* renamed from: v */
    private final C142569d f386825v;

    /* renamed from: w */
    private final AtomicReference f386826w = new AtomicReference();

    /* renamed from: x */
    private long f386827x = 500;

    /* renamed from: y */
    private int f386828y;

    public C142543ac(Context context, String str, C142539a aVar, C142571f fVar, C142569d dVar, ScheduledExecutorService scheduledExecutorService, C142540a aVar2) {
        boolean z = false;
        this.f386822q = 0;
        this.f386828y = 0;
        this.f386809d = context.getApplicationContext();
        if (aVar2 == null || aVar == null || scheduledExecutorService == null) {
            throw null;
        }
        this.f386823r = aVar;
        this.f386824u = fVar;
        this.f386825v = dVar;
        this.f386810e = new ComponentName(context.getPackageName(), str);
        if (C142558ar.f386836a) {
            z = C142558ar.f386837b;
        } else {
            try {
                Context.class.getMethod("bindServiceAsUser", new Class[]{Intent.class, ServiceConnection.class, Integer.TYPE, UserHandle.class});
                C142558ar.f386837b = true;
                C142558ar.f386836a = true;
                z = true;
            } catch (NoSuchMethodException e) {
                Log.e("ReflectionUtilities", "canUseReflectedApis is false", e);
                C142558ar.f386837b = false;
                C142558ar.f386836a = true;
            }
        }
        this.f386811f = z;
        this.f386808c = scheduledExecutorService;
        this.f386812g = aVar2;
        f386805b.add(this);
        if (!f386807t.getAndSet(true)) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(LauncherAppsCompat.ACTION_MANAGED_PROFILE_UNLOCKED);
            intentFilter.addAction(LauncherAppsCompat.ACTION_MANAGED_PROFILE_AVAILABLE);
            intentFilter.addAction(LauncherAppsCompat.ACTION_MANAGED_PROFILE_UNAVAILABLE);
            this.f386809d.registerReceiver(f386806s, intentFilter);
        }
    }

    /* renamed from: b */
    static UserHandle m231103b(Context context, C142540a aVar) {
        List<UserHandle> targetUserProfiles = ((CrossProfileApps) context.getSystemService(CrossProfileApps.class)).getTargetUserProfiles();
        ArrayList arrayList = new ArrayList();
        UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
        for (UserHandle next : targetUserProfiles) {
            if (userManager.isUserRunning(next) && !userManager.isQuietModeEnabled(next)) {
                if (!aVar.f386799c || userManager.isUserUnlocked(next)) {
                    arrayList.add(next);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (UserHandle) Collections.min(arrayList, new C142572g((UserManager) context.getSystemService(UserManager.class)));
    }

    /* renamed from: s */
    private final void m231104s() {
        if (this.f386821p != null) {
            synchronized (this) {
                if (this.f386821p != null) {
                    this.f386821p.countDown();
                    this.f386821p = null;
                }
            }
        }
    }

    /* renamed from: t */
    private final void m231105t() {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f386815j.getAndSet((Object) null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    /* renamed from: a */
    public final Bundle mo117150a(long j, int i, Bundle bundle) {
        try {
            C142552al alVar = (C142552al) this.f386813h.get();
            if (alVar != null) {
                Bundle makeBundleCall = new CrossProfileBundleCallSender(alVar, j, i, (C142549ai) null).makeBundleCall(bundle);
                if (!makeBundleCall.containsKey("throwable")) {
                    return makeBundleCall;
                }
                Throwable a = C142577b.m231205a(makeBundleCall);
                if (a instanceof RuntimeException) {
                    throw new C142561b(a);
                }
                throw a;
            }
            throw new C142562c("Could not access other profile");
        } catch (C142562c | Error | RuntimeException e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            StackTraceElement[] stackTrace2 = Thread.currentThread().getStackTrace();
            int length = stackTrace.length;
            int length2 = stackTrace2.length;
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) Arrays.copyOf(stackTrace, (length + length2) - 1);
            System.arraycopy(stackTrace2, 1, stackTraceElementArr, length, length2 - 1);
            e.setStackTrace(stackTraceElementArr);
            throw e;
        } catch (Throwable th) {
            throw new C142562c("Unexpected checked exception", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo117151c(Object obj, Object obj2) {
        this.f386808c.execute(new C142575i(this, obj, obj2));
    }

    /* renamed from: d */
    public final void mo117152d() {
        this.f386827x = 500;
        this.f386808c.execute(new C142590l(this));
    }

    /* renamed from: e */
    public final void mo117153e(long j, int i, Bundle bundle, C142553am amVar, Object obj) {
        if (!mo117165q()) {
            mo117161m(new C142562c("Profile not available"));
        }
        this.f386808c.execute(new C142588j(this, j, i, bundle, amVar, obj));
    }

    /* renamed from: f */
    public final void mo117154f() {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f386826w.getAndSet((Object) null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    /* renamed from: g */
    public final void mo117155g() {
        if (mo117166r() && this.f386828y != 2) {
            this.f386824u.mo117183g();
            this.f386828y = 2;
        } else if (!mo117166r() && this.f386828y != 1) {
            this.f386824u.mo117183g();
            this.f386828y = 1;
        }
    }

    /* renamed from: h */
    public final void mo117156h() {
        if (this.f386816k.isEmpty() && mo117166r()) {
            Log.i("CrossProfileSender", "Scheduling automatic disconnection");
            ScheduledFuture schedule = this.f386808c.schedule(new C142615r(this), 30, TimeUnit.SECONDS);
            AtomicReference atomicReference = this.f386826w;
            while (!atomicReference.compareAndSet((Object) null, schedule)) {
                if (atomicReference.get() != null) {
                    Log.i("CrossProfileSender", "Already scheduled");
                    schedule.cancel(true);
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo117157i(String str, Exception exc, boolean z) {
        m231105t();
        if (exc == null) {
            Log.i("CrossProfileSender", "Binding attempt failed: ".concat(String.valueOf(str)));
            mo117161m(new C142562c(str));
        } else {
            Log.i("CrossProfileSender", "Binding attempt failed: ".concat(String.valueOf(str)), exc);
            mo117161m(new C142562c(str, exc));
        }
        if (z || this.f386816k.isEmpty() || this.f386821p != null) {
            mo117163o();
            m231104s();
            return;
        }
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f386814i.get();
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            long j = this.f386827x;
            long j2 = j + j;
            this.f386827x = j2;
            this.f386814i.set(this.f386808c.schedule(new C142590l(this), j2, TimeUnit.MILLISECONDS));
        }
    }

    /* renamed from: j */
    public final void mo117158j() {
        m231105t();
        Log.i("CrossProfileSender", "Binding attempt succeeded");
        m231104s();
    }

    /* renamed from: k */
    public final void mo117159k(Object obj) {
        if (obj != null) {
            this.f386808c.execute(new C142592n(this, obj));
            return;
        }
        throw new NullPointerException("Connection holder cannot be null");
    }

    /* renamed from: l */
    public final void mo117160l(Object obj) {
        Set<Object> set = (Set) this.f386817l.get(obj);
        if (set != null) {
            this.f386817l.remove(obj);
            for (Object l : set) {
                mo117160l(l);
            }
        }
        this.f386816k.remove(obj);
        this.f386818m.remove(obj);
    }

    /* renamed from: m */
    public final void mo117161m(Throwable th) {
        for (C142545ae aeVar : this.f386818m) {
            mo117159k(aeVar);
            aeVar.mo117167a(th);
        }
    }

    /* renamed from: n */
    public final void mo117162n() {
        Log.i("CrossProfileSender", "tryMakeAsyncCalls");
        if (mo117166r()) {
            this.f386808c.execute(new C142614q(this));
        }
    }

    /* renamed from: o */
    public final void mo117163o() {
        Log.i("CrossProfileSender", "Unbind");
        if (mo117166r()) {
            this.f386809d.unbindService(this.f386820o);
            this.f386813h.set((Object) null);
            mo117155g();
            mo117154f();
        }
        m231105t();
        mo117161m(new C142562c("No profile available"));
        m231104s();
    }

    /* renamed from: p */
    public final void mo117164p() {
        this.f386825v.mo98775a();
        int i = 1;
        if (true == mo117165q()) {
            i = 2;
        }
        this.f386822q = i;
    }

    /* renamed from: q */
    public final boolean mo117165q() {
        return m231103b(this.f386809d, this.f386812g) != null;
    }

    /* renamed from: r */
    public final boolean mo117166r() {
        return this.f386813h.get() != null;
    }
}
