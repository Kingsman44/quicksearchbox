package com.google.android.enterprise.connectedapps;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.enterprise.connectedapps.p10714a.C142540a;
import com.google.android.enterprise.connectedapps.p10715b.C142562c;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.enterprise.connectedapps.c */
/* compiled from: PG */
public class C142563c implements C142557aq, C142571f, C142569d {

    /* renamed from: a */
    public final Context f386843a;

    /* renamed from: b */
    private C142543ac f386844b;

    /* renamed from: c */
    private final Set f386845c = new CopyOnWriteArraySet();

    /* renamed from: d */
    private final Set f386846d = new CopyOnWriteArraySet();

    /* renamed from: e */
    private final ScheduledExecutorService f386847e;

    /* renamed from: f */
    private final boolean f386848f;

    /* renamed from: g */
    private final String f386849g;

    /* renamed from: h */
    private final C142540a f386850h;

    /* renamed from: i */
    private final int f386851i;

    /* renamed from: j */
    private final C142539a f386852j;

    public C142563c(C142559b bVar) {
        bVar.f386840c.getClass();
        ScheduledExecutorService scheduledExecutorService = bVar.f386838a;
        if (scheduledExecutorService == null) {
            this.f386847e = Executors.newSingleThreadScheduledExecutor();
            this.f386848f = true;
        } else {
            this.f386847e = scheduledExecutorService;
            this.f386848f = false;
        }
        this.f386852j = new C142544ad();
        this.f386843a = bVar.f386840c.getApplicationContext();
        this.f386850h = bVar.f386839b;
        String str = bVar.f386841d;
        if (str != null) {
            this.f386849g = str;
            this.f386851i = bVar.f386842e;
            return;
        }
        throw new NullPointerException("serviceClassName must be specified");
    }

    /* renamed from: a */
    public final void mo98775a() {
        for (C142569d a : this.f386846d) {
            a.mo98775a();
        }
    }

    /* renamed from: b */
    public final C142543ac mo117175b() {
        if (this.f386844b == null) {
            this.f386844b = new C142543ac(this.f386843a.getApplicationContext(), this.f386849g, this.f386852j, this, this, this.f386847e, this.f386850h);
        }
        return this.f386844b;
    }

    /* renamed from: c */
    public final C142556ap mo117179c(Object obj) {
        C142543ac b = mo117175b();
        b.f386808c.execute(new C142589k(b, obj));
        return C142556ap.m231150a(this, obj);
    }

    /* renamed from: d */
    public final C142556ap mo117180d(Object obj) {
        C142543ac b = mo117175b();
        Log.e("CrossProfileSender", "Calling manuallyBind");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("connect()/manuallyBind() cannot be called from UI thread");
        } else if (!b.mo117165q()) {
            throw new C142562c("Profile not available");
        } else if (b.f386823r.mo117142a(b.f386809d)) {
            b.mo117154f();
            b.f386808c.execute(new C142593o(b, obj));
            if (!b.mo117166r()) {
                if (b.f386821p == null) {
                    synchronized (b) {
                        if (b.f386821p == null) {
                            b.f386821p = new CountDownLatch(1);
                        }
                    }
                }
                b.mo117152d();
                Log.i("CrossProfileSender", "Blocking for bind");
                try {
                    if (b.f386821p != null) {
                        b.f386821p.await();
                    }
                } catch (InterruptedException e) {
                    Log.e("CrossProfileSender", "Interrupted waiting for manually bind", e);
                }
                if (!b.mo117166r()) {
                    b.mo117163o();
                    b.f386808c.execute(new C142594p(b, obj));
                    throw new C142562c("Profile not available");
                }
            }
            return C142556ap.m231150a(this, obj);
        } else {
            throw new C142562c("Permission not granted");
        }
    }

    /* renamed from: e */
    public final void mo117181e(C142569d dVar) {
        this.f386846d.add(dVar);
    }

    /* renamed from: f */
    public final void mo117176f(Object obj, Object obj2) {
        mo117175b().mo117151c(obj, obj2);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (this.f386848f) {
            this.f386847e.shutdownNow();
        }
    }

    /* renamed from: g */
    public final void mo117183g() {
        for (C142571f g : this.f386845c) {
            g.mo117183g();
        }
    }

    /* renamed from: h */
    public final void mo117177h(Object obj) {
        mo117175b().mo117159k(obj);
    }

    /* renamed from: i */
    public final C142570e mo117178i() {
        Context context = this.f386843a;
        int i = this.f386851i;
        if (i == 3) {
            new C142570e(context).mo117186b();
        } else if (i == 4) {
            new C142570e(context).mo117185a();
        }
        return new C142570e(context);
    }

    /* renamed from: j */
    public final C142554an mo117184j() {
        return new C142554an(this.f386843a, this.f386852j);
    }
}
