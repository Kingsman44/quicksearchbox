package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80696by;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80734di;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.bq */
/* compiled from: PG */
abstract class C78394bq {

    /* renamed from: p */
    public static final C59071e f215838p = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.bq");

    /* renamed from: q */
    public final C83363m f215839q = new C83363m();

    /* renamed from: r */
    public final C83357g f215840r = new C83361k(Optional.empty(), C78263m.class);

    /* renamed from: s */
    protected final C22871g f215841s;

    /* renamed from: t */
    public final ArrayList f215842t = new ArrayList();

    protected C78394bq(C22871g gVar) {
        this.f215841s = gVar;
    }

    /* renamed from: m */
    protected static C60870cx m125926m(C60870cx cxVar, Supplier supplier, String str) {
        return C60846c.m92878g(cxVar, Exception.class, new C78389bl(str, supplier), C60826bg.f164896a);
    }

    /* renamed from: q */
    protected static final C60870cx m125927q(C60870cx cxVar, Duration duration, C22871g gVar) {
        return C90877ak.m148471e(cxVar, duration.toMillis(), TimeUnit.MILLISECONDS, gVar);
    }

    /* renamed from: a */
    public abstract C83358h mo73322a();

    /* renamed from: b */
    public void mo73323b() {
    }

    /* renamed from: c */
    public void mo73324c() {
    }

    /* renamed from: e */
    public C78391bn mo73326e() {
        return C78391bn.f215837f;
    }

    /* renamed from: f */
    public C83358h mo73327f() {
        return new C83361k(C80696by.f221559a, C78263m.class);
    }

    /* renamed from: g */
    public C83358h mo73328g() {
        return new C83361k(C80734di.f221620a, C78263m.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo73361n(C60870cx cxVar, String str, C90919bp bpVar, C90919bp bpVar2) {
        new C90873ag(cxVar, this.f215841s, str, bpVar).mo85223a(bpVar2);
        this.f215842t.add(cxVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo73362o(String str, Duration duration, C22870f fVar) {
        this.f215842t.add(this.f215841s.mo28208h(str, duration.toMillis(), fVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo73363p(C78394bq bqVar) {
        this.f215840r.mo76660b(Optional.m71637of(bqVar));
    }
}
