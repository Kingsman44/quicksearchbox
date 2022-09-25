package com.google.android.apps.gsa.staticplugins.gearhead.projected;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p677b.C11530a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.android.libraries.search.p2871b.C37251i;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.projected.ah */
/* compiled from: PG */
public final class C101355ah implements C101380i {

    /* renamed from: a */
    public final C86124t f282864a;

    /* renamed from: b */
    public final C68214a f282865b;

    /* renamed from: c */
    private final C11530a f282866c;

    /* renamed from: d */
    private final C32240a f282867d;

    /* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.projected.ah$a */
    /* compiled from: PG */
    public interface C101356a {
        /* renamed from: mo */
        C69464a mo92263mo();
    }

    public C101355ah(C32240a aVar, C86124t tVar, C11530a aVar2, C68214a aVar3) {
        this.f282867d = aVar;
        this.f282864a = tVar;
        this.f282866c = aVar2;
        this.f282865b = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo92253a() {
        return this.f282866c.mo20039e();
    }

    /* renamed from: b */
    public final void mo92254b() {
        C46459k.m82829b(this.f282866c.mo20035a(new C101354ag(this, this.f282867d.f86461a.mo104411a(C101356a.class))), "Error connecting", new Object[0]);
    }

    /* renamed from: c */
    public final void mo92255c() {
        C46459k.m82829b(this.f282866c.mo20036b(), "Error disconnecting", new Object[0]);
    }

    /* renamed from: d */
    public final void mo92256d(C12986d dVar, C37251i iVar) {
        C46459k.m82829b(this.f282866c.mo20037c(dVar, iVar), "Error starting voice plate activity", new Object[0]);
    }

    /* renamed from: e */
    public final void mo92257e() {
        C46459k.m82829b(this.f282866c.mo20038d(), "Error stopping voice plate activity", new Object[0]);
    }
}
