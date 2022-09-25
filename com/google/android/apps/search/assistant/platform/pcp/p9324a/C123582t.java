package com.google.android.apps.search.assistant.platform.pcp.p9324a;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.a.t */
/* compiled from: PG */
final class C123582t implements C47352j {

    /* renamed from: a */
    public final Context f341468a;

    /* renamed from: b */
    public final Executor f341469b;

    /* renamed from: c */
    public final C58974d f341470c;

    /* renamed from: d */
    public final C124100bz f341471d;

    /* renamed from: e */
    private final C46175b f341472e;

    public C123582t(Context context, Executor executor, C46175b bVar, C130603a aVar, C124100bz bzVar) {
        this.f341468a = context;
        this.f341469b = executor;
        this.f341472e = bVar;
        this.f341470c = aVar.mo109740b(this);
        this.f341471d = bzVar;
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        C60870cx d = this.f341472e.mo50247d();
        C123579q qVar = new C123579q(this);
        return C60922j.m93045h(d, C47810es.m84966f(qVar), this.f341469b);
    }
}
