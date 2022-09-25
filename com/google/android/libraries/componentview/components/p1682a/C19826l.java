package com.google.android.libraries.componentview.components.p1682a;

import com.google.android.libraries.componentview.components.p1682a.p1683a.C19761f;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19765j;
import com.google.android.libraries.componentview.p1699f.p1700a.C20512a;
import com.google.android.libraries.componentview.services.application.C20601ca;

/* renamed from: com.google.android.libraries.componentview.components.a.l */
/* compiled from: PG */
final class C19826l extends C20512a {

    /* renamed from: a */
    final /* synthetic */ C19831q f55415a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19826l(C19831q qVar, C20601ca caVar) {
        super(caVar, "AudioPlayerComponent");
        this.f55415a = qVar;
    }

    /* renamed from: a */
    public final void mo25134a() {
        C19831q qVar = this.f55415a;
        if (!qVar.f55435e) {
            C19765j jVar = qVar.f55434d;
            int i = ((C19761f) jVar.f55208b.get(qVar.f55437g)).f55202g;
            C19831q qVar2 = this.f55415a;
            qVar2.f55438h = Math.min(i, qVar2.f55438h + 30000);
            this.f55415a.mo25140k();
            return;
        }
        qVar.f55432b.mo25499c();
    }
}
