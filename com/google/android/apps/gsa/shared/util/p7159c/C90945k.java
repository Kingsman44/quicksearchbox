package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.shared.util.c.k */
/* compiled from: PG */
public abstract class C90945k {

    /* renamed from: a */
    private final C90931ca f254139a;

    /* renamed from: b */
    private final int f254140b;

    /* renamed from: c */
    private final int f254141c;

    /* renamed from: d */
    public final String f254142d;

    /* renamed from: e */
    public final C90932cb f254143e;

    /* renamed from: f */
    public final AtomicBoolean f254144f = new AtomicBoolean(false);

    /* renamed from: g */
    private C60870cx f254145g;

    public C90945k(String str, C90929bz bzVar, int i, int i2) {
        this.f254142d = str;
        bzVar.getClass();
        this.f254143e = bzVar;
        this.f254139a = bzVar;
        this.f254140b = i;
        this.f254141c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo77936a(Object... objArr);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo77937b(Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo85240c(Object obj) {
    }

    /* renamed from: d */
    public final void mo85241d(boolean z) {
        this.f254144f.set(true);
        C60870cx cxVar = this.f254145g;
        if (cxVar != null) {
            cxVar.cancel(z);
        }
    }

    /* renamed from: e */
    public final void mo85242e(Object... objArr) {
        this.f254145g = this.f254139a.mo85138c(new C90942h(this, this.f254142d.concat(", background"), this.f254140b, this.f254141c, objArr));
    }
}
