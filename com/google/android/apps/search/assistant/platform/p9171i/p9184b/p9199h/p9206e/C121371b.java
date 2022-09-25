package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9206e;

import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9185a.C121283c;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9185a.C121285e;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9185a.C121286f;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9197f.C121335a;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48711bs;
import com.google.assistant.p3781ad.p3789d.p3791b.C48712bt;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.h.e.b */
/* compiled from: PG */
public final class C121371b implements C121283c, C121286f, C121285e {

    /* renamed from: a */
    private final Executor f337001a;

    public C121371b(Executor executor) {
        this.f337001a = executor;
    }

    /* renamed from: a */
    public final C60870cx mo105080a(C19167ba baVar) {
        return C60856cj.m92900i(Boolean.TRUE);
    }

    /* renamed from: b */
    public final C60870cx mo105108b(String str, int i) {
        double d;
        int i2;
        C58485gu n = C58485gu.m89846n("app name 1");
        C58485gu n2 = C58485gu.m89846n("action name 1");
        C48711bs bsVar = (C48711bs) C48712bt.f126024f.createBuilder();
        C58485gu j = C58485gu.m89842j(C121335a.f336942a.mo56155i(str));
        if (!n.isEmpty()) {
            double a = (double) C121335a.m200594a(j, n);
            Double.isNaN(a);
            d = a + C59203do.f157270a;
            bsVar.copyOnWrite();
            C48712bt btVar = (C48712bt) bsVar.instance;
            btVar.f126026a |= 2;
            btVar.f126028c = a;
            i2 = 1;
        } else {
            bsVar.copyOnWrite();
            C48712bt btVar2 = (C48712bt) bsVar.instance;
            btVar2.f126026a |= 2;
            btVar2.f126028c = C59203do.f157270a;
            i2 = 0;
            d = 0.0d;
        }
        if (!n2.isEmpty()) {
            double a2 = (double) C121335a.m200594a(j, n2);
            Double.isNaN(a2);
            d += a2;
            i2++;
            bsVar.copyOnWrite();
            C48712bt btVar3 = (C48712bt) bsVar.instance;
            btVar3.f126026a |= 4;
            btVar3.f126029d = a2;
        } else {
            bsVar.copyOnWrite();
            C48712bt btVar4 = (C48712bt) bsVar.instance;
            btVar4.f126026a |= 4;
            btVar4.f126029d = C59203do.f157270a;
        }
        if (i2 == 0) {
            bsVar.copyOnWrite();
            C48712bt btVar5 = (C48712bt) bsVar.instance;
            btVar5.f126026a |= 1;
            btVar5.f126027b = C59203do.f157270a;
        } else {
            bsVar.copyOnWrite();
            C48712bt btVar6 = (C48712bt) bsVar.instance;
            btVar6.f126026a |= 1;
            double d2 = (double) i2;
            Double.isNaN(d2);
            btVar6.f126027b = d / d2;
        }
        C48712bt btVar7 = (C48712bt) bsVar.build();
        return C60922j.m93045h(C60856cj.m92900i(C58485gu.m89845m()), C47810es.m84966f(new C121370a(i)), this.f337001a);
    }

    /* renamed from: c */
    public final C60870cx mo105110c() {
        return C60856cj.m92900i(Boolean.TRUE);
    }
}
