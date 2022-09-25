package androidx.p109f.p110a;

import android.animation.ValueAnimator;
import android.os.Build;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* renamed from: androidx.f.a.t */
/* compiled from: PG */
public abstract class C2246t implements C2229c {

    /* renamed from: a */
    public static final C2245s f6308a = new C2237k();

    /* renamed from: b */
    public static final C2245s f6309b = new C2238l();

    /* renamed from: c */
    public static final C2245s f6310c = new C2239m();

    /* renamed from: d */
    public static final C2245s f6311d = new C2240n();

    /* renamed from: e */
    public static final C2245s f6312e = new C2241o();

    /* renamed from: f */
    public static final C2245s f6313f = new C2235i();

    /* renamed from: g */
    public float f6314g;

    /* renamed from: h */
    float f6315h;

    /* renamed from: i */
    boolean f6316i;

    /* renamed from: j */
    final Object f6317j;

    /* renamed from: k */
    final C2249w f6318k;

    /* renamed from: l */
    public boolean f6319l;

    /* renamed from: m */
    public float f6320m;

    /* renamed from: n */
    public final float f6321n;

    /* renamed from: o */
    private long f6322o;

    /* renamed from: p */
    private final ArrayList f6323p;

    /* renamed from: q */
    private final ArrayList f6324q;

    public C2246t(C2250x xVar) {
        this.f6314g = 0.0f;
        this.f6315h = Float.MAX_VALUE;
        this.f6316i = false;
        this.f6319l = false;
        this.f6320m = Float.MAX_VALUE;
        this.f6322o = 0;
        this.f6323p = new ArrayList();
        this.f6324q = new ArrayList();
        this.f6317j = null;
        this.f6318k = new C2236j(xVar);
        this.f6321n = 1.0f;
    }

    /* renamed from: i */
    private static void m6142i(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: j */
    private final void mo5594j() {
        this.f6319l = false;
        C2234h a = C2234h.m6125a();
        a.f6296a.remove(this);
        int indexOf = a.f6297b.indexOf(this);
        if (indexOf >= 0) {
            a.f6297b.set(indexOf, (Object) null);
            a.f6301f = true;
        }
        this.f6322o = 0;
        this.f6316i = false;
        for (int i = 0; i < this.f6323p.size(); i++) {
            if (this.f6323p.get(i) != null) {
                ((C2243q) this.f6323p.get(i)).mo5581a();
            }
        }
        m6142i(this.f6323p);
    }

    /* renamed from: a */
    public final void mo5574a(long j) {
        long j2 = this.f6322o;
        if (j2 == 0) {
            this.f6322o = j;
            mo5584c(this.f6315h);
            return;
        }
        long j3 = j - j2;
        this.f6322o = j;
        float f = C2234h.m6125a().f6302g;
        boolean e = mo5586e(f == 0.0f ? 2147483647L : (long) (((float) j3) / f));
        float min = Math.min(this.f6315h, this.f6320m);
        this.f6315h = min;
        float max = Math.max(min, -3.4028235E38f);
        this.f6315h = max;
        mo5584c(max);
        if (e) {
            mo5594j();
        }
    }

    /* renamed from: b */
    public void mo5583b() {
        if (!C2234h.m6125a().f6303h.mo5578b()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        } else if (this.f6319l) {
            mo5594j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo5584c(float f) {
        this.f6318k.mo5580b(this.f6317j, f);
        for (int i = 0; i < this.f6324q.size(); i++) {
            if (this.f6324q.get(i) != null) {
                ((C2244r) this.f6324q.get(i)).mo5582a(this.f6315h);
            }
        }
        m6142i(this.f6324q);
    }

    /* renamed from: d */
    public void mo5585d() {
        if (!C2234h.m6125a().f6303h.mo5578b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        } else if (!this.f6319l) {
            this.f6319l = true;
            if (!this.f6316i) {
                this.f6315h = this.f6318k.mo5579a(this.f6317j);
            }
            float f = this.f6315h;
            if (f > this.f6320m || f < -3.4028235E38f) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            C2234h a = C2234h.m6125a();
            if (a.f6297b.size() == 0) {
                a.f6303h.mo5577a(a.f6299d);
                if (Build.VERSION.SDK_INT >= 33) {
                    a.f6302g = ValueAnimator.getDurationScale();
                    if (a.f6304i == null) {
                        a.f6304i = new C2231e(a);
                    }
                    C2231e eVar = a.f6304i;
                    if (eVar.f6290a == null) {
                        eVar.f6290a = new C2230d(eVar);
                        ValueAnimator.registerDurationScaleChangeListener(eVar.f6290a);
                    }
                }
            }
            if (!a.f6297b.contains(this)) {
                a.f6297b.add(this);
            }
        }
    }

    /* renamed from: e */
    public abstract boolean mo5586e(long j);

    /* renamed from: f */
    public final void mo5587f(C2243q qVar) {
        if (!this.f6323p.contains(qVar)) {
            this.f6323p.add(qVar);
        }
    }

    /* renamed from: g */
    public final void mo5588g(C2244r rVar) {
        if (this.f6319l) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        } else if (!this.f6324q.contains(rVar)) {
            this.f6324q.add(rVar);
        }
    }

    /* renamed from: h */
    public final void mo5589h(float f) {
        this.f6315h = f;
        this.f6316i = true;
    }

    public C2246t(Object obj, C2249w wVar) {
        this.f6314g = 0.0f;
        this.f6315h = Float.MAX_VALUE;
        this.f6316i = false;
        this.f6319l = false;
        this.f6320m = Float.MAX_VALUE;
        this.f6322o = 0;
        this.f6323p = new ArrayList();
        this.f6324q = new ArrayList();
        this.f6317j = obj;
        this.f6318k = wVar;
        this.f6321n = (wVar == f6310c || wVar == f6311d || wVar == f6312e) ? 0.1f : wVar == f6313f ? 0.00390625f : (wVar == f6308a || wVar == f6309b) ? 0.002f : 1.0f;
    }
}
