package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.ad */
/* compiled from: PG */
public final class C90785ad implements C90783ab {

    /* renamed from: a */
    private final C60888db f253879a;

    public C90785ad(C60888db dbVar) {
        this.f253879a = dbVar;
    }

    /* renamed from: a */
    public final void mo85115a(C58881cr crVar, Runnable runnable) {
        this.f253879a.execute(runnable);
    }

    /* renamed from: b */
    public final void mo85114b(C58881cr crVar, Runnable runnable, long j) {
        C60856cj.m92911t(this.f253879a.mo29164d(runnable, j, TimeUnit.MILLISECONDS), new C90784ac(), C60826bg.f164896a);
    }
}
