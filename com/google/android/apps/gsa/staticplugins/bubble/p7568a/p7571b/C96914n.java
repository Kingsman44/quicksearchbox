package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7571b;

import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a.C96887g;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a.C96896p;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a.C96897q;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.b.n */
/* compiled from: PG */
public final class C96914n {

    /* renamed from: a */
    public final C22871g f270898a;

    /* renamed from: b */
    public final C96897q f270899b;

    /* renamed from: c */
    public final C96919s f270900c;

    /* renamed from: d */
    private final Executor f270901d;

    public C96914n(C22871g gVar, C96897q qVar, C96919s sVar, C90851k kVar) {
        this.f270898a = gVar;
        this.f270899b = qVar;
        this.f270900c = sVar;
        this.f270901d = kVar.mo85210c("scheduleBubbles");
    }

    /* renamed from: a */
    public final C60870cx mo90377a(C58528ij ijVar) {
        C96897q qVar = this.f270899b;
        C60870cx g = C60922j.m93044g(C60922j.m93044g(C60922j.m93045h(C60838bs.m92859i(qVar.f270881b.mo28209i(qVar.f270880a.mo46039a(new C96896p(ijVar), qVar.f270883d.mo85210c("UpdateSubscriptionsEntities")), "TransformVoidToScheduledBubbles", new C96887g(ijVar))), new C96909i(this), this.f270901d), new C96910j(this), this.f270901d), new C96911k(this, ijVar), this.f270901d);
        C96897q qVar2 = this.f270899b;
        Objects.requireNonNull(qVar2);
        return C60922j.m93044g(C60922j.m93045h(g, new C96912l(qVar2), this.f270901d), C96913m.f270897a, this.f270901d);
    }
}
