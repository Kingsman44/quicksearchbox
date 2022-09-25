package androidx.camera.lifecycle;

import androidx.camera.core.C1562l;
import androidx.camera.core.p073b.C1446i;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2390u;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public final class LifecycleCamera implements C2390u, C1562l {

    /* renamed from: a */
    public final Object f4310a = new Object();

    /* renamed from: b */
    public final C2391v f4311b;

    /* renamed from: c */
    public final C1446i f4312c;

    /* renamed from: d */
    public boolean f4313d = false;

    /* renamed from: e */
    private volatile boolean f4314e = false;

    public LifecycleCamera(C2391v vVar, C1446i iVar) {
        this.f4311b = vVar;
        this.f4312c = iVar;
        if (vVar.getLifecycle().mo5789a().mo5788a(C2383n.STARTED)) {
            iVar.mo4340c();
        } else {
            iVar.mo4341d();
        }
        vVar.getLifecycle().mo5790b(this);
    }

    /* renamed from: a */
    public final C2391v mo4454a() {
        C2391v vVar;
        synchronized (this.f4310a) {
            vVar = this.f4311b;
        }
        return vVar;
    }

    /* renamed from: b */
    public final List mo4455b() {
        List unmodifiableList;
        synchronized (this.f4310a) {
            unmodifiableList = Collections.unmodifiableList(this.f4312c.mo4338a());
        }
        return unmodifiableList;
    }

    /* renamed from: c */
    public final void mo4456c() {
        synchronized (this.f4310a) {
            if (!this.f4313d) {
                onStop(this.f4311b);
                this.f4313d = true;
            }
        }
    }

    @OnLifecycleEvent(mo5713a = C2382m.ON_DESTROY)
    public void onDestroy(C2391v vVar) {
        synchronized (this.f4310a) {
            C1446i iVar = this.f4312c;
            iVar.mo4342e(iVar.mo4338a());
        }
    }

    @OnLifecycleEvent(mo5713a = C2382m.ON_PAUSE)
    public void onPause(C2391v vVar) {
        this.f4312c.mo4343f(false);
    }

    @OnLifecycleEvent(mo5713a = C2382m.ON_RESUME)
    public void onResume(C2391v vVar) {
        this.f4312c.mo4343f(true);
    }

    @OnLifecycleEvent(mo5713a = C2382m.ON_START)
    public void onStart(C2391v vVar) {
        synchronized (this.f4310a) {
            if (!this.f4313d) {
                this.f4312c.mo4340c();
                this.f4314e = true;
            }
        }
    }

    @OnLifecycleEvent(mo5713a = C2382m.ON_STOP)
    public void onStop(C2391v vVar) {
        synchronized (this.f4310a) {
            if (!this.f4313d) {
                this.f4312c.mo4341d();
                this.f4314e = false;
            }
        }
    }
}
