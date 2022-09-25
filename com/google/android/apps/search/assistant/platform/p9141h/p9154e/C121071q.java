package com.google.android.apps.search.assistant.platform.p9141h.p9154e;

import com.google.android.apps.search.assistant.platform.p9141h.p9154e.p9155a.C121053d;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.dataservice.C46776ct;
import com.google.apps.tiktok.dataservice.C46882v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.search.assistant.platform.h.e.q */
/* compiled from: PG */
public final class C121071q implements C121059e {

    /* renamed from: a */
    public final C68214a f336476a;

    /* renamed from: b */
    private final C60887da f336477b;

    /* renamed from: c */
    private final C42876ab f336478c;

    /* renamed from: d */
    private final C46776ct f336479d;

    public C121071q(C60887da daVar, C42876ab abVar, C46776ct ctVar, C68214a aVar) {
        this.f336477b = daVar;
        this.f336478c = abVar;
        this.f336479d = ctVar;
        this.f336476a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo105035a() {
        return C60922j.m93044g(this.f336478c.mo46042d(), C47810es.m84963c(C121064j.f336469a), this.f336477b);
    }

    /* renamed from: b */
    public final C60870cx mo105036b() {
        return this.f336478c.mo46042d();
    }

    /* renamed from: c */
    public final C60870cx mo105037c() {
        return C60922j.m93044g(this.f336478c.mo46042d(), C47810es.m84963c(C121070p.f336475a), this.f336477b);
    }

    /* renamed from: d */
    public final C60870cx mo105038d(C121053d dVar) {
        C60870cx a = this.f336478c.mo46039a(C47810es.m84963c(new C121062h(dVar)), this.f336477b);
        C46882v vVar = new C46882v();
        vVar.mo50885b(a);
        vVar.f122321b = "assistantonlockscreensettingsdata";
        vVar.f122322c = new C121063i(dVar);
        C60870cx a2 = this.f336479d.mo50786a(vVar.mo50884a());
        a2.mo4106b(new C121067m(this), this.f336477b);
        return a2;
    }

    /* renamed from: e */
    public final C60870cx mo105039e(int i) {
        C60870cx a = this.f336478c.mo46039a(C47810es.m84963c(new C121068n(i)), this.f336477b);
        C46882v vVar = new C46882v();
        vVar.mo50885b(a);
        vVar.f122321b = "assistantonlockscreensettingsdata";
        vVar.f122322c = new C121069o(i);
        C60870cx a2 = this.f336479d.mo50786a(vVar.mo50884a());
        a2.mo4106b(new C121067m(this), this.f336477b);
        return a2;
    }

    /* renamed from: f */
    public final C60870cx mo105040f(boolean z) {
        C60870cx a = this.f336478c.mo46039a(C47810es.m84963c(new C121065k(z)), this.f336477b);
        C46882v vVar = new C46882v();
        vVar.mo50885b(a);
        vVar.f122321b = "assistantonlockscreensettingsdata";
        vVar.f122322c = new C121066l(z);
        C60870cx a2 = this.f336479d.mo50786a(vVar.mo50884a());
        a2.mo4106b(new C121067m(this), this.f336477b);
        return a2;
    }

    /* renamed from: g */
    public final C60870cx mo105041g(int i) {
        C60870cx a = this.f336478c.mo46039a(C47810es.m84963c(new C121060f(i)), this.f336477b);
        C46882v vVar = new C46882v();
        vVar.mo50885b(a);
        vVar.f122321b = "assistantonlockscreensettingsdata";
        vVar.f122322c = new C121061g(i);
        C60870cx a2 = this.f336479d.mo50786a(vVar.mo50884a());
        a2.mo4106b(new C121067m(this), this.f336477b);
        return a2;
    }
}
