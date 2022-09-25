package com.google.android.libraries.componentview.components.p1682a;

import com.google.android.libraries.componentview.p1699f.p1700a.C20512a;
import com.google.android.libraries.componentview.services.application.C20601ca;

/* renamed from: com.google.android.libraries.componentview.components.a.k */
/* compiled from: PG */
final class C19825k extends C20512a {

    /* renamed from: a */
    final /* synthetic */ C19831q f55414a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19825k(C19831q qVar, C20601ca caVar) {
        super(caVar, "AudioPlayerComponent");
        this.f55414a = qVar;
    }

    /* renamed from: a */
    public final void mo25134a() {
        C19831q qVar = this.f55414a;
        if (!qVar.f55435e) {
            qVar.f55438h = Math.max(qVar.f55438h - 10000, 0);
            this.f55414a.mo25140k();
            return;
        }
        qVar.f55432b.mo25505j();
    }
}
