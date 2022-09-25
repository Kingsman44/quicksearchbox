package com.google.android.libraries.search.p2904c.p2908b.p2909a;

import com.google.android.libraries.search.p2904c.p2908b.C37363a;
import com.google.android.libraries.search.p2904c.p2908b.C37388l;
import com.google.android.libraries.search.p2904c.p2908b.C37390n;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicBoolean;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.b.a.g */
/* compiled from: PG */
public final class C37370g implements C37363a {

    /* renamed from: a */
    public final AtomicBoolean f99256a = new AtomicBoolean(false);

    /* renamed from: b */
    private final C37363a f99257b;

    public C37370g(C37363a aVar) {
        C69664n.m101061g(aVar, "audioAdapter");
        this.f99257b = aVar;
    }

    /* renamed from: c */
    public final C58833ax mo24473c(C37388l lVar) {
        return this.f99257b.mo24473c(lVar);
    }

    /* renamed from: d */
    public final C60870cx mo24474d() {
        this.f99256a.set(true);
        C60870cx d = this.f99257b.mo24474d();
        C69664n.m101060f(d, "audioAdapter.connect()");
        return d;
    }

    /* renamed from: e */
    public final C60870cx mo24475e(boolean z) {
        C60870cx e = this.f99257b.mo24475e(z);
        C69664n.m101060f(e, "audioAdapter.disconnect(timedOut)");
        return e;
    }

    /* renamed from: f */
    public final C60870cx mo24476f(C37390n nVar) {
        return this.f99257b.mo24476f(nVar);
    }
}
