package com.google.android.apps.gsa.staticplugins.p7761cz;

import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.cz.e */
/* compiled from: PG */
final class C99247e implements C57981b {

    /* renamed from: a */
    public final C57987f f277658a;

    /* renamed from: b */
    private final C57981b f277659b;

    /* renamed from: c */
    private final AtomicBoolean f277660c = new AtomicBoolean(false);

    public C99247e(C57981b bVar) {
        this.f277659b = bVar;
        this.f277658a = new C57987f();
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        if (this.f277660c.compareAndSet(false, true)) {
            this.f277659b.mo20440jJ(new C99246d(this));
        }
        return this.f277658a.f155055e.mo20440jJ(aVar);
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        this.f277658a.f155056f.mo54589f(true);
        this.f277659b.mo20388jK();
    }
}
