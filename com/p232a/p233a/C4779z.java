package com.p232a.p233a;

/* renamed from: com.a.a.z */
/* compiled from: PG */
public final class C4779z implements Cloneable {

    /* renamed from: a */
    final float f15133a;

    /* renamed from: b */
    final int f15134b;

    public C4779z(float f) {
        this.f15134b = 1;
        this.f15133a = f;
    }

    public C4779z(float f, int i) {
        this.f15133a = f;
        this.f15134b = i;
    }

    /* renamed from: a */
    public final float mo9681a(C4746ca caVar) {
        float f;
        if (this.f15134b != 9) {
            return mo9683c(caVar);
        }
        C4766m b = caVar.mo9632b();
        if (b == null) {
            return this.f15133a;
        }
        float f2 = b.f15103c;
        float f3 = b.f15104d;
        if (f2 == f3) {
            f = this.f15133a;
        } else {
            double sqrt = Math.sqrt((double) ((f2 * f2) + (f3 * f3)));
            f = this.f15133a;
            f2 = (float) (sqrt / 1.414213562373095d);
        }
        return (f * f2) / 100.0f;
    }

    /* renamed from: b */
    public final float mo9682b(C4746ca caVar, float f) {
        return this.f15134b == 9 ? (this.f15133a * f) / 100.0f : mo9683c(caVar);
    }

    /* renamed from: c */
    public final float mo9683c(C4746ca caVar) {
        switch (this.f15134b - 1) {
            case 0:
                return this.f15133a;
            case 1:
                return this.f15133a * caVar.mo9631a();
            case 2:
                return this.f15133a * (caVar.f14916d.f14889d.getTextSize() / 2.0f);
            case 3:
                return this.f15133a * 96.0f;
            case 4:
                return (this.f15133a * 96.0f) / 2.54f;
            case 5:
                return (this.f15133a * 96.0f) / 25.4f;
            case 6:
                return (this.f15133a * 96.0f) / 72.0f;
            case 7:
                return (this.f15133a * 96.0f) / 6.0f;
            default:
                C4766m b = caVar.mo9632b();
                return b == null ? this.f15133a : (this.f15133a * b.f15103c) / 100.0f;
        }
    }

    /* renamed from: d */
    public final float mo9684d(C4746ca caVar) {
        if (this.f15134b != 9) {
            return mo9683c(caVar);
        }
        C4766m b = caVar.mo9632b();
        return b == null ? this.f15133a : (this.f15133a * b.f15104d) / 100.0f;
    }

    /* renamed from: e */
    public final boolean mo9685e() {
        return this.f15133a < 0.0f;
    }

    /* renamed from: f */
    public final boolean mo9686f() {
        return this.f15133a == 0.0f;
    }

    /* renamed from: g */
    public final float mo9687g() {
        int i = this.f15134b - 1;
        return i != 0 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? this.f15133a : (this.f15133a * 96.0f) / 6.0f : (this.f15133a * 96.0f) / 72.0f : (this.f15133a * 96.0f) / 25.4f : (this.f15133a * 96.0f) / 2.54f : this.f15133a * 96.0f : this.f15133a;
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.f15133a);
        switch (this.f15134b) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            default:
                str = "percent";
                break;
        }
        return String.valueOf(valueOf).concat(str);
    }
}
