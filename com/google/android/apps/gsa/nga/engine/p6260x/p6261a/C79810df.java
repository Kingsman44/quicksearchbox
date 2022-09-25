package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.engine.p6260x.C79850ah;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.engine.p6260x.C79862j;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.common.base.C58889cz;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.df */
/* compiled from: PG */
public final class C79810df implements C79851ai {

    /* renamed from: a */
    private static final C31164au f218813a = C31164au.m58092b("NGA_EVENT_TYPE_ENUM");

    /* renamed from: b */
    private final C83334w f218814b;

    /* renamed from: c */
    private final C58889cz f218815c;

    /* renamed from: d */
    private final C31167ax f218816d;

    /* renamed from: e */
    private final C22871g f218817e;

    /* renamed from: f */
    private final C90479a f218818f;

    public C79810df(C58889cz czVar, C83334w wVar, C31167ax axVar, C22871g gVar, C90479a aVar) {
        this.f218815c = czVar;
        this.f218814b = wVar;
        this.f218816d = axVar;
        this.f218817e = gVar;
        this.f218818f = aVar;
    }

    /* renamed from: a */
    public final C79862j mo74250a() {
        return new C79785ch(this.f218815c, this.f218814b, C83320io.f227132d, this.f218818f);
    }

    /* renamed from: b */
    public final /* synthetic */ C79850ah mo74251b(int i) {
        return mo74252c(i, C83320io.f227132d);
    }

    /* renamed from: c */
    public final C79850ah mo74252c(int i, C83320io ioVar) {
        return new C79812dh(this.f218816d, this.f218815c, this.f218814b, this.f218817e, f218813a, ioVar, i, this.f218818f);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo74253d(int i, C83320io ioVar, C60870cx cxVar) {
        C79850ah c = mo74252c(i, ioVar);
        try {
            c.mo74256c(cxVar);
            if (c != null) {
                c.mo74255b();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
