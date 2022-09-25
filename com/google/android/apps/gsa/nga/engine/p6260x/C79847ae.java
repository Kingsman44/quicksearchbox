package com.google.android.apps.gsa.nga.engine.p6260x;

import com.google.android.apps.gsa.nga.engine.am.o.a;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79356f;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6407v.C83335x;
import com.google.android.apps.gsa.nga.shared.p6407v.C83336y;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.ae */
/* compiled from: PG */
public final class C79847ae extends C79356f {

    /* renamed from: a */
    public final C83336y f218918a;

    /* renamed from: b */
    public final C81459h f218919b;

    /* renamed from: c */
    public final C79858f f218920c;

    /* renamed from: d */
    public final C83335x f218921d = new C79846ad(this);

    /* renamed from: e */
    private final C22871g f218922e;

    /* renamed from: f */
    private final C76092h f218923f;

    public C79847ae(C22871g gVar, C83336y yVar, a aVar, C79858f fVar, C76092h hVar, C79359i iVar) {
        super(iVar);
        this.f218922e = gVar;
        this.f218918a = yVar;
        this.f218920c = fVar;
        this.f218923f = hVar;
        this.f218919b = aVar.a(gVar, C79844ab.f218915a);
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return this.f218923f.mo72021b().mo72041f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        return this.f218922e.mo28201a("[NGA] Subscribe NgaEventLogger listeners.", new C79843aa(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        return this.f218922e.mo28201a("[NGA] uninitialize", new C79845ac(this));
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "NgaEventLoggerSubscriber";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 29;
    }
}
