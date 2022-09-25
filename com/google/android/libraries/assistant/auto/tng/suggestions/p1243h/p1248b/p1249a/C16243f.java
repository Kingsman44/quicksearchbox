package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1248b.p1249a;

import com.google.android.libraries.assistant.auto.tng.common.p897a.C13213i;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.C16002a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1248b.C16237a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1253e.C16269a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.b.a.f */
/* compiled from: PG */
public final class C16243f implements C16237a {

    /* renamed from: a */
    public static final C59071e f47844a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.h.b.a.f");

    /* renamed from: b */
    public final C16269a f47845b;

    /* renamed from: c */
    public final C16850a f47846c;

    /* renamed from: d */
    public final C15973f f47847d;

    /* renamed from: e */
    private final C13213i f47848e;

    /* renamed from: f */
    private final AccountId f47849f;

    /* renamed from: g */
    private final Executor f47850g;

    /* renamed from: h */
    private final C16002a f47851h;

    public C16243f(C16269a aVar, C13213i iVar, AccountId accountId, C16850a aVar2, Executor executor, C15973f fVar, C16002a aVar3) {
        this.f47845b = aVar;
        this.f47848e = iVar;
        this.f47849f = accountId;
        this.f47846c = aVar2;
        this.f47850g = executor;
        this.f47847d = fVar;
        this.f47851h = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo22860a(C53270hr hrVar, C53306j jVar) {
        C58976aa aaVar = C58975e.f156826a;
        C47633f g = C47633f.m84733g(this.f47846c.mo23063b());
        C16002a aVar = this.f47851h;
        Objects.requireNonNull(aVar);
        C47633f i = g.mo51516i(new C16239b(aVar), this.f47850g).mo51516i(new C16240c(this, jVar, hrVar), this.f47850g);
        C16241d dVar = new C16241d(this);
        C60870cx h = C60922j.m93045h(i, C47810es.m84966f(dVar), this.f47850g);
        C60870cx c = this.f47848e.mo20980c(this.f47849f);
        return C47638k.m84753d(i, c, h).mo51520a(new C16242e(this, h, i, c), this.f47850g);
    }
}
