package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.engine.p6056o.C77424r;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4522b.C58480gp;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.az */
/* compiled from: PG */
final class C78999az implements C22868d {

    /* renamed from: a */
    final /* synthetic */ Predicate f217272a;

    /* renamed from: b */
    final /* synthetic */ C58480gp f217273b;

    /* renamed from: c */
    final /* synthetic */ int f217274c;

    /* renamed from: d */
    final /* synthetic */ C58480gp f217275d;

    /* renamed from: e */
    final /* synthetic */ SettableFuture f217276e;

    /* renamed from: f */
    final /* synthetic */ C58480gp f217277f;

    public C78999az(Predicate predicate, C58480gp gpVar, int i, C58480gp gpVar2, SettableFuture settableFuture, C58480gp gpVar3) {
        this.f217272a = predicate;
        this.f217273b = gpVar;
        this.f217274c = i;
        this.f217275d = gpVar2;
        this.f217276e = settableFuture;
        this.f217277f = gpVar3;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        if ((th instanceof CancellationException) || (th instanceof C77424r)) {
            this.f217276e.mo57356n(C118826c.f331422a);
            return;
        }
        this.f217277f.mo55395g(Integer.valueOf(this.f217274c));
        this.f217276e.mo57356n(C118826c.f331422a);
    }

    /* renamed from: gm */
    public final void mo17702gm(Object obj) {
        if (this.f217272a.test(obj)) {
            this.f217273b.mo55395g(Integer.valueOf(this.f217274c));
        } else {
            this.f217275d.mo55395g(Integer.valueOf(this.f217274c));
        }
        this.f217276e.mo57356n(C118826c.f331422a);
    }
}
