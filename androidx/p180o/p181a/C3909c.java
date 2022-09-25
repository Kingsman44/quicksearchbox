package androidx.p180o.p181a;

import android.view.ViewGroup;

@Deprecated
/* renamed from: androidx.o.a.c */
/* compiled from: PG */
public final class C3909c {

    /* renamed from: a */
    public float f12512a = -1.0f;

    /* renamed from: b */
    public float f12513b = -1.0f;

    /* renamed from: c */
    public float f12514c = -1.0f;

    /* renamed from: d */
    public float f12515d = -1.0f;

    /* renamed from: e */
    public float f12516e = -1.0f;

    /* renamed from: f */
    public float f12517f = -1.0f;

    /* renamed from: g */
    public float f12518g = -1.0f;

    /* renamed from: h */
    public float f12519h = -1.0f;

    /* renamed from: i */
    public float f12520i;

    /* renamed from: j */
    final C3910d f12521j = new C3910d();

    /* renamed from: a */
    public final void mo8147a(ViewGroup.LayoutParams layoutParams, int i, int i2) {
        this.f12521j.width = layoutParams.width;
        this.f12521j.height = layoutParams.height;
        C3910d dVar = this.f12521j;
        boolean z = false;
        boolean z2 = (dVar.f12523b || dVar.width == 0) && this.f12512a < 0.0f;
        C3910d dVar2 = this.f12521j;
        if ((dVar2.f12522a || dVar2.height == 0) && this.f12513b < 0.0f) {
            z = true;
        }
        float f = this.f12512a;
        if (f >= 0.0f) {
            layoutParams.width = Math.round(((float) i) * f);
        }
        float f2 = this.f12513b;
        if (f2 >= 0.0f) {
            layoutParams.height = Math.round(((float) i2) * f2);
        }
        if (this.f12520i >= 0.0f) {
            if (z2) {
                layoutParams.width = Math.round(((float) layoutParams.height) * this.f12520i);
                this.f12521j.f12523b = true;
            }
            if (z) {
                layoutParams.height = Math.round(((float) layoutParams.width) / this.f12520i);
                this.f12521j.f12522a = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo8148b(ViewGroup.LayoutParams layoutParams) {
        C3910d dVar = this.f12521j;
        if (!dVar.f12523b) {
            layoutParams.width = dVar.width;
        }
        C3910d dVar2 = this.f12521j;
        if (!dVar2.f12522a) {
            layoutParams.height = dVar2.height;
        }
        C3910d dVar3 = this.f12521j;
        dVar3.f12523b = false;
        dVar3.f12522a = false;
    }

    public final String toString() {
        return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", new Object[]{Float.valueOf(this.f12512a), Float.valueOf(this.f12513b), Float.valueOf(this.f12514c), Float.valueOf(this.f12515d), Float.valueOf(this.f12516e), Float.valueOf(this.f12517f), Float.valueOf(this.f12518g), Float.valueOf(this.f12519h)});
    }
}
