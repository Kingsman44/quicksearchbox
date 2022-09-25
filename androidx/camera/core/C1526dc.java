package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.p069a.C1330bq;
import androidx.camera.core.p069a.C1331br;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.dc */
/* compiled from: PG */
public final class C1526dc implements C1331br {

    /* renamed from: a */
    public final Object f4208a = new Object();

    /* renamed from: b */
    public int f4209b = 0;

    /* renamed from: c */
    public boolean f4210c = false;

    /* renamed from: d */
    private final C1331br f4211d;

    /* renamed from: e */
    private final Surface f4212e;

    /* renamed from: f */
    private final C1413an f4213f = new C1524da(this);

    public C1526dc(C1331br brVar) {
        this.f4211d = brVar;
        this.f4212e = brVar.mo4202e();
    }

    /* renamed from: l */
    private final C1473bs m4067l(C1473bs bsVar) {
        if (bsVar == null) {
            return null;
        }
        this.f4209b++;
        C1530dg dgVar = new C1530dg(bsVar);
        dgVar.mo4307g(this.f4213f);
        return dgVar;
    }

    /* renamed from: a */
    public final int mo4198a() {
        int a;
        synchronized (this.f4208a) {
            a = this.f4211d.mo4198a();
        }
        return a;
    }

    /* renamed from: b */
    public final int mo4199b() {
        int b;
        synchronized (this.f4208a) {
            b = this.f4211d.mo4199b();
        }
        return b;
    }

    /* renamed from: c */
    public final int mo4200c() {
        int c;
        synchronized (this.f4208a) {
            c = this.f4211d.mo4200c();
        }
        return c;
    }

    /* renamed from: d */
    public final int mo4201d() {
        int d;
        synchronized (this.f4208a) {
            d = this.f4211d.mo4201d();
        }
        return d;
    }

    /* renamed from: e */
    public final Surface mo4202e() {
        Surface e;
        synchronized (this.f4208a) {
            e = this.f4211d.mo4202e();
        }
        return e;
    }

    /* renamed from: f */
    public final C1473bs mo4203f() {
        C1473bs l;
        synchronized (this.f4208a) {
            l = m4067l(this.f4211d.mo4203f());
        }
        return l;
    }

    /* renamed from: g */
    public final C1473bs mo4204g() {
        C1473bs l;
        synchronized (this.f4208a) {
            l = m4067l(this.f4211d.mo4204g());
        }
        return l;
    }

    /* renamed from: h */
    public final void mo4205h() {
        synchronized (this.f4208a) {
            this.f4211d.mo4205h();
        }
    }

    /* renamed from: i */
    public final void mo4206i() {
        synchronized (this.f4208a) {
            Surface surface = this.f4212e;
            if (surface != null) {
                surface.release();
            }
            this.f4211d.mo4206i();
        }
    }

    /* renamed from: j */
    public final void mo4207j(C1330bq bqVar, Executor executor) {
        synchronized (this.f4208a) {
            this.f4211d.mo4207j(new C1525db(this, bqVar), executor);
        }
    }

    /* renamed from: k */
    public final void mo4393k() {
        synchronized (this.f4208a) {
            this.f4210c = true;
            this.f4211d.mo4205h();
            if (this.f4209b == 0) {
                mo4206i();
            }
        }
    }
}
