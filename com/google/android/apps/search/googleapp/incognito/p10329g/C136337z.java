package com.google.android.apps.search.googleapp.incognito.p10329g;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.incognito.C136228b;
import com.google.android.apps.search.googleapp.incognito.p10320b.C136240j;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.z */
/* compiled from: PG */
public final class C136337z {

    /* renamed from: a */
    public final Context f371206a;

    /* renamed from: b */
    public final AccountId f371207b;

    /* renamed from: c */
    public final Fragment f371208c;

    /* renamed from: d */
    public final C21370a f371209d;

    /* renamed from: e */
    public final Executor f371210e;

    /* renamed from: f */
    public final C136240j f371211f;

    /* renamed from: g */
    public final C136304al f371212g;

    /* renamed from: h */
    public final C136228b f371213h;

    /* renamed from: i */
    public final C136247a f371214i;

    /* renamed from: j */
    public final long f371215j;

    /* renamed from: k */
    public final long f371216k;

    /* renamed from: l */
    public final long f371217l;

    /* renamed from: m */
    public C60870cx f371218m;

    public C136337z(Context context, AccountId accountId, Fragment fragment, C21370a aVar, Executor executor, C136240j jVar, C136304al alVar, C136228b bVar, C136247a aVar2, long j, long j2, long j3) {
        this.f371206a = context;
        this.f371207b = accountId;
        this.f371208c = fragment;
        this.f371209d = aVar;
        this.f371210e = executor;
        this.f371211f = jVar;
        this.f371212g = alVar;
        this.f371213h = bVar;
        this.f371214i = aVar2;
        this.f371215j = j;
        this.f371216k = j2;
        this.f371217l = j3;
    }

    /* renamed from: a */
    public final C136318h mo112925a() {
        return (C136318h) this.f371208c.getChildFragmentManager().f634a.mo671c("incognito_resume_background");
    }
}
