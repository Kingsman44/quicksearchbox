package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.api.C123604t;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.aj */
/* compiled from: PG */
public final class C123819aj {

    /* renamed from: a */
    public static final C59071e f342047a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.featuredata.aj");

    /* renamed from: b */
    public final C46175b f342048b;

    /* renamed from: c */
    public final Executor f342049c;

    /* renamed from: d */
    public final Context f342050d;

    /* renamed from: e */
    public final Executor f342051e;

    /* renamed from: f */
    public final C123604t f342052f;

    /* renamed from: g */
    public final C21370a f342053g;

    /* renamed from: h */
    public final Optional f342054h;

    /* renamed from: i */
    public final C124100bz f342055i;

    public C123819aj(C46175b bVar, Executor executor, Context context, Executor executor2, C123604t tVar, C21370a aVar, Optional optional, C124100bz bzVar) {
        this.f342048b = bVar;
        this.f342049c = executor;
        this.f342050d = context;
        this.f342051e = executor2;
        this.f342052f = tVar;
        this.f342053g = aVar;
        this.f342054h = optional;
        this.f342055i = bzVar;
    }

    /* renamed from: a */
    public final C60870cx mo106136a() {
        C60870cx d = this.f342048b.mo50247d();
        C123818ai aiVar = new C123818ai(this);
        return C60922j.m93045h(d, C47810es.m84966f(aiVar), this.f342051e);
    }
}
