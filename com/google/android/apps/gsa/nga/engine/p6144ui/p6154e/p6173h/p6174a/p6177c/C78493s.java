package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.s */
/* compiled from: PG */
final class C78493s extends C78437df {

    /* renamed from: a */
    private C78391bn f216173a;

    /* renamed from: a */
    public final C78438dg mo73370a() {
        C78391bn bnVar = this.f216173a;
        if (bnVar != null) {
            return new C78494t(bnVar);
        }
        throw new IllegalStateException("Missing required properties: baseStageInput");
    }

    /* renamed from: b */
    public final void mo73371b(C78391bn bnVar) {
        if (bnVar != null) {
            this.f216173a = bnVar;
            return;
        }
        throw new NullPointerException("Null baseStageInput");
    }
}
