package androidx.camera.core;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.camera.core.p078c.C1491j;
import androidx.core.p097i.C1967b;
import androidx.core.p097i.C1974i;
import androidx.p104d.p105a.C2153a;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.core.dx */
/* compiled from: PG */
public final class C1547dx {

    /* renamed from: a */
    public final Object f4250a = new Object();

    /* renamed from: b */
    public final Size f4251b;

    /* renamed from: c */
    final C60870cx f4252c;

    /* renamed from: d */
    public final C2164c f4253d;

    /* renamed from: e */
    public final C1314ba f4254e;

    /* renamed from: f */
    public C1546dw f4255f;

    /* renamed from: g */
    public Executor f4256g;

    /* renamed from: h */
    public C1491j f4257h;

    /* renamed from: i */
    private final C60870cx f4258i;

    /* renamed from: j */
    private final C2164c f4259j;

    public C1547dx(Size size) {
        this.f4251b = size;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference((Object) null);
        C60870cx a = C2169h.m6027a(new C1532di(atomicReference, str));
        C2164c cVar = (C2164c) atomicReference.get();
        cVar.getClass();
        this.f4259j = cVar;
        AtomicReference atomicReference2 = new AtomicReference((Object) null);
        C60870cx a2 = C2169h.m6027a(new C1533dj(atomicReference2, str));
        this.f4258i = a2;
        C1263l.m3436h(a2, new C1540dq(cVar, a), C1238a.m3410a());
        C2164c cVar2 = (C2164c) atomicReference2.get();
        cVar2.getClass();
        AtomicReference atomicReference3 = new AtomicReference((Object) null);
        C60870cx a3 = C2169h.m6027a(new C1534dk(atomicReference3, str));
        this.f4252c = a3;
        C2164c cVar3 = (C2164c) atomicReference3.get();
        cVar3.getClass();
        this.f4253d = cVar3;
        C1541dr drVar = new C1541dr(this, size);
        this.f4254e = drVar;
        C60870cx c = C1263l.m3431c(drVar.f3777p);
        C1263l.m3436h(a3, new C1542ds(c, cVar2, str), C1238a.m3410a());
        c.mo4106b(new C1535dl(this), C1238a.m3410a());
    }

    /* renamed from: a */
    public final void mo4409a(Surface surface, Executor executor, C1967b bVar) {
        if (this.f4253d.mo5437b(surface) || (((C2168g) this.f4252c).f6144b.value instanceof C2153a.C2155b)) {
            C1263l.m3436h(this.f4258i, new C1543dt(bVar, surface), executor);
            return;
        }
        C1974i.m5315c(((C2168g) this.f4252c).f6144b.isDone(), (String) null);
        try {
            ((C2168g) this.f4252c).f6144b.get();
            executor.execute(new C1536dm(bVar, surface));
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new C1537dn(bVar, surface));
        }
    }

    /* renamed from: b */
    public final void mo4410b(C1546dw dwVar) {
        C1491j jVar;
        Executor executor;
        synchronized (this.f4250a) {
            this.f4255f = dwVar;
            jVar = this.f4257h;
            executor = this.f4256g;
        }
        if (jVar != null && executor != null) {
            executor.execute(new C1539dp(jVar, dwVar));
        }
    }
}
