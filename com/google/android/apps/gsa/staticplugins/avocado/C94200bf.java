package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.bf */
/* compiled from: PG */
public final class C94200bf {

    /* renamed from: a */
    List f263198a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public AtomicReference f263199b = new AtomicReference();

    /* renamed from: c */
    private final C22871g f263200c;

    /* renamed from: d */
    private final C86124t f263201d;

    public C94200bf(C22871g gVar, C86124t tVar) {
        this.f263200c = gVar;
        this.f263201d = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo88399a() {
        C60870cx cxVar;
        if (this.f263198a.isEmpty()) {
            cxVar = C60856cj.m92899h(new Exception("No request added to the list!"));
        } else {
            cxVar = C60856cj.m92894c(this.f263198a).mo57336c(C94199be.f263197a, C60826bg.f164896a);
        }
        return C90877ak.m148471e(cxVar, this.f263201d.mo79743a(C90082eg.f249989bz), TimeUnit.MINUTES, this.f263200c);
    }

    /* renamed from: b */
    public final String mo88400b() {
        return (String) this.f263199b.get();
    }

    /* renamed from: c */
    public final void mo88401c(C60870cx cxVar) {
        this.f263198a.add(cxVar);
        this.f263198a.size();
    }
}
