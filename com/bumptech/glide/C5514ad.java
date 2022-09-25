package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import androidx.core.content.C1882h;
import com.bumptech.glide.load.p293a.C5731x;
import com.bumptech.glide.load.p299c.p304e.C5900e;
import com.bumptech.glide.manager.C5969ac;
import com.bumptech.glide.manager.C5972d;
import com.bumptech.glide.manager.C5973e;
import com.bumptech.glide.manager.C5974f;
import com.bumptech.glide.manager.C5976h;
import com.bumptech.glide.manager.C5977i;
import com.bumptech.glide.manager.C5981m;
import com.bumptech.glide.manager.C5987s;
import com.bumptech.glide.manager.C5988t;
import com.bumptech.glide.p287f.C5588e;
import com.bumptech.glide.p287f.C5593j;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.bumptech.glide.p291h.C5632s;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bumptech.glide.ad */
/* compiled from: PG */
public class C5514ad implements ComponentCallbacks2, C5977i {

    /* renamed from: e */
    private static final C5593j f16687e;

    /* renamed from: f */
    private static final C5593j f16688f = ((C5593j) ((C5593j) C5593j.m14520d(C5731x.f17284c).mo11965R(C5997p.LOW)).mo11978af());

    /* renamed from: a */
    protected final C5543d f16689a;

    /* renamed from: b */
    protected final Context f16690b;

    /* renamed from: c */
    final C5976h f16691c;

    /* renamed from: d */
    public final CopyOnWriteArrayList f16692d;

    /* renamed from: g */
    private final C5988t f16693g;

    /* renamed from: h */
    private final C5987s f16694h;

    /* renamed from: i */
    private final C5969ac f16695i = new C5969ac();

    /* renamed from: j */
    private final Runnable f16696j;

    /* renamed from: k */
    private final C5972d f16697k;

    /* renamed from: l */
    private C5593j f16698l;

    static {
        C5593j c = C5593j.m14519c(Bitmap.class);
        c.mo11976ad();
        f16687e = c;
        C5593j.m14519c(C5900e.class).mo11976ad();
    }

