package com.google.android.apps.gsa.shared.bisto.latencymeasurement;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.bisto.latencymeasurement.h */
/* compiled from: PG */
public abstract class C89665h {

    /* renamed from: a */
    public static final C59071e f242774a = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.latencymeasurement.h");

    /* renamed from: b */
    final C22871g f242775b;

    /* renamed from: c */
    final C89671n f242776c;

    /* renamed from: d */
    final C89670m f242777d;

    /* renamed from: e */
    final C60870cx f242778e;

    /* renamed from: f */
    final int f242779f;

    /* renamed from: g */
    float[] f242780g = new float[0];

    /* renamed from: h */
    private final C89672o f242781h;

    /* renamed from: i */
    private C60870cx f242782i;

    public C89665h(C22871g gVar, C89671n nVar, C89670m mVar, C60870cx cxVar, int i, C89672o oVar) {
        this.f242775b = gVar;
        this.f242776c = nVar;
        this.f242777d = mVar;
        this.f242778e = cxVar;
        this.f242779f = i;
        this.f242781h = oVar;
    }

    /* renamed from: a */
    public abstract C60870cx mo83563a();

    /* renamed from: b */
    public abstract C60870cx mo83564b();

    /* renamed from: c */
    public final synchronized C60870cx mo83565c() {
        C60870cx cxVar = this.f242782i;
        if (cxVar == null || cxVar.isDone()) {
            C22871g gVar = this.f242775b;
            C60870cx j = gVar.mo28210j(this.f242775b.mo28210j(gVar.mo28210j(mo83564b(), "getAudioData", new C89660c(this)), "initAudioData", new C89661d(this)), "playAndDetect", new C89662e(this));
            new C90873ag(j, this.f242775b, "after audio test", new C89663f(this)).mo85223a(new C89664g(this));
            this.f242782i = j;
            return j;
        }
        return this.f242782i;
    }

    /* renamed from: d */
    public abstract Optional mo83566d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo83567e() {
        this.f242777d.mo83571d();
        this.f242776c.mo83574a();
        this.f242781h.mo83573b();
    }
}
