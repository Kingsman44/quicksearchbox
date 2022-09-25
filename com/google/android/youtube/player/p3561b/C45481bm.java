package com.google.android.youtube.player.p3561b;

/* renamed from: com.google.android.youtube.player.b.bm */
final class C45481bm {

    /* renamed from: a */
    final /* synthetic */ C45485e f118885a;

    public C45481bm(C45485e eVar) {
        this.f118885a = eVar;
    }

    /* renamed from: a */
    public final void mo49633a() {
        C45485e eVar = this.f118885a;
        if (!eVar.f118902n || !eVar.f118890b.isAdded()) {
            C45457ap.m81129b("Connected and then detached from host context.", new Object[0]);
            this.f118885a.f118901m.mo49596f();
            return;
        }
        new C45483c(this.f118885a).execute(new Void[0]);
    }
}
