package com.google.android.material.p3515l;

/* renamed from: com.google.android.material.l.n */
/* compiled from: PG */
public final class C44783n extends C44773d {

    /* renamed from: a */
    final float f116766a = -1.0f;

    /* renamed from: a */
    public final void mo48112a(C44795z zVar, float f, float f2) {
        zVar.mo48161f(f2 * f, 180.0f, 90.0f);
        float f3 = (f2 + f2) * f;
        C44791v vVar = new C44791v(0.0f, 0.0f, f3, f3);
        vVar.f116813e = 180.0f;
        vVar.f116814f = 90.0f;
        zVar.f116823f.add(vVar);
        zVar.mo48157b(new C44789t(), 180.0f, 270.0f);
        float f4 = f3 + 0.0f;
        float f5 = 0.5f * f4;
        float f6 = f4 / 2.0f;
        zVar.f116819b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        zVar.f116820c = f5 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
