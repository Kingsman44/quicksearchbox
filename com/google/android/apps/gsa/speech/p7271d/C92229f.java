package com.google.android.apps.gsa.speech.p7271d;

import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.util.p7159c.C90886at;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.speech.d.f */
/* compiled from: PG */
public abstract class C92229f {

    /* renamed from: a */
    public final C92228e f257138a;

    /* renamed from: b */
    public SettableFuture f257139b = new SettableFuture();

    /* renamed from: c */
    private final C90931ca f257140c;

    /* renamed from: d */
    private final C90021c f257141d;

    protected C92229f(C92228e eVar, C90931ca caVar, C90021c cVar) {
        this.f257138a = eVar;
        this.f257140c = caVar;
        this.f257141d = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo86900a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo86901b();

    /* renamed from: d */
    public final C60870cx mo86904d() {
        this.f257139b.cancel(true);
        this.f257139b = new SettableFuture();
        C92227d dVar = new C92227d(this, this.f257139b);
        C90886at.m148485b(dVar, this.f257141d.mo79743a(C90082eg.f250087x), this.f257140c);
        mo86900a();
        return dVar;
    }

    /* renamed from: e */
    public void mo86905e(boolean z) {
        mo86901b();
        if (z) {
            this.f257139b.mo57356n(this.f257138a);
        } else {
            this.f257139b.cancel(true);
        }
    }

    public final String toString() {
        return this.f257138a.toString();
    }
}
