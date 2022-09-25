package androidx.p109f.p110a;

import android.util.AndroidRuntimeException;
import com.google.common.p4535g.C59203do;

/* renamed from: androidx.f.a.y */
/* compiled from: PG */
public final class C2251y extends C2246t {

    /* renamed from: o */
    public C2252z f6330o = null;

    /* renamed from: p */
    private float f6331p = Float.MAX_VALUE;

    /* renamed from: q */
    private boolean f6332q = false;

    public C2251y(Object obj, C2249w wVar) {
        super(obj, wVar);
    }

    /* renamed from: b */
    public final void mo5583b() {
        super.mo5583b();
        float f = this.f6331p;
        if (f != Float.MAX_VALUE) {
            C2252z zVar = this.f6330o;
            if (zVar == null) {
                this.f6330o = new C2252z(f);
            } else {
                zVar.f6337e = (double) f;
            }
            this.f6331p = Float.MAX_VALUE;
        }
    }

    /* renamed from: d */
    public final void mo5585d() {
        C2252z zVar = this.f6330o;
        if (zVar != null) {
            double d = (double) ((float) zVar.f6337e);
            if (d > ((double) this.f6320m)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (d >= -3.4028234663852886E38d) {
                double abs = Math.abs((double) (this.f6321n * 0.75f));
                zVar.f6335c = abs;
                zVar.f6336d = abs * 62.5d;
                super.mo5585d();
            } else {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    /* renamed from: e */
    public final boolean mo5586e(long j) {
        float f;
        if (this.f6332q) {
            float f2 = this.f6331p;
            if (f2 != Float.MAX_VALUE) {
                this.f6330o.f6337e = (double) f2;
                this.f6331p = Float.MAX_VALUE;
            }
            this.f6315h = (float) this.f6330o.f6337e;
            this.f6314g = 0.0f;
            this.f6332q = false;
            return true;
        }
        if (this.f6331p != Float.MAX_VALUE) {
            long j2 = j / 2;
            C2242p a = this.f6330o.mo5595a((double) this.f6315h, (double) this.f6314g, j2);
            C2252z zVar = this.f6330o;
            zVar.f6337e = (double) this.f6331p;
            this.f6331p = Float.MAX_VALUE;
            C2242p a2 = zVar.mo5595a((double) a.f6306a, (double) a.f6307b, j2);
            f = a2.f6306a;
            this.f6315h = f;
            this.f6314g = a2.f6307b;
        } else {
            C2242p a3 = this.f6330o.mo5595a((double) this.f6315h, (double) this.f6314g, j);
            f = a3.f6306a;
            this.f6315h = f;
            this.f6314g = a3.f6307b;
        }
        float max = Math.max(f, -3.4028235E38f);
        this.f6315h = max;
        float min = Math.min(max, this.f6320m);
        this.f6315h = min;
        float f3 = this.f6314g;
        C2252z zVar2 = this.f6330o;
        if (((double) Math.abs(f3)) >= zVar2.f6336d || ((double) Math.abs(min - ((float) zVar2.f6337e))) >= zVar2.f6335c) {
            return false;
        }
        this.f6315h = (float) this.f6330o.f6337e;
        this.f6314g = 0.0f;
        return true;
    }

    /* renamed from: i */
    public final void mo5593i(float f) {
        if (this.f6319l) {
            this.f6331p = f;
            return;
        }
        if (this.f6330o == null) {
            this.f6330o = new C2252z(f);
        }
        this.f6330o.f6337e = (double) f;
        mo5585d();
    }

    /* renamed from: j */
    public final void mo5594j() {
        if (this.f6330o.f6334b <= C59203do.f157270a) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (!C2234h.m6125a().f6303h.mo5578b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        } else if (this.f6319l) {
            this.f6332q = true;
        }
    }
}
