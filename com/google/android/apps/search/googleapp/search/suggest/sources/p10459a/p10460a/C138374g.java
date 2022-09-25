package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10460a;

import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138047d;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138048e;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.ane;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.a.g */
/* compiled from: PG */
public final class C138374g implements C138048e {

    /* renamed from: a */
    private final AtomicBoolean f376448a = new AtomicBoolean();

    /* renamed from: a */
    public final void mo114093a() {
        this.f376448a.set(false);
    }

    /* renamed from: b */
    public final void mo114094b(C138047d dVar) {
        if (this.f376448a.get()) {
            dVar.mo114096a(ane.OFFLINE_SUGGEST_TRIGGERED, this.f376448a.get());
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo114095c(amt amt) {
    }

    /* renamed from: d */
    public final void mo114267d() {
        this.f376448a.set(true);
    }
}
