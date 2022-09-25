package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10083c;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.api.C123587c;
import com.google.android.apps.search.assistant.platform.pcp.api.C123598n;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132606ay;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.c.c */
/* compiled from: PG */
public final class C132618c implements C123598n {

    /* renamed from: a */
    public final C123587c f361922a;

    /* renamed from: b */
    public final C58974d f361923b;

    /* renamed from: c */
    public final Executor f361924c;

    /* renamed from: d */
    public final C132606ay f361925d;

    /* renamed from: e */
    public final Context f361926e;

    /* renamed from: f */
    private final AccountId f361927f;

    /* renamed from: g */
    private final C46175b f361928g;

    public C132618c(C123587c cVar, C130603a aVar, Executor executor, Context context, C46175b bVar, AccountId accountId, C132606ay ayVar) {
        this.f361922a = cVar;
        this.f361923b = aVar.mo109740b(this);
        this.f361924c = executor;
        this.f361926e = context;
        this.f361925d = ayVar;
        this.f361928g = bVar;
        this.f361927f = accountId;
    }

    /* renamed from: a */
    public final C53306j mo22862a() {
        return C53306j.WEATHER_WIDGET;
    }

    /* renamed from: f */
    public final /* synthetic */ Optional mo22863f() {
        return Optional.empty();
    }

    /* renamed from: g */
    public final void mo22864g() {
        ((C58970a) ((C58970a) this.f361923b.mo56224b()).mo56372aa(39767)).mo56386p("#onDataUpdate. ");
        C60870cx g = this.f361928g.mo50250g(this.f361927f);
        C132616a aVar = new C132616a(this);
        C60922j.m93044g(g, C47810es.m84963c(aVar), this.f361924c);
    }
}
