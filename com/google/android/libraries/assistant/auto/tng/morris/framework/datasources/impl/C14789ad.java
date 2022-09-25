package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14781a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.C14730a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ad */
/* compiled from: PG */
public final class C14789ad implements C14749d {

    /* renamed from: a */
    private static final C59071e f44564a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ad");

    /* renamed from: b */
    private final C69464a f44565b;

    /* renamed from: c */
    private C14324f f44566c;

    /* renamed from: d */
    private C14499lm f44567d = C14499lm.f43848e;

    /* renamed from: e */
    private Optional f44568e = Optional.empty();

    public C14789ad(C69464a aVar) {
        this.f44565b = aVar;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: a */
    public final Optional mo21714a(C14219bc bcVar) {
        C14782b bVar;
        C14781a f = mo21737f(bcVar);
        if (f == null) {
            C59104x c = f44564a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.DataSrcAccessor");
            ((C59052c) ((C59052c) c).mo56372aa(45524)).mo56389s("No DataSource found to handle request: %s", bcVar);
            return Optional.empty();
        }
        C60870cx i = f.mo21728i(bcVar);
        if (i.isDone()) {
            try {
                bVar = (C14782b) C60856cj.m92909r(i);
            } catch (RuntimeException | ExecutionException e) {
                C59104x c2 = f44564a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "Morris.DataSrcAccessor");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(45523)).mo56386p("Exception thrown by Future that should have been done.");
                bVar = C14782b.FAILED;
            }
            if (bVar == C14782b.SUCCESS) {
                C14221be h = f.mo21727h(bcVar);
                this.f44568e.ifPresent(new C14937z(bcVar, h));
                return Optional.m71637of(h);
            }
            this.f44568e.ifPresent(new C14786aa());
            return Optional.empty();
        }
        this.f44568e.ifPresent(new C14787ab(bcVar, i));
        return Optional.empty();
    }

    /* renamed from: b */
    public final void mo21715b(C14730a aVar) {
        this.f44568e = Optional.m71637of(aVar);
    }

    /* renamed from: c */
    public final void mo21716c(C14219bc bcVar) {
        C14781a f = mo21737f(bcVar);
        if (f == null) {
            C59104x c = f44564a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.DataSrcAccessor");
            ((C59052c) ((C59052c) c).mo56372aa(45526)).mo56389s("No DataSource found to handle request: %s", bcVar);
            return;
        }
        C14324f fVar = this.f44566c;
        fVar.getClass();
        f.mo21729t(bcVar, fVar, this.f44567d);
        this.f44568e.ifPresent(new C14788ac(bcVar));
    }

    /* renamed from: d */
    public final void mo21717d(C14324f fVar) {
        this.f44566c = fVar;
    }

    /* renamed from: e */
    public final void mo21718e(C14499lm lmVar) {
        this.f44567d = lmVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C14781a mo21737f(C14219bc bcVar) {
        return (C14781a) ((Map) this.f44565b.mo17428b()).get(C14218bb.m30579a(bcVar.f43038a));
    }
}
