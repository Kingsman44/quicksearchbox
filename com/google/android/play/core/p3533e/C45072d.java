package com.google.android.play.core.p3533e;

import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.play.core.e.d */
/* compiled from: PG */
final class C45072d extends C45069a {

    /* renamed from: a */
    final /* synthetic */ C45069a f117717a;

    /* renamed from: b */
    final /* synthetic */ C45079k f117718b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45072d(C45079k kVar, C146010af afVar, C45069a aVar) {
        super(afVar);
        this.f117718b = kVar;
        this.f117717a = aVar;
    }

    /* renamed from: a */
    public final void mo48871a() {
        C45079k kVar = this.f117718b;
        C45069a aVar = this.f117717a;
        if (kVar.f117737m == null && !kVar.f117731g) {
            kVar.f117726b.mo48886d("Initiate binding to the service.", new Object[0]);
            kVar.f117728d.add(aVar);
            kVar.f117736l = new C45078j(kVar);
            kVar.f117731g = true;
            if (!kVar.f117725a.bindService(kVar.f117732h, kVar.f117736l, 1)) {
                kVar.f117726b.mo48886d("Failed to bind to the service.", new Object[0]);
                kVar.f117731g = false;
                for (C45069a b : kVar.f117728d) {
                    b.mo48901b(new C45080l());
                }
                kVar.f117728d.clear();
            }
        } else if (kVar.f117731g) {
            kVar.f117726b.mo48886d("Waiting to bind to the service.", new Object[0]);
            kVar.f117728d.add(aVar);
        } else {
            aVar.run();
        }
    }
}
