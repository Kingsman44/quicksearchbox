package com.google.android.libraries.assistant.soda.p1606e;

import com.google.android.libraries.assistant.soda.p1606e.p1608b.C19301a;
import com.google.android.libraries.assistant.soda.p1606e.p1609c.C19304a;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.assistant.soda.e.n */
/* compiled from: PG */
public final class C19317n implements C19303c {

    /* renamed from: a */
    public static final C59071e f54049a = C59071e.m91332i("com.google.android.libraries.assistant.soda.e.n");

    /* renamed from: b */
    public final C29409fd f54050b;

    /* renamed from: c */
    public final C42813k f54051c;

    /* renamed from: d */
    public final C19301a f54052d;

    /* renamed from: e */
    public final ScheduledExecutorService f54053e;

    /* renamed from: f */
    public final C60887da f54054f;

    /* renamed from: g */
    public final C42876ab f54055g;

    /* renamed from: h */
    public final C58833ax f54056h;

    /* renamed from: i */
    private final C19300b f54057i;

    /* renamed from: j */
    private final C58833ax f54058j;

    public C19317n(C29409fd fdVar, C42813k kVar, C19301a aVar, C19300b bVar, C42876ab abVar, ScheduledExecutorService scheduledExecutorService, C60887da daVar, C58833ax axVar, C58833ax axVar2) {
        this.f54050b = fdVar;
        this.f54051c = kVar;
        this.f54052d = aVar;
        this.f54057i = bVar;
        this.f54053e = scheduledExecutorService;
        this.f54054f = daVar;
        this.f54055g = abVar;
        this.f54058j = axVar;
        this.f54056h = axVar2;
    }

    /* renamed from: a */
    public final C60870cx mo24450a() {
        C60870cx cxVar;
        C59071e eVar = f54049a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(47710)).mo56389s("Received request to retrieve hotword model. ActiveLocale=%s", this.f54052d.mo24446a().mo56109e("null"));
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(47709)).mo56386p("Trying to get latest model bytes.");
        C58833ax a = this.f54052d.mo24446a();
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(47713)).mo56389s("Trying to get preloaded model for matching URL. (locale=%s)", a.mo56109e("null"));
        if (!a.mo56113h() || !this.f54058j.mo56113h() || ((String) this.f54052d.mo24447b().get(a.mo56107c())) == null) {
            cxVar = C60856cj.m92900i(C58836b.f156633a);
        } else {
            C60870cx a2 = ((C19304a) this.f54058j.mo56107c()).mo24452a();
            C19309f fVar = C19309f.f54038a;
            cxVar = C60922j.m93044g(a2, C47810es.m84963c(fVar), this.f54053e);
        }
        C19315l lVar = new C19315l(this);
        return C60922j.m93045h(cxVar, C47810es.m84966f(lVar), this.f54053e);
    }

    /* renamed from: b */
    public final C60870cx mo24451b(String str) {
        ((C59052c) ((C59052c) f54049a.mo56224b()).mo56372aa(47718)).mo56389s("Setting locale=%s", str);
        this.f54052d.mo24448c(str);
        return mo24454c();
    }

    /* renamed from: c */
    public final C60870cx mo24454c() {
        ((C59052c) ((C59052c) f54049a.mo56224b()).mo56372aa(47717)).mo56386p("MDD refresh started.");
        C60870cx b = this.f54057i.mo19336b(this.f54050b);
        b.mo4106b(C19314k.f54045a, C60826bg.f164896a);
        return b;
    }

    /* renamed from: d */
    public final C60870cx mo24455d(C60870cx cxVar) {
        C19305d dVar = C19305d.f54032a;
        return C60922j.m93044g(cxVar, C47810es.m84963c(dVar), this.f54053e);
    }
}
