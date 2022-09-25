package com.google.apps.tiktok.account.data.manager;

import android.content.Context;
import android.content.Intent;
import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.apps.tiktok.account.data.manager.cl */
/* compiled from: PG */
public final class C46293cl {

    /* renamed from: a */
    public final Context f121272a;

    /* renamed from: b */
    public final C47770dh f121273b;

    /* renamed from: c */
    public final Intent f121274c;

    /* renamed from: d */
    private final Executor f121275d;

    /* renamed from: e */
    private final C58817ah f121276e;

    public C46293cl(Context context, Executor executor, C47770dh dhVar, Intent intent, C58817ah ahVar) {
        this.f121272a = context;
        this.f121275d = executor;
        this.f121273b = dhVar;
        this.f121274c = intent;
        this.f121276e = ahVar;
    }

    /* renamed from: a */
    public final C60870cx mo50315a(Executor executor, C60931s sVar) {
        C46291cj cjVar = new C46291cj();
        C60870cx g = C60922j.m93044g(C2169h.m6027a(new C46287cf(this, cjVar)), C47810es.m84963c(this.f121276e), this.f121275d);
        Objects.requireNonNull(sVar);
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(new C46288cg(sVar)), executor);
        h.mo4106b(C47810es.m84977q(new C46286ce(this, cjVar)), this.f121275d);
        return h;
    }
}
