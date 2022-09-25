package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.libraries.p8956c.p8957a.C119256b;
import com.google.common.p4543n.p4546c.C59395c;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.cz */
/* compiled from: PG */
final class C120268cz implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C2164c f334641a;

    public C120268cz(C2164c cVar) {
        this.f334641a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Optional a = C119256b.f332583a.mo104261a(th);
        C2164c cVar = this.f334641a;
        if (a.isPresent()) {
            th = (Throwable) a.get();
        } else if (th instanceof C59395c) {
            th = (Throwable) Objects.requireNonNullElse(th.getCause(), th);
        }
        cVar.mo5439d(th);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        this.f334641a.mo5437b((Void) obj);
    }
}
