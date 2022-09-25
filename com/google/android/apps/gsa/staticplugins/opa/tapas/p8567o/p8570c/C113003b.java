package com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8570c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112957a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112958b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112959c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.common.C112966g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.p8542b.p8543a.C112039a;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.android.libraries.assistant.p1594s.p1597b.C19176d;
import com.google.android.libraries.assistant.p1594s.p1597b.C19195w;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import dagger.C68214a;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.o.c.b */
/* compiled from: PG */
public final class C113003b implements C112039a {

    /* renamed from: a */
    public static final C59071e f313174a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.o.c.b");

    /* renamed from: d */
    private static final C112959c f313175d = C112959c.m186947a(C112957a.f313023a, "Tapas/AppShortcutPrewarmTask");

    /* renamed from: b */
    public final C68214a f313176b;

    /* renamed from: c */
    public final Optional f313177c;

    /* renamed from: e */
    private final C60887da f313178e;

    public C113003b(C68214a aVar, C60887da daVar, Optional optional) {
        this.f313176b = aVar;
        this.f313178e = daVar;
        this.f313177c = optional;
    }

    /* renamed from: a */
    public final C60870cx mo99349a(C19167ba baVar) {
        C19195w wVar = baVar.f53690r;
        if (wVar == null) {
            wVar = C19195w.f53744e;
        }
        C19176d dVar = wVar.f53749d;
        if (dVar == null) {
            dVar = C19176d.f53709f;
        }
        if (!dVar.f53714d) {
            return C60856cj.m92898g();
        }
        C112959c cVar = f313175d;
        C60870cx b = this.f313178e.mo19399b(new C113002a(this, baVar));
        C112966g b2 = cVar.mo99787b("appShortcutPrewarmTask");
        Objects.requireNonNull(b2);
        b.mo4106b(new C112958b(b2), C60826bg.f164896a);
        return b;
    }
}
