package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.ac */
/* compiled from: PG */
public final class C14102ac {

    /* renamed from: a */
    public static final C59071e f42775a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.c.ac");

    /* renamed from: b */
    public final C37215b f42776b;

    /* renamed from: c */
    public final C60888db f42777c;

    /* renamed from: d */
    public Optional f42778d = Optional.empty();

    /* renamed from: e */
    public boolean f42779e = false;

    /* renamed from: f */
    private final Executor f42780f;

    public C14102ac(C37215b bVar, C60888db dbVar) {
        this.f42776b = bVar;
        this.f42777c = dbVar;
        this.f42780f = new C60904dr(dbVar);
    }

    /* renamed from: a */
    public final void mo21408a(C37252a aVar) {
        C14100aa aaVar = new C14100aa(this, aVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(aaVar), this.f42780f), "Error logging end event.", new Object[0]);
    }

    /* renamed from: b */
    public final void mo21409b(C37252a aVar) {
        C14154x xVar = new C14154x(this, aVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(xVar), this.f42780f), "Error logging start event.", new Object[0]);
    }
}
