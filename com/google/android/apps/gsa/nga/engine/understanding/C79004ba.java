package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82614ls;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.ba */
/* compiled from: PG */
public final class C79004ba {

    /* renamed from: a */
    public final C79005bb f217291a;

    /* renamed from: b */
    private final C22871g f217292b;

    /* renamed from: c */
    private C60870cx f217293c = C118826c.f331423b;

    public C79004ba(C22871g gVar) {
        this.f217292b = gVar;
        this.f217291a = new C79152j();
    }

    /* renamed from: f */
    private final C60870cx m126943f(C60870cx cxVar, int i, Predicate predicate, C58480gp gpVar, C58480gp gpVar2, C58480gp gpVar3) {
        SettableFuture settableFuture = new SettableFuture();
        C60870cx cxVar2 = cxVar;
        this.f217292b.mo28211k(cxVar, "[NGA] UnderstandingStreamzEvents", new C78999az(predicate, gpVar, i, gpVar2, settableFuture, gpVar3));
        return settableFuture;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo73762a() {
        return this.f217292b.mo28209i(this.f217293c, "[NGA] UnderstandingStreamzEvents.buildFuture", new C78996aw(this));
    }

    /* renamed from: b */
    public final synchronized void mo73763b(C60870cx cxVar, C80515d dVar) {
        C60870cx cxVar2 = this.f217293c;
        int number = dVar.getNumber();
        C78995av avVar = C78995av.f217267a;
        C79005bb bbVar = this.f217291a;
        if (((C79152j) bbVar).f217580i == null) {
            ((C79152j) bbVar).f217580i = C58485gu.m89837e();
        }
        C58480gp gpVar = ((C79152j) bbVar).f217580i;
        C79005bb bbVar2 = this.f217291a;
        if (((C79152j) bbVar2).f217578g == null) {
            ((C79152j) bbVar2).f217578g = C58485gu.m89837e();
        }
        C58480gp gpVar2 = ((C79152j) bbVar2).f217578g;
        C79005bb bbVar3 = this.f217291a;
        if (((C79152j) bbVar3).f217582k == null) {
            ((C79152j) bbVar3).f217582k = C58485gu.m89837e();
        }
        this.f217293c = C118826c.m197212b(C58485gu.m89847o(cxVar2, m126943f(cxVar, number, avVar, gpVar, gpVar2, ((C79152j) bbVar3).f217582k)));
    }

    /* renamed from: c */
    public final synchronized void mo73764c(C60870cx cxVar, C80517f fVar) {
        C60870cx cxVar2 = this.f217293c;
        int number = fVar.getNumber();
        C78995av avVar = C78995av.f217267a;
        C79005bb bbVar = this.f217291a;
        if (((C79152j) bbVar).f217574c == null) {
            ((C79152j) bbVar).f217574c = C58485gu.m89837e();
        }
        C58480gp gpVar = ((C79152j) bbVar).f217574c;
        C79005bb bbVar2 = this.f217291a;
        if (((C79152j) bbVar2).f217572a == null) {
            ((C79152j) bbVar2).f217572a = C58485gu.m89837e();
        }
        C58480gp gpVar2 = ((C79152j) bbVar2).f217572a;
        C79005bb bbVar3 = this.f217291a;
        if (((C79152j) bbVar3).f217576e == null) {
            ((C79152j) bbVar3).f217576e = C58485gu.m89837e();
        }
        this.f217293c = C118826c.m197212b(C58485gu.m89847o(cxVar2, m126943f(cxVar, number, avVar, gpVar, gpVar2, ((C79152j) bbVar3).f217576e)));
    }

    /* renamed from: d */
    public final synchronized void mo73765d(C82614ls lsVar) {
        this.f217293c = this.f217292b.mo28209i(this.f217293c, "[NGA] UnderstandingStreamzEvents.setLockscreenArbitrationEvent", new C78998ay(this, lsVar));
    }

    /* renamed from: e */
    public final synchronized void mo73766e(C60870cx cxVar, int i) {
        C60870cx cxVar2 = this.f217293c;
        int i2 = i - 1;
        C78997ax axVar = C78997ax.f217269a;
        C79005bb bbVar = this.f217291a;
        if (((C79152j) bbVar).f217586o == null) {
            ((C79152j) bbVar).f217586o = C58485gu.m89837e();
        }
        C58480gp gpVar = ((C79152j) bbVar).f217586o;
        C79005bb bbVar2 = this.f217291a;
        if (((C79152j) bbVar2).f217584m == null) {
            ((C79152j) bbVar2).f217584m = C58485gu.m89837e();
        }
        C58480gp gpVar2 = ((C79152j) bbVar2).f217584m;
        C79005bb bbVar3 = this.f217291a;
        if (((C79152j) bbVar3).f217588q == null) {
            ((C79152j) bbVar3).f217588q = C58485gu.m89837e();
        }
        this.f217293c = C118826c.m197212b(C58485gu.m89847o(cxVar2, m126943f(cxVar, i2, axVar, gpVar, gpVar2, ((C79152j) bbVar3).f217588q)));
    }
}
