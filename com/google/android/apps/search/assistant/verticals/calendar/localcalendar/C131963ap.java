package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.ap */
/* compiled from: PG */
public final class C131963ap implements C131959al {

    /* renamed from: a */
    public static final C59071e f360294a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.calendar.localcalendar.ap");

    /* renamed from: b */
    public final Executor f360295b;

    /* renamed from: c */
    public final C68214a f360296c;

    /* renamed from: d */
    public final C68214a f360297d;

    /* renamed from: e */
    public final C68214a f360298e;

    /* renamed from: f */
    public final C68214a f360299f;

    /* renamed from: g */
    public final C39141kp f360300g;

    /* renamed from: h */
    public final C37215b f360301h;

    /* renamed from: i */
    private final AccountId f360302i;

    /* renamed from: j */
    private final C46128f f360303j;

    public C131963ap(AccountId accountId, C46128f fVar, Executor executor, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C39141kp kpVar, C37215b bVar) {
        this.f360302i = accountId;
        this.f360303j = fVar;
        this.f360295b = executor;
        this.f360296c = aVar;
        this.f360297d = aVar2;
        this.f360298e = aVar3;
        this.f360299f = aVar4;
        this.f360300g = kpVar;
        this.f360301h = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo110358a() {
        C60870cx b = this.f360303j.mo50215b(this.f360302i);
        C131961an anVar = new C131961an(this);
        return C60922j.m93045h(b, C47810es.m84966f(anVar), this.f360295b);
    }
}
