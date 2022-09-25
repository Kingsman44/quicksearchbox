package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.p6968aa.C89004ab;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.gsa.c.a.c */
/* compiled from: PG */
final class C22251c extends C89004ab {

    /* renamed from: a */
    final /* synthetic */ C22253e f61470a;

    /* renamed from: b */
    private final C89068x f61471b;

    /* renamed from: c */
    private final AtomicBoolean f61472c = new AtomicBoolean(false);

    /* renamed from: d */
    private final C58817ah f61473d = new C22228b(this);

    public C22251c(C22253e eVar, C89068x xVar) {
        this.f61470a = eVar;
        this.f61471b = xVar;
    }

    /* renamed from: a */
    public final int mo27471a() {
        return -1;
    }

    /* renamed from: b */
    public final C60870cx mo27472b() {
        return C60922j.m93044g(this.f61471b.mo27472b(), this.f61473d, C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo27475d() {
        if (!this.f61472c.getAndSet(true)) {
            this.f61470a.mo27508a();
            this.f61471b.mo27475d();
        }
    }
}
