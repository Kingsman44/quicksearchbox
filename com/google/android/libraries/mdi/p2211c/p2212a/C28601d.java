package com.google.android.libraries.mdi.p2211c.p2212a;

/* renamed from: com.google.android.libraries.mdi.c.a.d */
/* compiled from: PG */
public final /* synthetic */ class C28601d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C28607j f77814a;

    /* renamed from: b */
    public final /* synthetic */ boolean f77815b;

    public /* synthetic */ C28601d(C28607j jVar, boolean z) {
        this.f77814a = jVar;
        this.f77815b = z;
    }

    public final void run() {
        C28607j jVar = this.f77814a;
        boolean z = this.f77815b;
        for (C28606i iVar : jVar.f77828e) {
            if (z) {
                iVar.mo34279j();
            } else {
                iVar.mo34278g();
            }
        }
    }
}
