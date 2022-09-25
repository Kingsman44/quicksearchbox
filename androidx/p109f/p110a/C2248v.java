package androidx.p109f.p110a;

/* renamed from: androidx.f.a.v */
/* compiled from: PG */
public final class C2248v extends C2246t {

    /* renamed from: o */
    private final C2247u f6328o;

    public C2248v(C2250x xVar) {
        super(xVar);
        C2247u uVar = new C2247u();
        this.f6328o = uVar;
        uVar.f6326b = this.f6321n * 0.75f * 62.5f;
    }

    /* renamed from: e */
    public final boolean mo5586e(long j) {
        C2247u uVar = this.f6328o;
        float f = this.f6315h;
        float f2 = this.f6314g;
        C2242p pVar = uVar.f6327c;
        double d = (double) f2;
        double exp = Math.exp((double) ((((float) j) / 1000.0f) * uVar.f6325a));
        Double.isNaN(d);
        pVar.f6307b = (float) (d * exp);
        C2242p pVar2 = uVar.f6327c;
        float f3 = pVar2.f6307b;
        pVar2.f6306a = f + ((f3 - f2) / uVar.f6325a);
        if (uVar.mo5590a(f3)) {
            uVar.f6327c.f6307b = 0.0f;
        }
        C2242p pVar3 = uVar.f6327c;
        float f4 = pVar3.f6306a;
        this.f6315h = f4;
        float f5 = pVar3.f6307b;
        this.f6314g = f5;
        if (f4 < -3.4028235E38f) {
            this.f6315h = -3.4028235E38f;
            return true;
        }
        float f6 = this.f6320m;
        if (f4 > f6) {
            this.f6315h = f6;
            return true;
        } else if (f4 >= f6 || f4 <= -3.4028235E38f || this.f6328o.mo5590a(f5)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: i */
    public final void mo5591i(float f) {
        if (f > 0.0f) {
            this.f6328o.f6325a = f * -4.2f;
            return;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }
}
