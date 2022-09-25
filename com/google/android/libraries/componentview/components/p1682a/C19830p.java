package com.google.android.libraries.componentview.components.p1682a;

import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20614e;

/* renamed from: com.google.android.libraries.componentview.components.a.p */
/* compiled from: PG */
public final class C19830p {

    /* renamed from: a */
    public final /* synthetic */ C19831q f55419a;

    public C19830p(C19831q qVar) {
        this.f55419a = qVar;
    }

    /* renamed from: a */
    public final long mo25135a() {
        try {
            return Long.parseLong(this.f55419a.f55434d.f55213g);
        } catch (Exception e) {
            C20601ca caVar = this.f55419a.f55433c;
            C20614e eVar = new C20614e();
            eVar.mo25535e(C19742a.AUDIO_ERROR);
            eVar.f57824d = "AudioPlayerComponent";
            eVar.f57821a = e;
            eVar.f57822b = "Invalid session id. Should be long.";
            caVar.mo25487b(eVar.mo25531a());
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo25136b(int i) {
        C19831q qVar = this.f55419a;
        qVar.f55437g = i;
        qVar.mo25138i();
        this.f55419a.mo25140k();
    }

    /* renamed from: c */
    public final void mo25137c() {
        C19831q qVar = this.f55419a;
        if (qVar.f55442l != 4) {
            qVar.f55442l = 1;
        }
        qVar.f55435e = false;
        qVar.mo25140k();
    }
}
