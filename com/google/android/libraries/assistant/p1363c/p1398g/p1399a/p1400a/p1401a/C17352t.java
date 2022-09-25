package com.google.android.libraries.assistant.p1363c.p1398g.p1399a.p1400a.p1401a;

import androidx.media3.common.C2646bh;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.g.a.a.a.t */
/* compiled from: PG */
public final /* synthetic */ class C17352t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17355w f50197a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f50198b;

    public /* synthetic */ C17352t(C17355w wVar, Throwable th) {
        this.f50197a = wVar;
        this.f50198b = th;
    }

    public final void run() {
        C17355w wVar = this.f50197a;
        Throwable th = this.f50198b;
        if (!wVar.f50204d) {
            C58976aa aaVar = C58975e.f156826a;
            wVar.f50201a.mo23279k();
            C46428ao aoVar = wVar.f50203c;
            C2646bh bhVar = wVar.f50202b;
            Objects.requireNonNull(bhVar);
            aoVar.post(new C17346n(bhVar));
            C46428ao aoVar2 = wVar.f50203c;
            C2646bh bhVar2 = wVar.f50202b;
            Objects.requireNonNull(bhVar2);
            aoVar2.post(new C17347o(bhVar2));
            wVar.f50205e.ifPresent(new C17348p(th));
            wVar.f50205e = Optional.empty();
            wVar.f50204d = true;
        }
    }
}
