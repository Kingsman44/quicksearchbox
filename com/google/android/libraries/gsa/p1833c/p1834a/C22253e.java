package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.gsa.c.a.e */
/* compiled from: PG */
public final class C22253e {

    /* renamed from: a */
    public final C89020ar f61475a;

    /* renamed from: b */
    public final C89068x f61476b;

    /* renamed from: c */
    public final SettableFuture f61477c;

    /* renamed from: d */
    private final C89068x f61478d;

    /* renamed from: e */
    private final C22227az f61479e;

    /* renamed from: f */
    private final AtomicBoolean f61480f = new AtomicBoolean(false);

    /* renamed from: g */
    private volatile RuntimeException f61481g;

    public C22253e(C89020ar arVar, C89068x xVar, C22227az azVar, C58833ax axVar) {
        this.f61475a = arVar;
        xVar.getClass();
        this.f61478d = xVar;
        this.f61479e = azVar;
        axVar.getClass();
        this.f61476b = new C22251c(this, azVar.f61370b);
        SettableFuture settableFuture = new SettableFuture();
        this.f61477c = settableFuture;
        this.f61481g = null;
        C60856cj.m92911t(azVar.f61369a, new C22252d(this), C60826bg.f164896a);
        settableFuture.mo4106b(new C22156a(this), C60826bg.f164896a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo27508a() {
        if (!this.f61480f.getAndSet(true)) {
            this.f61479e.f61371c.mo27503b(C89885b.CRONET_REQUEST_CANCELLED_VALUE, (Throwable) null);
            this.f61476b.mo27475d();
            this.f61478d.mo27475d();
        }
    }
}
