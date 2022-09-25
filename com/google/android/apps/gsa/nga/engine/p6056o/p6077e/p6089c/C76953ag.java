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
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.ag */
/* compiled from: PG */
public final class C76953ag implements C76591c {

    /* renamed from: a */
    private final C76974r f212459a;

    public C76953ag(C76974r rVar) {
        this.f212459a = rVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.TAKE_PHOTO));
        h.mo72244c(C58485gu.m89846n("Take_photo"));
        ((C76541a) h).f211766c = 11004;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        Optional optional;
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        if (this.f212459a.mo72379c()) {
            this.f212459a.mo72378b(lVar, nVar.mo71342q());
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        Optional map = bgVar.mo72270l("delay").map(C76951ae.f212456a);
        C76972p f = C76973q.m123630f();
        f.mo72367c(C76974r.m123637e(bgVar));
        if (map != null) {
            C76946a aVar = (C76946a) f;
            aVar.f212445a = map;
            f.mo72366b(C76974r.m123636d(bgVar));
            try {
                optional = bgVar.mo72274q("capture_mode").map(C76960d.f212478a).map(C76963g.f212481a).map(C76962f.f212480a).findFirst();
                if (!optional.isPresent()) {
                    optional = bgVar.mo72274q("flash_mode").map(C76960d.f212478a).map(C76963g.f212481a).map(C76962f.f212480a).findFirst();
                }
            } catch (IllegalArgumentException unused) {
                optional = Optional.empty();
            }
            if (optional != null) {
                aVar.f212446b = optional;
                this.f212459a.mo72377a(f.mo72365a()).ifPresent(new C76952af(lVar, nVar));
                return C60856cj.m92900i((C80401n) lVar.build());
            }
            throw new NullPointerException("Null imageCaptureFlashMode");
        }
        throw new NullPointerException("Null delayInSeconds");
    }
}
