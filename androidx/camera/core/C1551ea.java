package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.camera.camera2.p063b.C1094aq;
import androidx.camera.core.p069a.C1292af;
import androidx.camera.core.p069a.C1306at;
import androidx.camera.core.p069a.C1308av;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1328bo;
import androidx.camera.core.p069a.C1339bz;
import androidx.camera.core.p069a.C1357cq;
import androidx.camera.core.p069a.C1367d;
import androidx.camera.core.p069a.C1372de;
import androidx.camera.core.p069a.C1373df;
import androidx.camera.core.p069a.C1376di;
import androidx.camera.core.p069a.C1399z;
import androidx.camera.core.p069a.p070a.C1251b;
import androidx.camera.core.p073b.C1450m;
import androidx.core.p097i.C1974i;
import java.util.HashSet;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: androidx.camera.core.ea */
/* compiled from: PG */
public abstract class C1551ea {

    /* renamed from: p */
    public final Set f4263p = new HashSet();

    /* renamed from: q */
    public final Object f4264q = new Object();

    /* renamed from: r */
    public C1373df f4265r;

    /* renamed from: s */
    public final C1373df f4266s;

    /* renamed from: t */
    public C1373df f4267t;

    /* renamed from: u */
    public Size f4268u;

    /* renamed from: v */
    public C1373df f4269v;

    /* renamed from: w */
    public Rect f4270w;

    /* renamed from: x */
    public C1292af f4271x;

    /* renamed from: y */
    public C1357cq f4272y;

    /* renamed from: z */
    public int f4273z = 2;

    protected C1551ea(C1373df dfVar) {
        new Matrix();
        this.f4272y = C1357cq.m3705a();
        this.f4266s = dfVar;
        this.f4267t = dfVar;
    }

    /* renamed from: a */
    public abstract Size mo4309a(Size size);

    /* renamed from: b */
    public abstract C1372de mo4310b(C1308av avVar);

    /* renamed from: c */
    public abstract C1373df mo4311c(boolean z, C1376di diVar);

    /* renamed from: d */
    public void mo4312d() {
    }

    /* renamed from: e */
    public void mo4313e() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C1373df mo4314f(C1094aq aqVar, C1372de deVar) {
        return deVar.mo4273c();
    }

    /* renamed from: k */
    public void mo4355k() {
    }

    /* renamed from: l */
    public void mo4356l() {
    }

    /* renamed from: o */
    public final int mo4413o() {
        return this.f4267t.mo3956a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo4414p(C1292af afVar) {
        C1094aq A = afVar.mo3816A();
        int z = ((C1328bo) this.f4267t).mo4192z();
        Integer num = (Integer) A.f3272b.mo3785a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        int intValue = num.intValue();
        int b = C1251b.m3416b(z);
        Integer a = A.mo3844a();
        boolean z2 = false;
        if (a != null && a.intValue() == 1) {
            z2 = true;
        }
        return C1251b.m3415a(b, intValue, z2);
    }

    /* renamed from: r */
    public final C1292af mo4416r() {
        C1292af afVar;
        synchronized (this.f4264q) {
            afVar = this.f4271x;
        }
        return afVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final String mo4417s() {
        C1292af r = mo4416r();
        new StringBuilder("No camera attached to use case: ").append(this);
        C1974i.m5319g(r, "No camera attached to use case: ".concat(toString()));
        return r.mo3816A().f3271a;
    }

    /* renamed from: t */
    public final String mo4418t() {
        C1373df dfVar = this.f4267t;
        return (String) Objects.requireNonNull(dfVar.mo3957g("<UnknownUseCase-" + hashCode() + ">"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo4419u() {
        this.f4273z = 1;
        mo4421w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo4420v() {
        for (C1549dz m : this.f4263p) {
            m.mo3827m(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo4422x(C1357cq cqVar) {
        this.f4272y = cqVar;
        for (C1314ba baVar : cqVar.mo4242b()) {
            if (baVar.f3780s == null) {
                baVar.f3780s = getClass();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo4423y(String str) {
        if (mo4416r() == null) {
            return false;
        }
        return Objects.equals(str, mo4417s());
    }

    /* renamed from: z */
    public final C1373df mo4424z(C1094aq aqVar, C1373df dfVar, C1373df dfVar2) {
        C1339bz bzVar;
        if (dfVar2 != null) {
            bzVar = C1339bz.m3626l(dfVar2);
            bzVar.f3825d.remove(C1450m.f4015k);
        } else {
            bzVar = C1339bz.m3625g();
        }
        for (C1306at atVar : this.f4266s.mo3959i()) {
            bzVar.mo4216c(atVar, this.f4266s.mo3951C(atVar), this.f4266s.mo3953E(atVar));
        }
        if (dfVar != null) {
            for (C1306at atVar2 : dfVar.mo3959i()) {
                if (!atVar2.mo4170c().equals(((C1367d) C1450m.f4015k).f3856a)) {
                    bzVar.mo4216c(atVar2, dfVar.mo3951C(atVar2), dfVar.mo3953E(atVar2));
                }
            }
        }
        if (bzVar.f3825d.containsKey(C1328bo.f3807A)) {
            if (bzVar.f3825d.containsKey(C1328bo.f3811x)) {
                bzVar.f3825d.remove(C1328bo.f3811x);
            }
        }
        return mo4314f(aqVar, mo4310b(bzVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C1399z mo4415q() {
        synchronized (this.f4264q) {
            C1292af afVar = this.f4271x;
            if (afVar == null) {
                C1399z zVar = C1399z.f3926j;
                return zVar;
            }
            C1399z c = afVar.mo3819c();
            return c;
        }
    }

    /* renamed from: w */
    public final void mo4421w() {
        int i = this.f4273z;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            for (C1549dz k : this.f4263p) {
                k.mo3825k(this);
            }
        } else if (i2 == 1) {
            for (C1549dz l : this.f4263p) {
                l.mo3826l(this);
            }
        }
    }
}
