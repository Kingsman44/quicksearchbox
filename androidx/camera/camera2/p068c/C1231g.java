package androidx.camera.camera2.p068c;

import androidx.camera.camera2.p062a.C0988a;
import androidx.camera.camera2.p062a.C0989b;
import androidx.camera.camera2.p063b.C1185e;
import androidx.camera.camera2.p063b.C1216s;
import androidx.camera.camera2.p063b.C1217t;
import androidx.camera.core.C1564n;
import androidx.camera.core.p069a.C1339bz;
import androidx.p104d.p105a.C2164c;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.c.g */
/* compiled from: PG */
public final class C1231g {

    /* renamed from: a */
    public boolean f3613a = false;

    /* renamed from: b */
    public boolean f3614b = false;

    /* renamed from: c */
    public final Executor f3615c;

    /* renamed from: d */
    public final Object f3616d = new Object();

    /* renamed from: e */
    public C0988a f3617e = new C0988a();

    /* renamed from: f */
    C2164c f3618f;

    /* renamed from: g */
    public final C1216s f3619g = new C1229e(this);

    /* renamed from: h */
    private final C1217t f3620h;

    public C1231g(C1217t tVar, Executor executor) {
        this.f3620h = tVar;
        this.f3615c = executor;
    }

    /* renamed from: a */
    public final C0989b mo4059a() {
        C0989b a;
        synchronized (this.f3616d) {
            if (this.f3618f != null) {
                this.f3617e.f3131a.mo4216c(C0989b.f3138g, C1339bz.f3819a, Integer.valueOf(this.f3618f.hashCode()));
            }
            a = this.f3617e.mo3736a();
        }
        return a;
    }

    /* renamed from: b */
    public final void mo4060b(C2164c cVar) {
        this.f3614b = true;
        C2164c cVar2 = this.f3618f;
        if (cVar2 == null) {
            cVar2 = null;
        }
        this.f3618f = cVar;
        if (this.f3613a) {
            mo4061c();
        }
        if (cVar2 != null) {
            cVar2.mo5439d(new C1564n("Camera2CameraControl was updated with new options."));
        }
    }

    /* renamed from: c */
    public final void mo4061c() {
        C1217t tVar = this.f3620h;
        tVar.f3563b.execute(new C1185e(tVar));
        this.f3614b = false;
    }
}
