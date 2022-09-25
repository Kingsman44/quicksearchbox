package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8218e;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106546e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106551f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106559h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106562i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e.d */
/* compiled from: PG */
public final class C106550d implements C106559h {

    /* renamed from: a */
    private final Set f297126a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private final C106562i f297127b;

    public C106550d(C106562i iVar) {
        this.f297127b = iVar;
    }

    /* renamed from: a */
    public final C106546e mo95576a() {
        return this.f297127b.mo95569b();
    }

    /* renamed from: b */
    public final C60870cx mo95577b(C106551f fVar) {
        if (fVar == null || !this.f297126a.add(fVar) || this.f297126a.size() != 1) {
            return C118826c.f331423b;
        }
        this.f297127b.mo95569b().mo95556a().name();
        return this.f297127b.mo95570c(new C106547a(this));
    }

    /* renamed from: c */
    public final C60870cx mo95578c(C106551f fVar) {
        if (!this.f297126a.remove(fVar) || !this.f297126a.isEmpty()) {
            return C118826c.f331423b;
        }
        return this.f297127b.mo95571e();
    }

    /* renamed from: e */
    public final C60870cx mo95579e(MessageLite messageLite) {
        return C47638k.m84750a((Iterable) Collection.EL.stream(this.f297126a).map(new C106548b(messageLite)).collect(C58370cn.f155946a)).mo51520a(C106549c.f297125a, C60826bg.f164896a);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85286m(this.f297127b);
    }
}
