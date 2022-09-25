package androidx.camera.core;

import android.media.Image;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.camera.core.ao */
/* compiled from: PG */
public class C1414ao implements C1473bs {

    /* renamed from: a */
    protected final C1473bs f3970a;

    /* renamed from: b */
    private final Object f3971b = new Object();

    /* renamed from: c */
    private final Set f3972c = new HashSet();

    protected C1414ao(C1473bs bsVar) {
        this.f3970a = bsVar;
    }

    /* renamed from: a */
    public final int mo4300a() {
        return this.f3970a.mo4300a();
    }

    /* renamed from: b */
    public int mo4301b() {
        return this.f3970a.mo4301b();
    }

    /* renamed from: c */
    public int mo4302c() {
        return this.f3970a.mo4302c();
    }

    public void close() {
        HashSet<C1413an> hashSet;
        this.f3970a.close();
        synchronized (this.f3971b) {
            hashSet = new HashSet<>(this.f3972c);
        }
        for (C1413an k : hashSet) {
            k.mo4299k(this);
        }
    }

    /* renamed from: d */
    public final Image mo4304d() {
        return this.f3970a.mo4304d();
    }

    /* renamed from: e */
    public C1472br mo4305e() {
        return this.f3970a.mo4305e();
    }

    /* renamed from: f */
    public final C1235a[] mo4306f() {
        return this.f3970a.mo4306f();
    }

    /* renamed from: g */
    public final void mo4307g(C1413an anVar) {
        synchronized (this.f3971b) {
            this.f3972c.add(anVar);
        }
    }
}
