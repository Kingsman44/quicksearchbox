package com.google.android.apps.gsa.nga.engine.warmactions.p6250c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78264n;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.C77885q;
import com.google.android.apps.gsa.nga.engine.recognition.p6101a.C77496a;
import com.google.android.apps.gsa.nga.engine.warmactions.C79566g;
import com.google.android.apps.gsa.nga.engine.warmactions.call.p6251a.C79498a;
import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79553k;
import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79562t;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.search.p2904c.C37353ar;
import com.google.android.libraries.search.p2904c.C37354as;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.c.r */
/* compiled from: PG */
public final class C79493r implements C79491p, C79498a {

    /* renamed from: a */
    private final C77496a f218189a;

    /* renamed from: b */
    private final C91142g f218190b;

    /* renamed from: c */
    private final C79553k f218191c;

    /* renamed from: d */
    private final C78264n f218192d;

    /* renamed from: e */
    private final AtomicBoolean f218193e = new AtomicBoolean(false);

    public C79493r(C77496a aVar, C91142g gVar, C79553k kVar, C78264n nVar) {
        this.f218189a = aVar;
        this.f218190b = gVar;
        this.f218191c = kVar;
        this.f218192d = nVar;
    }

    /* renamed from: a */
    public final void mo74096a() {
        this.f218193e.set(true);
    }

    /* renamed from: b */
    public final C79490o mo74094b() {
        boolean z = false;
        this.f218193e.set(false);
        boolean j = this.f218190b.mo85405j(C90126fx.f251454jC);
        boolean j2 = this.f218190b.mo85405j(C90126fx.f251464jM);
        if (this.f218190b.mo85405j(C90126fx.f251474jW) && this.f218190b.mo85405j(C90126fx.f251041bN)) {
            z = true;
        }
        C77885q x = C77566as.m124464x();
        x.f214553h = 8;
        C37353ar arVar = (C37353ar) C37354as.f99211d.createBuilder();
        arVar.copyOnWrite();
        C37354as asVar = (C37354as) arVar.instance;
        asVar.f99213a |= 2;
        asVar.f99215c = j;
        arVar.copyOnWrite();
        C37354as asVar2 = (C37354as) arVar.instance;
        asVar2.f99213a |= 1;
        asVar2.f99214b = j;
        x.f214550e = Optional.m71637of((C37354as) arVar.build());
        C77566as a = x.mo72859a();
        if (j2) {
            C77885q qVar = new C77885q(a);
            qVar.mo72861c(true);
            a = qVar.mo72859a();
        }
        if (z) {
            a = a.mo72692q();
        }
        InputStream a2 = this.f218189a.mo72590a(a);
        this.f218191c.mo74135a(C79562t.MIC_OPENED);
        return new C79490o(a2, new C79492q(this), a, this.f218191c);
    }

    /* renamed from: c */
    public final void mo74097c() {
        this.f218193e.get();
        if (!this.f218193e.compareAndSet(true, false)) {
            this.f218193e.get();
            this.f218192d.mo73250a(C79566g.m127644c(C79569ab.f218316f));
        }
    }
}