    public C5514ad(C5543d dVar, C5976h hVar, C5987s sVar, Context context) {
        C5972d dVar2;
        C5988t tVar = new C5988t();
        C5974f fVar = dVar.f16793f;
        C5511aa aaVar = new C5511aa(this);
        this.f16696j = aaVar;
        this.f16689a = dVar;
        this.f16691c = hVar;
        this.f16694h = sVar;
        this.f16693g = tVar;
        this.f16690b = context;
        Context applicationContext = context.getApplicationContext();
        C5513ac acVar = new C5513ac(this, tVar);
        int c = C1882h.m5137c(applicationContext, "android.permission.ACCESS_NETWORK_STATE");
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", c == 0 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        if (c == 0) {
            dVar2 = new C5973e(applicationContext, acVar);
        } else {
            dVar2 = new C5981m();
        }
        this.f16697k = dVar2;
        if (C5632s.m14620m()) {
            C5632s.m14613f().post(aaVar);
        } else {
            hVar.mo12404a(this);
        }
        hVar.mo12404a(dVar2);
        this.f16692d = new CopyOnWriteArrayList(dVar.f16789b.f16995d);
        mo11888v(dVar.f16789b.mo12093b());
        synchronized (dVar.f16792e) {
            if (!dVar.f16792e.contains(this)) {
                dVar.f16792e.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /* renamed from: a */
    public C6007z mo11863a(Class cls) {
        return new C6007z(this.f16689a, this, cls, this.f16690b);
    }

    /* renamed from: b */
    public C6007z mo11864b() {
        return mo11863a(Bitmap.class).mo11982o(f16687e);
    }

    /* renamed from: c */
    public C6007z mo11865c() {
        return mo11863a(Drawable.class);
    }

    /* renamed from: d */
    public C6007z mo11866d() {
        return mo11863a(File.class).mo11982o(C5593j.m14525i());
    }

    /* renamed from: e */
    public C6007z mo11867e() {
        return mo11863a(File.class).mo11982o(f16688f);
    }

    /* renamed from: f */
    public C6007z mo11868f(Bitmap bitmap) {
        return mo11865c().mo12443e(bitmap);
    }

    /* renamed from: g */
    public C6007z mo11869g(Drawable drawable) {
        return mo11865c().mo12444f(drawable);
    }

    /* renamed from: h */
    public C6007z mo11870h(Uri uri) {
        return mo11865c().mo12445g(uri);
    }

    /* renamed from: i */
    public C6007z mo11871i(Integer num) {
        return mo11865c().mo12446h(num);
    }

    /* renamed from: j */
    public C6007z mo11872j(Object obj) {
        return mo11865c().mo12447i(obj);
    }

    /* renamed from: k */
    public C6007z mo11873k(String str) {
        return mo11865c().mo12448j(str);
    }

    /* renamed from: l */
    public C6007z mo11874l(byte[] bArr) {
        return mo11865c().mo12449k(bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final synchronized C5593j mo11875m() {
        return this.f16698l;
    }

    /* renamed from: n */
    public final void mo11876n(View view) {
        mo11890x(new C5512ab(view));
    }

    /* renamed from: o */
    public final void mo11877o(C5572n nVar) {
        if (nVar != null) {
            mo11890x(nVar);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
    }

    /* renamed from: p */
    public final synchronized void mo11881p() {
        this.f16695i.mo11881p();
        for (C5572n o : C5632s.m14614g(this.f16695i.f17637a)) {
            mo11877o(o);
        }
        this.f16695i.f17637a.clear();
        C5988t tVar = this.f16693g;
        for (C5588e a : C5632s.m14614g(tVar.f17658a)) {
            tVar.mo12430a(a);
        }
        tVar.f17659b.clear();
        this.f16691c.mo12405e(this);
        this.f16691c.mo12405e(this.f16697k);
        C5632s.m14613f().removeCallbacks(this.f16696j);
        C5543d dVar = this.f16689a;
        synchronized (dVar.f16792e) {
            if (dVar.f16792e.contains(this)) {
                dVar.f16792e.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    /* renamed from: q */
    public final synchronized void mo11882q() {
        mo11887u();
        this.f16695i.mo11882q();
    }

    /* renamed from: r */
    public final synchronized void mo11883r() {
        mo11885t();
        this.f16695i.mo11883r();
    }

    /* renamed from: s */
    public final synchronized void mo11884s() {
        C5988t tVar = this.f16693g;
        tVar.f17660c = true;
        for (C5588e eVar : C5632s.m14614g(tVar.f17658a)) {
            if (eVar.mo12026n() || eVar.mo12024l()) {
                eVar.mo12015c();
                tVar.f17659b.add(eVar);
            }
        }
    }

    /* renamed from: t */
    public final synchronized void mo11885t() {
        C5988t tVar = this.f16693g;
        tVar.f17660c = true;
        for (C5588e eVar : C5632s.m14614g(tVar.f17658a)) {
            if (eVar.mo12026n()) {
                eVar.mo12018f();
                tVar.f17659b.add(eVar);
            }
        }
    }

    public final synchronized String toString() {
        String obj;
        String valueOf;
        String valueOf2;
        obj = super.toString();
        valueOf = String.valueOf(this.f16693g);
        valueOf2 = String.valueOf(this.f16694h);
        return obj + "{tracker=" + valueOf + ", treeNode=" + valueOf2 + "}";
    }

    /* renamed from: u */
    public final synchronized void mo11887u() {
        C5988t tVar = this.f16693g;
        tVar.f17660c = false;
        for (C5588e eVar : C5632s.m14614g(tVar.f17658a)) {
            if (!eVar.mo12024l() && !eVar.mo12026n()) {
                eVar.mo12014b();
            }
        }
        tVar.f17659b.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public synchronized void mo11888v(C5593j jVar) {
        this.f16698l = (C5593j) ((C5593j) jVar.clone()).mo11984u();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final synchronized void mo11889w(C5572n nVar, C5588e eVar) {
        this.f16695i.f17637a.add(nVar);
        C5988t tVar = this.f16693g;
        tVar.f17658a.add(eVar);
        if (!tVar.f17660c) {
            eVar.mo12014b();
            return;
        }
        eVar.mo12015c();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        tVar.f17659b.add(eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r5.mo11993h((com.bumptech.glide.p287f.C5588e) null);
        r1.mo12015c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11890x(com.bumptech.glide.p287f.p288a.C5572n r5) {
        /*
            r4 = this;
            boolean r0 = r4.mo11891y(r5)
            com.bumptech.glide.f.e r1 = r5.mo11990d()
            if (r0 != 0) goto L_0x0037
            com.bumptech.glide.d r0 = r4.f16689a
            java.util.List r2 = r0.f16792e
            monitor-enter(r2)
            java.util.List r0 = r0.f16792e     // Catch:{ all -> 0x0034 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0034 }
        L_0x0015:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0029
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0034 }
            com.bumptech.glide.ad r3 = (com.bumptech.glide.C5514ad) r3     // Catch:{ all -> 0x0034 }
            boolean r3 = r3.mo11891y(r5)     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0015
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            return
        L_0x0029:
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0037
            r0 = 0
            r5.mo11993h(r0)
            r1.mo12015c()
            return
        L_0x0034:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r5
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C5514ad.mo11890x(com.bumptech.glide.f.a.n):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final synchronized boolean mo11891y(C5572n nVar) {
        C5588e d = nVar.mo11990d();
        if (d == null) {
            return true;
        }
        if (!this.f16693g.mo12430a(d)) {
            return false;
        }
        this.f16695i.f17637a.remove(nVar);
        nVar.mo11993h((C5588e) null);
        return true;
    }
}
