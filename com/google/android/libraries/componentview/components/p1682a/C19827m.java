package com.google.android.libraries.componentview.components.p1682a;

import com.google.android.libraries.componentview.components.p1682a.p1683a.C19761f;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19765j;
import com.google.android.libraries.componentview.p1699f.p1700a.C20512a;
import com.google.android.libraries.componentview.services.application.C20601ca;

/* renamed from: com.google.android.libraries.componentview.components.a.m */
/* compiled from: PG */
final class C19827m extends C20512a {

    /* renamed from: a */
    final /* synthetic */ C19831q f55416a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19827m(C19831q qVar, C20601ca caVar) {
        super(caVar, "AudioPlayerComponent");
        this.f55416a = qVar;
    }

    /* renamed from: a */
    public final void mo25134a() {
        C19831q qVar = this.f55416a;
        if (!qVar.f55435e) {
            int i = qVar.f55438h;
            C19765j jVar = qVar.f55434d;
            if (i >= ((C19761f) jVar.f55208b.get(qVar.f55437g)).f55202g) {
                C19831q qVar2 = this.f55416a;
                qVar2.f55438h = 0;
                qVar2.mo25140k();
            }
            C19831q qVar3 = this.f55416a;
            qVar3.f55436f = true;
            qVar3.f55432b.mo25507m(qVar3.f55434d, qVar3.f55443m);
        } else if (qVar.f55442l != 1) {
            qVar.f55432b.mo25502f();
        } else {
            qVar.f55432b.mo25503g();
        }
    }
}
