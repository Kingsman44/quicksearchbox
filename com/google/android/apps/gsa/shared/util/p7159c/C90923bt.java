package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58839bc;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4546c.C59407o;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.shared.util.c.bt */
/* compiled from: PG */
final class C90923bt extends C60873d {

    /* renamed from: a */
    public static final C59071e f254110a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.c.bt");

    /* renamed from: b */
    public final String f254111b;

    /* renamed from: c */
    public final C59407o f254112c;

    /* renamed from: d */
    public final C58839bc f254113d;

    /* renamed from: e */
    public final Object f254114e = new Object();

    /* renamed from: f */
    public int f254115f;

    /* renamed from: g */
    private final C22862b f254116g;

    /* renamed from: h */
    private final C22871g f254117h;

    /* renamed from: i */
    private C60870cx f254118i;

    public C90923bt(String str, C59407o oVar, C22862b bVar, C58839bc bcVar, C22871g gVar) {
        this.f254111b = str;
        this.f254112c = oVar;
        this.f254116g = bVar;
        this.f254117h = gVar;
        this.f254113d = bcVar;
        this.f254115f = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        synchronized (this.f254114e) {
            this.f254118i.cancel(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo85232d() {
        synchronized (this.f254114e) {
            mo85233e(this.f254112c.mo56909a(this.f254115f));
        }
    }

    /* renamed from: e */
    public final void mo85233e(long j) {
        if (!(this.value instanceof C60873d.C60875b)) {
            C22871g gVar = this.f254117h;
            C22862b bVar = this.f254116g;
            Objects.requireNonNull(bVar);
            C60870cx c = gVar.mo28203c("delay", j, new C90920bq(bVar));
            this.f254118i = c;
            new C90873ag(c, this.f254117h, this.f254111b, new C90921br(this)).mo85223a(new C90922bs(this));
        }
    }
}
