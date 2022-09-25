package com.google.android.libraries.p579ar.sceneviewer.debug;

/* renamed from: com.google.android.libraries.ar.sceneviewer.debug.b */
/* compiled from: PG */
final class C10695b {

    /* renamed from: a */
    public C10694a f35627a;

    /* renamed from: b */
    public long f35628b;

    /* renamed from: a */
    public final void mo18775a() {
        double nanoTime = (double) (System.nanoTime() - this.f35628b);
        Double.isNaN(nanoTime);
        double d = nanoTime * 1.0E-6d;
        C10694a aVar = this.f35627a;
        if (aVar == null) {
            this.f35627a = new C10694a(d);
        } else {
            aVar.f35626a = (aVar.f35626a * 0.8999999761581421d) + (d * 0.10000002384185791d);
        }
    }
}
