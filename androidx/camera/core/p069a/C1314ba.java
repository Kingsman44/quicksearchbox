package androidx.camera.core.p069a;

import android.util.Log;
import android.util.Size;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p072b.C1264m;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.camera.core.a.ba */
/* compiled from: PG */
public abstract class C1314ba {

    /* renamed from: a */
    private static final boolean f3769a = C1477bw.m3985h("DeferrableSurface", 3);

    /* renamed from: i */
    public static final Size f3770i = new Size(0, 0);

    /* renamed from: j */
    public static final AtomicInteger f3771j = new AtomicInteger(0);

    /* renamed from: k */
    public static final AtomicInteger f3772k = new AtomicInteger(0);

    /* renamed from: l */
    public final Object f3773l;

    /* renamed from: m */
    public int f3774m;

    /* renamed from: n */
    public boolean f3775n;

    /* renamed from: o */
    public C2164c f3776o;

    /* renamed from: p */
    public final C60870cx f3777p;

    /* renamed from: q */
    public final Size f3778q;

    /* renamed from: r */
    public final int f3779r;

    /* renamed from: s */
    public Class f3780s;

    public C1314ba() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C60870cx mo4175a();

    /* renamed from: b */
    public final C60870cx mo4176b() {
        synchronized (this.f3773l) {
            if (this.f3775n) {
                C1264m mVar = new C1264m(new C1311ay("DeferrableSurface already closed.", this));
                return mVar;
            }
            C60870cx a = mo4175a();
            return a;
        }
    }

    /* renamed from: c */
    public void mo4177c() {
        C2164c cVar;
        synchronized (this.f3773l) {
            if (!this.f3775n) {
                this.f3775n = true;
                if (this.f3774m == 0) {
                    cVar = this.f3776o;
                    this.f3776o = null;
                } else {
                    cVar = null;
                }
                if (C1477bw.m3985h("DeferrableSurface", 3)) {
                    C1477bw.m3978a("DeferrableSurface", "surface closed,  useCount=" + this.f3774m + " closed=true " + this);
                }
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            cVar.mo5437b((Object) null);
        }
    }

    /* renamed from: d */
    public final void mo4178d() {
        C2164c cVar;
        synchronized (this.f3773l) {
            int i = this.f3774m;
            if (i != 0) {
                int i2 = i - 1;
                this.f3774m = i2;
                if (i2 != 0 || !this.f3775n) {
                    cVar = null;
                } else {
                    cVar = this.f3776o;
                    this.f3776o = null;
                }
                if (C1477bw.m3985h("DeferrableSurface", 3)) {
                    C1477bw.m3978a("DeferrableSurface", "use count-1,  useCount=" + this.f3774m + " closed=" + this.f3775n + " " + this);
                    if (this.f3774m == 0) {
                        mo4180f("Surface no longer in use", f3772k.get(), f3771j.decrementAndGet());
                    }
                }
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
        if (cVar != null) {
            cVar.mo5437b((Object) null);
        }
    }

    /* renamed from: e */
    public final void mo4179e() {
        synchronized (this.f3773l) {
            int i = this.f3774m;
            if (i == 0) {
                if (!this.f3775n) {
                    i = 0;
                } else {
                    throw new C1311ay("Cannot begin use on a closed surface.", this);
                }
            }
            this.f3774m = i + 1;
            if (C1477bw.m3985h("DeferrableSurface", 3)) {
                if (this.f3774m == 1) {
                    mo4180f("New surface in use", f3772k.get(), f3771j.incrementAndGet());
                }
                C1477bw.m3978a("DeferrableSurface", "use count+1, useCount=" + this.f3774m + " " + this);
            }
        }
    }

    /* renamed from: f */
    public final void mo4180f(String str, int i, int i2) {
        if (!f3769a && C1477bw.m3985h("DeferrableSurface", 3)) {
            C1477bw.m3978a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        C1477bw.m3978a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public C1314ba(Size size, int i) {
        this.f3773l = new Object();
        this.f3774m = 0;
        this.f3775n = false;
        this.f3778q = size;
        this.f3779r = i;
        C60870cx a = C2169h.m6027a(new C1309aw(this));
        this.f3777p = a;
        if (C1477bw.m3985h("DeferrableSurface", 3)) {
            mo4180f("Surface created", f3772k.incrementAndGet(), f3771j.get());
            ((C2168g) a).f6144b.mo4106b(new C1310ax(this, Log.getStackTraceString(new Exception())), C1238a.m3410a());
        }
    }
}
