package com.google.android.apps.gsa.staticplugins.save.p8694a.p8695a;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.search.googleapp.saves.p10387a.C137188d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.a.g */
/* compiled from: PG */
public final class C116367g implements C116361a {

    /* renamed from: a */
    private final Context f322692a;

    /* renamed from: b */
    private final C86034c f322693b;

    /* renamed from: c */
    private final Executor f322694c;

    /* renamed from: com.google.android.apps.gsa.staticplugins.save.a.a.g$a */
    /* compiled from: PG */
    public interface C116368a {
        /* renamed from: cu */
        C137188d mo102656cu();
    }

    public C116367g(Context context, C86034c cVar, Executor executor) {
        this.f322692a = context;
        this.f322693b = cVar;
        this.f322694c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo102652a() {
        return C47633f.m84733g(this.f322693b.mo79697b()).mo51516i(new C116362b(this), this.f322694c);
    }

    /* renamed from: b */
    public final C60870cx mo102653b(C57578av avVar) {
        return C47633f.m84733g(this.f322693b.mo79697b()).mo51516i(new C116365e(this, avVar), this.f322694c).mo51515h(C116366f.f322691a, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo102654c() {
        C47633f.m84733g(this.f322693b.mo79697b()).mo51516i(new C116363c(this), this.f322694c).mo51515h(C116364d.f322688a, C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C137188d mo102655d(AccountId accountId) {
        return ((C116368a) C47245e.m84045a(this.f322692a, C116368a.class, accountId)).mo102656cu();
    }
}
