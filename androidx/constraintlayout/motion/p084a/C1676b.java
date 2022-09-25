package androidx.constraintlayout.motion.p084a;

import androidx.constraintlayout.motion.widget.C1735t;
import androidx.constraintlayout.p079a.p080a.p081a.C1608r;
import androidx.constraintlayout.p079a.p080a.p081a.C1610t;
import androidx.constraintlayout.p079a.p080a.p081a.C1611u;

/* renamed from: androidx.constraintlayout.motion.a.b */
/* compiled from: PG */
public final class C1676b extends C1735t {

    /* renamed from: a */
    public C1608r f4808a;

    /* renamed from: b */
    public C1610t f4809b;

    /* renamed from: c */
    private final C1611u f4810c;

    public C1676b() {
        C1611u uVar = new C1611u();
        this.f4810c = uVar;
        this.f4809b = uVar;
    }

    /* renamed from: a */
    public final float mo4708a() {
        return this.f4809b.mo4539b();
    }

    /* renamed from: b */
    public final void mo4709b(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        float f8;
        C1611u uVar = this.f4810c;
        this.f4809b = uVar;
        uVar.f4455b = f;
        boolean z = f > f2;
        uVar.f4454a = z;
        if (z) {
            f8 = -f3;
            f7 = f - f2;
        } else {
            f7 = f2 - f;
            f8 = f3;
        }
        uVar.mo4542e(f8, f7, f5, f6, f4);
    }

    public final float getInterpolation(float f) {
        return this.f4809b.mo4538a(f);
    }
}
