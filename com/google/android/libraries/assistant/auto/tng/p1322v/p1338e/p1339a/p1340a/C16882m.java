package com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1339a.p1340a;

import com.google.android.libraries.assistant.auto.tng.common.p897a.C13213i;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1323a.C16833a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1339a.C16884b;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1339a.C16885c;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1341b.C16890c;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1341b.C16891d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1195e.p1196a.C15881b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51756ci;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65797ca;
import com.google.protos.p5129p.p5131b.C65798cb;
import com.google.protos.p5129p.p5131b.C65806cj;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.v.e.a.a.m */
/* compiled from: PG */
public final class C16882m implements C16884b {

    /* renamed from: a */
    public static final C65753ak f49374a = C65753ak.PRIVACY_SETTINGS;

    /* renamed from: b */
    public static final String f49375b = C65806cj.PERSONAL_RESULTS.name();

    /* renamed from: c */
    public final C16833a f49376c;

    /* renamed from: d */
    public final C38469m f49377d;

    /* renamed from: e */
    public final C15881b f49378e;

    /* renamed from: f */
    private final C13213i f49379f;

    /* renamed from: g */
    private final AccountId f49380g;

    /* renamed from: h */
    private final C60888db f49381h;

    /* renamed from: i */
    private final C69464a f49382i;

    /* renamed from: j */
    private final C21370a f49383j;

    /* renamed from: k */
    private final Optional f49384k;

    public C16882m(AccountId accountId, C13213i iVar, C16833a aVar, C38469m mVar, C69464a aVar2, C21370a aVar3, C60888db dbVar, C15881b bVar, Optional optional) {
        this.f49380g = accountId;
        this.f49379f = iVar;
        this.f49376c = aVar;
        this.f49383j = aVar3;
        this.f49377d = mVar;
        this.f49382i = aVar2;
        this.f49381h = dbVar;
        this.f49378e = bVar;
        this.f49384k = optional;
    }

    /* renamed from: f */
    private final C60870cx m33878f() {
        C60870cx b = this.f49379f.mo20979b(this.f49380g);
        C16833a aVar = this.f49376c;
        Objects.requireNonNull(aVar);
        C16878i iVar = new C16878i(aVar);
        return C60922j.m93045h(b, C47810es.m84966f(iVar), this.f49381h);
    }

    /* renamed from: a */
    public final C60870cx mo23066a() {
        C60870cx f = m33878f();
        C16876g gVar = C16876g.f49367a;
        return C60922j.m93044g(f, C47810es.m84963c(gVar), this.f49381h);
    }

    /* renamed from: b */
    public final C60870cx mo23067b() {
        C60870cx f = m33878f();
        C16870a aVar = C16870a.f49360a;
        return C60922j.m93044g(f, C47810es.m84963c(aVar), this.f49381h);
    }

    /* renamed from: c */
    public final C60870cx mo23068c() {
        if (this.f49384k.isPresent()) {
            Optional b = ((C16885c) this.f49384k.get()).mo23072b();
            if (b.isPresent()) {
                return (C60870cx) b.get();
            }
        }
        C60870cx f = m33878f();
        C16877h hVar = C16877h.f49368a;
        return C60922j.m93044g(f, C47810es.m84963c(hVar), this.f49381h);
    }

    /* renamed from: d */
    public final C60870cx mo23069d() {
        C51756ci ciVar;
        C60870cx cxVar = C60866ct.f164955a;
        if (!((Optional) this.f49382i.mo17428b()).isPresent() || ((String) ((Optional) this.f49382i.mo17428b()).get()).isEmpty()) {
            if (this.f49384k.isPresent()) {
                Optional a = ((C16885c) this.f49384k.get()).mo23071a();
                if (a.isPresent()) {
                    return (C60870cx) a.get();
                }
            }
            return C60846c.m92878g(C47633f.m84733g(cxVar).mo51516i(new C16873d(this), this.f49381h).mo51515h(C16874e.f49365a, this.f49381h).mo51517j(3000, TimeUnit.MILLISECONDS, this.f49381h), Exception.class, C47810es.m84963c(C16875f.f49366a), this.f49381h);
        }
        C58976aa aaVar = C58975e.f156826a;
        ((Optional) this.f49382i.mo17428b()).get();
        boolean parseBoolean = Boolean.parseBoolean((String) ((Optional) this.f49382i.mo17428b()).get());
        long b = this.f49383j.mo26870b();
        C38469m mVar = this.f49377d;
        C65753ak akVar = f49374a;
        C65797ca caVar = (C65797ca) C65798cb.f178854e.createBuilder();
        C65806cj cjVar = C65806cj.PERSONAL_RESULTS;
        caVar.copyOnWrite();
        C65798cb cbVar = (C65798cb) caVar.instance;
        cbVar.f178859d = cjVar.f178896v;
        cbVar.f178856a |= 1;
        if (parseBoolean) {
            ciVar = C51756ci.ALL_PERSONAL_DATA;
        } else {
            ciVar = C51756ci.NO_PERSONAL_DATA;
        }
        caVar.copyOnWrite();
        C65798cb cbVar2 = (C65798cb) caVar.instance;
        cbVar2.f178858c = Integer.valueOf(ciVar.f135790e);
        cbVar2.f178857b = 2;
        C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
        String str = f49375b;
        ayVar.copyOnWrite();
        C65768az azVar = (C65768az) ayVar.instance;
        str.getClass();
        azVar.f178795a |= 4;
        azVar.f178798d = str;
        C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(b);
        cVar.copyOnWrite();
        C65139d dVar = (C65139d) cVar.instance;
        dVar.f176309a |= 1;
        dVar.f176310b = micros;
        cVar.copyOnWrite();
        C65139d dVar2 = (C65139d) cVar.instance;
        dVar2.f176309a |= 2;
        dVar2.f176311c = 0;
        cVar.copyOnWrite();
        C65139d dVar3 = (C65139d) cVar.instance;
        dVar3.f176309a |= 4;
        dVar3.f176312d = 0;
        ayVar.copyOnWrite();
        C65768az azVar2 = (C65768az) ayVar.instance;
        C65139d dVar4 = (C65139d) cVar.build();
        dVar4.getClass();
        azVar2.f178796b = dVar4;
        azVar2.f178795a |= 1;
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/geller.oneplatform.PrivacySettingsState";
        C63088z byteString = ((C65798cb) caVar.build()).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        ayVar.copyOnWrite();
        C65768az azVar3 = (C65768az) ayVar.instance;
        C63070h hVar = (C63070h) gVar.build();
        hVar.getClass();
        azVar3.f178799e = hVar;
        azVar3.f178795a |= 8;
        C60856cj.m92911t(C60846c.m92879h(C47633f.m84733g(mVar.mo41434e(akVar, (C65768az) ayVar.build())).mo51517j(3000, TimeUnit.MILLISECONDS, this.f49381h), Exception.class, C47810es.m84966f(C16872c.f49363a), this.f49381h), C47810es.m84974n(new C16881l(this, parseBoolean)), this.f49381h);
        return C60856cj.m92900i(Boolean.valueOf(parseBoolean));
    }

    /* renamed from: e */
    public final C60870cx mo23070e() {
        C16890c cVar = (C16890c) C16891d.f49387g.createBuilder();
        cVar.copyOnWrite();
        C16891d dVar = (C16891d) cVar.instance;
        dVar.f49389a |= 8;
        dVar.f49392d = true;
        return C60922j.m93045h(this.f49379f.mo20979b(this.f49380g), C47810es.m84966f(new C16871b(this, (C16891d) cVar.build())), this.f49381h);
    }
}
