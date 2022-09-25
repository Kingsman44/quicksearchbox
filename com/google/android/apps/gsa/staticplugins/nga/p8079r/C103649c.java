package com.google.android.apps.gsa.staticplugins.nga.p8079r;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.apps.gsa.nga.shared.p6361q.C81449a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88056nn;
import com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8072a.C103407f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c */
/* compiled from: PG */
public final class C103649c {

    /* renamed from: a */
    public static final C103647b f288723a = C103460a.f288327a;

    /* renamed from: b */
    public C103647b f288724b = f288723a;

    /* renamed from: c */
    private final C81449a f288725c;

    /* renamed from: d */
    private final ComponentName f288726d;

    /* renamed from: e */
    private SettableFuture f288727e = new SettableFuture();

    /* renamed from: f */
    private C88056nn f288728f = C88056nn.f238098b;

    public C103649c(C81449a aVar, ComponentName componentName) {
        this.f288725c = aVar;
        this.f288726d = componentName;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C60870cx mo93822a(C88056nn nnVar) {
        this.f288727e.cancel(true);
        this.f288728f = nnVar;
        this.f288727e = new SettableFuture();
        this.f288724b.mo93781a(nnVar);
        this.f288725c.mo74742c(new Intent().setComponent(this.f288726d));
        return this.f288727e;
    }

    /* renamed from: b */
    public final synchronized void mo93823b(C103647b bVar) {
        this.f288724b = bVar;
        ((C103407f) bVar).f288255a.mo93782e(this.f288728f);
    }
}
