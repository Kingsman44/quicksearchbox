package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.y */
/* compiled from: PG */
public final class C76981y implements C76591c {

    /* renamed from: a */
    private final C76974r f212502a;

    public C76981y(C76974r rVar) {
        this.f212502a = rVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.OPEN_DEVICE_CAMERA));
        h.mo72277g("Open_device_camera", C90126fx.f251312gT);
        h.mo72244c(C58485gu.m89846n("Open_device_camera"));
        ((C76541a) h).f211766c = 11003;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        if (this.f212502a.mo72379c()) {
            this.f212502a.mo72378b(lVar, nVar.mo71342q());
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        C76972p f = C76973q.m123630f();
        f.mo72368d(true);
        f.mo72367c(C76974r.m123637e(bgVar));
        f.mo72366b(C76974r.m123636d(bgVar));
        this.f212502a.mo72377a(f.mo72365a()).ifPresent(new C76980x(lVar, nVar));
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
