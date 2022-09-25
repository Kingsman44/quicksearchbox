package com.google.android.play.core.p3533e;

/* renamed from: com.google.android.play.core.e.e */
/* compiled from: PG */
final class C45073e extends C45069a {

    /* renamed from: a */
    final /* synthetic */ C45079k f117719a;

    public C45073e(C45079k kVar) {
        this.f117719a = kVar;
    }

    /* renamed from: a */
    public final void mo48871a() {
        C45079k kVar = this.f117719a;
        if (kVar.f117737m != null) {
            kVar.f117726b.mo48886d("Unbind from service.", new Object[0]);
            C45079k kVar2 = this.f117719a;
            kVar2.f117725a.unbindService(kVar2.f117736l);
            C45079k kVar3 = this.f117719a;
            kVar3.f117731g = false;
            kVar3.f117737m = null;
            kVar3.f117736l = null;
        }
        this.f117719a.mo48910d();
    }
}
